// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Header.proto

package com.racerssquad.besthack2023.DTO.proto;

public final class HeaderProto {
  private HeaderProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_racerssquad_besthack2023_DTO_proto_Header_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_racerssquad_besthack2023_DTO_proto_Header_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\014Header.proto\022&com.racerssquad.besthack" +
      "2023.DTO.proto\"\205\001\n\006Header\022\022\n\nmessageNum\030" +
      "\001 \001(\t\022\021\n\ttimestamp\030\002 \001(\003\022\016\n\006sender\030\003 \001(\t" +
      "\022\020\n\010receiver\030\004 \001(\t\022\035\n\020messageNumAnswer\030\005" +
      " \001(\tH\000\210\001\001B\023\n\021_messageNumAnswerB\021B\013Header" +
      "ProtoH\001P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_racerssquad_besthack2023_DTO_proto_Header_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_racerssquad_besthack2023_DTO_proto_Header_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_racerssquad_besthack2023_DTO_proto_Header_descriptor,
        new String[] { "MessageNum", "Timestamp", "Sender", "Receiver", "MessageNumAnswer", "MessageNumAnswer", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
