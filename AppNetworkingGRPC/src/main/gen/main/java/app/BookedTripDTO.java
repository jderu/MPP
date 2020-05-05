// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app.proto

package app;

/**
 * Protobuf type {@code app.BookedTripDTO}
 */
public  final class BookedTripDTO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:app.BookedTripDTO)
    BookedTripDTOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BookedTripDTO.newBuilder() to construct.
  private BookedTripDTO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BookedTripDTO() {
    clientName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BookedTripDTO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BookedTripDTO(
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

            clientID_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            clientName_ = s;
            break;
          }
          case 24: {

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
    return app.App.internal_static_app_BookedTripDTO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.App.internal_static_app_BookedTripDTO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.BookedTripDTO.class, app.BookedTripDTO.Builder.class);
  }

  public static final int CLIENTID_FIELD_NUMBER = 1;
  private int clientID_;
  /**
   * <code>int32 clientID = 1;</code>
   * @return The clientID.
   */
  public int getClientID() {
    return clientID_;
  }

  public static final int CLIENTNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object clientName_;
  /**
   * <code>string clientName = 2;</code>
   * @return The clientName.
   */
  public java.lang.String getClientName() {
    java.lang.Object ref = clientName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientName_ = s;
      return s;
    }
  }
  /**
   * <code>string clientName = 2;</code>
   * @return The bytes for clientName.
   */
  public com.google.protobuf.ByteString
      getClientNameBytes() {
    java.lang.Object ref = clientName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEATNUMBER_FIELD_NUMBER = 3;
  private int seatNumber_;
  /**
   * <code>int32 seatNumber = 3;</code>
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
    if (clientID_ != 0) {
      output.writeInt32(1, clientID_);
    }
    if (!getClientNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clientName_);
    }
    if (seatNumber_ != 0) {
      output.writeInt32(3, seatNumber_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clientID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, clientID_);
    }
    if (!getClientNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clientName_);
    }
    if (seatNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, seatNumber_);
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
    if (!(obj instanceof app.BookedTripDTO)) {
      return super.equals(obj);
    }
    app.BookedTripDTO other = (app.BookedTripDTO) obj;

    if (getClientID()
        != other.getClientID()) return false;
    if (!getClientName()
        .equals(other.getClientName())) return false;
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
    hash = (37 * hash) + CLIENTID_FIELD_NUMBER;
    hash = (53 * hash) + getClientID();
    hash = (37 * hash) + CLIENTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getClientName().hashCode();
    hash = (37 * hash) + SEATNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getSeatNumber();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.BookedTripDTO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.BookedTripDTO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.BookedTripDTO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.BookedTripDTO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.BookedTripDTO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.BookedTripDTO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.BookedTripDTO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.BookedTripDTO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.BookedTripDTO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.BookedTripDTO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.BookedTripDTO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.BookedTripDTO parseFrom(
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
  public static Builder newBuilder(app.BookedTripDTO prototype) {
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
   * Protobuf type {@code app.BookedTripDTO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:app.BookedTripDTO)
      app.BookedTripDTOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.App.internal_static_app_BookedTripDTO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.App.internal_static_app_BookedTripDTO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.BookedTripDTO.class, app.BookedTripDTO.Builder.class);
    }

    // Construct using app.BookedTripDTO.newBuilder()
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
      clientID_ = 0;

      clientName_ = "";

      seatNumber_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.App.internal_static_app_BookedTripDTO_descriptor;
    }

    @java.lang.Override
    public app.BookedTripDTO getDefaultInstanceForType() {
      return app.BookedTripDTO.getDefaultInstance();
    }

    @java.lang.Override
    public app.BookedTripDTO build() {
      app.BookedTripDTO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.BookedTripDTO buildPartial() {
      app.BookedTripDTO result = new app.BookedTripDTO(this);
      result.clientID_ = clientID_;
      result.clientName_ = clientName_;
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
      if (other instanceof app.BookedTripDTO) {
        return mergeFrom((app.BookedTripDTO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.BookedTripDTO other) {
      if (other == app.BookedTripDTO.getDefaultInstance()) return this;
      if (other.getClientID() != 0) {
        setClientID(other.getClientID());
      }
      if (!other.getClientName().isEmpty()) {
        clientName_ = other.clientName_;
        onChanged();
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
      app.BookedTripDTO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.BookedTripDTO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int clientID_ ;
    /**
     * <code>int32 clientID = 1;</code>
     * @return The clientID.
     */
    public int getClientID() {
      return clientID_;
    }
    /**
     * <code>int32 clientID = 1;</code>
     * @param value The clientID to set.
     * @return This builder for chaining.
     */
    public Builder setClientID(int value) {
      
      clientID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 clientID = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientID() {
      
      clientID_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object clientName_ = "";
    /**
     * <code>string clientName = 2;</code>
     * @return The clientName.
     */
    public java.lang.String getClientName() {
      java.lang.Object ref = clientName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string clientName = 2;</code>
     * @return The bytes for clientName.
     */
    public com.google.protobuf.ByteString
        getClientNameBytes() {
      java.lang.Object ref = clientName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string clientName = 2;</code>
     * @param value The clientName to set.
     * @return This builder for chaining.
     */
    public Builder setClientName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clientName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string clientName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientName() {
      
      clientName_ = getDefaultInstance().getClientName();
      onChanged();
      return this;
    }
    /**
     * <code>string clientName = 2;</code>
     * @param value The bytes for clientName to set.
     * @return This builder for chaining.
     */
    public Builder setClientNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clientName_ = value;
      onChanged();
      return this;
    }

    private int seatNumber_ ;
    /**
     * <code>int32 seatNumber = 3;</code>
     * @return The seatNumber.
     */
    public int getSeatNumber() {
      return seatNumber_;
    }
    /**
     * <code>int32 seatNumber = 3;</code>
     * @param value The seatNumber to set.
     * @return This builder for chaining.
     */
    public Builder setSeatNumber(int value) {
      
      seatNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 seatNumber = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:app.BookedTripDTO)
  }

  // @@protoc_insertion_point(class_scope:app.BookedTripDTO)
  private static final app.BookedTripDTO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.BookedTripDTO();
  }

  public static app.BookedTripDTO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BookedTripDTO>
      PARSER = new com.google.protobuf.AbstractParser<BookedTripDTO>() {
    @java.lang.Override
    public BookedTripDTO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BookedTripDTO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BookedTripDTO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BookedTripDTO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.BookedTripDTO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

