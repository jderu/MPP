// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app.proto

package server.proto;

public interface loginResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:server.proto.loginResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string username = 2;</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 2;</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>string passwordHash = 3;</code>
   * @return The passwordHash.
   */
  java.lang.String getPasswordHash();
  /**
   * <code>string passwordHash = 3;</code>
   * @return The bytes for passwordHash.
   */
  com.google.protobuf.ByteString
      getPasswordHashBytes();
}
