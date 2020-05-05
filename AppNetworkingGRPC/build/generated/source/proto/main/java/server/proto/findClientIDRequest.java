// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app.proto

package server.proto;

/**
 * Protobuf type {@code server.proto.findClientIDRequest}
 */
public  final class findClientIDRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:server.proto.findClientIDRequest)
    findClientIDRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use findClientIDRequest.newBuilder() to construct.
  private findClientIDRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private findClientIDRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new findClientIDRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private findClientIDRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            tripID_ = input.readInt32();
            break;
          }
          case 16: {

            seatNumber_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return server.proto.App.internal_static_server_proto_findClientIDRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return server.proto.App.internal_static_server_proto_findClientIDRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            server.proto.findClientIDRequest.class, server.proto.findClientIDRequest.Builder.class);
  }

  public static final int TRIPID_FIELD_NUMBER = 1;
  private int tripID_;
  /**
   * <code>int32 tripID = 1;</code>
   * @return The tripID.
   */
  public int getTripID() {
    return tripID_;
  }

  public static final int SEATNUMBER_FIELD_NUMBER = 2;
  private int seatNumber_;
  /**
   * <code>int32 seatNumber = 2;</code>
   * @return The seatNumber.
   */
  public int getSeatNumber() {
    return seatNumber_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (tripID_ != 0) {
      output.writeInt32(1, tripID_);
    }
    if (seatNumber_ != 0) {
      output.writeInt32(2, seatNumber_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tripID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, tripID_);
    }
    if (seatNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, seatNumber_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof server.proto.findClientIDRequest)) {
      return super.equals(obj);
    }
    server.proto.findClientIDRequest other = (server.proto.findClientIDRequest) obj;

    if (getTripID()
        != other.getTripID()) return false;
    if (getSeatNumber()
        != other.getSeatNumber()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TRIPID_FIELD_NUMBER;
    hash = (53 * hash) + getTripID();
    hash = (37 * hash) + SEATNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getSeatNumber();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static server.proto.findClientIDRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static server.proto.findClientIDRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static server.proto.findClientIDRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static server.proto.findClientIDRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static server.proto.findClientIDRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static server.proto.findClientIDRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static server.proto.findClientIDRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static server.proto.findClientIDRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static server.proto.findClientIDRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static server.proto.findClientIDRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static server.proto.findClientIDRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static server.proto.findClientIDRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(server.proto.findClientIDRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code server.proto.findClientIDRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:server.proto.findClientIDRequest)
      server.proto.findClientIDRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return server.proto.App.internal_static_server_proto_findClientIDRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return server.proto.App.internal_static_server_proto_findClientIDRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              server.proto.findClientIDRequest.class, server.proto.findClientIDRequest.Builder.class);
    }

    // Construct using server.proto.findClientIDRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      tripID_ = 0;

      seatNumber_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return server.proto.App.internal_static_server_proto_findClientIDRequest_descriptor;
    }

    @java.lang.Override
    public server.proto.findClientIDRequest getDefaultInstanceForType() {
      return server.proto.findClientIDRequest.getDefaultInstance();
    }

    @java.lang.Override
    public server.proto.findClientIDRequest build() {
      server.proto.findClientIDRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public server.proto.findClientIDRequest buildPartial() {
      server.proto.findClientIDRequest result = new server.proto.findClientIDRequest(this);
      result.tripID_ = tripID_;
      result.seatNumber_ = seatNumber_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof server.proto.findClientIDRequest) {
        return mergeFrom((server.proto.findClientIDRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(server.proto.findClientIDRequest other) {
      if (other == server.proto.findClientIDRequest.getDefaultInstance()) return this;
      if (other.getTripID() != 0) {
        setTripID(other.getTripID());
      }
      if (other.getSeatNumber() != 0) {
        setSeatNumber(other.getSeatNumber());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      server.proto.findClientIDRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (server.proto.findClientIDRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int tripID_ ;
    /**
     * <code>int32 tripID = 1;</code>
     * @return The tripID.
     */
    public int getTripID() {
      return tripID_;
    }
    /**
     * <code>int32 tripID = 1;</code>
     * @param value The tripID to set.
     * @return This builder for chaining.
     */
    public Builder setTripID(int value) {
      
      tripID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 tripID = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTripID() {
      
      tripID_ = 0;
      onChanged();
      return this;
    }

    private int seatNumber_ ;
    /**
     * <code>int32 seatNumber = 2;</code>
     * @return The seatNumber.
     */
    public int getSeatNumber() {
      return seatNumber_;
    }
    /**
     * <code>int32 seatNumber = 2;</code>
     * @param value The seatNumber to set.
     * @return This builder for chaining.
     */
    public Builder setSeatNumber(int value) {
      
      seatNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 seatNumber = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeatNumber() {
      
      seatNumber_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:server.proto.findClientIDRequest)
  }

  // @@protoc_insertion_point(class_scope:server.proto.findClientIDRequest)
  private static final server.proto.findClientIDRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new server.proto.findClientIDRequest();
  }

  public static server.proto.findClientIDRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<findClientIDRequest>
      PARSER = new com.google.protobuf.AbstractParser<findClientIDRequest>() {
    @java.lang.Override
    public findClientIDRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new findClientIDRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<findClientIDRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<findClientIDRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public server.proto.findClientIDRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

