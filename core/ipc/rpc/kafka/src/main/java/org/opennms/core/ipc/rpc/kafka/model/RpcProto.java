/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2025 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2025 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/
package org.opennms.core.ipc.rpc.kafka.model;

public final class RpcProto {
  private RpcProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RpcMessageProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RpcMessageProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RpcMessageProto_TracingInfoEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RpcMessageProto_TracingInfoEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017kafka-rpc.proto\"\226\002\n\017RpcMessageProto\022\016\n" +
      "\006rpc_id\030\001 \001(\t\022\023\n\013rpc_content\030\002 \001(\014\022\021\n\tsy" +
      "stem_id\030\003 \001(\t\022\027\n\017expiration_time\030\004 \001(\004\022\034" +
      "\n\024current_chunk_number\030\005 \001(\005\022\024\n\014total_ch" +
      "unks\030\006 \001(\005\0227\n\014tracing_info\030\007 \003(\0132!.RpcMe" +
      "ssageProto.TracingInfoEntry\022\021\n\tmodule_id" +
      "\030\010 \001(\t\0322\n\020TracingInfoEntry\022\013\n\003key\030\001 \001(\t\022" +
      "\r\n\005value\030\002 \001(\t:\0028\001B2\n$org.opennms.core.i" +
      "pc.rpc.kafka.modelB\010RpcProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RpcMessageProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RpcMessageProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RpcMessageProto_descriptor,
        new java.lang.String[] { "RpcId", "RpcContent", "SystemId", "ExpirationTime", "CurrentChunkNumber", "TotalChunks", "TracingInfo", "ModuleId", });
    internal_static_RpcMessageProto_TracingInfoEntry_descriptor =
      internal_static_RpcMessageProto_descriptor.getNestedTypes().get(0);
    internal_static_RpcMessageProto_TracingInfoEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RpcMessageProto_TracingInfoEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
