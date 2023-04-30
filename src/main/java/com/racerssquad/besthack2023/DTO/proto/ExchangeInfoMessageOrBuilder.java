// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExchangeInfoMessage.proto

package com.racerssquad.besthack2023.DTO.proto;

public interface ExchangeInfoMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Тело заголовка документа
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   * Тело заголовка документа
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.Header header = 1;</code>
   * @return The header.
   */
  com.racerssquad.besthack2023.DTO.proto.Header getHeader();
  /**
   * <pre>
   * Тело заголовка документа
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.Header header = 1;</code>
   */
  com.racerssquad.besthack2023.DTO.proto.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * Тело запроса документа
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.Request request = 2;</code>
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   * <pre>
   * Тело запроса документа
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.Request request = 2;</code>
   * @return The request.
   */
  com.racerssquad.besthack2023.DTO.proto.Request getRequest();
  /**
   * <pre>
   * Тело запроса документа
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.Request request = 2;</code>
   */
  com.racerssquad.besthack2023.DTO.proto.RequestOrBuilder getRequestOrBuilder();

  /**
   * <pre>
   * Тело ответа документа
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.Response response = 3;</code>
   * @return Whether the response field is set.
   */
  boolean hasResponse();
  /**
   * <pre>
   * Тело ответа документа
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.Response response = 3;</code>
   * @return The response.
   */
  com.racerssquad.besthack2023.DTO.proto.Response getResponse();
  /**
   * <pre>
   * Тело ответа документа
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.Response response = 3;</code>
   */
  com.racerssquad.besthack2023.DTO.proto.ResponseOrBuilder getResponseOrBuilder();

  /**
   * <pre>
   * Тело события документа
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.Event event = 4;</code>
   * @return Whether the event field is set.
   */
  boolean hasEvent();
  /**
   * <pre>
   * Тело события документа
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.Event event = 4;</code>
   * @return The event.
   */
  com.racerssquad.besthack2023.DTO.proto.Event getEvent();
  /**
   * <pre>
   * Тело события документа
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.Event event = 4;</code>
   */
  com.racerssquad.besthack2023.DTO.proto.EventOrBuilder getEventOrBuilder();

  public com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage.BodyCase getBodyCase();
}