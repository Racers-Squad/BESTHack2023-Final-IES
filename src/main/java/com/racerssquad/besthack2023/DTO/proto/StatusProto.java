// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Status.proto

package com.racerssquad.besthack2023.DTO.proto;

public final class StatusProto {
  private StatusProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_racerssquad_besthack2023_DTO_proto_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_racerssquad_besthack2023_DTO_proto_Status_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\014Status.proto\022&com.racerssquad.besthack" +
      "2023.DTO.proto\032\022MessageEnums.proto\032\rAdvI" +
      "nfo.proto\"\347\001\n\006Status\022@\n\004type\030\001 \001(\01622.com" +
      ".racerssquad.besthack2023.DTO.proto.Stat" +
      "usType\022\024\n\007details\030\002 \001(\tH\000\210\001\001\022\025\n\010nextTime" +
      "\030\003 \001(\003H\001\210\001\001\022G\n\tadvStatus\030\004 \001(\0132/.com.rac" +
      "erssquad.besthack2023.DTO.proto.AdvInfoH" +
      "\002\210\001\001B\n\n\010_detailsB\013\n\t_nextTimeB\014\n\n_advSta" +
      "tusB\021B\013StatusProtoH\001P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.getDescriptor(),
          com.racerssquad.besthack2023.DTO.proto.AdvInfoProto.getDescriptor(),
        });
    internal_static_com_racerssquad_besthack2023_DTO_proto_Status_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_racerssquad_besthack2023_DTO_proto_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_racerssquad_besthack2023_DTO_proto_Status_descriptor,
        new String[] { "Type", "Details", "NextTime", "AdvStatus", "Details", "NextTime", "AdvStatus", });
    com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.getDescriptor();
    com.racerssquad.besthack2023.DTO.proto.AdvInfoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
