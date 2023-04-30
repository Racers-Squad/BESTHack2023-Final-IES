// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DataFieldValue.proto

package com.racerssquad.besthack2023.DTO.proto;

/**
 * Protobuf type {@code com.racerssquad.besthack2023.DTO.proto.DataFieldValue}
 */
public final class DataFieldValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.racerssquad.besthack2023.DTO.proto.DataFieldValue)
    DataFieldValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DataFieldValue.newBuilder() to construct.
  private DataFieldValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DataFieldValue() {
    alias_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new DataFieldValue();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DataFieldValue(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
            String s = input.readStringRequireUtf8();

            alias_ = s;
            break;
          }
          case 18: {
            com.racerssquad.besthack2023.DTO.proto.ValueRef.Builder subBuilder = null;
            if (value_ != null) {
              subBuilder = value_.toBuilder();
            }
            value_ = input.readMessage(com.racerssquad.besthack2023.DTO.proto.ValueRef.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(value_);
              value_ = subBuilder.buildPartial();
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
    return com.racerssquad.besthack2023.DTO.proto.DataFieldValueProto.internal_static_com_racerssquad_besthack2023_DTO_proto_DataFieldValue_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.racerssquad.besthack2023.DTO.proto.DataFieldValueProto.internal_static_com_racerssquad_besthack2023_DTO_proto_DataFieldValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.racerssquad.besthack2023.DTO.proto.DataFieldValue.class, com.racerssquad.besthack2023.DTO.proto.DataFieldValue.Builder.class);
  }

  public static final int ALIAS_FIELD_NUMBER = 1;
  private volatile Object alias_;
  /**
   * <pre>
   * Идентификатор поля для которого устанавливается значение
   * </pre>
   *
   * <code>string alias = 1;</code>
   * @return The alias.
   */
  @Override
  public String getAlias() {
    Object ref = alias_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      alias_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Идентификатор поля для которого устанавливается значение
   * </pre>
   *
   * <code>string alias = 1;</code>
   * @return The bytes for alias.
   */
  @Override
  public com.google.protobuf.ByteString
      getAliasBytes() {
    Object ref = alias_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      alias_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.racerssquad.besthack2023.DTO.proto.ValueRef value_;
  /**
   * <pre>
   * Описание значения поля
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 2;</code>
   * @return Whether the value field is set.
   */
  @Override
  public boolean hasValue() {
    return value_ != null;
  }
  /**
   * <pre>
   * Описание значения поля
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 2;</code>
   * @return The value.
   */
  @Override
  public com.racerssquad.besthack2023.DTO.proto.ValueRef getValue() {
    return value_ == null ? com.racerssquad.besthack2023.DTO.proto.ValueRef.getDefaultInstance() : value_;
  }
  /**
   * <pre>
   * Описание значения поля
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 2;</code>
   */
  @Override
  public com.racerssquad.besthack2023.DTO.proto.ValueRefOrBuilder getValueOrBuilder() {
    return getValue();
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getAliasBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, alias_);
    }
    if (value_ != null) {
      output.writeMessage(2, getValue());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAliasBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, alias_);
    }
    if (value_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValue());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.racerssquad.besthack2023.DTO.proto.DataFieldValue)) {
      return super.equals(obj);
    }
    com.racerssquad.besthack2023.DTO.proto.DataFieldValue other = (com.racerssquad.besthack2023.DTO.proto.DataFieldValue) obj;

    if (!getAlias()
        .equals(other.getAlias())) return false;
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ALIAS_FIELD_NUMBER;
    hash = (53 * hash) + getAlias().hashCode();
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.racerssquad.besthack2023.DTO.proto.DataFieldValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.racerssquad.besthack2023.DTO.proto.DataFieldValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.DataFieldValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.racerssquad.besthack2023.DTO.proto.DataFieldValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.DataFieldValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.racerssquad.besthack2023.DTO.proto.DataFieldValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.DataFieldValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.racerssquad.besthack2023.DTO.proto.DataFieldValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.DataFieldValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.racerssquad.besthack2023.DTO.proto.DataFieldValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.DataFieldValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.racerssquad.besthack2023.DTO.proto.DataFieldValue parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.racerssquad.besthack2023.DTO.proto.DataFieldValue prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.racerssquad.besthack2023.DTO.proto.DataFieldValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.racerssquad.besthack2023.DTO.proto.DataFieldValue)
      com.racerssquad.besthack2023.DTO.proto.DataFieldValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.racerssquad.besthack2023.DTO.proto.DataFieldValueProto.internal_static_com_racerssquad_besthack2023_DTO_proto_DataFieldValue_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.racerssquad.besthack2023.DTO.proto.DataFieldValueProto.internal_static_com_racerssquad_besthack2023_DTO_proto_DataFieldValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.racerssquad.besthack2023.DTO.proto.DataFieldValue.class, com.racerssquad.besthack2023.DTO.proto.DataFieldValue.Builder.class);
    }

    // Construct using com.racerssquad.besthack2023.DTO.proto.DataFieldValue.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      alias_ = "";

      if (valueBuilder_ == null) {
        value_ = null;
      } else {
        value_ = null;
        valueBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.racerssquad.besthack2023.DTO.proto.DataFieldValueProto.internal_static_com_racerssquad_besthack2023_DTO_proto_DataFieldValue_descriptor;
    }

    @Override
    public com.racerssquad.besthack2023.DTO.proto.DataFieldValue getDefaultInstanceForType() {
      return getDefaultInstance();
    }

    @Override
    public com.racerssquad.besthack2023.DTO.proto.DataFieldValue build() {
      com.racerssquad.besthack2023.DTO.proto.DataFieldValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public com.racerssquad.besthack2023.DTO.proto.DataFieldValue buildPartial() {
      com.racerssquad.besthack2023.DTO.proto.DataFieldValue result = new com.racerssquad.besthack2023.DTO.proto.DataFieldValue(this);
      result.alias_ = alias_;
      if (valueBuilder_ == null) {
        result.value_ = value_;
      } else {
        result.value_ = valueBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.racerssquad.besthack2023.DTO.proto.DataFieldValue) {
        return mergeFrom((com.racerssquad.besthack2023.DTO.proto.DataFieldValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.racerssquad.besthack2023.DTO.proto.DataFieldValue other) {
      if (other == getDefaultInstance()) return this;
      if (!other.getAlias().isEmpty()) {
        alias_ = other.alias_;
        onChanged();
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.racerssquad.besthack2023.DTO.proto.DataFieldValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.racerssquad.besthack2023.DTO.proto.DataFieldValue) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object alias_ = "";
    /**
     * <pre>
     * Идентификатор поля для которого устанавливается значение
     * </pre>
     *
     * <code>string alias = 1;</code>
     * @return The alias.
     */
    public String getAlias() {
      Object ref = alias_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        alias_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Идентификатор поля для которого устанавливается значение
     * </pre>
     *
     * <code>string alias = 1;</code>
     * @return The bytes for alias.
     */
    public com.google.protobuf.ByteString
        getAliasBytes() {
      Object ref = alias_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        alias_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Идентификатор поля для которого устанавливается значение
     * </pre>
     *
     * <code>string alias = 1;</code>
     * @param value The alias to set.
     * @return This builder for chaining.
     */
    public Builder setAlias(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      alias_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Идентификатор поля для которого устанавливается значение
     * </pre>
     *
     * <code>string alias = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAlias() {
      
      alias_ = getDefaultInstance().getAlias();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Идентификатор поля для которого устанавливается значение
     * </pre>
     *
     * <code>string alias = 1;</code>
     * @param value The bytes for alias to set.
     * @return This builder for chaining.
     */
    public Builder setAliasBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      alias_ = value;
      onChanged();
      return this;
    }

    private com.racerssquad.besthack2023.DTO.proto.ValueRef value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.racerssquad.besthack2023.DTO.proto.ValueRef, com.racerssquad.besthack2023.DTO.proto.ValueRef.Builder, com.racerssquad.besthack2023.DTO.proto.ValueRefOrBuilder> valueBuilder_;
    /**
     * <pre>
     * Описание значения поля
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 2;</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return valueBuilder_ != null || value_ != null;
    }
    /**
     * <pre>
     * Описание значения поля
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 2;</code>
     * @return The value.
     */
    public com.racerssquad.besthack2023.DTO.proto.ValueRef getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? com.racerssquad.besthack2023.DTO.proto.ValueRef.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Описание значения поля
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 2;</code>
     */
    public Builder setValue(com.racerssquad.besthack2023.DTO.proto.ValueRef value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        valueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Описание значения поля
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 2;</code>
     */
    public Builder setValue(
        com.racerssquad.besthack2023.DTO.proto.ValueRef.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Описание значения поля
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 2;</code>
     */
    public Builder mergeValue(com.racerssquad.besthack2023.DTO.proto.ValueRef value) {
      if (valueBuilder_ == null) {
        if (value_ != null) {
          value_ =
            com.racerssquad.besthack2023.DTO.proto.ValueRef.newBuilder(value_).mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        valueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Описание значения поля
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 2;</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = null;
        onChanged();
      } else {
        value_ = null;
        valueBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Описание значения поля
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 2;</code>
     */
    public com.racerssquad.besthack2023.DTO.proto.ValueRef.Builder getValueBuilder() {
      
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Описание значения поля
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 2;</code>
     */
    public com.racerssquad.besthack2023.DTO.proto.ValueRefOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            com.racerssquad.besthack2023.DTO.proto.ValueRef.getDefaultInstance() : value_;
      }
    }
    /**
     * <pre>
     * Описание значения поля
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.racerssquad.besthack2023.DTO.proto.ValueRef, com.racerssquad.besthack2023.DTO.proto.ValueRef.Builder, com.racerssquad.besthack2023.DTO.proto.ValueRefOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.racerssquad.besthack2023.DTO.proto.ValueRef, com.racerssquad.besthack2023.DTO.proto.ValueRef.Builder, com.racerssquad.besthack2023.DTO.proto.ValueRefOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.racerssquad.besthack2023.DTO.proto.DataFieldValue)
  }

  // @@protoc_insertion_point(class_scope:com.racerssquad.besthack2023.DTO.proto.DataFieldValue)
  private static final com.racerssquad.besthack2023.DTO.proto.DataFieldValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.racerssquad.besthack2023.DTO.proto.DataFieldValue();
  }

  public static com.racerssquad.besthack2023.DTO.proto.DataFieldValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataFieldValue>
      PARSER = new com.google.protobuf.AbstractParser<DataFieldValue>() {
    @Override
    public DataFieldValue parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DataFieldValue(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DataFieldValue> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<DataFieldValue> getParserForType() {
    return PARSER;
  }

  @Override
  public com.racerssquad.besthack2023.DTO.proto.DataFieldValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
