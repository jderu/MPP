// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app.proto

package server.proto;

public interface BookedTripDTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:server.proto.BookedTripDTO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 clientID = 1;</code>
   * @return The clientID.
   */
  int getClientID();

  /**
   * <code>string clientName = 2;</code>
   * @return The clientName.
   */
  java.lang.String getClientName();
  /**
   * <code>string clientName = 2;</code>
   * @return The bytes for clientName.
   */
  com.google.protobuf.ByteString
      getClientNameBytes();

  /**
   * <code>int32 seatNumber = 3;</code>
   * @return The seatNumber.
   */
  int getSeatNumber();
}
