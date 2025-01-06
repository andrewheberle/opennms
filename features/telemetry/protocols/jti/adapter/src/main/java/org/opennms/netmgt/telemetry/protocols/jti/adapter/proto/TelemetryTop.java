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

public final class TelemetryTop {
  private TelemetryTop() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.telemetryOptions);
    registry.add(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.juniperNetworks);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TelemetryFieldOptionsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TelemetryFieldOptions)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bool is_key = 1;</code>
     * @return Whether the isKey field is set.
     */
    boolean hasIsKey();
    /**
     * <code>optional bool is_key = 1;</code>
     * @return The isKey.
     */
    boolean getIsKey();

    /**
     * <code>optional bool is_timestamp = 2;</code>
     * @return Whether the isTimestamp field is set.
     */
    boolean hasIsTimestamp();
    /**
     * <code>optional bool is_timestamp = 2;</code>
     * @return The isTimestamp.
     */
    boolean getIsTimestamp();

    /**
     * <code>optional bool is_counter = 3;</code>
     * @return Whether the isCounter field is set.
     */
    boolean hasIsCounter();
    /**
     * <code>optional bool is_counter = 3;</code>
     * @return The isCounter.
     */
    boolean getIsCounter();

    /**
     * <code>optional bool is_gauge = 4;</code>
     * @return Whether the isGauge field is set.
     */
    boolean hasIsGauge();
    /**
     * <code>optional bool is_gauge = 4;</code>
     * @return The isGauge.
     */
    boolean getIsGauge();
  }
  /**
   * Protobuf type {@code TelemetryFieldOptions}
   */
  public static final class TelemetryFieldOptions extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TelemetryFieldOptions)
      TelemetryFieldOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TelemetryFieldOptions.newBuilder() to construct.
    private TelemetryFieldOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TelemetryFieldOptions() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TelemetryFieldOptions();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_TelemetryFieldOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_TelemetryFieldOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions.Builder.class);
    }

    private int bitField0_;
    public static final int IS_KEY_FIELD_NUMBER = 1;
    private boolean isKey_ = false;
    /**
     * <code>optional bool is_key = 1;</code>
     * @return Whether the isKey field is set.
     */
    @java.lang.Override
    public boolean hasIsKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bool is_key = 1;</code>
     * @return The isKey.
     */
    @java.lang.Override
    public boolean getIsKey() {
      return isKey_;
    }

    public static final int IS_TIMESTAMP_FIELD_NUMBER = 2;
    private boolean isTimestamp_ = false;
    /**
     * <code>optional bool is_timestamp = 2;</code>
     * @return Whether the isTimestamp field is set.
     */
    @java.lang.Override
    public boolean hasIsTimestamp() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bool is_timestamp = 2;</code>
     * @return The isTimestamp.
     */
    @java.lang.Override
    public boolean getIsTimestamp() {
      return isTimestamp_;
    }

    public static final int IS_COUNTER_FIELD_NUMBER = 3;
    private boolean isCounter_ = false;
    /**
     * <code>optional bool is_counter = 3;</code>
     * @return Whether the isCounter field is set.
     */
    @java.lang.Override
    public boolean hasIsCounter() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional bool is_counter = 3;</code>
     * @return The isCounter.
     */
    @java.lang.Override
    public boolean getIsCounter() {
      return isCounter_;
    }

    public static final int IS_GAUGE_FIELD_NUMBER = 4;
    private boolean isGauge_ = false;
    /**
     * <code>optional bool is_gauge = 4;</code>
     * @return Whether the isGauge field is set.
     */
    @java.lang.Override
    public boolean hasIsGauge() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional bool is_gauge = 4;</code>
     * @return The isGauge.
     */
    @java.lang.Override
    public boolean getIsGauge() {
      return isGauge_;
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
        output.writeBool(1, isKey_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeBool(2, isTimestamp_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeBool(3, isCounter_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeBool(4, isGauge_);
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
          .computeBoolSize(1, isKey_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isTimestamp_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isCounter_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isGauge_);
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
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions) obj;

      if (hasIsKey() != other.hasIsKey()) return false;
      if (hasIsKey()) {
        if (getIsKey()
            != other.getIsKey()) return false;
      }
      if (hasIsTimestamp() != other.hasIsTimestamp()) return false;
      if (hasIsTimestamp()) {
        if (getIsTimestamp()
            != other.getIsTimestamp()) return false;
      }
      if (hasIsCounter() != other.hasIsCounter()) return false;
      if (hasIsCounter()) {
        if (getIsCounter()
            != other.getIsCounter()) return false;
      }
      if (hasIsGauge() != other.hasIsGauge()) return false;
      if (hasIsGauge()) {
        if (getIsGauge()
            != other.getIsGauge()) return false;
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
      if (hasIsKey()) {
        hash = (37 * hash) + IS_KEY_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getIsKey());
      }
      if (hasIsTimestamp()) {
        hash = (37 * hash) + IS_TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getIsTimestamp());
      }
      if (hasIsCounter()) {
        hash = (37 * hash) + IS_COUNTER_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getIsCounter());
      }
      if (hasIsGauge()) {
        hash = (37 * hash) + IS_GAUGE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getIsGauge());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions prototype) {
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
     * Protobuf type {@code TelemetryFieldOptions}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TelemetryFieldOptions)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptionsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_TelemetryFieldOptions_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_TelemetryFieldOptions_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions.newBuilder()
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
        isKey_ = false;
        isTimestamp_ = false;
        isCounter_ = false;
        isGauge_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_TelemetryFieldOptions_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isKey_ = isKey_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isTimestamp_ = isTimestamp_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isCounter_ = isCounter_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.isGauge_ = isGauge_;
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions.getDefaultInstance()) return this;
        if (other.hasIsKey()) {
          setIsKey(other.getIsKey());
        }
        if (other.hasIsTimestamp()) {
          setIsTimestamp(other.getIsTimestamp());
        }
        if (other.hasIsCounter()) {
          setIsCounter(other.getIsCounter());
        }
        if (other.hasIsGauge()) {
          setIsGauge(other.getIsGauge());
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
                isKey_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                isTimestamp_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                isCounter_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                isGauge_ = input.readBool();
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

      private boolean isKey_ ;
      /**
       * <code>optional bool is_key = 1;</code>
       * @return Whether the isKey field is set.
       */
      @java.lang.Override
      public boolean hasIsKey() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional bool is_key = 1;</code>
       * @return The isKey.
       */
      @java.lang.Override
      public boolean getIsKey() {
        return isKey_;
      }
      /**
       * <code>optional bool is_key = 1;</code>
       * @param value The isKey to set.
       * @return This builder for chaining.
       */
      public Builder setIsKey(boolean value) {

        isKey_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool is_key = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isKey_ = false;
        onChanged();
        return this;
      }

      private boolean isTimestamp_ ;
      /**
       * <code>optional bool is_timestamp = 2;</code>
       * @return Whether the isTimestamp field is set.
       */
      @java.lang.Override
      public boolean hasIsTimestamp() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional bool is_timestamp = 2;</code>
       * @return The isTimestamp.
       */
      @java.lang.Override
      public boolean getIsTimestamp() {
        return isTimestamp_;
      }
      /**
       * <code>optional bool is_timestamp = 2;</code>
       * @param value The isTimestamp to set.
       * @return This builder for chaining.
       */
      public Builder setIsTimestamp(boolean value) {

        isTimestamp_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool is_timestamp = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isTimestamp_ = false;
        onChanged();
        return this;
      }

      private boolean isCounter_ ;
      /**
       * <code>optional bool is_counter = 3;</code>
       * @return Whether the isCounter field is set.
       */
      @java.lang.Override
      public boolean hasIsCounter() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional bool is_counter = 3;</code>
       * @return The isCounter.
       */
      @java.lang.Override
      public boolean getIsCounter() {
        return isCounter_;
      }
      /**
       * <code>optional bool is_counter = 3;</code>
       * @param value The isCounter to set.
       * @return This builder for chaining.
       */
      public Builder setIsCounter(boolean value) {

        isCounter_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool is_counter = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsCounter() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isCounter_ = false;
        onChanged();
        return this;
      }

      private boolean isGauge_ ;
      /**
       * <code>optional bool is_gauge = 4;</code>
       * @return Whether the isGauge field is set.
       */
      @java.lang.Override
      public boolean hasIsGauge() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional bool is_gauge = 4;</code>
       * @return The isGauge.
       */
      @java.lang.Override
      public boolean getIsGauge() {
        return isGauge_;
      }
      /**
       * <code>optional bool is_gauge = 4;</code>
       * @param value The isGauge to set.
       * @return This builder for chaining.
       */
      public Builder setIsGauge(boolean value) {

        isGauge_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool is_gauge = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsGauge() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isGauge_ = false;
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


      // @@protoc_insertion_point(builder_scope:TelemetryFieldOptions)
    }

    // @@protoc_insertion_point(class_scope:TelemetryFieldOptions)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<TelemetryFieldOptions>
        PARSER = new com.google.protobuf.AbstractParser<TelemetryFieldOptions>() {
      @java.lang.Override
      public TelemetryFieldOptions parsePartialFrom(
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

    public static com.google.protobuf.Parser<TelemetryFieldOptions> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TelemetryFieldOptions> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TelemetryStreamOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TelemetryStream)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * router name or export IP address
     * </pre>
     *
     * <code>required string system_id = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the systemId field is set.
     */
    boolean hasSystemId();
    /**
     * <pre>
     * router name or export IP address
     * </pre>
     *
     * <code>required string system_id = 1 [(.telemetry_options) = { ... }</code>
     * @return The systemId.
     */
    java.lang.String getSystemId();
    /**
     * <pre>
     * router name or export IP address
     * </pre>
     *
     * <code>required string system_id = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for systemId.
     */
    com.google.protobuf.ByteString
        getSystemIdBytes();

    /**
     * <pre>
     * line card / RE (slot number)
     * </pre>
     *
     * <code>optional uint32 component_id = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the componentId field is set.
     */
    boolean hasComponentId();
    /**
     * <pre>
     * line card / RE (slot number)
     * </pre>
     *
     * <code>optional uint32 component_id = 2 [(.telemetry_options) = { ... }</code>
     * @return The componentId.
     */
    int getComponentId();

    /**
     * <pre>
     * PFE (if applicable)
     * </pre>
     *
     * <code>optional uint32 sub_component_id = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the subComponentId field is set.
     */
    boolean hasSubComponentId();
    /**
     * <pre>
     * PFE (if applicable)
     * </pre>
     *
     * <code>optional uint32 sub_component_id = 3 [(.telemetry_options) = { ... }</code>
     * @return The subComponentId.
     */
    int getSubComponentId();

    /**
     * <pre>
     * configured sensor name
     * </pre>
     *
     * <code>optional string sensor_name = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the sensorName field is set.
     */
    boolean hasSensorName();
    /**
     * <pre>
     * configured sensor name
     * </pre>
     *
     * <code>optional string sensor_name = 4 [(.telemetry_options) = { ... }</code>
     * @return The sensorName.
     */
    java.lang.String getSensorName();
    /**
     * <pre>
     * configured sensor name
     * </pre>
     *
     * <code>optional string sensor_name = 4 [(.telemetry_options) = { ... }</code>
     * @return The bytes for sensorName.
     */
    com.google.protobuf.ByteString
        getSensorNameBytes();

    /**
     * <pre>
     * sequence number, monotonically increasesing for each
     * system_id, component_id, sub_component_id + sensor_name.
     * </pre>
     *
     * <code>optional uint32 sequence_number = 5;</code>
     * @return Whether the sequenceNumber field is set.
     */
    boolean hasSequenceNumber();
    /**
     * <pre>
     * sequence number, monotonically increasesing for each
     * system_id, component_id, sub_component_id + sensor_name.
     * </pre>
     *
     * <code>optional uint32 sequence_number = 5;</code>
     * @return The sequenceNumber.
     */
    int getSequenceNumber();

    /**
     * <pre>
     * timestamp (milliseconds since 00:00:00 UTC 1/1/1970)
     * </pre>
     *
     * <code>optional uint64 timestamp = 6 [(.telemetry_options) = { ... }</code>
     * @return Whether the timestamp field is set.
     */
    boolean hasTimestamp();
    /**
     * <pre>
     * timestamp (milliseconds since 00:00:00 UTC 1/1/1970)
     * </pre>
     *
     * <code>optional uint64 timestamp = 6 [(.telemetry_options) = { ... }</code>
     * @return The timestamp.
     */
    long getTimestamp();

    /**
     * <pre>
     * major version
     * </pre>
     *
     * <code>optional uint32 version_major = 7;</code>
     * @return Whether the versionMajor field is set.
     */
    boolean hasVersionMajor();
    /**
     * <pre>
     * major version
     * </pre>
     *
     * <code>optional uint32 version_major = 7;</code>
     * @return The versionMajor.
     */
    int getVersionMajor();

    /**
     * <pre>
     * minor version
     * </pre>
     *
     * <code>optional uint32 version_minor = 8;</code>
     * @return Whether the versionMinor field is set.
     */
    boolean hasVersionMinor();
    /**
     * <pre>
     * minor version
     * </pre>
     *
     * <code>optional uint32 version_minor = 8;</code>
     * @return The versionMinor.
     */
    int getVersionMinor();

    /**
     * <code>optional .IETFSensors ietf = 100;</code>
     * @return Whether the ietf field is set.
     */
    boolean hasIetf();
    /**
     * <code>optional .IETFSensors ietf = 100;</code>
     * @return The ietf.
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors getIetf();
    /**
     * <code>optional .IETFSensors ietf = 100;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensorsOrBuilder getIetfOrBuilder();

    /**
     * <code>optional .EnterpriseSensors enterprise = 101;</code>
     * @return Whether the enterprise field is set.
     */
    boolean hasEnterprise();
    /**
     * <code>optional .EnterpriseSensors enterprise = 101;</code>
     * @return The enterprise.
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors getEnterprise();
    /**
     * <code>optional .EnterpriseSensors enterprise = 101;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensorsOrBuilder getEnterpriseOrBuilder();
  }
  /**
   * Protobuf type {@code TelemetryStream}
   */
  public static final class TelemetryStream extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TelemetryStream)
      TelemetryStreamOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TelemetryStream.newBuilder() to construct.
    private TelemetryStream(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TelemetryStream() {
      systemId_ = "";
      sensorName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TelemetryStream();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_TelemetryStream_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_TelemetryStream_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream.Builder.class);
    }

    private int bitField0_;
    public static final int SYSTEM_ID_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object systemId_ = "";
    /**
     * <pre>
     * router name or export IP address
     * </pre>
     *
     * <code>required string system_id = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the systemId field is set.
     */
    @java.lang.Override
    public boolean hasSystemId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * router name or export IP address
     * </pre>
     *
     * <code>required string system_id = 1 [(.telemetry_options) = { ... }</code>
     * @return The systemId.
     */
    @java.lang.Override
    public java.lang.String getSystemId() {
      java.lang.Object ref = systemId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          systemId_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * router name or export IP address
     * </pre>
     *
     * <code>required string system_id = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for systemId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSystemIdBytes() {
      java.lang.Object ref = systemId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        systemId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COMPONENT_ID_FIELD_NUMBER = 2;
    private int componentId_ = 0;
    /**
     * <pre>
     * line card / RE (slot number)
     * </pre>
     *
     * <code>optional uint32 component_id = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the componentId field is set.
     */
    @java.lang.Override
    public boolean hasComponentId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * line card / RE (slot number)
     * </pre>
     *
     * <code>optional uint32 component_id = 2 [(.telemetry_options) = { ... }</code>
     * @return The componentId.
     */
    @java.lang.Override
    public int getComponentId() {
      return componentId_;
    }

    public static final int SUB_COMPONENT_ID_FIELD_NUMBER = 3;
    private int subComponentId_ = 0;
    /**
     * <pre>
     * PFE (if applicable)
     * </pre>
     *
     * <code>optional uint32 sub_component_id = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the subComponentId field is set.
     */
    @java.lang.Override
    public boolean hasSubComponentId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * PFE (if applicable)
     * </pre>
     *
     * <code>optional uint32 sub_component_id = 3 [(.telemetry_options) = { ... }</code>
     * @return The subComponentId.
     */
    @java.lang.Override
    public int getSubComponentId() {
      return subComponentId_;
    }

    public static final int SENSOR_NAME_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object sensorName_ = "";
    /**
     * <pre>
     * configured sensor name
     * </pre>
     *
     * <code>optional string sensor_name = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the sensorName field is set.
     */
    @java.lang.Override
    public boolean hasSensorName() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * configured sensor name
     * </pre>
     *
     * <code>optional string sensor_name = 4 [(.telemetry_options) = { ... }</code>
     * @return The sensorName.
     */
    @java.lang.Override
    public java.lang.String getSensorName() {
      java.lang.Object ref = sensorName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sensorName_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * configured sensor name
     * </pre>
     *
     * <code>optional string sensor_name = 4 [(.telemetry_options) = { ... }</code>
     * @return The bytes for sensorName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSensorNameBytes() {
      java.lang.Object ref = sensorName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sensorName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 5;
    private int sequenceNumber_ = 0;
    /**
     * <pre>
     * sequence number, monotonically increasesing for each
     * system_id, component_id, sub_component_id + sensor_name.
     * </pre>
     *
     * <code>optional uint32 sequence_number = 5;</code>
     * @return Whether the sequenceNumber field is set.
     */
    @java.lang.Override
    public boolean hasSequenceNumber() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * sequence number, monotonically increasesing for each
     * system_id, component_id, sub_component_id + sensor_name.
     * </pre>
     *
     * <code>optional uint32 sequence_number = 5;</code>
     * @return The sequenceNumber.
     */
    @java.lang.Override
    public int getSequenceNumber() {
      return sequenceNumber_;
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 6;
    private long timestamp_ = 0L;
    /**
     * <pre>
     * timestamp (milliseconds since 00:00:00 UTC 1/1/1970)
     * </pre>
     *
     * <code>optional uint64 timestamp = 6 [(.telemetry_options) = { ... }</code>
     * @return Whether the timestamp field is set.
     */
    @java.lang.Override
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * timestamp (milliseconds since 00:00:00 UTC 1/1/1970)
     * </pre>
     *
     * <code>optional uint64 timestamp = 6 [(.telemetry_options) = { ... }</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int VERSION_MAJOR_FIELD_NUMBER = 7;
    private int versionMajor_ = 0;
    /**
     * <pre>
     * major version
     * </pre>
     *
     * <code>optional uint32 version_major = 7;</code>
     * @return Whether the versionMajor field is set.
     */
    @java.lang.Override
    public boolean hasVersionMajor() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <pre>
     * major version
     * </pre>
     *
     * <code>optional uint32 version_major = 7;</code>
     * @return The versionMajor.
     */
    @java.lang.Override
    public int getVersionMajor() {
      return versionMajor_;
    }

    public static final int VERSION_MINOR_FIELD_NUMBER = 8;
    private int versionMinor_ = 0;
    /**
     * <pre>
     * minor version
     * </pre>
     *
     * <code>optional uint32 version_minor = 8;</code>
     * @return Whether the versionMinor field is set.
     */
    @java.lang.Override
    public boolean hasVersionMinor() {
      return ((bitField0_ & 0x00000080) != 0);
    }
    /**
     * <pre>
     * minor version
     * </pre>
     *
     * <code>optional uint32 version_minor = 8;</code>
     * @return The versionMinor.
     */
    @java.lang.Override
    public int getVersionMinor() {
      return versionMinor_;
    }

    public static final int IETF_FIELD_NUMBER = 100;
    private org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors ietf_;
    /**
     * <code>optional .IETFSensors ietf = 100;</code>
     * @return Whether the ietf field is set.
     */
    @java.lang.Override
    public boolean hasIetf() {
      return ((bitField0_ & 0x00000100) != 0);
    }
    /**
     * <code>optional .IETFSensors ietf = 100;</code>
     * @return The ietf.
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors getIetf() {
      return ietf_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors.getDefaultInstance() : ietf_;
    }
    /**
     * <code>optional .IETFSensors ietf = 100;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensorsOrBuilder getIetfOrBuilder() {
      return ietf_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors.getDefaultInstance() : ietf_;
    }

    public static final int ENTERPRISE_FIELD_NUMBER = 101;
    private org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors enterprise_;
    /**
     * <code>optional .EnterpriseSensors enterprise = 101;</code>
     * @return Whether the enterprise field is set.
     */
    @java.lang.Override
    public boolean hasEnterprise() {
      return ((bitField0_ & 0x00000200) != 0);
    }
    /**
     * <code>optional .EnterpriseSensors enterprise = 101;</code>
     * @return The enterprise.
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors getEnterprise() {
      return enterprise_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors.getDefaultInstance() : enterprise_;
    }
    /**
     * <code>optional .EnterpriseSensors enterprise = 101;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensorsOrBuilder getEnterpriseOrBuilder() {
      return enterprise_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors.getDefaultInstance() : enterprise_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSystemId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasIetf()) {
        if (!getIetf().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasEnterprise()) {
        if (!getEnterprise().isInitialized()) {
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, systemId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt32(2, componentId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt32(3, subComponentId_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, sensorName_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeUInt32(5, sequenceNumber_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeUInt64(6, timestamp_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeUInt32(7, versionMajor_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        output.writeUInt32(8, versionMinor_);
      }
      if (((bitField0_ & 0x00000100) != 0)) {
        output.writeMessage(100, getIetf());
      }
      if (((bitField0_ & 0x00000200) != 0)) {
        output.writeMessage(101, getEnterprise());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, systemId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, componentId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, subComponentId_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, sensorName_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, sequenceNumber_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, timestamp_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, versionMajor_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, versionMinor_);
      }
      if (((bitField0_ & 0x00000100) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(100, getIetf());
      }
      if (((bitField0_ & 0x00000200) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(101, getEnterprise());
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
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream) obj;

      if (hasSystemId() != other.hasSystemId()) return false;
      if (hasSystemId()) {
        if (!getSystemId()
            .equals(other.getSystemId())) return false;
      }
      if (hasComponentId() != other.hasComponentId()) return false;
      if (hasComponentId()) {
        if (getComponentId()
            != other.getComponentId()) return false;
      }
      if (hasSubComponentId() != other.hasSubComponentId()) return false;
      if (hasSubComponentId()) {
        if (getSubComponentId()
            != other.getSubComponentId()) return false;
      }
      if (hasSensorName() != other.hasSensorName()) return false;
      if (hasSensorName()) {
        if (!getSensorName()
            .equals(other.getSensorName())) return false;
      }
      if (hasSequenceNumber() != other.hasSequenceNumber()) return false;
      if (hasSequenceNumber()) {
        if (getSequenceNumber()
            != other.getSequenceNumber()) return false;
      }
      if (hasTimestamp() != other.hasTimestamp()) return false;
      if (hasTimestamp()) {
        if (getTimestamp()
            != other.getTimestamp()) return false;
      }
      if (hasVersionMajor() != other.hasVersionMajor()) return false;
      if (hasVersionMajor()) {
        if (getVersionMajor()
            != other.getVersionMajor()) return false;
      }
      if (hasVersionMinor() != other.hasVersionMinor()) return false;
      if (hasVersionMinor()) {
        if (getVersionMinor()
            != other.getVersionMinor()) return false;
      }
      if (hasIetf() != other.hasIetf()) return false;
      if (hasIetf()) {
        if (!getIetf()
            .equals(other.getIetf())) return false;
      }
      if (hasEnterprise() != other.hasEnterprise()) return false;
      if (hasEnterprise()) {
        if (!getEnterprise()
            .equals(other.getEnterprise())) return false;
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
      if (hasSystemId()) {
        hash = (37 * hash) + SYSTEM_ID_FIELD_NUMBER;
        hash = (53 * hash) + getSystemId().hashCode();
      }
      if (hasComponentId()) {
        hash = (37 * hash) + COMPONENT_ID_FIELD_NUMBER;
        hash = (53 * hash) + getComponentId();
      }
      if (hasSubComponentId()) {
        hash = (37 * hash) + SUB_COMPONENT_ID_FIELD_NUMBER;
        hash = (53 * hash) + getSubComponentId();
      }
      if (hasSensorName()) {
        hash = (37 * hash) + SENSOR_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getSensorName().hashCode();
      }
      if (hasSequenceNumber()) {
        hash = (37 * hash) + SEQUENCE_NUMBER_FIELD_NUMBER;
        hash = (53 * hash) + getSequenceNumber();
      }
      if (hasTimestamp()) {
        hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getTimestamp());
      }
      if (hasVersionMajor()) {
        hash = (37 * hash) + VERSION_MAJOR_FIELD_NUMBER;
        hash = (53 * hash) + getVersionMajor();
      }
      if (hasVersionMinor()) {
        hash = (37 * hash) + VERSION_MINOR_FIELD_NUMBER;
        hash = (53 * hash) + getVersionMinor();
      }
      if (hasIetf()) {
        hash = (37 * hash) + IETF_FIELD_NUMBER;
        hash = (53 * hash) + getIetf().hashCode();
      }
      if (hasEnterprise()) {
        hash = (37 * hash) + ENTERPRISE_FIELD_NUMBER;
        hash = (53 * hash) + getEnterprise().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream prototype) {
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
     * Protobuf type {@code TelemetryStream}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TelemetryStream)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStreamOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_TelemetryStream_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_TelemetryStream_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream.newBuilder()
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
          getIetfFieldBuilder();
          getEnterpriseFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        systemId_ = "";
        componentId_ = 0;
        subComponentId_ = 0;
        sensorName_ = "";
        sequenceNumber_ = 0;
        timestamp_ = 0L;
        versionMajor_ = 0;
        versionMinor_ = 0;
        ietf_ = null;
        if (ietfBuilder_ != null) {
          ietfBuilder_.dispose();
          ietfBuilder_ = null;
        }
        enterprise_ = null;
        if (enterpriseBuilder_ != null) {
          enterpriseBuilder_.dispose();
          enterpriseBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_TelemetryStream_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.systemId_ = systemId_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.componentId_ = componentId_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.subComponentId_ = subComponentId_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.sensorName_ = sensorName_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.sequenceNumber_ = sequenceNumber_;
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.timestamp_ = timestamp_;
          to_bitField0_ |= 0x00000020;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.versionMajor_ = versionMajor_;
          to_bitField0_ |= 0x00000040;
        }
        if (((from_bitField0_ & 0x00000080) != 0)) {
          result.versionMinor_ = versionMinor_;
          to_bitField0_ |= 0x00000080;
        }
        if (((from_bitField0_ & 0x00000100) != 0)) {
          result.ietf_ = ietfBuilder_ == null
              ? ietf_
              : ietfBuilder_.build();
          to_bitField0_ |= 0x00000100;
        }
        if (((from_bitField0_ & 0x00000200) != 0)) {
          result.enterprise_ = enterpriseBuilder_ == null
              ? enterprise_
              : enterpriseBuilder_.build();
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream.getDefaultInstance()) return this;
        if (other.hasSystemId()) {
          systemId_ = other.systemId_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasComponentId()) {
          setComponentId(other.getComponentId());
        }
        if (other.hasSubComponentId()) {
          setSubComponentId(other.getSubComponentId());
        }
        if (other.hasSensorName()) {
          sensorName_ = other.sensorName_;
          bitField0_ |= 0x00000008;
          onChanged();
        }
        if (other.hasSequenceNumber()) {
          setSequenceNumber(other.getSequenceNumber());
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        if (other.hasVersionMajor()) {
          setVersionMajor(other.getVersionMajor());
        }
        if (other.hasVersionMinor()) {
          setVersionMinor(other.getVersionMinor());
        }
        if (other.hasIetf()) {
          mergeIetf(other.getIetf());
        }
        if (other.hasEnterprise()) {
          mergeEnterprise(other.getEnterprise());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasSystemId()) {
          return false;
        }
        if (hasIetf()) {
          if (!getIetf().isInitialized()) {
            return false;
          }
        }
        if (hasEnterprise()) {
          if (!getEnterprise().isInitialized()) {
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
                systemId_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                componentId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                subComponentId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 34: {
                sensorName_ = input.readBytes();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              case 40: {
                sequenceNumber_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              case 48: {
                timestamp_ = input.readUInt64();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
              case 56: {
                versionMajor_ = input.readUInt32();
                bitField0_ |= 0x00000040;
                break;
              } // case 56
              case 64: {
                versionMinor_ = input.readUInt32();
                bitField0_ |= 0x00000080;
                break;
              } // case 64
              case 802: {
                input.readMessage(
                    getIetfFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000100;
                break;
              } // case 802
              case 810: {
                input.readMessage(
                    getEnterpriseFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000200;
                break;
              } // case 810
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

      private java.lang.Object systemId_ = "";
      /**
       * <pre>
       * router name or export IP address
       * </pre>
       *
       * <code>required string system_id = 1 [(.telemetry_options) = { ... }</code>
       * @return Whether the systemId field is set.
       */
      public boolean hasSystemId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * router name or export IP address
       * </pre>
       *
       * <code>required string system_id = 1 [(.telemetry_options) = { ... }</code>
       * @return The systemId.
       */
      public java.lang.String getSystemId() {
        java.lang.Object ref = systemId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            systemId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * router name or export IP address
       * </pre>
       *
       * <code>required string system_id = 1 [(.telemetry_options) = { ... }</code>
       * @return The bytes for systemId.
       */
      public com.google.protobuf.ByteString
          getSystemIdBytes() {
        java.lang.Object ref = systemId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          systemId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * router name or export IP address
       * </pre>
       *
       * <code>required string system_id = 1 [(.telemetry_options) = { ... }</code>
       * @param value The systemId to set.
       * @return This builder for chaining.
       */
      public Builder setSystemId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        systemId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * router name or export IP address
       * </pre>
       *
       * <code>required string system_id = 1 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearSystemId() {
        systemId_ = getDefaultInstance().getSystemId();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * router name or export IP address
       * </pre>
       *
       * <code>required string system_id = 1 [(.telemetry_options) = { ... }</code>
       * @param value The bytes for systemId to set.
       * @return This builder for chaining.
       */
      public Builder setSystemIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        systemId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private int componentId_ ;
      /**
       * <pre>
       * line card / RE (slot number)
       * </pre>
       *
       * <code>optional uint32 component_id = 2 [(.telemetry_options) = { ... }</code>
       * @return Whether the componentId field is set.
       */
      @java.lang.Override
      public boolean hasComponentId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * line card / RE (slot number)
       * </pre>
       *
       * <code>optional uint32 component_id = 2 [(.telemetry_options) = { ... }</code>
       * @return The componentId.
       */
      @java.lang.Override
      public int getComponentId() {
        return componentId_;
      }
      /**
       * <pre>
       * line card / RE (slot number)
       * </pre>
       *
       * <code>optional uint32 component_id = 2 [(.telemetry_options) = { ... }</code>
       * @param value The componentId to set.
       * @return This builder for chaining.
       */
      public Builder setComponentId(int value) {

        componentId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * line card / RE (slot number)
       * </pre>
       *
       * <code>optional uint32 component_id = 2 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearComponentId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        componentId_ = 0;
        onChanged();
        return this;
      }

      private int subComponentId_ ;
      /**
       * <pre>
       * PFE (if applicable)
       * </pre>
       *
       * <code>optional uint32 sub_component_id = 3 [(.telemetry_options) = { ... }</code>
       * @return Whether the subComponentId field is set.
       */
      @java.lang.Override
      public boolean hasSubComponentId() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * PFE (if applicable)
       * </pre>
       *
       * <code>optional uint32 sub_component_id = 3 [(.telemetry_options) = { ... }</code>
       * @return The subComponentId.
       */
      @java.lang.Override
      public int getSubComponentId() {
        return subComponentId_;
      }
      /**
       * <pre>
       * PFE (if applicable)
       * </pre>
       *
       * <code>optional uint32 sub_component_id = 3 [(.telemetry_options) = { ... }</code>
       * @param value The subComponentId to set.
       * @return This builder for chaining.
       */
      public Builder setSubComponentId(int value) {

        subComponentId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * PFE (if applicable)
       * </pre>
       *
       * <code>optional uint32 sub_component_id = 3 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearSubComponentId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        subComponentId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object sensorName_ = "";
      /**
       * <pre>
       * configured sensor name
       * </pre>
       *
       * <code>optional string sensor_name = 4 [(.telemetry_options) = { ... }</code>
       * @return Whether the sensorName field is set.
       */
      public boolean hasSensorName() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * configured sensor name
       * </pre>
       *
       * <code>optional string sensor_name = 4 [(.telemetry_options) = { ... }</code>
       * @return The sensorName.
       */
      public java.lang.String getSensorName() {
        java.lang.Object ref = sensorName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            sensorName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * configured sensor name
       * </pre>
       *
       * <code>optional string sensor_name = 4 [(.telemetry_options) = { ... }</code>
       * @return The bytes for sensorName.
       */
      public com.google.protobuf.ByteString
          getSensorNameBytes() {
        java.lang.Object ref = sensorName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sensorName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * configured sensor name
       * </pre>
       *
       * <code>optional string sensor_name = 4 [(.telemetry_options) = { ... }</code>
       * @param value The sensorName to set.
       * @return This builder for chaining.
       */
      public Builder setSensorName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        sensorName_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * configured sensor name
       * </pre>
       *
       * <code>optional string sensor_name = 4 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearSensorName() {
        sensorName_ = getDefaultInstance().getSensorName();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * configured sensor name
       * </pre>
       *
       * <code>optional string sensor_name = 4 [(.telemetry_options) = { ... }</code>
       * @param value The bytes for sensorName to set.
       * @return This builder for chaining.
       */
      public Builder setSensorNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        sensorName_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }

      private int sequenceNumber_ ;
      /**
       * <pre>
       * sequence number, monotonically increasesing for each
       * system_id, component_id, sub_component_id + sensor_name.
       * </pre>
       *
       * <code>optional uint32 sequence_number = 5;</code>
       * @return Whether the sequenceNumber field is set.
       */
      @java.lang.Override
      public boolean hasSequenceNumber() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       * sequence number, monotonically increasesing for each
       * system_id, component_id, sub_component_id + sensor_name.
       * </pre>
       *
       * <code>optional uint32 sequence_number = 5;</code>
       * @return The sequenceNumber.
       */
      @java.lang.Override
      public int getSequenceNumber() {
        return sequenceNumber_;
      }
      /**
       * <pre>
       * sequence number, monotonically increasesing for each
       * system_id, component_id, sub_component_id + sensor_name.
       * </pre>
       *
       * <code>optional uint32 sequence_number = 5;</code>
       * @param value The sequenceNumber to set.
       * @return This builder for chaining.
       */
      public Builder setSequenceNumber(int value) {

        sequenceNumber_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * sequence number, monotonically increasesing for each
       * system_id, component_id, sub_component_id + sensor_name.
       * </pre>
       *
       * <code>optional uint32 sequence_number = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearSequenceNumber() {
        bitField0_ = (bitField0_ & ~0x00000010);
        sequenceNumber_ = 0;
        onChanged();
        return this;
      }

      private long timestamp_ ;
      /**
       * <pre>
       * timestamp (milliseconds since 00:00:00 UTC 1/1/1970)
       * </pre>
       *
       * <code>optional uint64 timestamp = 6 [(.telemetry_options) = { ... }</code>
       * @return Whether the timestamp field is set.
       */
      @java.lang.Override
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <pre>
       * timestamp (milliseconds since 00:00:00 UTC 1/1/1970)
       * </pre>
       *
       * <code>optional uint64 timestamp = 6 [(.telemetry_options) = { ... }</code>
       * @return The timestamp.
       */
      @java.lang.Override
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <pre>
       * timestamp (milliseconds since 00:00:00 UTC 1/1/1970)
       * </pre>
       *
       * <code>optional uint64 timestamp = 6 [(.telemetry_options) = { ... }</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(long value) {

        timestamp_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * timestamp (milliseconds since 00:00:00 UTC 1/1/1970)
       * </pre>
       *
       * <code>optional uint64 timestamp = 6 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000020);
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private int versionMajor_ ;
      /**
       * <pre>
       * major version
       * </pre>
       *
       * <code>optional uint32 version_major = 7;</code>
       * @return Whether the versionMajor field is set.
       */
      @java.lang.Override
      public boolean hasVersionMajor() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <pre>
       * major version
       * </pre>
       *
       * <code>optional uint32 version_major = 7;</code>
       * @return The versionMajor.
       */
      @java.lang.Override
      public int getVersionMajor() {
        return versionMajor_;
      }
      /**
       * <pre>
       * major version
       * </pre>
       *
       * <code>optional uint32 version_major = 7;</code>
       * @param value The versionMajor to set.
       * @return This builder for chaining.
       */
      public Builder setVersionMajor(int value) {

        versionMajor_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * major version
       * </pre>
       *
       * <code>optional uint32 version_major = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearVersionMajor() {
        bitField0_ = (bitField0_ & ~0x00000040);
        versionMajor_ = 0;
        onChanged();
        return this;
      }

      private int versionMinor_ ;
      /**
       * <pre>
       * minor version
       * </pre>
       *
       * <code>optional uint32 version_minor = 8;</code>
       * @return Whether the versionMinor field is set.
       */
      @java.lang.Override
      public boolean hasVersionMinor() {
        return ((bitField0_ & 0x00000080) != 0);
      }
      /**
       * <pre>
       * minor version
       * </pre>
       *
       * <code>optional uint32 version_minor = 8;</code>
       * @return The versionMinor.
       */
      @java.lang.Override
      public int getVersionMinor() {
        return versionMinor_;
      }
      /**
       * <pre>
       * minor version
       * </pre>
       *
       * <code>optional uint32 version_minor = 8;</code>
       * @param value The versionMinor to set.
       * @return This builder for chaining.
       */
      public Builder setVersionMinor(int value) {

        versionMinor_ = value;
        bitField0_ |= 0x00000080;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * minor version
       * </pre>
       *
       * <code>optional uint32 version_minor = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearVersionMinor() {
        bitField0_ = (bitField0_ & ~0x00000080);
        versionMinor_ = 0;
        onChanged();
        return this;
      }

      private org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors ietf_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensorsOrBuilder> ietfBuilder_;
      /**
       * <code>optional .IETFSensors ietf = 100;</code>
       * @return Whether the ietf field is set.
       */
      public boolean hasIetf() {
        return ((bitField0_ & 0x00000100) != 0);
      }
      /**
       * <code>optional .IETFSensors ietf = 100;</code>
       * @return The ietf.
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors getIetf() {
        if (ietfBuilder_ == null) {
          return ietf_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors.getDefaultInstance() : ietf_;
        } else {
          return ietfBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .IETFSensors ietf = 100;</code>
       */
      public Builder setIetf(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors value) {
        if (ietfBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ietf_ = value;
        } else {
          ietfBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000100;
        onChanged();
        return this;
      }
      /**
       * <code>optional .IETFSensors ietf = 100;</code>
       */
      public Builder setIetf(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors.Builder builderForValue) {
        if (ietfBuilder_ == null) {
          ietf_ = builderForValue.build();
        } else {
          ietfBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000100;
        onChanged();
        return this;
      }
      /**
       * <code>optional .IETFSensors ietf = 100;</code>
       */
      public Builder mergeIetf(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors value) {
        if (ietfBuilder_ == null) {
          if (((bitField0_ & 0x00000100) != 0) &&
            ietf_ != null &&
            ietf_ != org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors.getDefaultInstance()) {
            getIetfBuilder().mergeFrom(value);
          } else {
            ietf_ = value;
          }
        } else {
          ietfBuilder_.mergeFrom(value);
        }
        if (ietf_ != null) {
          bitField0_ |= 0x00000100;
          onChanged();
        }
        return this;
      }
      /**
       * <code>optional .IETFSensors ietf = 100;</code>
       */
      public Builder clearIetf() {
        bitField0_ = (bitField0_ & ~0x00000100);
        ietf_ = null;
        if (ietfBuilder_ != null) {
          ietfBuilder_.dispose();
          ietfBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>optional .IETFSensors ietf = 100;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors.Builder getIetfBuilder() {
        bitField0_ |= 0x00000100;
        onChanged();
        return getIetfFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .IETFSensors ietf = 100;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensorsOrBuilder getIetfOrBuilder() {
        if (ietfBuilder_ != null) {
          return ietfBuilder_.getMessageOrBuilder();
        } else {
          return ietf_ == null ?
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors.getDefaultInstance() : ietf_;
        }
      }
      /**
       * <code>optional .IETFSensors ietf = 100;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensorsOrBuilder> 
          getIetfFieldBuilder() {
        if (ietfBuilder_ == null) {
          ietfBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensorsOrBuilder>(
                  getIetf(),
                  getParentForChildren(),
                  isClean());
          ietf_ = null;
        }
        return ietfBuilder_;
      }

      private org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors enterprise_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensorsOrBuilder> enterpriseBuilder_;
      /**
       * <code>optional .EnterpriseSensors enterprise = 101;</code>
       * @return Whether the enterprise field is set.
       */
      public boolean hasEnterprise() {
        return ((bitField0_ & 0x00000200) != 0);
      }
      /**
       * <code>optional .EnterpriseSensors enterprise = 101;</code>
       * @return The enterprise.
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors getEnterprise() {
        if (enterpriseBuilder_ == null) {
          return enterprise_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors.getDefaultInstance() : enterprise_;
        } else {
          return enterpriseBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .EnterpriseSensors enterprise = 101;</code>
       */
      public Builder setEnterprise(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors value) {
        if (enterpriseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          enterprise_ = value;
        } else {
          enterpriseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000200;
        onChanged();
        return this;
      }
      /**
       * <code>optional .EnterpriseSensors enterprise = 101;</code>
       */
      public Builder setEnterprise(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors.Builder builderForValue) {
        if (enterpriseBuilder_ == null) {
          enterprise_ = builderForValue.build();
        } else {
          enterpriseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000200;
        onChanged();
        return this;
      }
      /**
       * <code>optional .EnterpriseSensors enterprise = 101;</code>
       */
      public Builder mergeEnterprise(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors value) {
        if (enterpriseBuilder_ == null) {
          if (((bitField0_ & 0x00000200) != 0) &&
            enterprise_ != null &&
            enterprise_ != org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors.getDefaultInstance()) {
            getEnterpriseBuilder().mergeFrom(value);
          } else {
            enterprise_ = value;
          }
        } else {
          enterpriseBuilder_.mergeFrom(value);
        }
        if (enterprise_ != null) {
          bitField0_ |= 0x00000200;
          onChanged();
        }
        return this;
      }
      /**
       * <code>optional .EnterpriseSensors enterprise = 101;</code>
       */
      public Builder clearEnterprise() {
        bitField0_ = (bitField0_ & ~0x00000200);
        enterprise_ = null;
        if (enterpriseBuilder_ != null) {
          enterpriseBuilder_.dispose();
          enterpriseBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>optional .EnterpriseSensors enterprise = 101;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors.Builder getEnterpriseBuilder() {
        bitField0_ |= 0x00000200;
        onChanged();
        return getEnterpriseFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .EnterpriseSensors enterprise = 101;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensorsOrBuilder getEnterpriseOrBuilder() {
        if (enterpriseBuilder_ != null) {
          return enterpriseBuilder_.getMessageOrBuilder();
        } else {
          return enterprise_ == null ?
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors.getDefaultInstance() : enterprise_;
        }
      }
      /**
       * <code>optional .EnterpriseSensors enterprise = 101;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensorsOrBuilder> 
          getEnterpriseFieldBuilder() {
        if (enterpriseBuilder_ == null) {
          enterpriseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensorsOrBuilder>(
                  getEnterprise(),
                  getParentForChildren(),
                  isClean());
          enterprise_ = null;
        }
        return enterpriseBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TelemetryStream)
    }

    // @@protoc_insertion_point(class_scope:TelemetryStream)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<TelemetryStream>
        PARSER = new com.google.protobuf.AbstractParser<TelemetryStream>() {
      @java.lang.Override
      public TelemetryStream parsePartialFrom(
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

    public static com.google.protobuf.Parser<TelemetryStream> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TelemetryStream> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryStream getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface IETFSensorsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IETFSensors)
      com.google.protobuf.GeneratedMessageV3.
          ExtendableMessageOrBuilder<IETFSensors> {
  }
  /**
   * Protobuf type {@code IETFSensors}
   */
  public static final class IETFSensors extends
      com.google.protobuf.GeneratedMessageV3.ExtendableMessage<
        IETFSensors> implements
      // @@protoc_insertion_point(message_implements:IETFSensors)
      IETFSensorsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IETFSensors.newBuilder() to construct.
    private IETFSensors(com.google.protobuf.GeneratedMessageV3.ExtendableBuilder<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors, ?> builder) {
      super(builder);
    }
    private IETFSensors() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IETFSensors();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_IETFSensors_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_IETFSensors_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      com.google.protobuf.GeneratedMessageV3
        .ExtendableMessage<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors>.ExtensionWriter
          extensionWriter = newExtensionWriter();
      extensionWriter.writeUntil(536870912, output);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors) obj;

      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      if (!getExtensionFields().equals(other.getExtensionFields()))
        return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = hashFields(hash, getExtensionFields());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors prototype) {
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
     * Protobuf type {@code IETFSensors}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.ExtendableBuilder<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors, Builder> implements
        // @@protoc_insertion_point(builder_implements:IETFSensors)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensorsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_IETFSensors_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_IETFSensors_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_IETFSensors_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors(this);
        onBuilt();
        return result;
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
      public <Type> Builder setExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors, Type> extension,
          Type value) {
        return super.setExtension(extension, value);
      }
      @java.lang.Override
      public <Type> Builder setExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors, java.util.List<Type>> extension,
          int index, Type value) {
        return super.setExtension(extension, index, value);
      }
      @java.lang.Override
      public <Type> Builder addExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors, java.util.List<Type>> extension,
          Type value) {
        return super.addExtension(extension, value);
      }
      @java.lang.Override
      public <T> Builder clearExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors, T> extension) {
        return super.clearExtension(extension);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors.getDefaultInstance()) return this;
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!extensionsAreInitialized()) {
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


      // @@protoc_insertion_point(builder_scope:IETFSensors)
    }

    // @@protoc_insertion_point(class_scope:IETFSensors)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<IETFSensors>
        PARSER = new com.google.protobuf.AbstractParser<IETFSensors>() {
      @java.lang.Override
      public IETFSensors parsePartialFrom(
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

    public static com.google.protobuf.Parser<IETFSensors> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IETFSensors> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.IETFSensors getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface EnterpriseSensorsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EnterpriseSensors)
      com.google.protobuf.GeneratedMessageV3.
          ExtendableMessageOrBuilder<EnterpriseSensors> {
  }
  /**
   * Protobuf type {@code EnterpriseSensors}
   */
  public static final class EnterpriseSensors extends
      com.google.protobuf.GeneratedMessageV3.ExtendableMessage<
        EnterpriseSensors> implements
      // @@protoc_insertion_point(message_implements:EnterpriseSensors)
      EnterpriseSensorsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnterpriseSensors.newBuilder() to construct.
    private EnterpriseSensors(com.google.protobuf.GeneratedMessageV3.ExtendableBuilder<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors, ?> builder) {
      super(builder);
    }
    private EnterpriseSensors() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnterpriseSensors();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_EnterpriseSensors_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_EnterpriseSensors_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      com.google.protobuf.GeneratedMessageV3
        .ExtendableMessage<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors>.ExtensionWriter
          extensionWriter = newExtensionWriter();
      extensionWriter.writeUntil(536870912, output);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors) obj;

      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      if (!getExtensionFields().equals(other.getExtensionFields()))
        return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = hashFields(hash, getExtensionFields());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors prototype) {
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
     * Protobuf type {@code EnterpriseSensors}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.ExtendableBuilder<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors, Builder> implements
        // @@protoc_insertion_point(builder_implements:EnterpriseSensors)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensorsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_EnterpriseSensors_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_EnterpriseSensors_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_EnterpriseSensors_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors(this);
        onBuilt();
        return result;
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
      public <Type> Builder setExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors, Type> extension,
          Type value) {
        return super.setExtension(extension, value);
      }
      @java.lang.Override
      public <Type> Builder setExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors, java.util.List<Type>> extension,
          int index, Type value) {
        return super.setExtension(extension, index, value);
      }
      @java.lang.Override
      public <Type> Builder addExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors, java.util.List<Type>> extension,
          Type value) {
        return super.addExtension(extension, value);
      }
      @java.lang.Override
      public <T> Builder clearExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors, T> extension) {
        return super.clearExtension(extension);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors.getDefaultInstance()) return this;
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!extensionsAreInitialized()) {
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


      // @@protoc_insertion_point(builder_scope:EnterpriseSensors)
    }

    // @@protoc_insertion_point(class_scope:EnterpriseSensors)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<EnterpriseSensors>
        PARSER = new com.google.protobuf.AbstractParser<EnterpriseSensors>() {
      @java.lang.Override
      public EnterpriseSensors parsePartialFrom(
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

    public static com.google.protobuf.Parser<EnterpriseSensors> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnterpriseSensors> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface JuniperNetworksSensorsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JuniperNetworksSensors)
      com.google.protobuf.GeneratedMessageV3.
          ExtendableMessageOrBuilder<JuniperNetworksSensors> {
  }
  /**
   * Protobuf type {@code JuniperNetworksSensors}
   */
  public static final class JuniperNetworksSensors extends
      com.google.protobuf.GeneratedMessageV3.ExtendableMessage<
        JuniperNetworksSensors> implements
      // @@protoc_insertion_point(message_implements:JuniperNetworksSensors)
      JuniperNetworksSensorsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JuniperNetworksSensors.newBuilder() to construct.
    private JuniperNetworksSensors(com.google.protobuf.GeneratedMessageV3.ExtendableBuilder<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors, ?> builder) {
      super(builder);
    }
    private JuniperNetworksSensors() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JuniperNetworksSensors();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_JuniperNetworksSensors_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_JuniperNetworksSensors_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      com.google.protobuf.GeneratedMessageV3
        .ExtendableMessage<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors>.ExtensionWriter
          extensionWriter = newExtensionWriter();
      extensionWriter.writeUntil(536870912, output);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors) obj;

      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      if (!getExtensionFields().equals(other.getExtensionFields()))
        return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = hashFields(hash, getExtensionFields());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors prototype) {
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
     * Protobuf type {@code JuniperNetworksSensors}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.ExtendableBuilder<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors, Builder> implements
        // @@protoc_insertion_point(builder_implements:JuniperNetworksSensors)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensorsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_JuniperNetworksSensors_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_JuniperNetworksSensors_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.internal_static_JuniperNetworksSensors_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors(this);
        onBuilt();
        return result;
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
      public <Type> Builder setExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors, Type> extension,
          Type value) {
        return super.setExtension(extension, value);
      }
      @java.lang.Override
      public <Type> Builder setExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors, java.util.List<Type>> extension,
          int index, Type value) {
        return super.setExtension(extension, index, value);
      }
      @java.lang.Override
      public <Type> Builder addExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors, java.util.List<Type>> extension,
          Type value) {
        return super.addExtension(extension, value);
      }
      @java.lang.Override
      public <T> Builder clearExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors, T> extension) {
        return super.clearExtension(extension);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors.getDefaultInstance()) return this;
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!extensionsAreInitialized()) {
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


      // @@protoc_insertion_point(builder_scope:JuniperNetworksSensors)
    }

    // @@protoc_insertion_point(class_scope:JuniperNetworksSensors)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<JuniperNetworksSensors>
        PARSER = new com.google.protobuf.AbstractParser<JuniperNetworksSensors>() {
      @java.lang.Override
      public JuniperNetworksSensors parsePartialFrom(
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

    public static com.google.protobuf.Parser<JuniperNetworksSensors> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JuniperNetworksSensors> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int TELEMETRY_OPTIONS_FIELD_NUMBER = 1024;
  /**
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions> telemetryOptions = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions.class,
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.TelemetryFieldOptions.getDefaultInstance());
  public static final int JUNIPERNETWORKS_FIELD_NUMBER = 2636;
  /**
   * <pre>
   * re-use IANA assigned numbers
   * </pre>
   *
   * <code>extend .EnterpriseSensors { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.EnterpriseSensors,
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors> juniperNetworks = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors.class,
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors.getDefaultInstance());
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TelemetryFieldOptions_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TelemetryFieldOptions_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TelemetryStream_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TelemetryStream_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IETFSensors_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IETFSensors_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnterpriseSensors_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterpriseSensors_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JuniperNetworksSensors_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JuniperNetworksSensors_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023telemetry_top.proto\032 google/protobuf/d" +
      "escriptor.proto\"c\n\025TelemetryFieldOptions" +
      "\022\016\n\006is_key\030\001 \001(\010\022\024\n\014is_timestamp\030\002 \001(\010\022\022" +
      "\n\nis_counter\030\003 \001(\010\022\020\n\010is_gauge\030\004 \001(\010\"\252\002\n" +
      "\017TelemetryStream\022\030\n\tsystem_id\030\001 \002(\tB\005\202@\002" +
      "\010\001\022\033\n\014component_id\030\002 \001(\rB\005\202@\002\010\001\022\037\n\020sub_c" +
      "omponent_id\030\003 \001(\rB\005\202@\002\010\001\022\032\n\013sensor_name\030" +
      "\004 \001(\tB\005\202@\002\010\001\022\027\n\017sequence_number\030\005 \001(\r\022\030\n" +
      "\ttimestamp\030\006 \001(\004B\005\202@\002\020\001\022\025\n\rversion_major" +
      "\030\007 \001(\r\022\025\n\rversion_minor\030\010 \001(\r\022\032\n\004ietf\030d " +
      "\001(\0132\014.IETFSensors\022&\n\nenterprise\030e \001(\0132\022." +
      "EnterpriseSensors\"\027\n\013IETFSensors*\010\010\001\020\200\200\200" +
      "\200\002\"\035\n\021EnterpriseSensors*\010\010\001\020\200\200\200\200\002\"\"\n\026Jun" +
      "iperNetworksSensors*\010\010\001\020\200\200\200\200\002:Q\n\021telemet" +
      "ry_options\022\035.google.protobuf.FieldOption" +
      "s\030\200\010 \001(\0132\026.TelemetryFieldOptions:E\n\017juni" +
      "perNetworks\022\022.EnterpriseSensors\030\314\024 \001(\0132\027" +
      ".JuniperNetworksSensorsB:\n8org.opennms.n" +
      "etmgt.telemetry.protocols.jti.adapter.pr" +
      "oto"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_TelemetryFieldOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TelemetryFieldOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TelemetryFieldOptions_descriptor,
        new java.lang.String[] { "IsKey", "IsTimestamp", "IsCounter", "IsGauge", });
    internal_static_TelemetryStream_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_TelemetryStream_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TelemetryStream_descriptor,
        new java.lang.String[] { "SystemId", "ComponentId", "SubComponentId", "SensorName", "SequenceNumber", "Timestamp", "VersionMajor", "VersionMinor", "Ietf", "Enterprise", });
    internal_static_IETFSensors_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_IETFSensors_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IETFSensors_descriptor,
        new java.lang.String[] { });
    internal_static_EnterpriseSensors_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_EnterpriseSensors_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterpriseSensors_descriptor,
        new java.lang.String[] { });
    internal_static_JuniperNetworksSensors_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_JuniperNetworksSensors_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JuniperNetworksSensors_descriptor,
        new java.lang.String[] { });
    telemetryOptions.internalInit(descriptor.getExtensions().get(0));
    juniperNetworks.internalInit(descriptor.getExtensions().get(1));
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.telemetryOptions);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
