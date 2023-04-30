// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AdvInfoData.proto

package com.racerssquad.besthack2023.DTO.proto;

/**
 * <pre>
 **
 *Тип данных для типа расширенного отображения статуса.
 *Поле fullOrIncrement - обязательно для заполнения.
 *Если поле fullOrIncrement = false, а поле rows не содержит данных, то со стороны GUI данные в статусе необходимо стирать полностью.
 *Поле fullOrIncrement регламентирует правила изменения данных в строках расширенного статуса.
 *При значении false данные в GUI полностью заменяются данными из коллекции rows, в обратном случае действует следующее правило:
 *1. Если строки с данными из поля rows нет в GUI значит ее нужно добавить
 *2. Если строка с данными из поля rows есть в GUI значит значения полей в GUI нужно заменить значениями полей из пришедшей строки
 *3. Если строка с данными из поля rows помечена флагом incrementDelete = true значит эта строка должна быть удалена из GUI
 * </pre>
 *
 * Protobuf type {@code com.racerssquad.besthack2023.DTO.proto.AdvInfoData}
 */
public final class AdvInfoData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.racerssquad.besthack2023.DTO.proto.AdvInfoData)
    AdvInfoDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdvInfoData.newBuilder() to construct.
  private AdvInfoData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdvInfoData() {
    rows_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdvInfoData();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AdvInfoData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            fullOrIncrement_ = input.readBool();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              rows_ = new java.util.ArrayList<com.racerssquad.besthack2023.DTO.proto.DataRow>();
              mutable_bitField0_ |= 0x00000001;
            }
            rows_.add(
                input.readMessage(com.racerssquad.besthack2023.DTO.proto.DataRow.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        rows_ = java.util.Collections.unmodifiableList(rows_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.racerssquad.besthack2023.DTO.proto.AdvInfoDataProto.internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfoData_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.racerssquad.besthack2023.DTO.proto.AdvInfoDataProto.internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfoData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.racerssquad.besthack2023.DTO.proto.AdvInfoData.class, com.racerssquad.besthack2023.DTO.proto.AdvInfoData.Builder.class);
  }

  public static final int FULLORINCREMENT_FIELD_NUMBER = 1;
  private boolean fullOrIncrement_;
  /**
   * <pre>
   * Флаг указывающий на полное обновление данных или инкрементальное
   * </pre>
   *
   * <code>bool fullOrIncrement = 1;</code>
   * @return The fullOrIncrement.
   */
  @Override
  public boolean getFullOrIncrement() {
    return fullOrIncrement_;
  }

  public static final int ROWS_FIELD_NUMBER = 2;
  private java.util.List<com.racerssquad.besthack2023.DTO.proto.DataRow> rows_;
  /**
   * <pre>
   * Записи со значениями полей
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
   */
  @Override
  public java.util.List<com.racerssquad.besthack2023.DTO.proto.DataRow> getRowsList() {
    return rows_;
  }
  /**
   * <pre>
   * Записи со значениями полей
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
   */
  @Override
  public java.util.List<? extends com.racerssquad.besthack2023.DTO.proto.DataRowOrBuilder> 
      getRowsOrBuilderList() {
    return rows_;
  }
  /**
   * <pre>
   * Записи со значениями полей
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
   */
  @Override
  public int getRowsCount() {
    return rows_.size();
  }
  /**
   * <pre>
   * Записи со значениями полей
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
   */
  @Override
  public com.racerssquad.besthack2023.DTO.proto.DataRow getRows(int index) {
    return rows_.get(index);
  }
  /**
   * <pre>
   * Записи со значениями полей
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
   */
  @Override
  public com.racerssquad.besthack2023.DTO.proto.DataRowOrBuilder getRowsOrBuilder(
      int index) {
    return rows_.get(index);
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
    if (fullOrIncrement_ != false) {
      output.writeBool(1, fullOrIncrement_);
    }
    for (int i = 0; i < rows_.size(); i++) {
      output.writeMessage(2, rows_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fullOrIncrement_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, fullOrIncrement_);
    }
    for (int i = 0; i < rows_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, rows_.get(i));
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
    if (!(obj instanceof com.racerssquad.besthack2023.DTO.proto.AdvInfoData)) {
      return super.equals(obj);
    }
    com.racerssquad.besthack2023.DTO.proto.AdvInfoData other = (com.racerssquad.besthack2023.DTO.proto.AdvInfoData) obj;

    if (getFullOrIncrement()
        != other.getFullOrIncrement()) return false;
    if (!getRowsList()
        .equals(other.getRowsList())) return false;
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
    hash = (37 * hash) + FULLORINCREMENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFullOrIncrement());
    if (getRowsCount() > 0) {
      hash = (37 * hash) + ROWS_FIELD_NUMBER;
      hash = (53 * hash) + getRowsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoData parseFrom(
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
  public static Builder newBuilder(com.racerssquad.besthack2023.DTO.proto.AdvInfoData prototype) {
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
   * <pre>
   **
   *Тип данных для типа расширенного отображения статуса.
   *Поле fullOrIncrement - обязательно для заполнения.
   *Если поле fullOrIncrement = false, а поле rows не содержит данных, то со стороны GUI данные в статусе необходимо стирать полностью.
   *Поле fullOrIncrement регламентирует правила изменения данных в строках расширенного статуса.
   *При значении false данные в GUI полностью заменяются данными из коллекции rows, в обратном случае действует следующее правило:
   *1. Если строки с данными из поля rows нет в GUI значит ее нужно добавить
   *2. Если строка с данными из поля rows есть в GUI значит значения полей в GUI нужно заменить значениями полей из пришедшей строки
   *3. Если строка с данными из поля rows помечена флагом incrementDelete = true значит эта строка должна быть удалена из GUI
   * </pre>
   *
   * Protobuf type {@code com.racerssquad.besthack2023.DTO.proto.AdvInfoData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.racerssquad.besthack2023.DTO.proto.AdvInfoData)
      com.racerssquad.besthack2023.DTO.proto.AdvInfoDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.racerssquad.besthack2023.DTO.proto.AdvInfoDataProto.internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfoData_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.racerssquad.besthack2023.DTO.proto.AdvInfoDataProto.internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfoData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.racerssquad.besthack2023.DTO.proto.AdvInfoData.class, com.racerssquad.besthack2023.DTO.proto.AdvInfoData.Builder.class);
    }

    // Construct using com.racerssquad.besthack2023.DTO.proto.AdvInfoData.newBuilder()
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
        getRowsFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      fullOrIncrement_ = false;

      if (rowsBuilder_ == null) {
        rows_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        rowsBuilder_.clear();
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.racerssquad.besthack2023.DTO.proto.AdvInfoDataProto.internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfoData_descriptor;
    }

    @Override
    public com.racerssquad.besthack2023.DTO.proto.AdvInfoData getDefaultInstanceForType() {
      return getDefaultInstance();
    }

    @Override
    public com.racerssquad.besthack2023.DTO.proto.AdvInfoData build() {
      com.racerssquad.besthack2023.DTO.proto.AdvInfoData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public com.racerssquad.besthack2023.DTO.proto.AdvInfoData buildPartial() {
      com.racerssquad.besthack2023.DTO.proto.AdvInfoData result = new com.racerssquad.besthack2023.DTO.proto.AdvInfoData(this);
      int from_bitField0_ = bitField0_;
      result.fullOrIncrement_ = fullOrIncrement_;
      if (rowsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rows_ = java.util.Collections.unmodifiableList(rows_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rows_ = rows_;
      } else {
        result.rows_ = rowsBuilder_.build();
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
      if (other instanceof com.racerssquad.besthack2023.DTO.proto.AdvInfoData) {
        return mergeFrom((com.racerssquad.besthack2023.DTO.proto.AdvInfoData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.racerssquad.besthack2023.DTO.proto.AdvInfoData other) {
      if (other == getDefaultInstance()) return this;
      if (other.getFullOrIncrement() != false) {
        setFullOrIncrement(other.getFullOrIncrement());
      }
      if (rowsBuilder_ == null) {
        if (!other.rows_.isEmpty()) {
          if (rows_.isEmpty()) {
            rows_ = other.rows_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRowsIsMutable();
            rows_.addAll(other.rows_);
          }
          onChanged();
        }
      } else {
        if (!other.rows_.isEmpty()) {
          if (rowsBuilder_.isEmpty()) {
            rowsBuilder_.dispose();
            rowsBuilder_ = null;
            rows_ = other.rows_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rowsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRowsFieldBuilder() : null;
          } else {
            rowsBuilder_.addAllMessages(other.rows_);
          }
        }
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
      com.racerssquad.besthack2023.DTO.proto.AdvInfoData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.racerssquad.besthack2023.DTO.proto.AdvInfoData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean fullOrIncrement_ ;
    /**
     * <pre>
     * Флаг указывающий на полное обновление данных или инкрементальное
     * </pre>
     *
     * <code>bool fullOrIncrement = 1;</code>
     * @return The fullOrIncrement.
     */
    @Override
    public boolean getFullOrIncrement() {
      return fullOrIncrement_;
    }
    /**
     * <pre>
     * Флаг указывающий на полное обновление данных или инкрементальное
     * </pre>
     *
     * <code>bool fullOrIncrement = 1;</code>
     * @param value The fullOrIncrement to set.
     * @return This builder for chaining.
     */
    public Builder setFullOrIncrement(boolean value) {
      
      fullOrIncrement_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Флаг указывающий на полное обновление данных или инкрементальное
     * </pre>
     *
     * <code>bool fullOrIncrement = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFullOrIncrement() {
      
      fullOrIncrement_ = false;
      onChanged();
      return this;
    }

    private java.util.List<com.racerssquad.besthack2023.DTO.proto.DataRow> rows_ =
      java.util.Collections.emptyList();
    private void ensureRowsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rows_ = new java.util.ArrayList<com.racerssquad.besthack2023.DTO.proto.DataRow>(rows_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.racerssquad.besthack2023.DTO.proto.DataRow, com.racerssquad.besthack2023.DTO.proto.DataRow.Builder, com.racerssquad.besthack2023.DTO.proto.DataRowOrBuilder> rowsBuilder_;

    /**
     * <pre>
     * Записи со значениями полей
     * </pre>
     *
     * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
     */
    public java.util.List<com.racerssquad.besthack2023.DTO.proto.DataRow> getRowsList() {
      if (rowsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rows_);
      } else {
        return rowsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Записи со значениями полей
     * </pre>
     *
     * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
     */
    public int getRowsCount() {
      if (rowsBuilder_ == null) {
        return rows_.size();
      } else {
        return rowsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Записи со значениями полей
     * </pre>
     *
     * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
     */
    public com.racerssquad.besthack2023.DTO.proto.DataRow getRows(int index) {
      if (rowsBuilder_ == null) {
        return rows_.get(index);
      } else {
        return rowsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Записи со значениями полей
     * </pre>
     *
     * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
     */
    public Builder setRows(
        int index, com.racerssquad.besthack2023.DTO.proto.DataRow value) {
      if (rowsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowsIsMutable();
        rows_.set(index, value);
        onChanged();
      } else {
        rowsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Записи со значениями полей
     * </pre>
     *
     * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
     */
    public Builder setRows(
        int index, com.racerssquad.besthack2023.DTO.proto.DataRow.Builder builderForValue) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.set(index, builderForValue.build());
        onChanged();
      } else {
        rowsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Записи со значениями полей
     * </pre>
     *
     * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
     */
    public Builder addRows(com.racerssquad.besthack2023.DTO.proto.DataRow value) {
      if (rowsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowsIsMutable();
        rows_.add(value);
        onChanged();
      } else {
        rowsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Записи со значениями полей
     * </pre>
     *
     * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
     */
    public Builder addRows(
        int index, com.racerssquad.besthack2023.DTO.proto.DataRow value) {
      if (rowsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowsIsMutable();
        rows_.add(index, value);
        onChanged();
      } else {
        rowsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Записи со значениями полей
     * </pre>
     *
     * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
     */
    public Builder addRows(
        com.racerssquad.besthack2023.DTO.proto.DataRow.Builder builderForValue) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.add(builderForValue.build());
        onChanged();
      } else {
        rowsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Записи со значениями полей
     * </pre>
     *
     * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
     */
    public Builder addRows(
        int index, com.racerssquad.besthack2023.DTO.proto.DataRow.Builder builderForValue) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.add(index, builderForValue.build());
        onChanged();
      } else {
        rowsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Записи со значениями полей
     * </pre>
     *
     * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
     */
    public Builder addAllRows(
        Iterable<? extends com.racerssquad.besthack2023.DTO.proto.DataRow> values) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        addAll(
            values, rows_);
        onChanged();
      } else {
        rowsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Записи со значениями полей
     * </pre>
     *
     * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
     */
    public Builder clearRows() {
      if (rowsBuilder_ == null) {
        rows_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rowsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Записи со значениями полей
     * </pre>
     *
     * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
     */
    public Builder removeRows(int index) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.remove(index);
        onChanged();
      } else {
        rowsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Записи со значениями полей
     * </pre>
     *
     * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
     */
    public com.racerssquad.besthack2023.DTO.proto.DataRow.Builder getRowsBuilder(
        int index) {
      return getRowsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Записи со значениями полей
     * </pre>
     *
     * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
     */
    public com.racerssquad.besthack2023.DTO.proto.DataRowOrBuilder getRowsOrBuilder(
        int index) {
      if (rowsBuilder_ == null) {
        return rows_.get(index);  } else {
        return rowsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Записи со значениями полей
     * </pre>
     *
     * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
     */
    public java.util.List<? extends com.racerssquad.besthack2023.DTO.proto.DataRowOrBuilder> 
         getRowsOrBuilderList() {
      if (rowsBuilder_ != null) {
        return rowsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rows_);
      }
    }
    /**
     * <pre>
     * Записи со значениями полей
     * </pre>
     *
     * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
     */
    public com.racerssquad.besthack2023.DTO.proto.DataRow.Builder addRowsBuilder() {
      return getRowsFieldBuilder().addBuilder(
          com.racerssquad.besthack2023.DTO.proto.DataRow.getDefaultInstance());
    }
    /**
     * <pre>
     * Записи со значениями полей
     * </pre>
     *
     * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
     */
    public com.racerssquad.besthack2023.DTO.proto.DataRow.Builder addRowsBuilder(
        int index) {
      return getRowsFieldBuilder().addBuilder(
          index, com.racerssquad.besthack2023.DTO.proto.DataRow.getDefaultInstance());
    }
    /**
     * <pre>
     * Записи со значениями полей
     * </pre>
     *
     * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataRow rows = 2;</code>
     */
    public java.util.List<com.racerssquad.besthack2023.DTO.proto.DataRow.Builder> 
         getRowsBuilderList() {
      return getRowsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.racerssquad.besthack2023.DTO.proto.DataRow, com.racerssquad.besthack2023.DTO.proto.DataRow.Builder, com.racerssquad.besthack2023.DTO.proto.DataRowOrBuilder> 
        getRowsFieldBuilder() {
      if (rowsBuilder_ == null) {
        rowsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.racerssquad.besthack2023.DTO.proto.DataRow, com.racerssquad.besthack2023.DTO.proto.DataRow.Builder, com.racerssquad.besthack2023.DTO.proto.DataRowOrBuilder>(
                rows_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        rows_ = null;
      }
      return rowsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.racerssquad.besthack2023.DTO.proto.AdvInfoData)
  }

  // @@protoc_insertion_point(class_scope:com.racerssquad.besthack2023.DTO.proto.AdvInfoData)
  private static final com.racerssquad.besthack2023.DTO.proto.AdvInfoData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.racerssquad.besthack2023.DTO.proto.AdvInfoData();
  }

  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdvInfoData>
      PARSER = new com.google.protobuf.AbstractParser<AdvInfoData>() {
    @Override
    public AdvInfoData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AdvInfoData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AdvInfoData> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<AdvInfoData> getParserForType() {
    return PARSER;
  }

  @Override
  public com.racerssquad.besthack2023.DTO.proto.AdvInfoData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
