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

public final class CpuMemoryUtilizationOuterClass {
  private CpuMemoryUtilizationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(CpuMemoryUtilizationOuterClass.cpuMemoryUtilExt);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CpuMemoryUtilizationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CpuMemoryUtilization)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
     */
    java.util.List<CpuMemoryUtilizationSummary>
        getUtilizationList();
    /**
     * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
     */
    CpuMemoryUtilizationSummary getUtilization(int index);
    /**
     * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
     */
    int getUtilizationCount();
    /**
     * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
     */
    java.util.List<? extends CpuMemoryUtilizationSummaryOrBuilder>
        getUtilizationOrBuilderList();
    /**
     * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
     */
    CpuMemoryUtilizationSummaryOrBuilder getUtilizationOrBuilder(
        int index);
  }
  /**
   * <pre>
   *
   * The top level message is CpuMemoryUtilization
   * </pre>
   *
   * Protobuf type {@code CpuMemoryUtilization}
   */
  public static final class CpuMemoryUtilization extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CpuMemoryUtilization)
      CpuMemoryUtilizationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CpuMemoryUtilization.newBuilder() to construct.
    private CpuMemoryUtilization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CpuMemoryUtilization() {
      utilization_ = java.util.Collections.emptyList();
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new CpuMemoryUtilization();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CpuMemoryUtilizationOuterClass.internal_static_CpuMemoryUtilization_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CpuMemoryUtilizationOuterClass.internal_static_CpuMemoryUtilization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CpuMemoryUtilization.class, Builder.class);
    }

    public static final int UTILIZATION_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<CpuMemoryUtilizationSummary> utilization_;
    /**
     * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
     */
    @Override
    public java.util.List<CpuMemoryUtilizationSummary> getUtilizationList() {
      return utilization_;
    }
    /**
     * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
     */
    @Override
    public java.util.List<? extends CpuMemoryUtilizationSummaryOrBuilder>
        getUtilizationOrBuilderList() {
      return utilization_;
    }
    /**
     * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
     */
    @Override
    public int getUtilizationCount() {
      return utilization_.size();
    }
    /**
     * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
     */
    @Override
    public CpuMemoryUtilizationSummary getUtilization(int index) {
      return utilization_.get(index);
    }
    /**
     * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
     */
    @Override
    public CpuMemoryUtilizationSummaryOrBuilder getUtilizationOrBuilder(
        int index) {
      return utilization_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < utilization_.size(); i++) {
        output.writeMessage(1, utilization_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < utilization_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, utilization_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof CpuMemoryUtilization)) {
        return super.equals(obj);
      }
      CpuMemoryUtilization other = (CpuMemoryUtilization) obj;

      if (!getUtilizationList()
          .equals(other.getUtilizationList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getUtilizationCount() > 0) {
        hash = (37 * hash) + UTILIZATION_FIELD_NUMBER;
        hash = (53 * hash) + getUtilizationList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static CpuMemoryUtilization parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CpuMemoryUtilization parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CpuMemoryUtilization parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CpuMemoryUtilization parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CpuMemoryUtilization parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CpuMemoryUtilization parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CpuMemoryUtilization parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CpuMemoryUtilization parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static CpuMemoryUtilization parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static CpuMemoryUtilization parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static CpuMemoryUtilization parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CpuMemoryUtilization parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(CpuMemoryUtilization prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *
     * The top level message is CpuMemoryUtilization
     * </pre>
     *
     * Protobuf type {@code CpuMemoryUtilization}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CpuMemoryUtilization)
        CpuMemoryUtilizationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CpuMemoryUtilizationOuterClass.internal_static_CpuMemoryUtilization_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CpuMemoryUtilizationOuterClass.internal_static_CpuMemoryUtilization_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CpuMemoryUtilization.class, Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilization.newBuilder()
      private Builder() {

      }

      private Builder(
          BuilderParent parent) {
        super(parent);

      }
      @Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        if (utilizationBuilder_ == null) {
          utilization_ = java.util.Collections.emptyList();
        } else {
          utilization_ = null;
          utilizationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CpuMemoryUtilizationOuterClass.internal_static_CpuMemoryUtilization_descriptor;
      }

      @Override
      public CpuMemoryUtilization getDefaultInstanceForType() {
        return CpuMemoryUtilization.getDefaultInstance();
      }

      @Override
      public CpuMemoryUtilization build() {
        CpuMemoryUtilization result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public CpuMemoryUtilization buildPartial() {
        CpuMemoryUtilization result = new CpuMemoryUtilization(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(CpuMemoryUtilization result) {
        if (utilizationBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            utilization_ = java.util.Collections.unmodifiableList(utilization_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.utilization_ = utilization_;
        } else {
          result.utilization_ = utilizationBuilder_.build();
        }
      }

      private void buildPartial0(CpuMemoryUtilization result) {
        int from_bitField0_ = bitField0_;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof CpuMemoryUtilization) {
          return mergeFrom((CpuMemoryUtilization)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CpuMemoryUtilization other) {
        if (other == CpuMemoryUtilization.getDefaultInstance()) return this;
        if (utilizationBuilder_ == null) {
          if (!other.utilization_.isEmpty()) {
            if (utilization_.isEmpty()) {
              utilization_ = other.utilization_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUtilizationIsMutable();
              utilization_.addAll(other.utilization_);
            }
            onChanged();
          }
        } else {
          if (!other.utilization_.isEmpty()) {
            if (utilizationBuilder_.isEmpty()) {
              utilizationBuilder_.dispose();
              utilizationBuilder_ = null;
              utilization_ = other.utilization_;
              bitField0_ = (bitField0_ & ~0x00000001);
              utilizationBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUtilizationFieldBuilder() : null;
            } else {
              utilizationBuilder_.addAllMessages(other.utilization_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new NullPointerException();
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
                CpuMemoryUtilizationSummary m =
                    input.readMessage(
                        CpuMemoryUtilizationSummary.PARSER,
                        extensionRegistry);
                if (utilizationBuilder_ == null) {
                  ensureUtilizationIsMutable();
                  utilization_.add(m);
                } else {
                  utilizationBuilder_.addMessage(m);
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

      private java.util.List<CpuMemoryUtilizationSummary> utilization_ =
        java.util.Collections.emptyList();
      private void ensureUtilizationIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          utilization_ = new java.util.ArrayList<CpuMemoryUtilizationSummary>(utilization_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          CpuMemoryUtilizationSummary, CpuMemoryUtilizationSummary.Builder, CpuMemoryUtilizationSummaryOrBuilder> utilizationBuilder_;

      /**
       * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
       */
      public java.util.List<CpuMemoryUtilizationSummary> getUtilizationList() {
        if (utilizationBuilder_ == null) {
          return java.util.Collections.unmodifiableList(utilization_);
        } else {
          return utilizationBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
       */
      public int getUtilizationCount() {
        if (utilizationBuilder_ == null) {
          return utilization_.size();
        } else {
          return utilizationBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
       */
      public CpuMemoryUtilizationSummary getUtilization(int index) {
        if (utilizationBuilder_ == null) {
          return utilization_.get(index);
        } else {
          return utilizationBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
       */
      public Builder setUtilization(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary value) {
        if (utilizationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUtilizationIsMutable();
          utilization_.set(index, value);
          onChanged();
        } else {
          utilizationBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
       */
      public Builder setUtilization(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary.Builder builderForValue) {
        if (utilizationBuilder_ == null) {
          ensureUtilizationIsMutable();
          utilization_.set(index, builderForValue.build());
          onChanged();
        } else {
          utilizationBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
       */
      public Builder addUtilization(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary value) {
        if (utilizationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUtilizationIsMutable();
          utilization_.add(value);
          onChanged();
        } else {
          utilizationBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
       */
      public Builder addUtilization(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary value) {
        if (utilizationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUtilizationIsMutable();
          utilization_.add(index, value);
          onChanged();
        } else {
          utilizationBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
       */
      public Builder addUtilization(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary.Builder builderForValue) {
        if (utilizationBuilder_ == null) {
          ensureUtilizationIsMutable();
          utilization_.add(builderForValue.build());
          onChanged();
        } else {
          utilizationBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
       */
      public Builder addUtilization(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary.Builder builderForValue) {
        if (utilizationBuilder_ == null) {
          ensureUtilizationIsMutable();
          utilization_.add(index, builderForValue.build());
          onChanged();
        } else {
          utilizationBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
       */
      public Builder addAllUtilization(
          java.lang.Iterable<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary> values) {
        if (utilizationBuilder_ == null) {
          ensureUtilizationIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, utilization_);
          onChanged();
        } else {
          utilizationBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
       */
      public Builder clearUtilization() {
        if (utilizationBuilder_ == null) {
          utilization_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          utilizationBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
       */
      public Builder removeUtilization(int index) {
        if (utilizationBuilder_ == null) {
          ensureUtilizationIsMutable();
          utilization_.remove(index);
          onChanged();
        } else {
          utilizationBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary.Builder getUtilizationBuilder(
          int index) {
        return getUtilizationFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummaryOrBuilder getUtilizationOrBuilder(
          int index) {
        if (utilizationBuilder_ == null) {
          return utilization_.get(index);  } else {
          return utilizationBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
       */
      public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummaryOrBuilder> 
           getUtilizationOrBuilderList() {
        if (utilizationBuilder_ != null) {
          return utilizationBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(utilization_);
        }
      }
      /**
       * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary.Builder addUtilizationBuilder() {
        return getUtilizationFieldBuilder().addBuilder(
            org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary.getDefaultInstance());
      }
      /**
       * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary.Builder addUtilizationBuilder(
          int index) {
        return getUtilizationFieldBuilder().addBuilder(
            index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary.getDefaultInstance());
      }
      /**
       * <code>repeated .CpuMemoryUtilizationSummary utilization = 1;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary.Builder> 
           getUtilizationBuilderList() {
        return getUtilizationFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummaryOrBuilder> 
          getUtilizationFieldBuilder() {
        if (utilizationBuilder_ == null) {
          utilizationBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummaryOrBuilder>(
                  utilization_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          utilization_ = null;
        }
        return utilizationBuilder_;
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


      // @@protoc_insertion_point(builder_scope:CpuMemoryUtilization)
    }

    // @@protoc_insertion_point(class_scope:CpuMemoryUtilization)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilization DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilization();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilization getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CpuMemoryUtilization>
        PARSER = new com.google.protobuf.AbstractParser<CpuMemoryUtilization>() {
      @java.lang.Override
      public CpuMemoryUtilization parsePartialFrom(
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

    public static com.google.protobuf.Parser<CpuMemoryUtilization> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CpuMemoryUtilization> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilization getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CpuMemoryUtilizationSummaryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CpuMemoryUtilizationSummary)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Name of the partition.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <pre>
     * Name of the partition.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <pre>
     * Name of the partition.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * The total size of the partition in bytes
     * </pre>
     *
     * <code>optional uint64 size = 2;</code>
     * @return Whether the size field is set.
     */
    boolean hasSize();
    /**
     * <pre>
     * The total size of the partition in bytes
     * </pre>
     *
     * <code>optional uint64 size = 2;</code>
     * @return The size.
     */
    long getSize();

    /**
     * <pre>
     * The amount of memory currently allocated from the partition in bytes
     * </pre>
     *
     * <code>optional uint64 bytes_allocated = 3;</code>
     * @return Whether the bytesAllocated field is set.
     */
    boolean hasBytesAllocated();
    /**
     * <pre>
     * The amount of memory currently allocated from the partition in bytes
     * </pre>
     *
     * <code>optional uint64 bytes_allocated = 3;</code>
     * @return The bytesAllocated.
     */
    long getBytesAllocated();

    /**
     * <pre>
     * The amount of memory that is currently allocated, expressed
     * as percentage of the total (0--100).
     * </pre>
     *
     * <code>optional int32 utilization = 4;</code>
     * @return Whether the utilization field is set.
     */
    boolean hasUtilization();
    /**
     * <pre>
     * The amount of memory that is currently allocated, expressed
     * as percentage of the total (0--100).
     * </pre>
     *
     * <code>optional int32 utilization = 4;</code>
     * @return The utilization.
     */
    int getUtilization();

    /**
     * <pre>
     * Per application based memory utilization for this memory partition
     * </pre>
     *
     * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
     */
    java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication> 
        getApplicationUtilizationList();
    /**
     * <pre>
     * Per application based memory utilization for this memory partition
     * </pre>
     *
     * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication getApplicationUtilization(int index);
    /**
     * <pre>
     * Per application based memory utilization for this memory partition
     * </pre>
     *
     * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
     */
    int getApplicationUtilizationCount();
    /**
     * <pre>
     * Per application based memory utilization for this memory partition
     * </pre>
     *
     * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
     */
    java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplicationOrBuilder> 
        getApplicationUtilizationOrBuilderList();
    /**
     * <pre>
     * Per application based memory utilization for this memory partition
     * </pre>
     *
     * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplicationOrBuilder getApplicationUtilizationOrBuilder(
        int index);
  }
  /**
   * <pre>
   * This array gives the CPU  memory utilization on per partition basis
   * and also the per application memory utilization for each partition
   * </pre>
   *
   * Protobuf type {@code CpuMemoryUtilizationSummary}
   */
  public static final class CpuMemoryUtilizationSummary extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CpuMemoryUtilizationSummary)
      CpuMemoryUtilizationSummaryOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CpuMemoryUtilizationSummary.newBuilder() to construct.
    private CpuMemoryUtilizationSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CpuMemoryUtilizationSummary() {
      name_ = "";
      applicationUtilization_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CpuMemoryUtilizationSummary();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.internal_static_CpuMemoryUtilizationSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.internal_static_CpuMemoryUtilizationSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";
    /**
     * <pre>
     * Name of the partition.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Name of the partition.
     * </pre>
     *
     * <code>optional string name = 1;</code>
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
     * Name of the partition.
     * </pre>
     *
     * <code>optional string name = 1;</code>
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

    public static final int SIZE_FIELD_NUMBER = 2;
    private long size_ = 0L;
    /**
     * <pre>
     * The total size of the partition in bytes
     * </pre>
     *
     * <code>optional uint64 size = 2;</code>
     * @return Whether the size field is set.
     */
    @java.lang.Override
    public boolean hasSize() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The total size of the partition in bytes
     * </pre>
     *
     * <code>optional uint64 size = 2;</code>
     * @return The size.
     */
    @java.lang.Override
    public long getSize() {
      return size_;
    }

    public static final int BYTES_ALLOCATED_FIELD_NUMBER = 3;
    private long bytesAllocated_ = 0L;
    /**
     * <pre>
     * The amount of memory currently allocated from the partition in bytes
     * </pre>
     *
     * <code>optional uint64 bytes_allocated = 3;</code>
     * @return Whether the bytesAllocated field is set.
     */
    @java.lang.Override
    public boolean hasBytesAllocated() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The amount of memory currently allocated from the partition in bytes
     * </pre>
     *
     * <code>optional uint64 bytes_allocated = 3;</code>
     * @return The bytesAllocated.
     */
    @java.lang.Override
    public long getBytesAllocated() {
      return bytesAllocated_;
    }

    public static final int UTILIZATION_FIELD_NUMBER = 4;
    private int utilization_ = 0;
    /**
     * <pre>
     * The amount of memory that is currently allocated, expressed
     * as percentage of the total (0--100).
     * </pre>
     *
     * <code>optional int32 utilization = 4;</code>
     * @return Whether the utilization field is set.
     */
    @java.lang.Override
    public boolean hasUtilization() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * The amount of memory that is currently allocated, expressed
     * as percentage of the total (0--100).
     * </pre>
     *
     * <code>optional int32 utilization = 4;</code>
     * @return The utilization.
     */
    @java.lang.Override
    public int getUtilization() {
      return utilization_;
    }

    public static final int APPLICATION_UTILIZATION_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication> applicationUtilization_;
    /**
     * <pre>
     * Per application based memory utilization for this memory partition
     * </pre>
     *
     * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication> getApplicationUtilizationList() {
      return applicationUtilization_;
    }
    /**
     * <pre>
     * Per application based memory utilization for this memory partition
     * </pre>
     *
     * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplicationOrBuilder> 
        getApplicationUtilizationOrBuilderList() {
      return applicationUtilization_;
    }
    /**
     * <pre>
     * Per application based memory utilization for this memory partition
     * </pre>
     *
     * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
     */
    @java.lang.Override
    public int getApplicationUtilizationCount() {
      return applicationUtilization_.size();
    }
    /**
     * <pre>
     * Per application based memory utilization for this memory partition
     * </pre>
     *
     * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication getApplicationUtilization(int index) {
      return applicationUtilization_.get(index);
    }
    /**
     * <pre>
     * Per application based memory utilization for this memory partition
     * </pre>
     *
     * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplicationOrBuilder getApplicationUtilizationOrBuilder(
        int index) {
      return applicationUtilization_.get(index);
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, size_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt64(3, bytesAllocated_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeInt32(4, utilization_);
      }
      for (int i = 0; i < applicationUtilization_.size(); i++) {
        output.writeMessage(5, applicationUtilization_.get(i));
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
          .computeUInt64Size(2, size_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, bytesAllocated_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, utilization_);
      }
      for (int i = 0; i < applicationUtilization_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, applicationUtilization_.get(i));
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
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary) obj;

      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasSize() != other.hasSize()) return false;
      if (hasSize()) {
        if (getSize()
            != other.getSize()) return false;
      }
      if (hasBytesAllocated() != other.hasBytesAllocated()) return false;
      if (hasBytesAllocated()) {
        if (getBytesAllocated()
            != other.getBytesAllocated()) return false;
      }
      if (hasUtilization() != other.hasUtilization()) return false;
      if (hasUtilization()) {
        if (getUtilization()
            != other.getUtilization()) return false;
      }
      if (!getApplicationUtilizationList()
          .equals(other.getApplicationUtilizationList())) return false;
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
      if (hasSize()) {
        hash = (37 * hash) + SIZE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSize());
      }
      if (hasBytesAllocated()) {
        hash = (37 * hash) + BYTES_ALLOCATED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getBytesAllocated());
      }
      if (hasUtilization()) {
        hash = (37 * hash) + UTILIZATION_FIELD_NUMBER;
        hash = (53 * hash) + getUtilization();
      }
      if (getApplicationUtilizationCount() > 0) {
        hash = (37 * hash) + APPLICATION_UTILIZATION_FIELD_NUMBER;
        hash = (53 * hash) + getApplicationUtilizationList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary prototype) {
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
     * This array gives the CPU  memory utilization on per partition basis
     * and also the per application memory utilization for each partition
     * </pre>
     *
     * Protobuf type {@code CpuMemoryUtilizationSummary}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CpuMemoryUtilizationSummary)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummaryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.internal_static_CpuMemoryUtilizationSummary_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.internal_static_CpuMemoryUtilizationSummary_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary.newBuilder()
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
        size_ = 0L;
        bytesAllocated_ = 0L;
        utilization_ = 0;
        if (applicationUtilizationBuilder_ == null) {
          applicationUtilization_ = java.util.Collections.emptyList();
        } else {
          applicationUtilization_ = null;
          applicationUtilizationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.internal_static_CpuMemoryUtilizationSummary_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary result) {
        if (applicationUtilizationBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0)) {
            applicationUtilization_ = java.util.Collections.unmodifiableList(applicationUtilization_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.applicationUtilization_ = applicationUtilization_;
        } else {
          result.applicationUtilization_ = applicationUtilizationBuilder_.build();
        }
      }

      private void buildPartial0(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.name_ = name_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.size_ = size_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.bytesAllocated_ = bytesAllocated_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.utilization_ = utilization_;
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary.getDefaultInstance()) return this;
        if (other.hasName()) {
          name_ = other.name_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasSize()) {
          setSize(other.getSize());
        }
        if (other.hasBytesAllocated()) {
          setBytesAllocated(other.getBytesAllocated());
        }
        if (other.hasUtilization()) {
          setUtilization(other.getUtilization());
        }
        if (applicationUtilizationBuilder_ == null) {
          if (!other.applicationUtilization_.isEmpty()) {
            if (applicationUtilization_.isEmpty()) {
              applicationUtilization_ = other.applicationUtilization_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureApplicationUtilizationIsMutable();
              applicationUtilization_.addAll(other.applicationUtilization_);
            }
            onChanged();
          }
        } else {
          if (!other.applicationUtilization_.isEmpty()) {
            if (applicationUtilizationBuilder_.isEmpty()) {
              applicationUtilizationBuilder_.dispose();
              applicationUtilizationBuilder_ = null;
              applicationUtilization_ = other.applicationUtilization_;
              bitField0_ = (bitField0_ & ~0x00000010);
              applicationUtilizationBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getApplicationUtilizationFieldBuilder() : null;
            } else {
              applicationUtilizationBuilder_.addAllMessages(other.applicationUtilization_);
            }
          }
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
                name_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                size_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                bytesAllocated_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                utilization_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 42: {
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication m =
                    input.readMessage(
                        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.PARSER,
                        extensionRegistry);
                if (applicationUtilizationBuilder_ == null) {
                  ensureApplicationUtilizationIsMutable();
                  applicationUtilization_.add(m);
                } else {
                  applicationUtilizationBuilder_.addMessage(m);
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

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * Name of the partition.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Name of the partition.
       * </pre>
       *
       * <code>optional string name = 1;</code>
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
       * Name of the partition.
       * </pre>
       *
       * <code>optional string name = 1;</code>
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
       * Name of the partition.
       * </pre>
       *
       * <code>optional string name = 1;</code>
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
       * Name of the partition.
       * </pre>
       *
       * <code>optional string name = 1;</code>
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
       * Name of the partition.
       * </pre>
       *
       * <code>optional string name = 1;</code>
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

      private long size_ ;
      /**
       * <pre>
       * The total size of the partition in bytes
       * </pre>
       *
       * <code>optional uint64 size = 2;</code>
       * @return Whether the size field is set.
       */
      @java.lang.Override
      public boolean hasSize() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * The total size of the partition in bytes
       * </pre>
       *
       * <code>optional uint64 size = 2;</code>
       * @return The size.
       */
      @java.lang.Override
      public long getSize() {
        return size_;
      }
      /**
       * <pre>
       * The total size of the partition in bytes
       * </pre>
       *
       * <code>optional uint64 size = 2;</code>
       * @param value The size to set.
       * @return This builder for chaining.
       */
      public Builder setSize(long value) {

        size_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The total size of the partition in bytes
       * </pre>
       *
       * <code>optional uint64 size = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSize() {
        bitField0_ = (bitField0_ & ~0x00000002);
        size_ = 0L;
        onChanged();
        return this;
      }

      private long bytesAllocated_ ;
      /**
       * <pre>
       * The amount of memory currently allocated from the partition in bytes
       * </pre>
       *
       * <code>optional uint64 bytes_allocated = 3;</code>
       * @return Whether the bytesAllocated field is set.
       */
      @java.lang.Override
      public boolean hasBytesAllocated() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * The amount of memory currently allocated from the partition in bytes
       * </pre>
       *
       * <code>optional uint64 bytes_allocated = 3;</code>
       * @return The bytesAllocated.
       */
      @java.lang.Override
      public long getBytesAllocated() {
        return bytesAllocated_;
      }
      /**
       * <pre>
       * The amount of memory currently allocated from the partition in bytes
       * </pre>
       *
       * <code>optional uint64 bytes_allocated = 3;</code>
       * @param value The bytesAllocated to set.
       * @return This builder for chaining.
       */
      public Builder setBytesAllocated(long value) {

        bytesAllocated_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The amount of memory currently allocated from the partition in bytes
       * </pre>
       *
       * <code>optional uint64 bytes_allocated = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBytesAllocated() {
        bitField0_ = (bitField0_ & ~0x00000004);
        bytesAllocated_ = 0L;
        onChanged();
        return this;
      }

      private int utilization_ ;
      /**
       * <pre>
       * The amount of memory that is currently allocated, expressed
       * as percentage of the total (0--100).
       * </pre>
       *
       * <code>optional int32 utilization = 4;</code>
       * @return Whether the utilization field is set.
       */
      @java.lang.Override
      public boolean hasUtilization() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * The amount of memory that is currently allocated, expressed
       * as percentage of the total (0--100).
       * </pre>
       *
       * <code>optional int32 utilization = 4;</code>
       * @return The utilization.
       */
      @java.lang.Override
      public int getUtilization() {
        return utilization_;
      }
      /**
       * <pre>
       * The amount of memory that is currently allocated, expressed
       * as percentage of the total (0--100).
       * </pre>
       *
       * <code>optional int32 utilization = 4;</code>
       * @param value The utilization to set.
       * @return This builder for chaining.
       */
      public Builder setUtilization(int value) {

        utilization_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The amount of memory that is currently allocated, expressed
       * as percentage of the total (0--100).
       * </pre>
       *
       * <code>optional int32 utilization = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUtilization() {
        bitField0_ = (bitField0_ & ~0x00000008);
        utilization_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication> applicationUtilization_ =
        java.util.Collections.emptyList();
      private void ensureApplicationUtilizationIsMutable() {
        if (!((bitField0_ & 0x00000010) != 0)) {
          applicationUtilization_ = new java.util.ArrayList<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication>(applicationUtilization_);
          bitField0_ |= 0x00000010;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplicationOrBuilder> applicationUtilizationBuilder_;

      /**
       * <pre>
       * Per application based memory utilization for this memory partition
       * </pre>
       *
       * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication> getApplicationUtilizationList() {
        if (applicationUtilizationBuilder_ == null) {
          return java.util.Collections.unmodifiableList(applicationUtilization_);
        } else {
          return applicationUtilizationBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * Per application based memory utilization for this memory partition
       * </pre>
       *
       * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
       */
      public int getApplicationUtilizationCount() {
        if (applicationUtilizationBuilder_ == null) {
          return applicationUtilization_.size();
        } else {
          return applicationUtilizationBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * Per application based memory utilization for this memory partition
       * </pre>
       *
       * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication getApplicationUtilization(int index) {
        if (applicationUtilizationBuilder_ == null) {
          return applicationUtilization_.get(index);
        } else {
          return applicationUtilizationBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * Per application based memory utilization for this memory partition
       * </pre>
       *
       * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
       */
      public Builder setApplicationUtilization(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication value) {
        if (applicationUtilizationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureApplicationUtilizationIsMutable();
          applicationUtilization_.set(index, value);
          onChanged();
        } else {
          applicationUtilizationBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Per application based memory utilization for this memory partition
       * </pre>
       *
       * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
       */
      public Builder setApplicationUtilization(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.Builder builderForValue) {
        if (applicationUtilizationBuilder_ == null) {
          ensureApplicationUtilizationIsMutable();
          applicationUtilization_.set(index, builderForValue.build());
          onChanged();
        } else {
          applicationUtilizationBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Per application based memory utilization for this memory partition
       * </pre>
       *
       * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
       */
      public Builder addApplicationUtilization(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication value) {
        if (applicationUtilizationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureApplicationUtilizationIsMutable();
          applicationUtilization_.add(value);
          onChanged();
        } else {
          applicationUtilizationBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * Per application based memory utilization for this memory partition
       * </pre>
       *
       * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
       */
      public Builder addApplicationUtilization(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication value) {
        if (applicationUtilizationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureApplicationUtilizationIsMutable();
          applicationUtilization_.add(index, value);
          onChanged();
        } else {
          applicationUtilizationBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Per application based memory utilization for this memory partition
       * </pre>
       *
       * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
       */
      public Builder addApplicationUtilization(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.Builder builderForValue) {
        if (applicationUtilizationBuilder_ == null) {
          ensureApplicationUtilizationIsMutable();
          applicationUtilization_.add(builderForValue.build());
          onChanged();
        } else {
          applicationUtilizationBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Per application based memory utilization for this memory partition
       * </pre>
       *
       * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
       */
      public Builder addApplicationUtilization(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.Builder builderForValue) {
        if (applicationUtilizationBuilder_ == null) {
          ensureApplicationUtilizationIsMutable();
          applicationUtilization_.add(index, builderForValue.build());
          onChanged();
        } else {
          applicationUtilizationBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Per application based memory utilization for this memory partition
       * </pre>
       *
       * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
       */
      public Builder addAllApplicationUtilization(
          java.lang.Iterable<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication> values) {
        if (applicationUtilizationBuilder_ == null) {
          ensureApplicationUtilizationIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, applicationUtilization_);
          onChanged();
        } else {
          applicationUtilizationBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * Per application based memory utilization for this memory partition
       * </pre>
       *
       * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
       */
      public Builder clearApplicationUtilization() {
        if (applicationUtilizationBuilder_ == null) {
          applicationUtilization_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          applicationUtilizationBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * Per application based memory utilization for this memory partition
       * </pre>
       *
       * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
       */
      public Builder removeApplicationUtilization(int index) {
        if (applicationUtilizationBuilder_ == null) {
          ensureApplicationUtilizationIsMutable();
          applicationUtilization_.remove(index);
          onChanged();
        } else {
          applicationUtilizationBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * Per application based memory utilization for this memory partition
       * </pre>
       *
       * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.Builder getApplicationUtilizationBuilder(
          int index) {
        return getApplicationUtilizationFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * Per application based memory utilization for this memory partition
       * </pre>
       *
       * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplicationOrBuilder getApplicationUtilizationOrBuilder(
          int index) {
        if (applicationUtilizationBuilder_ == null) {
          return applicationUtilization_.get(index);  } else {
          return applicationUtilizationBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * Per application based memory utilization for this memory partition
       * </pre>
       *
       * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
       */
      public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplicationOrBuilder> 
           getApplicationUtilizationOrBuilderList() {
        if (applicationUtilizationBuilder_ != null) {
          return applicationUtilizationBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(applicationUtilization_);
        }
      }
      /**
       * <pre>
       * Per application based memory utilization for this memory partition
       * </pre>
       *
       * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.Builder addApplicationUtilizationBuilder() {
        return getApplicationUtilizationFieldBuilder().addBuilder(
            org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.getDefaultInstance());
      }
      /**
       * <pre>
       * Per application based memory utilization for this memory partition
       * </pre>
       *
       * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.Builder addApplicationUtilizationBuilder(
          int index) {
        return getApplicationUtilizationFieldBuilder().addBuilder(
            index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.getDefaultInstance());
      }
      /**
       * <pre>
       * Per application based memory utilization for this memory partition
       * </pre>
       *
       * <code>repeated .CpuMemoryUtilizationPerApplication application_utilization = 5;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.Builder> 
           getApplicationUtilizationBuilderList() {
        return getApplicationUtilizationFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplicationOrBuilder> 
          getApplicationUtilizationFieldBuilder() {
        if (applicationUtilizationBuilder_ == null) {
          applicationUtilizationBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplicationOrBuilder>(
                  applicationUtilization_,
                  ((bitField0_ & 0x00000010) != 0),
                  getParentForChildren(),
                  isClean());
          applicationUtilization_ = null;
        }
        return applicationUtilizationBuilder_;
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


      // @@protoc_insertion_point(builder_scope:CpuMemoryUtilizationSummary)
    }

    // @@protoc_insertion_point(class_scope:CpuMemoryUtilizationSummary)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CpuMemoryUtilizationSummary>
        PARSER = new com.google.protobuf.AbstractParser<CpuMemoryUtilizationSummary>() {
      @java.lang.Override
      public CpuMemoryUtilizationSummary parsePartialFrom(
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

    public static com.google.protobuf.Parser<CpuMemoryUtilizationSummary> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CpuMemoryUtilizationSummary> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationSummary getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CpuMemoryUtilizationPerApplicationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CpuMemoryUtilizationPerApplication)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Application name
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <pre>
     * Application name
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <pre>
     * Application name
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * Number of bytes allocated
     * </pre>
     *
     * <code>optional uint64 bytes_allocated = 2;</code>
     * @return Whether the bytesAllocated field is set.
     */
    boolean hasBytesAllocated();
    /**
     * <pre>
     * Number of bytes allocated
     * </pre>
     *
     * <code>optional uint64 bytes_allocated = 2;</code>
     * @return The bytesAllocated.
     */
    long getBytesAllocated();

    /**
     * <pre>
     *  Number of allocations
     * </pre>
     *
     * <code>optional uint64 allocations = 3;</code>
     * @return Whether the allocations field is set.
     */
    boolean hasAllocations();
    /**
     * <pre>
     *  Number of allocations
     * </pre>
     *
     * <code>optional uint64 allocations = 3;</code>
     * @return The allocations.
     */
    long getAllocations();

    /**
     * <pre>
     *  Number of frees
     * </pre>
     *
     * <code>optional uint64 frees = 4;</code>
     * @return Whether the frees field is set.
     */
    boolean hasFrees();
    /**
     * <pre>
     *  Number of frees
     * </pre>
     *
     * <code>optional uint64 frees = 4;</code>
     * @return The frees.
     */
    long getFrees();

    /**
     * <pre>
     * Number of allocations failed
     * </pre>
     *
     * <code>optional uint64 allocations_failed = 5;</code>
     * @return Whether the allocationsFailed field is set.
     */
    boolean hasAllocationsFailed();
    /**
     * <pre>
     * Number of allocations failed
     * </pre>
     *
     * <code>optional uint64 allocations_failed = 5;</code>
     * @return The allocationsFailed.
     */
    long getAllocationsFailed();
  }
  /**
   * <pre>
   * This describes per Application specific CPU memory utilization
   * </pre>
   *
   * Protobuf type {@code CpuMemoryUtilizationPerApplication}
   */
  public static final class CpuMemoryUtilizationPerApplication extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CpuMemoryUtilizationPerApplication)
      CpuMemoryUtilizationPerApplicationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CpuMemoryUtilizationPerApplication.newBuilder() to construct.
    private CpuMemoryUtilizationPerApplication(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CpuMemoryUtilizationPerApplication() {
      name_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CpuMemoryUtilizationPerApplication();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.internal_static_CpuMemoryUtilizationPerApplication_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.internal_static_CpuMemoryUtilizationPerApplication_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";
    /**
     * <pre>
     * Application name
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Application name
     * </pre>
     *
     * <code>optional string name = 1;</code>
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
     * Application name
     * </pre>
     *
     * <code>optional string name = 1;</code>
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

    public static final int BYTES_ALLOCATED_FIELD_NUMBER = 2;
    private long bytesAllocated_ = 0L;
    /**
     * <pre>
     * Number of bytes allocated
     * </pre>
     *
     * <code>optional uint64 bytes_allocated = 2;</code>
     * @return Whether the bytesAllocated field is set.
     */
    @java.lang.Override
    public boolean hasBytesAllocated() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Number of bytes allocated
     * </pre>
     *
     * <code>optional uint64 bytes_allocated = 2;</code>
     * @return The bytesAllocated.
     */
    @java.lang.Override
    public long getBytesAllocated() {
      return bytesAllocated_;
    }

    public static final int ALLOCATIONS_FIELD_NUMBER = 3;
    private long allocations_ = 0L;
    /**
     * <pre>
     *  Number of allocations
     * </pre>
     *
     * <code>optional uint64 allocations = 3;</code>
     * @return Whether the allocations field is set.
     */
    @java.lang.Override
    public boolean hasAllocations() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     *  Number of allocations
     * </pre>
     *
     * <code>optional uint64 allocations = 3;</code>
     * @return The allocations.
     */
    @java.lang.Override
    public long getAllocations() {
      return allocations_;
    }

    public static final int FREES_FIELD_NUMBER = 4;
    private long frees_ = 0L;
    /**
     * <pre>
     *  Number of frees
     * </pre>
     *
     * <code>optional uint64 frees = 4;</code>
     * @return Whether the frees field is set.
     */
    @java.lang.Override
    public boolean hasFrees() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     *  Number of frees
     * </pre>
     *
     * <code>optional uint64 frees = 4;</code>
     * @return The frees.
     */
    @java.lang.Override
    public long getFrees() {
      return frees_;
    }

    public static final int ALLOCATIONS_FAILED_FIELD_NUMBER = 5;
    private long allocationsFailed_ = 0L;
    /**
     * <pre>
     * Number of allocations failed
     * </pre>
     *
     * <code>optional uint64 allocations_failed = 5;</code>
     * @return Whether the allocationsFailed field is set.
     */
    @java.lang.Override
    public boolean hasAllocationsFailed() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * Number of allocations failed
     * </pre>
     *
     * <code>optional uint64 allocations_failed = 5;</code>
     * @return The allocationsFailed.
     */
    @java.lang.Override
    public long getAllocationsFailed() {
      return allocationsFailed_;
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, bytesAllocated_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt64(3, allocations_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeUInt64(4, frees_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeUInt64(5, allocationsFailed_);
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
          .computeUInt64Size(2, bytesAllocated_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, allocations_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, frees_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, allocationsFailed_);
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
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication) obj;

      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasBytesAllocated() != other.hasBytesAllocated()) return false;
      if (hasBytesAllocated()) {
        if (getBytesAllocated()
            != other.getBytesAllocated()) return false;
      }
      if (hasAllocations() != other.hasAllocations()) return false;
      if (hasAllocations()) {
        if (getAllocations()
            != other.getAllocations()) return false;
      }
      if (hasFrees() != other.hasFrees()) return false;
      if (hasFrees()) {
        if (getFrees()
            != other.getFrees()) return false;
      }
      if (hasAllocationsFailed() != other.hasAllocationsFailed()) return false;
      if (hasAllocationsFailed()) {
        if (getAllocationsFailed()
            != other.getAllocationsFailed()) return false;
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
      if (hasBytesAllocated()) {
        hash = (37 * hash) + BYTES_ALLOCATED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getBytesAllocated());
      }
      if (hasAllocations()) {
        hash = (37 * hash) + ALLOCATIONS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getAllocations());
      }
      if (hasFrees()) {
        hash = (37 * hash) + FREES_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getFrees());
      }
      if (hasAllocationsFailed()) {
        hash = (37 * hash) + ALLOCATIONS_FAILED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getAllocationsFailed());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication prototype) {
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
     * This describes per Application specific CPU memory utilization
     * </pre>
     *
     * Protobuf type {@code CpuMemoryUtilizationPerApplication}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CpuMemoryUtilizationPerApplication)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplicationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.internal_static_CpuMemoryUtilizationPerApplication_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.internal_static_CpuMemoryUtilizationPerApplication_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.newBuilder()
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
        bytesAllocated_ = 0L;
        allocations_ = 0L;
        frees_ = 0L;
        allocationsFailed_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.internal_static_CpuMemoryUtilizationPerApplication_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.name_ = name_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.bytesAllocated_ = bytesAllocated_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.allocations_ = allocations_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.frees_ = frees_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.allocationsFailed_ = allocationsFailed_;
          to_bitField0_ |= 0x00000010;
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication.getDefaultInstance()) return this;
        if (other.hasName()) {
          name_ = other.name_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasBytesAllocated()) {
          setBytesAllocated(other.getBytesAllocated());
        }
        if (other.hasAllocations()) {
          setAllocations(other.getAllocations());
        }
        if (other.hasFrees()) {
          setFrees(other.getFrees());
        }
        if (other.hasAllocationsFailed()) {
          setAllocationsFailed(other.getAllocationsFailed());
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
                name_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                bytesAllocated_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                allocations_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                frees_ = input.readUInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 40: {
                allocationsFailed_ = input.readUInt64();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
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
       * Application name
       * </pre>
       *
       * <code>optional string name = 1;</code>
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Application name
       * </pre>
       *
       * <code>optional string name = 1;</code>
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
       * Application name
       * </pre>
       *
       * <code>optional string name = 1;</code>
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
       * Application name
       * </pre>
       *
       * <code>optional string name = 1;</code>
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
       * Application name
       * </pre>
       *
       * <code>optional string name = 1;</code>
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
       * Application name
       * </pre>
       *
       * <code>optional string name = 1;</code>
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

      private long bytesAllocated_ ;
      /**
       * <pre>
       * Number of bytes allocated
       * </pre>
       *
       * <code>optional uint64 bytes_allocated = 2;</code>
       * @return Whether the bytesAllocated field is set.
       */
      @java.lang.Override
      public boolean hasBytesAllocated() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Number of bytes allocated
       * </pre>
       *
       * <code>optional uint64 bytes_allocated = 2;</code>
       * @return The bytesAllocated.
       */
      @java.lang.Override
      public long getBytesAllocated() {
        return bytesAllocated_;
      }
      /**
       * <pre>
       * Number of bytes allocated
       * </pre>
       *
       * <code>optional uint64 bytes_allocated = 2;</code>
       * @param value The bytesAllocated to set.
       * @return This builder for chaining.
       */
      public Builder setBytesAllocated(long value) {

        bytesAllocated_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Number of bytes allocated
       * </pre>
       *
       * <code>optional uint64 bytes_allocated = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBytesAllocated() {
        bitField0_ = (bitField0_ & ~0x00000002);
        bytesAllocated_ = 0L;
        onChanged();
        return this;
      }

      private long allocations_ ;
      /**
       * <pre>
       *  Number of allocations
       * </pre>
       *
       * <code>optional uint64 allocations = 3;</code>
       * @return Whether the allocations field is set.
       */
      @java.lang.Override
      public boolean hasAllocations() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       *  Number of allocations
       * </pre>
       *
       * <code>optional uint64 allocations = 3;</code>
       * @return The allocations.
       */
      @java.lang.Override
      public long getAllocations() {
        return allocations_;
      }
      /**
       * <pre>
       *  Number of allocations
       * </pre>
       *
       * <code>optional uint64 allocations = 3;</code>
       * @param value The allocations to set.
       * @return This builder for chaining.
       */
      public Builder setAllocations(long value) {

        allocations_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *  Number of allocations
       * </pre>
       *
       * <code>optional uint64 allocations = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAllocations() {
        bitField0_ = (bitField0_ & ~0x00000004);
        allocations_ = 0L;
        onChanged();
        return this;
      }

      private long frees_ ;
      /**
       * <pre>
       *  Number of frees
       * </pre>
       *
       * <code>optional uint64 frees = 4;</code>
       * @return Whether the frees field is set.
       */
      @java.lang.Override
      public boolean hasFrees() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       *  Number of frees
       * </pre>
       *
       * <code>optional uint64 frees = 4;</code>
       * @return The frees.
       */
      @java.lang.Override
      public long getFrees() {
        return frees_;
      }
      /**
       * <pre>
       *  Number of frees
       * </pre>
       *
       * <code>optional uint64 frees = 4;</code>
       * @param value The frees to set.
       * @return This builder for chaining.
       */
      public Builder setFrees(long value) {

        frees_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *  Number of frees
       * </pre>
       *
       * <code>optional uint64 frees = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearFrees() {
        bitField0_ = (bitField0_ & ~0x00000008);
        frees_ = 0L;
        onChanged();
        return this;
      }

      private long allocationsFailed_ ;
      /**
       * <pre>
       * Number of allocations failed
       * </pre>
       *
       * <code>optional uint64 allocations_failed = 5;</code>
       * @return Whether the allocationsFailed field is set.
       */
      @java.lang.Override
      public boolean hasAllocationsFailed() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       * Number of allocations failed
       * </pre>
       *
       * <code>optional uint64 allocations_failed = 5;</code>
       * @return The allocationsFailed.
       */
      @java.lang.Override
      public long getAllocationsFailed() {
        return allocationsFailed_;
      }
      /**
       * <pre>
       * Number of allocations failed
       * </pre>
       *
       * <code>optional uint64 allocations_failed = 5;</code>
       * @param value The allocationsFailed to set.
       * @return This builder for chaining.
       */
      public Builder setAllocationsFailed(long value) {

        allocationsFailed_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Number of allocations failed
       * </pre>
       *
       * <code>optional uint64 allocations_failed = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAllocationsFailed() {
        bitField0_ = (bitField0_ & ~0x00000010);
        allocationsFailed_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:CpuMemoryUtilizationPerApplication)
    }

    // @@protoc_insertion_point(class_scope:CpuMemoryUtilizationPerApplication)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CpuMemoryUtilizationPerApplication>
        PARSER = new com.google.protobuf.AbstractParser<CpuMemoryUtilizationPerApplication>() {
      @java.lang.Override
      public CpuMemoryUtilizationPerApplication parsePartialFrom(
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

    public static com.google.protobuf.Parser<CpuMemoryUtilizationPerApplication> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CpuMemoryUtilizationPerApplication> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilizationPerApplication getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int CPU_MEMORY_UTIL_EXT_FIELD_NUMBER = 1;
  /**
   * <code>extend .JuniperNetworksSensors { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors,
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilization> cpuMemoryUtilExt = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilization.class,
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.CpuMemoryUtilizationOuterClass.CpuMemoryUtilization.getDefaultInstance());
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CpuMemoryUtilization_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CpuMemoryUtilization_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CpuMemoryUtilizationSummary_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CpuMemoryUtilizationSummary_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CpuMemoryUtilizationPerApplication_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CpuMemoryUtilizationPerApplication_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034cpu_memory_utilization.proto\032\023telemetr" +
      "y_top.proto\"I\n\024CpuMemoryUtilization\0221\n\013u" +
      "tilization\030\001 \003(\0132\034.CpuMemoryUtilizationS" +
      "ummary\"\255\001\n\033CpuMemoryUtilizationSummary\022\014" +
      "\n\004name\030\001 \001(\t\022\014\n\004size\030\002 \001(\004\022\027\n\017bytes_allo" +
      "cated\030\003 \001(\004\022\023\n\013utilization\030\004 \001(\005\022D\n\027appl" +
      "ication_utilization\030\005 \003(\0132#.CpuMemoryUti" +
      "lizationPerApplication\"\213\001\n\"CpuMemoryUtil" +
      "izationPerApplication\022\014\n\004name\030\001 \001(\t\022\027\n\017b" +
      "ytes_allocated\030\002 \001(\004\022\023\n\013allocations\030\003 \001(" +
      "\004\022\r\n\005frees\030\004 \001(\004\022\032\n\022allocations_failed\030\005" +
      " \001(\004:K\n\023cpu_memory_util_ext\022\027.JuniperNet" +
      "worksSensors\030\001 \001(\0132\025.CpuMemoryUtilizatio" +
      "nB:\n8org.opennms.netmgt.telemetry.protoc" +
      "ols.jti.adapter.proto"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.getDescriptor(),
        });
    internal_static_CpuMemoryUtilization_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CpuMemoryUtilization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CpuMemoryUtilization_descriptor,
        new java.lang.String[] { "Utilization", });
    internal_static_CpuMemoryUtilizationSummary_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CpuMemoryUtilizationSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CpuMemoryUtilizationSummary_descriptor,
        new java.lang.String[] { "Name", "Size", "BytesAllocated", "Utilization", "ApplicationUtilization", });
    internal_static_CpuMemoryUtilizationPerApplication_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_CpuMemoryUtilizationPerApplication_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CpuMemoryUtilizationPerApplication_descriptor,
        new java.lang.String[] { "Name", "BytesAllocated", "Allocations", "Frees", "AllocationsFailed", });
    cpuMemoryUtilExt.internalInit(descriptor.getExtensions().get(0));
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
