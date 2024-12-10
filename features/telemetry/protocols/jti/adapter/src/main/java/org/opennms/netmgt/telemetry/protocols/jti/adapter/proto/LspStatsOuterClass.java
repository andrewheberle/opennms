/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2024 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2024 The OpenNMS Group, Inc.
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
package org.opennms.netmgt.telemetry.protocols.jti.adapter.proto;

public final class LspStatsOuterClass {
  private LspStatsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.jnprLspStatisticsExt);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LspStatsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LspStats)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * List of LSP statistics records
     * </pre>
     *
     * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
     */
    java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord> 
        getLspStatsRecordsList();
    /**
     * <pre>
     * List of LSP statistics records
     * </pre>
     *
     * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord getLspStatsRecords(int index);
    /**
     * <pre>
     * List of LSP statistics records
     * </pre>
     *
     * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
     */
    int getLspStatsRecordsCount();
    /**
     * <pre>
     * List of LSP statistics records
     * </pre>
     *
     * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
     */
    java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecordOrBuilder> 
        getLspStatsRecordsOrBuilderList();
    /**
     * <pre>
     * List of LSP statistics records
     * </pre>
     *
     * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecordOrBuilder getLspStatsRecordsOrBuilder(
        int index);
  }
  /**
   * <pre>
   *
   * Top-level message
   * </pre>
   *
   * Protobuf type {@code LspStats}
   */
  public static final class LspStats extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LspStats)
      LspStatsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LspStats.newBuilder() to construct.
    private LspStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LspStats() {
      lspStatsRecords_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LspStats();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.internal_static_LspStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.internal_static_LspStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats.Builder.class);
    }

    public static final int LSP_STATS_RECORDS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord> lspStatsRecords_;
    /**
     * <pre>
     * List of LSP statistics records
     * </pre>
     *
     * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord> getLspStatsRecordsList() {
      return lspStatsRecords_;
    }
    /**
     * <pre>
     * List of LSP statistics records
     * </pre>
     *
     * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecordOrBuilder> 
        getLspStatsRecordsOrBuilderList() {
      return lspStatsRecords_;
    }
    /**
     * <pre>
     * List of LSP statistics records
     * </pre>
     *
     * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
     */
    @java.lang.Override
    public int getLspStatsRecordsCount() {
      return lspStatsRecords_.size();
    }
    /**
     * <pre>
     * List of LSP statistics records
     * </pre>
     *
     * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord getLspStatsRecords(int index) {
      return lspStatsRecords_.get(index);
    }
    /**
     * <pre>
     * List of LSP statistics records
     * </pre>
     *
     * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecordOrBuilder getLspStatsRecordsOrBuilder(
        int index) {
      return lspStatsRecords_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getLspStatsRecordsCount(); i++) {
        if (!getLspStatsRecords(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < lspStatsRecords_.size(); i++) {
        output.writeMessage(1, lspStatsRecords_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < lspStatsRecords_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, lspStatsRecords_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats) obj;

      if (!getLspStatsRecordsList()
          .equals(other.getLspStatsRecordsList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getLspStatsRecordsCount() > 0) {
        hash = (37 * hash) + LSP_STATS_RECORDS_FIELD_NUMBER;
        hash = (53 * hash) + getLspStatsRecordsList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats prototype) {
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
     * <pre>
     *
     * Top-level message
     * </pre>
     *
     * Protobuf type {@code LspStats}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LspStats)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.internal_static_LspStats_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.internal_static_LspStats_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        if (lspStatsRecordsBuilder_ == null) {
          lspStatsRecords_ = java.util.Collections.emptyList();
        } else {
          lspStatsRecords_ = null;
          lspStatsRecordsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.internal_static_LspStats_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats result) {
        if (lspStatsRecordsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            lspStatsRecords_ = java.util.Collections.unmodifiableList(lspStatsRecords_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.lspStatsRecords_ = lspStatsRecords_;
        } else {
          result.lspStatsRecords_ = lspStatsRecordsBuilder_.build();
        }
      }

      private void buildPartial0(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats.getDefaultInstance()) return this;
        if (lspStatsRecordsBuilder_ == null) {
          if (!other.lspStatsRecords_.isEmpty()) {
            if (lspStatsRecords_.isEmpty()) {
              lspStatsRecords_ = other.lspStatsRecords_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureLspStatsRecordsIsMutable();
              lspStatsRecords_.addAll(other.lspStatsRecords_);
            }
            onChanged();
          }
        } else {
          if (!other.lspStatsRecords_.isEmpty()) {
            if (lspStatsRecordsBuilder_.isEmpty()) {
              lspStatsRecordsBuilder_.dispose();
              lspStatsRecordsBuilder_ = null;
              lspStatsRecords_ = other.lspStatsRecords_;
              bitField0_ = (bitField0_ & ~0x00000001);
              lspStatsRecordsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLspStatsRecordsFieldBuilder() : null;
            } else {
              lspStatsRecordsBuilder_.addAllMessages(other.lspStatsRecords_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getLspStatsRecordsCount(); i++) {
          if (!getLspStatsRecords(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord m =
                    input.readMessage(
                        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.PARSER,
                        extensionRegistry);
                if (lspStatsRecordsBuilder_ == null) {
                  ensureLspStatsRecordsIsMutable();
                  lspStatsRecords_.add(m);
                } else {
                  lspStatsRecordsBuilder_.addMessage(m);
                }
                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord> lspStatsRecords_ =
        java.util.Collections.emptyList();
      private void ensureLspStatsRecordsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          lspStatsRecords_ = new java.util.ArrayList<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord>(lspStatsRecords_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecordOrBuilder> lspStatsRecordsBuilder_;

      /**
       * <pre>
       * List of LSP statistics records
       * </pre>
       *
       * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord> getLspStatsRecordsList() {
        if (lspStatsRecordsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(lspStatsRecords_);
        } else {
          return lspStatsRecordsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * List of LSP statistics records
       * </pre>
       *
       * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
       */
      public int getLspStatsRecordsCount() {
        if (lspStatsRecordsBuilder_ == null) {
          return lspStatsRecords_.size();
        } else {
          return lspStatsRecordsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * List of LSP statistics records
       * </pre>
       *
       * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord getLspStatsRecords(int index) {
        if (lspStatsRecordsBuilder_ == null) {
          return lspStatsRecords_.get(index);
        } else {
          return lspStatsRecordsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * List of LSP statistics records
       * </pre>
       *
       * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
       */
      public Builder setLspStatsRecords(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord value) {
        if (lspStatsRecordsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLspStatsRecordsIsMutable();
          lspStatsRecords_.set(index, value);
          onChanged();
        } else {
          lspStatsRecordsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * List of LSP statistics records
       * </pre>
       *
       * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
       */
      public Builder setLspStatsRecords(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.Builder builderForValue) {
        if (lspStatsRecordsBuilder_ == null) {
          ensureLspStatsRecordsIsMutable();
          lspStatsRecords_.set(index, builderForValue.build());
          onChanged();
        } else {
          lspStatsRecordsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of LSP statistics records
       * </pre>
       *
       * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
       */
      public Builder addLspStatsRecords(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord value) {
        if (lspStatsRecordsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLspStatsRecordsIsMutable();
          lspStatsRecords_.add(value);
          onChanged();
        } else {
          lspStatsRecordsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * List of LSP statistics records
       * </pre>
       *
       * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
       */
      public Builder addLspStatsRecords(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord value) {
        if (lspStatsRecordsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLspStatsRecordsIsMutable();
          lspStatsRecords_.add(index, value);
          onChanged();
        } else {
          lspStatsRecordsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * List of LSP statistics records
       * </pre>
       *
       * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
       */
      public Builder addLspStatsRecords(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.Builder builderForValue) {
        if (lspStatsRecordsBuilder_ == null) {
          ensureLspStatsRecordsIsMutable();
          lspStatsRecords_.add(builderForValue.build());
          onChanged();
        } else {
          lspStatsRecordsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of LSP statistics records
       * </pre>
       *
       * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
       */
      public Builder addLspStatsRecords(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.Builder builderForValue) {
        if (lspStatsRecordsBuilder_ == null) {
          ensureLspStatsRecordsIsMutable();
          lspStatsRecords_.add(index, builderForValue.build());
          onChanged();
        } else {
          lspStatsRecordsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of LSP statistics records
       * </pre>
       *
       * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
       */
      public Builder addAllLspStatsRecords(
          java.lang.Iterable<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord> values) {
        if (lspStatsRecordsBuilder_ == null) {
          ensureLspStatsRecordsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, lspStatsRecords_);
          onChanged();
        } else {
          lspStatsRecordsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * List of LSP statistics records
       * </pre>
       *
       * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
       */
      public Builder clearLspStatsRecords() {
        if (lspStatsRecordsBuilder_ == null) {
          lspStatsRecords_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          lspStatsRecordsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * List of LSP statistics records
       * </pre>
       *
       * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
       */
      public Builder removeLspStatsRecords(int index) {
        if (lspStatsRecordsBuilder_ == null) {
          ensureLspStatsRecordsIsMutable();
          lspStatsRecords_.remove(index);
          onChanged();
        } else {
          lspStatsRecordsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * List of LSP statistics records
       * </pre>
       *
       * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.Builder getLspStatsRecordsBuilder(
          int index) {
        return getLspStatsRecordsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * List of LSP statistics records
       * </pre>
       *
       * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecordOrBuilder getLspStatsRecordsOrBuilder(
          int index) {
        if (lspStatsRecordsBuilder_ == null) {
          return lspStatsRecords_.get(index);  } else {
          return lspStatsRecordsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * List of LSP statistics records
       * </pre>
       *
       * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
       */
      public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecordOrBuilder> 
           getLspStatsRecordsOrBuilderList() {
        if (lspStatsRecordsBuilder_ != null) {
          return lspStatsRecordsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(lspStatsRecords_);
        }
      }
      /**
       * <pre>
       * List of LSP statistics records
       * </pre>
       *
       * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.Builder addLspStatsRecordsBuilder() {
        return getLspStatsRecordsFieldBuilder().addBuilder(
            org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.getDefaultInstance());
      }
      /**
       * <pre>
       * List of LSP statistics records
       * </pre>
       *
       * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.Builder addLspStatsRecordsBuilder(
          int index) {
        return getLspStatsRecordsFieldBuilder().addBuilder(
            index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.getDefaultInstance());
      }
      /**
       * <pre>
       * List of LSP statistics records
       * </pre>
       *
       * <code>repeated .LspStatsRecord lsp_stats_records = 1;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.Builder> 
           getLspStatsRecordsBuilderList() {
        return getLspStatsRecordsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecordOrBuilder> 
          getLspStatsRecordsFieldBuilder() {
        if (lspStatsRecordsBuilder_ == null) {
          lspStatsRecordsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecordOrBuilder>(
                  lspStatsRecords_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          lspStatsRecords_ = null;
        }
        return lspStatsRecordsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:LspStats)
    }

    // @@protoc_insertion_point(class_scope:LspStats)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<LspStats>
        PARSER = new com.google.protobuf.AbstractParser<LspStats>() {
      @java.lang.Override
      public LspStats parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<LspStats> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LspStats> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LspStatsRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LspStatsRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Name of the LSP
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <pre>
     * Name of the LSP
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <pre>
     * Name of the LSP
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * Instance Identifier for cases when RPD creates multiple instances
     * </pre>
     *
     * <code>required uint32 instance_identifier = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the instanceIdentifier field is set.
     */
    boolean hasInstanceIdentifier();
    /**
     * <pre>
     * Instance Identifier for cases when RPD creates multiple instances
     * </pre>
     *
     * <code>required uint32 instance_identifier = 2 [(.telemetry_options) = { ... }</code>
     * @return The instanceIdentifier.
     */
    int getInstanceIdentifier();

    /**
     * <pre>
     * Name of the counter. This is useful when an LSP has multiple counters.
     * When an LSP is resignalled, it is possible that a new counter is
     * created in the hardware.
     * </pre>
     *
     * <code>required string counter_name = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the counterName field is set.
     */
    boolean hasCounterName();
    /**
     * <pre>
     * Name of the counter. This is useful when an LSP has multiple counters.
     * When an LSP is resignalled, it is possible that a new counter is
     * created in the hardware.
     * </pre>
     *
     * <code>required string counter_name = 3 [(.telemetry_options) = { ... }</code>
     * @return The counterName.
     */
    java.lang.String getCounterName();
    /**
     * <pre>
     * Name of the counter. This is useful when an LSP has multiple counters.
     * When an LSP is resignalled, it is possible that a new counter is
     * created in the hardware.
     * </pre>
     *
     * <code>required string counter_name = 3 [(.telemetry_options) = { ... }</code>
     * @return The bytes for counterName.
     */
    com.google.protobuf.ByteString
        getCounterNameBytes();

    /**
     * <pre>
     * The total number of packets
     * </pre>
     *
     * <code>optional uint64 packets = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the packets field is set.
     */
    boolean hasPackets();
    /**
     * <pre>
     * The total number of packets
     * </pre>
     *
     * <code>optional uint64 packets = 4 [(.telemetry_options) = { ... }</code>
     * @return The packets.
     */
    long getPackets();

    /**
     * <pre>
     * The total number of bytes
     * </pre>
     *
     * <code>optional uint64 bytes = 5 [(.telemetry_options) = { ... }</code>
     * @return Whether the bytes field is set.
     */
    boolean hasBytes();
    /**
     * <pre>
     * The total number of bytes
     * </pre>
     *
     * <code>optional uint64 bytes = 5 [(.telemetry_options) = { ... }</code>
     * @return The bytes.
     */
    long getBytes();

    /**
     * <pre>
     * Packet rate computed over the most recent 3 second interval
     * </pre>
     *
     * <code>optional uint64 packet_rate = 6;</code>
     * @return Whether the packetRate field is set.
     */
    boolean hasPacketRate();
    /**
     * <pre>
     * Packet rate computed over the most recent 3 second interval
     * </pre>
     *
     * <code>optional uint64 packet_rate = 6;</code>
     * @return The packetRate.
     */
    long getPacketRate();

    /**
     * <pre>
     * Byte rate computed over the most recent 3 second interval
     * </pre>
     *
     * <code>optional uint64 byte_rate = 7;</code>
     * @return Whether the byteRate field is set.
     */
    boolean hasByteRate();
    /**
     * <pre>
     * Byte rate computed over the most recent 3 second interval
     * </pre>
     *
     * <code>optional uint64 byte_rate = 7;</code>
     * @return The byteRate.
     */
    long getByteRate();
  }
  /**
   * <pre>
   *
   * LSP statistics record
   * </pre>
   *
   * Protobuf type {@code LspStatsRecord}
   */
  public static final class LspStatsRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LspStatsRecord)
      LspStatsRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LspStatsRecord.newBuilder() to construct.
    private LspStatsRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LspStatsRecord() {
      name_ = "";
      counterName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LspStatsRecord();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.internal_static_LspStatsRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.internal_static_LspStatsRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";
    /**
     * <pre>
     * Name of the LSP
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Name of the LSP
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * Name of the LSP
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int INSTANCE_IDENTIFIER_FIELD_NUMBER = 2;
    private int instanceIdentifier_ = 0;
    /**
     * <pre>
     * Instance Identifier for cases when RPD creates multiple instances
     * </pre>
     *
     * <code>required uint32 instance_identifier = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the instanceIdentifier field is set.
     */
    @java.lang.Override
    public boolean hasInstanceIdentifier() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Instance Identifier for cases when RPD creates multiple instances
     * </pre>
     *
     * <code>required uint32 instance_identifier = 2 [(.telemetry_options) = { ... }</code>
     * @return The instanceIdentifier.
     */
    @java.lang.Override
    public int getInstanceIdentifier() {
      return instanceIdentifier_;
    }

    public static final int COUNTER_NAME_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object counterName_ = "";
    /**
     * <pre>
     * Name of the counter. This is useful when an LSP has multiple counters.
     * When an LSP is resignalled, it is possible that a new counter is
     * created in the hardware.
     * </pre>
     *
     * <code>required string counter_name = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the counterName field is set.
     */
    @java.lang.Override
    public boolean hasCounterName() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Name of the counter. This is useful when an LSP has multiple counters.
     * When an LSP is resignalled, it is possible that a new counter is
     * created in the hardware.
     * </pre>
     *
     * <code>required string counter_name = 3 [(.telemetry_options) = { ... }</code>
     * @return The counterName.
     */
    @java.lang.Override
    public java.lang.String getCounterName() {
      java.lang.Object ref = counterName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          counterName_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * Name of the counter. This is useful when an LSP has multiple counters.
     * When an LSP is resignalled, it is possible that a new counter is
     * created in the hardware.
     * </pre>
     *
     * <code>required string counter_name = 3 [(.telemetry_options) = { ... }</code>
     * @return The bytes for counterName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCounterNameBytes() {
      java.lang.Object ref = counterName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        counterName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PACKETS_FIELD_NUMBER = 4;
    private long packets_ = 0L;
    /**
     * <pre>
     * The total number of packets
     * </pre>
     *
     * <code>optional uint64 packets = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the packets field is set.
     */
    @java.lang.Override
    public boolean hasPackets() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * The total number of packets
     * </pre>
     *
     * <code>optional uint64 packets = 4 [(.telemetry_options) = { ... }</code>
     * @return The packets.
     */
    @java.lang.Override
    public long getPackets() {
      return packets_;
    }

    public static final int BYTES_FIELD_NUMBER = 5;
    private long bytes_ = 0L;
    /**
     * <pre>
     * The total number of bytes
     * </pre>
     *
     * <code>optional uint64 bytes = 5 [(.telemetry_options) = { ... }</code>
     * @return Whether the bytes field is set.
     */
    @java.lang.Override
    public boolean hasBytes() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * The total number of bytes
     * </pre>
     *
     * <code>optional uint64 bytes = 5 [(.telemetry_options) = { ... }</code>
     * @return The bytes.
     */
    @java.lang.Override
    public long getBytes() {
      return bytes_;
    }

    public static final int PACKET_RATE_FIELD_NUMBER = 6;
    private long packetRate_ = 0L;
    /**
     * <pre>
     * Packet rate computed over the most recent 3 second interval
     * </pre>
     *
     * <code>optional uint64 packet_rate = 6;</code>
     * @return Whether the packetRate field is set.
     */
    @java.lang.Override
    public boolean hasPacketRate() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * Packet rate computed over the most recent 3 second interval
     * </pre>
     *
     * <code>optional uint64 packet_rate = 6;</code>
     * @return The packetRate.
     */
    @java.lang.Override
    public long getPacketRate() {
      return packetRate_;
    }

    public static final int BYTE_RATE_FIELD_NUMBER = 7;
    private long byteRate_ = 0L;
    /**
     * <pre>
     * Byte rate computed over the most recent 3 second interval
     * </pre>
     *
     * <code>optional uint64 byte_rate = 7;</code>
     * @return Whether the byteRate field is set.
     */
    @java.lang.Override
    public boolean hasByteRate() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <pre>
     * Byte rate computed over the most recent 3 second interval
     * </pre>
     *
     * <code>optional uint64 byte_rate = 7;</code>
     * @return The byteRate.
     */
    @java.lang.Override
    public long getByteRate() {
      return byteRate_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasInstanceIdentifier()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCounterName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt32(2, instanceIdentifier_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, counterName_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeUInt64(4, packets_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeUInt64(5, bytes_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeUInt64(6, packetRate_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeUInt64(7, byteRate_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, instanceIdentifier_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, counterName_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, packets_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, bytes_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, packetRate_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, byteRate_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord) obj;

      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasInstanceIdentifier() != other.hasInstanceIdentifier()) return false;
      if (hasInstanceIdentifier()) {
        if (getInstanceIdentifier()
            != other.getInstanceIdentifier()) return false;
      }
      if (hasCounterName() != other.hasCounterName()) return false;
      if (hasCounterName()) {
        if (!getCounterName()
            .equals(other.getCounterName())) return false;
      }
      if (hasPackets() != other.hasPackets()) return false;
      if (hasPackets()) {
        if (getPackets()
            != other.getPackets()) return false;
      }
      if (hasBytes() != other.hasBytes()) return false;
      if (hasBytes()) {
        if (getBytes()
            != other.getBytes()) return false;
      }
      if (hasPacketRate() != other.hasPacketRate()) return false;
      if (hasPacketRate()) {
        if (getPacketRate()
            != other.getPacketRate()) return false;
      }
      if (hasByteRate() != other.hasByteRate()) return false;
      if (hasByteRate()) {
        if (getByteRate()
            != other.getByteRate()) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasInstanceIdentifier()) {
        hash = (37 * hash) + INSTANCE_IDENTIFIER_FIELD_NUMBER;
        hash = (53 * hash) + getInstanceIdentifier();
      }
      if (hasCounterName()) {
        hash = (37 * hash) + COUNTER_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getCounterName().hashCode();
      }
      if (hasPackets()) {
        hash = (37 * hash) + PACKETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getPackets());
      }
      if (hasBytes()) {
        hash = (37 * hash) + BYTES_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getBytes());
      }
      if (hasPacketRate()) {
        hash = (37 * hash) + PACKET_RATE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getPacketRate());
      }
      if (hasByteRate()) {
        hash = (37 * hash) + BYTE_RATE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getByteRate());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord prototype) {
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
     * <pre>
     *
     * LSP statistics record
     * </pre>
     *
     * Protobuf type {@code LspStatsRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LspStatsRecord)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.internal_static_LspStatsRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.internal_static_LspStatsRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        name_ = "";
        instanceIdentifier_ = 0;
        counterName_ = "";
        packets_ = 0L;
        bytes_ = 0L;
        packetRate_ = 0L;
        byteRate_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.internal_static_LspStatsRecord_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.name_ = name_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.instanceIdentifier_ = instanceIdentifier_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.counterName_ = counterName_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.packets_ = packets_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.bytes_ = bytes_;
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.packetRate_ = packetRate_;
          to_bitField0_ |= 0x00000020;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.byteRate_ = byteRate_;
          to_bitField0_ |= 0x00000040;
        }
        result.bitField0_ |= to_bitField0_;
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord.getDefaultInstance()) return this;
        if (other.hasName()) {
          name_ = other.name_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasInstanceIdentifier()) {
          setInstanceIdentifier(other.getInstanceIdentifier());
        }
        if (other.hasCounterName()) {
          counterName_ = other.counterName_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (other.hasPackets()) {
          setPackets(other.getPackets());
        }
        if (other.hasBytes()) {
          setBytes(other.getBytes());
        }
        if (other.hasPacketRate()) {
          setPacketRate(other.getPacketRate());
        }
        if (other.hasByteRate()) {
          setByteRate(other.getByteRate());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasName()) {
          return false;
        }
        if (!hasInstanceIdentifier()) {
          return false;
        }
        if (!hasCounterName()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                name_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                instanceIdentifier_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 26: {
                counterName_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 32: {
                packets_ = input.readUInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 40: {
                bytes_ = input.readUInt64();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              case 48: {
                packetRate_ = input.readUInt64();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
              case 56: {
                byteRate_ = input.readUInt64();
                bitField0_ |= 0x00000040;
                break;
              } // case 56
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * Name of the LSP
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Name of the LSP
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Name of the LSP
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Name of the LSP
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Name of the LSP
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        name_ = getDefaultInstance().getName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Name of the LSP
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private int instanceIdentifier_ ;
      /**
       * <pre>
       * Instance Identifier for cases when RPD creates multiple instances
       * </pre>
       *
       * <code>required uint32 instance_identifier = 2 [(.telemetry_options) = { ... }</code>
       * @return Whether the instanceIdentifier field is set.
       */
      @java.lang.Override
      public boolean hasInstanceIdentifier() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Instance Identifier for cases when RPD creates multiple instances
       * </pre>
       *
       * <code>required uint32 instance_identifier = 2 [(.telemetry_options) = { ... }</code>
       * @return The instanceIdentifier.
       */
      @java.lang.Override
      public int getInstanceIdentifier() {
        return instanceIdentifier_;
      }
      /**
       * <pre>
       * Instance Identifier for cases when RPD creates multiple instances
       * </pre>
       *
       * <code>required uint32 instance_identifier = 2 [(.telemetry_options) = { ... }</code>
       * @param value The instanceIdentifier to set.
       * @return This builder for chaining.
       */
      public Builder setInstanceIdentifier(int value) {

        instanceIdentifier_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Instance Identifier for cases when RPD creates multiple instances
       * </pre>
       *
       * <code>required uint32 instance_identifier = 2 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearInstanceIdentifier() {
        bitField0_ = (bitField0_ & ~0x00000002);
        instanceIdentifier_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object counterName_ = "";
      /**
       * <pre>
       * Name of the counter. This is useful when an LSP has multiple counters.
       * When an LSP is resignalled, it is possible that a new counter is
       * created in the hardware.
       * </pre>
       *
       * <code>required string counter_name = 3 [(.telemetry_options) = { ... }</code>
       * @return Whether the counterName field is set.
       */
      public boolean hasCounterName() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Name of the counter. This is useful when an LSP has multiple counters.
       * When an LSP is resignalled, it is possible that a new counter is
       * created in the hardware.
       * </pre>
       *
       * <code>required string counter_name = 3 [(.telemetry_options) = { ... }</code>
       * @return The counterName.
       */
      public java.lang.String getCounterName() {
        java.lang.Object ref = counterName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            counterName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Name of the counter. This is useful when an LSP has multiple counters.
       * When an LSP is resignalled, it is possible that a new counter is
       * created in the hardware.
       * </pre>
       *
       * <code>required string counter_name = 3 [(.telemetry_options) = { ... }</code>
       * @return The bytes for counterName.
       */
      public com.google.protobuf.ByteString
          getCounterNameBytes() {
        java.lang.Object ref = counterName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          counterName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Name of the counter. This is useful when an LSP has multiple counters.
       * When an LSP is resignalled, it is possible that a new counter is
       * created in the hardware.
       * </pre>
       *
       * <code>required string counter_name = 3 [(.telemetry_options) = { ... }</code>
       * @param value The counterName to set.
       * @return This builder for chaining.
       */
      public Builder setCounterName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        counterName_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Name of the counter. This is useful when an LSP has multiple counters.
       * When an LSP is resignalled, it is possible that a new counter is
       * created in the hardware.
       * </pre>
       *
       * <code>required string counter_name = 3 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearCounterName() {
        counterName_ = getDefaultInstance().getCounterName();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Name of the counter. This is useful when an LSP has multiple counters.
       * When an LSP is resignalled, it is possible that a new counter is
       * created in the hardware.
       * </pre>
       *
       * <code>required string counter_name = 3 [(.telemetry_options) = { ... }</code>
       * @param value The bytes for counterName to set.
       * @return This builder for chaining.
       */
      public Builder setCounterNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        counterName_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private long packets_ ;
      /**
       * <pre>
       * The total number of packets
       * </pre>
       *
       * <code>optional uint64 packets = 4 [(.telemetry_options) = { ... }</code>
       * @return Whether the packets field is set.
       */
      @java.lang.Override
      public boolean hasPackets() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * The total number of packets
       * </pre>
       *
       * <code>optional uint64 packets = 4 [(.telemetry_options) = { ... }</code>
       * @return The packets.
       */
      @java.lang.Override
      public long getPackets() {
        return packets_;
      }
      /**
       * <pre>
       * The total number of packets
       * </pre>
       *
       * <code>optional uint64 packets = 4 [(.telemetry_options) = { ... }</code>
       * @param value The packets to set.
       * @return This builder for chaining.
       */
      public Builder setPackets(long value) {

        packets_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The total number of packets
       * </pre>
       *
       * <code>optional uint64 packets = 4 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearPackets() {
        bitField0_ = (bitField0_ & ~0x00000008);
        packets_ = 0L;
        onChanged();
        return this;
      }

      private long bytes_ ;
      /**
       * <pre>
       * The total number of bytes
       * </pre>
       *
       * <code>optional uint64 bytes = 5 [(.telemetry_options) = { ... }</code>
       * @return Whether the bytes field is set.
       */
      @java.lang.Override
      public boolean hasBytes() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       * The total number of bytes
       * </pre>
       *
       * <code>optional uint64 bytes = 5 [(.telemetry_options) = { ... }</code>
       * @return The bytes.
       */
      @java.lang.Override
      public long getBytes() {
        return bytes_;
      }
      /**
       * <pre>
       * The total number of bytes
       * </pre>
       *
       * <code>optional uint64 bytes = 5 [(.telemetry_options) = { ... }</code>
       * @param value The bytes to set.
       * @return This builder for chaining.
       */
      public Builder setBytes(long value) {

        bytes_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The total number of bytes
       * </pre>
       *
       * <code>optional uint64 bytes = 5 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearBytes() {
        bitField0_ = (bitField0_ & ~0x00000010);
        bytes_ = 0L;
        onChanged();
        return this;
      }

      private long packetRate_ ;
      /**
       * <pre>
       * Packet rate computed over the most recent 3 second interval
       * </pre>
       *
       * <code>optional uint64 packet_rate = 6;</code>
       * @return Whether the packetRate field is set.
       */
      @java.lang.Override
      public boolean hasPacketRate() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <pre>
       * Packet rate computed over the most recent 3 second interval
       * </pre>
       *
       * <code>optional uint64 packet_rate = 6;</code>
       * @return The packetRate.
       */
      @java.lang.Override
      public long getPacketRate() {
        return packetRate_;
      }
      /**
       * <pre>
       * Packet rate computed over the most recent 3 second interval
       * </pre>
       *
       * <code>optional uint64 packet_rate = 6;</code>
       * @param value The packetRate to set.
       * @return This builder for chaining.
       */
      public Builder setPacketRate(long value) {

        packetRate_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Packet rate computed over the most recent 3 second interval
       * </pre>
       *
       * <code>optional uint64 packet_rate = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearPacketRate() {
        bitField0_ = (bitField0_ & ~0x00000020);
        packetRate_ = 0L;
        onChanged();
        return this;
      }

      private long byteRate_ ;
      /**
       * <pre>
       * Byte rate computed over the most recent 3 second interval
       * </pre>
       *
       * <code>optional uint64 byte_rate = 7;</code>
       * @return Whether the byteRate field is set.
       */
      @java.lang.Override
      public boolean hasByteRate() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <pre>
       * Byte rate computed over the most recent 3 second interval
       * </pre>
       *
       * <code>optional uint64 byte_rate = 7;</code>
       * @return The byteRate.
       */
      @java.lang.Override
      public long getByteRate() {
        return byteRate_;
      }
      /**
       * <pre>
       * Byte rate computed over the most recent 3 second interval
       * </pre>
       *
       * <code>optional uint64 byte_rate = 7;</code>
       * @param value The byteRate to set.
       * @return This builder for chaining.
       */
      public Builder setByteRate(long value) {

        byteRate_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Byte rate computed over the most recent 3 second interval
       * </pre>
       *
       * <code>optional uint64 byte_rate = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearByteRate() {
        bitField0_ = (bitField0_ & ~0x00000040);
        byteRate_ = 0L;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:LspStatsRecord)
    }

    // @@protoc_insertion_point(class_scope:LspStatsRecord)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<LspStatsRecord>
        PARSER = new com.google.protobuf.AbstractParser<LspStatsRecord>() {
      @java.lang.Override
      public LspStatsRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<LspStatsRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LspStatsRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStatsRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int JNPR_LSP_STATISTICS_EXT_FIELD_NUMBER = 5;
  /**
   * <code>extend .JuniperNetworksSensors { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors,
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats> jnprLspStatisticsExt = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats.class,
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LspStatsOuterClass.LspStats.getDefaultInstance());
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LspStats_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LspStats_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LspStatsRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LspStatsRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017lsp_stats.proto\032\023telemetry_top.proto\"6" +
      "\n\010LspStats\022*\n\021lsp_stats_records\030\001 \003(\0132\017." +
      "LspStatsRecord\"\274\001\n\016LspStatsRecord\022\023\n\004nam" +
      "e\030\001 \002(\tB\005\202@\002\010\001\022\"\n\023instance_identifier\030\002 " +
      "\002(\rB\005\202@\002\010\001\022\033\n\014counter_name\030\003 \002(\tB\005\202@\002\010\001\022" +
      "\026\n\007packets\030\004 \001(\004B\005\202@\002\030\001\022\024\n\005bytes\030\005 \001(\004B\005" +
      "\202@\002\030\001\022\023\n\013packet_rate\030\006 \001(\004\022\021\n\tbyte_rate\030" +
      "\007 \001(\004:C\n\027jnpr_lsp_statistics_ext\022\027.Junip" +
      "erNetworksSensors\030\005 \001(\0132\t.LspStatsB:\n8or" +
      "g.opennms.netmgt.telemetry.protocols.jti" +
      ".adapter.proto"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.getDescriptor(),
        });
    internal_static_LspStats_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LspStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LspStats_descriptor,
        new java.lang.String[] { "LspStatsRecords", });
    internal_static_LspStatsRecord_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_LspStatsRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LspStatsRecord_descriptor,
        new java.lang.String[] { "Name", "InstanceIdentifier", "CounterName", "Packets", "Bytes", "PacketRate", "ByteRate", });
    jnprLspStatisticsExt.internalInit(descriptor.getExtensions().get(0));
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.telemetryOptions);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
