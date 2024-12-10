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
package org.opennms.features.kafka.consumer.events;

public final class EventsProto {
  private EventsProto() {}
  public static void registerAllExtensions(
          com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
          com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
            (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * The values differ from the standard codes in OpenNMS
   * since proto3 enforces us to start at 0
   * </pre>
   *
   * Protobuf enum {@code Severity}
   */
  public enum Severity
          implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INDETERMINATE = 0;</code>
     */
    INDETERMINATE(0),
    /**
     * <code>CLEARED = 1;</code>
     */
    CLEARED(1),
    /**
     * <code>NORMAL = 2;</code>
     */
    NORMAL(2),
    /**
     * <code>WARNING = 3;</code>
     */
    WARNING(3),
    /**
     * <code>MINOR = 4;</code>
     */
    MINOR(4),
    /**
     * <code>MAJOR = 5;</code>
     */
    MAJOR(5),
    /**
     * <code>CRITICAL = 6;</code>
     */
    CRITICAL(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>INDETERMINATE = 0;</code>
     */
    public static final int INDETERMINATE_VALUE = 0;
    /**
     * <code>CLEARED = 1;</code>
     */
    public static final int CLEARED_VALUE = 1;
    /**
     * <code>NORMAL = 2;</code>
     */
    public static final int NORMAL_VALUE = 2;
    /**
     * <code>WARNING = 3;</code>
     */
    public static final int WARNING_VALUE = 3;
    /**
     * <code>MINOR = 4;</code>
     */
    public static final int MINOR_VALUE = 4;
    /**
     * <code>MAJOR = 5;</code>
     */
    public static final int MAJOR_VALUE = 5;
    /**
     * <code>CRITICAL = 6;</code>
     */
    public static final int CRITICAL_VALUE = 6;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
                "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Severity valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Severity forNumber(int value) {
      switch (value) {
        case 0: return INDETERMINATE;
        case 1: return CLEARED;
        case 2: return NORMAL;
        case 3: return WARNING;
        case 4: return MINOR;
        case 5: return MAJOR;
        case 6: return CRITICAL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Severity>
    internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
            Severity> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Severity>() {
              public Severity findValueByNumber(int number) {
                return Severity.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
    getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
                "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
    getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
    getDescriptor() {
      return org.opennms.features.kafka.consumer.events.EventsProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Severity[] VALUES = values();

    public static Severity valueOf(
            com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
                "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Severity(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Severity)
  }

  public interface EventParameterOrBuilder extends
          // @@protoc_insertion_point(interface_extends:EventParameter)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
    getNameBytes();

    /**
     * <code>string value = 2;</code>
     * @return The value.
     */
    java.lang.String getValue();
    /**
     * <code>string value = 2;</code>
     * @return The bytes for value.
     */
    com.google.protobuf.ByteString
    getValueBytes();
  }
  /**
   * Protobuf type {@code EventParameter}
   */
  public static final class EventParameter extends
          com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:EventParameter)
          EventParameterOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use EventParameter.newBuilder() to construct.
    private EventParameter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EventParameter() {
      name_ = "";
      value_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
      return new EventParameter();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.opennms.features.kafka.consumer.events.EventsProto.internal_static_EventParameter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.opennms.features.kafka.consumer.events.EventsProto.internal_static_EventParameter_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.class, org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
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
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
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

    public static final int VALUE_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object value_ = "";
    /**
     * <code>string value = 2;</code>
     * @return The value.
     */
    @java.lang.Override
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      }
    }
    /**
     * <code>string value = 2;</code>
     * @return The bytes for value.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        value_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
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
      if (!(obj instanceof org.opennms.features.kafka.consumer.events.EventsProto.EventParameter)) {
        return super.equals(obj);
      }
      org.opennms.features.kafka.consumer.events.EventsProto.EventParameter other = (org.opennms.features.kafka.consumer.events.EventsProto.EventParameter) obj;

      if (!getName()
              .equals(other.getName())) return false;
      if (!getValue()
              .equals(other.getValue())) return false;
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
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.kafka.consumer.events.EventsProto.EventParameter parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.consumer.events.EventsProto.EventParameter parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.consumer.events.EventsProto.EventParameter parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.consumer.events.EventsProto.EventParameter parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.consumer.events.EventsProto.EventParameter parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.consumer.events.EventsProto.EventParameter parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.consumer.events.EventsProto.EventParameter parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.consumer.events.EventsProto.EventParameter parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.kafka.consumer.events.EventsProto.EventParameter parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.kafka.consumer.events.EventsProto.EventParameter parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.kafka.consumer.events.EventsProto.EventParameter parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.consumer.events.EventsProto.EventParameter parseFrom(
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
    public static Builder newBuilder(org.opennms.features.kafka.consumer.events.EventsProto.EventParameter prototype) {
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
     * Protobuf type {@code EventParameter}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:EventParameter)
            org.opennms.features.kafka.consumer.events.EventsProto.EventParameterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.opennms.features.kafka.consumer.events.EventsProto.internal_static_EventParameter_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.opennms.features.kafka.consumer.events.EventsProto.internal_static_EventParameter_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.class, org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.Builder.class);
      }

      // Construct using org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.newBuilder()
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
        value_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.opennms.features.kafka.consumer.events.EventsProto.internal_static_EventParameter_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.kafka.consumer.events.EventsProto.EventParameter getDefaultInstanceForType() {
        return org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.kafka.consumer.events.EventsProto.EventParameter build() {
        org.opennms.features.kafka.consumer.events.EventsProto.EventParameter result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.kafka.consumer.events.EventsProto.EventParameter buildPartial() {
        org.opennms.features.kafka.consumer.events.EventsProto.EventParameter result = new org.opennms.features.kafka.consumer.events.EventsProto.EventParameter(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.kafka.consumer.events.EventsProto.EventParameter result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.name_ = name_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.value_ = value_;
        }
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
        if (other instanceof org.opennms.features.kafka.consumer.events.EventsProto.EventParameter) {
          return mergeFrom((org.opennms.features.kafka.consumer.events.EventsProto.EventParameter)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.kafka.consumer.events.EventsProto.EventParameter other) {
        if (other == org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getValue().isEmpty()) {
          value_ = other.value_;
          bitField0_ |= 0x00000002;
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                value_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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
       * <code>string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
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
       * <code>string name = 1;</code>
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
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        name_ = getDefaultInstance().getName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object value_ = "";
      /**
       * <code>string value = 2;</code>
       * @return The value.
       */
      public java.lang.String getValue() {
        java.lang.Object ref = value_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          value_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string value = 2;</code>
       * @return The bytes for value.
       */
      public com.google.protobuf.ByteString
      getValueBytes() {
        java.lang.Object ref = value_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          value_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string value = 2;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        value_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string value = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        value_ = getDefaultInstance().getValue();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string value = 2;</code>
       * @param value The bytes for value to set.
       * @return This builder for chaining.
       */
      public Builder setValueBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        value_ = value;
        bitField0_ |= 0x00000002;
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


      // @@protoc_insertion_point(builder_scope:EventParameter)
    }

    // @@protoc_insertion_point(class_scope:EventParameter)
    private static final org.opennms.features.kafka.consumer.events.EventsProto.EventParameter DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.kafka.consumer.events.EventsProto.EventParameter();
    }

    public static org.opennms.features.kafka.consumer.events.EventsProto.EventParameter getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EventParameter>
            PARSER = new com.google.protobuf.AbstractParser<EventParameter>() {
      @java.lang.Override
      public EventParameter parsePartialFrom(
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

    public static com.google.protobuf.Parser<EventParameter> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EventParameter> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.kafka.consumer.events.EventsProto.EventParameter getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface EventOrBuilder extends
          // @@protoc_insertion_point(interface_extends:Event)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * required field
     * </pre>
     *
     * <code>string uei = 1;</code>
     * @return The uei.
     */
    java.lang.String getUei();
    /**
     * <pre>
     * required field
     * </pre>
     *
     * <code>string uei = 1;</code>
     * @return The bytes for uei.
     */
    com.google.protobuf.ByteString
    getUeiBytes();

    /**
     * <pre>
     * required field
     * </pre>
     *
     * <code>string source = 2;</code>
     * @return The source.
     */
    java.lang.String getSource();
    /**
     * <pre>
     * required field
     * </pre>
     *
     * <code>string source = 2;</code>
     * @return The bytes for source.
     */
    com.google.protobuf.ByteString
    getSourceBytes();

    /**
     * <pre>
     * required field
     * </pre>
     *
     * <code>.Severity severity = 3;</code>
     * @return The enum numeric value on the wire for severity.
     */
    int getSeverityValue();
    /**
     * <pre>
     * required field
     * </pre>
     *
     * <code>.Severity severity = 3;</code>
     * @return The severity.
     */
    org.opennms.features.kafka.consumer.events.EventsProto.Severity getSeverity();

    /**
     * <code>string host = 4;</code>
     * @return The host.
     */
    java.lang.String getHost();
    /**
     * <code>string host = 4;</code>
     * @return The bytes for host.
     */
    com.google.protobuf.ByteString
    getHostBytes();

    /**
     * <code>uint32 node_id = 5;</code>
     * @return The nodeId.
     */
    int getNodeId();

    /**
     * <code>string ip_address = 6;</code>
     * @return The ipAddress.
     */
    java.lang.String getIpAddress();
    /**
     * <code>string ip_address = 6;</code>
     * @return The bytes for ipAddress.
     */
    com.google.protobuf.ByteString
    getIpAddressBytes();

    /**
     * <code>string service_name = 7;</code>
     * @return The serviceName.
     */
    java.lang.String getServiceName();
    /**
     * <code>string service_name = 7;</code>
     * @return The bytes for serviceName.
     */
    com.google.protobuf.ByteString
    getServiceNameBytes();

    /**
     * <code>uint32 if_index = 8;</code>
     * @return The ifIndex.
     */
    int getIfIndex();

    /**
     * <code>string description = 9;</code>
     * @return The description.
     */
    java.lang.String getDescription();
    /**
     * <code>string description = 9;</code>
     * @return The bytes for description.
     */
    com.google.protobuf.ByteString
    getDescriptionBytes();

    /**
     * <code>string dist_poller = 10;</code>
     * @return The distPoller.
     */
    java.lang.String getDistPoller();
    /**
     * <code>string dist_poller = 10;</code>
     * @return The bytes for distPoller.
     */
    com.google.protobuf.ByteString
    getDistPollerBytes();

    /**
     * <code>string log_dest = 11;</code>
     * @return The logDest.
     */
    java.lang.String getLogDest();
    /**
     * <code>string log_dest = 11;</code>
     * @return The bytes for logDest.
     */
    com.google.protobuf.ByteString
    getLogDestBytes();

    /**
     * <code>string log_content = 12;</code>
     * @return The logContent.
     */
    java.lang.String getLogContent();
    /**
     * <code>string log_content = 12;</code>
     * @return The bytes for logContent.
     */
    com.google.protobuf.ByteString
    getLogContentBytes();

    /**
     * <code>repeated .EventParameter parameter = 13;</code>
     */
    java.util.List<org.opennms.features.kafka.consumer.events.EventsProto.EventParameter>
    getParameterList();
    /**
     * <code>repeated .EventParameter parameter = 13;</code>
     */
    org.opennms.features.kafka.consumer.events.EventsProto.EventParameter getParameter(int index);
    /**
     * <code>repeated .EventParameter parameter = 13;</code>
     */
    int getParameterCount();
    /**
     * <code>repeated .EventParameter parameter = 13;</code>
     */
    java.util.List<? extends org.opennms.features.kafka.consumer.events.EventsProto.EventParameterOrBuilder>
    getParameterOrBuilderList();
    /**
     * <code>repeated .EventParameter parameter = 13;</code>
     */
    org.opennms.features.kafka.consumer.events.EventsProto.EventParameterOrBuilder getParameterOrBuilder(
            int index);
  }
  /**
   * Protobuf type {@code Event}
   */
  public static final class Event extends
          com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:Event)
          EventOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use Event.newBuilder() to construct.
    private Event(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Event() {
      uei_ = "";
      source_ = "";
      severity_ = 0;
      host_ = "";
      ipAddress_ = "";
      serviceName_ = "";
      description_ = "";
      distPoller_ = "";
      logDest_ = "";
      logContent_ = "";
      parameter_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
      return new Event();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.opennms.features.kafka.consumer.events.EventsProto.internal_static_Event_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.opennms.features.kafka.consumer.events.EventsProto.internal_static_Event_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      org.opennms.features.kafka.consumer.events.EventsProto.Event.class, org.opennms.features.kafka.consumer.events.EventsProto.Event.Builder.class);
    }

    public static final int UEI_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object uei_ = "";
    /**
     * <pre>
     * required field
     * </pre>
     *
     * <code>string uei = 1;</code>
     * @return The uei.
     */
    @java.lang.Override
    public java.lang.String getUei() {
      java.lang.Object ref = uei_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uei_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * required field
     * </pre>
     *
     * <code>string uei = 1;</code>
     * @return The bytes for uei.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getUeiBytes() {
      java.lang.Object ref = uei_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        uei_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SOURCE_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object source_ = "";
    /**
     * <pre>
     * required field
     * </pre>
     *
     * <code>string source = 2;</code>
     * @return The source.
     */
    @java.lang.Override
    public java.lang.String getSource() {
      java.lang.Object ref = source_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        source_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * required field
     * </pre>
     *
     * <code>string source = 2;</code>
     * @return The bytes for source.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SEVERITY_FIELD_NUMBER = 3;
    private int severity_ = 0;
    /**
     * <pre>
     * required field
     * </pre>
     *
     * <code>.Severity severity = 3;</code>
     * @return The enum numeric value on the wire for severity.
     */
    @java.lang.Override public int getSeverityValue() {
      return severity_;
    }
    /**
     * <pre>
     * required field
     * </pre>
     *
     * <code>.Severity severity = 3;</code>
     * @return The severity.
     */
    @java.lang.Override public org.opennms.features.kafka.consumer.events.EventsProto.Severity getSeverity() {
      org.opennms.features.kafka.consumer.events.EventsProto.Severity result = org.opennms.features.kafka.consumer.events.EventsProto.Severity.forNumber(severity_);
      return result == null ? org.opennms.features.kafka.consumer.events.EventsProto.Severity.UNRECOGNIZED : result;
    }

    public static final int HOST_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object host_ = "";
    /**
     * <code>string host = 4;</code>
     * @return The host.
     */
    @java.lang.Override
    public java.lang.String getHost() {
      java.lang.Object ref = host_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        host_ = s;
        return s;
      }
    }
    /**
     * <code>string host = 4;</code>
     * @return The bytes for host.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getHostBytes() {
      java.lang.Object ref = host_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        host_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NODE_ID_FIELD_NUMBER = 5;
    private int nodeId_ = 0;
    /**
     * <code>uint32 node_id = 5;</code>
     * @return The nodeId.
     */
    @java.lang.Override
    public int getNodeId() {
      return nodeId_;
    }

    public static final int IP_ADDRESS_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private volatile java.lang.Object ipAddress_ = "";
    /**
     * <code>string ip_address = 6;</code>
     * @return The ipAddress.
     */
    @java.lang.Override
    public java.lang.String getIpAddress() {
      java.lang.Object ref = ipAddress_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipAddress_ = s;
        return s;
      }
    }
    /**
     * <code>string ip_address = 6;</code>
     * @return The bytes for ipAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getIpAddressBytes() {
      java.lang.Object ref = ipAddress_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        ipAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SERVICE_NAME_FIELD_NUMBER = 7;
    @SuppressWarnings("serial")
    private volatile java.lang.Object serviceName_ = "";
    /**
     * <code>string service_name = 7;</code>
     * @return The serviceName.
     */
    @java.lang.Override
    public java.lang.String getServiceName() {
      java.lang.Object ref = serviceName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceName_ = s;
        return s;
      }
    }
    /**
     * <code>string service_name = 7;</code>
     * @return The bytes for serviceName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getServiceNameBytes() {
      java.lang.Object ref = serviceName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        serviceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IF_INDEX_FIELD_NUMBER = 8;
    private int ifIndex_ = 0;
    /**
     * <code>uint32 if_index = 8;</code>
     * @return The ifIndex.
     */
    @java.lang.Override
    public int getIfIndex() {
      return ifIndex_;
    }

    public static final int DESCRIPTION_FIELD_NUMBER = 9;
    @SuppressWarnings("serial")
    private volatile java.lang.Object description_ = "";
    /**
     * <code>string description = 9;</code>
     * @return The description.
     */
    @java.lang.Override
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      }
    }
    /**
     * <code>string description = 9;</code>
     * @return The bytes for description.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DIST_POLLER_FIELD_NUMBER = 10;
    @SuppressWarnings("serial")
    private volatile java.lang.Object distPoller_ = "";
    /**
     * <code>string dist_poller = 10;</code>
     * @return The distPoller.
     */
    @java.lang.Override
    public java.lang.String getDistPoller() {
      java.lang.Object ref = distPoller_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        distPoller_ = s;
        return s;
      }
    }
    /**
     * <code>string dist_poller = 10;</code>
     * @return The bytes for distPoller.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getDistPollerBytes() {
      java.lang.Object ref = distPoller_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        distPoller_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LOG_DEST_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private volatile java.lang.Object logDest_ = "";
    /**
     * <code>string log_dest = 11;</code>
     * @return The logDest.
     */
    @java.lang.Override
    public java.lang.String getLogDest() {
      java.lang.Object ref = logDest_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        logDest_ = s;
        return s;
      }
    }
    /**
     * <code>string log_dest = 11;</code>
     * @return The bytes for logDest.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getLogDestBytes() {
      java.lang.Object ref = logDest_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        logDest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LOG_CONTENT_FIELD_NUMBER = 12;
    @SuppressWarnings("serial")
    private volatile java.lang.Object logContent_ = "";
    /**
     * <code>string log_content = 12;</code>
     * @return The logContent.
     */
    @java.lang.Override
    public java.lang.String getLogContent() {
      java.lang.Object ref = logContent_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        logContent_ = s;
        return s;
      }
    }
    /**
     * <code>string log_content = 12;</code>
     * @return The bytes for logContent.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getLogContentBytes() {
      java.lang.Object ref = logContent_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        logContent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PARAMETER_FIELD_NUMBER = 13;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.features.kafka.consumer.events.EventsProto.EventParameter> parameter_;
    /**
     * <code>repeated .EventParameter parameter = 13;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.features.kafka.consumer.events.EventsProto.EventParameter> getParameterList() {
      return parameter_;
    }
    /**
     * <code>repeated .EventParameter parameter = 13;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.features.kafka.consumer.events.EventsProto.EventParameterOrBuilder>
    getParameterOrBuilderList() {
      return parameter_;
    }
    /**
     * <code>repeated .EventParameter parameter = 13;</code>
     */
    @java.lang.Override
    public int getParameterCount() {
      return parameter_.size();
    }
    /**
     * <code>repeated .EventParameter parameter = 13;</code>
     */
    @java.lang.Override
    public org.opennms.features.kafka.consumer.events.EventsProto.EventParameter getParameter(int index) {
      return parameter_.get(index);
    }
    /**
     * <code>repeated .EventParameter parameter = 13;</code>
     */
    @java.lang.Override
    public org.opennms.features.kafka.consumer.events.EventsProto.EventParameterOrBuilder getParameterOrBuilder(
            int index) {
      return parameter_.get(index);
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uei_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uei_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(source_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, source_);
      }
      if (severity_ != org.opennms.features.kafka.consumer.events.EventsProto.Severity.INDETERMINATE.getNumber()) {
        output.writeEnum(3, severity_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(host_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, host_);
      }
      if (nodeId_ != 0) {
        output.writeUInt32(5, nodeId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ipAddress_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, ipAddress_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, serviceName_);
      }
      if (ifIndex_ != 0) {
        output.writeUInt32(8, ifIndex_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, description_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(distPoller_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 10, distPoller_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(logDest_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 11, logDest_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(logContent_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 12, logContent_);
      }
      for (int i = 0; i < parameter_.size(); i++) {
        output.writeMessage(13, parameter_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uei_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uei_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(source_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, source_);
      }
      if (severity_ != org.opennms.features.kafka.consumer.events.EventsProto.Severity.INDETERMINATE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
                .computeEnumSize(3, severity_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(host_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, host_);
      }
      if (nodeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
                .computeUInt32Size(5, nodeId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ipAddress_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, ipAddress_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, serviceName_);
      }
      if (ifIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
                .computeUInt32Size(8, ifIndex_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, description_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(distPoller_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, distPoller_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(logDest_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, logDest_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(logContent_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, logContent_);
      }
      for (int i = 0; i < parameter_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(13, parameter_.get(i));
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
      if (!(obj instanceof org.opennms.features.kafka.consumer.events.EventsProto.Event)) {
        return super.equals(obj);
      }
      org.opennms.features.kafka.consumer.events.EventsProto.Event other = (org.opennms.features.kafka.consumer.events.EventsProto.Event) obj;

      if (!getUei()
              .equals(other.getUei())) return false;
      if (!getSource()
              .equals(other.getSource())) return false;
      if (severity_ != other.severity_) return false;
      if (!getHost()
              .equals(other.getHost())) return false;
      if (getNodeId()
              != other.getNodeId()) return false;
      if (!getIpAddress()
              .equals(other.getIpAddress())) return false;
      if (!getServiceName()
              .equals(other.getServiceName())) return false;
      if (getIfIndex()
              != other.getIfIndex()) return false;
      if (!getDescription()
              .equals(other.getDescription())) return false;
      if (!getDistPoller()
              .equals(other.getDistPoller())) return false;
      if (!getLogDest()
              .equals(other.getLogDest())) return false;
      if (!getLogContent()
              .equals(other.getLogContent())) return false;
      if (!getParameterList()
              .equals(other.getParameterList())) return false;
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
      hash = (37 * hash) + UEI_FIELD_NUMBER;
      hash = (53 * hash) + getUei().hashCode();
      hash = (37 * hash) + SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getSource().hashCode();
      hash = (37 * hash) + SEVERITY_FIELD_NUMBER;
      hash = (53 * hash) + severity_;
      hash = (37 * hash) + HOST_FIELD_NUMBER;
      hash = (53 * hash) + getHost().hashCode();
      hash = (37 * hash) + NODE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNodeId();
      hash = (37 * hash) + IP_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getIpAddress().hashCode();
      hash = (37 * hash) + SERVICE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getServiceName().hashCode();
      hash = (37 * hash) + IF_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIfIndex();
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
      hash = (37 * hash) + DIST_POLLER_FIELD_NUMBER;
      hash = (53 * hash) + getDistPoller().hashCode();
      hash = (37 * hash) + LOG_DEST_FIELD_NUMBER;
      hash = (53 * hash) + getLogDest().hashCode();
      hash = (37 * hash) + LOG_CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getLogContent().hashCode();
      if (getParameterCount() > 0) {
        hash = (37 * hash) + PARAMETER_FIELD_NUMBER;
        hash = (53 * hash) + getParameterList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.kafka.consumer.events.EventsProto.Event parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.consumer.events.EventsProto.Event parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.consumer.events.EventsProto.Event parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.consumer.events.EventsProto.Event parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.consumer.events.EventsProto.Event parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.consumer.events.EventsProto.Event parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.consumer.events.EventsProto.Event parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.consumer.events.EventsProto.Event parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.kafka.consumer.events.EventsProto.Event parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.kafka.consumer.events.EventsProto.Event parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.kafka.consumer.events.EventsProto.Event parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.consumer.events.EventsProto.Event parseFrom(
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
    public static Builder newBuilder(org.opennms.features.kafka.consumer.events.EventsProto.Event prototype) {
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
     * Protobuf type {@code Event}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:Event)
            org.opennms.features.kafka.consumer.events.EventsProto.EventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.opennms.features.kafka.consumer.events.EventsProto.internal_static_Event_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.opennms.features.kafka.consumer.events.EventsProto.internal_static_Event_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        org.opennms.features.kafka.consumer.events.EventsProto.Event.class, org.opennms.features.kafka.consumer.events.EventsProto.Event.Builder.class);
      }

      // Construct using org.opennms.features.kafka.consumer.events.EventsProto.Event.newBuilder()
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
        uei_ = "";
        source_ = "";
        severity_ = 0;
        host_ = "";
        nodeId_ = 0;
        ipAddress_ = "";
        serviceName_ = "";
        ifIndex_ = 0;
        description_ = "";
        distPoller_ = "";
        logDest_ = "";
        logContent_ = "";
        if (parameterBuilder_ == null) {
          parameter_ = java.util.Collections.emptyList();
        } else {
          parameter_ = null;
          parameterBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00001000);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.opennms.features.kafka.consumer.events.EventsProto.internal_static_Event_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.kafka.consumer.events.EventsProto.Event getDefaultInstanceForType() {
        return org.opennms.features.kafka.consumer.events.EventsProto.Event.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.kafka.consumer.events.EventsProto.Event build() {
        org.opennms.features.kafka.consumer.events.EventsProto.Event result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.kafka.consumer.events.EventsProto.Event buildPartial() {
        org.opennms.features.kafka.consumer.events.EventsProto.Event result = new org.opennms.features.kafka.consumer.events.EventsProto.Event(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(org.opennms.features.kafka.consumer.events.EventsProto.Event result) {
        if (parameterBuilder_ == null) {
          if (((bitField0_ & 0x00001000) != 0)) {
            parameter_ = java.util.Collections.unmodifiableList(parameter_);
            bitField0_ = (bitField0_ & ~0x00001000);
          }
          result.parameter_ = parameter_;
        } else {
          result.parameter_ = parameterBuilder_.build();
        }
      }

      private void buildPartial0(org.opennms.features.kafka.consumer.events.EventsProto.Event result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.uei_ = uei_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.source_ = source_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.severity_ = severity_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.host_ = host_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.nodeId_ = nodeId_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.ipAddress_ = ipAddress_;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.serviceName_ = serviceName_;
        }
        if (((from_bitField0_ & 0x00000080) != 0)) {
          result.ifIndex_ = ifIndex_;
        }
        if (((from_bitField0_ & 0x00000100) != 0)) {
          result.description_ = description_;
        }
        if (((from_bitField0_ & 0x00000200) != 0)) {
          result.distPoller_ = distPoller_;
        }
        if (((from_bitField0_ & 0x00000400) != 0)) {
          result.logDest_ = logDest_;
        }
        if (((from_bitField0_ & 0x00000800) != 0)) {
          result.logContent_ = logContent_;
        }
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
        if (other instanceof org.opennms.features.kafka.consumer.events.EventsProto.Event) {
          return mergeFrom((org.opennms.features.kafka.consumer.events.EventsProto.Event)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.kafka.consumer.events.EventsProto.Event other) {
        if (other == org.opennms.features.kafka.consumer.events.EventsProto.Event.getDefaultInstance()) return this;
        if (!other.getUei().isEmpty()) {
          uei_ = other.uei_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getSource().isEmpty()) {
          source_ = other.source_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.severity_ != 0) {
          setSeverityValue(other.getSeverityValue());
        }
        if (!other.getHost().isEmpty()) {
          host_ = other.host_;
          bitField0_ |= 0x00000008;
          onChanged();
        }
        if (other.getNodeId() != 0) {
          setNodeId(other.getNodeId());
        }
        if (!other.getIpAddress().isEmpty()) {
          ipAddress_ = other.ipAddress_;
          bitField0_ |= 0x00000020;
          onChanged();
        }
        if (!other.getServiceName().isEmpty()) {
          serviceName_ = other.serviceName_;
          bitField0_ |= 0x00000040;
          onChanged();
        }
        if (other.getIfIndex() != 0) {
          setIfIndex(other.getIfIndex());
        }
        if (!other.getDescription().isEmpty()) {
          description_ = other.description_;
          bitField0_ |= 0x00000100;
          onChanged();
        }
        if (!other.getDistPoller().isEmpty()) {
          distPoller_ = other.distPoller_;
          bitField0_ |= 0x00000200;
          onChanged();
        }
        if (!other.getLogDest().isEmpty()) {
          logDest_ = other.logDest_;
          bitField0_ |= 0x00000400;
          onChanged();
        }
        if (!other.getLogContent().isEmpty()) {
          logContent_ = other.logContent_;
          bitField0_ |= 0x00000800;
          onChanged();
        }
        if (parameterBuilder_ == null) {
          if (!other.parameter_.isEmpty()) {
            if (parameter_.isEmpty()) {
              parameter_ = other.parameter_;
              bitField0_ = (bitField0_ & ~0x00001000);
            } else {
              ensureParameterIsMutable();
              parameter_.addAll(other.parameter_);
            }
            onChanged();
          }
        } else {
          if (!other.parameter_.isEmpty()) {
            if (parameterBuilder_.isEmpty()) {
              parameterBuilder_.dispose();
              parameterBuilder_ = null;
              parameter_ = other.parameter_;
              bitField0_ = (bitField0_ & ~0x00001000);
              parameterBuilder_ =
                      com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                              getParameterFieldBuilder() : null;
            } else {
              parameterBuilder_.addAllMessages(other.parameter_);
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
                uei_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                source_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 24: {
                severity_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 34: {
                host_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              case 40: {
                nodeId_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              case 50: {
                ipAddress_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000020;
                break;
              } // case 50
              case 58: {
                serviceName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000040;
                break;
              } // case 58
              case 64: {
                ifIndex_ = input.readUInt32();
                bitField0_ |= 0x00000080;
                break;
              } // case 64
              case 74: {
                description_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000100;
                break;
              } // case 74
              case 82: {
                distPoller_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000200;
                break;
              } // case 82
              case 90: {
                logDest_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000400;
                break;
              } // case 90
              case 98: {
                logContent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000800;
                break;
              } // case 98
              case 106: {
                org.opennms.features.kafka.consumer.events.EventsProto.EventParameter m =
                        input.readMessage(
                                org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.parser(),
                                extensionRegistry);
                if (parameterBuilder_ == null) {
                  ensureParameterIsMutable();
                  parameter_.add(m);
                } else {
                  parameterBuilder_.addMessage(m);
                }
                break;
              } // case 106
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

      private java.lang.Object uei_ = "";
      /**
       * <pre>
       * required field
       * </pre>
       *
       * <code>string uei = 1;</code>
       * @return The uei.
       */
      public java.lang.String getUei() {
        java.lang.Object ref = uei_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          uei_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * required field
       * </pre>
       *
       * <code>string uei = 1;</code>
       * @return The bytes for uei.
       */
      public com.google.protobuf.ByteString
      getUeiBytes() {
        java.lang.Object ref = uei_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          uei_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * required field
       * </pre>
       *
       * <code>string uei = 1;</code>
       * @param value The uei to set.
       * @return This builder for chaining.
       */
      public Builder setUei(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        uei_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * required field
       * </pre>
       *
       * <code>string uei = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUei() {
        uei_ = getDefaultInstance().getUei();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * required field
       * </pre>
       *
       * <code>string uei = 1;</code>
       * @param value The bytes for uei to set.
       * @return This builder for chaining.
       */
      public Builder setUeiBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        uei_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object source_ = "";
      /**
       * <pre>
       * required field
       * </pre>
       *
       * <code>string source = 2;</code>
       * @return The source.
       */
      public java.lang.String getSource() {
        java.lang.Object ref = source_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          source_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * required field
       * </pre>
       *
       * <code>string source = 2;</code>
       * @return The bytes for source.
       */
      public com.google.protobuf.ByteString
      getSourceBytes() {
        java.lang.Object ref = source_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          source_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * required field
       * </pre>
       *
       * <code>string source = 2;</code>
       * @param value The source to set.
       * @return This builder for chaining.
       */
      public Builder setSource(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        source_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * required field
       * </pre>
       *
       * <code>string source = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSource() {
        source_ = getDefaultInstance().getSource();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * required field
       * </pre>
       *
       * <code>string source = 2;</code>
       * @param value The bytes for source to set.
       * @return This builder for chaining.
       */
      public Builder setSourceBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        source_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private int severity_ = 0;
      /**
       * <pre>
       * required field
       * </pre>
       *
       * <code>.Severity severity = 3;</code>
       * @return The enum numeric value on the wire for severity.
       */
      @java.lang.Override public int getSeverityValue() {
        return severity_;
      }
      /**
       * <pre>
       * required field
       * </pre>
       *
       * <code>.Severity severity = 3;</code>
       * @param value The enum numeric value on the wire for severity to set.
       * @return This builder for chaining.
       */
      public Builder setSeverityValue(int value) {
        severity_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * required field
       * </pre>
       *
       * <code>.Severity severity = 3;</code>
       * @return The severity.
       */
      @java.lang.Override
      public org.opennms.features.kafka.consumer.events.EventsProto.Severity getSeverity() {
        org.opennms.features.kafka.consumer.events.EventsProto.Severity result = org.opennms.features.kafka.consumer.events.EventsProto.Severity.forNumber(severity_);
        return result == null ? org.opennms.features.kafka.consumer.events.EventsProto.Severity.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * required field
       * </pre>
       *
       * <code>.Severity severity = 3;</code>
       * @param value The severity to set.
       * @return This builder for chaining.
       */
      public Builder setSeverity(org.opennms.features.kafka.consumer.events.EventsProto.Severity value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        severity_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * required field
       * </pre>
       *
       * <code>.Severity severity = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSeverity() {
        bitField0_ = (bitField0_ & ~0x00000004);
        severity_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object host_ = "";
      /**
       * <code>string host = 4;</code>
       * @return The host.
       */
      public java.lang.String getHost() {
        java.lang.Object ref = host_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          host_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string host = 4;</code>
       * @return The bytes for host.
       */
      public com.google.protobuf.ByteString
      getHostBytes() {
        java.lang.Object ref = host_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          host_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string host = 4;</code>
       * @param value The host to set.
       * @return This builder for chaining.
       */
      public Builder setHost(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        host_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>string host = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearHost() {
        host_ = getDefaultInstance().getHost();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>string host = 4;</code>
       * @param value The bytes for host to set.
       * @return This builder for chaining.
       */
      public Builder setHostBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        host_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }

      private int nodeId_ ;
      /**
       * <code>uint32 node_id = 5;</code>
       * @return The nodeId.
       */
      @java.lang.Override
      public int getNodeId() {
        return nodeId_;
      }
      /**
       * <code>uint32 node_id = 5;</code>
       * @param value The nodeId to set.
       * @return This builder for chaining.
       */
      public Builder setNodeId(int value) {

        nodeId_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 node_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearNodeId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        nodeId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object ipAddress_ = "";
      /**
       * <code>string ip_address = 6;</code>
       * @return The ipAddress.
       */
      public java.lang.String getIpAddress() {
        java.lang.Object ref = ipAddress_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          ipAddress_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string ip_address = 6;</code>
       * @return The bytes for ipAddress.
       */
      public com.google.protobuf.ByteString
      getIpAddressBytes() {
        java.lang.Object ref = ipAddress_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          ipAddress_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string ip_address = 6;</code>
       * @param value The ipAddress to set.
       * @return This builder for chaining.
       */
      public Builder setIpAddress(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ipAddress_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>string ip_address = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIpAddress() {
        ipAddress_ = getDefaultInstance().getIpAddress();
        bitField0_ = (bitField0_ & ~0x00000020);
        onChanged();
        return this;
      }
      /**
       * <code>string ip_address = 6;</code>
       * @param value The bytes for ipAddress to set.
       * @return This builder for chaining.
       */
      public Builder setIpAddressBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        ipAddress_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }

      private java.lang.Object serviceName_ = "";
      /**
       * <code>string service_name = 7;</code>
       * @return The serviceName.
       */
      public java.lang.String getServiceName() {
        java.lang.Object ref = serviceName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          serviceName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string service_name = 7;</code>
       * @return The bytes for serviceName.
       */
      public com.google.protobuf.ByteString
      getServiceNameBytes() {
        java.lang.Object ref = serviceName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          serviceName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string service_name = 7;</code>
       * @param value The serviceName to set.
       * @return This builder for chaining.
       */
      public Builder setServiceName(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        serviceName_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <code>string service_name = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearServiceName() {
        serviceName_ = getDefaultInstance().getServiceName();
        bitField0_ = (bitField0_ & ~0x00000040);
        onChanged();
        return this;
      }
      /**
       * <code>string service_name = 7;</code>
       * @param value The bytes for serviceName to set.
       * @return This builder for chaining.
       */
      public Builder setServiceNameBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        serviceName_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }

      private int ifIndex_ ;
      /**
       * <code>uint32 if_index = 8;</code>
       * @return The ifIndex.
       */
      @java.lang.Override
      public int getIfIndex() {
        return ifIndex_;
      }
      /**
       * <code>uint32 if_index = 8;</code>
       * @param value The ifIndex to set.
       * @return This builder for chaining.
       */
      public Builder setIfIndex(int value) {

        ifIndex_ = value;
        bitField0_ |= 0x00000080;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 if_index = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIfIndex() {
        bitField0_ = (bitField0_ & ~0x00000080);
        ifIndex_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object description_ = "";
      /**
       * <code>string description = 9;</code>
       * @return The description.
       */
      public java.lang.String getDescription() {
        java.lang.Object ref = description_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          description_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string description = 9;</code>
       * @return The bytes for description.
       */
      public com.google.protobuf.ByteString
      getDescriptionBytes() {
        java.lang.Object ref = description_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          description_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string description = 9;</code>
       * @param value The description to set.
       * @return This builder for chaining.
       */
      public Builder setDescription(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        description_ = value;
        bitField0_ |= 0x00000100;
        onChanged();
        return this;
      }
      /**
       * <code>string description = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearDescription() {
        description_ = getDefaultInstance().getDescription();
        bitField0_ = (bitField0_ & ~0x00000100);
        onChanged();
        return this;
      }
      /**
       * <code>string description = 9;</code>
       * @param value The bytes for description to set.
       * @return This builder for chaining.
       */
      public Builder setDescriptionBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        description_ = value;
        bitField0_ |= 0x00000100;
        onChanged();
        return this;
      }

      private java.lang.Object distPoller_ = "";
      /**
       * <code>string dist_poller = 10;</code>
       * @return The distPoller.
       */
      public java.lang.String getDistPoller() {
        java.lang.Object ref = distPoller_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          distPoller_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string dist_poller = 10;</code>
       * @return The bytes for distPoller.
       */
      public com.google.protobuf.ByteString
      getDistPollerBytes() {
        java.lang.Object ref = distPoller_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          distPoller_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string dist_poller = 10;</code>
       * @param value The distPoller to set.
       * @return This builder for chaining.
       */
      public Builder setDistPoller(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        distPoller_ = value;
        bitField0_ |= 0x00000200;
        onChanged();
        return this;
      }
      /**
       * <code>string dist_poller = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearDistPoller() {
        distPoller_ = getDefaultInstance().getDistPoller();
        bitField0_ = (bitField0_ & ~0x00000200);
        onChanged();
        return this;
      }
      /**
       * <code>string dist_poller = 10;</code>
       * @param value The bytes for distPoller to set.
       * @return This builder for chaining.
       */
      public Builder setDistPollerBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        distPoller_ = value;
        bitField0_ |= 0x00000200;
        onChanged();
        return this;
      }

      private java.lang.Object logDest_ = "";
      /**
       * <code>string log_dest = 11;</code>
       * @return The logDest.
       */
      public java.lang.String getLogDest() {
        java.lang.Object ref = logDest_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          logDest_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string log_dest = 11;</code>
       * @return The bytes for logDest.
       */
      public com.google.protobuf.ByteString
      getLogDestBytes() {
        java.lang.Object ref = logDest_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          logDest_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string log_dest = 11;</code>
       * @param value The logDest to set.
       * @return This builder for chaining.
       */
      public Builder setLogDest(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        logDest_ = value;
        bitField0_ |= 0x00000400;
        onChanged();
        return this;
      }
      /**
       * <code>string log_dest = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLogDest() {
        logDest_ = getDefaultInstance().getLogDest();
        bitField0_ = (bitField0_ & ~0x00000400);
        onChanged();
        return this;
      }
      /**
       * <code>string log_dest = 11;</code>
       * @param value The bytes for logDest to set.
       * @return This builder for chaining.
       */
      public Builder setLogDestBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        logDest_ = value;
        bitField0_ |= 0x00000400;
        onChanged();
        return this;
      }

      private java.lang.Object logContent_ = "";
      /**
       * <code>string log_content = 12;</code>
       * @return The logContent.
       */
      public java.lang.String getLogContent() {
        java.lang.Object ref = logContent_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          logContent_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string log_content = 12;</code>
       * @return The bytes for logContent.
       */
      public com.google.protobuf.ByteString
      getLogContentBytes() {
        java.lang.Object ref = logContent_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          logContent_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string log_content = 12;</code>
       * @param value The logContent to set.
       * @return This builder for chaining.
       */
      public Builder setLogContent(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        logContent_ = value;
        bitField0_ |= 0x00000800;
        onChanged();
        return this;
      }
      /**
       * <code>string log_content = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearLogContent() {
        logContent_ = getDefaultInstance().getLogContent();
        bitField0_ = (bitField0_ & ~0x00000800);
        onChanged();
        return this;
      }
      /**
       * <code>string log_content = 12;</code>
       * @param value The bytes for logContent to set.
       * @return This builder for chaining.
       */
      public Builder setLogContentBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        logContent_ = value;
        bitField0_ |= 0x00000800;
        onChanged();
        return this;
      }

      private java.util.List<org.opennms.features.kafka.consumer.events.EventsProto.EventParameter> parameter_ =
              java.util.Collections.emptyList();
      private void ensureParameterIsMutable() {
        if (!((bitField0_ & 0x00001000) != 0)) {
          parameter_ = new java.util.ArrayList<org.opennms.features.kafka.consumer.events.EventsProto.EventParameter>(parameter_);
          bitField0_ |= 0x00001000;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.features.kafka.consumer.events.EventsProto.EventParameter, org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.Builder, org.opennms.features.kafka.consumer.events.EventsProto.EventParameterOrBuilder> parameterBuilder_;

      /**
       * <code>repeated .EventParameter parameter = 13;</code>
       */
      public java.util.List<org.opennms.features.kafka.consumer.events.EventsProto.EventParameter> getParameterList() {
        if (parameterBuilder_ == null) {
          return java.util.Collections.unmodifiableList(parameter_);
        } else {
          return parameterBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .EventParameter parameter = 13;</code>
       */
      public int getParameterCount() {
        if (parameterBuilder_ == null) {
          return parameter_.size();
        } else {
          return parameterBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .EventParameter parameter = 13;</code>
       */
      public org.opennms.features.kafka.consumer.events.EventsProto.EventParameter getParameter(int index) {
        if (parameterBuilder_ == null) {
          return parameter_.get(index);
        } else {
          return parameterBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .EventParameter parameter = 13;</code>
       */
      public Builder setParameter(
              int index, org.opennms.features.kafka.consumer.events.EventsProto.EventParameter value) {
        if (parameterBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureParameterIsMutable();
          parameter_.set(index, value);
          onChanged();
        } else {
          parameterBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EventParameter parameter = 13;</code>
       */
      public Builder setParameter(
              int index, org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.Builder builderForValue) {
        if (parameterBuilder_ == null) {
          ensureParameterIsMutable();
          parameter_.set(index, builderForValue.build());
          onChanged();
        } else {
          parameterBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EventParameter parameter = 13;</code>
       */
      public Builder addParameter(org.opennms.features.kafka.consumer.events.EventsProto.EventParameter value) {
        if (parameterBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureParameterIsMutable();
          parameter_.add(value);
          onChanged();
        } else {
          parameterBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .EventParameter parameter = 13;</code>
       */
      public Builder addParameter(
              int index, org.opennms.features.kafka.consumer.events.EventsProto.EventParameter value) {
        if (parameterBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureParameterIsMutable();
          parameter_.add(index, value);
          onChanged();
        } else {
          parameterBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EventParameter parameter = 13;</code>
       */
      public Builder addParameter(
              org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.Builder builderForValue) {
        if (parameterBuilder_ == null) {
          ensureParameterIsMutable();
          parameter_.add(builderForValue.build());
          onChanged();
        } else {
          parameterBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EventParameter parameter = 13;</code>
       */
      public Builder addParameter(
              int index, org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.Builder builderForValue) {
        if (parameterBuilder_ == null) {
          ensureParameterIsMutable();
          parameter_.add(index, builderForValue.build());
          onChanged();
        } else {
          parameterBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EventParameter parameter = 13;</code>
       */
      public Builder addAllParameter(
              java.lang.Iterable<? extends org.opennms.features.kafka.consumer.events.EventsProto.EventParameter> values) {
        if (parameterBuilder_ == null) {
          ensureParameterIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
                  values, parameter_);
          onChanged();
        } else {
          parameterBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .EventParameter parameter = 13;</code>
       */
      public Builder clearParameter() {
        if (parameterBuilder_ == null) {
          parameter_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00001000);
          onChanged();
        } else {
          parameterBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .EventParameter parameter = 13;</code>
       */
      public Builder removeParameter(int index) {
        if (parameterBuilder_ == null) {
          ensureParameterIsMutable();
          parameter_.remove(index);
          onChanged();
        } else {
          parameterBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .EventParameter parameter = 13;</code>
       */
      public org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.Builder getParameterBuilder(
              int index) {
        return getParameterFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .EventParameter parameter = 13;</code>
       */
      public org.opennms.features.kafka.consumer.events.EventsProto.EventParameterOrBuilder getParameterOrBuilder(
              int index) {
        if (parameterBuilder_ == null) {
          return parameter_.get(index);  } else {
          return parameterBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .EventParameter parameter = 13;</code>
       */
      public java.util.List<? extends org.opennms.features.kafka.consumer.events.EventsProto.EventParameterOrBuilder>
      getParameterOrBuilderList() {
        if (parameterBuilder_ != null) {
          return parameterBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(parameter_);
        }
      }
      /**
       * <code>repeated .EventParameter parameter = 13;</code>
       */
      public org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.Builder addParameterBuilder() {
        return getParameterFieldBuilder().addBuilder(
                org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.getDefaultInstance());
      }
      /**
       * <code>repeated .EventParameter parameter = 13;</code>
       */
      public org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.Builder addParameterBuilder(
              int index) {
        return getParameterFieldBuilder().addBuilder(
                index, org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.getDefaultInstance());
      }
      /**
       * <code>repeated .EventParameter parameter = 13;</code>
       */
      public java.util.List<org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.Builder>
      getParameterBuilderList() {
        return getParameterFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.features.kafka.consumer.events.EventsProto.EventParameter, org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.Builder, org.opennms.features.kafka.consumer.events.EventsProto.EventParameterOrBuilder>
      getParameterFieldBuilder() {
        if (parameterBuilder_ == null) {
          parameterBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                  org.opennms.features.kafka.consumer.events.EventsProto.EventParameter, org.opennms.features.kafka.consumer.events.EventsProto.EventParameter.Builder, org.opennms.features.kafka.consumer.events.EventsProto.EventParameterOrBuilder>(
                  parameter_,
                  ((bitField0_ & 0x00001000) != 0),
                  getParentForChildren(),
                  isClean());
          parameter_ = null;
        }
        return parameterBuilder_;
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


      // @@protoc_insertion_point(builder_scope:Event)
    }

    // @@protoc_insertion_point(class_scope:Event)
    private static final org.opennms.features.kafka.consumer.events.EventsProto.Event DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.kafka.consumer.events.EventsProto.Event();
    }

    public static org.opennms.features.kafka.consumer.events.EventsProto.Event getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Event>
            PARSER = new com.google.protobuf.AbstractParser<Event>() {
      @java.lang.Override
      public Event parsePartialFrom(
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

    public static com.google.protobuf.Parser<Event> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Event> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.kafka.consumer.events.EventsProto.Event getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
          internal_static_EventParameter_descriptor;
  private static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_EventParameter_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
          internal_static_Event_descriptor;
  private static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_Event_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
          descriptor;
  static {
    java.lang.String[] descriptorData = {
            "\n\033kafka-consumer-events.proto\"-\n\016EventPa" +
                    "rameter\022\014\n\004name\030\001 \001(\t\022\r\n\005value\030\002 \001(\t\"\221\002\n" +
                    "\005Event\022\013\n\003uei\030\001 \001(\t\022\016\n\006source\030\002 \001(\t\022\033\n\010s" +
                    "everity\030\003 \001(\0162\t.Severity\022\014\n\004host\030\004 \001(\t\022\017" +
                    "\n\007node_id\030\005 \001(\r\022\022\n\nip_address\030\006 \001(\t\022\024\n\014s" +
                    "ervice_name\030\007 \001(\t\022\020\n\010if_index\030\010 \001(\r\022\023\n\013d" +
                    "escription\030\t \001(\t\022\023\n\013dist_poller\030\n \001(\t\022\020\n" +
                    "\010log_dest\030\013 \001(\t\022\023\n\013log_content\030\014 \001(\t\022\"\n\t" +
                    "parameter\030\r \003(\0132\017.EventParameter*g\n\010Seve" +
                    "rity\022\021\n\rINDETERMINATE\020\000\022\013\n\007CLEARED\020\001\022\n\n\006" +
                    "NORMAL\020\002\022\013\n\007WARNING\020\003\022\t\n\005MINOR\020\004\022\t\n\005MAJO" +
                    "R\020\005\022\014\n\010CRITICAL\020\006B9\n*org.opennms.feature" +
                    "s.kafka.consumer.eventsB\013EventsProtob\006pr" +
                    "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
            .internalBuildGeneratedFileFrom(descriptorData,
                    new com.google.protobuf.Descriptors.FileDescriptor[] {
                    });
    internal_static_EventParameter_descriptor =
            getDescriptor().getMessageTypes().get(0);
    internal_static_EventParameter_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_EventParameter_descriptor,
            new java.lang.String[] { "Name", "Value", });
    internal_static_Event_descriptor =
            getDescriptor().getMessageTypes().get(1);
    internal_static_Event_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_Event_descriptor,
            new java.lang.String[] { "Uei", "Source", "Severity", "Host", "NodeId", "IpAddress", "ServiceName", "IfIndex", "Description", "DistPoller", "LogDest", "LogContent", "Parameter", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
