// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app.proto

package server.proto;

public interface searchResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:server.proto.searchResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .server.proto.BookedTripDTO list = 1;</code>
   */
  java.util.List<server.proto.BookedTripDTO> 
      getListList();
  /**
   * <code>repeated .server.proto.BookedTripDTO list = 1;</code>
   */
  server.proto.BookedTripDTO getList(int index);
  /**
   * <code>repeated .server.proto.BookedTripDTO list = 1;</code>
   */
  int getListCount();
  /**
   * <code>repeated .server.proto.BookedTripDTO list = 1;</code>
   */
  java.util.List<? extends server.proto.BookedTripDTOOrBuilder> 
      getListOrBuilderList();
  /**
   * <code>repeated .server.proto.BookedTripDTO list = 1;</code>
   */
  server.proto.BookedTripDTOOrBuilder getListOrBuilder(
      int index);
}
