package com.jderu;

import com.jderu.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jderu.services.AppServiceException;
import com.jderu.services.IAppObserver;
import com.jderu.services.IAppServices;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Service
public class AppServicesImpl implements IAppServices {

    private final BookedTripRepository bookedTripRepo;
    private final ClientRepository clientRepo;
    private final DestinationRepository destinationRepo;
    private final TripRepository tripRepo;
    private final UserRepository userRepo;

    private final Map<Integer, IAppObserver> loggedUsers;


    @Autowired
    public AppServicesImpl(UserRepository userRepo, BookedTripRepository bookedTripRepo, ClientRepository clientRepo, DestinationRepository destinationRepo, TripRepository tripRepo) {
        this.userRepo = userRepo;
        this.bookedTripRepo = bookedTripRepo;
        this.clientRepo = clientRepo;
        this.destinationRepo = destinationRepo;
        this.tripRepo = tripRepo;
        this.loggedUsers = new ConcurrentHashMap<>();
    }


    @Override
    public synchronized User login(String username, String password, IAppObserver client) throws AppServiceException {
        User user = userRepo.findByUsername(username);
        if (user == null)
            return null;
        if (loggedUsers.containsKey(user.getId()))
            throw new AppServiceException("User already logged in");
        if (User.hash(password).equals(user.getPasswordHash())) {
            loggedUsers.put(user.getId(), client);
            return user;
        }
        return null;
    }

    @Override
    public synchronized void logout(Integer userID) throws AppServiceException {
        if (loggedUsers.containsKey(userID))
            loggedUsers.remove(userID);
        else
            throw new AppServiceException("User isn't logged in");
    }

    @Override
    public synchronized List<BookedTripDTO> search(String destinationName, Timestamp departure) throws AppServiceException {
        return bookedTripRepo.search(destinationName, departure);
    }

    @Override
    public synchronized void reserve(int tripID, String clientName, int seatNumber) throws AppServiceException {
        Trip trip = tripRepo.findOne(tripID);
        if (trip == null)
            throw new AppServiceException("No trip with the given id");

        BookedTrip bookedTrip = bookedTripRepo.findOne(new BookedTripID(tripID, seatNumber));
        if (bookedTrip != null)
            throw new AppServiceException("Seat is already booked for the specified trip");

        Client client = clientRepo.findByName(clientName);
        if (client == null) {
            clientRepo.save(new Client(null, clientName));
            client = clientRepo.findByName(clientName);
        }

        Destination destination = destinationRepo.findOne(trip.getDestinationID());

        bookedTripRepo.save(new BookedTrip(new BookedTripID(tripID, seatNumber), client.getId()));
        trip.setFreeSeats(trip.getFreeSeats() - 1);
        tripRepo.update(trip);
        notifyUsers(destination.getName(), trip.getDeparture(), seatNumber, clientName);
    }

    private void notifyUsers(String destinationName, Timestamp departure, Integer seatNumber, String clientName) {
        int defaultThreadsNo = 5;
        ExecutorService executor = Executors.newFixedThreadPool(defaultThreadsNo);
        for (IAppObserver appObserver : loggedUsers.values())
            if (appObserver != null)
                executor.execute(() -> {
                    try {
                        appObserver.updateWindows(destinationName, departure, seatNumber, clientName);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                });

        executor.shutdown();
    }

    @Override
    public synchronized List<TripDTO> showTrips() throws AppServiceException {
        return tripRepo.getAllTrips();
    }

    @Override
    public synchronized Integer getTripIDByDestinationAndDeparture(String destination, Timestamp departure) throws AppServiceException {
        return tripRepo.getTripIDByDestinationAndDeparture(destination, departure);
    }
}