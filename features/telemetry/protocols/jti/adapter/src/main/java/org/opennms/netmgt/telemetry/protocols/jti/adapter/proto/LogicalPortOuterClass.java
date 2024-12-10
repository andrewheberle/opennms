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

public final class LogicalPortOuterClass {
  private LogicalPortOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.jnprLogicalInterfaceExt);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LogicalPortOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LogicalPort)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
     */
    java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo> 
        getInterfaceInfoList();
    /**
     * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo getInterfaceInfo(int index);
    /**
     * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
     */
    int getInterfaceInfoCount();
    /**
     * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
     */
    java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfoOrBuilder> 
        getInterfaceInfoOrBuilderList();
    /**
     * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfoOrBuilder getInterfaceInfoOrBuilder(
        int index);
  }
  /**
   * <pre>
   *
   * Top-level message
   * </pre>
   *
   * Protobuf type {@code LogicalPort}
   */
  public static final class LogicalPort extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LogicalPort)
      LogicalPortOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LogicalPort.newBuilder() to construct.
    private LogicalPort(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LogicalPort() {
      interfaceInfo_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LogicalPort();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_LogicalPort_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_LogicalPort_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort.Builder.class);
    }

    public static final int INTERFACE_INFO_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo> interfaceInfo_;
    /**
     * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo> getInterfaceInfoList() {
      return interfaceInfo_;
    }
    /**
     * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfoOrBuilder> 
        getInterfaceInfoOrBuilderList() {
      return interfaceInfo_;
    }
    /**
     * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
     */
    @java.lang.Override
    public int getInterfaceInfoCount() {
      return interfaceInfo_.size();
    }
    /**
     * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo getInterfaceInfo(int index) {
      return interfaceInfo_.get(index);
    }
    /**
     * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfoOrBuilder getInterfaceInfoOrBuilder(
        int index) {
      return interfaceInfo_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getInterfaceInfoCount(); i++) {
        if (!getInterfaceInfo(i).isInitialized()) {
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
      for (int i = 0; i < interfaceInfo_.size(); i++) {
        output.writeMessage(1, interfaceInfo_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < interfaceInfo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, interfaceInfo_.get(i));
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
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort) obj;

      if (!getInterfaceInfoList()
          .equals(other.getInterfaceInfoList())) return false;
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
      if (getInterfaceInfoCount() > 0) {
        hash = (37 * hash) + INTERFACE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getInterfaceInfoList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort prototype) {
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
     * Protobuf type {@code LogicalPort}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LogicalPort)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPortOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_LogicalPort_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_LogicalPort_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort.newBuilder()
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
        if (interfaceInfoBuilder_ == null) {
          interfaceInfo_ = java.util.Collections.emptyList();
        } else {
          interfaceInfo_ = null;
          interfaceInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_LogicalPort_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort result) {
        if (interfaceInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            interfaceInfo_ = java.util.Collections.unmodifiableList(interfaceInfo_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.interfaceInfo_ = interfaceInfo_;
        } else {
          result.interfaceInfo_ = interfaceInfoBuilder_.build();
        }
      }

      private void buildPartial0(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort result) {
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort.getDefaultInstance()) return this;
        if (interfaceInfoBuilder_ == null) {
          if (!other.interfaceInfo_.isEmpty()) {
            if (interfaceInfo_.isEmpty()) {
              interfaceInfo_ = other.interfaceInfo_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureInterfaceInfoIsMutable();
              interfaceInfo_.addAll(other.interfaceInfo_);
            }
            onChanged();
          }
        } else {
          if (!other.interfaceInfo_.isEmpty()) {
            if (interfaceInfoBuilder_.isEmpty()) {
              interfaceInfoBuilder_.dispose();
              interfaceInfoBuilder_ = null;
              interfaceInfo_ = other.interfaceInfo_;
              bitField0_ = (bitField0_ & ~0x00000001);
              interfaceInfoBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getInterfaceInfoFieldBuilder() : null;
            } else {
              interfaceInfoBuilder_.addAllMessages(other.interfaceInfo_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getInterfaceInfoCount(); i++) {
          if (!getInterfaceInfo(i).isInitialized()) {
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
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo m =
                    input.readMessage(
                        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.PARSER,
                        extensionRegistry);
                if (interfaceInfoBuilder_ == null) {
                  ensureInterfaceInfoIsMutable();
                  interfaceInfo_.add(m);
                } else {
                  interfaceInfoBuilder_.addMessage(m);
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

      private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo> interfaceInfo_ =
        java.util.Collections.emptyList();
      private void ensureInterfaceInfoIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          interfaceInfo_ = new java.util.ArrayList<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo>(interfaceInfo_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfoOrBuilder> interfaceInfoBuilder_;

      /**
       * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo> getInterfaceInfoList() {
        if (interfaceInfoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(interfaceInfo_);
        } else {
          return interfaceInfoBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
       */
      public int getInterfaceInfoCount() {
        if (interfaceInfoBuilder_ == null) {
          return interfaceInfo_.size();
        } else {
          return interfaceInfoBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo getInterfaceInfo(int index) {
        if (interfaceInfoBuilder_ == null) {
          return interfaceInfo_.get(index);
        } else {
          return interfaceInfoBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
       */
      public Builder setInterfaceInfo(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo value) {
        if (interfaceInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInterfaceInfoIsMutable();
          interfaceInfo_.set(index, value);
          onChanged();
        } else {
          interfaceInfoBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
       */
      public Builder setInterfaceInfo(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.Builder builderForValue) {
        if (interfaceInfoBuilder_ == null) {
          ensureInterfaceInfoIsMutable();
          interfaceInfo_.set(index, builderForValue.build());
          onChanged();
        } else {
          interfaceInfoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
       */
      public Builder addInterfaceInfo(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo value) {
        if (interfaceInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInterfaceInfoIsMutable();
          interfaceInfo_.add(value);
          onChanged();
        } else {
          interfaceInfoBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
       */
      public Builder addInterfaceInfo(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo value) {
        if (interfaceInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInterfaceInfoIsMutable();
          interfaceInfo_.add(index, value);
          onChanged();
        } else {
          interfaceInfoBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
       */
      public Builder addInterfaceInfo(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.Builder builderForValue) {
        if (interfaceInfoBuilder_ == null) {
          ensureInterfaceInfoIsMutable();
          interfaceInfo_.add(builderForValue.build());
          onChanged();
        } else {
          interfaceInfoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
       */
      public Builder addInterfaceInfo(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.Builder builderForValue) {
        if (interfaceInfoBuilder_ == null) {
          ensureInterfaceInfoIsMutable();
          interfaceInfo_.add(index, builderForValue.build());
          onChanged();
        } else {
          interfaceInfoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
       */
      public Builder addAllInterfaceInfo(
          java.lang.Iterable<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo> values) {
        if (interfaceInfoBuilder_ == null) {
          ensureInterfaceInfoIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, interfaceInfo_);
          onChanged();
        } else {
          interfaceInfoBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
       */
      public Builder clearInterfaceInfo() {
        if (interfaceInfoBuilder_ == null) {
          interfaceInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          interfaceInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
       */
      public Builder removeInterfaceInfo(int index) {
        if (interfaceInfoBuilder_ == null) {
          ensureInterfaceInfoIsMutable();
          interfaceInfo_.remove(index);
          onChanged();
        } else {
          interfaceInfoBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.Builder getInterfaceInfoBuilder(
          int index) {
        return getInterfaceInfoFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfoOrBuilder getInterfaceInfoOrBuilder(
          int index) {
        if (interfaceInfoBuilder_ == null) {
          return interfaceInfo_.get(index);  } else {
          return interfaceInfoBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
       */
      public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfoOrBuilder> 
           getInterfaceInfoOrBuilderList() {
        if (interfaceInfoBuilder_ != null) {
          return interfaceInfoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(interfaceInfo_);
        }
      }
      /**
       * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.Builder addInterfaceInfoBuilder() {
        return getInterfaceInfoFieldBuilder().addBuilder(
            org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.Builder addInterfaceInfoBuilder(
          int index) {
        return getInterfaceInfoFieldBuilder().addBuilder(
            index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .LogicalInterfaceInfo interface_info = 1;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.Builder> 
           getInterfaceInfoBuilderList() {
        return getInterfaceInfoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfoOrBuilder> 
          getInterfaceInfoFieldBuilder() {
        if (interfaceInfoBuilder_ == null) {
          interfaceInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfoOrBuilder>(
                  interfaceInfo_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          interfaceInfo_ = null;
        }
        return interfaceInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:LogicalPort)
    }

    // @@protoc_insertion_point(class_scope:LogicalPort)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<LogicalPort>
        PARSER = new com.google.protobuf.AbstractParser<LogicalPort>() {
      @java.lang.Override
      public LogicalPort parsePartialFrom(
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

    public static com.google.protobuf.Parser<LogicalPort> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LogicalPort> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LogicalInterfaceInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LogicalInterfaceInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Logical interface name (e.g. xe-0/0/0.0)
     * </pre>
     *
     * <code>required string if_name = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifName field is set.
     */
    boolean hasIfName();
    /**
     * <pre>
     * Logical interface name (e.g. xe-0/0/0.0)
     * </pre>
     *
     * <code>required string if_name = 1 [(.telemetry_options) = { ... }</code>
     * @return The ifName.
     */
    java.lang.String getIfName();
    /**
     * <pre>
     * Logical interface name (e.g. xe-0/0/0.0)
     * </pre>
     *
     * <code>required string if_name = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for ifName.
     */
    com.google.protobuf.ByteString
        getIfNameBytes();

    /**
     * <pre>
     * Time reset
     * </pre>
     *
     * <code>required uint64 init_time = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the initTime field is set.
     */
    boolean hasInitTime();
    /**
     * <pre>
     * Time reset
     * </pre>
     *
     * <code>required uint64 init_time = 2 [(.telemetry_options) = { ... }</code>
     * @return The initTime.
     */
    long getInitTime();

    /**
     * <pre>
     * Global Index
     * </pre>
     *
     * <code>optional uint32 snmp_if_index = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the snmpIfIndex field is set.
     */
    boolean hasSnmpIfIndex();
    /**
     * <pre>
     * Global Index
     * </pre>
     *
     * <code>optional uint32 snmp_if_index = 3 [(.telemetry_options) = { ... }</code>
     * @return The snmpIfIndex.
     */
    int getSnmpIfIndex();

    /**
     * <pre>
     * Name of the aggregate bundle
     * </pre>
     *
     * <code>optional string parent_ae_name = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the parentAeName field is set.
     */
    boolean hasParentAeName();
    /**
     * <pre>
     * Name of the aggregate bundle
     * </pre>
     *
     * <code>optional string parent_ae_name = 4 [(.telemetry_options) = { ... }</code>
     * @return The parentAeName.
     */
    java.lang.String getParentAeName();
    /**
     * <pre>
     * Name of the aggregate bundle
     * </pre>
     *
     * <code>optional string parent_ae_name = 4 [(.telemetry_options) = { ... }</code>
     * @return The bytes for parentAeName.
     */
    com.google.protobuf.ByteString
        getParentAeNameBytes();

    /**
     * <pre>
     * Inbound traffic statistics
     * </pre>
     *
     * <code>optional .IngressInterfaceStats ingress_stats = 5;</code>
     * @return Whether the ingressStats field is set.
     */
    boolean hasIngressStats();
    /**
     * <pre>
     * Inbound traffic statistics
     * </pre>
     *
     * <code>optional .IngressInterfaceStats ingress_stats = 5;</code>
     * @return The ingressStats.
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats getIngressStats();
    /**
     * <pre>
     * Inbound traffic statistics
     * </pre>
     *
     * <code>optional .IngressInterfaceStats ingress_stats = 5;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStatsOrBuilder getIngressStatsOrBuilder();

    /**
     * <pre>
     * Outbound traffic statistics
     * </pre>
     *
     * <code>optional .EgressInterfaceStats egress_stats = 6;</code>
     * @return Whether the egressStats field is set.
     */
    boolean hasEgressStats();
    /**
     * <pre>
     * Outbound traffic statistics
     * </pre>
     *
     * <code>optional .EgressInterfaceStats egress_stats = 6;</code>
     * @return The egressStats.
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats getEgressStats();
    /**
     * <pre>
     * Outbound traffic statistics
     * </pre>
     *
     * <code>optional .EgressInterfaceStats egress_stats = 6;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStatsOrBuilder getEgressStatsOrBuilder();

    /**
     * <pre>
     * Link state UP&#92;DOWN etc.
     * </pre>
     *
     * <code>optional .OperationalState op_state = 7;</code>
     * @return Whether the opState field is set.
     */
    boolean hasOpState();
    /**
     * <pre>
     * Link state UP&#92;DOWN etc.
     * </pre>
     *
     * <code>optional .OperationalState op_state = 7;</code>
     * @return The opState.
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState getOpState();
    /**
     * <pre>
     * Link state UP&#92;DOWN etc.
     * </pre>
     *
     * <code>optional .OperationalState op_state = 7;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalStateOrBuilder getOpStateOrBuilder();
  }
  /**
   * <pre>
   *
   * Logical Interaface information
   * </pre>
   *
   * Protobuf type {@code LogicalInterfaceInfo}
   */
  public static final class LogicalInterfaceInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LogicalInterfaceInfo)
      LogicalInterfaceInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LogicalInterfaceInfo.newBuilder() to construct.
    private LogicalInterfaceInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LogicalInterfaceInfo() {
      ifName_ = "";
      parentAeName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LogicalInterfaceInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_LogicalInterfaceInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_LogicalInterfaceInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.Builder.class);
    }

    private int bitField0_;
    public static final int IF_NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object ifName_ = "";
    /**
     * <pre>
     * Logical interface name (e.g. xe-0/0/0.0)
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
     * Logical interface name (e.g. xe-0/0/0.0)
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
     * Logical interface name (e.g. xe-0/0/0.0)
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
     * Time reset
     * </pre>
     *
     * <code>required uint64 init_time = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the initTime field is set.
     */
    @java.lang.Override
    public boolean hasInitTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Time reset
     * </pre>
     *
     * <code>required uint64 init_time = 2 [(.telemetry_options) = { ... }</code>
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
     * <code>optional uint32 snmp_if_index = 3 [(.telemetry_options) = { ... }</code>
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
     * <code>optional uint32 snmp_if_index = 3 [(.telemetry_options) = { ... }</code>
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
     * Name of the aggregate bundle
     * </pre>
     *
     * <code>optional string parent_ae_name = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the parentAeName field is set.
     */
    @java.lang.Override
    public boolean hasParentAeName() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Name of the aggregate bundle
     * </pre>
     *
     * <code>optional string parent_ae_name = 4 [(.telemetry_options) = { ... }</code>
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
     * Name of the aggregate bundle
     * </pre>
     *
     * <code>optional string parent_ae_name = 4 [(.telemetry_options) = { ... }</code>
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

    public static final int INGRESS_STATS_FIELD_NUMBER = 5;
    private org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats ingressStats_;
    /**
     * <pre>
     * Inbound traffic statistics
     * </pre>
     *
     * <code>optional .IngressInterfaceStats ingress_stats = 5;</code>
     * @return Whether the ingressStats field is set.
     */
    @java.lang.Override
    public boolean hasIngressStats() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * Inbound traffic statistics
     * </pre>
     *
     * <code>optional .IngressInterfaceStats ingress_stats = 5;</code>
     * @return The ingressStats.
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats getIngressStats() {
      return ingressStats_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats.getDefaultInstance() : ingressStats_;
    }
    /**
     * <pre>
     * Inbound traffic statistics
     * </pre>
     *
     * <code>optional .IngressInterfaceStats ingress_stats = 5;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStatsOrBuilder getIngressStatsOrBuilder() {
      return ingressStats_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats.getDefaultInstance() : ingressStats_;
    }

    public static final int EGRESS_STATS_FIELD_NUMBER = 6;
    private org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats egressStats_;
    /**
     * <pre>
     * Outbound traffic statistics
     * </pre>
     *
     * <code>optional .EgressInterfaceStats egress_stats = 6;</code>
     * @return Whether the egressStats field is set.
     */
    @java.lang.Override
    public boolean hasEgressStats() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * Outbound traffic statistics
     * </pre>
     *
     * <code>optional .EgressInterfaceStats egress_stats = 6;</code>
     * @return The egressStats.
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats getEgressStats() {
      return egressStats_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats.getDefaultInstance() : egressStats_;
    }
    /**
     * <pre>
     * Outbound traffic statistics
     * </pre>
     *
     * <code>optional .EgressInterfaceStats egress_stats = 6;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStatsOrBuilder getEgressStatsOrBuilder() {
      return egressStats_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats.getDefaultInstance() : egressStats_;
    }

    public static final int OP_STATE_FIELD_NUMBER = 7;
    private org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState opState_;
    /**
     * <pre>
     * Link state UP&#92;DOWN etc.
     * </pre>
     *
     * <code>optional .OperationalState op_state = 7;</code>
     * @return Whether the opState field is set.
     */
    @java.lang.Override
    public boolean hasOpState() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <pre>
     * Link state UP&#92;DOWN etc.
     * </pre>
     *
     * <code>optional .OperationalState op_state = 7;</code>
     * @return The opState.
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState getOpState() {
      return opState_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState.getDefaultInstance() : opState_;
    }
    /**
     * <pre>
     * Link state UP&#92;DOWN etc.
     * </pre>
     *
     * <code>optional .OperationalState op_state = 7;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalStateOrBuilder getOpStateOrBuilder() {
      return opState_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState.getDefaultInstance() : opState_;
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
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeMessage(5, getIngressStats());
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeMessage(6, getEgressStats());
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeMessage(7, getOpState());
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
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getIngressStats());
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getEgressStats());
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getOpState());
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
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo) obj;

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
      if (hasOpState() != other.hasOpState()) return false;
      if (hasOpState()) {
        if (!getOpState()
            .equals(other.getOpState())) return false;
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
      if (hasIngressStats()) {
        hash = (37 * hash) + INGRESS_STATS_FIELD_NUMBER;
        hash = (53 * hash) + getIngressStats().hashCode();
      }
      if (hasEgressStats()) {
        hash = (37 * hash) + EGRESS_STATS_FIELD_NUMBER;
        hash = (53 * hash) + getEgressStats().hashCode();
      }
      if (hasOpState()) {
        hash = (37 * hash) + OP_STATE_FIELD_NUMBER;
        hash = (53 * hash) + getOpState().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo prototype) {
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
     * Logical Interaface information
     * </pre>
     *
     * Protobuf type {@code LogicalInterfaceInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LogicalInterfaceInfo)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_LogicalInterfaceInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_LogicalInterfaceInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.newBuilder()
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
          getIngressStatsFieldBuilder();
          getEgressStatsFieldBuilder();
          getOpStateFieldBuilder();
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
        opState_ = null;
        if (opStateBuilder_ != null) {
          opStateBuilder_.dispose();
          opStateBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_LogicalInterfaceInfo_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo result) {
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
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.ingressStats_ = ingressStatsBuilder_ == null
              ? ingressStats_
              : ingressStatsBuilder_.build();
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.egressStats_ = egressStatsBuilder_ == null
              ? egressStats_
              : egressStatsBuilder_.build();
          to_bitField0_ |= 0x00000020;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.opState_ = opStateBuilder_ == null
              ? opState_
              : opStateBuilder_.build();
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo.getDefaultInstance()) return this;
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
        if (other.hasIngressStats()) {
          mergeIngressStats(other.getIngressStats());
        }
        if (other.hasEgressStats()) {
          mergeEgressStats(other.getEgressStats());
        }
        if (other.hasOpState()) {
          mergeOpState(other.getOpState());
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
                input.readMessage(
                    getIngressStatsFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000010;
                break;
              } // case 42
              case 50: {
                input.readMessage(
                    getEgressStatsFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000020;
                break;
              } // case 50
              case 58: {
                input.readMessage(
                    getOpStateFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000040;
                break;
              } // case 58
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
       * Logical interface name (e.g. xe-0/0/0.0)
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
       * Logical interface name (e.g. xe-0/0/0.0)
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
       * Logical interface name (e.g. xe-0/0/0.0)
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
       * Logical interface name (e.g. xe-0/0/0.0)
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
       * Logical interface name (e.g. xe-0/0/0.0)
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
       * Logical interface name (e.g. xe-0/0/0.0)
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
       * Time reset
       * </pre>
       *
       * <code>required uint64 init_time = 2 [(.telemetry_options) = { ... }</code>
       * @return Whether the initTime field is set.
       */
      @java.lang.Override
      public boolean hasInitTime() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Time reset
       * </pre>
       *
       * <code>required uint64 init_time = 2 [(.telemetry_options) = { ... }</code>
       * @return The initTime.
       */
      @java.lang.Override
      public long getInitTime() {
        return initTime_;
      }
      /**
       * <pre>
       * Time reset
       * </pre>
       *
       * <code>required uint64 init_time = 2 [(.telemetry_options) = { ... }</code>
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
       * Time reset
       * </pre>
       *
       * <code>required uint64 init_time = 2 [(.telemetry_options) = { ... }</code>
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
       * <code>optional uint32 snmp_if_index = 3 [(.telemetry_options) = { ... }</code>
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
       * <code>optional uint32 snmp_if_index = 3 [(.telemetry_options) = { ... }</code>
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
       * <code>optional uint32 snmp_if_index = 3 [(.telemetry_options) = { ... }</code>
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
       * <code>optional uint32 snmp_if_index = 3 [(.telemetry_options) = { ... }</code>
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
       * Name of the aggregate bundle
       * </pre>
       *
       * <code>optional string parent_ae_name = 4 [(.telemetry_options) = { ... }</code>
       * @return Whether the parentAeName field is set.
       */
      public boolean hasParentAeName() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * Name of the aggregate bundle
       * </pre>
       *
       * <code>optional string parent_ae_name = 4 [(.telemetry_options) = { ... }</code>
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
       * Name of the aggregate bundle
       * </pre>
       *
       * <code>optional string parent_ae_name = 4 [(.telemetry_options) = { ... }</code>
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
       * Name of the aggregate bundle
       * </pre>
       *
       * <code>optional string parent_ae_name = 4 [(.telemetry_options) = { ... }</code>
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
       * Name of the aggregate bundle
       * </pre>
       *
       * <code>optional string parent_ae_name = 4 [(.telemetry_options) = { ... }</code>
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
       * Name of the aggregate bundle
       * </pre>
       *
       * <code>optional string parent_ae_name = 4 [(.telemetry_options) = { ... }</code>
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

      private org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats ingressStats_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStatsOrBuilder> ingressStatsBuilder_;
      /**
       * <pre>
       * Inbound traffic statistics
       * </pre>
       *
       * <code>optional .IngressInterfaceStats ingress_stats = 5;</code>
       * @return Whether the ingressStats field is set.
       */
      public boolean hasIngressStats() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       * Inbound traffic statistics
       * </pre>
       *
       * <code>optional .IngressInterfaceStats ingress_stats = 5;</code>
       * @return The ingressStats.
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats getIngressStats() {
        if (ingressStatsBuilder_ == null) {
          return ingressStats_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats.getDefaultInstance() : ingressStats_;
        } else {
          return ingressStatsBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Inbound traffic statistics
       * </pre>
       *
       * <code>optional .IngressInterfaceStats ingress_stats = 5;</code>
       */
      public Builder setIngressStats(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats value) {
        if (ingressStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ingressStats_ = value;
        } else {
          ingressStatsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Inbound traffic statistics
       * </pre>
       *
       * <code>optional .IngressInterfaceStats ingress_stats = 5;</code>
       */
      public Builder setIngressStats(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats.Builder builderForValue) {
        if (ingressStatsBuilder_ == null) {
          ingressStats_ = builderForValue.build();
        } else {
          ingressStatsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Inbound traffic statistics
       * </pre>
       *
       * <code>optional .IngressInterfaceStats ingress_stats = 5;</code>
       */
      public Builder mergeIngressStats(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats value) {
        if (ingressStatsBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0) &&
            ingressStats_ != null &&
            ingressStats_ != org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats.getDefaultInstance()) {
            getIngressStatsBuilder().mergeFrom(value);
          } else {
            ingressStats_ = value;
          }
        } else {
          ingressStatsBuilder_.mergeFrom(value);
        }
        if (ingressStats_ != null) {
          bitField0_ |= 0x00000010;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       * Inbound traffic statistics
       * </pre>
       *
       * <code>optional .IngressInterfaceStats ingress_stats = 5;</code>
       */
      public Builder clearIngressStats() {
        bitField0_ = (bitField0_ & ~0x00000010);
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
       * Inbound traffic statistics
       * </pre>
       *
       * <code>optional .IngressInterfaceStats ingress_stats = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats.Builder getIngressStatsBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getIngressStatsFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Inbound traffic statistics
       * </pre>
       *
       * <code>optional .IngressInterfaceStats ingress_stats = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStatsOrBuilder getIngressStatsOrBuilder() {
        if (ingressStatsBuilder_ != null) {
          return ingressStatsBuilder_.getMessageOrBuilder();
        } else {
          return ingressStats_ == null ?
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats.getDefaultInstance() : ingressStats_;
        }
      }
      /**
       * <pre>
       * Inbound traffic statistics
       * </pre>
       *
       * <code>optional .IngressInterfaceStats ingress_stats = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStatsOrBuilder> 
          getIngressStatsFieldBuilder() {
        if (ingressStatsBuilder_ == null) {
          ingressStatsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStatsOrBuilder>(
                  getIngressStats(),
                  getParentForChildren(),
                  isClean());
          ingressStats_ = null;
        }
        return ingressStatsBuilder_;
      }

      private org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats egressStats_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStatsOrBuilder> egressStatsBuilder_;
      /**
       * <pre>
       * Outbound traffic statistics
       * </pre>
       *
       * <code>optional .EgressInterfaceStats egress_stats = 6;</code>
       * @return Whether the egressStats field is set.
       */
      public boolean hasEgressStats() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <pre>
       * Outbound traffic statistics
       * </pre>
       *
       * <code>optional .EgressInterfaceStats egress_stats = 6;</code>
       * @return The egressStats.
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats getEgressStats() {
        if (egressStatsBuilder_ == null) {
          return egressStats_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats.getDefaultInstance() : egressStats_;
        } else {
          return egressStatsBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Outbound traffic statistics
       * </pre>
       *
       * <code>optional .EgressInterfaceStats egress_stats = 6;</code>
       */
      public Builder setEgressStats(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats value) {
        if (egressStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          egressStats_ = value;
        } else {
          egressStatsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Outbound traffic statistics
       * </pre>
       *
       * <code>optional .EgressInterfaceStats egress_stats = 6;</code>
       */
      public Builder setEgressStats(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats.Builder builderForValue) {
        if (egressStatsBuilder_ == null) {
          egressStats_ = builderForValue.build();
        } else {
          egressStatsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Outbound traffic statistics
       * </pre>
       *
       * <code>optional .EgressInterfaceStats egress_stats = 6;</code>
       */
      public Builder mergeEgressStats(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats value) {
        if (egressStatsBuilder_ == null) {
          if (((bitField0_ & 0x00000020) != 0) &&
            egressStats_ != null &&
            egressStats_ != org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats.getDefaultInstance()) {
            getEgressStatsBuilder().mergeFrom(value);
          } else {
            egressStats_ = value;
          }
        } else {
          egressStatsBuilder_.mergeFrom(value);
        }
        if (egressStats_ != null) {
          bitField0_ |= 0x00000020;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       * Outbound traffic statistics
       * </pre>
       *
       * <code>optional .EgressInterfaceStats egress_stats = 6;</code>
       */
      public Builder clearEgressStats() {
        bitField0_ = (bitField0_ & ~0x00000020);
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
       * Outbound traffic statistics
       * </pre>
       *
       * <code>optional .EgressInterfaceStats egress_stats = 6;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats.Builder getEgressStatsBuilder() {
        bitField0_ |= 0x00000020;
        onChanged();
        return getEgressStatsFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Outbound traffic statistics
       * </pre>
       *
       * <code>optional .EgressInterfaceStats egress_stats = 6;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStatsOrBuilder getEgressStatsOrBuilder() {
        if (egressStatsBuilder_ != null) {
          return egressStatsBuilder_.getMessageOrBuilder();
        } else {
          return egressStats_ == null ?
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats.getDefaultInstance() : egressStats_;
        }
      }
      /**
       * <pre>
       * Outbound traffic statistics
       * </pre>
       *
       * <code>optional .EgressInterfaceStats egress_stats = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStatsOrBuilder> 
          getEgressStatsFieldBuilder() {
        if (egressStatsBuilder_ == null) {
          egressStatsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStatsOrBuilder>(
                  getEgressStats(),
                  getParentForChildren(),
                  isClean());
          egressStats_ = null;
        }
        return egressStatsBuilder_;
      }

      private org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState opState_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalStateOrBuilder> opStateBuilder_;
      /**
       * <pre>
       * Link state UP&#92;DOWN etc.
       * </pre>
       *
       * <code>optional .OperationalState op_state = 7;</code>
       * @return Whether the opState field is set.
       */
      public boolean hasOpState() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <pre>
       * Link state UP&#92;DOWN etc.
       * </pre>
       *
       * <code>optional .OperationalState op_state = 7;</code>
       * @return The opState.
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState getOpState() {
        if (opStateBuilder_ == null) {
          return opState_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState.getDefaultInstance() : opState_;
        } else {
          return opStateBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Link state UP&#92;DOWN etc.
       * </pre>
       *
       * <code>optional .OperationalState op_state = 7;</code>
       */
      public Builder setOpState(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState value) {
        if (opStateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          opState_ = value;
        } else {
          opStateBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Link state UP&#92;DOWN etc.
       * </pre>
       *
       * <code>optional .OperationalState op_state = 7;</code>
       */
      public Builder setOpState(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState.Builder builderForValue) {
        if (opStateBuilder_ == null) {
          opState_ = builderForValue.build();
        } else {
          opStateBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Link state UP&#92;DOWN etc.
       * </pre>
       *
       * <code>optional .OperationalState op_state = 7;</code>
       */
      public Builder mergeOpState(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState value) {
        if (opStateBuilder_ == null) {
          if (((bitField0_ & 0x00000040) != 0) &&
            opState_ != null &&
            opState_ != org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState.getDefaultInstance()) {
            getOpStateBuilder().mergeFrom(value);
          } else {
            opState_ = value;
          }
        } else {
          opStateBuilder_.mergeFrom(value);
        }
        if (opState_ != null) {
          bitField0_ |= 0x00000040;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       * Link state UP&#92;DOWN etc.
       * </pre>
       *
       * <code>optional .OperationalState op_state = 7;</code>
       */
      public Builder clearOpState() {
        bitField0_ = (bitField0_ & ~0x00000040);
        opState_ = null;
        if (opStateBuilder_ != null) {
          opStateBuilder_.dispose();
          opStateBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Link state UP&#92;DOWN etc.
       * </pre>
       *
       * <code>optional .OperationalState op_state = 7;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState.Builder getOpStateBuilder() {
        bitField0_ |= 0x00000040;
        onChanged();
        return getOpStateFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Link state UP&#92;DOWN etc.
       * </pre>
       *
       * <code>optional .OperationalState op_state = 7;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalStateOrBuilder getOpStateOrBuilder() {
        if (opStateBuilder_ != null) {
          return opStateBuilder_.getMessageOrBuilder();
        } else {
          return opState_ == null ?
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState.getDefaultInstance() : opState_;
        }
      }
      /**
       * <pre>
       * Link state UP&#92;DOWN etc.
       * </pre>
       *
       * <code>optional .OperationalState op_state = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalStateOrBuilder> 
          getOpStateFieldBuilder() {
        if (opStateBuilder_ == null) {
          opStateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalStateOrBuilder>(
                  getOpState(),
                  getParentForChildren(),
                  isClean());
          opState_ = null;
        }
        return opStateBuilder_;
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


      // @@protoc_insertion_point(builder_scope:LogicalInterfaceInfo)
    }

    // @@protoc_insertion_point(class_scope:LogicalInterfaceInfo)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<LogicalInterfaceInfo>
        PARSER = new com.google.protobuf.AbstractParser<LogicalInterfaceInfo>() {
      @java.lang.Override
      public LogicalInterfaceInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<LogicalInterfaceInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LogicalInterfaceInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalInterfaceInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface IngressInterfaceStatsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IngressInterfaceStats)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Count of packets
     * </pre>
     *
     * <code>required uint64 if_packets = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifPackets field is set.
     */
    boolean hasIfPackets();
    /**
     * <pre>
     * Count of packets
     * </pre>
     *
     * <code>required uint64 if_packets = 1 [(.telemetry_options) = { ... }</code>
     * @return The ifPackets.
     */
    long getIfPackets();

    /**
     * <pre>
     * Count of bytes
     * </pre>
     *
     * <code>required uint64 if_octets = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifOctets field is set.
     */
    boolean hasIfOctets();
    /**
     * <pre>
     * Count of bytes
     * </pre>
     *
     * <code>required uint64 if_octets = 2 [(.telemetry_options) = { ... }</code>
     * @return The ifOctets.
     */
    long getIfOctets();

    /**
     * <pre>
     * Count of unicast packets
     * </pre>
     *
     * <code>optional uint64 if_ucast_packets = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifUcastPackets field is set.
     */
    boolean hasIfUcastPackets();
    /**
     * <pre>
     * Count of unicast packets
     * </pre>
     *
     * <code>optional uint64 if_ucast_packets = 3 [(.telemetry_options) = { ... }</code>
     * @return The ifUcastPackets.
     */
    long getIfUcastPackets();

    /**
     * <pre>
     * Count of multicast packets
     * </pre>
     *
     * <code>required uint64 if_mcast_packets = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifMcastPackets field is set.
     */
    boolean hasIfMcastPackets();
    /**
     * <pre>
     * Count of multicast packets
     * </pre>
     *
     * <code>required uint64 if_mcast_packets = 4 [(.telemetry_options) = { ... }</code>
     * @return The ifMcastPackets.
     */
    long getIfMcastPackets();

    /**
     * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
     */
    java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting> 
        getIfFcStatsList();
    /**
     * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting getIfFcStats(int index);
    /**
     * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
     */
    int getIfFcStatsCount();
    /**
     * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
     */
    java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccountingOrBuilder> 
        getIfFcStatsOrBuilderList();
    /**
     * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccountingOrBuilder getIfFcStatsOrBuilder(
        int index);
  }
  /**
   * <pre>
   *
   *  Interface inbound/Ingress traffic statistics
   * </pre>
   *
   * Protobuf type {@code IngressInterfaceStats}
   */
  public static final class IngressInterfaceStats extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IngressInterfaceStats)
      IngressInterfaceStatsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IngressInterfaceStats.newBuilder() to construct.
    private IngressInterfaceStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IngressInterfaceStats() {
      ifFcStats_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IngressInterfaceStats();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_IngressInterfaceStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_IngressInterfaceStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats.Builder.class);
    }

    private int bitField0_;
    public static final int IF_PACKETS_FIELD_NUMBER = 1;
    private long ifPackets_ = 0L;
    /**
     * <pre>
     * Count of packets
     * </pre>
     *
     * <code>required uint64 if_packets = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifPackets field is set.
     */
    @java.lang.Override
    public boolean hasIfPackets() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Count of packets
     * </pre>
     *
     * <code>required uint64 if_packets = 1 [(.telemetry_options) = { ... }</code>
     * @return The ifPackets.
     */
    @java.lang.Override
    public long getIfPackets() {
      return ifPackets_;
    }

    public static final int IF_OCTETS_FIELD_NUMBER = 2;
    private long ifOctets_ = 0L;
    /**
     * <pre>
     * Count of bytes
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
     * Count of bytes
     * </pre>
     *
     * <code>required uint64 if_octets = 2 [(.telemetry_options) = { ... }</code>
     * @return The ifOctets.
     */
    @java.lang.Override
    public long getIfOctets() {
      return ifOctets_;
    }

    public static final int IF_UCAST_PACKETS_FIELD_NUMBER = 3;
    private long ifUcastPackets_ = 0L;
    /**
     * <pre>
     * Count of unicast packets
     * </pre>
     *
     * <code>optional uint64 if_ucast_packets = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifUcastPackets field is set.
     */
    @java.lang.Override
    public boolean hasIfUcastPackets() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Count of unicast packets
     * </pre>
     *
     * <code>optional uint64 if_ucast_packets = 3 [(.telemetry_options) = { ... }</code>
     * @return The ifUcastPackets.
     */
    @java.lang.Override
    public long getIfUcastPackets() {
      return ifUcastPackets_;
    }

    public static final int IF_MCAST_PACKETS_FIELD_NUMBER = 4;
    private long ifMcastPackets_ = 0L;
    /**
     * <pre>
     * Count of multicast packets
     * </pre>
     *
     * <code>required uint64 if_mcast_packets = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifMcastPackets field is set.
     */
    @java.lang.Override
    public boolean hasIfMcastPackets() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Count of multicast packets
     * </pre>
     *
     * <code>required uint64 if_mcast_packets = 4 [(.telemetry_options) = { ... }</code>
     * @return The ifMcastPackets.
     */
    @java.lang.Override
    public long getIfMcastPackets() {
      return ifMcastPackets_;
    }

    public static final int IF_FC_STATS_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting> ifFcStats_;
    /**
     * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting> getIfFcStatsList() {
      return ifFcStats_;
    }
    /**
     * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccountingOrBuilder> 
        getIfFcStatsOrBuilderList() {
      return ifFcStats_;
    }
    /**
     * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
     */
    @java.lang.Override
    public int getIfFcStatsCount() {
      return ifFcStats_.size();
    }
    /**
     * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting getIfFcStats(int index) {
      return ifFcStats_.get(index);
    }
    /**
     * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccountingOrBuilder getIfFcStatsOrBuilder(
        int index) {
      return ifFcStats_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasIfPackets()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIfOctets()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIfMcastPackets()) {
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
        output.writeUInt64(1, ifPackets_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, ifOctets_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt64(3, ifUcastPackets_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeUInt64(4, ifMcastPackets_);
      }
      for (int i = 0; i < ifFcStats_.size(); i++) {
        output.writeMessage(5, ifFcStats_.get(i));
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
          .computeUInt64Size(1, ifPackets_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, ifOctets_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, ifUcastPackets_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, ifMcastPackets_);
      }
      for (int i = 0; i < ifFcStats_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, ifFcStats_.get(i));
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
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats) obj;

      if (hasIfPackets() != other.hasIfPackets()) return false;
      if (hasIfPackets()) {
        if (getIfPackets()
            != other.getIfPackets()) return false;
      }
      if (hasIfOctets() != other.hasIfOctets()) return false;
      if (hasIfOctets()) {
        if (getIfOctets()
            != other.getIfOctets()) return false;
      }
      if (hasIfUcastPackets() != other.hasIfUcastPackets()) return false;
      if (hasIfUcastPackets()) {
        if (getIfUcastPackets()
            != other.getIfUcastPackets()) return false;
      }
      if (hasIfMcastPackets() != other.hasIfMcastPackets()) return false;
      if (hasIfMcastPackets()) {
        if (getIfMcastPackets()
            != other.getIfMcastPackets()) return false;
      }
      if (!getIfFcStatsList()
          .equals(other.getIfFcStatsList())) return false;
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
      if (hasIfPackets()) {
        hash = (37 * hash) + IF_PACKETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfPackets());
      }
      if (hasIfOctets()) {
        hash = (37 * hash) + IF_OCTETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfOctets());
      }
      if (hasIfUcastPackets()) {
        hash = (37 * hash) + IF_UCAST_PACKETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfUcastPackets());
      }
      if (hasIfMcastPackets()) {
        hash = (37 * hash) + IF_MCAST_PACKETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfMcastPackets());
      }
      if (getIfFcStatsCount() > 0) {
        hash = (37 * hash) + IF_FC_STATS_FIELD_NUMBER;
        hash = (53 * hash) + getIfFcStatsList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats prototype) {
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
     *  Interface inbound/Ingress traffic statistics
     * </pre>
     *
     * Protobuf type {@code IngressInterfaceStats}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IngressInterfaceStats)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStatsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_IngressInterfaceStats_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_IngressInterfaceStats_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats.newBuilder()
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
        ifPackets_ = 0L;
        ifOctets_ = 0L;
        ifUcastPackets_ = 0L;
        ifMcastPackets_ = 0L;
        if (ifFcStatsBuilder_ == null) {
          ifFcStats_ = java.util.Collections.emptyList();
        } else {
          ifFcStats_ = null;
          ifFcStatsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_IngressInterfaceStats_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats result) {
        if (ifFcStatsBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0)) {
            ifFcStats_ = java.util.Collections.unmodifiableList(ifFcStats_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.ifFcStats_ = ifFcStats_;
        } else {
          result.ifFcStats_ = ifFcStatsBuilder_.build();
        }
      }

      private void buildPartial0(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.ifPackets_ = ifPackets_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.ifOctets_ = ifOctets_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.ifUcastPackets_ = ifUcastPackets_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.ifMcastPackets_ = ifMcastPackets_;
          to_bitField0_ |= 0x00000008;
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats.getDefaultInstance()) return this;
        if (other.hasIfPackets()) {
          setIfPackets(other.getIfPackets());
        }
        if (other.hasIfOctets()) {
          setIfOctets(other.getIfOctets());
        }
        if (other.hasIfUcastPackets()) {
          setIfUcastPackets(other.getIfUcastPackets());
        }
        if (other.hasIfMcastPackets()) {
          setIfMcastPackets(other.getIfMcastPackets());
        }
        if (ifFcStatsBuilder_ == null) {
          if (!other.ifFcStats_.isEmpty()) {
            if (ifFcStats_.isEmpty()) {
              ifFcStats_ = other.ifFcStats_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureIfFcStatsIsMutable();
              ifFcStats_.addAll(other.ifFcStats_);
            }
            onChanged();
          }
        } else {
          if (!other.ifFcStats_.isEmpty()) {
            if (ifFcStatsBuilder_.isEmpty()) {
              ifFcStatsBuilder_.dispose();
              ifFcStatsBuilder_ = null;
              ifFcStats_ = other.ifFcStats_;
              bitField0_ = (bitField0_ & ~0x00000010);
              ifFcStatsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getIfFcStatsFieldBuilder() : null;
            } else {
              ifFcStatsBuilder_.addAllMessages(other.ifFcStats_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasIfPackets()) {
          return false;
        }
        if (!hasIfOctets()) {
          return false;
        }
        if (!hasIfMcastPackets()) {
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
                ifPackets_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                ifOctets_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                ifUcastPackets_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                ifMcastPackets_ = input.readUInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 42: {
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting m =
                    input.readMessage(
                        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.PARSER,
                        extensionRegistry);
                if (ifFcStatsBuilder_ == null) {
                  ensureIfFcStatsIsMutable();
                  ifFcStats_.add(m);
                } else {
                  ifFcStatsBuilder_.addMessage(m);
                }
                break;
              } // case 42
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

      private long ifPackets_ ;
      /**
       * <pre>
       * Count of packets
       * </pre>
       *
       * <code>required uint64 if_packets = 1 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifPackets field is set.
       */
      @java.lang.Override
      public boolean hasIfPackets() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Count of packets
       * </pre>
       *
       * <code>required uint64 if_packets = 1 [(.telemetry_options) = { ... }</code>
       * @return The ifPackets.
       */
      @java.lang.Override
      public long getIfPackets() {
        return ifPackets_;
      }
      /**
       * <pre>
       * Count of packets
       * </pre>
       *
       * <code>required uint64 if_packets = 1 [(.telemetry_options) = { ... }</code>
       * @param value The ifPackets to set.
       * @return This builder for chaining.
       */
      public Builder setIfPackets(long value) {

        ifPackets_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Count of packets
       * </pre>
       *
       * <code>required uint64 if_packets = 1 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfPackets() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ifPackets_ = 0L;
        onChanged();
        return this;
      }

      private long ifOctets_ ;
      /**
       * <pre>
       * Count of bytes
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
       * Count of bytes
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
       * Count of bytes
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
       * Count of bytes
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

      private long ifUcastPackets_ ;
      /**
       * <pre>
       * Count of unicast packets
       * </pre>
       *
       * <code>optional uint64 if_ucast_packets = 3 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifUcastPackets field is set.
       */
      @java.lang.Override
      public boolean hasIfUcastPackets() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Count of unicast packets
       * </pre>
       *
       * <code>optional uint64 if_ucast_packets = 3 [(.telemetry_options) = { ... }</code>
       * @return The ifUcastPackets.
       */
      @java.lang.Override
      public long getIfUcastPackets() {
        return ifUcastPackets_;
      }
      /**
       * <pre>
       * Count of unicast packets
       * </pre>
       *
       * <code>optional uint64 if_ucast_packets = 3 [(.telemetry_options) = { ... }</code>
       * @param value The ifUcastPackets to set.
       * @return This builder for chaining.
       */
      public Builder setIfUcastPackets(long value) {

        ifUcastPackets_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Count of unicast packets
       * </pre>
       *
       * <code>optional uint64 if_ucast_packets = 3 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfUcastPackets() {
        bitField0_ = (bitField0_ & ~0x00000004);
        ifUcastPackets_ = 0L;
        onChanged();
        return this;
      }

      private long ifMcastPackets_ ;
      /**
       * <pre>
       * Count of multicast packets
       * </pre>
       *
       * <code>required uint64 if_mcast_packets = 4 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifMcastPackets field is set.
       */
      @java.lang.Override
      public boolean hasIfMcastPackets() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * Count of multicast packets
       * </pre>
       *
       * <code>required uint64 if_mcast_packets = 4 [(.telemetry_options) = { ... }</code>
       * @return The ifMcastPackets.
       */
      @java.lang.Override
      public long getIfMcastPackets() {
        return ifMcastPackets_;
      }
      /**
       * <pre>
       * Count of multicast packets
       * </pre>
       *
       * <code>required uint64 if_mcast_packets = 4 [(.telemetry_options) = { ... }</code>
       * @param value The ifMcastPackets to set.
       * @return This builder for chaining.
       */
      public Builder setIfMcastPackets(long value) {

        ifMcastPackets_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Count of multicast packets
       * </pre>
       *
       * <code>required uint64 if_mcast_packets = 4 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfMcastPackets() {
        bitField0_ = (bitField0_ & ~0x00000008);
        ifMcastPackets_ = 0L;
        onChanged();
        return this;
      }

      private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting> ifFcStats_ =
        java.util.Collections.emptyList();
      private void ensureIfFcStatsIsMutable() {
        if (!((bitField0_ & 0x00000010) != 0)) {
          ifFcStats_ = new java.util.ArrayList<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting>(ifFcStats_);
          bitField0_ |= 0x00000010;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccountingOrBuilder> ifFcStatsBuilder_;

      /**
       * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting> getIfFcStatsList() {
        if (ifFcStatsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(ifFcStats_);
        } else {
          return ifFcStatsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
       */
      public int getIfFcStatsCount() {
        if (ifFcStatsBuilder_ == null) {
          return ifFcStats_.size();
        } else {
          return ifFcStatsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting getIfFcStats(int index) {
        if (ifFcStatsBuilder_ == null) {
          return ifFcStats_.get(index);
        } else {
          return ifFcStatsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
       */
      public Builder setIfFcStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting value) {
        if (ifFcStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureIfFcStatsIsMutable();
          ifFcStats_.set(index, value);
          onChanged();
        } else {
          ifFcStatsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
       */
      public Builder setIfFcStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.Builder builderForValue) {
        if (ifFcStatsBuilder_ == null) {
          ensureIfFcStatsIsMutable();
          ifFcStats_.set(index, builderForValue.build());
          onChanged();
        } else {
          ifFcStatsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
       */
      public Builder addIfFcStats(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting value) {
        if (ifFcStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureIfFcStatsIsMutable();
          ifFcStats_.add(value);
          onChanged();
        } else {
          ifFcStatsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
       */
      public Builder addIfFcStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting value) {
        if (ifFcStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureIfFcStatsIsMutable();
          ifFcStats_.add(index, value);
          onChanged();
        } else {
          ifFcStatsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
       */
      public Builder addIfFcStats(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.Builder builderForValue) {
        if (ifFcStatsBuilder_ == null) {
          ensureIfFcStatsIsMutable();
          ifFcStats_.add(builderForValue.build());
          onChanged();
        } else {
          ifFcStatsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
       */
      public Builder addIfFcStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.Builder builderForValue) {
        if (ifFcStatsBuilder_ == null) {
          ensureIfFcStatsIsMutable();
          ifFcStats_.add(index, builderForValue.build());
          onChanged();
        } else {
          ifFcStatsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
       */
      public Builder addAllIfFcStats(
          java.lang.Iterable<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting> values) {
        if (ifFcStatsBuilder_ == null) {
          ensureIfFcStatsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, ifFcStats_);
          onChanged();
        } else {
          ifFcStatsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
       */
      public Builder clearIfFcStats() {
        if (ifFcStatsBuilder_ == null) {
          ifFcStats_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          ifFcStatsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
       */
      public Builder removeIfFcStats(int index) {
        if (ifFcStatsBuilder_ == null) {
          ensureIfFcStatsIsMutable();
          ifFcStats_.remove(index);
          onChanged();
        } else {
          ifFcStatsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.Builder getIfFcStatsBuilder(
          int index) {
        return getIfFcStatsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccountingOrBuilder getIfFcStatsOrBuilder(
          int index) {
        if (ifFcStatsBuilder_ == null) {
          return ifFcStats_.get(index);  } else {
          return ifFcStatsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
       */
      public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccountingOrBuilder> 
           getIfFcStatsOrBuilderList() {
        if (ifFcStatsBuilder_ != null) {
          return ifFcStatsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(ifFcStats_);
        }
      }
      /**
       * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.Builder addIfFcStatsBuilder() {
        return getIfFcStatsFieldBuilder().addBuilder(
            org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.getDefaultInstance());
      }
      /**
       * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.Builder addIfFcStatsBuilder(
          int index) {
        return getIfFcStatsFieldBuilder().addBuilder(
            index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.getDefaultInstance());
      }
      /**
       * <code>repeated .ForwardingClassAccounting if_fc_stats = 5;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.Builder> 
           getIfFcStatsBuilderList() {
        return getIfFcStatsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccountingOrBuilder> 
          getIfFcStatsFieldBuilder() {
        if (ifFcStatsBuilder_ == null) {
          ifFcStatsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccountingOrBuilder>(
                  ifFcStats_,
                  ((bitField0_ & 0x00000010) != 0),
                  getParentForChildren(),
                  isClean());
          ifFcStats_ = null;
        }
        return ifFcStatsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:IngressInterfaceStats)
    }

    // @@protoc_insertion_point(class_scope:IngressInterfaceStats)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<IngressInterfaceStats>
        PARSER = new com.google.protobuf.AbstractParser<IngressInterfaceStats>() {
      @java.lang.Override
      public IngressInterfaceStats parsePartialFrom(
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

    public static com.google.protobuf.Parser<IngressInterfaceStats> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IngressInterfaceStats> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.IngressInterfaceStats getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface EgressInterfaceStatsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EgressInterfaceStats)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Count of packets
     * </pre>
     *
     * <code>required uint64 if_packets = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifPackets field is set.
     */
    boolean hasIfPackets();
    /**
     * <pre>
     * Count of packets
     * </pre>
     *
     * <code>required uint64 if_packets = 1 [(.telemetry_options) = { ... }</code>
     * @return The ifPackets.
     */
    long getIfPackets();

    /**
     * <pre>
     * Count of bytes
     * </pre>
     *
     * <code>required uint64 if_octets = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifOctets field is set.
     */
    boolean hasIfOctets();
    /**
     * <pre>
     * Count of bytes
     * </pre>
     *
     * <code>required uint64 if_octets = 2 [(.telemetry_options) = { ... }</code>
     * @return The ifOctets.
     */
    long getIfOctets();
  }
  /**
   * <pre>
   *
   *  Interface outbound/Egress traffic statistics
   * </pre>
   *
   * Protobuf type {@code EgressInterfaceStats}
   */
  public static final class EgressInterfaceStats extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EgressInterfaceStats)
      EgressInterfaceStatsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EgressInterfaceStats.newBuilder() to construct.
    private EgressInterfaceStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EgressInterfaceStats() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EgressInterfaceStats();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_EgressInterfaceStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_EgressInterfaceStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats.Builder.class);
    }

    private int bitField0_;
    public static final int IF_PACKETS_FIELD_NUMBER = 1;
    private long ifPackets_ = 0L;
    /**
     * <pre>
     * Count of packets
     * </pre>
     *
     * <code>required uint64 if_packets = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifPackets field is set.
     */
    @java.lang.Override
    public boolean hasIfPackets() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Count of packets
     * </pre>
     *
     * <code>required uint64 if_packets = 1 [(.telemetry_options) = { ... }</code>
     * @return The ifPackets.
     */
    @java.lang.Override
    public long getIfPackets() {
      return ifPackets_;
    }

    public static final int IF_OCTETS_FIELD_NUMBER = 2;
    private long ifOctets_ = 0L;
    /**
     * <pre>
     * Count of bytes
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
     * Count of bytes
     * </pre>
     *
     * <code>required uint64 if_octets = 2 [(.telemetry_options) = { ... }</code>
     * @return The ifOctets.
     */
    @java.lang.Override
    public long getIfOctets() {
      return ifOctets_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasIfPackets()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIfOctets()) {
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
        output.writeUInt64(1, ifPackets_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, ifOctets_);
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
          .computeUInt64Size(1, ifPackets_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, ifOctets_);
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
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats) obj;

      if (hasIfPackets() != other.hasIfPackets()) return false;
      if (hasIfPackets()) {
        if (getIfPackets()
            != other.getIfPackets()) return false;
      }
      if (hasIfOctets() != other.hasIfOctets()) return false;
      if (hasIfOctets()) {
        if (getIfOctets()
            != other.getIfOctets()) return false;
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
      if (hasIfPackets()) {
        hash = (37 * hash) + IF_PACKETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfPackets());
      }
      if (hasIfOctets()) {
        hash = (37 * hash) + IF_OCTETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfOctets());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats prototype) {
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
     *  Interface outbound/Egress traffic statistics
     * </pre>
     *
     * Protobuf type {@code EgressInterfaceStats}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EgressInterfaceStats)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStatsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_EgressInterfaceStats_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_EgressInterfaceStats_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats.newBuilder()
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
        ifPackets_ = 0L;
        ifOctets_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_EgressInterfaceStats_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.ifPackets_ = ifPackets_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.ifOctets_ = ifOctets_;
          to_bitField0_ |= 0x00000002;
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats.getDefaultInstance()) return this;
        if (other.hasIfPackets()) {
          setIfPackets(other.getIfPackets());
        }
        if (other.hasIfOctets()) {
          setIfOctets(other.getIfOctets());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasIfPackets()) {
          return false;
        }
        if (!hasIfOctets()) {
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
                ifPackets_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                ifOctets_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

      private long ifPackets_ ;
      /**
       * <pre>
       * Count of packets
       * </pre>
       *
       * <code>required uint64 if_packets = 1 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifPackets field is set.
       */
      @java.lang.Override
      public boolean hasIfPackets() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Count of packets
       * </pre>
       *
       * <code>required uint64 if_packets = 1 [(.telemetry_options) = { ... }</code>
       * @return The ifPackets.
       */
      @java.lang.Override
      public long getIfPackets() {
        return ifPackets_;
      }
      /**
       * <pre>
       * Count of packets
       * </pre>
       *
       * <code>required uint64 if_packets = 1 [(.telemetry_options) = { ... }</code>
       * @param value The ifPackets to set.
       * @return This builder for chaining.
       */
      public Builder setIfPackets(long value) {

        ifPackets_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Count of packets
       * </pre>
       *
       * <code>required uint64 if_packets = 1 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfPackets() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ifPackets_ = 0L;
        onChanged();
        return this;
      }

      private long ifOctets_ ;
      /**
       * <pre>
       * Count of bytes
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
       * Count of bytes
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
       * Count of bytes
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
       * Count of bytes
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


      // @@protoc_insertion_point(builder_scope:EgressInterfaceStats)
    }

    // @@protoc_insertion_point(class_scope:EgressInterfaceStats)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<EgressInterfaceStats>
        PARSER = new com.google.protobuf.AbstractParser<EgressInterfaceStats>() {
      @java.lang.Override
      public EgressInterfaceStats parsePartialFrom(
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

    public static com.google.protobuf.Parser<EgressInterfaceStats> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EgressInterfaceStats> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.EgressInterfaceStats getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface OperationalStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OperationalState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * If the link is up/down
     * </pre>
     *
     * <code>optional string operational_status = 1;</code>
     * @return Whether the operationalStatus field is set.
     */
    boolean hasOperationalStatus();
    /**
     * <pre>
     * If the link is up/down
     * </pre>
     *
     * <code>optional string operational_status = 1;</code>
     * @return The operationalStatus.
     */
    java.lang.String getOperationalStatus();
    /**
     * <pre>
     * If the link is up/down
     * </pre>
     *
     * <code>optional string operational_status = 1;</code>
     * @return The bytes for operationalStatus.
     */
    com.google.protobuf.ByteString
        getOperationalStatusBytes();
  }
  /**
   * <pre>
   *
   *  Interface operational State details
   * </pre>
   *
   * Protobuf type {@code OperationalState}
   */
  public static final class OperationalState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OperationalState)
      OperationalStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OperationalState.newBuilder() to construct.
    private OperationalState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OperationalState() {
      operationalStatus_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OperationalState();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_OperationalState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_OperationalState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState.Builder.class);
    }

    private int bitField0_;
    public static final int OPERATIONAL_STATUS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object operationalStatus_ = "";
    /**
     * <pre>
     * If the link is up/down
     * </pre>
     *
     * <code>optional string operational_status = 1;</code>
     * @return Whether the operationalStatus field is set.
     */
    @java.lang.Override
    public boolean hasOperationalStatus() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * If the link is up/down
     * </pre>
     *
     * <code>optional string operational_status = 1;</code>
     * @return The operationalStatus.
     */
    @java.lang.Override
    public java.lang.String getOperationalStatus() {
      java.lang.Object ref = operationalStatus_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          operationalStatus_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * If the link is up/down
     * </pre>
     *
     * <code>optional string operational_status = 1;</code>
     * @return The bytes for operationalStatus.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getOperationalStatusBytes() {
      java.lang.Object ref = operationalStatus_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        operationalStatus_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, operationalStatus_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, operationalStatus_);
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
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState) obj;

      if (hasOperationalStatus() != other.hasOperationalStatus()) return false;
      if (hasOperationalStatus()) {
        if (!getOperationalStatus()
            .equals(other.getOperationalStatus())) return false;
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
      if (hasOperationalStatus()) {
        hash = (37 * hash) + OPERATIONAL_STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getOperationalStatus().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState prototype) {
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
     *  Interface operational State details
     * </pre>
     *
     * Protobuf type {@code OperationalState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OperationalState)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_OperationalState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_OperationalState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState.newBuilder()
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
        operationalStatus_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_OperationalState_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.operationalStatus_ = operationalStatus_;
          to_bitField0_ |= 0x00000001;
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState.getDefaultInstance()) return this;
        if (other.hasOperationalStatus()) {
          operationalStatus_ = other.operationalStatus_;
          bitField0_ |= 0x00000001;
          onChanged();
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
              case 10: {
                operationalStatus_ = input.readBytes();
                bitField0_ |= 0x00000001;
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

      private java.lang.Object operationalStatus_ = "";
      /**
       * <pre>
       * If the link is up/down
       * </pre>
       *
       * <code>optional string operational_status = 1;</code>
       * @return Whether the operationalStatus field is set.
       */
      public boolean hasOperationalStatus() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * If the link is up/down
       * </pre>
       *
       * <code>optional string operational_status = 1;</code>
       * @return The operationalStatus.
       */
      public java.lang.String getOperationalStatus() {
        java.lang.Object ref = operationalStatus_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            operationalStatus_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * If the link is up/down
       * </pre>
       *
       * <code>optional string operational_status = 1;</code>
       * @return The bytes for operationalStatus.
       */
      public com.google.protobuf.ByteString
          getOperationalStatusBytes() {
        java.lang.Object ref = operationalStatus_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          operationalStatus_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * If the link is up/down
       * </pre>
       *
       * <code>optional string operational_status = 1;</code>
       * @param value The operationalStatus to set.
       * @return This builder for chaining.
       */
      public Builder setOperationalStatus(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        operationalStatus_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * If the link is up/down
       * </pre>
       *
       * <code>optional string operational_status = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearOperationalStatus() {
        operationalStatus_ = getDefaultInstance().getOperationalStatus();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * If the link is up/down
       * </pre>
       *
       * <code>optional string operational_status = 1;</code>
       * @param value The bytes for operationalStatus to set.
       * @return This builder for chaining.
       */
      public Builder setOperationalStatusBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        operationalStatus_ = value;
        bitField0_ |= 0x00000001;
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


      // @@protoc_insertion_point(builder_scope:OperationalState)
    }

    // @@protoc_insertion_point(class_scope:OperationalState)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<OperationalState>
        PARSER = new com.google.protobuf.AbstractParser<OperationalState>() {
      @java.lang.Override
      public OperationalState parsePartialFrom(
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

    public static com.google.protobuf.Parser<OperationalState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OperationalState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.OperationalState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ForwardingClassAccountingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ForwardingClassAccounting)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Interface protocol
     * </pre>
     *
     * <code>optional string if_family = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifFamily field is set.
     */
    boolean hasIfFamily();
    /**
     * <pre>
     * Interface protocol
     * </pre>
     *
     * <code>optional string if_family = 1 [(.telemetry_options) = { ... }</code>
     * @return The ifFamily.
     */
    java.lang.String getIfFamily();
    /**
     * <pre>
     * Interface protocol
     * </pre>
     *
     * <code>optional string if_family = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for ifFamily.
     */
    com.google.protobuf.ByteString
        getIfFamilyBytes();

    /**
     * <pre>
     * Forwarding class number
     * </pre>
     *
     * <code>optional uint32 fc_number = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the fcNumber field is set.
     */
    boolean hasFcNumber();
    /**
     * <pre>
     * Forwarding class number
     * </pre>
     *
     * <code>optional uint32 fc_number = 2 [(.telemetry_options) = { ... }</code>
     * @return The fcNumber.
     */
    int getFcNumber();

    /**
     * <pre>
     * Count of packets
     * </pre>
     *
     * <code>optional uint64 if_packets = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifPackets field is set.
     */
    boolean hasIfPackets();
    /**
     * <pre>
     * Count of packets
     * </pre>
     *
     * <code>optional uint64 if_packets = 3 [(.telemetry_options) = { ... }</code>
     * @return The ifPackets.
     */
    long getIfPackets();

    /**
     * <pre>
     * Count of bytes
     * </pre>
     *
     * <code>optional uint64 if_octets = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifOctets field is set.
     */
    boolean hasIfOctets();
    /**
     * <pre>
     * Count of bytes
     * </pre>
     *
     * <code>optional uint64 if_octets = 4 [(.telemetry_options) = { ... }</code>
     * @return The ifOctets.
     */
    long getIfOctets();
  }
  /**
   * <pre>
   *
   *  Interface forwarding class accounting
   * </pre>
   *
   * Protobuf type {@code ForwardingClassAccounting}
   */
  public static final class ForwardingClassAccounting extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ForwardingClassAccounting)
      ForwardingClassAccountingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ForwardingClassAccounting.newBuilder() to construct.
    private ForwardingClassAccounting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ForwardingClassAccounting() {
      ifFamily_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ForwardingClassAccounting();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_ForwardingClassAccounting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_ForwardingClassAccounting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.Builder.class);
    }

    private int bitField0_;
    public static final int IF_FAMILY_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object ifFamily_ = "";
    /**
     * <pre>
     * Interface protocol
     * </pre>
     *
     * <code>optional string if_family = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifFamily field is set.
     */
    @java.lang.Override
    public boolean hasIfFamily() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Interface protocol
     * </pre>
     *
     * <code>optional string if_family = 1 [(.telemetry_options) = { ... }</code>
     * @return The ifFamily.
     */
    @java.lang.Override
    public java.lang.String getIfFamily() {
      java.lang.Object ref = ifFamily_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ifFamily_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * Interface protocol
     * </pre>
     *
     * <code>optional string if_family = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for ifFamily.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIfFamilyBytes() {
      java.lang.Object ref = ifFamily_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ifFamily_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FC_NUMBER_FIELD_NUMBER = 2;
    private int fcNumber_ = 0;
    /**
     * <pre>
     * Forwarding class number
     * </pre>
     *
     * <code>optional uint32 fc_number = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the fcNumber field is set.
     */
    @java.lang.Override
    public boolean hasFcNumber() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Forwarding class number
     * </pre>
     *
     * <code>optional uint32 fc_number = 2 [(.telemetry_options) = { ... }</code>
     * @return The fcNumber.
     */
    @java.lang.Override
    public int getFcNumber() {
      return fcNumber_;
    }

    public static final int IF_PACKETS_FIELD_NUMBER = 3;
    private long ifPackets_ = 0L;
    /**
     * <pre>
     * Count of packets
     * </pre>
     *
     * <code>optional uint64 if_packets = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifPackets field is set.
     */
    @java.lang.Override
    public boolean hasIfPackets() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Count of packets
     * </pre>
     *
     * <code>optional uint64 if_packets = 3 [(.telemetry_options) = { ... }</code>
     * @return The ifPackets.
     */
    @java.lang.Override
    public long getIfPackets() {
      return ifPackets_;
    }

    public static final int IF_OCTETS_FIELD_NUMBER = 4;
    private long ifOctets_ = 0L;
    /**
     * <pre>
     * Count of bytes
     * </pre>
     *
     * <code>optional uint64 if_octets = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the ifOctets field is set.
     */
    @java.lang.Override
    public boolean hasIfOctets() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Count of bytes
     * </pre>
     *
     * <code>optional uint64 if_octets = 4 [(.telemetry_options) = { ... }</code>
     * @return The ifOctets.
     */
    @java.lang.Override
    public long getIfOctets() {
      return ifOctets_;
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ifFamily_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt32(2, fcNumber_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt64(3, ifPackets_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeUInt64(4, ifOctets_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ifFamily_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, fcNumber_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, ifPackets_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, ifOctets_);
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
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting) obj;

      if (hasIfFamily() != other.hasIfFamily()) return false;
      if (hasIfFamily()) {
        if (!getIfFamily()
            .equals(other.getIfFamily())) return false;
      }
      if (hasFcNumber() != other.hasFcNumber()) return false;
      if (hasFcNumber()) {
        if (getFcNumber()
            != other.getFcNumber()) return false;
      }
      if (hasIfPackets() != other.hasIfPackets()) return false;
      if (hasIfPackets()) {
        if (getIfPackets()
            != other.getIfPackets()) return false;
      }
      if (hasIfOctets() != other.hasIfOctets()) return false;
      if (hasIfOctets()) {
        if (getIfOctets()
            != other.getIfOctets()) return false;
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
      if (hasIfFamily()) {
        hash = (37 * hash) + IF_FAMILY_FIELD_NUMBER;
        hash = (53 * hash) + getIfFamily().hashCode();
      }
      if (hasFcNumber()) {
        hash = (37 * hash) + FC_NUMBER_FIELD_NUMBER;
        hash = (53 * hash) + getFcNumber();
      }
      if (hasIfPackets()) {
        hash = (37 * hash) + IF_PACKETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfPackets());
      }
      if (hasIfOctets()) {
        hash = (37 * hash) + IF_OCTETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIfOctets());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting prototype) {
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
     *  Interface forwarding class accounting
     * </pre>
     *
     * Protobuf type {@code ForwardingClassAccounting}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ForwardingClassAccounting)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccountingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_ForwardingClassAccounting_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_ForwardingClassAccounting_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.newBuilder()
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
        ifFamily_ = "";
        fcNumber_ = 0;
        ifPackets_ = 0L;
        ifOctets_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.internal_static_ForwardingClassAccounting_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.ifFamily_ = ifFamily_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.fcNumber_ = fcNumber_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.ifPackets_ = ifPackets_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.ifOctets_ = ifOctets_;
          to_bitField0_ |= 0x00000008;
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting.getDefaultInstance()) return this;
        if (other.hasIfFamily()) {
          ifFamily_ = other.ifFamily_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasFcNumber()) {
          setFcNumber(other.getFcNumber());
        }
        if (other.hasIfPackets()) {
          setIfPackets(other.getIfPackets());
        }
        if (other.hasIfOctets()) {
          setIfOctets(other.getIfOctets());
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
              case 10: {
                ifFamily_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                fcNumber_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                ifPackets_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                ifOctets_ = input.readUInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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

      private java.lang.Object ifFamily_ = "";
      /**
       * <pre>
       * Interface protocol
       * </pre>
       *
       * <code>optional string if_family = 1 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifFamily field is set.
       */
      public boolean hasIfFamily() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Interface protocol
       * </pre>
       *
       * <code>optional string if_family = 1 [(.telemetry_options) = { ... }</code>
       * @return The ifFamily.
       */
      public java.lang.String getIfFamily() {
        java.lang.Object ref = ifFamily_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            ifFamily_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Interface protocol
       * </pre>
       *
       * <code>optional string if_family = 1 [(.telemetry_options) = { ... }</code>
       * @return The bytes for ifFamily.
       */
      public com.google.protobuf.ByteString
          getIfFamilyBytes() {
        java.lang.Object ref = ifFamily_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ifFamily_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Interface protocol
       * </pre>
       *
       * <code>optional string if_family = 1 [(.telemetry_options) = { ... }</code>
       * @param value The ifFamily to set.
       * @return This builder for chaining.
       */
      public Builder setIfFamily(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ifFamily_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Interface protocol
       * </pre>
       *
       * <code>optional string if_family = 1 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfFamily() {
        ifFamily_ = getDefaultInstance().getIfFamily();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Interface protocol
       * </pre>
       *
       * <code>optional string if_family = 1 [(.telemetry_options) = { ... }</code>
       * @param value The bytes for ifFamily to set.
       * @return This builder for chaining.
       */
      public Builder setIfFamilyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        ifFamily_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private int fcNumber_ ;
      /**
       * <pre>
       * Forwarding class number
       * </pre>
       *
       * <code>optional uint32 fc_number = 2 [(.telemetry_options) = { ... }</code>
       * @return Whether the fcNumber field is set.
       */
      @java.lang.Override
      public boolean hasFcNumber() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Forwarding class number
       * </pre>
       *
       * <code>optional uint32 fc_number = 2 [(.telemetry_options) = { ... }</code>
       * @return The fcNumber.
       */
      @java.lang.Override
      public int getFcNumber() {
        return fcNumber_;
      }
      /**
       * <pre>
       * Forwarding class number
       * </pre>
       *
       * <code>optional uint32 fc_number = 2 [(.telemetry_options) = { ... }</code>
       * @param value The fcNumber to set.
       * @return This builder for chaining.
       */
      public Builder setFcNumber(int value) {

        fcNumber_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Forwarding class number
       * </pre>
       *
       * <code>optional uint32 fc_number = 2 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearFcNumber() {
        bitField0_ = (bitField0_ & ~0x00000002);
        fcNumber_ = 0;
        onChanged();
        return this;
      }

      private long ifPackets_ ;
      /**
       * <pre>
       * Count of packets
       * </pre>
       *
       * <code>optional uint64 if_packets = 3 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifPackets field is set.
       */
      @java.lang.Override
      public boolean hasIfPackets() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Count of packets
       * </pre>
       *
       * <code>optional uint64 if_packets = 3 [(.telemetry_options) = { ... }</code>
       * @return The ifPackets.
       */
      @java.lang.Override
      public long getIfPackets() {
        return ifPackets_;
      }
      /**
       * <pre>
       * Count of packets
       * </pre>
       *
       * <code>optional uint64 if_packets = 3 [(.telemetry_options) = { ... }</code>
       * @param value The ifPackets to set.
       * @return This builder for chaining.
       */
      public Builder setIfPackets(long value) {

        ifPackets_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Count of packets
       * </pre>
       *
       * <code>optional uint64 if_packets = 3 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfPackets() {
        bitField0_ = (bitField0_ & ~0x00000004);
        ifPackets_ = 0L;
        onChanged();
        return this;
      }

      private long ifOctets_ ;
      /**
       * <pre>
       * Count of bytes
       * </pre>
       *
       * <code>optional uint64 if_octets = 4 [(.telemetry_options) = { ... }</code>
       * @return Whether the ifOctets field is set.
       */
      @java.lang.Override
      public boolean hasIfOctets() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * Count of bytes
       * </pre>
       *
       * <code>optional uint64 if_octets = 4 [(.telemetry_options) = { ... }</code>
       * @return The ifOctets.
       */
      @java.lang.Override
      public long getIfOctets() {
        return ifOctets_;
      }
      /**
       * <pre>
       * Count of bytes
       * </pre>
       *
       * <code>optional uint64 if_octets = 4 [(.telemetry_options) = { ... }</code>
       * @param value The ifOctets to set.
       * @return This builder for chaining.
       */
      public Builder setIfOctets(long value) {

        ifOctets_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Count of bytes
       * </pre>
       *
       * <code>optional uint64 if_octets = 4 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearIfOctets() {
        bitField0_ = (bitField0_ & ~0x00000008);
        ifOctets_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:ForwardingClassAccounting)
    }

    // @@protoc_insertion_point(class_scope:ForwardingClassAccounting)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<ForwardingClassAccounting>
        PARSER = new com.google.protobuf.AbstractParser<ForwardingClassAccounting>() {
      @java.lang.Override
      public ForwardingClassAccounting parsePartialFrom(
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

    public static com.google.protobuf.Parser<ForwardingClassAccounting> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ForwardingClassAccounting> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.ForwardingClassAccounting getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int JNPRLOGICALINTERFACEEXT_FIELD_NUMBER = 7;
  /**
   * <code>extend .JuniperNetworksSensors { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors,
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort> jnprLogicalInterfaceExt = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort.class,
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.LogicalPortOuterClass.LogicalPort.getDefaultInstance());
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LogicalPort_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LogicalPort_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LogicalInterfaceInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LogicalInterfaceInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IngressInterfaceStats_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IngressInterfaceStats_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EgressInterfaceStats_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EgressInterfaceStats_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OperationalState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OperationalState_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ForwardingClassAccounting_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ForwardingClassAccounting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022logical_port.proto\032\023telemetry_top.prot" +
      "o\"<\n\013LogicalPort\022-\n\016interface_info\030\001 \003(\013" +
      "2\025.LogicalInterfaceInfo\"\206\002\n\024LogicalInter" +
      "faceInfo\022\026\n\007if_name\030\001 \002(\tB\005\202@\002\010\001\022\030\n\tinit" +
      "_time\030\002 \002(\004B\005\202@\002\020\001\022\034\n\rsnmp_if_index\030\003 \001(" +
      "\rB\005\202@\002\010\001\022\035\n\016parent_ae_name\030\004 \001(\tB\005\202@\002\010\001\022" +
      "-\n\ringress_stats\030\005 \001(\0132\026.IngressInterfac" +
      "eStats\022+\n\014egress_stats\030\006 \001(\0132\025.EgressInt" +
      "erfaceStats\022#\n\010op_state\030\007 \001(\0132\021.Operatio" +
      "nalState\"\277\001\n\025IngressInterfaceStats\022\031\n\nif" +
      "_packets\030\001 \002(\004B\005\202@\002\030\001\022\030\n\tif_octets\030\002 \002(\004" +
      "B\005\202@\002\030\001\022\037\n\020if_ucast_packets\030\003 \001(\004B\005\202@\002\030\001" +
      "\022\037\n\020if_mcast_packets\030\004 \002(\004B\005\202@\002\030\001\022/\n\013if_" +
      "fc_stats\030\005 \003(\0132\032.ForwardingClassAccounti" +
      "ng\"K\n\024EgressInterfaceStats\022\031\n\nif_packets" +
      "\030\001 \002(\004B\005\202@\002\030\001\022\030\n\tif_octets\030\002 \002(\004B\005\202@\002\030\001\"" +
      ".\n\020OperationalState\022\032\n\022operational_statu" +
      "s\030\001 \001(\t\"\204\001\n\031ForwardingClassAccounting\022\030\n" +
      "\tif_family\030\001 \001(\tB\005\202@\002\010\001\022\030\n\tfc_number\030\002 \001" +
      "(\rB\005\202@\002\010\001\022\031\n\nif_packets\030\003 \001(\004B\005\202@\002\030\001\022\030\n\t" +
      "if_octets\030\004 \001(\004B\005\202@\002\030\001:F\n\027jnprLogicalInt" +
      "erfaceExt\022\027.JuniperNetworksSensors\030\007 \001(\013" +
      "2\014.LogicalPortB:\n8org.opennms.netmgt.tel" +
      "emetry.protocols.jti.adapter.proto"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.getDescriptor(),
        });
    internal_static_LogicalPort_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LogicalPort_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LogicalPort_descriptor,
        new java.lang.String[] { "InterfaceInfo", });
    internal_static_LogicalInterfaceInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_LogicalInterfaceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LogicalInterfaceInfo_descriptor,
        new java.lang.String[] { "IfName", "InitTime", "SnmpIfIndex", "ParentAeName", "IngressStats", "EgressStats", "OpState", });
    internal_static_IngressInterfaceStats_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_IngressInterfaceStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IngressInterfaceStats_descriptor,
        new java.lang.String[] { "IfPackets", "IfOctets", "IfUcastPackets", "IfMcastPackets", "IfFcStats", });
    internal_static_EgressInterfaceStats_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_EgressInterfaceStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EgressInterfaceStats_descriptor,
        new java.lang.String[] { "IfPackets", "IfOctets", });
    internal_static_OperationalState_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_OperationalState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OperationalState_descriptor,
        new java.lang.String[] { "OperationalStatus", });
    internal_static_ForwardingClassAccounting_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ForwardingClassAccounting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ForwardingClassAccounting_descriptor,
        new java.lang.String[] { "IfFamily", "FcNumber", "IfPackets", "IfOctets", });
    jnprLogicalInterfaceExt.internalInit(descriptor.getExtensions().get(0));
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.telemetryOptions);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
