// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app.proto

package app;

/**
 * Protobuf type {@code app.SearchRequest}
 */
public  final class SearchRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:app.SearchRequest)
    SearchRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchRequest.newBuilder() to construct.
  private SearchRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchRequest() {
    destinationName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SearchRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            destinationName_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (departure_ != null) {
              subBuilder = departure_.toBuilder();
            }
            departure_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(departure_);
              departure_ = subBuilder.buildPartial();
            }

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
    return app.App.internal_static_app_SearchRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.App.internal_static_app_SearchRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.SearchRequest.class, app.SearchRequest.Builder.class);
  }

  public static final int DESTINATIONNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object destinationName_;
  /**
   * <code>string destinationName = 1;</code>
   * @return The destinationName.
   */
  public java.lang.String getDestinationName() {
    java.lang.Object ref = destinationName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destinationName_ = s;
      return s;
    }
  }
  /**
   * <code>string destinationName = 1;</code>
   * @return The bytes for destinationName.
   */
  public com.google.protobuf.ByteString
      getDestinationNameBytes() {
    java.lang.Object ref = destinationName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      destinationName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPARTURE_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp departure_;
  /**
   * <code>.google.protobuf.Timestamp departure = 2;</code>
   * @return Whether the departure field is set.
   */
  public boolean hasDeparture() {
    return departure_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp departure = 2;</code>
   * @return The departure.
   */
  public com.google.protobuf.Timestamp getDeparture() {
    return departure_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : departure_;
  }
  /**
   * <code>.google.protobuf.Timestamp departure = 2;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getDepartureOrBuilder() {
    return getDeparture();
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
    if (!getDestinationNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, destinationName_);
    }
    if (departure_ != null) {
      output.writeMessage(2, getDeparture());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDestinationNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, destinationName_);
    }
    if (departure_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDeparture());
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
    if (!(obj instanceof app.SearchRequest)) {
      return super.equals(obj);
    }
    app.SearchRequest other = (app.SearchRequest) obj;

    if (!getDestinationName()
        .equals(other.getDestinationName())) return false;
    if (hasDeparture() != other.hasDeparture()) return false;
    if (hasDeparture()) {
      if (!getDeparture()
          .equals(other.getDeparture())) return false;
    }
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
    hash = (37 * hash) + DESTINATIONNAME_FIELD_NUMBER;
    hash = (53 * hash) + getDestinationName().hashCode();
    if (hasDeparture()) {
      hash = (37 * hash) + DEPARTURE_FIELD_NUMBER;
      hash = (53 * hash) + getDeparture().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.SearchRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.SearchRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.SearchRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.SearchRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.SearchRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.SearchRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.SearchRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.SearchRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.SearchRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.SearchRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.SearchRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.SearchRequest parseFrom(
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
  public static Builder newBuilder(app.SearchRequest prototype) {
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
   * Protobuf type {@code app.SearchRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:app.SearchRequest)
      app.SearchRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.App.internal_static_app_SearchRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.App.internal_static_app_SearchRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.SearchRequest.class, app.SearchRequest.Builder.class);
    }

    // Construct using app.SearchRequest.newBuilder()
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
      destinationName_ = "";

      if (departureBuilder_ == null) {
        departure_ = null;
      } else {
        departure_ = null;
        departureBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.App.internal_static_app_SearchRequest_descriptor;
    }

    @java.lang.Override
    public app.SearchRequest getDefaultInstanceForType() {
      return app.SearchRequest.getDefaultInstance();
    }

    @java.lang.Override
    public app.SearchRequest build() {
      app.SearchRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.SearchRequest buildPartial() {
      app.SearchRequest result = new app.SearchRequest(this);
      result.destinationName_ = destinationName_;
      if (departureBuilder_ == null) {
        result.departure_ = departure_;
      } else {
        result.departure_ = departureBuilder_.build();
      }
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
      if (other instanceof app.SearchRequest) {
        return mergeFrom((app.SearchRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.SearchRequest other) {
      if (other == app.SearchRequest.getDefaultInstance()) return this;
      if (!other.getDestinationName().isEmpty()) {
        destinationName_ = other.destinationName_;
        onChanged();
      }
      if (other.hasDeparture()) {
        mergeDeparture(other.getDeparture());
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
      app.SearchRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.SearchRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object destinationName_ = "";
    /**
     * <code>string destinationName = 1;</code>
     * @return The destinationName.
     */
    public java.lang.String getDestinationName() {
      java.lang.Object ref = destinationName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destinationName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string destinationName = 1;</code>
     * @return The bytes for destinationName.
     */
    public com.google.protobuf.ByteString
        getDestinationNameBytes() {
      java.lang.Object ref = destinationName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        destinationName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string destinationName = 1;</code>
     * @param value The destinationName to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      destinationName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string destinationName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDestinationName() {
      
      destinationName_ = getDefaultInstance().getDestinationName();
      onChanged();
      return this;
    }
    /**
     * <code>string destinationName = 1;</code>
     * @param value The bytes for destinationName to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      destinationName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp departure_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> departureBuilder_;
    /**
     * <code>.google.protobuf.Timestamp departure = 2;</code>
     * @return Whether the departure field is set.
     */
    public boolean hasDeparture() {
      return departureBuilder_ != null || departure_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp departure = 2;</code>
     * @return The departure.
     */
    public com.google.protobuf.Timestamp getDeparture() {
      if (departureBuilder_ == null) {
        return departure_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : departure_;
      } else {
        return departureBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp departure = 2;</code>
     */
    public Builder setDeparture(com.google.protobuf.Timestamp value) {
      if (departureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        departure_ = value;
        onChanged();
      } else {
        departureBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp departure = 2;</code>
     */
    public Builder setDeparture(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (departureBuilder_ == null) {
        departure_ = builderForValue.build();
        onChanged();
      } else {
        departureBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp departure = 2;</code>
     */
    public Builder mergeDeparture(com.google.protobuf.Timestamp value) {
      if (departureBuilder_ == null) {
        if (departure_ != null) {
          departure_ =
            com.google.protobuf.Timestamp.newBuilder(departure_).mergeFrom(value).buildPartial();
        } else {
          departure_ = value;
        }
        onChanged();
      } else {
        departureBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp departure = 2;</code>
     */
    public Builder clearDeparture() {
      if (departureBuilder_ == null) {
        departure_ = null;
        onChanged();
      } else {
        departure_ = null;
        departureBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp departure = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getDepartureBuilder() {
      
      onChanged();
      return getDepartureFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp departure = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getDepartureOrBuilder() {
      if (departureBuilder_ != null) {
        return departureBuilder_.getMessageOrBuilder();
      } else {
        return departure_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : departure_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp departure = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getDepartureFieldBuilder() {
      if (departureBuilder_ == null) {
        departureBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getDeparture(),
                getParentForChildren(),
                isClean());
        departure_ = null;
      }
      return departureBuilder_;
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


    // @@protoc_insertion_point(builder_scope:app.SearchRequest)
  }

  // @@protoc_insertion_point(class_scope:app.SearchRequest)
  private static final app.SearchRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.SearchRequest();
  }

  public static app.SearchRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchRequest>
      PARSER = new com.google.protobuf.AbstractParser<SearchRequest>() {
    @java.lang.Override
    public SearchRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SearchRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.SearchRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

