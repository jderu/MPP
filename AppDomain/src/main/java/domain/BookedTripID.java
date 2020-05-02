package domain;

import java.io.Serializable;

public class BookedTripID implements Serializable {
    private int tripID;
    private int seatNumber;

    public BookedTripID(int tripID, int seatNumber) {
        this.tripID = tripID;
        this.seatNumber = seatNumber;
    }

    public int getTripID() {
        return tripID;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
