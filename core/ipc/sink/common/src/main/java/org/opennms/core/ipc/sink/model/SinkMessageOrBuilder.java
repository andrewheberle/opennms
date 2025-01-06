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
package org.opennms.core.ipc.sink.model;

public interface SinkMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SinkMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string message_id = 1;</code>
   * @return The messageId.
   */
  java.lang.String getMessageId();
  /**
   * <code>string message_id = 1;</code>
   * @return The bytes for messageId.
   */
  com.google.protobuf.ByteString
      getMessageIdBytes();

  /**
   * <code>bytes content = 2;</code>
   * @return The content.
   */
  com.google.protobuf.ByteString getContent();

  /**
   * <code>int32 current_chunk_number = 3;</code>
   * @return The currentChunkNumber.
   */
  int getCurrentChunkNumber();

  /**
   * <code>int32 total_chunks = 4;</code>
   * @return The totalChunks.
   */
  int getTotalChunks();

  /**
   * <code>map&lt;string, string&gt; tracing_info = 5;</code>
   */
  int getTracingInfoCount();
  /**
   * <code>map&lt;string, string&gt; tracing_info = 5;</code>
   */
  boolean containsTracingInfo(
      java.lang.String key);
  /**
   * Use {@link #getTracingInfoMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getTracingInfo();
  /**
   * <code>map&lt;string, string&gt; tracing_info = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getTracingInfoMap();
  /**
   * <code>map&lt;string, string&gt; tracing_info = 5;</code>
   */
  /* nullable */
java.lang.String getTracingInfoOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; tracing_info = 5;</code>
   */
  java.lang.String getTracingInfoOrThrow(
      java.lang.String key);
}
