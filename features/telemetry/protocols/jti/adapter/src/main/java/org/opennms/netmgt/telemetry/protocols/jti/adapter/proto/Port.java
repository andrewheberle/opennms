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
package org.opennms.netmgt.telemetry.protocols.jti.adapter.proto;

public final class Port {
  private Port() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.jnprInterfaceExt);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GPortOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GPort)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .InterfaceInfos interface_stats = 1;</code>
     */
    java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos> 
        getInterfaceStatsList();
    /**
     * <code>repeated .InterfaceInfos interface_stats = 1;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos getInterfaceStats(int index);
    /**
     * <code>repeated .InterfaceInfos interface_stats = 1;</code>
     */
    int getInterfaceStatsCount();
    /**
     * <code>repeated .InterfaceInfos interface_stats = 1;</code>
     */
    java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfosOrBuilder> 
        getInterfaceStatsOrBuilderList();
    /**
     * <code>repeated .InterfaceInfos interface_stats = 1;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfosOrBuilder getInterfaceStatsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code GPort}
   */
  public static final class GPort extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GPort)
      GPortOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GPort.newBuilder() to construct.
    private GPort(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GPort() {
      interfaceStats_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GPort();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_GPort_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_GPort_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort.Builder.class);
    }

    public static final int INTERFACE_STATS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos> interfaceStats_;
    /**
     * <code>repeated .InterfaceInfos interface_stats = 1;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos> getInterfaceStatsList() {
      return interfaceStats_;
    }
    /**
     * <code>repeated .InterfaceInfos interface_stats = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfosOrBuilder> 
        getInterfaceStatsOrBuilderList() {
      return interfaceStats_;
    }
    /**
     * <code>repeated .InterfaceInfos interface_stats = 1;</code>
     */
    @java.lang.Override
    public int getInterfaceStatsCount() {
      return interfaceStats_.size();
    }
    /**
     * <code>repeated .InterfaceInfos interface_stats = 1;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos getInterfaceStats(int index) {
      return interfaceStats_.get(index);
    }
    /**
     * <code>repeated .InterfaceInfos interface_stats = 1;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfosOrBuilder getInterfaceStatsOrBuilder(
        int index) {
      return interfaceStats_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getInterfaceStatsCount(); i++) {
        if (!getInterfaceStats(i).isInitialized()) {
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
      for (int i = 0; i < interfaceStats_.size(); i++) {
        output.writeMessage(1, interfaceStats_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < interfaceStats_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, interfaceStats_.get(i));
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
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort) obj;

      if (!getInterfaceStatsList()
          .equals(other.getInterfaceStatsList())) return false;
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
      if (getInterfaceStatsCount() > 0) {
        hash = (37 * hash) + INTERFACE_STATS_FIELD_NUMBER;
        hash = (53 * hash) + getInterfaceStatsList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort prototype) {
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
     * Protobuf type {@code GPort}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GPort)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPortOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_GPort_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_GPort_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort.newBuilder()
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
        if (interfaceStatsBuilder_ == null) {
          interfaceStats_ = java.util.Collections.emptyList();
        } else {
          interfaceStats_ = null;
          interfaceStatsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_GPort_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort result) {
        if (interfaceStatsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            interfaceStats_ = java.util.Collections.unmodifiableList(interfaceStats_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.interfaceStats_ = interfaceStats_;
        } else {
          result.interfaceStats_ = interfaceStatsBuilder_.build();
        }
      }

      private void buildPartial0(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort result) {
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort.getDefaultInstance()) return this;
        if (interfaceStatsBuilder_ == null) {
          if (!other.interfaceStats_.isEmpty()) {
            if (interfaceStats_.isEmpty()) {
              interfaceStats_ = other.interfaceStats_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureInterfaceStatsIsMutable();
              interfaceStats_.addAll(other.interfaceStats_);
            }
            onChanged();
          }
        } else {
          if (!other.interfaceStats_.isEmpty()) {
            if (interfaceStatsBuilder_.isEmpty()) {
              interfaceStatsBuilder_.dispose();
              interfaceStatsBuilder_ = null;
              interfaceStats_ = other.interfaceStats_;
              bitField0_ = (bitField0_ & ~0x00000001);
              interfaceStatsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getInterfaceStatsFieldBuilder() : null;
            } else {
              interfaceStatsBuilder_.addAllMessages(other.interfaceStats_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getInterfaceStatsCount(); i++) {
          if (!getInterfaceStats(i).isInitialized()) {
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
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos m =
                    input.readMessage(
                        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.PARSER,
                        extensionRegistry);
                if (interfaceStatsBuilder_ == null) {
                  ensureInterfaceStatsIsMutable();
                  interfaceStats_.add(m);
                } else {
                  interfaceStatsBuilder_.addMessage(m);
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

      private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos> interfaceStats_ =
        java.util.Collections.emptyList();
      private void ensureInterfaceStatsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          interfaceStats_ = new java.util.ArrayList<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos>(interfaceStats_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfosOrBuilder> interfaceStatsBuilder_;

      /**
       * <code>repeated .InterfaceInfos interface_stats = 1;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos> getInterfaceStatsList() {
        if (interfaceStatsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(interfaceStats_);
        } else {
          return interfaceStatsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .InterfaceInfos interface_stats = 1;</code>
       */
      public int getInterfaceStatsCount() {
        if (interfaceStatsBuilder_ == null) {
          return interfaceStats_.size();
        } else {
          return interfaceStatsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .InterfaceInfos interface_stats = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos getInterfaceStats(int index) {
        if (interfaceStatsBuilder_ == null) {
          return interfaceStats_.get(index);
        } else {
          return interfaceStatsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .InterfaceInfos interface_stats = 1;</code>
       */
      public Builder setInterfaceStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos value) {
        if (interfaceStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInterfaceStatsIsMutable();
          interfaceStats_.set(index, value);
          onChanged();
        } else {
          interfaceStatsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .InterfaceInfos interface_stats = 1;</code>
       */
      public Builder setInterfaceStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.Builder builderForValue) {
        if (interfaceStatsBuilder_ == null) {
          ensureInterfaceStatsIsMutable();
          interfaceStats_.set(index, builderForValue.build());
          onChanged();
        } else {
          interfaceStatsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InterfaceInfos interface_stats = 1;</code>
       */
      public Builder addInterfaceStats(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos value) {
        if (interfaceStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInterfaceStatsIsMutable();
          interfaceStats_.add(value);
          onChanged();
        } else {
          interfaceStatsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .InterfaceInfos interface_stats = 1;</code>
       */
      public Builder addInterfaceStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos value) {
        if (interfaceStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInterfaceStatsIsMutable();
          interfaceStats_.add(index, value);
          onChanged();
        } else {
          interfaceStatsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .InterfaceInfos interface_stats = 1;</code>
       */
      public Builder addInterfaceStats(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.Builder builderForValue) {
        if (interfaceStatsBuilder_ == null) {
          ensureInterfaceStatsIsMutable();
          interfaceStats_.add(builderForValue.build());
          onChanged();
        } else {
          interfaceStatsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InterfaceInfos interface_stats = 1;</code>
       */
      public Builder addInterfaceStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.Builder builderForValue) {
        if (interfaceStatsBuilder_ == null) {
          ensureInterfaceStatsIsMutable();
          interfaceStats_.add(index, builderForValue.build());
          onChanged();
        } else {
          interfaceStatsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InterfaceInfos interface_stats = 1;</code>
       */
      public Builder addAllInterfaceStats(
          java.lang.Iterable<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos> values) {
        if (interfaceStatsBuilder_ == null) {
          ensureInterfaceStatsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, interfaceStats_);
          onChanged();
        } else {
          interfaceStatsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .InterfaceInfos interface_stats = 1;</code>
       */
      public Builder clearInterfaceStats() {
        if (interfaceStatsBuilder_ == null) {
          interfaceStats_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          interfaceStatsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .InterfaceInfos interface_stats = 1;</code>
       */
      public Builder removeInterfaceStats(int index) {
        if (interfaceStatsBuilder_ == null) {
          ensureInterfaceStatsIsMutable();
          interfaceStats_.remove(index);
          onChanged();
        } else {
          interfaceStatsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .InterfaceInfos interface_stats = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.Builder getInterfaceStatsBuilder(
          int index) {
        return getInterfaceStatsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .InterfaceInfos interface_stats = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfosOrBuilder getInterfaceStatsOrBuilder(
          int index) {
        if (interfaceStatsBuilder_ == null) {
          return interfaceStats_.get(index);  } else {
          return interfaceStatsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .InterfaceInfos interface_stats = 1;</code>
       */
      public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfosOrBuilder> 
           getInterfaceStatsOrBuilderList() {
        if (interfaceStatsBuilder_ != null) {
          return interfaceStatsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(interfaceStats_);
        }
      }
      /**
       * <code>repeated .InterfaceInfos interface_stats = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.Builder addInterfaceStatsBuilder() {
        return getInterfaceStatsFieldBuilder().addBuilder(
            org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.getDefaultInstance());
      }
      /**
       * <code>repeated .InterfaceInfos interface_stats = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.Builder addInterfaceStatsBuilder(
          int index) {
        return getInterfaceStatsFieldBuilder().addBuilder(
            index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.getDefaultInstance());
      }
      /**
       * <code>repeated .InterfaceInfos interface_stats = 1;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.Builder> 
           getInterfaceStatsBuilderList() {
        return getInterfaceStatsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfosOrBuilder> 
          getInterfaceStatsFieldBuilder() {
        if (interfaceStatsBuilder_ == null) {
          interfaceStatsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfosOrBuilder>(
                  interfaceStats_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          interfaceStats_ = null;
        }
        return interfaceStatsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GPort)
    }

    // @@protoc_insertion_point(class_scope:GPort)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<GPort>
        PARSER = new com.google.protobuf.AbstractParser<GPort>() {
      @java.lang.Override
      public GPort parsePartialFrom(
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

    public static com.google.protobuf.Parser<GPort> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GPort> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface InterfaceInfosOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InterfaceInfos)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * e.g., xe-0/0/0
     * </pre>
     *
     * <code>required string if_name = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifName field is set.
     */
    boolean hasIfName();
    /**
     * <pre>
     * e.g., xe-0/0/0
     * </pre>
     *
     * <code>required string if_name = 1 [(.telemetry_options) = { ... }</code>
     * @return The ifName.
     */
    java.lang.String getIfName();
    /**
     * <pre>
     * e.g., xe-0/0/0
     * </pre>
     *
     * <code>required string if_name = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for ifName.
     */
    com.google.protobuf.ByteString
        getIfNameBytes();

    /**
     * <pre>
     * time when if/stats last reset
     * </pre>
     *
     * <code>required uint64 init_time = 2;</code>
     * @return Whether the initTime field is set.
     */
    boolean hasInitTime();
    /**
     * <pre>
     * time when if/stats last reset
     * </pre>
     *
     * <code>required uint64 init_time = 2;</code>
     * @return The initTime.
     */
    long getInitTime();

    /**
     * <pre>
     * Global Index
     * </pre>
     *
     * <code>optional uint32 snmp_if_index = 3;</code>
     * @return Whether the snmpIfIndex field is set.
     */
    boolean hasSnmpIfIndex();
    /**
     * <pre>
     * Global Index
     * </pre>
     *
     * <code>optional uint32 snmp_if_index = 3;</code>
     * @return The snmpIfIndex.
     */
    int getSnmpIfIndex();

    /**
     * <pre>
     * name of parent for ae interface, if applicable
     * </pre>
     *
     * <code>optional string parent_ae_name = 4;</code>
     * @return Whether the parentAeName field is set.
     */
    boolean hasParentAeName();
    /**
     * <pre>
     * name of parent for ae interface, if applicable
     * </pre>
     *
     * <code>optional string parent_ae_name = 4;</code>
     * @return The parentAeName.
     */
    java.lang.String getParentAeName();
    /**
     * <pre>
     * name of parent for ae interface, if applicable
     * </pre>
     *
     * <code>optional string parent_ae_name = 4;</code>
     * @return The bytes for parentAeName.
     */
    com.google.protobuf.ByteString
        getParentAeNameBytes();

    /**
     * <pre>
     * egress queue information
     * </pre>
     *
     * <code>repeated .QueueStats egress_queue_info = 5;</code>
     */
    java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats> 
        getEgressQueueInfoList();
    /**
     * <pre>
     * egress queue information
     * </pre>
     *
     * <code>repeated .QueueStats egress_queue_info = 5;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats getEgressQueueInfo(int index);
    /**
     * <pre>
     * egress queue information
     * </pre>
     *
     * <code>repeated .QueueStats egress_queue_info = 5;</code>
     */
    int getEgressQueueInfoCount();
    /**
     * <pre>
     * egress queue information
     * </pre>
     *
     * <code>repeated .QueueStats egress_queue_info = 5;</code>
     */
    java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder> 
        getEgressQueueInfoOrBuilderList();
    /**
     * <pre>
     * egress queue information
     * </pre>
     *
     * <code>repeated .QueueStats egress_queue_info = 5;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder getEgressQueueInfoOrBuilder(
        int index);

    /**
     * <pre>
     * ingress queue information
     * </pre>
     *
     * <code>repeated .QueueStats ingress_queue_info = 6;</code>
     */
    java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats> 
        getIngressQueueInfoList();
    /**
     * <pre>
     * ingress queue information
     * </pre>
     *
     * <code>repeated .QueueStats ingress_queue_info = 6;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats getIngressQueueInfo(int index);
    /**
     * <pre>
     * ingress queue information
     * </pre>
     *
     * <code>repeated .QueueStats ingress_queue_info = 6;</code>
     */
    int getIngressQueueInfoCount();
    /**
     * <pre>
     * ingress queue information
     * </pre>
     *
     * <code>repeated .QueueStats ingress_queue_info = 6;</code>
     */
    java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder> 
        getIngressQueueInfoOrBuilderList();
    /**
     * <pre>
     * ingress queue information
     * </pre>
     *
     * <code>repeated .QueueStats ingress_queue_info = 6;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder getIngressQueueInfoOrBuilder(
        int index);

    /**
     * <pre>
     * inbound traffic stats
     * </pre>
     *
     * <code>optional .InterfaceStats ingress_stats = 7;</code>
     * @return Whether the ingressStats field is set.
     */
    boolean hasIngressStats();
    /**
     * <pre>
     * inbound traffic stats
     * </pre>
     *
     * <code>optional .InterfaceStats ingress_stats = 7;</code>
     * @return The ingressStats.
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats getIngressStats();
    /**
     * <pre>
     * inbound traffic stats
     * </pre>
     *
     * <code>optional .InterfaceStats ingress_stats = 7;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStatsOrBuilder getIngressStatsOrBuilder();

    /**
     * <pre>
     * outbound traffic stats
     * </pre>
     *
     * <code>optional .InterfaceStats egress_stats = 8;</code>
     * @return Whether the egressStats field is set.
     */
    boolean hasEgressStats();
    /**
     * <pre>
     * outbound traffic stats
     * </pre>
     *
     * <code>optional .InterfaceStats egress_stats = 8;</code>
     * @return The egressStats.
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats getEgressStats();
    /**
     * <pre>
     * outbound traffic stats
     * </pre>
     *
     * <code>optional .InterfaceStats egress_stats = 8;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStatsOrBuilder getEgressStatsOrBuilder();

    /**
     * <pre>
     * inbound traffic errors
     * </pre>
     *
     * <code>optional .IngressInterfaceErrors ingress_errors = 9;</code>
     * @return Whether the ingressErrors field is set.
     */
    boolean hasIngressErrors();
    /**
     * <pre>
     * inbound traffic errors
     * </pre>
     *
     * <code>optional .IngressInterfaceErrors ingress_errors = 9;</code>
     * @return The ingressErrors.
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors getIngressErrors();
    /**
     * <pre>
     * inbound traffic errors
     * </pre>
     *
     * <code>optional .IngressInterfaceErrors ingress_errors = 9;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrorsOrBuilder getIngressErrorsOrBuilder();
  }
  /**
   * Protobuf type {@code InterfaceInfos}
   */
  public static final class InterfaceInfos extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InterfaceInfos)
      InterfaceInfosOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InterfaceInfos.newBuilder() to construct.
    private InterfaceInfos(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InterfaceInfos() {
      ifName_ = "";
      parentAeName_ = "";
      egressQueueInfo_ = java.util.Collections.emptyList();
      ingressQueueInfo_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InterfaceInfos();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_InterfaceInfos_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_InterfaceInfos_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.Builder.class);
    }

    private int bitField0_;
    public static final int IF_NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object ifName_ = "";
    /**
     * <pre>
     * e.g., xe-0/0/0
     * </pre>
     *
     * <code>required string if_name = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifName field is set.
     */
    @java.lang.Override
    public boolean hasIfName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * e.g., xe-0/0/0
     * </pre>
     *
     * <code>required string if_name = 1 [(.telemetry_options) = { ... }</code>
     * @return The ifName.
     */
    @java.lang.Override
    public java.lang.String getIfName() {
      java.lang.Object ref = ifName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ifName_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * e.g., xe-0/0/0
     * </pre>
     *
     * <code>required string if_name = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for ifName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIfNameBytes() {
      java.lang.Object ref = ifName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ifName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int INIT_TIME_FIELD_NUMBER = 2;
    private long initTime_ = 0L;
    /**
     * <pre>
     * time when if/stats last reset
     * </pre>
     *
     * <code>required uint64 init_time = 2;</code>
     * @return Whether the initTime field is set.
     */
    @java.lang.Override
    public boolean hasInitTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * time when if/stats last reset
     * </pre>
     *
     * <code>required uint64 init_time = 2;</code>
     * @return The initTime.
     */
    @java.lang.Override
    public long getInitTime() {
      return initTime_;
    }

    public static final int SNMP_IF_INDEX_FIELD_NUMBER = 3;
    private int snmpIfIndex_ = 0;
    /**
     * <pre>
     * Global Index
     * </pre>
     *
     * <code>optional uint32 snmp_if_index = 3;</code>
     * @return Whether the snmpIfIndex field is set.
     */
    @java.lang.Override
    public boolean hasSnmpIfIndex() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Global Index
     * </pre>
     *
     * <code>optional uint32 snmp_if_index = 3;</code>
     * @return The snmpIfIndex.
     */
    @java.lang.Override
    public int getSnmpIfIndex() {
      return snmpIfIndex_;
    }

    public static final int PARENT_AE_NAME_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object parentAeName_ = "";
    /**
     * <pre>
     * name of parent for ae interface, if applicable
     * </pre>
     *
     * <code>optional string parent_ae_name = 4;</code>
     * @return Whether the parentAeName field is set.
     */
    @java.lang.Override
    public boolean hasParentAeName() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * name of parent for ae interface, if applicable
     * </pre>
     *
     * <code>optional string parent_ae_name = 4;</code>
     * @return The parentAeName.
     */
    @java.lang.Override
    public java.lang.String getParentAeName() {
      java.lang.Object ref = parentAeName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          parentAeName_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * name of parent for ae interface, if applicable
     * </pre>
     *
     * <code>optional string parent_ae_name = 4;</code>
     * @return The bytes for parentAeName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getParentAeNameBytes() {
      java.lang.Object ref = parentAeName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parentAeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EGRESS_QUEUE_INFO_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats> egressQueueInfo_;
    /**
     * <pre>
     * egress queue information
     * </pre>
     *
     * <code>repeated .QueueStats egress_queue_info = 5;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats> getEgressQueueInfoList() {
      return egressQueueInfo_;
    }
    /**
     * <pre>
     * egress queue information
     * </pre>
     *
     * <code>repeated .QueueStats egress_queue_info = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder> 
        getEgressQueueInfoOrBuilderList() {
      return egressQueueInfo_;
    }
    /**
     * <pre>
     * egress queue information
     * </pre>
     *
     * <code>repeated .QueueStats egress_queue_info = 5;</code>
     */
    @java.lang.Override
    public int getEgressQueueInfoCount() {
      return egressQueueInfo_.size();
    }
    /**
     * <pre>
     * egress queue information
     * </pre>
     *
     * <code>repeated .QueueStats egress_queue_info = 5;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats getEgressQueueInfo(int index) {
      return egressQueueInfo_.get(index);
    }
    /**
     * <pre>
     * egress queue information
     * </pre>
     *
     * <code>repeated .QueueStats egress_queue_info = 5;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder getEgressQueueInfoOrBuilder(
        int index) {
      return egressQueueInfo_.get(index);
    }

    public static final int INGRESS_QUEUE_INFO_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats> ingressQueueInfo_;
    /**
     * <pre>
     * ingress queue information
     * </pre>
     *
     * <code>repeated .QueueStats ingress_queue_info = 6;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats> getIngressQueueInfoList() {
      return ingressQueueInfo_;
    }
    /**
     * <pre>
     * ingress queue information
     * </pre>
     *
     * <code>repeated .QueueStats ingress_queue_info = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder> 
        getIngressQueueInfoOrBuilderList() {
      return ingressQueueInfo_;
    }
    /**
     * <pre>
     * ingress queue information
     * </pre>
     *
     * <code>repeated .QueueStats ingress_queue_info = 6;</code>
     */
    @java.lang.Override
    public int getIngressQueueInfoCount() {
      return ingressQueueInfo_.size();
    }
    /**
     * <pre>
     * ingress queue information
     * </pre>
     *
     * <code>repeated .QueueStats ingress_queue_info = 6;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats getIngressQueueInfo(int index) {
      return ingressQueueInfo_.get(index);
    }
    /**
     * <pre>
     * ingress queue information
     * </pre>
     *
     * <code>repeated .QueueStats ingress_queue_info = 6;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder getIngressQueueInfoOrBuilder(
        int index) {
      return ingressQueueInfo_.get(index);
    }

    public static final int INGRESS_STATS_FIELD_NUMBER = 7;
    private org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats ingressStats_;
    /**
     * <pre>
     * inbound traffic stats
     * </pre>
     *
     * <code>optional .InterfaceStats ingress_stats = 7;</code>
     * @return Whether the ingressStats field is set.
     */
    @java.lang.Override
    public boolean hasIngressStats() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * inbound traffic stats
     * </pre>
     *
     * <code>optional .InterfaceStats ingress_stats = 7;</code>
     * @return The ingressStats.
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats getIngressStats() {
      return ingressStats_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.getDefaultInstance() : ingressStats_;
    }
    /**
     * <pre>
     * inbound traffic stats
     * </pre>
     *
     * <code>optional .InterfaceStats ingress_stats = 7;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStatsOrBuilder getIngressStatsOrBuilder() {
      return ingressStats_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.getDefaultInstance() : ingressStats_;
    }

    public static final int EGRESS_STATS_FIELD_NUMBER = 8;
    private org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats egressStats_;
    /**
     * <pre>
     * outbound traffic stats
     * </pre>
     *
     * <code>optional .InterfaceStats egress_stats = 8;</code>
     * @return Whether the egressStats field is set.
     */
    @java.lang.Override
    public boolean hasEgressStats() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * outbound traffic stats
     * </pre>
     *
     * <code>optional .InterfaceStats egress_stats = 8;</code>
     * @return The egressStats.
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats getEgressStats() {
      return egressStats_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.getDefaultInstance() : egressStats_;
    }
    /**
     * <pre>
     * outbound traffic stats
     * </pre>
     *
     * <code>optional .InterfaceStats egress_stats = 8;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStatsOrBuilder getEgressStatsOrBuilder() {
      return egressStats_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.getDefaultInstance() : egressStats_;
    }

    public static final int INGRESS_ERRORS_FIELD_NUMBER = 9;
    private org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors ingressErrors_;
    /**
     * <pre>
     * inbound traffic errors
     * </pre>
     *
     * <code>optional .IngressInterfaceErrors ingress_errors = 9;</code>
     * @return Whether the ingressErrors field is set.
     */
    @java.lang.Override
    public boolean hasIngressErrors() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <pre>
     * inbound traffic errors
     * </pre>
     *
     * <code>optional .IngressInterfaceErrors ingress_errors = 9;</code>
     * @return The ingressErrors.
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors getIngressErrors() {
      return ingressErrors_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors.getDefaultInstance() : ingressErrors_;
    }
    /**
     * <pre>
     * inbound traffic errors
     * </pre>
     *
     * <code>optional .IngressInterfaceErrors ingress_errors = 9;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrorsOrBuilder getIngressErrorsOrBuilder() {
      return ingressErrors_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors.getDefaultInstance() : ingressErrors_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasIfName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasInitTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasIngressStats()) {
        if (!getIngressStats().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasEgressStats()) {
        if (!getEgressStats().isInitialized()) {
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
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ifName_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, initTime_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt32(3, snmpIfIndex_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, parentAeName_);
      }
      for (int i = 0; i < egressQueueInfo_.size(); i++) {
        output.writeMessage(5, egressQueueInfo_.get(i));
      }
      for (int i = 0; i < ingressQueueInfo_.size(); i++) {
        output.writeMessage(6, ingressQueueInfo_.get(i));
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeMessage(7, getIngressStats());
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeMessage(8, getEgressStats());
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeMessage(9, getIngressErrors());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ifName_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, initTime_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, snmpIfIndex_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, parentAeName_);
      }
      for (int i = 0; i < egressQueueInfo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, egressQueueInfo_.get(i));
      }
      for (int i = 0; i < ingressQueueInfo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, ingressQueueInfo_.get(i));
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getIngressStats());
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getEgressStats());
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getIngressErrors());
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
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos) obj;

      if (hasIfName() != other.hasIfName()) return false;
      if (hasIfName()) {
        if (!getIfName()
            .equals(other.getIfName())) return false;
      }
      if (hasInitTime() != other.hasInitTime()) return false;
      if (hasInitTime()) {
        if (getInitTime()
            != other.getInitTime()) return false;
      }
      if (hasSnmpIfIndex() != other.hasSnmpIfIndex()) return false;
      if (hasSnmpIfIndex()) {
        if (getSnmpIfIndex()
            != other.getSnmpIfIndex()) return false;
      }
      if (hasParentAeName() != other.hasParentAeName()) return false;
      if (hasParentAeName()) {
        if (!getParentAeName()
            .equals(other.getParentAeName())) return false;
      }
      if (!getEgressQueueInfoList()
          .equals(other.getEgressQueueInfoList())) return false;
      if (!getIngressQueueInfoList()
          .equals(other.getIngressQueueInfoList())) return false;
      if (hasIngressStats() != other.hasIngressStats()) return false;
      if (hasIngressStats()) {
        if (!getIngressStats()
            .equals(other.getIngressStats())) return false;
      }
      if (hasEgressStats() != other.hasEgressStats()) return false;
      if (hasEgressStats()) {
        if (!getEgressStats()
            .equals(other.getEgressStats())) return false;
      }
      if (hasIngressErrors() != other.hasIngressErrors()) return false;
      if (hasIngressErrors()) {
        if (!getIngressErrors()
            .equals(other.getIngressErrors())) return false;
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
      if (hasIfName()) {
        hash = (37 * hash) + IF_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getIfName().hashCode();
      }
      if (hasInitTime()) {
        hash = (37 * hash) + INIT_TIME_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getInitTime());
      }
      if (hasSnmpIfIndex()) {
        hash = (37 * hash) + SNMP_IF_INDEX_FIELD_NUMBER;
        hash = (53 * hash) + getSnmpIfIndex();
      }
      if (hasParentAeName()) {
        hash = (37 * hash) + PARENT_AE_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getParentAeName().hashCode();
      }
      if (getEgressQueueInfoCount() > 0) {
        hash = (37 * hash) + EGRESS_QUEUE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getEgressQueueInfoList().hashCode();
      }
      if (getIngressQueueInfoCount() > 0) {
        hash = (37 * hash) + INGRESS_QUEUE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getIngressQueueInfoList().hashCode();
      }
      if (hasIngressStats()) {
        hash = (37 * hash) + INGRESS_STATS_FIELD_NUMBER;
        hash = (53 * hash) + getIngressStats().hashCode();
      }
      if (hasEgressStats()) {
        hash = (37 * hash) + EGRESS_STATS_FIELD_NUMBER;
        hash = (53 * hash) + getEgressStats().hashCode();
      }
      if (hasIngressErrors()) {
        hash = (37 * hash) + INGRESS_ERRORS_FIELD_NUMBER;
        hash = (53 * hash) + getIngressErrors().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos prototype) {
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
     * Protobuf type {@code InterfaceInfos}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InterfaceInfos)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfosOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_InterfaceInfos_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_InterfaceInfos_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getEgressQueueInfoFieldBuilder();
          getIngressQueueInfoFieldBuilder();
          getIngressStatsFieldBuilder();
          getEgressStatsFieldBuilder();
          getIngressErrorsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        ifName_ = "";
        initTime_ = 0L;
        snmpIfIndex_ = 0;
        parentAeName_ = "";
        if (egressQueueInfoBuilder_ == null) {
          egressQueueInfo_ = java.util.Collections.emptyList();
        } else {
          egressQueueInfo_ = null;
          egressQueueInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        if (ingressQueueInfoBuilder_ == null) {
          ingressQueueInfo_ = java.util.Collections.emptyList();
        } else {
          ingressQueueInfo_ = null;
          ingressQueueInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        ingressStats_ = null;
        if (ingressStatsBuilder_ != null) {
          ingressStatsBuilder_.dispose();
          ingressStatsBuilder_ = null;
        }
        egressStats_ = null;
        if (egressStatsBuilder_ != null) {
          egressStatsBuilder_.dispose();
          egressStatsBuilder_ = null;
        }
        ingressErrors_ = null;
        if (ingressErrorsBuilder_ != null) {
          ingressErrorsBuilder_.dispose();
          ingressErrorsBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_InterfaceInfos_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos result) {
        if (egressQueueInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0)) {
            egressQueueInfo_ = java.util.Collections.unmodifiableList(egressQueueInfo_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.egressQueueInfo_ = egressQueueInfo_;
        } else {
          result.egressQueueInfo_ = egressQueueInfoBuilder_.build();
        }
        if (ingressQueueInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000020) != 0)) {
            ingressQueueInfo_ = java.util.Collections.unmodifiableList(ingressQueueInfo_);
            bitField0_ = (bitField0_ & ~0x00000020);
          }
          result.ingressQueueInfo_ = ingressQueueInfo_;
        } else {
          result.ingressQueueInfo_ = ingressQueueInfoBuilder_.build();
        }
      }

      private void buildPartial0(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.ifName_ = ifName_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.initTime_ = initTime_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.snmpIfIndex_ = snmpIfIndex_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.parentAeName_ = parentAeName_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.ingressStats_ = ingressStatsBuilder_ == null
              ? ingressStats_
              : ingressStatsBuilder_.build();
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000080) != 0)) {
          result.egressStats_ = egressStatsBuilder_ == null
              ? egressStats_
              : egressStatsBuilder_.build();
          to_bitField0_ |= 0x00000020;
        }
        if (((from_bitField0_ & 0x00000100) != 0)) {
          result.ingressErrors_ = ingressErrorsBuilder_ == null
              ? ingressErrors_
              : ingressErrorsBuilder_.build();
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos.getDefaultInstance()) return this;
        if (other.hasIfName()) {
          ifName_ = other.ifName_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasInitTime()) {
          setInitTime(other.getInitTime());
        }
        if (other.hasSnmpIfIndex()) {
          setSnmpIfIndex(other.getSnmpIfIndex());
        }
        if (other.hasParentAeName()) {
          parentAeName_ = other.parentAeName_;
          bitField0_ |= 0x00000008;
          onChanged();
        }
        if (egressQueueInfoBuilder_ == null) {
          if (!other.egressQueueInfo_.isEmpty()) {
            if (egressQueueInfo_.isEmpty()) {
              egressQueueInfo_ = other.egressQueueInfo_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureEgressQueueInfoIsMutable();
              egressQueueInfo_.addAll(other.egressQueueInfo_);
            }
            onChanged();
          }
        } else {
          if (!other.egressQueueInfo_.isEmpty()) {
            if (egressQueueInfoBuilder_.isEmpty()) {
              egressQueueInfoBuilder_.dispose();
              egressQueueInfoBuilder_ = null;
              egressQueueInfo_ = other.egressQueueInfo_;
              bitField0_ = (bitField0_ & ~0x00000010);
              egressQueueInfoBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEgressQueueInfoFieldBuilder() : null;
            } else {
              egressQueueInfoBuilder_.addAllMessages(other.egressQueueInfo_);
            }
          }
        }
        if (ingressQueueInfoBuilder_ == null) {
          if (!other.ingressQueueInfo_.isEmpty()) {
            if (ingressQueueInfo_.isEmpty()) {
              ingressQueueInfo_ = other.ingressQueueInfo_;
              bitField0_ = (bitField0_ & ~0x00000020);
            } else {
              ensureIngressQueueInfoIsMutable();
              ingressQueueInfo_.addAll(other.ingressQueueInfo_);
            }
            onChanged();
          }
        } else {
          if (!other.ingressQueueInfo_.isEmpty()) {
            if (ingressQueueInfoBuilder_.isEmpty()) {
              ingressQueueInfoBuilder_.dispose();
              ingressQueueInfoBuilder_ = null;
              ingressQueueInfo_ = other.ingressQueueInfo_;
              bitField0_ = (bitField0_ & ~0x00000020);
              ingressQueueInfoBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getIngressQueueInfoFieldBuilder() : null;
            } else {
              ingressQueueInfoBuilder_.addAllMessages(other.ingressQueueInfo_);
            }
          }
        }
        if (other.hasIngressStats()) {
          mergeIngressStats(other.getIngressStats());
        }
        if (other.hasEgressStats()) {
          mergeEgressStats(other.getEgressStats());
        }
        if (other.hasIngressErrors()) {
          mergeIngressErrors(other.getIngressErrors());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasIfName()) {
          return false;
        }
        if (!hasInitTime()) {
          return false;
        }
        if (hasIngressStats()) {
          if (!getIngressStats().isInitialized()) {
            return false;
          }
        }
        if (hasEgressStats()) {
          if (!getEgressStats().isInitialized()) {
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
                ifName_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                initTime_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                snmpIfIndex_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 34: {
                parentAeName_ = input.readBytes();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              case 42: {
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats m =
                    input.readMessage(
                        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.PARSER,
                        extensionRegistry);
                if (egressQueueInfoBuilder_ == null) {
                  ensureEgressQueueInfoIsMutable();
                  egressQueueInfo_.add(m);
                } else {
                  egressQueueInfoBuilder_.addMessage(m);
                }
                break;
              } // case 42
              case 50: {
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats m =
                    input.readMessage(
                        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.PARSER,
                        extensionRegistry);
                if (ingressQueueInfoBuilder_ == null) {
                  ensureIngressQueueInfoIsMutable();
                  ingressQueueInfo_.add(m);
                } else {
                  ingressQueueInfoBuilder_.addMessage(m);
                }
                break;
              } // case 50
              case 58: {
                input.readMessage(
                    getIngressStatsFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000040;
                break;
              } // case 58
              case 66: {
                input.readMessage(
                    getEgressStatsFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000080;
                break;
              } // case 66
              case 74: {
                input.readMessage(
                    getIngressErrorsFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000100;
                break;
              } // case 74
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

      private java.lang.Object ifName_ = "";
      /**
       * <pre>
       * e.g., xe-0/0/0
       * </pre>
       *
       * <code>required string if_name = 1 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifName field is set.
       */
      public boolean hasIfName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * e.g., xe-0/0/0
       * </pre>
       *
       * <code>required string if_name = 1 [(.telemetry_options) = { ... }</code>
       * @return The ifName.
       */
      public java.lang.String getIfName() {
        java.lang.Object ref = ifName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            ifName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * e.g., xe-0/0/0
       * </pre>
       *
       * <code>required string if_name = 1 [(.telemetry_options) = { ... }</code>
       * @return The bytes for ifName.
       */
      public com.google.protobuf.ByteString
          getIfNameBytes() {
        java.lang.Object ref = ifName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ifName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * e.g., xe-0/0/0
       * </pre>
       *
       * <code>required string if_name = 1 [(.telemetry_options) = { ... }</code>
       * @param value The ifName to set.
       * @return This builder for chaining.
       */
      public Builder setIfName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ifName_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * e.g., xe-0/0/0
       * </pre>
       *
       * <code>required string if_name = 1 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfName() {
        ifName_ = getDefaultInstance().getIfName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * e.g., xe-0/0/0
       * </pre>
       *
       * <code>required string if_name = 1 [(.telemetry_options) = { ... }</code>
       * @param value The bytes for ifName to set.
       * @return This builder for chaining.
       */
      public Builder setIfNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        ifName_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private long initTime_ ;
      /**
       * <pre>
       * time when if/stats last reset
       * </pre>
       *
       * <code>required uint64 init_time = 2;</code>
       * @return Whether the initTime field is set.
       */
      @java.lang.Override
      public boolean hasInitTime() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * time when if/stats last reset
       * </pre>
       *
       * <code>required uint64 init_time = 2;</code>
       * @return The initTime.
       */
      @java.lang.Override
      public long getInitTime() {
        return initTime_;
      }
      /**
       * <pre>
       * time when if/stats last reset
       * </pre>
       *
       * <code>required uint64 init_time = 2;</code>
       * @param value The initTime to set.
       * @return This builder for chaining.
       */
      public Builder setInitTime(long value) {

        initTime_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * time when if/stats last reset
       * </pre>
       *
       * <code>required uint64 init_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearInitTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        initTime_ = 0L;
        onChanged();
        return this;
      }

      private int snmpIfIndex_ ;
      /**
       * <pre>
       * Global Index
       * </pre>
       *
       * <code>optional uint32 snmp_if_index = 3;</code>
       * @return Whether the snmpIfIndex field is set.
       */
      @java.lang.Override
      public boolean hasSnmpIfIndex() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Global Index
       * </pre>
       *
       * <code>optional uint32 snmp_if_index = 3;</code>
       * @return The snmpIfIndex.
       */
      @java.lang.Override
      public int getSnmpIfIndex() {
        return snmpIfIndex_;
      }
      /**
       * <pre>
       * Global Index
       * </pre>
       *
       * <code>optional uint32 snmp_if_index = 3;</code>
       * @param value The snmpIfIndex to set.
       * @return This builder for chaining.
       */
      public Builder setSnmpIfIndex(int value) {

        snmpIfIndex_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Global Index
       * </pre>
       *
       * <code>optional uint32 snmp_if_index = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSnmpIfIndex() {
        bitField0_ = (bitField0_ & ~0x00000004);
        snmpIfIndex_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object parentAeName_ = "";
      /**
       * <pre>
       * name of parent for ae interface, if applicable
       * </pre>
       *
       * <code>optional string parent_ae_name = 4;</code>
       * @return Whether the parentAeName field is set.
       */
      public boolean hasParentAeName() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * name of parent for ae interface, if applicable
       * </pre>
       *
       * <code>optional string parent_ae_name = 4;</code>
       * @return The parentAeName.
       */
      public java.lang.String getParentAeName() {
        java.lang.Object ref = parentAeName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            parentAeName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * name of parent for ae interface, if applicable
       * </pre>
       *
       * <code>optional string parent_ae_name = 4;</code>
       * @return The bytes for parentAeName.
       */
      public com.google.protobuf.ByteString
          getParentAeNameBytes() {
        java.lang.Object ref = parentAeName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          parentAeName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * name of parent for ae interface, if applicable
       * </pre>
       *
       * <code>optional string parent_ae_name = 4;</code>
       * @param value The parentAeName to set.
       * @return This builder for chaining.
       */
      public Builder setParentAeName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        parentAeName_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * name of parent for ae interface, if applicable
       * </pre>
       *
       * <code>optional string parent_ae_name = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentAeName() {
        parentAeName_ = getDefaultInstance().getParentAeName();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * name of parent for ae interface, if applicable
       * </pre>
       *
       * <code>optional string parent_ae_name = 4;</code>
       * @param value The bytes for parentAeName to set.
       * @return This builder for chaining.
       */
      public Builder setParentAeNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        parentAeName_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }

      private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats> egressQueueInfo_ =
        java.util.Collections.emptyList();
      private void ensureEgressQueueInfoIsMutable() {
        if (!((bitField0_ & 0x00000010) != 0)) {
          egressQueueInfo_ = new java.util.ArrayList<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats>(egressQueueInfo_);
          bitField0_ |= 0x00000010;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder> egressQueueInfoBuilder_;

      /**
       * <pre>
       * egress queue information
       * </pre>
       *
       * <code>repeated .QueueStats egress_queue_info = 5;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats> getEgressQueueInfoList() {
        if (egressQueueInfoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(egressQueueInfo_);
        } else {
          return egressQueueInfoBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * egress queue information
       * </pre>
       *
       * <code>repeated .QueueStats egress_queue_info = 5;</code>
       */
      public int getEgressQueueInfoCount() {
        if (egressQueueInfoBuilder_ == null) {
          return egressQueueInfo_.size();
        } else {
          return egressQueueInfoBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * egress queue information
       * </pre>
       *
       * <code>repeated .QueueStats egress_queue_info = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats getEgressQueueInfo(int index) {
        if (egressQueueInfoBuilder_ == null) {
          return egressQueueInfo_.get(index);
        } else {
          return egressQueueInfoBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * egress queue information
       * </pre>
       *
       * <code>repeated .QueueStats egress_queue_info = 5;</code>
       */
      public Builder setEgressQueueInfo(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats value) {
        if (egressQueueInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEgressQueueInfoIsMutable();
          egressQueueInfo_.set(index, value);
          onChanged();
        } else {
          egressQueueInfoBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * egress queue information
       * </pre>
       *
       * <code>repeated .QueueStats egress_queue_info = 5;</code>
       */
      public Builder setEgressQueueInfo(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder builderForValue) {
        if (egressQueueInfoBuilder_ == null) {
          ensureEgressQueueInfoIsMutable();
          egressQueueInfo_.set(index, builderForValue.build());
          onChanged();
        } else {
          egressQueueInfoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * egress queue information
       * </pre>
       *
       * <code>repeated .QueueStats egress_queue_info = 5;</code>
       */
      public Builder addEgressQueueInfo(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats value) {
        if (egressQueueInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEgressQueueInfoIsMutable();
          egressQueueInfo_.add(value);
          onChanged();
        } else {
          egressQueueInfoBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * egress queue information
       * </pre>
       *
       * <code>repeated .QueueStats egress_queue_info = 5;</code>
       */
      public Builder addEgressQueueInfo(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats value) {
        if (egressQueueInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEgressQueueInfoIsMutable();
          egressQueueInfo_.add(index, value);
          onChanged();
        } else {
          egressQueueInfoBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * egress queue information
       * </pre>
       *
       * <code>repeated .QueueStats egress_queue_info = 5;</code>
       */
      public Builder addEgressQueueInfo(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder builderForValue) {
        if (egressQueueInfoBuilder_ == null) {
          ensureEgressQueueInfoIsMutable();
          egressQueueInfo_.add(builderForValue.build());
          onChanged();
        } else {
          egressQueueInfoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * egress queue information
       * </pre>
       *
       * <code>repeated .QueueStats egress_queue_info = 5;</code>
       */
      public Builder addEgressQueueInfo(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder builderForValue) {
        if (egressQueueInfoBuilder_ == null) {
          ensureEgressQueueInfoIsMutable();
          egressQueueInfo_.add(index, builderForValue.build());
          onChanged();
        } else {
          egressQueueInfoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * egress queue information
       * </pre>
       *
       * <code>repeated .QueueStats egress_queue_info = 5;</code>
       */
      public Builder addAllEgressQueueInfo(
          java.lang.Iterable<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats> values) {
        if (egressQueueInfoBuilder_ == null) {
          ensureEgressQueueInfoIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, egressQueueInfo_);
          onChanged();
        } else {
          egressQueueInfoBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * egress queue information
       * </pre>
       *
       * <code>repeated .QueueStats egress_queue_info = 5;</code>
       */
      public Builder clearEgressQueueInfo() {
        if (egressQueueInfoBuilder_ == null) {
          egressQueueInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          egressQueueInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * egress queue information
       * </pre>
       *
       * <code>repeated .QueueStats egress_queue_info = 5;</code>
       */
      public Builder removeEgressQueueInfo(int index) {
        if (egressQueueInfoBuilder_ == null) {
          ensureEgressQueueInfoIsMutable();
          egressQueueInfo_.remove(index);
          onChanged();
        } else {
          egressQueueInfoBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * egress queue information
       * </pre>
       *
       * <code>repeated .QueueStats egress_queue_info = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder getEgressQueueInfoBuilder(
          int index) {
        return getEgressQueueInfoFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * egress queue information
       * </pre>
       *
       * <code>repeated .QueueStats egress_queue_info = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder getEgressQueueInfoOrBuilder(
          int index) {
        if (egressQueueInfoBuilder_ == null) {
          return egressQueueInfo_.get(index);  } else {
          return egressQueueInfoBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * egress queue information
       * </pre>
       *
       * <code>repeated .QueueStats egress_queue_info = 5;</code>
       */
      public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder> 
           getEgressQueueInfoOrBuilderList() {
        if (egressQueueInfoBuilder_ != null) {
          return egressQueueInfoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(egressQueueInfo_);
        }
      }
      /**
       * <pre>
       * egress queue information
       * </pre>
       *
       * <code>repeated .QueueStats egress_queue_info = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder addEgressQueueInfoBuilder() {
        return getEgressQueueInfoFieldBuilder().addBuilder(
            org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.getDefaultInstance());
      }
      /**
       * <pre>
       * egress queue information
       * </pre>
       *
       * <code>repeated .QueueStats egress_queue_info = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder addEgressQueueInfoBuilder(
          int index) {
        return getEgressQueueInfoFieldBuilder().addBuilder(
            index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.getDefaultInstance());
      }
      /**
       * <pre>
       * egress queue information
       * </pre>
       *
       * <code>repeated .QueueStats egress_queue_info = 5;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder> 
           getEgressQueueInfoBuilderList() {
        return getEgressQueueInfoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder> 
          getEgressQueueInfoFieldBuilder() {
        if (egressQueueInfoBuilder_ == null) {
          egressQueueInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder>(
                  egressQueueInfo_,
                  ((bitField0_ & 0x00000010) != 0),
                  getParentForChildren(),
                  isClean());
          egressQueueInfo_ = null;
        }
        return egressQueueInfoBuilder_;
      }

      private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats> ingressQueueInfo_ =
        java.util.Collections.emptyList();
      private void ensureIngressQueueInfoIsMutable() {
        if (!((bitField0_ & 0x00000020) != 0)) {
          ingressQueueInfo_ = new java.util.ArrayList<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats>(ingressQueueInfo_);
          bitField0_ |= 0x00000020;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder> ingressQueueInfoBuilder_;

      /**
       * <pre>
       * ingress queue information
       * </pre>
       *
       * <code>repeated .QueueStats ingress_queue_info = 6;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats> getIngressQueueInfoList() {
        if (ingressQueueInfoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(ingressQueueInfo_);
        } else {
          return ingressQueueInfoBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * ingress queue information
       * </pre>
       *
       * <code>repeated .QueueStats ingress_queue_info = 6;</code>
       */
      public int getIngressQueueInfoCount() {
        if (ingressQueueInfoBuilder_ == null) {
          return ingressQueueInfo_.size();
        } else {
          return ingressQueueInfoBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * ingress queue information
       * </pre>
       *
       * <code>repeated .QueueStats ingress_queue_info = 6;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats getIngressQueueInfo(int index) {
        if (ingressQueueInfoBuilder_ == null) {
          return ingressQueueInfo_.get(index);
        } else {
          return ingressQueueInfoBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * ingress queue information
       * </pre>
       *
       * <code>repeated .QueueStats ingress_queue_info = 6;</code>
       */
      public Builder setIngressQueueInfo(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats value) {
        if (ingressQueueInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureIngressQueueInfoIsMutable();
          ingressQueueInfo_.set(index, value);
          onChanged();
        } else {
          ingressQueueInfoBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * ingress queue information
       * </pre>
       *
       * <code>repeated .QueueStats ingress_queue_info = 6;</code>
       */
      public Builder setIngressQueueInfo(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder builderForValue) {
        if (ingressQueueInfoBuilder_ == null) {
          ensureIngressQueueInfoIsMutable();
          ingressQueueInfo_.set(index, builderForValue.build());
          onChanged();
        } else {
          ingressQueueInfoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * ingress queue information
       * </pre>
       *
       * <code>repeated .QueueStats ingress_queue_info = 6;</code>
       */
      public Builder addIngressQueueInfo(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats value) {
        if (ingressQueueInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureIngressQueueInfoIsMutable();
          ingressQueueInfo_.add(value);
          onChanged();
        } else {
          ingressQueueInfoBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * ingress queue information
       * </pre>
       *
       * <code>repeated .QueueStats ingress_queue_info = 6;</code>
       */
      public Builder addIngressQueueInfo(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats value) {
        if (ingressQueueInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureIngressQueueInfoIsMutable();
          ingressQueueInfo_.add(index, value);
          onChanged();
        } else {
          ingressQueueInfoBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * ingress queue information
       * </pre>
       *
       * <code>repeated .QueueStats ingress_queue_info = 6;</code>
       */
      public Builder addIngressQueueInfo(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder builderForValue) {
        if (ingressQueueInfoBuilder_ == null) {
          ensureIngressQueueInfoIsMutable();
          ingressQueueInfo_.add(builderForValue.build());
          onChanged();
        } else {
          ingressQueueInfoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * ingress queue information
       * </pre>
       *
       * <code>repeated .QueueStats ingress_queue_info = 6;</code>
       */
      public Builder addIngressQueueInfo(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder builderForValue) {
        if (ingressQueueInfoBuilder_ == null) {
          ensureIngressQueueInfoIsMutable();
          ingressQueueInfo_.add(index, builderForValue.build());
          onChanged();
        } else {
          ingressQueueInfoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * ingress queue information
       * </pre>
       *
       * <code>repeated .QueueStats ingress_queue_info = 6;</code>
       */
      public Builder addAllIngressQueueInfo(
          java.lang.Iterable<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats> values) {
        if (ingressQueueInfoBuilder_ == null) {
          ensureIngressQueueInfoIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, ingressQueueInfo_);
          onChanged();
        } else {
          ingressQueueInfoBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * ingress queue information
       * </pre>
       *
       * <code>repeated .QueueStats ingress_queue_info = 6;</code>
       */
      public Builder clearIngressQueueInfo() {
        if (ingressQueueInfoBuilder_ == null) {
          ingressQueueInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
          onChanged();
        } else {
          ingressQueueInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * ingress queue information
       * </pre>
       *
       * <code>repeated .QueueStats ingress_queue_info = 6;</code>
       */
      public Builder removeIngressQueueInfo(int index) {
        if (ingressQueueInfoBuilder_ == null) {
          ensureIngressQueueInfoIsMutable();
          ingressQueueInfo_.remove(index);
          onChanged();
        } else {
          ingressQueueInfoBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * ingress queue information
       * </pre>
       *
       * <code>repeated .QueueStats ingress_queue_info = 6;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder getIngressQueueInfoBuilder(
          int index) {
        return getIngressQueueInfoFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * ingress queue information
       * </pre>
       *
       * <code>repeated .QueueStats ingress_queue_info = 6;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder getIngressQueueInfoOrBuilder(
          int index) {
        if (ingressQueueInfoBuilder_ == null) {
          return ingressQueueInfo_.get(index);  } else {
          return ingressQueueInfoBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * ingress queue information
       * </pre>
       *
       * <code>repeated .QueueStats ingress_queue_info = 6;</code>
       */
      public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder> 
           getIngressQueueInfoOrBuilderList() {
        if (ingressQueueInfoBuilder_ != null) {
          return ingressQueueInfoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(ingressQueueInfo_);
        }
      }
      /**
       * <pre>
       * ingress queue information
       * </pre>
       *
       * <code>repeated .QueueStats ingress_queue_info = 6;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder addIngressQueueInfoBuilder() {
        return getIngressQueueInfoFieldBuilder().addBuilder(
            org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.getDefaultInstance());
      }
      /**
       * <pre>
       * ingress queue information
       * </pre>
       *
       * <code>repeated .QueueStats ingress_queue_info = 6;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder addIngressQueueInfoBuilder(
          int index) {
        return getIngressQueueInfoFieldBuilder().addBuilder(
            index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.getDefaultInstance());
      }
      /**
       * <pre>
       * ingress queue information
       * </pre>
       *
       * <code>repeated .QueueStats ingress_queue_info = 6;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder> 
           getIngressQueueInfoBuilderList() {
        return getIngressQueueInfoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder> 
          getIngressQueueInfoFieldBuilder() {
        if (ingressQueueInfoBuilder_ == null) {
          ingressQueueInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder>(
                  ingressQueueInfo_,
                  ((bitField0_ & 0x00000020) != 0),
                  getParentForChildren(),
                  isClean());
          ingressQueueInfo_ = null;
        }
        return ingressQueueInfoBuilder_;
      }

      private org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats ingressStats_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStatsOrBuilder> ingressStatsBuilder_;
      /**
       * <pre>
       * inbound traffic stats
       * </pre>
       *
       * <code>optional .InterfaceStats ingress_stats = 7;</code>
       * @return Whether the ingressStats field is set.
       */
      public boolean hasIngressStats() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <pre>
       * inbound traffic stats
       * </pre>
       *
       * <code>optional .InterfaceStats ingress_stats = 7;</code>
       * @return The ingressStats.
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats getIngressStats() {
        if (ingressStatsBuilder_ == null) {
          return ingressStats_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.getDefaultInstance() : ingressStats_;
        } else {
          return ingressStatsBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * inbound traffic stats
       * </pre>
       *
       * <code>optional .InterfaceStats ingress_stats = 7;</code>
       */
      public Builder setIngressStats(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats value) {
        if (ingressStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ingressStats_ = value;
        } else {
          ingressStatsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * inbound traffic stats
       * </pre>
       *
       * <code>optional .InterfaceStats ingress_stats = 7;</code>
       */
      public Builder setIngressStats(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.Builder builderForValue) {
        if (ingressStatsBuilder_ == null) {
          ingressStats_ = builderForValue.build();
        } else {
          ingressStatsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * inbound traffic stats
       * </pre>
       *
       * <code>optional .InterfaceStats ingress_stats = 7;</code>
       */
      public Builder mergeIngressStats(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats value) {
        if (ingressStatsBuilder_ == null) {
          if (((bitField0_ & 0x00000040) != 0) &&
            ingressStats_ != null &&
            ingressStats_ != org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.getDefaultInstance()) {
            getIngressStatsBuilder().mergeFrom(value);
          } else {
            ingressStats_ = value;
          }
        } else {
          ingressStatsBuilder_.mergeFrom(value);
        }
        if (ingressStats_ != null) {
          bitField0_ |= 0x00000040;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       * inbound traffic stats
       * </pre>
       *
       * <code>optional .InterfaceStats ingress_stats = 7;</code>
       */
      public Builder clearIngressStats() {
        bitField0_ = (bitField0_ & ~0x00000040);
        ingressStats_ = null;
        if (ingressStatsBuilder_ != null) {
          ingressStatsBuilder_.dispose();
          ingressStatsBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       * inbound traffic stats
       * </pre>
       *
       * <code>optional .InterfaceStats ingress_stats = 7;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.Builder getIngressStatsBuilder() {
        bitField0_ |= 0x00000040;
        onChanged();
        return getIngressStatsFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * inbound traffic stats
       * </pre>
       *
       * <code>optional .InterfaceStats ingress_stats = 7;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStatsOrBuilder getIngressStatsOrBuilder() {
        if (ingressStatsBuilder_ != null) {
          return ingressStatsBuilder_.getMessageOrBuilder();
        } else {
          return ingressStats_ == null ?
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.getDefaultInstance() : ingressStats_;
        }
      }
      /**
       * <pre>
       * inbound traffic stats
       * </pre>
       *
       * <code>optional .InterfaceStats ingress_stats = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStatsOrBuilder> 
          getIngressStatsFieldBuilder() {
        if (ingressStatsBuilder_ == null) {
          ingressStatsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStatsOrBuilder>(
                  getIngressStats(),
                  getParentForChildren(),
                  isClean());
          ingressStats_ = null;
        }
        return ingressStatsBuilder_;
      }

      private org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats egressStats_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStatsOrBuilder> egressStatsBuilder_;
      /**
       * <pre>
       * outbound traffic stats
       * </pre>
       *
       * <code>optional .InterfaceStats egress_stats = 8;</code>
       * @return Whether the egressStats field is set.
       */
      public boolean hasEgressStats() {
        return ((bitField0_ & 0x00000080) != 0);
      }
      /**
       * <pre>
       * outbound traffic stats
       * </pre>
       *
       * <code>optional .InterfaceStats egress_stats = 8;</code>
       * @return The egressStats.
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats getEgressStats() {
        if (egressStatsBuilder_ == null) {
          return egressStats_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.getDefaultInstance() : egressStats_;
        } else {
          return egressStatsBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * outbound traffic stats
       * </pre>
       *
       * <code>optional .InterfaceStats egress_stats = 8;</code>
       */
      public Builder setEgressStats(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats value) {
        if (egressStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          egressStats_ = value;
        } else {
          egressStatsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000080;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * outbound traffic stats
       * </pre>
       *
       * <code>optional .InterfaceStats egress_stats = 8;</code>
       */
      public Builder setEgressStats(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.Builder builderForValue) {
        if (egressStatsBuilder_ == null) {
          egressStats_ = builderForValue.build();
        } else {
          egressStatsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000080;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * outbound traffic stats
       * </pre>
       *
       * <code>optional .InterfaceStats egress_stats = 8;</code>
       */
      public Builder mergeEgressStats(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats value) {
        if (egressStatsBuilder_ == null) {
          if (((bitField0_ & 0x00000080) != 0) &&
            egressStats_ != null &&
            egressStats_ != org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.getDefaultInstance()) {
            getEgressStatsBuilder().mergeFrom(value);
          } else {
            egressStats_ = value;
          }
        } else {
          egressStatsBuilder_.mergeFrom(value);
        }
        if (egressStats_ != null) {
          bitField0_ |= 0x00000080;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       * outbound traffic stats
       * </pre>
       *
       * <code>optional .InterfaceStats egress_stats = 8;</code>
       */
      public Builder clearEgressStats() {
        bitField0_ = (bitField0_ & ~0x00000080);
        egressStats_ = null;
        if (egressStatsBuilder_ != null) {
          egressStatsBuilder_.dispose();
          egressStatsBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       * outbound traffic stats
       * </pre>
       *
       * <code>optional .InterfaceStats egress_stats = 8;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.Builder getEgressStatsBuilder() {
        bitField0_ |= 0x00000080;
        onChanged();
        return getEgressStatsFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * outbound traffic stats
       * </pre>
       *
       * <code>optional .InterfaceStats egress_stats = 8;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStatsOrBuilder getEgressStatsOrBuilder() {
        if (egressStatsBuilder_ != null) {
          return egressStatsBuilder_.getMessageOrBuilder();
        } else {
          return egressStats_ == null ?
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.getDefaultInstance() : egressStats_;
        }
      }
      /**
       * <pre>
       * outbound traffic stats
       * </pre>
       *
       * <code>optional .InterfaceStats egress_stats = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStatsOrBuilder> 
          getEgressStatsFieldBuilder() {
        if (egressStatsBuilder_ == null) {
          egressStatsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStatsOrBuilder>(
                  getEgressStats(),
                  getParentForChildren(),
                  isClean());
          egressStats_ = null;
        }
        return egressStatsBuilder_;
      }

      private org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors ingressErrors_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrorsOrBuilder> ingressErrorsBuilder_;
      /**
       * <pre>
       * inbound traffic errors
       * </pre>
       *
       * <code>optional .IngressInterfaceErrors ingress_errors = 9;</code>
       * @return Whether the ingressErrors field is set.
       */
      public boolean hasIngressErrors() {
        return ((bitField0_ & 0x00000100) != 0);
      }
      /**
       * <pre>
       * inbound traffic errors
       * </pre>
       *
       * <code>optional .IngressInterfaceErrors ingress_errors = 9;</code>
       * @return The ingressErrors.
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors getIngressErrors() {
        if (ingressErrorsBuilder_ == null) {
          return ingressErrors_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors.getDefaultInstance() : ingressErrors_;
        } else {
          return ingressErrorsBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * inbound traffic errors
       * </pre>
       *
       * <code>optional .IngressInterfaceErrors ingress_errors = 9;</code>
       */
      public Builder setIngressErrors(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors value) {
        if (ingressErrorsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ingressErrors_ = value;
        } else {
          ingressErrorsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000100;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * inbound traffic errors
       * </pre>
       *
       * <code>optional .IngressInterfaceErrors ingress_errors = 9;</code>
       */
      public Builder setIngressErrors(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors.Builder builderForValue) {
        if (ingressErrorsBuilder_ == null) {
          ingressErrors_ = builderForValue.build();
        } else {
          ingressErrorsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000100;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * inbound traffic errors
       * </pre>
       *
       * <code>optional .IngressInterfaceErrors ingress_errors = 9;</code>
       */
      public Builder mergeIngressErrors(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors value) {
        if (ingressErrorsBuilder_ == null) {
          if (((bitField0_ & 0x00000100) != 0) &&
            ingressErrors_ != null &&
            ingressErrors_ != org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors.getDefaultInstance()) {
            getIngressErrorsBuilder().mergeFrom(value);
          } else {
            ingressErrors_ = value;
          }
        } else {
          ingressErrorsBuilder_.mergeFrom(value);
        }
        if (ingressErrors_ != null) {
          bitField0_ |= 0x00000100;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       * inbound traffic errors
       * </pre>
       *
       * <code>optional .IngressInterfaceErrors ingress_errors = 9;</code>
       */
      public Builder clearIngressErrors() {
        bitField0_ = (bitField0_ & ~0x00000100);
        ingressErrors_ = null;
        if (ingressErrorsBuilder_ != null) {
          ingressErrorsBuilder_.dispose();
          ingressErrorsBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       * inbound traffic errors
       * </pre>
       *
       * <code>optional .IngressInterfaceErrors ingress_errors = 9;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors.Builder getIngressErrorsBuilder() {
        bitField0_ |= 0x00000100;
        onChanged();
        return getIngressErrorsFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * inbound traffic errors
       * </pre>
       *
       * <code>optional .IngressInterfaceErrors ingress_errors = 9;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrorsOrBuilder getIngressErrorsOrBuilder() {
        if (ingressErrorsBuilder_ != null) {
          return ingressErrorsBuilder_.getMessageOrBuilder();
        } else {
          return ingressErrors_ == null ?
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors.getDefaultInstance() : ingressErrors_;
        }
      }
      /**
       * <pre>
       * inbound traffic errors
       * </pre>
       *
       * <code>optional .IngressInterfaceErrors ingress_errors = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrorsOrBuilder> 
          getIngressErrorsFieldBuilder() {
        if (ingressErrorsBuilder_ == null) {
          ingressErrorsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrorsOrBuilder>(
                  getIngressErrors(),
                  getParentForChildren(),
                  isClean());
          ingressErrors_ = null;
        }
        return ingressErrorsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:InterfaceInfos)
    }

    // @@protoc_insertion_point(class_scope:InterfaceInfos)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<InterfaceInfos>
        PARSER = new com.google.protobuf.AbstractParser<InterfaceInfos>() {
      @java.lang.Override
      public InterfaceInfos parsePartialFrom(
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

    public static com.google.protobuf.Parser<InterfaceInfos> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InterfaceInfos> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceInfos getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface InterfaceStatsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InterfaceStats)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Counter: the total number of packets sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_pkts = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifPkts field is set.
     */
    boolean hasIfPkts();
    /**
     * <pre>
     * Counter: the total number of packets sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_pkts = 1 [(.telemetry_options) = { ... }</code>
     * @return The ifPkts.
     */
    long getIfPkts();

    /**
     * <pre>
     * Counter: the total number of bytes sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_octets = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifOctets field is set.
     */
    boolean hasIfOctets();
    /**
     * <pre>
     * Counter: the total number of bytes sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_octets = 2 [(.telemetry_options) = { ... }</code>
     * @return The ifOctets.
     */
    long getIfOctets();

    /**
     * <pre>
     * Rate: the rate at which packets are sent/rcvd by this interface (in packets/sec)
     * </pre>
     *
     * <code>required uint64 if_1sec_pkts = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the if1secPkts field is set.
     */
    boolean hasIf1SecPkts();
    /**
     * <pre>
     * Rate: the rate at which packets are sent/rcvd by this interface (in packets/sec)
     * </pre>
     *
     * <code>required uint64 if_1sec_pkts = 3 [(.telemetry_options) = { ... }</code>
     * @return The if1secPkts.
     */
    long getIf1SecPkts();

    /**
     * <pre>
     * Rate: the rate at which bytes are sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_1sec_octets = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the if1secOctets field is set.
     */
    boolean hasIf1SecOctets();
    /**
     * <pre>
     * Rate: the rate at which bytes are sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_1sec_octets = 4 [(.telemetry_options) = { ... }</code>
     * @return The if1secOctets.
     */
    long getIf1SecOctets();

    /**
     * <pre>
     * Counter: total no of unicast packets sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_uc_pkts = 5 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifUcPkts field is set.
     */
    boolean hasIfUcPkts();
    /**
     * <pre>
     * Counter: total no of unicast packets sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_uc_pkts = 5 [(.telemetry_options) = { ... }</code>
     * @return The ifUcPkts.
     */
    long getIfUcPkts();

    /**
     * <pre>
     * Counter: total no of multicast packets sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_mc_pkts = 6 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifMcPkts field is set.
     */
    boolean hasIfMcPkts();
    /**
     * <pre>
     * Counter: total no of multicast packets sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_mc_pkts = 6 [(.telemetry_options) = { ... }</code>
     * @return The ifMcPkts.
     */
    long getIfMcPkts();

    /**
     * <pre>
     * Counter: total no of broadcast packets sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_bc_pkts = 7 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifBcPkts field is set.
     */
    boolean hasIfBcPkts();
    /**
     * <pre>
     * Counter: total no of broadcast packets sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_bc_pkts = 7 [(.telemetry_options) = { ... }</code>
     * @return The ifBcPkts.
     */
    long getIfBcPkts();
  }
  /**
   * Protobuf type {@code InterfaceStats}
   */
  public static final class InterfaceStats extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InterfaceStats)
      InterfaceStatsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InterfaceStats.newBuilder() to construct.
    private InterfaceStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InterfaceStats() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InterfaceStats();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_InterfaceStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_InterfaceStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.Builder.class);
    }

    private int bitField0_;
    public static final int IF_PKTS_FIELD_NUMBER = 1;
    private long ifPkts_ = 0L;
    /**
     * <pre>
     * Counter: the total number of packets sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_pkts = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifPkts field is set.
     */
    @java.lang.Override
    public boolean hasIfPkts() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Counter: the total number of packets sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_pkts = 1 [(.telemetry_options) = { ... }</code>
     * @return The ifPkts.
     */
    @java.lang.Override
    public long getIfPkts() {
      return ifPkts_;
    }

    public static final int IF_OCTETS_FIELD_NUMBER = 2;
    private long ifOctets_ = 0L;
    /**
     * <pre>
     * Counter: the total number of bytes sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_octets = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifOctets field is set.
     */
    @java.lang.Override
    public boolean hasIfOctets() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Counter: the total number of bytes sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_octets = 2 [(.telemetry_options) = { ... }</code>
     * @return The ifOctets.
     */
    @java.lang.Override
    public long getIfOctets() {
      return ifOctets_;
    }

    public static final int IF_1SEC_PKTS_FIELD_NUMBER = 3;
    private long if1SecPkts_ = 0L;
    /**
     * <pre>
     * Rate: the rate at which packets are sent/rcvd by this interface (in packets/sec)
     * </pre>
     *
     * <code>required uint64 if_1sec_pkts = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the if1secPkts field is set.
     */
    @java.lang.Override
    public boolean hasIf1SecPkts() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Rate: the rate at which packets are sent/rcvd by this interface (in packets/sec)
     * </pre>
     *
     * <code>required uint64 if_1sec_pkts = 3 [(.telemetry_options) = { ... }</code>
     * @return The if1secPkts.
     */
    @java.lang.Override
    public long getIf1SecPkts() {
      return if1SecPkts_;
    }

    public static final int IF_1SEC_OCTETS_FIELD_NUMBER = 4;
    private long if1SecOctets_ = 0L;
    /**
     * <pre>
     * Rate: the rate at which bytes are sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_1sec_octets = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the if1secOctets field is set.
     */
    @java.lang.Override
    public boolean hasIf1SecOctets() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Rate: the rate at which bytes are sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_1sec_octets = 4 [(.telemetry_options) = { ... }</code>
     * @return The if1secOctets.
     */
    @java.lang.Override
    public long getIf1SecOctets() {
      return if1SecOctets_;
    }

    public static final int IF_UC_PKTS_FIELD_NUMBER = 5;
    private long ifUcPkts_ = 0L;
    /**
     * <pre>
     * Counter: total no of unicast packets sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_uc_pkts = 5 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifUcPkts field is set.
     */
    @java.lang.Override
    public boolean hasIfUcPkts() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * Counter: total no of unicast packets sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_uc_pkts = 5 [(.telemetry_options) = { ... }</code>
     * @return The ifUcPkts.
     */
    @java.lang.Override
    public long getIfUcPkts() {
      return ifUcPkts_;
    }

    public static final int IF_MC_PKTS_FIELD_NUMBER = 6;
    private long ifMcPkts_ = 0L;
    /**
     * <pre>
     * Counter: total no of multicast packets sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_mc_pkts = 6 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifMcPkts field is set.
     */
    @java.lang.Override
    public boolean hasIfMcPkts() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * Counter: total no of multicast packets sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_mc_pkts = 6 [(.telemetry_options) = { ... }</code>
     * @return The ifMcPkts.
     */
    @java.lang.Override
    public long getIfMcPkts() {
      return ifMcPkts_;
    }

    public static final int IF_BC_PKTS_FIELD_NUMBER = 7;
    private long ifBcPkts_ = 0L;
    /**
     * <pre>
     * Counter: total no of broadcast packets sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_bc_pkts = 7 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifBcPkts field is set.
     */
    @java.lang.Override
    public boolean hasIfBcPkts() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <pre>
     * Counter: total no of broadcast packets sent/rcvd by this interface
     * </pre>
     *
     * <code>required uint64 if_bc_pkts = 7 [(.telemetry_options) = { ... }</code>
     * @return The ifBcPkts.
     */
    @java.lang.Override
    public long getIfBcPkts() {
      return ifBcPkts_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasIfPkts()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIfOctets()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIf1SecPkts()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIf1SecOctets()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIfUcPkts()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIfMcPkts()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIfBcPkts()) {
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
        output.writeUInt64(1, ifPkts_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, ifOctets_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt64(3, if1SecPkts_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeUInt64(4, if1SecOctets_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeUInt64(5, ifUcPkts_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeUInt64(6, ifMcPkts_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeUInt64(7, ifBcPkts_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, ifPkts_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, ifOctets_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, if1SecPkts_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, if1SecOctets_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, ifUcPkts_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, ifMcPkts_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, ifBcPkts_);
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
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats) obj;

      if (hasIfPkts() != other.hasIfPkts()) return false;
      if (hasIfPkts()) {
        if (getIfPkts()
            != other.getIfPkts()) return false;
      }
      if (hasIfOctets() != other.hasIfOctets()) return false;
      if (hasIfOctets()) {
        if (getIfOctets()
            != other.getIfOctets()) return false;
      }
      if (hasIf1SecPkts() != other.hasIf1SecPkts()) return false;
      if (hasIf1SecPkts()) {
        if (getIf1SecPkts()
            != other.getIf1SecPkts()) return false;
      }
      if (hasIf1SecOctets() != other.hasIf1SecOctets()) return false;
      if (hasIf1SecOctets()) {
        if (getIf1SecOctets()
            != other.getIf1SecOctets()) return false;
      }
      if (hasIfUcPkts() != other.hasIfUcPkts()) return false;
      if (hasIfUcPkts()) {
        if (getIfUcPkts()
            != other.getIfUcPkts()) return false;
      }
      if (hasIfMcPkts() != other.hasIfMcPkts()) return false;
      if (hasIfMcPkts()) {
        if (getIfMcPkts()
            != other.getIfMcPkts()) return false;
      }
      if (hasIfBcPkts() != other.hasIfBcPkts()) return false;
      if (hasIfBcPkts()) {
        if (getIfBcPkts()
            != other.getIfBcPkts()) return false;
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
      if (hasIfPkts()) {
        hash = (37 * hash) + IF_PKTS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfPkts());
      }
      if (hasIfOctets()) {
        hash = (37 * hash) + IF_OCTETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfOctets());
      }
      if (hasIf1SecPkts()) {
        hash = (37 * hash) + IF_1SEC_PKTS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIf1SecPkts());
      }
      if (hasIf1SecOctets()) {
        hash = (37 * hash) + IF_1SEC_OCTETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIf1SecOctets());
      }
      if (hasIfUcPkts()) {
        hash = (37 * hash) + IF_UC_PKTS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfUcPkts());
      }
      if (hasIfMcPkts()) {
        hash = (37 * hash) + IF_MC_PKTS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfMcPkts());
      }
      if (hasIfBcPkts()) {
        hash = (37 * hash) + IF_BC_PKTS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfBcPkts());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats prototype) {
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
     * Protobuf type {@code InterfaceStats}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InterfaceStats)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStatsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_InterfaceStats_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_InterfaceStats_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.newBuilder()
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
        ifPkts_ = 0L;
        ifOctets_ = 0L;
        if1SecPkts_ = 0L;
        if1SecOctets_ = 0L;
        ifUcPkts_ = 0L;
        ifMcPkts_ = 0L;
        ifBcPkts_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_InterfaceStats_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.ifPkts_ = ifPkts_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.ifOctets_ = ifOctets_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.if1SecPkts_ = if1SecPkts_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.if1SecOctets_ = if1SecOctets_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.ifUcPkts_ = ifUcPkts_;
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.ifMcPkts_ = ifMcPkts_;
          to_bitField0_ |= 0x00000020;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.ifBcPkts_ = ifBcPkts_;
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats.getDefaultInstance()) return this;
        if (other.hasIfPkts()) {
          setIfPkts(other.getIfPkts());
        }
        if (other.hasIfOctets()) {
          setIfOctets(other.getIfOctets());
        }
        if (other.hasIf1SecPkts()) {
          setIf1SecPkts(other.getIf1SecPkts());
        }
        if (other.hasIf1SecOctets()) {
          setIf1SecOctets(other.getIf1SecOctets());
        }
        if (other.hasIfUcPkts()) {
          setIfUcPkts(other.getIfUcPkts());
        }
        if (other.hasIfMcPkts()) {
          setIfMcPkts(other.getIfMcPkts());
        }
        if (other.hasIfBcPkts()) {
          setIfBcPkts(other.getIfBcPkts());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasIfPkts()) {
          return false;
        }
        if (!hasIfOctets()) {
          return false;
        }
        if (!hasIf1SecPkts()) {
          return false;
        }
        if (!hasIf1SecOctets()) {
          return false;
        }
        if (!hasIfUcPkts()) {
          return false;
        }
        if (!hasIfMcPkts()) {
          return false;
        }
        if (!hasIfBcPkts()) {
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
              case 8: {
                ifPkts_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                ifOctets_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                if1SecPkts_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                if1SecOctets_ = input.readUInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 40: {
                ifUcPkts_ = input.readUInt64();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              case 48: {
                ifMcPkts_ = input.readUInt64();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
              case 56: {
                ifBcPkts_ = input.readUInt64();
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

      private long ifPkts_ ;
      /**
       * <pre>
       * Counter: the total number of packets sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_pkts = 1 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifPkts field is set.
       */
      @java.lang.Override
      public boolean hasIfPkts() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Counter: the total number of packets sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_pkts = 1 [(.telemetry_options) = { ... }</code>
       * @return The ifPkts.
       */
      @java.lang.Override
      public long getIfPkts() {
        return ifPkts_;
      }
      /**
       * <pre>
       * Counter: the total number of packets sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_pkts = 1 [(.telemetry_options) = { ... }</code>
       * @param value The ifPkts to set.
       * @return This builder for chaining.
       */
      public Builder setIfPkts(long value) {

        ifPkts_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the total number of packets sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_pkts = 1 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfPkts() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ifPkts_ = 0L;
        onChanged();
        return this;
      }

      private long ifOctets_ ;
      /**
       * <pre>
       * Counter: the total number of bytes sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_octets = 2 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifOctets field is set.
       */
      @java.lang.Override
      public boolean hasIfOctets() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Counter: the total number of bytes sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_octets = 2 [(.telemetry_options) = { ... }</code>
       * @return The ifOctets.
       */
      @java.lang.Override
      public long getIfOctets() {
        return ifOctets_;
      }
      /**
       * <pre>
       * Counter: the total number of bytes sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_octets = 2 [(.telemetry_options) = { ... }</code>
       * @param value The ifOctets to set.
       * @return This builder for chaining.
       */
      public Builder setIfOctets(long value) {

        ifOctets_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the total number of bytes sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_octets = 2 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfOctets() {
        bitField0_ = (bitField0_ & ~0x00000002);
        ifOctets_ = 0L;
        onChanged();
        return this;
      }

      private long if1SecPkts_ ;
      /**
       * <pre>
       * Rate: the rate at which packets are sent/rcvd by this interface (in packets/sec)
       * </pre>
       *
       * <code>required uint64 if_1sec_pkts = 3 [(.telemetry_options) = { ... }</code>
       * @return Whether the if1secPkts field is set.
       */
      @java.lang.Override
      public boolean hasIf1SecPkts() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Rate: the rate at which packets are sent/rcvd by this interface (in packets/sec)
       * </pre>
       *
       * <code>required uint64 if_1sec_pkts = 3 [(.telemetry_options) = { ... }</code>
       * @return The if1secPkts.
       */
      @java.lang.Override
      public long getIf1SecPkts() {
        return if1SecPkts_;
      }
      /**
       * <pre>
       * Rate: the rate at which packets are sent/rcvd by this interface (in packets/sec)
       * </pre>
       *
       * <code>required uint64 if_1sec_pkts = 3 [(.telemetry_options) = { ... }</code>
       * @param value The if1secPkts to set.
       * @return This builder for chaining.
       */
      public Builder setIf1SecPkts(long value) {

        if1SecPkts_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Rate: the rate at which packets are sent/rcvd by this interface (in packets/sec)
       * </pre>
       *
       * <code>required uint64 if_1sec_pkts = 3 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIf1SecPkts() {
        bitField0_ = (bitField0_ & ~0x00000004);
        if1SecPkts_ = 0L;
        onChanged();
        return this;
      }

      private long if1SecOctets_ ;
      /**
       * <pre>
       * Rate: the rate at which bytes are sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_1sec_octets = 4 [(.telemetry_options) = { ... }</code>
       * @return Whether the if1secOctets field is set.
       */
      @java.lang.Override
      public boolean hasIf1SecOctets() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * Rate: the rate at which bytes are sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_1sec_octets = 4 [(.telemetry_options) = { ... }</code>
       * @return The if1secOctets.
       */
      @java.lang.Override
      public long getIf1SecOctets() {
        return if1SecOctets_;
      }
      /**
       * <pre>
       * Rate: the rate at which bytes are sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_1sec_octets = 4 [(.telemetry_options) = { ... }</code>
       * @param value The if1secOctets to set.
       * @return This builder for chaining.
       */
      public Builder setIf1SecOctets(long value) {

        if1SecOctets_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Rate: the rate at which bytes are sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_1sec_octets = 4 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIf1SecOctets() {
        bitField0_ = (bitField0_ & ~0x00000008);
        if1SecOctets_ = 0L;
        onChanged();
        return this;
      }

      private long ifUcPkts_ ;
      /**
       * <pre>
       * Counter: total no of unicast packets sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_uc_pkts = 5 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifUcPkts field is set.
       */
      @java.lang.Override
      public boolean hasIfUcPkts() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       * Counter: total no of unicast packets sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_uc_pkts = 5 [(.telemetry_options) = { ... }</code>
       * @return The ifUcPkts.
       */
      @java.lang.Override
      public long getIfUcPkts() {
        return ifUcPkts_;
      }
      /**
       * <pre>
       * Counter: total no of unicast packets sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_uc_pkts = 5 [(.telemetry_options) = { ... }</code>
       * @param value The ifUcPkts to set.
       * @return This builder for chaining.
       */
      public Builder setIfUcPkts(long value) {

        ifUcPkts_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: total no of unicast packets sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_uc_pkts = 5 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfUcPkts() {
        bitField0_ = (bitField0_ & ~0x00000010);
        ifUcPkts_ = 0L;
        onChanged();
        return this;
      }

      private long ifMcPkts_ ;
      /**
       * <pre>
       * Counter: total no of multicast packets sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_mc_pkts = 6 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifMcPkts field is set.
       */
      @java.lang.Override
      public boolean hasIfMcPkts() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <pre>
       * Counter: total no of multicast packets sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_mc_pkts = 6 [(.telemetry_options) = { ... }</code>
       * @return The ifMcPkts.
       */
      @java.lang.Override
      public long getIfMcPkts() {
        return ifMcPkts_;
      }
      /**
       * <pre>
       * Counter: total no of multicast packets sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_mc_pkts = 6 [(.telemetry_options) = { ... }</code>
       * @param value The ifMcPkts to set.
       * @return This builder for chaining.
       */
      public Builder setIfMcPkts(long value) {

        ifMcPkts_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: total no of multicast packets sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_mc_pkts = 6 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfMcPkts() {
        bitField0_ = (bitField0_ & ~0x00000020);
        ifMcPkts_ = 0L;
        onChanged();
        return this;
      }

      private long ifBcPkts_ ;
      /**
       * <pre>
       * Counter: total no of broadcast packets sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_bc_pkts = 7 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifBcPkts field is set.
       */
      @java.lang.Override
      public boolean hasIfBcPkts() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <pre>
       * Counter: total no of broadcast packets sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_bc_pkts = 7 [(.telemetry_options) = { ... }</code>
       * @return The ifBcPkts.
       */
      @java.lang.Override
      public long getIfBcPkts() {
        return ifBcPkts_;
      }
      /**
       * <pre>
       * Counter: total no of broadcast packets sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_bc_pkts = 7 [(.telemetry_options) = { ... }</code>
       * @param value The ifBcPkts to set.
       * @return This builder for chaining.
       */
      public Builder setIfBcPkts(long value) {

        ifBcPkts_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: total no of broadcast packets sent/rcvd by this interface
       * </pre>
       *
       * <code>required uint64 if_bc_pkts = 7 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfBcPkts() {
        bitField0_ = (bitField0_ & ~0x00000040);
        ifBcPkts_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:InterfaceStats)
    }

    // @@protoc_insertion_point(class_scope:InterfaceStats)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<InterfaceStats>
        PARSER = new com.google.protobuf.AbstractParser<InterfaceStats>() {
      @java.lang.Override
      public InterfaceStats parsePartialFrom(
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

    public static com.google.protobuf.Parser<InterfaceStats> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InterfaceStats> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.InterfaceStats getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface IngressInterfaceErrorsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IngressInterfaceErrors)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Counter: the number of packets that contained errors
     * </pre>
     *
     * <code>optional uint64 if_in_errors = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInErrors field is set.
     */
    boolean hasIfInErrors();
    /**
     * <pre>
     * Counter: the number of packets that contained errors
     * </pre>
     *
     * <code>optional uint64 if_in_errors = 1 [(.telemetry_options) = { ... }</code>
     * @return The ifInErrors.
     */
    long getIfInErrors();

    /**
     * <pre>
     * Counter: the number of packets dropped by the input queue of the I/O Manager ASIC
     * </pre>
     *
     * <code>optional uint64 if_in_qdrops = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInQdrops field is set.
     */
    boolean hasIfInQdrops();
    /**
     * <pre>
     * Counter: the number of packets dropped by the input queue of the I/O Manager ASIC
     * </pre>
     *
     * <code>optional uint64 if_in_qdrops = 2 [(.telemetry_options) = { ... }</code>
     * @return The ifInQdrops.
     */
    long getIfInQdrops();

    /**
     * <pre>
     * Counter: the number of packets which were misaligned
     * </pre>
     *
     * <code>optional uint64 if_in_frame_errors = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInFrameErrors field is set.
     */
    boolean hasIfInFrameErrors();
    /**
     * <pre>
     * Counter: the number of packets which were misaligned
     * </pre>
     *
     * <code>optional uint64 if_in_frame_errors = 3 [(.telemetry_options) = { ... }</code>
     * @return The ifInFrameErrors.
     */
    long getIfInFrameErrors();

    /**
     * <pre>
     * Counter: the number of non-errorpackets which were chosen to be discarded
     * </pre>
     *
     * <code>optional uint64 if_in_discards = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInDiscards field is set.
     */
    boolean hasIfInDiscards();
    /**
     * <pre>
     * Counter: the number of non-errorpackets which were chosen to be discarded
     * </pre>
     *
     * <code>optional uint64 if_in_discards = 4 [(.telemetry_options) = { ... }</code>
     * @return The ifInDiscards.
     */
    long getIfInDiscards();

    /**
     * <pre>
     * Counter: the number of runt packets
     * </pre>
     *
     * <code>optional uint64 if_in_runts = 5 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInRunts field is set.
     */
    boolean hasIfInRunts();
    /**
     * <pre>
     * Counter: the number of runt packets
     * </pre>
     *
     * <code>optional uint64 if_in_runts = 5 [(.telemetry_options) = { ... }</code>
     * @return The ifInRunts.
     */
    long getIfInRunts();

    /**
     * <pre>
     * Counter: the number of packets that fail Layer 3 sanity checks of the header
     * </pre>
     *
     * <code>optional uint64 if_in_l3_incompletes = 6 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInL3Incompletes field is set.
     */
    boolean hasIfInL3Incompletes();
    /**
     * <pre>
     * Counter: the number of packets that fail Layer 3 sanity checks of the header
     * </pre>
     *
     * <code>optional uint64 if_in_l3_incompletes = 6 [(.telemetry_options) = { ... }</code>
     * @return The ifInL3Incompletes.
     */
    long getIfInL3Incompletes();

    /**
     * <pre>
     * Counter: the number of packets for which the software could not find a valid logical interface
     * </pre>
     *
     * <code>optional uint64 if_in_l2chan_errors = 7 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInL2chanErrors field is set.
     */
    boolean hasIfInL2ChanErrors();
    /**
     * <pre>
     * Counter: the number of packets for which the software could not find a valid logical interface
     * </pre>
     *
     * <code>optional uint64 if_in_l2chan_errors = 7 [(.telemetry_options) = { ... }</code>
     * @return The ifInL2chanErrors.
     */
    long getIfInL2ChanErrors();

    /**
     * <pre>
     * Counter: the number of malform or short packets
     * </pre>
     *
     * <code>optional uint64 if_in_l2_mismatch_timeouts = 8 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInL2MismatchTimeouts field is set.
     */
    boolean hasIfInL2MismatchTimeouts();
    /**
     * <pre>
     * Counter: the number of malform or short packets
     * </pre>
     *
     * <code>optional uint64 if_in_l2_mismatch_timeouts = 8 [(.telemetry_options) = { ... }</code>
     * @return The ifInL2MismatchTimeouts.
     */
    long getIfInL2MismatchTimeouts();

    /**
     * <pre>
     * Counter: the number of FIFO errors
     * </pre>
     *
     * <code>optional uint64 if_in_fifo_errors = 9 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInFifoErrors field is set.
     */
    boolean hasIfInFifoErrors();
    /**
     * <pre>
     * Counter: the number of FIFO errors
     * </pre>
     *
     * <code>optional uint64 if_in_fifo_errors = 9 [(.telemetry_options) = { ... }</code>
     * @return The ifInFifoErrors.
     */
    long getIfInFifoErrors();

    /**
     * <pre>
     * Counter: the number of resourceerrors
     * </pre>
     *
     * <code>optional uint64 if_in_resource_errors = 10 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInResourceErrors field is set.
     */
    boolean hasIfInResourceErrors();
    /**
     * <pre>
     * Counter: the number of resourceerrors
     * </pre>
     *
     * <code>optional uint64 if_in_resource_errors = 10 [(.telemetry_options) = { ... }</code>
     * @return The ifInResourceErrors.
     */
    long getIfInResourceErrors();
  }
  /**
   * Protobuf type {@code IngressInterfaceErrors}
   */
  public static final class IngressInterfaceErrors extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IngressInterfaceErrors)
      IngressInterfaceErrorsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IngressInterfaceErrors.newBuilder() to construct.
    private IngressInterfaceErrors(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IngressInterfaceErrors() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IngressInterfaceErrors();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_IngressInterfaceErrors_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_IngressInterfaceErrors_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors.Builder.class);
    }

    private int bitField0_;
    public static final int IF_IN_ERRORS_FIELD_NUMBER = 1;
    private long ifInErrors_ = 0L;
    /**
     * <pre>
     * Counter: the number of packets that contained errors
     * </pre>
     *
     * <code>optional uint64 if_in_errors = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInErrors field is set.
     */
    @java.lang.Override
    public boolean hasIfInErrors() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Counter: the number of packets that contained errors
     * </pre>
     *
     * <code>optional uint64 if_in_errors = 1 [(.telemetry_options) = { ... }</code>
     * @return The ifInErrors.
     */
    @java.lang.Override
    public long getIfInErrors() {
      return ifInErrors_;
    }

    public static final int IF_IN_QDROPS_FIELD_NUMBER = 2;
    private long ifInQdrops_ = 0L;
    /**
     * <pre>
     * Counter: the number of packets dropped by the input queue of the I/O Manager ASIC
     * </pre>
     *
     * <code>optional uint64 if_in_qdrops = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInQdrops field is set.
     */
    @java.lang.Override
    public boolean hasIfInQdrops() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Counter: the number of packets dropped by the input queue of the I/O Manager ASIC
     * </pre>
     *
     * <code>optional uint64 if_in_qdrops = 2 [(.telemetry_options) = { ... }</code>
     * @return The ifInQdrops.
     */
    @java.lang.Override
    public long getIfInQdrops() {
      return ifInQdrops_;
    }

    public static final int IF_IN_FRAME_ERRORS_FIELD_NUMBER = 3;
    private long ifInFrameErrors_ = 0L;
    /**
     * <pre>
     * Counter: the number of packets which were misaligned
     * </pre>
     *
     * <code>optional uint64 if_in_frame_errors = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInFrameErrors field is set.
     */
    @java.lang.Override
    public boolean hasIfInFrameErrors() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Counter: the number of packets which were misaligned
     * </pre>
     *
     * <code>optional uint64 if_in_frame_errors = 3 [(.telemetry_options) = { ... }</code>
     * @return The ifInFrameErrors.
     */
    @java.lang.Override
    public long getIfInFrameErrors() {
      return ifInFrameErrors_;
    }

    public static final int IF_IN_DISCARDS_FIELD_NUMBER = 4;
    private long ifInDiscards_ = 0L;
    /**
     * <pre>
     * Counter: the number of non-errorpackets which were chosen to be discarded
     * </pre>
     *
     * <code>optional uint64 if_in_discards = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInDiscards field is set.
     */
    @java.lang.Override
    public boolean hasIfInDiscards() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Counter: the number of non-errorpackets which were chosen to be discarded
     * </pre>
     *
     * <code>optional uint64 if_in_discards = 4 [(.telemetry_options) = { ... }</code>
     * @return The ifInDiscards.
     */
    @java.lang.Override
    public long getIfInDiscards() {
      return ifInDiscards_;
    }

    public static final int IF_IN_RUNTS_FIELD_NUMBER = 5;
    private long ifInRunts_ = 0L;
    /**
     * <pre>
     * Counter: the number of runt packets
     * </pre>
     *
     * <code>optional uint64 if_in_runts = 5 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInRunts field is set.
     */
    @java.lang.Override
    public boolean hasIfInRunts() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * Counter: the number of runt packets
     * </pre>
     *
     * <code>optional uint64 if_in_runts = 5 [(.telemetry_options) = { ... }</code>
     * @return The ifInRunts.
     */
    @java.lang.Override
    public long getIfInRunts() {
      return ifInRunts_;
    }

    public static final int IF_IN_L3_INCOMPLETES_FIELD_NUMBER = 6;
    private long ifInL3Incompletes_ = 0L;
    /**
     * <pre>
     * Counter: the number of packets that fail Layer 3 sanity checks of the header
     * </pre>
     *
     * <code>optional uint64 if_in_l3_incompletes = 6 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInL3Incompletes field is set.
     */
    @java.lang.Override
    public boolean hasIfInL3Incompletes() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * Counter: the number of packets that fail Layer 3 sanity checks of the header
     * </pre>
     *
     * <code>optional uint64 if_in_l3_incompletes = 6 [(.telemetry_options) = { ... }</code>
     * @return The ifInL3Incompletes.
     */
    @java.lang.Override
    public long getIfInL3Incompletes() {
      return ifInL3Incompletes_;
    }

    public static final int IF_IN_L2CHAN_ERRORS_FIELD_NUMBER = 7;
    private long ifInL2ChanErrors_ = 0L;
    /**
     * <pre>
     * Counter: the number of packets for which the software could not find a valid logical interface
     * </pre>
     *
     * <code>optional uint64 if_in_l2chan_errors = 7 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInL2chanErrors field is set.
     */
    @java.lang.Override
    public boolean hasIfInL2ChanErrors() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <pre>
     * Counter: the number of packets for which the software could not find a valid logical interface
     * </pre>
     *
     * <code>optional uint64 if_in_l2chan_errors = 7 [(.telemetry_options) = { ... }</code>
     * @return The ifInL2chanErrors.
     */
    @java.lang.Override
    public long getIfInL2ChanErrors() {
      return ifInL2ChanErrors_;
    }

    public static final int IF_IN_L2_MISMATCH_TIMEOUTS_FIELD_NUMBER = 8;
    private long ifInL2MismatchTimeouts_ = 0L;
    /**
     * <pre>
     * Counter: the number of malform or short packets
     * </pre>
     *
     * <code>optional uint64 if_in_l2_mismatch_timeouts = 8 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInL2MismatchTimeouts field is set.
     */
    @java.lang.Override
    public boolean hasIfInL2MismatchTimeouts() {
      return ((bitField0_ & 0x00000080) != 0);
    }
    /**
     * <pre>
     * Counter: the number of malform or short packets
     * </pre>
     *
     * <code>optional uint64 if_in_l2_mismatch_timeouts = 8 [(.telemetry_options) = { ... }</code>
     * @return The ifInL2MismatchTimeouts.
     */
    @java.lang.Override
    public long getIfInL2MismatchTimeouts() {
      return ifInL2MismatchTimeouts_;
    }

    public static final int IF_IN_FIFO_ERRORS_FIELD_NUMBER = 9;
    private long ifInFifoErrors_ = 0L;
    /**
     * <pre>
     * Counter: the number of FIFO errors
     * </pre>
     *
     * <code>optional uint64 if_in_fifo_errors = 9 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInFifoErrors field is set.
     */
    @java.lang.Override
    public boolean hasIfInFifoErrors() {
      return ((bitField0_ & 0x00000100) != 0);
    }
    /**
     * <pre>
     * Counter: the number of FIFO errors
     * </pre>
     *
     * <code>optional uint64 if_in_fifo_errors = 9 [(.telemetry_options) = { ... }</code>
     * @return The ifInFifoErrors.
     */
    @java.lang.Override
    public long getIfInFifoErrors() {
      return ifInFifoErrors_;
    }

    public static final int IF_IN_RESOURCE_ERRORS_FIELD_NUMBER = 10;
    private long ifInResourceErrors_ = 0L;
    /**
     * <pre>
     * Counter: the number of resourceerrors
     * </pre>
     *
     * <code>optional uint64 if_in_resource_errors = 10 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifInResourceErrors field is set.
     */
    @java.lang.Override
    public boolean hasIfInResourceErrors() {
      return ((bitField0_ & 0x00000200) != 0);
    }
    /**
     * <pre>
     * Counter: the number of resourceerrors
     * </pre>
     *
     * <code>optional uint64 if_in_resource_errors = 10 [(.telemetry_options) = { ... }</code>
     * @return The ifInResourceErrors.
     */
    @java.lang.Override
    public long getIfInResourceErrors() {
      return ifInResourceErrors_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeUInt64(1, ifInErrors_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, ifInQdrops_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt64(3, ifInFrameErrors_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeUInt64(4, ifInDiscards_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeUInt64(5, ifInRunts_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeUInt64(6, ifInL3Incompletes_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeUInt64(7, ifInL2ChanErrors_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        output.writeUInt64(8, ifInL2MismatchTimeouts_);
      }
      if (((bitField0_ & 0x00000100) != 0)) {
        output.writeUInt64(9, ifInFifoErrors_);
      }
      if (((bitField0_ & 0x00000200) != 0)) {
        output.writeUInt64(10, ifInResourceErrors_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, ifInErrors_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, ifInQdrops_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, ifInFrameErrors_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, ifInDiscards_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, ifInRunts_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, ifInL3Incompletes_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, ifInL2ChanErrors_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, ifInL2MismatchTimeouts_);
      }
      if (((bitField0_ & 0x00000100) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(9, ifInFifoErrors_);
      }
      if (((bitField0_ & 0x00000200) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(10, ifInResourceErrors_);
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
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors) obj;

      if (hasIfInErrors() != other.hasIfInErrors()) return false;
      if (hasIfInErrors()) {
        if (getIfInErrors()
            != other.getIfInErrors()) return false;
      }
      if (hasIfInQdrops() != other.hasIfInQdrops()) return false;
      if (hasIfInQdrops()) {
        if (getIfInQdrops()
            != other.getIfInQdrops()) return false;
      }
      if (hasIfInFrameErrors() != other.hasIfInFrameErrors()) return false;
      if (hasIfInFrameErrors()) {
        if (getIfInFrameErrors()
            != other.getIfInFrameErrors()) return false;
      }
      if (hasIfInDiscards() != other.hasIfInDiscards()) return false;
      if (hasIfInDiscards()) {
        if (getIfInDiscards()
            != other.getIfInDiscards()) return false;
      }
      if (hasIfInRunts() != other.hasIfInRunts()) return false;
      if (hasIfInRunts()) {
        if (getIfInRunts()
            != other.getIfInRunts()) return false;
      }
      if (hasIfInL3Incompletes() != other.hasIfInL3Incompletes()) return false;
      if (hasIfInL3Incompletes()) {
        if (getIfInL3Incompletes()
            != other.getIfInL3Incompletes()) return false;
      }
      if (hasIfInL2ChanErrors() != other.hasIfInL2ChanErrors()) return false;
      if (hasIfInL2ChanErrors()) {
        if (getIfInL2ChanErrors()
            != other.getIfInL2ChanErrors()) return false;
      }
      if (hasIfInL2MismatchTimeouts() != other.hasIfInL2MismatchTimeouts()) return false;
      if (hasIfInL2MismatchTimeouts()) {
        if (getIfInL2MismatchTimeouts()
            != other.getIfInL2MismatchTimeouts()) return false;
      }
      if (hasIfInFifoErrors() != other.hasIfInFifoErrors()) return false;
      if (hasIfInFifoErrors()) {
        if (getIfInFifoErrors()
            != other.getIfInFifoErrors()) return false;
      }
      if (hasIfInResourceErrors() != other.hasIfInResourceErrors()) return false;
      if (hasIfInResourceErrors()) {
        if (getIfInResourceErrors()
            != other.getIfInResourceErrors()) return false;
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
      if (hasIfInErrors()) {
        hash = (37 * hash) + IF_IN_ERRORS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfInErrors());
      }
      if (hasIfInQdrops()) {
        hash = (37 * hash) + IF_IN_QDROPS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfInQdrops());
      }
      if (hasIfInFrameErrors()) {
        hash = (37 * hash) + IF_IN_FRAME_ERRORS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfInFrameErrors());
      }
      if (hasIfInDiscards()) {
        hash = (37 * hash) + IF_IN_DISCARDS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfInDiscards());
      }
      if (hasIfInRunts()) {
        hash = (37 * hash) + IF_IN_RUNTS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfInRunts());
      }
      if (hasIfInL3Incompletes()) {
        hash = (37 * hash) + IF_IN_L3_INCOMPLETES_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfInL3Incompletes());
      }
      if (hasIfInL2ChanErrors()) {
        hash = (37 * hash) + IF_IN_L2CHAN_ERRORS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfInL2ChanErrors());
      }
      if (hasIfInL2MismatchTimeouts()) {
        hash = (37 * hash) + IF_IN_L2_MISMATCH_TIMEOUTS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfInL2MismatchTimeouts());
      }
      if (hasIfInFifoErrors()) {
        hash = (37 * hash) + IF_IN_FIFO_ERRORS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfInFifoErrors());
      }
      if (hasIfInResourceErrors()) {
        hash = (37 * hash) + IF_IN_RESOURCE_ERRORS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfInResourceErrors());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors prototype) {
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
     * Protobuf type {@code IngressInterfaceErrors}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IngressInterfaceErrors)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrorsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_IngressInterfaceErrors_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_IngressInterfaceErrors_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors.newBuilder()
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
        ifInErrors_ = 0L;
        ifInQdrops_ = 0L;
        ifInFrameErrors_ = 0L;
        ifInDiscards_ = 0L;
        ifInRunts_ = 0L;
        ifInL3Incompletes_ = 0L;
        ifInL2ChanErrors_ = 0L;
        ifInL2MismatchTimeouts_ = 0L;
        ifInFifoErrors_ = 0L;
        ifInResourceErrors_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_IngressInterfaceErrors_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.ifInErrors_ = ifInErrors_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.ifInQdrops_ = ifInQdrops_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.ifInFrameErrors_ = ifInFrameErrors_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.ifInDiscards_ = ifInDiscards_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.ifInRunts_ = ifInRunts_;
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.ifInL3Incompletes_ = ifInL3Incompletes_;
          to_bitField0_ |= 0x00000020;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.ifInL2ChanErrors_ = ifInL2ChanErrors_;
          to_bitField0_ |= 0x00000040;
        }
        if (((from_bitField0_ & 0x00000080) != 0)) {
          result.ifInL2MismatchTimeouts_ = ifInL2MismatchTimeouts_;
          to_bitField0_ |= 0x00000080;
        }
        if (((from_bitField0_ & 0x00000100) != 0)) {
          result.ifInFifoErrors_ = ifInFifoErrors_;
          to_bitField0_ |= 0x00000100;
        }
        if (((from_bitField0_ & 0x00000200) != 0)) {
          result.ifInResourceErrors_ = ifInResourceErrors_;
          to_bitField0_ |= 0x00000200;
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors.getDefaultInstance()) return this;
        if (other.hasIfInErrors()) {
          setIfInErrors(other.getIfInErrors());
        }
        if (other.hasIfInQdrops()) {
          setIfInQdrops(other.getIfInQdrops());
        }
        if (other.hasIfInFrameErrors()) {
          setIfInFrameErrors(other.getIfInFrameErrors());
        }
        if (other.hasIfInDiscards()) {
          setIfInDiscards(other.getIfInDiscards());
        }
        if (other.hasIfInRunts()) {
          setIfInRunts(other.getIfInRunts());
        }
        if (other.hasIfInL3Incompletes()) {
          setIfInL3Incompletes(other.getIfInL3Incompletes());
        }
        if (other.hasIfInL2ChanErrors()) {
          setIfInL2ChanErrors(other.getIfInL2ChanErrors());
        }
        if (other.hasIfInL2MismatchTimeouts()) {
          setIfInL2MismatchTimeouts(other.getIfInL2MismatchTimeouts());
        }
        if (other.hasIfInFifoErrors()) {
          setIfInFifoErrors(other.getIfInFifoErrors());
        }
        if (other.hasIfInResourceErrors()) {
          setIfInResourceErrors(other.getIfInResourceErrors());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
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
              case 8: {
                ifInErrors_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                ifInQdrops_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                ifInFrameErrors_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                ifInDiscards_ = input.readUInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 40: {
                ifInRunts_ = input.readUInt64();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              case 48: {
                ifInL3Incompletes_ = input.readUInt64();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
              case 56: {
                ifInL2ChanErrors_ = input.readUInt64();
                bitField0_ |= 0x00000040;
                break;
              } // case 56
              case 64: {
                ifInL2MismatchTimeouts_ = input.readUInt64();
                bitField0_ |= 0x00000080;
                break;
              } // case 64
              case 72: {
                ifInFifoErrors_ = input.readUInt64();
                bitField0_ |= 0x00000100;
                break;
              } // case 72
              case 80: {
                ifInResourceErrors_ = input.readUInt64();
                bitField0_ |= 0x00000200;
                break;
              } // case 80
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

      private long ifInErrors_ ;
      /**
       * <pre>
       * Counter: the number of packets that contained errors
       * </pre>
       *
       * <code>optional uint64 if_in_errors = 1 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifInErrors field is set.
       */
      @java.lang.Override
      public boolean hasIfInErrors() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Counter: the number of packets that contained errors
       * </pre>
       *
       * <code>optional uint64 if_in_errors = 1 [(.telemetry_options) = { ... }</code>
       * @return The ifInErrors.
       */
      @java.lang.Override
      public long getIfInErrors() {
        return ifInErrors_;
      }
      /**
       * <pre>
       * Counter: the number of packets that contained errors
       * </pre>
       *
       * <code>optional uint64 if_in_errors = 1 [(.telemetry_options) = { ... }</code>
       * @param value The ifInErrors to set.
       * @return This builder for chaining.
       */
      public Builder setIfInErrors(long value) {

        ifInErrors_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the number of packets that contained errors
       * </pre>
       *
       * <code>optional uint64 if_in_errors = 1 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfInErrors() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ifInErrors_ = 0L;
        onChanged();
        return this;
      }

      private long ifInQdrops_ ;
      /**
       * <pre>
       * Counter: the number of packets dropped by the input queue of the I/O Manager ASIC
       * </pre>
       *
       * <code>optional uint64 if_in_qdrops = 2 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifInQdrops field is set.
       */
      @java.lang.Override
      public boolean hasIfInQdrops() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Counter: the number of packets dropped by the input queue of the I/O Manager ASIC
       * </pre>
       *
       * <code>optional uint64 if_in_qdrops = 2 [(.telemetry_options) = { ... }</code>
       * @return The ifInQdrops.
       */
      @java.lang.Override
      public long getIfInQdrops() {
        return ifInQdrops_;
      }
      /**
       * <pre>
       * Counter: the number of packets dropped by the input queue of the I/O Manager ASIC
       * </pre>
       *
       * <code>optional uint64 if_in_qdrops = 2 [(.telemetry_options) = { ... }</code>
       * @param value The ifInQdrops to set.
       * @return This builder for chaining.
       */
      public Builder setIfInQdrops(long value) {

        ifInQdrops_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the number of packets dropped by the input queue of the I/O Manager ASIC
       * </pre>
       *
       * <code>optional uint64 if_in_qdrops = 2 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfInQdrops() {
        bitField0_ = (bitField0_ & ~0x00000002);
        ifInQdrops_ = 0L;
        onChanged();
        return this;
      }

      private long ifInFrameErrors_ ;
      /**
       * <pre>
       * Counter: the number of packets which were misaligned
       * </pre>
       *
       * <code>optional uint64 if_in_frame_errors = 3 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifInFrameErrors field is set.
       */
      @java.lang.Override
      public boolean hasIfInFrameErrors() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Counter: the number of packets which were misaligned
       * </pre>
       *
       * <code>optional uint64 if_in_frame_errors = 3 [(.telemetry_options) = { ... }</code>
       * @return The ifInFrameErrors.
       */
      @java.lang.Override
      public long getIfInFrameErrors() {
        return ifInFrameErrors_;
      }
      /**
       * <pre>
       * Counter: the number of packets which were misaligned
       * </pre>
       *
       * <code>optional uint64 if_in_frame_errors = 3 [(.telemetry_options) = { ... }</code>
       * @param value The ifInFrameErrors to set.
       * @return This builder for chaining.
       */
      public Builder setIfInFrameErrors(long value) {

        ifInFrameErrors_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the number of packets which were misaligned
       * </pre>
       *
       * <code>optional uint64 if_in_frame_errors = 3 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfInFrameErrors() {
        bitField0_ = (bitField0_ & ~0x00000004);
        ifInFrameErrors_ = 0L;
        onChanged();
        return this;
      }

      private long ifInDiscards_ ;
      /**
       * <pre>
       * Counter: the number of non-errorpackets which were chosen to be discarded
       * </pre>
       *
       * <code>optional uint64 if_in_discards = 4 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifInDiscards field is set.
       */
      @java.lang.Override
      public boolean hasIfInDiscards() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * Counter: the number of non-errorpackets which were chosen to be discarded
       * </pre>
       *
       * <code>optional uint64 if_in_discards = 4 [(.telemetry_options) = { ... }</code>
       * @return The ifInDiscards.
       */
      @java.lang.Override
      public long getIfInDiscards() {
        return ifInDiscards_;
      }
      /**
       * <pre>
       * Counter: the number of non-errorpackets which were chosen to be discarded
       * </pre>
       *
       * <code>optional uint64 if_in_discards = 4 [(.telemetry_options) = { ... }</code>
       * @param value The ifInDiscards to set.
       * @return This builder for chaining.
       */
      public Builder setIfInDiscards(long value) {

        ifInDiscards_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the number of non-errorpackets which were chosen to be discarded
       * </pre>
       *
       * <code>optional uint64 if_in_discards = 4 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfInDiscards() {
        bitField0_ = (bitField0_ & ~0x00000008);
        ifInDiscards_ = 0L;
        onChanged();
        return this;
      }

      private long ifInRunts_ ;
      /**
       * <pre>
       * Counter: the number of runt packets
       * </pre>
       *
       * <code>optional uint64 if_in_runts = 5 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifInRunts field is set.
       */
      @java.lang.Override
      public boolean hasIfInRunts() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       * Counter: the number of runt packets
       * </pre>
       *
       * <code>optional uint64 if_in_runts = 5 [(.telemetry_options) = { ... }</code>
       * @return The ifInRunts.
       */
      @java.lang.Override
      public long getIfInRunts() {
        return ifInRunts_;
      }
      /**
       * <pre>
       * Counter: the number of runt packets
       * </pre>
       *
       * <code>optional uint64 if_in_runts = 5 [(.telemetry_options) = { ... }</code>
       * @param value The ifInRunts to set.
       * @return This builder for chaining.
       */
      public Builder setIfInRunts(long value) {

        ifInRunts_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the number of runt packets
       * </pre>
       *
       * <code>optional uint64 if_in_runts = 5 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfInRunts() {
        bitField0_ = (bitField0_ & ~0x00000010);
        ifInRunts_ = 0L;
        onChanged();
        return this;
      }

      private long ifInL3Incompletes_ ;
      /**
       * <pre>
       * Counter: the number of packets that fail Layer 3 sanity checks of the header
       * </pre>
       *
       * <code>optional uint64 if_in_l3_incompletes = 6 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifInL3Incompletes field is set.
       */
      @java.lang.Override
      public boolean hasIfInL3Incompletes() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <pre>
       * Counter: the number of packets that fail Layer 3 sanity checks of the header
       * </pre>
       *
       * <code>optional uint64 if_in_l3_incompletes = 6 [(.telemetry_options) = { ... }</code>
       * @return The ifInL3Incompletes.
       */
      @java.lang.Override
      public long getIfInL3Incompletes() {
        return ifInL3Incompletes_;
      }
      /**
       * <pre>
       * Counter: the number of packets that fail Layer 3 sanity checks of the header
       * </pre>
       *
       * <code>optional uint64 if_in_l3_incompletes = 6 [(.telemetry_options) = { ... }</code>
       * @param value The ifInL3Incompletes to set.
       * @return This builder for chaining.
       */
      public Builder setIfInL3Incompletes(long value) {

        ifInL3Incompletes_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the number of packets that fail Layer 3 sanity checks of the header
       * </pre>
       *
       * <code>optional uint64 if_in_l3_incompletes = 6 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfInL3Incompletes() {
        bitField0_ = (bitField0_ & ~0x00000020);
        ifInL3Incompletes_ = 0L;
        onChanged();
        return this;
      }

      private long ifInL2ChanErrors_ ;
      /**
       * <pre>
       * Counter: the number of packets for which the software could not find a valid logical interface
       * </pre>
       *
       * <code>optional uint64 if_in_l2chan_errors = 7 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifInL2chanErrors field is set.
       */
      @java.lang.Override
      public boolean hasIfInL2ChanErrors() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <pre>
       * Counter: the number of packets for which the software could not find a valid logical interface
       * </pre>
       *
       * <code>optional uint64 if_in_l2chan_errors = 7 [(.telemetry_options) = { ... }</code>
       * @return The ifInL2chanErrors.
       */
      @java.lang.Override
      public long getIfInL2ChanErrors() {
        return ifInL2ChanErrors_;
      }
      /**
       * <pre>
       * Counter: the number of packets for which the software could not find a valid logical interface
       * </pre>
       *
       * <code>optional uint64 if_in_l2chan_errors = 7 [(.telemetry_options) = { ... }</code>
       * @param value The ifInL2chanErrors to set.
       * @return This builder for chaining.
       */
      public Builder setIfInL2ChanErrors(long value) {

        ifInL2ChanErrors_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the number of packets for which the software could not find a valid logical interface
       * </pre>
       *
       * <code>optional uint64 if_in_l2chan_errors = 7 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfInL2ChanErrors() {
        bitField0_ = (bitField0_ & ~0x00000040);
        ifInL2ChanErrors_ = 0L;
        onChanged();
        return this;
      }

      private long ifInL2MismatchTimeouts_ ;
      /**
       * <pre>
       * Counter: the number of malform or short packets
       * </pre>
       *
       * <code>optional uint64 if_in_l2_mismatch_timeouts = 8 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifInL2MismatchTimeouts field is set.
       */
      @java.lang.Override
      public boolean hasIfInL2MismatchTimeouts() {
        return ((bitField0_ & 0x00000080) != 0);
      }
      /**
       * <pre>
       * Counter: the number of malform or short packets
       * </pre>
       *
       * <code>optional uint64 if_in_l2_mismatch_timeouts = 8 [(.telemetry_options) = { ... }</code>
       * @return The ifInL2MismatchTimeouts.
       */
      @java.lang.Override
      public long getIfInL2MismatchTimeouts() {
        return ifInL2MismatchTimeouts_;
      }
      /**
       * <pre>
       * Counter: the number of malform or short packets
       * </pre>
       *
       * <code>optional uint64 if_in_l2_mismatch_timeouts = 8 [(.telemetry_options) = { ... }</code>
       * @param value The ifInL2MismatchTimeouts to set.
       * @return This builder for chaining.
       */
      public Builder setIfInL2MismatchTimeouts(long value) {

        ifInL2MismatchTimeouts_ = value;
        bitField0_ |= 0x00000080;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the number of malform or short packets
       * </pre>
       *
       * <code>optional uint64 if_in_l2_mismatch_timeouts = 8 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfInL2MismatchTimeouts() {
        bitField0_ = (bitField0_ & ~0x00000080);
        ifInL2MismatchTimeouts_ = 0L;
        onChanged();
        return this;
      }

      private long ifInFifoErrors_ ;
      /**
       * <pre>
       * Counter: the number of FIFO errors
       * </pre>
       *
       * <code>optional uint64 if_in_fifo_errors = 9 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifInFifoErrors field is set.
       */
      @java.lang.Override
      public boolean hasIfInFifoErrors() {
        return ((bitField0_ & 0x00000100) != 0);
      }
      /**
       * <pre>
       * Counter: the number of FIFO errors
       * </pre>
       *
       * <code>optional uint64 if_in_fifo_errors = 9 [(.telemetry_options) = { ... }</code>
       * @return The ifInFifoErrors.
       */
      @java.lang.Override
      public long getIfInFifoErrors() {
        return ifInFifoErrors_;
      }
      /**
       * <pre>
       * Counter: the number of FIFO errors
       * </pre>
       *
       * <code>optional uint64 if_in_fifo_errors = 9 [(.telemetry_options) = { ... }</code>
       * @param value The ifInFifoErrors to set.
       * @return This builder for chaining.
       */
      public Builder setIfInFifoErrors(long value) {

        ifInFifoErrors_ = value;
        bitField0_ |= 0x00000100;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the number of FIFO errors
       * </pre>
       *
       * <code>optional uint64 if_in_fifo_errors = 9 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfInFifoErrors() {
        bitField0_ = (bitField0_ & ~0x00000100);
        ifInFifoErrors_ = 0L;
        onChanged();
        return this;
      }

      private long ifInResourceErrors_ ;
      /**
       * <pre>
       * Counter: the number of resourceerrors
       * </pre>
       *
       * <code>optional uint64 if_in_resource_errors = 10 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifInResourceErrors field is set.
       */
      @java.lang.Override
      public boolean hasIfInResourceErrors() {
        return ((bitField0_ & 0x00000200) != 0);
      }
      /**
       * <pre>
       * Counter: the number of resourceerrors
       * </pre>
       *
       * <code>optional uint64 if_in_resource_errors = 10 [(.telemetry_options) = { ... }</code>
       * @return The ifInResourceErrors.
       */
      @java.lang.Override
      public long getIfInResourceErrors() {
        return ifInResourceErrors_;
      }
      /**
       * <pre>
       * Counter: the number of resourceerrors
       * </pre>
       *
       * <code>optional uint64 if_in_resource_errors = 10 [(.telemetry_options) = { ... }</code>
       * @param value The ifInResourceErrors to set.
       * @return This builder for chaining.
       */
      public Builder setIfInResourceErrors(long value) {

        ifInResourceErrors_ = value;
        bitField0_ |= 0x00000200;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the number of resourceerrors
       * </pre>
       *
       * <code>optional uint64 if_in_resource_errors = 10 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfInResourceErrors() {
        bitField0_ = (bitField0_ & ~0x00000200);
        ifInResourceErrors_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:IngressInterfaceErrors)
    }

    // @@protoc_insertion_point(class_scope:IngressInterfaceErrors)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<IngressInterfaceErrors>
        PARSER = new com.google.protobuf.AbstractParser<IngressInterfaceErrors>() {
      @java.lang.Override
      public IngressInterfaceErrors parsePartialFrom(
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

    public static com.google.protobuf.Parser<IngressInterfaceErrors> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IngressInterfaceErrors> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.IngressInterfaceErrors getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface QueueStatsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QueueStats)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint32 queue_number = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the queueNumber field is set.
     */
    boolean hasQueueNumber();
    /**
     * <code>optional uint32 queue_number = 1 [(.telemetry_options) = { ... }</code>
     * @return The queueNumber.
     */
    int getQueueNumber();

    /**
     * <pre>
     * Counter: the total number of packets that have been added to this queue
     * </pre>
     *
     * <code>optional uint64 packets = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the packets field is set.
     */
    boolean hasPackets();
    /**
     * <pre>
     * Counter: the total number of packets that have been added to this queue
     * </pre>
     *
     * <code>optional uint64 packets = 2 [(.telemetry_options) = { ... }</code>
     * @return The packets.
     */
    long getPackets();

    /**
     * <pre>
     * Counter: the total number of bytes that have been added to this queue
     * </pre>
     *
     * <code>optional uint64 bytes = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the bytes field is set.
     */
    boolean hasBytes();
    /**
     * <pre>
     * Counter: the total number of bytes that have been added to this queue
     * </pre>
     *
     * <code>optional uint64 bytes = 3 [(.telemetry_options) = { ... }</code>
     * @return The bytes.
     */
    long getBytes();

    /**
     * <pre>
     * Counter: the total number of tail dropped packets
     * </pre>
     *
     * <code>optional uint64 tail_drop_packets = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the tailDropPackets field is set.
     */
    boolean hasTailDropPackets();
    /**
     * <pre>
     * Counter: the total number of tail dropped packets
     * </pre>
     *
     * <code>optional uint64 tail_drop_packets = 4 [(.telemetry_options) = { ... }</code>
     * @return The tailDropPackets.
     */
    long getTailDropPackets();

    /**
     * <pre>
     * Counter: the total number of rate-limitd packets
     * </pre>
     *
     * <code>optional uint64 rl_drop_packets = 5 [(.telemetry_options) = { ... }</code>
     * @return Whether the rlDropPackets field is set.
     */
    boolean hasRlDropPackets();
    /**
     * <pre>
     * Counter: the total number of rate-limitd packets
     * </pre>
     *
     * <code>optional uint64 rl_drop_packets = 5 [(.telemetry_options) = { ... }</code>
     * @return The rlDropPackets.
     */
    long getRlDropPackets();

    /**
     * <pre>
     * Counter: the total number of rate-limited bytes
     * </pre>
     *
     * <code>optional uint64 rl_drop_bytes = 6 [(.telemetry_options) = { ... }</code>
     * @return Whether the rlDropBytes field is set.
     */
    boolean hasRlDropBytes();
    /**
     * <pre>
     * Counter: the total number of rate-limited bytes
     * </pre>
     *
     * <code>optional uint64 rl_drop_bytes = 6 [(.telemetry_options) = { ... }</code>
     * @return The rlDropBytes.
     */
    long getRlDropBytes();

    /**
     * <pre>
     * Counter: the total number of red-dropped packets
     * </pre>
     *
     * <code>optional uint64 red_drop_packets = 7 [(.telemetry_options) = { ... }</code>
     * @return Whether the redDropPackets field is set.
     */
    boolean hasRedDropPackets();
    /**
     * <pre>
     * Counter: the total number of red-dropped packets
     * </pre>
     *
     * <code>optional uint64 red_drop_packets = 7 [(.telemetry_options) = { ... }</code>
     * @return The redDropPackets.
     */
    long getRedDropPackets();

    /**
     * <pre>
     * Counter: the total number of red-dropped bytes
     * </pre>
     *
     * <code>optional uint64 red_drop_bytes = 8 [(.telemetry_options) = { ... }</code>
     * @return Whether the redDropBytes field is set.
     */
    boolean hasRedDropBytes();
    /**
     * <pre>
     * Counter: the total number of red-dropped bytes
     * </pre>
     *
     * <code>optional uint64 red_drop_bytes = 8 [(.telemetry_options) = { ... }</code>
     * @return The redDropBytes.
     */
    long getRedDropBytes();

    /**
     * <pre>
     * Average: avg queue depth,TAQL:time-average-queue-len, in packets, details TBD
     * </pre>
     *
     * <code>optional uint64 avg_buffer_occupancy = 9 [(.telemetry_options) = { ... }</code>
     * @return Whether the avgBufferOccupancy field is set.
     */
    boolean hasAvgBufferOccupancy();
    /**
     * <pre>
     * Average: avg queue depth,TAQL:time-average-queue-len, in packets, details TBD
     * </pre>
     *
     * <code>optional uint64 avg_buffer_occupancy = 9 [(.telemetry_options) = { ... }</code>
     * @return The avgBufferOccupancy.
     */
    long getAvgBufferOccupancy();

    /**
     * <pre>
     * Gauge: current queue depth, in packets
     * </pre>
     *
     * <code>optional uint64 cur_buffer_occupancy = 10 [(.telemetry_options) = { ... }</code>
     * @return Whether the curBufferOccupancy field is set.
     */
    boolean hasCurBufferOccupancy();
    /**
     * <pre>
     * Gauge: current queue depth, in packets
     * </pre>
     *
     * <code>optional uint64 cur_buffer_occupancy = 10 [(.telemetry_options) = { ... }</code>
     * @return The curBufferOccupancy.
     */
    long getCurBufferOccupancy();

    /**
     * <pre>
     * Peak: the max measured queue depth, in packets, across all measurements since bo ot.
     * </pre>
     *
     * <code>optional uint64 peak_buffer_occupancy = 11 [(.telemetry_options) = { ... }</code>
     * @return Whether the peakBufferOccupancy field is set.
     */
    boolean hasPeakBufferOccupancy();
    /**
     * <pre>
     * Peak: the max measured queue depth, in packets, across all measurements since bo ot.
     * </pre>
     *
     * <code>optional uint64 peak_buffer_occupancy = 11 [(.telemetry_options) = { ... }</code>
     * @return The peakBufferOccupancy.
     */
    long getPeakBufferOccupancy();

    /**
     * <pre>
     * allocated buffer size
     * </pre>
     *
     * <code>optional uint64 allocated_buffer_size = 12 [(.telemetry_options) = { ... }</code>
     * @return Whether the allocatedBufferSize field is set.
     */
    boolean hasAllocatedBufferSize();
    /**
     * <pre>
     * allocated buffer size
     * </pre>
     *
     * <code>optional uint64 allocated_buffer_size = 12 [(.telemetry_options) = { ... }</code>
     * @return The allocatedBufferSize.
     */
    long getAllocatedBufferSize();
  }
  /**
   * Protobuf type {@code QueueStats}
   */
  public static final class QueueStats extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QueueStats)
      QueueStatsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QueueStats.newBuilder() to construct.
    private QueueStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QueueStats() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QueueStats();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_QueueStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_QueueStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder.class);
    }

    private int bitField0_;
    public static final int QUEUE_NUMBER_FIELD_NUMBER = 1;
    private int queueNumber_ = 0;
    /**
     * <code>optional uint32 queue_number = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the queueNumber field is set.
     */
    @java.lang.Override
    public boolean hasQueueNumber() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional uint32 queue_number = 1 [(.telemetry_options) = { ... }</code>
     * @return The queueNumber.
     */
    @java.lang.Override
    public int getQueueNumber() {
      return queueNumber_;
    }

    public static final int PACKETS_FIELD_NUMBER = 2;
    private long packets_ = 0L;
    /**
     * <pre>
     * Counter: the total number of packets that have been added to this queue
     * </pre>
     *
     * <code>optional uint64 packets = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the packets field is set.
     */
    @java.lang.Override
    public boolean hasPackets() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Counter: the total number of packets that have been added to this queue
     * </pre>
     *
     * <code>optional uint64 packets = 2 [(.telemetry_options) = { ... }</code>
     * @return The packets.
     */
    @java.lang.Override
    public long getPackets() {
      return packets_;
    }

    public static final int BYTES_FIELD_NUMBER = 3;
    private long bytes_ = 0L;
    /**
     * <pre>
     * Counter: the total number of bytes that have been added to this queue
     * </pre>
     *
     * <code>optional uint64 bytes = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the bytes field is set.
     */
    @java.lang.Override
    public boolean hasBytes() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Counter: the total number of bytes that have been added to this queue
     * </pre>
     *
     * <code>optional uint64 bytes = 3 [(.telemetry_options) = { ... }</code>
     * @return The bytes.
     */
    @java.lang.Override
    public long getBytes() {
      return bytes_;
    }

    public static final int TAIL_DROP_PACKETS_FIELD_NUMBER = 4;
    private long tailDropPackets_ = 0L;
    /**
     * <pre>
     * Counter: the total number of tail dropped packets
     * </pre>
     *
     * <code>optional uint64 tail_drop_packets = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the tailDropPackets field is set.
     */
    @java.lang.Override
    public boolean hasTailDropPackets() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Counter: the total number of tail dropped packets
     * </pre>
     *
     * <code>optional uint64 tail_drop_packets = 4 [(.telemetry_options) = { ... }</code>
     * @return The tailDropPackets.
     */
    @java.lang.Override
    public long getTailDropPackets() {
      return tailDropPackets_;
    }

    public static final int RL_DROP_PACKETS_FIELD_NUMBER = 5;
    private long rlDropPackets_ = 0L;
    /**
     * <pre>
     * Counter: the total number of rate-limitd packets
     * </pre>
     *
     * <code>optional uint64 rl_drop_packets = 5 [(.telemetry_options) = { ... }</code>
     * @return Whether the rlDropPackets field is set.
     */
    @java.lang.Override
    public boolean hasRlDropPackets() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * Counter: the total number of rate-limitd packets
     * </pre>
     *
     * <code>optional uint64 rl_drop_packets = 5 [(.telemetry_options) = { ... }</code>
     * @return The rlDropPackets.
     */
    @java.lang.Override
    public long getRlDropPackets() {
      return rlDropPackets_;
    }

    public static final int RL_DROP_BYTES_FIELD_NUMBER = 6;
    private long rlDropBytes_ = 0L;
    /**
     * <pre>
     * Counter: the total number of rate-limited bytes
     * </pre>
     *
     * <code>optional uint64 rl_drop_bytes = 6 [(.telemetry_options) = { ... }</code>
     * @return Whether the rlDropBytes field is set.
     */
    @java.lang.Override
    public boolean hasRlDropBytes() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * Counter: the total number of rate-limited bytes
     * </pre>
     *
     * <code>optional uint64 rl_drop_bytes = 6 [(.telemetry_options) = { ... }</code>
     * @return The rlDropBytes.
     */
    @java.lang.Override
    public long getRlDropBytes() {
      return rlDropBytes_;
    }

    public static final int RED_DROP_PACKETS_FIELD_NUMBER = 7;
    private long redDropPackets_ = 0L;
    /**
     * <pre>
     * Counter: the total number of red-dropped packets
     * </pre>
     *
     * <code>optional uint64 red_drop_packets = 7 [(.telemetry_options) = { ... }</code>
     * @return Whether the redDropPackets field is set.
     */
    @java.lang.Override
    public boolean hasRedDropPackets() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <pre>
     * Counter: the total number of red-dropped packets
     * </pre>
     *
     * <code>optional uint64 red_drop_packets = 7 [(.telemetry_options) = { ... }</code>
     * @return The redDropPackets.
     */
    @java.lang.Override
    public long getRedDropPackets() {
      return redDropPackets_;
    }

    public static final int RED_DROP_BYTES_FIELD_NUMBER = 8;
    private long redDropBytes_ = 0L;
    /**
     * <pre>
     * Counter: the total number of red-dropped bytes
     * </pre>
     *
     * <code>optional uint64 red_drop_bytes = 8 [(.telemetry_options) = { ... }</code>
     * @return Whether the redDropBytes field is set.
     */
    @java.lang.Override
    public boolean hasRedDropBytes() {
      return ((bitField0_ & 0x00000080) != 0);
    }
    /**
     * <pre>
     * Counter: the total number of red-dropped bytes
     * </pre>
     *
     * <code>optional uint64 red_drop_bytes = 8 [(.telemetry_options) = { ... }</code>
     * @return The redDropBytes.
     */
    @java.lang.Override
    public long getRedDropBytes() {
      return redDropBytes_;
    }

    public static final int AVG_BUFFER_OCCUPANCY_FIELD_NUMBER = 9;
    private long avgBufferOccupancy_ = 0L;
    /**
     * <pre>
     * Average: avg queue depth,TAQL:time-average-queue-len, in packets, details TBD
     * </pre>
     *
     * <code>optional uint64 avg_buffer_occupancy = 9 [(.telemetry_options) = { ... }</code>
     * @return Whether the avgBufferOccupancy field is set.
     */
    @java.lang.Override
    public boolean hasAvgBufferOccupancy() {
      return ((bitField0_ & 0x00000100) != 0);
    }
    /**
     * <pre>
     * Average: avg queue depth,TAQL:time-average-queue-len, in packets, details TBD
     * </pre>
     *
     * <code>optional uint64 avg_buffer_occupancy = 9 [(.telemetry_options) = { ... }</code>
     * @return The avgBufferOccupancy.
     */
    @java.lang.Override
    public long getAvgBufferOccupancy() {
      return avgBufferOccupancy_;
    }

    public static final int CUR_BUFFER_OCCUPANCY_FIELD_NUMBER = 10;
    private long curBufferOccupancy_ = 0L;
    /**
     * <pre>
     * Gauge: current queue depth, in packets
     * </pre>
     *
     * <code>optional uint64 cur_buffer_occupancy = 10 [(.telemetry_options) = { ... }</code>
     * @return Whether the curBufferOccupancy field is set.
     */
    @java.lang.Override
    public boolean hasCurBufferOccupancy() {
      return ((bitField0_ & 0x00000200) != 0);
    }
    /**
     * <pre>
     * Gauge: current queue depth, in packets
     * </pre>
     *
     * <code>optional uint64 cur_buffer_occupancy = 10 [(.telemetry_options) = { ... }</code>
     * @return The curBufferOccupancy.
     */
    @java.lang.Override
    public long getCurBufferOccupancy() {
      return curBufferOccupancy_;
    }

    public static final int PEAK_BUFFER_OCCUPANCY_FIELD_NUMBER = 11;
    private long peakBufferOccupancy_ = 0L;
    /**
     * <pre>
     * Peak: the max measured queue depth, in packets, across all measurements since bo ot.
     * </pre>
     *
     * <code>optional uint64 peak_buffer_occupancy = 11 [(.telemetry_options) = { ... }</code>
     * @return Whether the peakBufferOccupancy field is set.
     */
    @java.lang.Override
    public boolean hasPeakBufferOccupancy() {
      return ((bitField0_ & 0x00000400) != 0);
    }
    /**
     * <pre>
     * Peak: the max measured queue depth, in packets, across all measurements since bo ot.
     * </pre>
     *
     * <code>optional uint64 peak_buffer_occupancy = 11 [(.telemetry_options) = { ... }</code>
     * @return The peakBufferOccupancy.
     */
    @java.lang.Override
    public long getPeakBufferOccupancy() {
      return peakBufferOccupancy_;
    }

    public static final int ALLOCATED_BUFFER_SIZE_FIELD_NUMBER = 12;
    private long allocatedBufferSize_ = 0L;
    /**
     * <pre>
     * allocated buffer size
     * </pre>
     *
     * <code>optional uint64 allocated_buffer_size = 12 [(.telemetry_options) = { ... }</code>
     * @return Whether the allocatedBufferSize field is set.
     */
    @java.lang.Override
    public boolean hasAllocatedBufferSize() {
      return ((bitField0_ & 0x00000800) != 0);
    }
    /**
     * <pre>
     * allocated buffer size
     * </pre>
     *
     * <code>optional uint64 allocated_buffer_size = 12 [(.telemetry_options) = { ... }</code>
     * @return The allocatedBufferSize.
     */
    @java.lang.Override
    public long getAllocatedBufferSize() {
      return allocatedBufferSize_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeUInt32(1, queueNumber_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, packets_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt64(3, bytes_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeUInt64(4, tailDropPackets_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeUInt64(5, rlDropPackets_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeUInt64(6, rlDropBytes_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeUInt64(7, redDropPackets_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        output.writeUInt64(8, redDropBytes_);
      }
      if (((bitField0_ & 0x00000100) != 0)) {
        output.writeUInt64(9, avgBufferOccupancy_);
      }
      if (((bitField0_ & 0x00000200) != 0)) {
        output.writeUInt64(10, curBufferOccupancy_);
      }
      if (((bitField0_ & 0x00000400) != 0)) {
        output.writeUInt64(11, peakBufferOccupancy_);
      }
      if (((bitField0_ & 0x00000800) != 0)) {
        output.writeUInt64(12, allocatedBufferSize_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, queueNumber_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, packets_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, bytes_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, tailDropPackets_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, rlDropPackets_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, rlDropBytes_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, redDropPackets_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, redDropBytes_);
      }
      if (((bitField0_ & 0x00000100) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(9, avgBufferOccupancy_);
      }
      if (((bitField0_ & 0x00000200) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(10, curBufferOccupancy_);
      }
      if (((bitField0_ & 0x00000400) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(11, peakBufferOccupancy_);
      }
      if (((bitField0_ & 0x00000800) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(12, allocatedBufferSize_);
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
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats) obj;

      if (hasQueueNumber() != other.hasQueueNumber()) return false;
      if (hasQueueNumber()) {
        if (getQueueNumber()
            != other.getQueueNumber()) return false;
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
      if (hasTailDropPackets() != other.hasTailDropPackets()) return false;
      if (hasTailDropPackets()) {
        if (getTailDropPackets()
            != other.getTailDropPackets()) return false;
      }
      if (hasRlDropPackets() != other.hasRlDropPackets()) return false;
      if (hasRlDropPackets()) {
        if (getRlDropPackets()
            != other.getRlDropPackets()) return false;
      }
      if (hasRlDropBytes() != other.hasRlDropBytes()) return false;
      if (hasRlDropBytes()) {
        if (getRlDropBytes()
            != other.getRlDropBytes()) return false;
      }
      if (hasRedDropPackets() != other.hasRedDropPackets()) return false;
      if (hasRedDropPackets()) {
        if (getRedDropPackets()
            != other.getRedDropPackets()) return false;
      }
      if (hasRedDropBytes() != other.hasRedDropBytes()) return false;
      if (hasRedDropBytes()) {
        if (getRedDropBytes()
            != other.getRedDropBytes()) return false;
      }
      if (hasAvgBufferOccupancy() != other.hasAvgBufferOccupancy()) return false;
      if (hasAvgBufferOccupancy()) {
        if (getAvgBufferOccupancy()
            != other.getAvgBufferOccupancy()) return false;
      }
      if (hasCurBufferOccupancy() != other.hasCurBufferOccupancy()) return false;
      if (hasCurBufferOccupancy()) {
        if (getCurBufferOccupancy()
            != other.getCurBufferOccupancy()) return false;
      }
      if (hasPeakBufferOccupancy() != other.hasPeakBufferOccupancy()) return false;
      if (hasPeakBufferOccupancy()) {
        if (getPeakBufferOccupancy()
            != other.getPeakBufferOccupancy()) return false;
      }
      if (hasAllocatedBufferSize() != other.hasAllocatedBufferSize()) return false;
      if (hasAllocatedBufferSize()) {
        if (getAllocatedBufferSize()
            != other.getAllocatedBufferSize()) return false;
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
      if (hasQueueNumber()) {
        hash = (37 * hash) + QUEUE_NUMBER_FIELD_NUMBER;
        hash = (53 * hash) + getQueueNumber();
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
      if (hasTailDropPackets()) {
        hash = (37 * hash) + TAIL_DROP_PACKETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getTailDropPackets());
      }
      if (hasRlDropPackets()) {
        hash = (37 * hash) + RL_DROP_PACKETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getRlDropPackets());
      }
      if (hasRlDropBytes()) {
        hash = (37 * hash) + RL_DROP_BYTES_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getRlDropBytes());
      }
      if (hasRedDropPackets()) {
        hash = (37 * hash) + RED_DROP_PACKETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getRedDropPackets());
      }
      if (hasRedDropBytes()) {
        hash = (37 * hash) + RED_DROP_BYTES_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getRedDropBytes());
      }
      if (hasAvgBufferOccupancy()) {
        hash = (37 * hash) + AVG_BUFFER_OCCUPANCY_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getAvgBufferOccupancy());
      }
      if (hasCurBufferOccupancy()) {
        hash = (37 * hash) + CUR_BUFFER_OCCUPANCY_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getCurBufferOccupancy());
      }
      if (hasPeakBufferOccupancy()) {
        hash = (37 * hash) + PEAK_BUFFER_OCCUPANCY_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getPeakBufferOccupancy());
      }
      if (hasAllocatedBufferSize()) {
        hash = (37 * hash) + ALLOCATED_BUFFER_SIZE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getAllocatedBufferSize());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats prototype) {
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
     * Protobuf type {@code QueueStats}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QueueStats)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStatsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_QueueStats_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_QueueStats_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.newBuilder()
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
        queueNumber_ = 0;
        packets_ = 0L;
        bytes_ = 0L;
        tailDropPackets_ = 0L;
        rlDropPackets_ = 0L;
        rlDropBytes_ = 0L;
        redDropPackets_ = 0L;
        redDropBytes_ = 0L;
        avgBufferOccupancy_ = 0L;
        curBufferOccupancy_ = 0L;
        peakBufferOccupancy_ = 0L;
        allocatedBufferSize_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.internal_static_QueueStats_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.queueNumber_ = queueNumber_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.packets_ = packets_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.bytes_ = bytes_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.tailDropPackets_ = tailDropPackets_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.rlDropPackets_ = rlDropPackets_;
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.rlDropBytes_ = rlDropBytes_;
          to_bitField0_ |= 0x00000020;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.redDropPackets_ = redDropPackets_;
          to_bitField0_ |= 0x00000040;
        }
        if (((from_bitField0_ & 0x00000080) != 0)) {
          result.redDropBytes_ = redDropBytes_;
          to_bitField0_ |= 0x00000080;
        }
        if (((from_bitField0_ & 0x00000100) != 0)) {
          result.avgBufferOccupancy_ = avgBufferOccupancy_;
          to_bitField0_ |= 0x00000100;
        }
        if (((from_bitField0_ & 0x00000200) != 0)) {
          result.curBufferOccupancy_ = curBufferOccupancy_;
          to_bitField0_ |= 0x00000200;
        }
        if (((from_bitField0_ & 0x00000400) != 0)) {
          result.peakBufferOccupancy_ = peakBufferOccupancy_;
          to_bitField0_ |= 0x00000400;
        }
        if (((from_bitField0_ & 0x00000800) != 0)) {
          result.allocatedBufferSize_ = allocatedBufferSize_;
          to_bitField0_ |= 0x00000800;
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats.getDefaultInstance()) return this;
        if (other.hasQueueNumber()) {
          setQueueNumber(other.getQueueNumber());
        }
        if (other.hasPackets()) {
          setPackets(other.getPackets());
        }
        if (other.hasBytes()) {
          setBytes(other.getBytes());
        }
        if (other.hasTailDropPackets()) {
          setTailDropPackets(other.getTailDropPackets());
        }
        if (other.hasRlDropPackets()) {
          setRlDropPackets(other.getRlDropPackets());
        }
        if (other.hasRlDropBytes()) {
          setRlDropBytes(other.getRlDropBytes());
        }
        if (other.hasRedDropPackets()) {
          setRedDropPackets(other.getRedDropPackets());
        }
        if (other.hasRedDropBytes()) {
          setRedDropBytes(other.getRedDropBytes());
        }
        if (other.hasAvgBufferOccupancy()) {
          setAvgBufferOccupancy(other.getAvgBufferOccupancy());
        }
        if (other.hasCurBufferOccupancy()) {
          setCurBufferOccupancy(other.getCurBufferOccupancy());
        }
        if (other.hasPeakBufferOccupancy()) {
          setPeakBufferOccupancy(other.getPeakBufferOccupancy());
        }
        if (other.hasAllocatedBufferSize()) {
          setAllocatedBufferSize(other.getAllocatedBufferSize());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
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
              case 8: {
                queueNumber_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                packets_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                bytes_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                tailDropPackets_ = input.readUInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 40: {
                rlDropPackets_ = input.readUInt64();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              case 48: {
                rlDropBytes_ = input.readUInt64();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
              case 56: {
                redDropPackets_ = input.readUInt64();
                bitField0_ |= 0x00000040;
                break;
              } // case 56
              case 64: {
                redDropBytes_ = input.readUInt64();
                bitField0_ |= 0x00000080;
                break;
              } // case 64
              case 72: {
                avgBufferOccupancy_ = input.readUInt64();
                bitField0_ |= 0x00000100;
                break;
              } // case 72
              case 80: {
                curBufferOccupancy_ = input.readUInt64();
                bitField0_ |= 0x00000200;
                break;
              } // case 80
              case 88: {
                peakBufferOccupancy_ = input.readUInt64();
                bitField0_ |= 0x00000400;
                break;
              } // case 88
              case 96: {
                allocatedBufferSize_ = input.readUInt64();
                bitField0_ |= 0x00000800;
                break;
              } // case 96
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

      private int queueNumber_ ;
      /**
       * <code>optional uint32 queue_number = 1 [(.telemetry_options) = { ... }</code>
       * @return Whether the queueNumber field is set.
       */
      @java.lang.Override
      public boolean hasQueueNumber() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional uint32 queue_number = 1 [(.telemetry_options) = { ... }</code>
       * @return The queueNumber.
       */
      @java.lang.Override
      public int getQueueNumber() {
        return queueNumber_;
      }
      /**
       * <code>optional uint32 queue_number = 1 [(.telemetry_options) = { ... }</code>
       * @param value The queueNumber to set.
       * @return This builder for chaining.
       */
      public Builder setQueueNumber(int value) {

        queueNumber_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 queue_number = 1 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearQueueNumber() {
        bitField0_ = (bitField0_ & ~0x00000001);
        queueNumber_ = 0;
        onChanged();
        return this;
      }

      private long packets_ ;
      /**
       * <pre>
       * Counter: the total number of packets that have been added to this queue
       * </pre>
       *
       * <code>optional uint64 packets = 2 [(.telemetry_options) = { ... }</code>
       * @return Whether the packets field is set.
       */
      @java.lang.Override
      public boolean hasPackets() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Counter: the total number of packets that have been added to this queue
       * </pre>
       *
       * <code>optional uint64 packets = 2 [(.telemetry_options) = { ... }</code>
       * @return The packets.
       */
      @java.lang.Override
      public long getPackets() {
        return packets_;
      }
      /**
       * <pre>
       * Counter: the total number of packets that have been added to this queue
       * </pre>
       *
       * <code>optional uint64 packets = 2 [(.telemetry_options) = { ... }</code>
       * @param value The packets to set.
       * @return This builder for chaining.
       */
      public Builder setPackets(long value) {

        packets_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the total number of packets that have been added to this queue
       * </pre>
       *
       * <code>optional uint64 packets = 2 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearPackets() {
        bitField0_ = (bitField0_ & ~0x00000002);
        packets_ = 0L;
        onChanged();
        return this;
      }

      private long bytes_ ;
      /**
       * <pre>
       * Counter: the total number of bytes that have been added to this queue
       * </pre>
       *
       * <code>optional uint64 bytes = 3 [(.telemetry_options) = { ... }</code>
       * @return Whether the bytes field is set.
       */
      @java.lang.Override
      public boolean hasBytes() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Counter: the total number of bytes that have been added to this queue
       * </pre>
       *
       * <code>optional uint64 bytes = 3 [(.telemetry_options) = { ... }</code>
       * @return The bytes.
       */
      @java.lang.Override
      public long getBytes() {
        return bytes_;
      }
      /**
       * <pre>
       * Counter: the total number of bytes that have been added to this queue
       * </pre>
       *
       * <code>optional uint64 bytes = 3 [(.telemetry_options) = { ... }</code>
       * @param value The bytes to set.
       * @return This builder for chaining.
       */
      public Builder setBytes(long value) {

        bytes_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the total number of bytes that have been added to this queue
       * </pre>
       *
       * <code>optional uint64 bytes = 3 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearBytes() {
        bitField0_ = (bitField0_ & ~0x00000004);
        bytes_ = 0L;
        onChanged();
        return this;
      }

      private long tailDropPackets_ ;
      /**
       * <pre>
       * Counter: the total number of tail dropped packets
       * </pre>
       *
       * <code>optional uint64 tail_drop_packets = 4 [(.telemetry_options) = { ... }</code>
       * @return Whether the tailDropPackets field is set.
       */
      @java.lang.Override
      public boolean hasTailDropPackets() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * Counter: the total number of tail dropped packets
       * </pre>
       *
       * <code>optional uint64 tail_drop_packets = 4 [(.telemetry_options) = { ... }</code>
       * @return The tailDropPackets.
       */
      @java.lang.Override
      public long getTailDropPackets() {
        return tailDropPackets_;
      }
      /**
       * <pre>
       * Counter: the total number of tail dropped packets
       * </pre>
       *
       * <code>optional uint64 tail_drop_packets = 4 [(.telemetry_options) = { ... }</code>
       * @param value The tailDropPackets to set.
       * @return This builder for chaining.
       */
      public Builder setTailDropPackets(long value) {

        tailDropPackets_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the total number of tail dropped packets
       * </pre>
       *
       * <code>optional uint64 tail_drop_packets = 4 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearTailDropPackets() {
        bitField0_ = (bitField0_ & ~0x00000008);
        tailDropPackets_ = 0L;
        onChanged();
        return this;
      }

      private long rlDropPackets_ ;
      /**
       * <pre>
       * Counter: the total number of rate-limitd packets
       * </pre>
       *
       * <code>optional uint64 rl_drop_packets = 5 [(.telemetry_options) = { ... }</code>
       * @return Whether the rlDropPackets field is set.
       */
      @java.lang.Override
      public boolean hasRlDropPackets() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       * Counter: the total number of rate-limitd packets
       * </pre>
       *
       * <code>optional uint64 rl_drop_packets = 5 [(.telemetry_options) = { ... }</code>
       * @return The rlDropPackets.
       */
      @java.lang.Override
      public long getRlDropPackets() {
        return rlDropPackets_;
      }
      /**
       * <pre>
       * Counter: the total number of rate-limitd packets
       * </pre>
       *
       * <code>optional uint64 rl_drop_packets = 5 [(.telemetry_options) = { ... }</code>
       * @param value The rlDropPackets to set.
       * @return This builder for chaining.
       */
      public Builder setRlDropPackets(long value) {

        rlDropPackets_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the total number of rate-limitd packets
       * </pre>
       *
       * <code>optional uint64 rl_drop_packets = 5 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearRlDropPackets() {
        bitField0_ = (bitField0_ & ~0x00000010);
        rlDropPackets_ = 0L;
        onChanged();
        return this;
      }

      private long rlDropBytes_ ;
      /**
       * <pre>
       * Counter: the total number of rate-limited bytes
       * </pre>
       *
       * <code>optional uint64 rl_drop_bytes = 6 [(.telemetry_options) = { ... }</code>
       * @return Whether the rlDropBytes field is set.
       */
      @java.lang.Override
      public boolean hasRlDropBytes() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <pre>
       * Counter: the total number of rate-limited bytes
       * </pre>
       *
       * <code>optional uint64 rl_drop_bytes = 6 [(.telemetry_options) = { ... }</code>
       * @return The rlDropBytes.
       */
      @java.lang.Override
      public long getRlDropBytes() {
        return rlDropBytes_;
      }
      /**
       * <pre>
       * Counter: the total number of rate-limited bytes
       * </pre>
       *
       * <code>optional uint64 rl_drop_bytes = 6 [(.telemetry_options) = { ... }</code>
       * @param value The rlDropBytes to set.
       * @return This builder for chaining.
       */
      public Builder setRlDropBytes(long value) {

        rlDropBytes_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the total number of rate-limited bytes
       * </pre>
       *
       * <code>optional uint64 rl_drop_bytes = 6 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearRlDropBytes() {
        bitField0_ = (bitField0_ & ~0x00000020);
        rlDropBytes_ = 0L;
        onChanged();
        return this;
      }

      private long redDropPackets_ ;
      /**
       * <pre>
       * Counter: the total number of red-dropped packets
       * </pre>
       *
       * <code>optional uint64 red_drop_packets = 7 [(.telemetry_options) = { ... }</code>
       * @return Whether the redDropPackets field is set.
       */
      @java.lang.Override
      public boolean hasRedDropPackets() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <pre>
       * Counter: the total number of red-dropped packets
       * </pre>
       *
       * <code>optional uint64 red_drop_packets = 7 [(.telemetry_options) = { ... }</code>
       * @return The redDropPackets.
       */
      @java.lang.Override
      public long getRedDropPackets() {
        return redDropPackets_;
      }
      /**
       * <pre>
       * Counter: the total number of red-dropped packets
       * </pre>
       *
       * <code>optional uint64 red_drop_packets = 7 [(.telemetry_options) = { ... }</code>
       * @param value The redDropPackets to set.
       * @return This builder for chaining.
       */
      public Builder setRedDropPackets(long value) {

        redDropPackets_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the total number of red-dropped packets
       * </pre>
       *
       * <code>optional uint64 red_drop_packets = 7 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearRedDropPackets() {
        bitField0_ = (bitField0_ & ~0x00000040);
        redDropPackets_ = 0L;
        onChanged();
        return this;
      }

      private long redDropBytes_ ;
      /**
       * <pre>
       * Counter: the total number of red-dropped bytes
       * </pre>
       *
       * <code>optional uint64 red_drop_bytes = 8 [(.telemetry_options) = { ... }</code>
       * @return Whether the redDropBytes field is set.
       */
      @java.lang.Override
      public boolean hasRedDropBytes() {
        return ((bitField0_ & 0x00000080) != 0);
      }
      /**
       * <pre>
       * Counter: the total number of red-dropped bytes
       * </pre>
       *
       * <code>optional uint64 red_drop_bytes = 8 [(.telemetry_options) = { ... }</code>
       * @return The redDropBytes.
       */
      @java.lang.Override
      public long getRedDropBytes() {
        return redDropBytes_;
      }
      /**
       * <pre>
       * Counter: the total number of red-dropped bytes
       * </pre>
       *
       * <code>optional uint64 red_drop_bytes = 8 [(.telemetry_options) = { ... }</code>
       * @param value The redDropBytes to set.
       * @return This builder for chaining.
       */
      public Builder setRedDropBytes(long value) {

        redDropBytes_ = value;
        bitField0_ |= 0x00000080;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter: the total number of red-dropped bytes
       * </pre>
       *
       * <code>optional uint64 red_drop_bytes = 8 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearRedDropBytes() {
        bitField0_ = (bitField0_ & ~0x00000080);
        redDropBytes_ = 0L;
        onChanged();
        return this;
      }

      private long avgBufferOccupancy_ ;
      /**
       * <pre>
       * Average: avg queue depth,TAQL:time-average-queue-len, in packets, details TBD
       * </pre>
       *
       * <code>optional uint64 avg_buffer_occupancy = 9 [(.telemetry_options) = { ... }</code>
       * @return Whether the avgBufferOccupancy field is set.
       */
      @java.lang.Override
      public boolean hasAvgBufferOccupancy() {
        return ((bitField0_ & 0x00000100) != 0);
      }
      /**
       * <pre>
       * Average: avg queue depth,TAQL:time-average-queue-len, in packets, details TBD
       * </pre>
       *
       * <code>optional uint64 avg_buffer_occupancy = 9 [(.telemetry_options) = { ... }</code>
       * @return The avgBufferOccupancy.
       */
      @java.lang.Override
      public long getAvgBufferOccupancy() {
        return avgBufferOccupancy_;
      }
      /**
       * <pre>
       * Average: avg queue depth,TAQL:time-average-queue-len, in packets, details TBD
       * </pre>
       *
       * <code>optional uint64 avg_buffer_occupancy = 9 [(.telemetry_options) = { ... }</code>
       * @param value The avgBufferOccupancy to set.
       * @return This builder for chaining.
       */
      public Builder setAvgBufferOccupancy(long value) {

        avgBufferOccupancy_ = value;
        bitField0_ |= 0x00000100;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Average: avg queue depth,TAQL:time-average-queue-len, in packets, details TBD
       * </pre>
       *
       * <code>optional uint64 avg_buffer_occupancy = 9 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearAvgBufferOccupancy() {
        bitField0_ = (bitField0_ & ~0x00000100);
        avgBufferOccupancy_ = 0L;
        onChanged();
        return this;
      }

      private long curBufferOccupancy_ ;
      /**
       * <pre>
       * Gauge: current queue depth, in packets
       * </pre>
       *
       * <code>optional uint64 cur_buffer_occupancy = 10 [(.telemetry_options) = { ... }</code>
       * @return Whether the curBufferOccupancy field is set.
       */
      @java.lang.Override
      public boolean hasCurBufferOccupancy() {
        return ((bitField0_ & 0x00000200) != 0);
      }
      /**
       * <pre>
       * Gauge: current queue depth, in packets
       * </pre>
       *
       * <code>optional uint64 cur_buffer_occupancy = 10 [(.telemetry_options) = { ... }</code>
       * @return The curBufferOccupancy.
       */
      @java.lang.Override
      public long getCurBufferOccupancy() {
        return curBufferOccupancy_;
      }
      /**
       * <pre>
       * Gauge: current queue depth, in packets
       * </pre>
       *
       * <code>optional uint64 cur_buffer_occupancy = 10 [(.telemetry_options) = { ... }</code>
       * @param value The curBufferOccupancy to set.
       * @return This builder for chaining.
       */
      public Builder setCurBufferOccupancy(long value) {

        curBufferOccupancy_ = value;
        bitField0_ |= 0x00000200;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Gauge: current queue depth, in packets
       * </pre>
       *
       * <code>optional uint64 cur_buffer_occupancy = 10 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearCurBufferOccupancy() {
        bitField0_ = (bitField0_ & ~0x00000200);
        curBufferOccupancy_ = 0L;
        onChanged();
        return this;
      }

      private long peakBufferOccupancy_ ;
      /**
       * <pre>
       * Peak: the max measured queue depth, in packets, across all measurements since bo ot.
       * </pre>
       *
       * <code>optional uint64 peak_buffer_occupancy = 11 [(.telemetry_options) = { ... }</code>
       * @return Whether the peakBufferOccupancy field is set.
       */
      @java.lang.Override
      public boolean hasPeakBufferOccupancy() {
        return ((bitField0_ & 0x00000400) != 0);
      }
      /**
       * <pre>
       * Peak: the max measured queue depth, in packets, across all measurements since bo ot.
       * </pre>
       *
       * <code>optional uint64 peak_buffer_occupancy = 11 [(.telemetry_options) = { ... }</code>
       * @return The peakBufferOccupancy.
       */
      @java.lang.Override
      public long getPeakBufferOccupancy() {
        return peakBufferOccupancy_;
      }
      /**
       * <pre>
       * Peak: the max measured queue depth, in packets, across all measurements since bo ot.
       * </pre>
       *
       * <code>optional uint64 peak_buffer_occupancy = 11 [(.telemetry_options) = { ... }</code>
       * @param value The peakBufferOccupancy to set.
       * @return This builder for chaining.
       */
      public Builder setPeakBufferOccupancy(long value) {

        peakBufferOccupancy_ = value;
        bitField0_ |= 0x00000400;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Peak: the max measured queue depth, in packets, across all measurements since bo ot.
       * </pre>
       *
       * <code>optional uint64 peak_buffer_occupancy = 11 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearPeakBufferOccupancy() {
        bitField0_ = (bitField0_ & ~0x00000400);
        peakBufferOccupancy_ = 0L;
        onChanged();
        return this;
      }

      private long allocatedBufferSize_ ;
      /**
       * <pre>
       * allocated buffer size
       * </pre>
       *
       * <code>optional uint64 allocated_buffer_size = 12 [(.telemetry_options) = { ... }</code>
       * @return Whether the allocatedBufferSize field is set.
       */
      @java.lang.Override
      public boolean hasAllocatedBufferSize() {
        return ((bitField0_ & 0x00000800) != 0);
      }
      /**
       * <pre>
       * allocated buffer size
       * </pre>
       *
       * <code>optional uint64 allocated_buffer_size = 12 [(.telemetry_options) = { ... }</code>
       * @return The allocatedBufferSize.
       */
      @java.lang.Override
      public long getAllocatedBufferSize() {
        return allocatedBufferSize_;
      }
      /**
       * <pre>
       * allocated buffer size
       * </pre>
       *
       * <code>optional uint64 allocated_buffer_size = 12 [(.telemetry_options) = { ... }</code>
       * @param value The allocatedBufferSize to set.
       * @return This builder for chaining.
       */
      public Builder setAllocatedBufferSize(long value) {

        allocatedBufferSize_ = value;
        bitField0_ |= 0x00000800;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * allocated buffer size
       * </pre>
       *
       * <code>optional uint64 allocated_buffer_size = 12 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearAllocatedBufferSize() {
        bitField0_ = (bitField0_ & ~0x00000800);
        allocatedBufferSize_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:QueueStats)
    }

    // @@protoc_insertion_point(class_scope:QueueStats)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<QueueStats>
        PARSER = new com.google.protobuf.AbstractParser<QueueStats>() {
      @java.lang.Override
      public QueueStats parsePartialFrom(
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

    public static com.google.protobuf.Parser<QueueStats> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QueueStats> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.QueueStats getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int JNPR_INTERFACE_EXT_FIELD_NUMBER = 3;
  /**
   * <code>extend .JuniperNetworksSensors { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors,
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort> jnprInterfaceExt = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort.class,
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.Port.GPort.getDefaultInstance());
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GPort_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GPort_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InterfaceInfos_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InterfaceInfos_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InterfaceStats_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InterfaceStats_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IngressInterfaceErrors_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IngressInterfaceErrors_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QueueStats_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QueueStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nport.proto\032\023telemetry_top.proto\"1\n\005GPo" +
      "rt\022(\n\017interface_stats\030\001 \003(\0132\017.InterfaceI" +
      "nfos\"\273\002\n\016InterfaceInfos\022\026\n\007if_name\030\001 \002(\t" +
      "B\005\202@\002\010\001\022\021\n\tinit_time\030\002 \002(\004\022\025\n\rsnmp_if_in" +
      "dex\030\003 \001(\r\022\026\n\016parent_ae_name\030\004 \001(\t\022&\n\021egr" +
      "ess_queue_info\030\005 \003(\0132\013.QueueStats\022\'\n\022ing" +
      "ress_queue_info\030\006 \003(\0132\013.QueueStats\022&\n\rin" +
      "gress_stats\030\007 \001(\0132\017.InterfaceStats\022%\n\014eg" +
      "ress_stats\030\010 \001(\0132\017.InterfaceStats\022/\n\016ing" +
      "ress_errors\030\t \001(\0132\027.IngressInterfaceErro" +
      "rs\"\317\001\n\016InterfaceStats\022\026\n\007if_pkts\030\001 \002(\004B\005" +
      "\202@\002\030\001\022\030\n\tif_octets\030\002 \002(\004B\005\202@\002\030\001\022\033\n\014if_1s" +
      "ec_pkts\030\003 \002(\004B\005\202@\002 \001\022\035\n\016if_1sec_octets\030\004" +
      " \002(\004B\005\202@\002 \001\022\031\n\nif_uc_pkts\030\005 \002(\004B\005\202@\002\030\001\022\031" +
      "\n\nif_mc_pkts\030\006 \002(\004B\005\202@\002\030\001\022\031\n\nif_bc_pkts\030" +
      "\007 \002(\004B\005\202@\002\030\001\"\354\002\n\026IngressInterfaceErrors\022" +
      "\033\n\014if_in_errors\030\001 \001(\004B\005\202@\002\030\001\022\033\n\014if_in_qd" +
      "rops\030\002 \001(\004B\005\202@\002\030\001\022!\n\022if_in_frame_errors\030" +
      "\003 \001(\004B\005\202@\002\030\001\022\035\n\016if_in_discards\030\004 \001(\004B\005\202@" +
      "\002\030\001\022\032\n\013if_in_runts\030\005 \001(\004B\005\202@\002\030\001\022#\n\024if_in" +
      "_l3_incompletes\030\006 \001(\004B\005\202@\002\030\001\022\"\n\023if_in_l2" +
      "chan_errors\030\007 \001(\004B\005\202@\002\030\001\022)\n\032if_in_l2_mis" +
      "match_timeouts\030\010 \001(\004B\005\202@\002\030\001\022 \n\021if_in_fif" +
      "o_errors\030\t \001(\004B\005\202@\002\030\001\022$\n\025if_in_resource_" +
      "errors\030\n \001(\004B\005\202@\002\030\001\"\215\003\n\nQueueStats\022\033\n\014qu" +
      "eue_number\030\001 \001(\rB\005\202@\002\010\001\022\026\n\007packets\030\002 \001(\004" +
      "B\005\202@\002\030\001\022\024\n\005bytes\030\003 \001(\004B\005\202@\002\030\001\022 \n\021tail_dr" +
      "op_packets\030\004 \001(\004B\005\202@\002\030\001\022\036\n\017rl_drop_packe" +
      "ts\030\005 \001(\004B\005\202@\002\030\001\022\034\n\rrl_drop_bytes\030\006 \001(\004B\005" +
      "\202@\002\030\001\022\037\n\020red_drop_packets\030\007 \001(\004B\005\202@\002\030\001\022\035" +
      "\n\016red_drop_bytes\030\010 \001(\004B\005\202@\002\030\001\022#\n\024avg_buf" +
      "fer_occupancy\030\t \001(\004B\005\202@\002 \001\022#\n\024cur_buffer" +
      "_occupancy\030\n \001(\004B\005\202@\002 \001\022$\n\025peak_buffer_o" +
      "ccupancy\030\013 \001(\004B\005\202@\002 \001\022$\n\025allocated_buffe" +
      "r_size\030\014 \001(\004B\005\202@\002 \001:;\n\022jnpr_interface_ex" +
      "t\022\027.JuniperNetworksSensors\030\003 \001(\0132\006.GPort" +
      "B:\n8org.opennms.netmgt.telemetry.protoco" +
      "ls.jti.adapter.proto"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.getDescriptor(),
        });
    internal_static_GPort_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GPort_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GPort_descriptor,
        new java.lang.String[] { "InterfaceStats", });
    internal_static_InterfaceInfos_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_InterfaceInfos_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InterfaceInfos_descriptor,
        new java.lang.String[] { "IfName", "InitTime", "SnmpIfIndex", "ParentAeName", "EgressQueueInfo", "IngressQueueInfo", "IngressStats", "EgressStats", "IngressErrors", });
    internal_static_InterfaceStats_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_InterfaceStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InterfaceStats_descriptor,
        new java.lang.String[] { "IfPkts", "IfOctets", "If1SecPkts", "If1SecOctets", "IfUcPkts", "IfMcPkts", "IfBcPkts", });
    internal_static_IngressInterfaceErrors_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_IngressInterfaceErrors_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IngressInterfaceErrors_descriptor,
        new java.lang.String[] { "IfInErrors", "IfInQdrops", "IfInFrameErrors", "IfInDiscards", "IfInRunts", "IfInL3Incompletes", "IfInL2ChanErrors", "IfInL2MismatchTimeouts", "IfInFifoErrors", "IfInResourceErrors", });
    internal_static_QueueStats_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_QueueStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QueueStats_descriptor,
        new java.lang.String[] { "QueueNumber", "Packets", "Bytes", "TailDropPackets", "RlDropPackets", "RlDropBytes", "RedDropPackets", "RedDropBytes", "AvgBufferOccupancy", "CurBufferOccupancy", "PeakBufferOccupancy", "AllocatedBufferSize", });
    jnprInterfaceExt.internalInit(descriptor.getExtensions().get(0));
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.telemetryOptions);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
