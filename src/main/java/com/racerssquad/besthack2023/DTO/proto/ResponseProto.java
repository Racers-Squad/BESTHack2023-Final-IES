// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Response.proto

package com.racerssquad.besthack2023.DTO.proto;

public final class ResponseProto {
  private ResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_racerssquad_besthack2023_DTO_proto_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_racerssquad_besthack2023_DTO_proto_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\016Response.proto\022&com.racerssquad.bestha" +
      "ck2023.DTO.proto\032\022MessageEnums.proto\032\014St" +
      "atus.proto\"\216\002\n\010Response\022D\n\007command\030\001 \001(\016" +
      "23.com.racerssquad.besthack2023.DTO.prot" +
      "o.CommandType\022F\n\nanswerType\030\002 \001(\01622.com." +
      "racerssquad.besthack2023.DTO.proto.Answe" +
      "rType\022\026\n\terrorText\030\003 \001(\tH\000\210\001\001\022C\n\006status\030" +
      "\004 \001(\0132..com.racerssquad.besthack2023.DTO" +
      ".proto.StatusH\001\210\001\001B\014\n\n_errorTextB\t\n\007_sta" +
      "tusB\023B\rResponseProtoH\001P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.getDescriptor(),
          com.racerssquad.besthack2023.DTO.proto.StatusProto.getDescriptor(),
        });
    internal_static_com_racerssquad_besthack2023_DTO_proto_Response_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_racerssquad_besthack2023_DTO_proto_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_racerssquad_besthack2023_DTO_proto_Response_descriptor,
        new String[] { "Command", "AnswerType", "ErrorText", "Status", "ErrorText", "Status", });
    com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.getDescriptor();
    com.racerssquad.besthack2023.DTO.proto.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}