// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DataRow.proto

package com.racerssquad.besthack2023.DTO.proto;

public interface DataRowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.racerssquad.besthack2023.DTO.proto.DataRow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Идентификатор записи
   * </pre>
   *
   * <code>string rowIdent = 1;</code>
   * @return The rowIdent.
   */
  String getRowIdent();
  /**
   * <pre>
   * Идентификатор записи
   * </pre>
   *
   * <code>string rowIdent = 1;</code>
   * @return The bytes for rowIdent.
   */
  com.google.protobuf.ByteString
      getRowIdentBytes();

  /**
   * <pre>
   * Инкрементальное удаление записи (Удаление записи при инкрементальной передаче данных)
   * </pre>
   *
   * <code>bool incrementDelete = 2;</code>
   * @return The incrementDelete.
   */
  boolean getIncrementDelete();

  /**
   * <pre>
   * Описание поля с установкой значения поля
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataFieldValue values = 3;</code>
   */
  java.util.List<com.racerssquad.besthack2023.DTO.proto.DataFieldValue> 
      getValuesList();
  /**
   * <pre>
   * Описание поля с установкой значения поля
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataFieldValue values = 3;</code>
   */
  com.racerssquad.besthack2023.DTO.proto.DataFieldValue getValues(int index);
  /**
   * <pre>
   * Описание поля с установкой значения поля
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataFieldValue values = 3;</code>
   */
  int getValuesCount();
  /**
   * <pre>
   * Описание поля с установкой значения поля
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataFieldValue values = 3;</code>
   */
  java.util.List<? extends com.racerssquad.besthack2023.DTO.proto.DataFieldValueOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <pre>
   * Описание поля с установкой значения поля
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.DataFieldValue values = 3;</code>
   */
  com.racerssquad.besthack2023.DTO.proto.DataFieldValueOrBuilder getValuesOrBuilder(
      int index);
}
