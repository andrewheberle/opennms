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
package org.opennms.features.kafka.producer.model;

public final class CollectionSetProtos {
  private CollectionSetProtos() {}
  public static void registerAllExtensions(
          com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
          com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
            (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StringAttributeOrBuilder extends
          // @@protoc_insertion_point(interface_extends:StringAttribute)
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
   * Protobuf type {@code StringAttribute}
   */
  public static final class StringAttribute extends
          com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:StringAttribute)
          StringAttributeOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use StringAttribute.newBuilder() to construct.
    private StringAttribute(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StringAttribute() {
      name_ = "";
      value_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
      return new StringAttribute();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_StringAttribute_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_StringAttribute_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.class, org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.Builder.class);
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
      if (!(obj instanceof org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute)) {
        return super.equals(obj);
      }
      org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute other = (org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute) obj;

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

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute parseFrom(
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
    public static Builder newBuilder(org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute prototype) {
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
     * Protobuf type {@code StringAttribute}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:StringAttribute)
            org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttributeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_StringAttribute_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_StringAttribute_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.class, org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.Builder.class);
      }

      // Construct using org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.newBuilder()
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
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_StringAttribute_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute getDefaultInstanceForType() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute build() {
        org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute buildPartial() {
        org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute result = new org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute result) {
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
        if (other instanceof org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute) {
          return mergeFrom((org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute other) {
        if (other == org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.getDefaultInstance()) return this;
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


      // @@protoc_insertion_point(builder_scope:StringAttribute)
    }

    // @@protoc_insertion_point(class_scope:StringAttribute)
    private static final org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute();
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StringAttribute>
            PARSER = new com.google.protobuf.AbstractParser<StringAttribute>() {
      @java.lang.Override
      public StringAttribute parsePartialFrom(
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

    public static com.google.protobuf.Parser<StringAttribute> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StringAttribute> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface NumericAttributeOrBuilder extends
          // @@protoc_insertion_point(interface_extends:NumericAttribute)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string group = 1;</code>
     * @return The group.
     */
    java.lang.String getGroup();
    /**
     * <code>string group = 1;</code>
     * @return The bytes for group.
     */
    com.google.protobuf.ByteString
    getGroupBytes();

    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
    getNameBytes();

    /**
     * <code>double value = 3;</code>
     * @return The value.
     */
    double getValue();

    /**
     * <code>.NumericAttribute.Type type = 4;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <code>.NumericAttribute.Type type = 4;</code>
     * @return The type.
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Type getType();

    /**
     * <pre>
     * Copy of `value` that is ALWAYS serialized, even when zero
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue metric_value = 5;</code>
     * @return Whether the metricValue field is set.
     */
    boolean hasMetricValue();
    /**
     * <pre>
     * Copy of `value` that is ALWAYS serialized, even when zero
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue metric_value = 5;</code>
     * @return The metricValue.
     */
    com.google.protobuf.DoubleValue getMetricValue();
    /**
     * <pre>
     * Copy of `value` that is ALWAYS serialized, even when zero
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue metric_value = 5;</code>
     */
    com.google.protobuf.DoubleValueOrBuilder getMetricValueOrBuilder();
  }
  /**
   * Protobuf type {@code NumericAttribute}
   */
  public static final class NumericAttribute extends
          com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:NumericAttribute)
          NumericAttributeOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use NumericAttribute.newBuilder() to construct.
    private NumericAttribute(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NumericAttribute() {
      group_ = "";
      name_ = "";
      type_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
      return new NumericAttribute();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_NumericAttribute_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_NumericAttribute_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.class, org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Builder.class);
    }

    /**
     * Protobuf enum {@code NumericAttribute.Type}
     */
    public enum Type
            implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>GAUGE = 0;</code>
       */
      GAUGE(0),
      /**
       * <code>COUNTER = 1;</code>
       */
      COUNTER(1),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>GAUGE = 0;</code>
       */
      public static final int GAUGE_VALUE = 0;
      /**
       * <code>COUNTER = 1;</code>
       */
      public static final int COUNTER_VALUE = 1;


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
      public static Type valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Type forNumber(int value) {
        switch (value) {
          case 0: return GAUGE;
          case 1: return COUNTER;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Type>
      internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
              Type> internalValueMap =
              new com.google.protobuf.Internal.EnumLiteMap<Type>() {
                public Type findValueByNumber(int number) {
                  return Type.forNumber(number);
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
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.getDescriptor().getEnumTypes().get(0);
      }

      private static final Type[] VALUES = values();

      public static Type valueOf(
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

      private Type(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:NumericAttribute.Type)
    }

    private int bitField0_;
    public static final int GROUP_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object group_ = "";
    /**
     * <code>string group = 1;</code>
     * @return The group.
     */
    @java.lang.Override
    public java.lang.String getGroup() {
      java.lang.Object ref = group_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        group_ = s;
        return s;
      }
    }
    /**
     * <code>string group = 1;</code>
     * @return The bytes for group.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getGroupBytes() {
      java.lang.Object ref = group_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        group_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NAME_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
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
     * <code>string name = 2;</code>
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

    public static final int VALUE_FIELD_NUMBER = 3;
    private double value_ = 0D;
    /**
     * <code>double value = 3;</code>
     * @return The value.
     */
    @java.lang.Override
    public double getValue() {
      return value_;
    }

    public static final int TYPE_FIELD_NUMBER = 4;
    private int type_ = 0;
    /**
     * <code>.NumericAttribute.Type type = 4;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.NumericAttribute.Type type = 4;</code>
     * @return The type.
     */
    @java.lang.Override public org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Type getType() {
      org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Type result = org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Type.forNumber(type_);
      return result == null ? org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Type.UNRECOGNIZED : result;
    }

    public static final int METRIC_VALUE_FIELD_NUMBER = 5;
    private com.google.protobuf.DoubleValue metricValue_;
    /**
     * <pre>
     * Copy of `value` that is ALWAYS serialized, even when zero
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue metric_value = 5;</code>
     * @return Whether the metricValue field is set.
     */
    @java.lang.Override
    public boolean hasMetricValue() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Copy of `value` that is ALWAYS serialized, even when zero
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue metric_value = 5;</code>
     * @return The metricValue.
     */
    @java.lang.Override
    public com.google.protobuf.DoubleValue getMetricValue() {
      return metricValue_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : metricValue_;
    }
    /**
     * <pre>
     * Copy of `value` that is ALWAYS serialized, even when zero
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue metric_value = 5;</code>
     */
    @java.lang.Override
    public com.google.protobuf.DoubleValueOrBuilder getMetricValueOrBuilder() {
      return metricValue_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : metricValue_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(group_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, group_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (java.lang.Double.doubleToRawLongBits(value_) != 0) {
        output.writeDouble(3, value_);
      }
      if (type_ != org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Type.GAUGE.getNumber()) {
        output.writeEnum(4, type_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(5, getMetricValue());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(group_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, group_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (java.lang.Double.doubleToRawLongBits(value_) != 0) {
        size += com.google.protobuf.CodedOutputStream
                .computeDoubleSize(3, value_);
      }
      if (type_ != org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Type.GAUGE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
                .computeEnumSize(4, type_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(5, getMetricValue());
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
      if (!(obj instanceof org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute)) {
        return super.equals(obj);
      }
      org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute other = (org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute) obj;

      if (!getGroup()
              .equals(other.getGroup())) return false;
      if (!getName()
              .equals(other.getName())) return false;
      if (java.lang.Double.doubleToLongBits(getValue())
              != java.lang.Double.doubleToLongBits(
              other.getValue())) return false;
      if (type_ != other.type_) return false;
      if (hasMetricValue() != other.hasMetricValue()) return false;
      if (hasMetricValue()) {
        if (!getMetricValue()
                .equals(other.getMetricValue())) return false;
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
      hash = (37 * hash) + GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getGroup().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
              java.lang.Double.doubleToLongBits(getValue()));
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      if (hasMetricValue()) {
        hash = (37 * hash) + METRIC_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getMetricValue().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute parseFrom(
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
    public static Builder newBuilder(org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute prototype) {
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
     * Protobuf type {@code NumericAttribute}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:NumericAttribute)
            org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttributeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_NumericAttribute_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_NumericAttribute_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.class, org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Builder.class);
      }

      // Construct using org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.newBuilder()
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
          getMetricValueFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        group_ = "";
        name_ = "";
        value_ = 0D;
        type_ = 0;
        metricValue_ = null;
        if (metricValueBuilder_ != null) {
          metricValueBuilder_.dispose();
          metricValueBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_NumericAttribute_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute getDefaultInstanceForType() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute build() {
        org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute buildPartial() {
        org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute result = new org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.group_ = group_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.name_ = name_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.value_ = value_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.type_ = type_;
        }
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.metricValue_ = metricValueBuilder_ == null
                  ? metricValue_
                  : metricValueBuilder_.build();
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
        if (other instanceof org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute) {
          return mergeFrom((org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute other) {
        if (other == org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.getDefaultInstance()) return this;
        if (!other.getGroup().isEmpty()) {
          group_ = other.group_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.getValue() != 0D) {
          setValue(other.getValue());
        }
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (other.hasMetricValue()) {
          mergeMetricValue(other.getMetricValue());
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
                group_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 25: {
                value_ = input.readDouble();
                bitField0_ |= 0x00000004;
                break;
              } // case 25
              case 32: {
                type_ = input.readEnum();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 42: {
                input.readMessage(
                        getMetricValueFieldBuilder().getBuilder(),
                        extensionRegistry);
                bitField0_ |= 0x00000010;
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

      private java.lang.Object group_ = "";
      /**
       * <code>string group = 1;</code>
       * @return The group.
       */
      public java.lang.String getGroup() {
        java.lang.Object ref = group_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          group_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string group = 1;</code>
       * @return The bytes for group.
       */
      public com.google.protobuf.ByteString
      getGroupBytes() {
        java.lang.Object ref = group_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          group_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string group = 1;</code>
       * @param value The group to set.
       * @return This builder for chaining.
       */
      public Builder setGroup(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        group_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string group = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroup() {
        group_ = getDefaultInstance().getGroup();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string group = 1;</code>
       * @param value The bytes for group to set.
       * @return This builder for chaining.
       */
      public Builder setGroupBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        group_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 2;</code>
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
       * <code>string name = 2;</code>
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
       * <code>string name = 2;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        name_ = getDefaultInstance().getName();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        name_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private double value_ ;
      /**
       * <code>double value = 3;</code>
       * @return The value.
       */
      @java.lang.Override
      public double getValue() {
        return value_;
      }
      /**
       * <code>double value = 3;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(double value) {

        value_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>double value = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000004);
        value_ = 0D;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.NumericAttribute.Type type = 4;</code>
       * @return The enum numeric value on the wire for type.
       */
      @java.lang.Override public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.NumericAttribute.Type type = 4;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>.NumericAttribute.Type type = 4;</code>
       * @return The type.
       */
      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Type getType() {
        org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Type result = org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Type.forNumber(type_);
        return result == null ? org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Type.UNRECOGNIZED : result;
      }
      /**
       * <code>.NumericAttribute.Type type = 4;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.NumericAttribute.Type type = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000008);
        type_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.DoubleValue metricValue_;
      private com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> metricValueBuilder_;
      /**
       * <pre>
       * Copy of `value` that is ALWAYS serialized, even when zero
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue metric_value = 5;</code>
       * @return Whether the metricValue field is set.
       */
      public boolean hasMetricValue() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       * Copy of `value` that is ALWAYS serialized, even when zero
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue metric_value = 5;</code>
       * @return The metricValue.
       */
      public com.google.protobuf.DoubleValue getMetricValue() {
        if (metricValueBuilder_ == null) {
          return metricValue_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : metricValue_;
        } else {
          return metricValueBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Copy of `value` that is ALWAYS serialized, even when zero
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue metric_value = 5;</code>
       */
      public Builder setMetricValue(com.google.protobuf.DoubleValue value) {
        if (metricValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metricValue_ = value;
        } else {
          metricValueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Copy of `value` that is ALWAYS serialized, even when zero
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue metric_value = 5;</code>
       */
      public Builder setMetricValue(
              com.google.protobuf.DoubleValue.Builder builderForValue) {
        if (metricValueBuilder_ == null) {
          metricValue_ = builderForValue.build();
        } else {
          metricValueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Copy of `value` that is ALWAYS serialized, even when zero
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue metric_value = 5;</code>
       */
      public Builder mergeMetricValue(com.google.protobuf.DoubleValue value) {
        if (metricValueBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0) &&
                  metricValue_ != null &&
                  metricValue_ != com.google.protobuf.DoubleValue.getDefaultInstance()) {
            getMetricValueBuilder().mergeFrom(value);
          } else {
            metricValue_ = value;
          }
        } else {
          metricValueBuilder_.mergeFrom(value);
        }
        if (metricValue_ != null) {
          bitField0_ |= 0x00000010;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       * Copy of `value` that is ALWAYS serialized, even when zero
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue metric_value = 5;</code>
       */
      public Builder clearMetricValue() {
        bitField0_ = (bitField0_ & ~0x00000010);
        metricValue_ = null;
        if (metricValueBuilder_ != null) {
          metricValueBuilder_.dispose();
          metricValueBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Copy of `value` that is ALWAYS serialized, even when zero
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue metric_value = 5;</code>
       */
      public com.google.protobuf.DoubleValue.Builder getMetricValueBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getMetricValueFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Copy of `value` that is ALWAYS serialized, even when zero
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue metric_value = 5;</code>
       */
      public com.google.protobuf.DoubleValueOrBuilder getMetricValueOrBuilder() {
        if (metricValueBuilder_ != null) {
          return metricValueBuilder_.getMessageOrBuilder();
        } else {
          return metricValue_ == null ?
                  com.google.protobuf.DoubleValue.getDefaultInstance() : metricValue_;
        }
      }
      /**
       * <pre>
       * Copy of `value` that is ALWAYS serialized, even when zero
       * </pre>
       *
       * <code>.google.protobuf.DoubleValue metric_value = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder>
      getMetricValueFieldBuilder() {
        if (metricValueBuilder_ == null) {
          metricValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                  com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder>(
                  getMetricValue(),
                  getParentForChildren(),
                  isClean());
          metricValue_ = null;
        }
        return metricValueBuilder_;
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


      // @@protoc_insertion_point(builder_scope:NumericAttribute)
    }

    // @@protoc_insertion_point(class_scope:NumericAttribute)
    private static final org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute();
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NumericAttribute>
            PARSER = new com.google.protobuf.AbstractParser<NumericAttribute>() {
      @java.lang.Override
      public NumericAttribute parsePartialFrom(
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

    public static com.google.protobuf.Parser<NumericAttribute> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NumericAttribute> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface NodeLevelResourceOrBuilder extends
          // @@protoc_insertion_point(interface_extends:NodeLevelResource)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 node_id = 1;</code>
     * @return The nodeId.
     */
    long getNodeId();

    /**
     * <code>string foreign_source = 2;</code>
     * @return The foreignSource.
     */
    java.lang.String getForeignSource();
    /**
     * <code>string foreign_source = 2;</code>
     * @return The bytes for foreignSource.
     */
    com.google.protobuf.ByteString
    getForeignSourceBytes();

    /**
     * <code>string foreign_id = 3;</code>
     * @return The foreignId.
     */
    java.lang.String getForeignId();
    /**
     * <code>string foreign_id = 3;</code>
     * @return The bytes for foreignId.
     */
    com.google.protobuf.ByteString
    getForeignIdBytes();

    /**
     * <code>string node_label = 4;</code>
     * @return The nodeLabel.
     */
    java.lang.String getNodeLabel();
    /**
     * <code>string node_label = 4;</code>
     * @return The bytes for nodeLabel.
     */
    com.google.protobuf.ByteString
    getNodeLabelBytes();

    /**
     * <code>string location = 5;</code>
     * @return The location.
     */
    java.lang.String getLocation();
    /**
     * <code>string location = 5;</code>
     * @return The bytes for location.
     */
    com.google.protobuf.ByteString
    getLocationBytes();
  }
  /**
   * Protobuf type {@code NodeLevelResource}
   */
  public static final class NodeLevelResource extends
          com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:NodeLevelResource)
          NodeLevelResourceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use NodeLevelResource.newBuilder() to construct.
    private NodeLevelResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NodeLevelResource() {
      foreignSource_ = "";
      foreignId_ = "";
      nodeLabel_ = "";
      location_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
      return new NodeLevelResource();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_NodeLevelResource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_NodeLevelResource_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.class, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.Builder.class);
    }

    public static final int NODE_ID_FIELD_NUMBER = 1;
    private long nodeId_ = 0L;
    /**
     * <code>int64 node_id = 1;</code>
     * @return The nodeId.
     */
    @java.lang.Override
    public long getNodeId() {
      return nodeId_;
    }

    public static final int FOREIGN_SOURCE_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object foreignSource_ = "";
    /**
     * <code>string foreign_source = 2;</code>
     * @return The foreignSource.
     */
    @java.lang.Override
    public java.lang.String getForeignSource() {
      java.lang.Object ref = foreignSource_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        foreignSource_ = s;
        return s;
      }
    }
    /**
     * <code>string foreign_source = 2;</code>
     * @return The bytes for foreignSource.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getForeignSourceBytes() {
      java.lang.Object ref = foreignSource_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        foreignSource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FOREIGN_ID_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object foreignId_ = "";
    /**
     * <code>string foreign_id = 3;</code>
     * @return The foreignId.
     */
    @java.lang.Override
    public java.lang.String getForeignId() {
      java.lang.Object ref = foreignId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        foreignId_ = s;
        return s;
      }
    }
    /**
     * <code>string foreign_id = 3;</code>
     * @return The bytes for foreignId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getForeignIdBytes() {
      java.lang.Object ref = foreignId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        foreignId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NODE_LABEL_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object nodeLabel_ = "";
    /**
     * <code>string node_label = 4;</code>
     * @return The nodeLabel.
     */
    @java.lang.Override
    public java.lang.String getNodeLabel() {
      java.lang.Object ref = nodeLabel_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nodeLabel_ = s;
        return s;
      }
    }
    /**
     * <code>string node_label = 4;</code>
     * @return The bytes for nodeLabel.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getNodeLabelBytes() {
      java.lang.Object ref = nodeLabel_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        nodeLabel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LOCATION_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private volatile java.lang.Object location_ = "";
    /**
     * <code>string location = 5;</code>
     * @return The location.
     */
    @java.lang.Override
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      }
    }
    /**
     * <code>string location = 5;</code>
     * @return The bytes for location.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        location_ = b;
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
      if (nodeId_ != 0L) {
        output.writeInt64(1, nodeId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(foreignSource_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, foreignSource_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(foreignId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, foreignId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nodeLabel_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, nodeLabel_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, location_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (nodeId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
                .computeInt64Size(1, nodeId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(foreignSource_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, foreignSource_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(foreignId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, foreignId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nodeLabel_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, nodeLabel_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, location_);
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
      if (!(obj instanceof org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource)) {
        return super.equals(obj);
      }
      org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource other = (org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource) obj;

      if (getNodeId()
              != other.getNodeId()) return false;
      if (!getForeignSource()
              .equals(other.getForeignSource())) return false;
      if (!getForeignId()
              .equals(other.getForeignId())) return false;
      if (!getNodeLabel()
              .equals(other.getNodeLabel())) return false;
      if (!getLocation()
              .equals(other.getLocation())) return false;
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
      hash = (37 * hash) + NODE_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
              getNodeId());
      hash = (37 * hash) + FOREIGN_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getForeignSource().hashCode();
      hash = (37 * hash) + FOREIGN_ID_FIELD_NUMBER;
      hash = (53 * hash) + getForeignId().hashCode();
      hash = (37 * hash) + NODE_LABEL_FIELD_NUMBER;
      hash = (53 * hash) + getNodeLabel().hashCode();
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocation().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource parseFrom(
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
    public static Builder newBuilder(org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource prototype) {
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
     * Protobuf type {@code NodeLevelResource}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:NodeLevelResource)
            org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_NodeLevelResource_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_NodeLevelResource_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.class, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.Builder.class);
      }

      // Construct using org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.newBuilder()
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
        nodeId_ = 0L;
        foreignSource_ = "";
        foreignId_ = "";
        nodeLabel_ = "";
        location_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_NodeLevelResource_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource getDefaultInstanceForType() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource build() {
        org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource buildPartial() {
        org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource result = new org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.nodeId_ = nodeId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.foreignSource_ = foreignSource_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.foreignId_ = foreignId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.nodeLabel_ = nodeLabel_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.location_ = location_;
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
        if (other instanceof org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource) {
          return mergeFrom((org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource other) {
        if (other == org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance()) return this;
        if (other.getNodeId() != 0L) {
          setNodeId(other.getNodeId());
        }
        if (!other.getForeignSource().isEmpty()) {
          foreignSource_ = other.foreignSource_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getForeignId().isEmpty()) {
          foreignId_ = other.foreignId_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (!other.getNodeLabel().isEmpty()) {
          nodeLabel_ = other.nodeLabel_;
          bitField0_ |= 0x00000008;
          onChanged();
        }
        if (!other.getLocation().isEmpty()) {
          location_ = other.location_;
          bitField0_ |= 0x00000010;
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
              case 8: {
                nodeId_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                foreignSource_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                foreignId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                nodeLabel_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              case 42: {
                location_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000010;
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

      private long nodeId_ ;
      /**
       * <code>int64 node_id = 1;</code>
       * @return The nodeId.
       */
      @java.lang.Override
      public long getNodeId() {
        return nodeId_;
      }
      /**
       * <code>int64 node_id = 1;</code>
       * @param value The nodeId to set.
       * @return This builder for chaining.
       */
      public Builder setNodeId(long value) {

        nodeId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int64 node_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearNodeId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        nodeId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object foreignSource_ = "";
      /**
       * <code>string foreign_source = 2;</code>
       * @return The foreignSource.
       */
      public java.lang.String getForeignSource() {
        java.lang.Object ref = foreignSource_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          foreignSource_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string foreign_source = 2;</code>
       * @return The bytes for foreignSource.
       */
      public com.google.protobuf.ByteString
      getForeignSourceBytes() {
        java.lang.Object ref = foreignSource_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          foreignSource_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string foreign_source = 2;</code>
       * @param value The foreignSource to set.
       * @return This builder for chaining.
       */
      public Builder setForeignSource(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        foreignSource_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string foreign_source = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearForeignSource() {
        foreignSource_ = getDefaultInstance().getForeignSource();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string foreign_source = 2;</code>
       * @param value The bytes for foreignSource to set.
       * @return This builder for chaining.
       */
      public Builder setForeignSourceBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        foreignSource_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object foreignId_ = "";
      /**
       * <code>string foreign_id = 3;</code>
       * @return The foreignId.
       */
      public java.lang.String getForeignId() {
        java.lang.Object ref = foreignId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          foreignId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string foreign_id = 3;</code>
       * @return The bytes for foreignId.
       */
      public com.google.protobuf.ByteString
      getForeignIdBytes() {
        java.lang.Object ref = foreignId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          foreignId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string foreign_id = 3;</code>
       * @param value The foreignId to set.
       * @return This builder for chaining.
       */
      public Builder setForeignId(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        foreignId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string foreign_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearForeignId() {
        foreignId_ = getDefaultInstance().getForeignId();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string foreign_id = 3;</code>
       * @param value The bytes for foreignId to set.
       * @return This builder for chaining.
       */
      public Builder setForeignIdBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        foreignId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private java.lang.Object nodeLabel_ = "";
      /**
       * <code>string node_label = 4;</code>
       * @return The nodeLabel.
       */
      public java.lang.String getNodeLabel() {
        java.lang.Object ref = nodeLabel_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nodeLabel_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string node_label = 4;</code>
       * @return The bytes for nodeLabel.
       */
      public com.google.protobuf.ByteString
      getNodeLabelBytes() {
        java.lang.Object ref = nodeLabel_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          nodeLabel_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string node_label = 4;</code>
       * @param value The nodeLabel to set.
       * @return This builder for chaining.
       */
      public Builder setNodeLabel(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        nodeLabel_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>string node_label = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearNodeLabel() {
        nodeLabel_ = getDefaultInstance().getNodeLabel();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>string node_label = 4;</code>
       * @param value The bytes for nodeLabel to set.
       * @return This builder for chaining.
       */
      public Builder setNodeLabelBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        nodeLabel_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }

      private java.lang.Object location_ = "";
      /**
       * <code>string location = 5;</code>
       * @return The location.
       */
      public java.lang.String getLocation() {
        java.lang.Object ref = location_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          location_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string location = 5;</code>
       * @return The bytes for location.
       */
      public com.google.protobuf.ByteString
      getLocationBytes() {
        java.lang.Object ref = location_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          location_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string location = 5;</code>
       * @param value The location to set.
       * @return This builder for chaining.
       */
      public Builder setLocation(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        location_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>string location = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLocation() {
        location_ = getDefaultInstance().getLocation();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }
      /**
       * <code>string location = 5;</code>
       * @param value The bytes for location to set.
       * @return This builder for chaining.
       */
      public Builder setLocationBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        location_ = value;
        bitField0_ |= 0x00000010;
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


      // @@protoc_insertion_point(builder_scope:NodeLevelResource)
    }

    // @@protoc_insertion_point(class_scope:NodeLevelResource)
    private static final org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource();
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NodeLevelResource>
            PARSER = new com.google.protobuf.AbstractParser<NodeLevelResource>() {
      @java.lang.Override
      public NodeLevelResource parsePartialFrom(
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

    public static com.google.protobuf.Parser<NodeLevelResource> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NodeLevelResource> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface InterfaceLevelResourceOrBuilder extends
          // @@protoc_insertion_point(interface_extends:InterfaceLevelResource)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.NodeLevelResource node = 1;</code>
     * @return Whether the node field is set.
     */
    boolean hasNode();
    /**
     * <code>.NodeLevelResource node = 1;</code>
     * @return The node.
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource getNode();
    /**
     * <code>.NodeLevelResource node = 1;</code>
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder getNodeOrBuilder();

    /**
     * <code>string instance = 2;</code>
     * @return The instance.
     */
    java.lang.String getInstance();
    /**
     * <code>string instance = 2;</code>
     * @return The bytes for instance.
     */
    com.google.protobuf.ByteString
    getInstanceBytes();

    /**
     * <code>int32 if_index = 3;</code>
     * @return The ifIndex.
     */
    int getIfIndex();
  }
  /**
   * Protobuf type {@code InterfaceLevelResource}
   */
  public static final class InterfaceLevelResource extends
          com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:InterfaceLevelResource)
          InterfaceLevelResourceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use InterfaceLevelResource.newBuilder() to construct.
    private InterfaceLevelResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InterfaceLevelResource() {
      instance_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
      return new InterfaceLevelResource();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_InterfaceLevelResource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_InterfaceLevelResource_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.class, org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.Builder.class);
    }

    private int bitField0_;
    public static final int NODE_FIELD_NUMBER = 1;
    private org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource node_;
    /**
     * <code>.NodeLevelResource node = 1;</code>
     * @return Whether the node field is set.
     */
    @java.lang.Override
    public boolean hasNode() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.NodeLevelResource node = 1;</code>
     * @return The node.
     */
    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource getNode() {
      return node_ == null ? org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance() : node_;
    }
    /**
     * <code>.NodeLevelResource node = 1;</code>
     */
    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder getNodeOrBuilder() {
      return node_ == null ? org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance() : node_;
    }

    public static final int INSTANCE_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object instance_ = "";
    /**
     * <code>string instance = 2;</code>
     * @return The instance.
     */
    @java.lang.Override
    public java.lang.String getInstance() {
      java.lang.Object ref = instance_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instance_ = s;
        return s;
      }
    }
    /**
     * <code>string instance = 2;</code>
     * @return The bytes for instance.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getInstanceBytes() {
      java.lang.Object ref = instance_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        instance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IF_INDEX_FIELD_NUMBER = 3;
    private int ifIndex_ = 0;
    /**
     * <code>int32 if_index = 3;</code>
     * @return The ifIndex.
     */
    @java.lang.Override
    public int getIfIndex() {
      return ifIndex_;
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
        output.writeMessage(1, getNode());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instance_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, instance_);
      }
      if (ifIndex_ != 0) {
        output.writeInt32(3, ifIndex_);
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
                .computeMessageSize(1, getNode());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instance_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, instance_);
      }
      if (ifIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
                .computeInt32Size(3, ifIndex_);
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
      if (!(obj instanceof org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource)) {
        return super.equals(obj);
      }
      org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource other = (org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource) obj;

      if (hasNode() != other.hasNode()) return false;
      if (hasNode()) {
        if (!getNode()
                .equals(other.getNode())) return false;
      }
      if (!getInstance()
              .equals(other.getInstance())) return false;
      if (getIfIndex()
              != other.getIfIndex()) return false;
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
      if (hasNode()) {
        hash = (37 * hash) + NODE_FIELD_NUMBER;
        hash = (53 * hash) + getNode().hashCode();
      }
      hash = (37 * hash) + INSTANCE_FIELD_NUMBER;
      hash = (53 * hash) + getInstance().hashCode();
      hash = (37 * hash) + IF_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIfIndex();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource parseFrom(
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
    public static Builder newBuilder(org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource prototype) {
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
     * Protobuf type {@code InterfaceLevelResource}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:InterfaceLevelResource)
            org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResourceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_InterfaceLevelResource_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_InterfaceLevelResource_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.class, org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.Builder.class);
      }

      // Construct using org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.newBuilder()
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
          getNodeFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        node_ = null;
        if (nodeBuilder_ != null) {
          nodeBuilder_.dispose();
          nodeBuilder_ = null;
        }
        instance_ = "";
        ifIndex_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_InterfaceLevelResource_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource getDefaultInstanceForType() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource build() {
        org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource buildPartial() {
        org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource result = new org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.node_ = nodeBuilder_ == null
                  ? node_
                  : nodeBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.instance_ = instance_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.ifIndex_ = ifIndex_;
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
        if (other instanceof org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource) {
          return mergeFrom((org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource other) {
        if (other == org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.getDefaultInstance()) return this;
        if (other.hasNode()) {
          mergeNode(other.getNode());
        }
        if (!other.getInstance().isEmpty()) {
          instance_ = other.instance_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.getIfIndex() != 0) {
          setIfIndex(other.getIfIndex());
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
                input.readMessage(
                        getNodeFieldBuilder().getBuilder(),
                        extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                instance_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 24: {
                ifIndex_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

      private org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource node_;
      private com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder> nodeBuilder_;
      /**
       * <code>.NodeLevelResource node = 1;</code>
       * @return Whether the node field is set.
       */
      public boolean hasNode() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       * @return The node.
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource getNode() {
        if (nodeBuilder_ == null) {
          return node_ == null ? org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance() : node_;
        } else {
          return nodeBuilder_.getMessage();
        }
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      public Builder setNode(org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource value) {
        if (nodeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          node_ = value;
        } else {
          nodeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      public Builder setNode(
              org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.Builder builderForValue) {
        if (nodeBuilder_ == null) {
          node_ = builderForValue.build();
        } else {
          nodeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      public Builder mergeNode(org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource value) {
        if (nodeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
                  node_ != null &&
                  node_ != org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance()) {
            getNodeBuilder().mergeFrom(value);
          } else {
            node_ = value;
          }
        } else {
          nodeBuilder_.mergeFrom(value);
        }
        if (node_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      public Builder clearNode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        node_ = null;
        if (nodeBuilder_ != null) {
          nodeBuilder_.dispose();
          nodeBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.Builder getNodeBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getNodeFieldBuilder().getBuilder();
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder getNodeOrBuilder() {
        if (nodeBuilder_ != null) {
          return nodeBuilder_.getMessageOrBuilder();
        } else {
          return node_ == null ?
                  org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance() : node_;
        }
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder>
      getNodeFieldBuilder() {
        if (nodeBuilder_ == null) {
          nodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                  org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder>(
                  getNode(),
                  getParentForChildren(),
                  isClean());
          node_ = null;
        }
        return nodeBuilder_;
      }

      private java.lang.Object instance_ = "";
      /**
       * <code>string instance = 2;</code>
       * @return The instance.
       */
      public java.lang.String getInstance() {
        java.lang.Object ref = instance_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          instance_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string instance = 2;</code>
       * @return The bytes for instance.
       */
      public com.google.protobuf.ByteString
      getInstanceBytes() {
        java.lang.Object ref = instance_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          instance_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string instance = 2;</code>
       * @param value The instance to set.
       * @return This builder for chaining.
       */
      public Builder setInstance(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        instance_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string instance = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearInstance() {
        instance_ = getDefaultInstance().getInstance();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string instance = 2;</code>
       * @param value The bytes for instance to set.
       * @return This builder for chaining.
       */
      public Builder setInstanceBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        instance_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private int ifIndex_ ;
      /**
       * <code>int32 if_index = 3;</code>
       * @return The ifIndex.
       */
      @java.lang.Override
      public int getIfIndex() {
        return ifIndex_;
      }
      /**
       * <code>int32 if_index = 3;</code>
       * @param value The ifIndex to set.
       * @return This builder for chaining.
       */
      public Builder setIfIndex(int value) {

        ifIndex_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>int32 if_index = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIfIndex() {
        bitField0_ = (bitField0_ & ~0x00000004);
        ifIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:InterfaceLevelResource)
    }

    // @@protoc_insertion_point(class_scope:InterfaceLevelResource)
    private static final org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource();
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InterfaceLevelResource>
            PARSER = new com.google.protobuf.AbstractParser<InterfaceLevelResource>() {
      @java.lang.Override
      public InterfaceLevelResource parsePartialFrom(
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

    public static com.google.protobuf.Parser<InterfaceLevelResource> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InterfaceLevelResource> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GenericTypeResourceOrBuilder extends
          // @@protoc_insertion_point(interface_extends:GenericTypeResource)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.NodeLevelResource node = 1;</code>
     * @return Whether the node field is set.
     */
    boolean hasNode();
    /**
     * <code>.NodeLevelResource node = 1;</code>
     * @return The node.
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource getNode();
    /**
     * <code>.NodeLevelResource node = 1;</code>
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder getNodeOrBuilder();

    /**
     * <code>string type = 2;</code>
     * @return The type.
     */
    java.lang.String getType();
    /**
     * <code>string type = 2;</code>
     * @return The bytes for type.
     */
    com.google.protobuf.ByteString
    getTypeBytes();

    /**
     * <code>string instance = 3;</code>
     * @return The instance.
     */
    java.lang.String getInstance();
    /**
     * <code>string instance = 3;</code>
     * @return The bytes for instance.
     */
    com.google.protobuf.ByteString
    getInstanceBytes();
  }
  /**
   * Protobuf type {@code GenericTypeResource}
   */
  public static final class GenericTypeResource extends
          com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:GenericTypeResource)
          GenericTypeResourceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use GenericTypeResource.newBuilder() to construct.
    private GenericTypeResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenericTypeResource() {
      type_ = "";
      instance_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
      return new GenericTypeResource();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_GenericTypeResource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_GenericTypeResource_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.class, org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.Builder.class);
    }

    private int bitField0_;
    public static final int NODE_FIELD_NUMBER = 1;
    private org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource node_;
    /**
     * <code>.NodeLevelResource node = 1;</code>
     * @return Whether the node field is set.
     */
    @java.lang.Override
    public boolean hasNode() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.NodeLevelResource node = 1;</code>
     * @return The node.
     */
    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource getNode() {
      return node_ == null ? org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance() : node_;
    }
    /**
     * <code>.NodeLevelResource node = 1;</code>
     */
    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder getNodeOrBuilder() {
      return node_ == null ? org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance() : node_;
    }

    public static final int TYPE_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object type_ = "";
    /**
     * <code>string type = 2;</code>
     * @return The type.
     */
    @java.lang.Override
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      }
    }
    /**
     * <code>string type = 2;</code>
     * @return The bytes for type.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int INSTANCE_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object instance_ = "";
    /**
     * <code>string instance = 3;</code>
     * @return The instance.
     */
    @java.lang.Override
    public java.lang.String getInstance() {
      java.lang.Object ref = instance_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instance_ = s;
        return s;
      }
    }
    /**
     * <code>string instance = 3;</code>
     * @return The bytes for instance.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getInstanceBytes() {
      java.lang.Object ref = instance_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        instance_ = b;
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
        output.writeMessage(1, getNode());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instance_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, instance_);
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
                .computeMessageSize(1, getNode());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instance_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, instance_);
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
      if (!(obj instanceof org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource)) {
        return super.equals(obj);
      }
      org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource other = (org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource) obj;

      if (hasNode() != other.hasNode()) return false;
      if (hasNode()) {
        if (!getNode()
                .equals(other.getNode())) return false;
      }
      if (!getType()
              .equals(other.getType())) return false;
      if (!getInstance()
              .equals(other.getInstance())) return false;
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
      if (hasNode()) {
        hash = (37 * hash) + NODE_FIELD_NUMBER;
        hash = (53 * hash) + getNode().hashCode();
      }
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType().hashCode();
      hash = (37 * hash) + INSTANCE_FIELD_NUMBER;
      hash = (53 * hash) + getInstance().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource parseFrom(
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
    public static Builder newBuilder(org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource prototype) {
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
     * Protobuf type {@code GenericTypeResource}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:GenericTypeResource)
            org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResourceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_GenericTypeResource_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_GenericTypeResource_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.class, org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.Builder.class);
      }

      // Construct using org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.newBuilder()
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
          getNodeFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        node_ = null;
        if (nodeBuilder_ != null) {
          nodeBuilder_.dispose();
          nodeBuilder_ = null;
        }
        type_ = "";
        instance_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_GenericTypeResource_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource getDefaultInstanceForType() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource build() {
        org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource buildPartial() {
        org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource result = new org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.node_ = nodeBuilder_ == null
                  ? node_
                  : nodeBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.type_ = type_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.instance_ = instance_;
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
        if (other instanceof org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource) {
          return mergeFrom((org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource other) {
        if (other == org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.getDefaultInstance()) return this;
        if (other.hasNode()) {
          mergeNode(other.getNode());
        }
        if (!other.getType().isEmpty()) {
          type_ = other.type_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getInstance().isEmpty()) {
          instance_ = other.instance_;
          bitField0_ |= 0x00000004;
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
                input.readMessage(
                        getNodeFieldBuilder().getBuilder(),
                        extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                type_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                instance_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

      private org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource node_;
      private com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder> nodeBuilder_;
      /**
       * <code>.NodeLevelResource node = 1;</code>
       * @return Whether the node field is set.
       */
      public boolean hasNode() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       * @return The node.
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource getNode() {
        if (nodeBuilder_ == null) {
          return node_ == null ? org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance() : node_;
        } else {
          return nodeBuilder_.getMessage();
        }
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      public Builder setNode(org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource value) {
        if (nodeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          node_ = value;
        } else {
          nodeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      public Builder setNode(
              org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.Builder builderForValue) {
        if (nodeBuilder_ == null) {
          node_ = builderForValue.build();
        } else {
          nodeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      public Builder mergeNode(org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource value) {
        if (nodeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
                  node_ != null &&
                  node_ != org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance()) {
            getNodeBuilder().mergeFrom(value);
          } else {
            node_ = value;
          }
        } else {
          nodeBuilder_.mergeFrom(value);
        }
        if (node_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      public Builder clearNode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        node_ = null;
        if (nodeBuilder_ != null) {
          nodeBuilder_.dispose();
          nodeBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.Builder getNodeBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getNodeFieldBuilder().getBuilder();
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder getNodeOrBuilder() {
        if (nodeBuilder_ != null) {
          return nodeBuilder_.getMessageOrBuilder();
        } else {
          return node_ == null ?
                  org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance() : node_;
        }
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder>
      getNodeFieldBuilder() {
        if (nodeBuilder_ == null) {
          nodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                  org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder>(
                  getNode(),
                  getParentForChildren(),
                  isClean());
          node_ = null;
        }
        return nodeBuilder_;
      }

      private java.lang.Object type_ = "";
      /**
       * <code>string type = 2;</code>
       * @return The type.
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          type_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string type = 2;</code>
       * @return The bytes for type.
       */
      public com.google.protobuf.ByteString
      getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string type = 2;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        type_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        type_ = getDefaultInstance().getType();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string type = 2;</code>
       * @param value The bytes for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        type_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object instance_ = "";
      /**
       * <code>string instance = 3;</code>
       * @return The instance.
       */
      public java.lang.String getInstance() {
        java.lang.Object ref = instance_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          instance_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string instance = 3;</code>
       * @return The bytes for instance.
       */
      public com.google.protobuf.ByteString
      getInstanceBytes() {
        java.lang.Object ref = instance_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          instance_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string instance = 3;</code>
       * @param value The instance to set.
       * @return This builder for chaining.
       */
      public Builder setInstance(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        instance_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string instance = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearInstance() {
        instance_ = getDefaultInstance().getInstance();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string instance = 3;</code>
       * @param value The bytes for instance to set.
       * @return This builder for chaining.
       */
      public Builder setInstanceBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        instance_ = value;
        bitField0_ |= 0x00000004;
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


      // @@protoc_insertion_point(builder_scope:GenericTypeResource)
    }

    // @@protoc_insertion_point(class_scope:GenericTypeResource)
    private static final org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource();
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GenericTypeResource>
            PARSER = new com.google.protobuf.AbstractParser<GenericTypeResource>() {
      @java.lang.Override
      public GenericTypeResource parsePartialFrom(
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

    public static com.google.protobuf.Parser<GenericTypeResource> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GenericTypeResource> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ResponseTimeResourceOrBuilder extends
          // @@protoc_insertion_point(interface_extends:ResponseTimeResource)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string instance = 1;</code>
     * @return The instance.
     */
    java.lang.String getInstance();
    /**
     * <code>string instance = 1;</code>
     * @return The bytes for instance.
     */
    com.google.protobuf.ByteString
    getInstanceBytes();

    /**
     * <code>string location = 2;</code>
     * @return The location.
     */
    java.lang.String getLocation();
    /**
     * <code>string location = 2;</code>
     * @return The bytes for location.
     */
    com.google.protobuf.ByteString
    getLocationBytes();
  }
  /**
   * Protobuf type {@code ResponseTimeResource}
   */
  public static final class ResponseTimeResource extends
          com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:ResponseTimeResource)
          ResponseTimeResourceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ResponseTimeResource.newBuilder() to construct.
    private ResponseTimeResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResponseTimeResource() {
      instance_ = "";
      location_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
      return new ResponseTimeResource();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_ResponseTimeResource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_ResponseTimeResource_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.class, org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.Builder.class);
    }

    public static final int INSTANCE_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object instance_ = "";
    /**
     * <code>string instance = 1;</code>
     * @return The instance.
     */
    @java.lang.Override
    public java.lang.String getInstance() {
      java.lang.Object ref = instance_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instance_ = s;
        return s;
      }
    }
    /**
     * <code>string instance = 1;</code>
     * @return The bytes for instance.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getInstanceBytes() {
      java.lang.Object ref = instance_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        instance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LOCATION_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object location_ = "";
    /**
     * <code>string location = 2;</code>
     * @return The location.
     */
    @java.lang.Override
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      }
    }
    /**
     * <code>string location = 2;</code>
     * @return The bytes for location.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        location_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instance_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, instance_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, location_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instance_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, instance_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, location_);
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
      if (!(obj instanceof org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource)) {
        return super.equals(obj);
      }
      org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource other = (org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource) obj;

      if (!getInstance()
              .equals(other.getInstance())) return false;
      if (!getLocation()
              .equals(other.getLocation())) return false;
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
      hash = (37 * hash) + INSTANCE_FIELD_NUMBER;
      hash = (53 * hash) + getInstance().hashCode();
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocation().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource parseFrom(
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
    public static Builder newBuilder(org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource prototype) {
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
     * Protobuf type {@code ResponseTimeResource}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:ResponseTimeResource)
            org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResourceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_ResponseTimeResource_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_ResponseTimeResource_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.class, org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.Builder.class);
      }

      // Construct using org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.newBuilder()
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
        instance_ = "";
        location_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_ResponseTimeResource_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource getDefaultInstanceForType() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource build() {
        org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource buildPartial() {
        org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource result = new org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.instance_ = instance_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.location_ = location_;
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
        if (other instanceof org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource) {
          return mergeFrom((org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource other) {
        if (other == org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.getDefaultInstance()) return this;
        if (!other.getInstance().isEmpty()) {
          instance_ = other.instance_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getLocation().isEmpty()) {
          location_ = other.location_;
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
                instance_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                location_ = input.readStringRequireUtf8();
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

      private java.lang.Object instance_ = "";
      /**
       * <code>string instance = 1;</code>
       * @return The instance.
       */
      public java.lang.String getInstance() {
        java.lang.Object ref = instance_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          instance_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string instance = 1;</code>
       * @return The bytes for instance.
       */
      public com.google.protobuf.ByteString
      getInstanceBytes() {
        java.lang.Object ref = instance_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          instance_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string instance = 1;</code>
       * @param value The instance to set.
       * @return This builder for chaining.
       */
      public Builder setInstance(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        instance_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string instance = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearInstance() {
        instance_ = getDefaultInstance().getInstance();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string instance = 1;</code>
       * @param value The bytes for instance to set.
       * @return This builder for chaining.
       */
      public Builder setInstanceBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        instance_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object location_ = "";
      /**
       * <code>string location = 2;</code>
       * @return The location.
       */
      public java.lang.String getLocation() {
        java.lang.Object ref = location_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          location_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string location = 2;</code>
       * @return The bytes for location.
       */
      public com.google.protobuf.ByteString
      getLocationBytes() {
        java.lang.Object ref = location_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          location_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string location = 2;</code>
       * @param value The location to set.
       * @return This builder for chaining.
       */
      public Builder setLocation(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        location_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string location = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLocation() {
        location_ = getDefaultInstance().getLocation();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string location = 2;</code>
       * @param value The bytes for location to set.
       * @return This builder for chaining.
       */
      public Builder setLocationBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        location_ = value;
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


      // @@protoc_insertion_point(builder_scope:ResponseTimeResource)
    }

    // @@protoc_insertion_point(class_scope:ResponseTimeResource)
    private static final org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource();
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResponseTimeResource>
            PARSER = new com.google.protobuf.AbstractParser<ResponseTimeResource>() {
      @java.lang.Override
      public ResponseTimeResource parsePartialFrom(
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

    public static com.google.protobuf.Parser<ResponseTimeResource> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResponseTimeResource> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CollectionSetResourceOrBuilder extends
          // @@protoc_insertion_point(interface_extends:CollectionSetResource)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.NodeLevelResource node = 1;</code>
     * @return Whether the node field is set.
     */
    boolean hasNode();
    /**
     * <code>.NodeLevelResource node = 1;</code>
     * @return The node.
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource getNode();
    /**
     * <code>.NodeLevelResource node = 1;</code>
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder getNodeOrBuilder();

    /**
     * <code>.InterfaceLevelResource interface = 2;</code>
     * @return Whether the interface field is set.
     */
    boolean hasInterface();
    /**
     * <code>.InterfaceLevelResource interface = 2;</code>
     * @return The interface.
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource getInterface();
    /**
     * <code>.InterfaceLevelResource interface = 2;</code>
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResourceOrBuilder getInterfaceOrBuilder();

    /**
     * <code>.GenericTypeResource generic = 3;</code>
     * @return Whether the generic field is set.
     */
    boolean hasGeneric();
    /**
     * <code>.GenericTypeResource generic = 3;</code>
     * @return The generic.
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource getGeneric();
    /**
     * <code>.GenericTypeResource generic = 3;</code>
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResourceOrBuilder getGenericOrBuilder();

    /**
     * <code>.ResponseTimeResource response = 4;</code>
     * @return Whether the response field is set.
     */
    boolean hasResponse();
    /**
     * <code>.ResponseTimeResource response = 4;</code>
     * @return The response.
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource getResponse();
    /**
     * <code>.ResponseTimeResource response = 4;</code>
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResourceOrBuilder getResponseOrBuilder();

    /**
     * <code>string resource_id = 5;</code>
     * @return The resourceId.
     */
    java.lang.String getResourceId();
    /**
     * <code>string resource_id = 5;</code>
     * @return The bytes for resourceId.
     */
    com.google.protobuf.ByteString
    getResourceIdBytes();

    /**
     * <code>string resource_name = 6;</code>
     * @return The resourceName.
     */
    java.lang.String getResourceName();
    /**
     * <code>string resource_name = 6;</code>
     * @return The bytes for resourceName.
     */
    com.google.protobuf.ByteString
    getResourceNameBytes();

    /**
     * <code>string resource_type_name = 7;</code>
     * @return The resourceTypeName.
     */
    java.lang.String getResourceTypeName();
    /**
     * <code>string resource_type_name = 7;</code>
     * @return The bytes for resourceTypeName.
     */
    com.google.protobuf.ByteString
    getResourceTypeNameBytes();

    /**
     * <code>repeated .StringAttribute string = 10;</code>
     */
    java.util.List<org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute>
    getStringList();
    /**
     * <code>repeated .StringAttribute string = 10;</code>
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute getString(int index);
    /**
     * <code>repeated .StringAttribute string = 10;</code>
     */
    int getStringCount();
    /**
     * <code>repeated .StringAttribute string = 10;</code>
     */
    java.util.List<? extends org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttributeOrBuilder>
    getStringOrBuilderList();
    /**
     * <code>repeated .StringAttribute string = 10;</code>
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttributeOrBuilder getStringOrBuilder(
            int index);

    /**
     * <code>repeated .NumericAttribute numeric = 11;</code>
     */
    java.util.List<org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute>
    getNumericList();
    /**
     * <code>repeated .NumericAttribute numeric = 11;</code>
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute getNumeric(int index);
    /**
     * <code>repeated .NumericAttribute numeric = 11;</code>
     */
    int getNumericCount();
    /**
     * <code>repeated .NumericAttribute numeric = 11;</code>
     */
    java.util.List<? extends org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttributeOrBuilder>
    getNumericOrBuilderList();
    /**
     * <code>repeated .NumericAttribute numeric = 11;</code>
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttributeOrBuilder getNumericOrBuilder(
            int index);

    org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.ResourceCase getResourceCase();
  }
  /**
   * Protobuf type {@code CollectionSetResource}
   */
  public static final class CollectionSetResource extends
          com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:CollectionSetResource)
          CollectionSetResourceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CollectionSetResource.newBuilder() to construct.
    private CollectionSetResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CollectionSetResource() {
      resourceId_ = "";
      resourceName_ = "";
      resourceTypeName_ = "";
      string_ = java.util.Collections.emptyList();
      numeric_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
      return new CollectionSetResource();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_CollectionSetResource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_CollectionSetResource_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.class, org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.Builder.class);
    }

    private int resourceCase_ = 0;
    @SuppressWarnings("serial")
    private java.lang.Object resource_;
    public enum ResourceCase
            implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      NODE(1),
      INTERFACE(2),
      GENERIC(3),
      RESPONSE(4),
      RESOURCE_NOT_SET(0);
      private final int value;
      private ResourceCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ResourceCase valueOf(int value) {
        return forNumber(value);
      }

      public static ResourceCase forNumber(int value) {
        switch (value) {
          case 1: return NODE;
          case 2: return INTERFACE;
          case 3: return GENERIC;
          case 4: return RESPONSE;
          case 0: return RESOURCE_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public ResourceCase
    getResourceCase() {
      return ResourceCase.forNumber(
              resourceCase_);
    }

    public static final int NODE_FIELD_NUMBER = 1;
    /**
     * <code>.NodeLevelResource node = 1;</code>
     * @return Whether the node field is set.
     */
    @java.lang.Override
    public boolean hasNode() {
      return resourceCase_ == 1;
    }
    /**
     * <code>.NodeLevelResource node = 1;</code>
     * @return The node.
     */
    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource getNode() {
      if (resourceCase_ == 1) {
        return (org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource) resource_;
      }
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance();
    }
    /**
     * <code>.NodeLevelResource node = 1;</code>
     */
    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder getNodeOrBuilder() {
      if (resourceCase_ == 1) {
        return (org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource) resource_;
      }
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance();
    }

    public static final int INTERFACE_FIELD_NUMBER = 2;
    /**
     * <code>.InterfaceLevelResource interface = 2;</code>
     * @return Whether the interface field is set.
     */
    @java.lang.Override
    public boolean hasInterface() {
      return resourceCase_ == 2;
    }
    /**
     * <code>.InterfaceLevelResource interface = 2;</code>
     * @return The interface.
     */
    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource getInterface() {
      if (resourceCase_ == 2) {
        return (org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource) resource_;
      }
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.getDefaultInstance();
    }
    /**
     * <code>.InterfaceLevelResource interface = 2;</code>
     */
    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResourceOrBuilder getInterfaceOrBuilder() {
      if (resourceCase_ == 2) {
        return (org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource) resource_;
      }
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.getDefaultInstance();
    }

    public static final int GENERIC_FIELD_NUMBER = 3;
    /**
     * <code>.GenericTypeResource generic = 3;</code>
     * @return Whether the generic field is set.
     */
    @java.lang.Override
    public boolean hasGeneric() {
      return resourceCase_ == 3;
    }
    /**
     * <code>.GenericTypeResource generic = 3;</code>
     * @return The generic.
     */
    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource getGeneric() {
      if (resourceCase_ == 3) {
        return (org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource) resource_;
      }
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.getDefaultInstance();
    }
    /**
     * <code>.GenericTypeResource generic = 3;</code>
     */
    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResourceOrBuilder getGenericOrBuilder() {
      if (resourceCase_ == 3) {
        return (org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource) resource_;
      }
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.getDefaultInstance();
    }

    public static final int RESPONSE_FIELD_NUMBER = 4;
    /**
     * <code>.ResponseTimeResource response = 4;</code>
     * @return Whether the response field is set.
     */
    @java.lang.Override
    public boolean hasResponse() {
      return resourceCase_ == 4;
    }
    /**
     * <code>.ResponseTimeResource response = 4;</code>
     * @return The response.
     */
    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource getResponse() {
      if (resourceCase_ == 4) {
        return (org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource) resource_;
      }
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.getDefaultInstance();
    }
    /**
     * <code>.ResponseTimeResource response = 4;</code>
     */
    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResourceOrBuilder getResponseOrBuilder() {
      if (resourceCase_ == 4) {
        return (org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource) resource_;
      }
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.getDefaultInstance();
    }

    public static final int RESOURCE_ID_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private volatile java.lang.Object resourceId_ = "";
    /**
     * <code>string resource_id = 5;</code>
     * @return The resourceId.
     */
    @java.lang.Override
    public java.lang.String getResourceId() {
      java.lang.Object ref = resourceId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceId_ = s;
        return s;
      }
    }
    /**
     * <code>string resource_id = 5;</code>
     * @return The bytes for resourceId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getResourceIdBytes() {
      java.lang.Object ref = resourceId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        resourceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RESOURCE_NAME_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private volatile java.lang.Object resourceName_ = "";
    /**
     * <code>string resource_name = 6;</code>
     * @return The resourceName.
     */
    @java.lang.Override
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      }
    }
    /**
     * <code>string resource_name = 6;</code>
     * @return The bytes for resourceName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RESOURCE_TYPE_NAME_FIELD_NUMBER = 7;
    @SuppressWarnings("serial")
    private volatile java.lang.Object resourceTypeName_ = "";
    /**
     * <code>string resource_type_name = 7;</code>
     * @return The resourceTypeName.
     */
    @java.lang.Override
    public java.lang.String getResourceTypeName() {
      java.lang.Object ref = resourceTypeName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceTypeName_ = s;
        return s;
      }
    }
    /**
     * <code>string resource_type_name = 7;</code>
     * @return The bytes for resourceTypeName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getResourceTypeNameBytes() {
      java.lang.Object ref = resourceTypeName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        resourceTypeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STRING_FIELD_NUMBER = 10;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute> string_;
    /**
     * <code>repeated .StringAttribute string = 10;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute> getStringList() {
      return string_;
    }
    /**
     * <code>repeated .StringAttribute string = 10;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttributeOrBuilder>
    getStringOrBuilderList() {
      return string_;
    }
    /**
     * <code>repeated .StringAttribute string = 10;</code>
     */
    @java.lang.Override
    public int getStringCount() {
      return string_.size();
    }
    /**
     * <code>repeated .StringAttribute string = 10;</code>
     */
    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute getString(int index) {
      return string_.get(index);
    }
    /**
     * <code>repeated .StringAttribute string = 10;</code>
     */
    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttributeOrBuilder getStringOrBuilder(
            int index) {
      return string_.get(index);
    }

    public static final int NUMERIC_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute> numeric_;
    /**
     * <code>repeated .NumericAttribute numeric = 11;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute> getNumericList() {
      return numeric_;
    }
    /**
     * <code>repeated .NumericAttribute numeric = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttributeOrBuilder>
    getNumericOrBuilderList() {
      return numeric_;
    }
    /**
     * <code>repeated .NumericAttribute numeric = 11;</code>
     */
    @java.lang.Override
    public int getNumericCount() {
      return numeric_.size();
    }
    /**
     * <code>repeated .NumericAttribute numeric = 11;</code>
     */
    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute getNumeric(int index) {
      return numeric_.get(index);
    }
    /**
     * <code>repeated .NumericAttribute numeric = 11;</code>
     */
    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttributeOrBuilder getNumericOrBuilder(
            int index) {
      return numeric_.get(index);
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
      if (resourceCase_ == 1) {
        output.writeMessage(1, (org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource) resource_);
      }
      if (resourceCase_ == 2) {
        output.writeMessage(2, (org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource) resource_);
      }
      if (resourceCase_ == 3) {
        output.writeMessage(3, (org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource) resource_);
      }
      if (resourceCase_ == 4) {
        output.writeMessage(4, (org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource) resource_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, resourceId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, resourceName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceTypeName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, resourceTypeName_);
      }
      for (int i = 0; i < string_.size(); i++) {
        output.writeMessage(10, string_.get(i));
      }
      for (int i = 0; i < numeric_.size(); i++) {
        output.writeMessage(11, numeric_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (resourceCase_ == 1) {
        size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(1, (org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource) resource_);
      }
      if (resourceCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(2, (org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource) resource_);
      }
      if (resourceCase_ == 3) {
        size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(3, (org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource) resource_);
      }
      if (resourceCase_ == 4) {
        size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(4, (org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource) resource_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, resourceId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, resourceName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceTypeName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, resourceTypeName_);
      }
      for (int i = 0; i < string_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(10, string_.get(i));
      }
      for (int i = 0; i < numeric_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(11, numeric_.get(i));
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
      if (!(obj instanceof org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource)) {
        return super.equals(obj);
      }
      org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource other = (org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource) obj;

      if (!getResourceId()
              .equals(other.getResourceId())) return false;
      if (!getResourceName()
              .equals(other.getResourceName())) return false;
      if (!getResourceTypeName()
              .equals(other.getResourceTypeName())) return false;
      if (!getStringList()
              .equals(other.getStringList())) return false;
      if (!getNumericList()
              .equals(other.getNumericList())) return false;
      if (!getResourceCase().equals(other.getResourceCase())) return false;
      switch (resourceCase_) {
        case 1:
          if (!getNode()
                  .equals(other.getNode())) return false;
          break;
        case 2:
          if (!getInterface()
                  .equals(other.getInterface())) return false;
          break;
        case 3:
          if (!getGeneric()
                  .equals(other.getGeneric())) return false;
          break;
        case 4:
          if (!getResponse()
                  .equals(other.getResponse())) return false;
          break;
        case 0:
        default:
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
      hash = (37 * hash) + RESOURCE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getResourceId().hashCode();
      hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getResourceName().hashCode();
      hash = (37 * hash) + RESOURCE_TYPE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getResourceTypeName().hashCode();
      if (getStringCount() > 0) {
        hash = (37 * hash) + STRING_FIELD_NUMBER;
        hash = (53 * hash) + getStringList().hashCode();
      }
      if (getNumericCount() > 0) {
        hash = (37 * hash) + NUMERIC_FIELD_NUMBER;
        hash = (53 * hash) + getNumericList().hashCode();
      }
      switch (resourceCase_) {
        case 1:
          hash = (37 * hash) + NODE_FIELD_NUMBER;
          hash = (53 * hash) + getNode().hashCode();
          break;
        case 2:
          hash = (37 * hash) + INTERFACE_FIELD_NUMBER;
          hash = (53 * hash) + getInterface().hashCode();
          break;
        case 3:
          hash = (37 * hash) + GENERIC_FIELD_NUMBER;
          hash = (53 * hash) + getGeneric().hashCode();
          break;
        case 4:
          hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
          hash = (53 * hash) + getResponse().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource parseFrom(
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
    public static Builder newBuilder(org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource prototype) {
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
     * Protobuf type {@code CollectionSetResource}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:CollectionSetResource)
            org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResourceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_CollectionSetResource_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_CollectionSetResource_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.class, org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.Builder.class);
      }

      // Construct using org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.newBuilder()
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
        if (nodeBuilder_ != null) {
          nodeBuilder_.clear();
        }
        if (interfaceBuilder_ != null) {
          interfaceBuilder_.clear();
        }
        if (genericBuilder_ != null) {
          genericBuilder_.clear();
        }
        if (responseBuilder_ != null) {
          responseBuilder_.clear();
        }
        resourceId_ = "";
        resourceName_ = "";
        resourceTypeName_ = "";
        if (stringBuilder_ == null) {
          string_ = java.util.Collections.emptyList();
        } else {
          string_ = null;
          stringBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000080);
        if (numericBuilder_ == null) {
          numeric_ = java.util.Collections.emptyList();
        } else {
          numeric_ = null;
          numericBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000100);
        resourceCase_ = 0;
        resource_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_CollectionSetResource_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource getDefaultInstanceForType() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource build() {
        org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource buildPartial() {
        org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource result = new org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        buildPartialOneofs(result);
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource result) {
        if (stringBuilder_ == null) {
          if (((bitField0_ & 0x00000080) != 0)) {
            string_ = java.util.Collections.unmodifiableList(string_);
            bitField0_ = (bitField0_ & ~0x00000080);
          }
          result.string_ = string_;
        } else {
          result.string_ = stringBuilder_.build();
        }
        if (numericBuilder_ == null) {
          if (((bitField0_ & 0x00000100) != 0)) {
            numeric_ = java.util.Collections.unmodifiableList(numeric_);
            bitField0_ = (bitField0_ & ~0x00000100);
          }
          result.numeric_ = numeric_;
        } else {
          result.numeric_ = numericBuilder_.build();
        }
      }

      private void buildPartial0(org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.resourceId_ = resourceId_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.resourceName_ = resourceName_;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.resourceTypeName_ = resourceTypeName_;
        }
      }

      private void buildPartialOneofs(org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource result) {
        result.resourceCase_ = resourceCase_;
        result.resource_ = this.resource_;
        if (resourceCase_ == 1 &&
                nodeBuilder_ != null) {
          result.resource_ = nodeBuilder_.build();
        }
        if (resourceCase_ == 2 &&
                interfaceBuilder_ != null) {
          result.resource_ = interfaceBuilder_.build();
        }
        if (resourceCase_ == 3 &&
                genericBuilder_ != null) {
          result.resource_ = genericBuilder_.build();
        }
        if (resourceCase_ == 4 &&
                responseBuilder_ != null) {
          result.resource_ = responseBuilder_.build();
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
        if (other instanceof org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource) {
          return mergeFrom((org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource other) {
        if (other == org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.getDefaultInstance()) return this;
        if (!other.getResourceId().isEmpty()) {
          resourceId_ = other.resourceId_;
          bitField0_ |= 0x00000010;
          onChanged();
        }
        if (!other.getResourceName().isEmpty()) {
          resourceName_ = other.resourceName_;
          bitField0_ |= 0x00000020;
          onChanged();
        }
        if (!other.getResourceTypeName().isEmpty()) {
          resourceTypeName_ = other.resourceTypeName_;
          bitField0_ |= 0x00000040;
          onChanged();
        }
        if (stringBuilder_ == null) {
          if (!other.string_.isEmpty()) {
            if (string_.isEmpty()) {
              string_ = other.string_;
              bitField0_ = (bitField0_ & ~0x00000080);
            } else {
              ensureStringIsMutable();
              string_.addAll(other.string_);
            }
            onChanged();
          }
        } else {
          if (!other.string_.isEmpty()) {
            if (stringBuilder_.isEmpty()) {
              stringBuilder_.dispose();
              stringBuilder_ = null;
              string_ = other.string_;
              bitField0_ = (bitField0_ & ~0x00000080);
              stringBuilder_ =
                      com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                              getStringFieldBuilder() : null;
            } else {
              stringBuilder_.addAllMessages(other.string_);
            }
          }
        }
        if (numericBuilder_ == null) {
          if (!other.numeric_.isEmpty()) {
            if (numeric_.isEmpty()) {
              numeric_ = other.numeric_;
              bitField0_ = (bitField0_ & ~0x00000100);
            } else {
              ensureNumericIsMutable();
              numeric_.addAll(other.numeric_);
            }
            onChanged();
          }
        } else {
          if (!other.numeric_.isEmpty()) {
            if (numericBuilder_.isEmpty()) {
              numericBuilder_.dispose();
              numericBuilder_ = null;
              numeric_ = other.numeric_;
              bitField0_ = (bitField0_ & ~0x00000100);
              numericBuilder_ =
                      com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                              getNumericFieldBuilder() : null;
            } else {
              numericBuilder_.addAllMessages(other.numeric_);
            }
          }
        }
        switch (other.getResourceCase()) {
          case NODE: {
            mergeNode(other.getNode());
            break;
          }
          case INTERFACE: {
            mergeInterface(other.getInterface());
            break;
          }
          case GENERIC: {
            mergeGeneric(other.getGeneric());
            break;
          }
          case RESPONSE: {
            mergeResponse(other.getResponse());
            break;
          }
          case RESOURCE_NOT_SET: {
            break;
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
                input.readMessage(
                        getNodeFieldBuilder().getBuilder(),
                        extensionRegistry);
                resourceCase_ = 1;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                        getInterfaceFieldBuilder().getBuilder(),
                        extensionRegistry);
                resourceCase_ = 2;
                break;
              } // case 18
              case 26: {
                input.readMessage(
                        getGenericFieldBuilder().getBuilder(),
                        extensionRegistry);
                resourceCase_ = 3;
                break;
              } // case 26
              case 34: {
                input.readMessage(
                        getResponseFieldBuilder().getBuilder(),
                        extensionRegistry);
                resourceCase_ = 4;
                break;
              } // case 34
              case 42: {
                resourceId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000010;
                break;
              } // case 42
              case 50: {
                resourceName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000020;
                break;
              } // case 50
              case 58: {
                resourceTypeName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000040;
                break;
              } // case 58
              case 82: {
                org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute m =
                        input.readMessage(
                                org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.parser(),
                                extensionRegistry);
                if (stringBuilder_ == null) {
                  ensureStringIsMutable();
                  string_.add(m);
                } else {
                  stringBuilder_.addMessage(m);
                }
                break;
              } // case 82
              case 90: {
                org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute m =
                        input.readMessage(
                                org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.parser(),
                                extensionRegistry);
                if (numericBuilder_ == null) {
                  ensureNumericIsMutable();
                  numeric_.add(m);
                } else {
                  numericBuilder_.addMessage(m);
                }
                break;
              } // case 90
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
      private int resourceCase_ = 0;
      private java.lang.Object resource_;
      public ResourceCase
      getResourceCase() {
        return ResourceCase.forNumber(
                resourceCase_);
      }

      public Builder clearResource() {
        resourceCase_ = 0;
        resource_ = null;
        onChanged();
        return this;
      }

      private int bitField0_;

      private com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder> nodeBuilder_;
      /**
       * <code>.NodeLevelResource node = 1;</code>
       * @return Whether the node field is set.
       */
      @java.lang.Override
      public boolean hasNode() {
        return resourceCase_ == 1;
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       * @return The node.
       */
      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource getNode() {
        if (nodeBuilder_ == null) {
          if (resourceCase_ == 1) {
            return (org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource) resource_;
          }
          return org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance();
        } else {
          if (resourceCase_ == 1) {
            return nodeBuilder_.getMessage();
          }
          return org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance();
        }
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      public Builder setNode(org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource value) {
        if (nodeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          resource_ = value;
          onChanged();
        } else {
          nodeBuilder_.setMessage(value);
        }
        resourceCase_ = 1;
        return this;
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      public Builder setNode(
              org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.Builder builderForValue) {
        if (nodeBuilder_ == null) {
          resource_ = builderForValue.build();
          onChanged();
        } else {
          nodeBuilder_.setMessage(builderForValue.build());
        }
        resourceCase_ = 1;
        return this;
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      public Builder mergeNode(org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource value) {
        if (nodeBuilder_ == null) {
          if (resourceCase_ == 1 &&
                  resource_ != org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance()) {
            resource_ = org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.newBuilder((org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource) resource_)
                    .mergeFrom(value).buildPartial();
          } else {
            resource_ = value;
          }
          onChanged();
        } else {
          if (resourceCase_ == 1) {
            nodeBuilder_.mergeFrom(value);
          } else {
            nodeBuilder_.setMessage(value);
          }
        }
        resourceCase_ = 1;
        return this;
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      public Builder clearNode() {
        if (nodeBuilder_ == null) {
          if (resourceCase_ == 1) {
            resourceCase_ = 0;
            resource_ = null;
            onChanged();
          }
        } else {
          if (resourceCase_ == 1) {
            resourceCase_ = 0;
            resource_ = null;
          }
          nodeBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.Builder getNodeBuilder() {
        return getNodeFieldBuilder().getBuilder();
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder getNodeOrBuilder() {
        if ((resourceCase_ == 1) && (nodeBuilder_ != null)) {
          return nodeBuilder_.getMessageOrBuilder();
        } else {
          if (resourceCase_ == 1) {
            return (org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource) resource_;
          }
          return org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance();
        }
      }
      /**
       * <code>.NodeLevelResource node = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder>
      getNodeFieldBuilder() {
        if (nodeBuilder_ == null) {
          if (!(resourceCase_ == 1)) {
            resource_ = org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.getDefaultInstance();
          }
          nodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                  org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResourceOrBuilder>(
                  (org.opennms.features.kafka.producer.model.CollectionSetProtos.NodeLevelResource) resource_,
                  getParentForChildren(),
                  isClean());
          resource_ = null;
        }
        resourceCase_ = 1;
        onChanged();
        return nodeBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResourceOrBuilder> interfaceBuilder_;
      /**
       * <code>.InterfaceLevelResource interface = 2;</code>
       * @return Whether the interface field is set.
       */
      @java.lang.Override
      public boolean hasInterface() {
        return resourceCase_ == 2;
      }
      /**
       * <code>.InterfaceLevelResource interface = 2;</code>
       * @return The interface.
       */
      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource getInterface() {
        if (interfaceBuilder_ == null) {
          if (resourceCase_ == 2) {
            return (org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource) resource_;
          }
          return org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.getDefaultInstance();
        } else {
          if (resourceCase_ == 2) {
            return interfaceBuilder_.getMessage();
          }
          return org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.getDefaultInstance();
        }
      }
      /**
       * <code>.InterfaceLevelResource interface = 2;</code>
       */
      public Builder setInterface(org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource value) {
        if (interfaceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          resource_ = value;
          onChanged();
        } else {
          interfaceBuilder_.setMessage(value);
        }
        resourceCase_ = 2;
        return this;
      }
      /**
       * <code>.InterfaceLevelResource interface = 2;</code>
       */
      public Builder setInterface(
              org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.Builder builderForValue) {
        if (interfaceBuilder_ == null) {
          resource_ = builderForValue.build();
          onChanged();
        } else {
          interfaceBuilder_.setMessage(builderForValue.build());
        }
        resourceCase_ = 2;
        return this;
      }
      /**
       * <code>.InterfaceLevelResource interface = 2;</code>
       */
      public Builder mergeInterface(org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource value) {
        if (interfaceBuilder_ == null) {
          if (resourceCase_ == 2 &&
                  resource_ != org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.getDefaultInstance()) {
            resource_ = org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.newBuilder((org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource) resource_)
                    .mergeFrom(value).buildPartial();
          } else {
            resource_ = value;
          }
          onChanged();
        } else {
          if (resourceCase_ == 2) {
            interfaceBuilder_.mergeFrom(value);
          } else {
            interfaceBuilder_.setMessage(value);
          }
        }
        resourceCase_ = 2;
        return this;
      }
      /**
       * <code>.InterfaceLevelResource interface = 2;</code>
       */
      public Builder clearInterface() {
        if (interfaceBuilder_ == null) {
          if (resourceCase_ == 2) {
            resourceCase_ = 0;
            resource_ = null;
            onChanged();
          }
        } else {
          if (resourceCase_ == 2) {
            resourceCase_ = 0;
            resource_ = null;
          }
          interfaceBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.InterfaceLevelResource interface = 2;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.Builder getInterfaceBuilder() {
        return getInterfaceFieldBuilder().getBuilder();
      }
      /**
       * <code>.InterfaceLevelResource interface = 2;</code>
       */
      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResourceOrBuilder getInterfaceOrBuilder() {
        if ((resourceCase_ == 2) && (interfaceBuilder_ != null)) {
          return interfaceBuilder_.getMessageOrBuilder();
        } else {
          if (resourceCase_ == 2) {
            return (org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource) resource_;
          }
          return org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.getDefaultInstance();
        }
      }
      /**
       * <code>.InterfaceLevelResource interface = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResourceOrBuilder>
      getInterfaceFieldBuilder() {
        if (interfaceBuilder_ == null) {
          if (!(resourceCase_ == 2)) {
            resource_ = org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.getDefaultInstance();
          }
          interfaceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                  org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResourceOrBuilder>(
                  (org.opennms.features.kafka.producer.model.CollectionSetProtos.InterfaceLevelResource) resource_,
                  getParentForChildren(),
                  isClean());
          resource_ = null;
        }
        resourceCase_ = 2;
        onChanged();
        return interfaceBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResourceOrBuilder> genericBuilder_;
      /**
       * <code>.GenericTypeResource generic = 3;</code>
       * @return Whether the generic field is set.
       */
      @java.lang.Override
      public boolean hasGeneric() {
        return resourceCase_ == 3;
      }
      /**
       * <code>.GenericTypeResource generic = 3;</code>
       * @return The generic.
       */
      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource getGeneric() {
        if (genericBuilder_ == null) {
          if (resourceCase_ == 3) {
            return (org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource) resource_;
          }
          return org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.getDefaultInstance();
        } else {
          if (resourceCase_ == 3) {
            return genericBuilder_.getMessage();
          }
          return org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.getDefaultInstance();
        }
      }
      /**
       * <code>.GenericTypeResource generic = 3;</code>
       */
      public Builder setGeneric(org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource value) {
        if (genericBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          resource_ = value;
          onChanged();
        } else {
          genericBuilder_.setMessage(value);
        }
        resourceCase_ = 3;
        return this;
      }
      /**
       * <code>.GenericTypeResource generic = 3;</code>
       */
      public Builder setGeneric(
              org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.Builder builderForValue) {
        if (genericBuilder_ == null) {
          resource_ = builderForValue.build();
          onChanged();
        } else {
          genericBuilder_.setMessage(builderForValue.build());
        }
        resourceCase_ = 3;
        return this;
      }
      /**
       * <code>.GenericTypeResource generic = 3;</code>
       */
      public Builder mergeGeneric(org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource value) {
        if (genericBuilder_ == null) {
          if (resourceCase_ == 3 &&
                  resource_ != org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.getDefaultInstance()) {
            resource_ = org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.newBuilder((org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource) resource_)
                    .mergeFrom(value).buildPartial();
          } else {
            resource_ = value;
          }
          onChanged();
        } else {
          if (resourceCase_ == 3) {
            genericBuilder_.mergeFrom(value);
          } else {
            genericBuilder_.setMessage(value);
          }
        }
        resourceCase_ = 3;
        return this;
      }
      /**
       * <code>.GenericTypeResource generic = 3;</code>
       */
      public Builder clearGeneric() {
        if (genericBuilder_ == null) {
          if (resourceCase_ == 3) {
            resourceCase_ = 0;
            resource_ = null;
            onChanged();
          }
        } else {
          if (resourceCase_ == 3) {
            resourceCase_ = 0;
            resource_ = null;
          }
          genericBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.GenericTypeResource generic = 3;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.Builder getGenericBuilder() {
        return getGenericFieldBuilder().getBuilder();
      }
      /**
       * <code>.GenericTypeResource generic = 3;</code>
       */
      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResourceOrBuilder getGenericOrBuilder() {
        if ((resourceCase_ == 3) && (genericBuilder_ != null)) {
          return genericBuilder_.getMessageOrBuilder();
        } else {
          if (resourceCase_ == 3) {
            return (org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource) resource_;
          }
          return org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.getDefaultInstance();
        }
      }
      /**
       * <code>.GenericTypeResource generic = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResourceOrBuilder>
      getGenericFieldBuilder() {
        if (genericBuilder_ == null) {
          if (!(resourceCase_ == 3)) {
            resource_ = org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.getDefaultInstance();
          }
          genericBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                  org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResourceOrBuilder>(
                  (org.opennms.features.kafka.producer.model.CollectionSetProtos.GenericTypeResource) resource_,
                  getParentForChildren(),
                  isClean());
          resource_ = null;
        }
        resourceCase_ = 3;
        onChanged();
        return genericBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResourceOrBuilder> responseBuilder_;
      /**
       * <code>.ResponseTimeResource response = 4;</code>
       * @return Whether the response field is set.
       */
      @java.lang.Override
      public boolean hasResponse() {
        return resourceCase_ == 4;
      }
      /**
       * <code>.ResponseTimeResource response = 4;</code>
       * @return The response.
       */
      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource getResponse() {
        if (responseBuilder_ == null) {
          if (resourceCase_ == 4) {
            return (org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource) resource_;
          }
          return org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.getDefaultInstance();
        } else {
          if (resourceCase_ == 4) {
            return responseBuilder_.getMessage();
          }
          return org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseTimeResource response = 4;</code>
       */
      public Builder setResponse(org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource value) {
        if (responseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          resource_ = value;
          onChanged();
        } else {
          responseBuilder_.setMessage(value);
        }
        resourceCase_ = 4;
        return this;
      }
      /**
       * <code>.ResponseTimeResource response = 4;</code>
       */
      public Builder setResponse(
              org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.Builder builderForValue) {
        if (responseBuilder_ == null) {
          resource_ = builderForValue.build();
          onChanged();
        } else {
          responseBuilder_.setMessage(builderForValue.build());
        }
        resourceCase_ = 4;
        return this;
      }
      /**
       * <code>.ResponseTimeResource response = 4;</code>
       */
      public Builder mergeResponse(org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource value) {
        if (responseBuilder_ == null) {
          if (resourceCase_ == 4 &&
                  resource_ != org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.getDefaultInstance()) {
            resource_ = org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.newBuilder((org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource) resource_)
                    .mergeFrom(value).buildPartial();
          } else {
            resource_ = value;
          }
          onChanged();
        } else {
          if (resourceCase_ == 4) {
            responseBuilder_.mergeFrom(value);
          } else {
            responseBuilder_.setMessage(value);
          }
        }
        resourceCase_ = 4;
        return this;
      }
      /**
       * <code>.ResponseTimeResource response = 4;</code>
       */
      public Builder clearResponse() {
        if (responseBuilder_ == null) {
          if (resourceCase_ == 4) {
            resourceCase_ = 0;
            resource_ = null;
            onChanged();
          }
        } else {
          if (resourceCase_ == 4) {
            resourceCase_ = 0;
            resource_ = null;
          }
          responseBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.ResponseTimeResource response = 4;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.Builder getResponseBuilder() {
        return getResponseFieldBuilder().getBuilder();
      }
      /**
       * <code>.ResponseTimeResource response = 4;</code>
       */
      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResourceOrBuilder getResponseOrBuilder() {
        if ((resourceCase_ == 4) && (responseBuilder_ != null)) {
          return responseBuilder_.getMessageOrBuilder();
        } else {
          if (resourceCase_ == 4) {
            return (org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource) resource_;
          }
          return org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseTimeResource response = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResourceOrBuilder>
      getResponseFieldBuilder() {
        if (responseBuilder_ == null) {
          if (!(resourceCase_ == 4)) {
            resource_ = org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.getDefaultInstance();
          }
          responseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                  org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResourceOrBuilder>(
                  (org.opennms.features.kafka.producer.model.CollectionSetProtos.ResponseTimeResource) resource_,
                  getParentForChildren(),
                  isClean());
          resource_ = null;
        }
        resourceCase_ = 4;
        onChanged();
        return responseBuilder_;
      }

      private java.lang.Object resourceId_ = "";
      /**
       * <code>string resource_id = 5;</code>
       * @return The resourceId.
       */
      public java.lang.String getResourceId() {
        java.lang.Object ref = resourceId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          resourceId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string resource_id = 5;</code>
       * @return The bytes for resourceId.
       */
      public com.google.protobuf.ByteString
      getResourceIdBytes() {
        java.lang.Object ref = resourceId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          resourceId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string resource_id = 5;</code>
       * @param value The resourceId to set.
       * @return This builder for chaining.
       */
      public Builder setResourceId(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        resourceId_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>string resource_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearResourceId() {
        resourceId_ = getDefaultInstance().getResourceId();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }
      /**
       * <code>string resource_id = 5;</code>
       * @param value The bytes for resourceId to set.
       * @return This builder for chaining.
       */
      public Builder setResourceIdBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        resourceId_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }

      private java.lang.Object resourceName_ = "";
      /**
       * <code>string resource_name = 6;</code>
       * @return The resourceName.
       */
      public java.lang.String getResourceName() {
        java.lang.Object ref = resourceName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          resourceName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string resource_name = 6;</code>
       * @return The bytes for resourceName.
       */
      public com.google.protobuf.ByteString
      getResourceNameBytes() {
        java.lang.Object ref = resourceName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          resourceName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string resource_name = 6;</code>
       * @param value The resourceName to set.
       * @return This builder for chaining.
       */
      public Builder setResourceName(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        resourceName_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>string resource_name = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearResourceName() {
        resourceName_ = getDefaultInstance().getResourceName();
        bitField0_ = (bitField0_ & ~0x00000020);
        onChanged();
        return this;
      }
      /**
       * <code>string resource_name = 6;</code>
       * @param value The bytes for resourceName to set.
       * @return This builder for chaining.
       */
      public Builder setResourceNameBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        resourceName_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }

      private java.lang.Object resourceTypeName_ = "";
      /**
       * <code>string resource_type_name = 7;</code>
       * @return The resourceTypeName.
       */
      public java.lang.String getResourceTypeName() {
        java.lang.Object ref = resourceTypeName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          resourceTypeName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string resource_type_name = 7;</code>
       * @return The bytes for resourceTypeName.
       */
      public com.google.protobuf.ByteString
      getResourceTypeNameBytes() {
        java.lang.Object ref = resourceTypeName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          resourceTypeName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string resource_type_name = 7;</code>
       * @param value The resourceTypeName to set.
       * @return This builder for chaining.
       */
      public Builder setResourceTypeName(
              java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        resourceTypeName_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <code>string resource_type_name = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearResourceTypeName() {
        resourceTypeName_ = getDefaultInstance().getResourceTypeName();
        bitField0_ = (bitField0_ & ~0x00000040);
        onChanged();
        return this;
      }
      /**
       * <code>string resource_type_name = 7;</code>
       * @param value The bytes for resourceTypeName to set.
       * @return This builder for chaining.
       */
      public Builder setResourceTypeNameBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        resourceTypeName_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }

      private java.util.List<org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute> string_ =
              java.util.Collections.emptyList();
      private void ensureStringIsMutable() {
        if (!((bitField0_ & 0x00000080) != 0)) {
          string_ = new java.util.ArrayList<org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute>(string_);
          bitField0_ |= 0x00000080;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute, org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttributeOrBuilder> stringBuilder_;

      /**
       * <code>repeated .StringAttribute string = 10;</code>
       */
      public java.util.List<org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute> getStringList() {
        if (stringBuilder_ == null) {
          return java.util.Collections.unmodifiableList(string_);
        } else {
          return stringBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .StringAttribute string = 10;</code>
       */
      public int getStringCount() {
        if (stringBuilder_ == null) {
          return string_.size();
        } else {
          return stringBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .StringAttribute string = 10;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute getString(int index) {
        if (stringBuilder_ == null) {
          return string_.get(index);
        } else {
          return stringBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .StringAttribute string = 10;</code>
       */
      public Builder setString(
              int index, org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute value) {
        if (stringBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStringIsMutable();
          string_.set(index, value);
          onChanged();
        } else {
          stringBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .StringAttribute string = 10;</code>
       */
      public Builder setString(
              int index, org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.Builder builderForValue) {
        if (stringBuilder_ == null) {
          ensureStringIsMutable();
          string_.set(index, builderForValue.build());
          onChanged();
        } else {
          stringBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .StringAttribute string = 10;</code>
       */
      public Builder addString(org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute value) {
        if (stringBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStringIsMutable();
          string_.add(value);
          onChanged();
        } else {
          stringBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .StringAttribute string = 10;</code>
       */
      public Builder addString(
              int index, org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute value) {
        if (stringBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStringIsMutable();
          string_.add(index, value);
          onChanged();
        } else {
          stringBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .StringAttribute string = 10;</code>
       */
      public Builder addString(
              org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.Builder builderForValue) {
        if (stringBuilder_ == null) {
          ensureStringIsMutable();
          string_.add(builderForValue.build());
          onChanged();
        } else {
          stringBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .StringAttribute string = 10;</code>
       */
      public Builder addString(
              int index, org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.Builder builderForValue) {
        if (stringBuilder_ == null) {
          ensureStringIsMutable();
          string_.add(index, builderForValue.build());
          onChanged();
        } else {
          stringBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .StringAttribute string = 10;</code>
       */
      public Builder addAllString(
              java.lang.Iterable<? extends org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute> values) {
        if (stringBuilder_ == null) {
          ensureStringIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
                  values, string_);
          onChanged();
        } else {
          stringBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .StringAttribute string = 10;</code>
       */
      public Builder clearString() {
        if (stringBuilder_ == null) {
          string_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000080);
          onChanged();
        } else {
          stringBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .StringAttribute string = 10;</code>
       */
      public Builder removeString(int index) {
        if (stringBuilder_ == null) {
          ensureStringIsMutable();
          string_.remove(index);
          onChanged();
        } else {
          stringBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .StringAttribute string = 10;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.Builder getStringBuilder(
              int index) {
        return getStringFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .StringAttribute string = 10;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttributeOrBuilder getStringOrBuilder(
              int index) {
        if (stringBuilder_ == null) {
          return string_.get(index);  } else {
          return stringBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .StringAttribute string = 10;</code>
       */
      public java.util.List<? extends org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttributeOrBuilder>
      getStringOrBuilderList() {
        if (stringBuilder_ != null) {
          return stringBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(string_);
        }
      }
      /**
       * <code>repeated .StringAttribute string = 10;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.Builder addStringBuilder() {
        return getStringFieldBuilder().addBuilder(
                org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.getDefaultInstance());
      }
      /**
       * <code>repeated .StringAttribute string = 10;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.Builder addStringBuilder(
              int index) {
        return getStringFieldBuilder().addBuilder(
                index, org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.getDefaultInstance());
      }
      /**
       * <code>repeated .StringAttribute string = 10;</code>
       */
      public java.util.List<org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.Builder>
      getStringBuilderList() {
        return getStringFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute, org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttributeOrBuilder>
      getStringFieldBuilder() {
        if (stringBuilder_ == null) {
          stringBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                  org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute, org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttribute.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.StringAttributeOrBuilder>(
                  string_,
                  ((bitField0_ & 0x00000080) != 0),
                  getParentForChildren(),
                  isClean());
          string_ = null;
        }
        return stringBuilder_;
      }

      private java.util.List<org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute> numeric_ =
              java.util.Collections.emptyList();
      private void ensureNumericIsMutable() {
        if (!((bitField0_ & 0x00000100) != 0)) {
          numeric_ = new java.util.ArrayList<org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute>(numeric_);
          bitField0_ |= 0x00000100;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute, org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttributeOrBuilder> numericBuilder_;

      /**
       * <code>repeated .NumericAttribute numeric = 11;</code>
       */
      public java.util.List<org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute> getNumericList() {
        if (numericBuilder_ == null) {
          return java.util.Collections.unmodifiableList(numeric_);
        } else {
          return numericBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .NumericAttribute numeric = 11;</code>
       */
      public int getNumericCount() {
        if (numericBuilder_ == null) {
          return numeric_.size();
        } else {
          return numericBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .NumericAttribute numeric = 11;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute getNumeric(int index) {
        if (numericBuilder_ == null) {
          return numeric_.get(index);
        } else {
          return numericBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .NumericAttribute numeric = 11;</code>
       */
      public Builder setNumeric(
              int index, org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute value) {
        if (numericBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNumericIsMutable();
          numeric_.set(index, value);
          onChanged();
        } else {
          numericBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .NumericAttribute numeric = 11;</code>
       */
      public Builder setNumeric(
              int index, org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Builder builderForValue) {
        if (numericBuilder_ == null) {
          ensureNumericIsMutable();
          numeric_.set(index, builderForValue.build());
          onChanged();
        } else {
          numericBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .NumericAttribute numeric = 11;</code>
       */
      public Builder addNumeric(org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute value) {
        if (numericBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNumericIsMutable();
          numeric_.add(value);
          onChanged();
        } else {
          numericBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .NumericAttribute numeric = 11;</code>
       */
      public Builder addNumeric(
              int index, org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute value) {
        if (numericBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNumericIsMutable();
          numeric_.add(index, value);
          onChanged();
        } else {
          numericBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .NumericAttribute numeric = 11;</code>
       */
      public Builder addNumeric(
              org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Builder builderForValue) {
        if (numericBuilder_ == null) {
          ensureNumericIsMutable();
          numeric_.add(builderForValue.build());
          onChanged();
        } else {
          numericBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .NumericAttribute numeric = 11;</code>
       */
      public Builder addNumeric(
              int index, org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Builder builderForValue) {
        if (numericBuilder_ == null) {
          ensureNumericIsMutable();
          numeric_.add(index, builderForValue.build());
          onChanged();
        } else {
          numericBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .NumericAttribute numeric = 11;</code>
       */
      public Builder addAllNumeric(
              java.lang.Iterable<? extends org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute> values) {
        if (numericBuilder_ == null) {
          ensureNumericIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
                  values, numeric_);
          onChanged();
        } else {
          numericBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .NumericAttribute numeric = 11;</code>
       */
      public Builder clearNumeric() {
        if (numericBuilder_ == null) {
          numeric_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000100);
          onChanged();
        } else {
          numericBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .NumericAttribute numeric = 11;</code>
       */
      public Builder removeNumeric(int index) {
        if (numericBuilder_ == null) {
          ensureNumericIsMutable();
          numeric_.remove(index);
          onChanged();
        } else {
          numericBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .NumericAttribute numeric = 11;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Builder getNumericBuilder(
              int index) {
        return getNumericFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .NumericAttribute numeric = 11;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttributeOrBuilder getNumericOrBuilder(
              int index) {
        if (numericBuilder_ == null) {
          return numeric_.get(index);  } else {
          return numericBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .NumericAttribute numeric = 11;</code>
       */
      public java.util.List<? extends org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttributeOrBuilder>
      getNumericOrBuilderList() {
        if (numericBuilder_ != null) {
          return numericBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(numeric_);
        }
      }
      /**
       * <code>repeated .NumericAttribute numeric = 11;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Builder addNumericBuilder() {
        return getNumericFieldBuilder().addBuilder(
                org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.getDefaultInstance());
      }
      /**
       * <code>repeated .NumericAttribute numeric = 11;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Builder addNumericBuilder(
              int index) {
        return getNumericFieldBuilder().addBuilder(
                index, org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.getDefaultInstance());
      }
      /**
       * <code>repeated .NumericAttribute numeric = 11;</code>
       */
      public java.util.List<org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Builder>
      getNumericBuilderList() {
        return getNumericFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute, org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttributeOrBuilder>
      getNumericFieldBuilder() {
        if (numericBuilder_ == null) {
          numericBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                  org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute, org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttribute.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.NumericAttributeOrBuilder>(
                  numeric_,
                  ((bitField0_ & 0x00000100) != 0),
                  getParentForChildren(),
                  isClean());
          numeric_ = null;
        }
        return numericBuilder_;
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


      // @@protoc_insertion_point(builder_scope:CollectionSetResource)
    }

    // @@protoc_insertion_point(class_scope:CollectionSetResource)
    private static final org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource();
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CollectionSetResource>
            PARSER = new com.google.protobuf.AbstractParser<CollectionSetResource>() {
      @java.lang.Override
      public CollectionSetResource parsePartialFrom(
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

    public static com.google.protobuf.Parser<CollectionSetResource> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CollectionSetResource> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CollectionSetOrBuilder extends
          // @@protoc_insertion_point(interface_extends:CollectionSet)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 timestamp = 1;</code>
     * @return The timestamp.
     */
    long getTimestamp();

    /**
     * <code>repeated .CollectionSetResource resource = 2;</code>
     */
    java.util.List<org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource>
    getResourceList();
    /**
     * <code>repeated .CollectionSetResource resource = 2;</code>
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource getResource(int index);
    /**
     * <code>repeated .CollectionSetResource resource = 2;</code>
     */
    int getResourceCount();
    /**
     * <code>repeated .CollectionSetResource resource = 2;</code>
     */
    java.util.List<? extends org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResourceOrBuilder>
    getResourceOrBuilderList();
    /**
     * <code>repeated .CollectionSetResource resource = 2;</code>
     */
    org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResourceOrBuilder getResourceOrBuilder(
            int index);
  }
  /**
   * Protobuf type {@code CollectionSet}
   */
  public static final class CollectionSet extends
          com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:CollectionSet)
          CollectionSetOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CollectionSet.newBuilder() to construct.
    private CollectionSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CollectionSet() {
      resource_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
      return new CollectionSet();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_CollectionSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_CollectionSet_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet.class, org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet.Builder.class);
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private long timestamp_ = 0L;
    /**
     * <code>int64 timestamp = 1;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int RESOURCE_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource> resource_;
    /**
     * <code>repeated .CollectionSetResource resource = 2;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource> getResourceList() {
      return resource_;
    }
    /**
     * <code>repeated .CollectionSetResource resource = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResourceOrBuilder>
    getResourceOrBuilderList() {
      return resource_;
    }
    /**
     * <code>repeated .CollectionSetResource resource = 2;</code>
     */
    @java.lang.Override
    public int getResourceCount() {
      return resource_.size();
    }
    /**
     * <code>repeated .CollectionSetResource resource = 2;</code>
     */
    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource getResource(int index) {
      return resource_.get(index);
    }
    /**
     * <code>repeated .CollectionSetResource resource = 2;</code>
     */
    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResourceOrBuilder getResourceOrBuilder(
            int index) {
      return resource_.get(index);
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
      if (timestamp_ != 0L) {
        output.writeInt64(1, timestamp_);
      }
      for (int i = 0; i < resource_.size(); i++) {
        output.writeMessage(2, resource_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (timestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
                .computeInt64Size(1, timestamp_);
      }
      for (int i = 0; i < resource_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(2, resource_.get(i));
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
      if (!(obj instanceof org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet)) {
        return super.equals(obj);
      }
      org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet other = (org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet) obj;

      if (getTimestamp()
              != other.getTimestamp()) return false;
      if (!getResourceList()
              .equals(other.getResourceList())) return false;
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
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
              getTimestamp());
      if (getResourceCount() > 0) {
        hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getResourceList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet parseFrom(
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
    public static Builder newBuilder(org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet prototype) {
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
     * Protobuf type {@code CollectionSet}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:CollectionSet)
            org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_CollectionSet_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_CollectionSet_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet.class, org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet.Builder.class);
      }

      // Construct using org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet.newBuilder()
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
        timestamp_ = 0L;
        if (resourceBuilder_ == null) {
          resource_ = java.util.Collections.emptyList();
        } else {
          resource_ = null;
          resourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.internal_static_CollectionSet_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet getDefaultInstanceForType() {
        return org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet build() {
        org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet buildPartial() {
        org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet result = new org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet result) {
        if (resourceBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            resource_ = java.util.Collections.unmodifiableList(resource_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.resource_ = resource_;
        } else {
          result.resource_ = resourceBuilder_.build();
        }
      }

      private void buildPartial0(org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.timestamp_ = timestamp_;
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
        if (other instanceof org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet) {
          return mergeFrom((org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet other) {
        if (other == org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet.getDefaultInstance()) return this;
        if (other.getTimestamp() != 0L) {
          setTimestamp(other.getTimestamp());
        }
        if (resourceBuilder_ == null) {
          if (!other.resource_.isEmpty()) {
            if (resource_.isEmpty()) {
              resource_ = other.resource_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureResourceIsMutable();
              resource_.addAll(other.resource_);
            }
            onChanged();
          }
        } else {
          if (!other.resource_.isEmpty()) {
            if (resourceBuilder_.isEmpty()) {
              resourceBuilder_.dispose();
              resourceBuilder_ = null;
              resource_ = other.resource_;
              bitField0_ = (bitField0_ & ~0x00000002);
              resourceBuilder_ =
                      com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                              getResourceFieldBuilder() : null;
            } else {
              resourceBuilder_.addAllMessages(other.resource_);
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
              case 8: {
                timestamp_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource m =
                        input.readMessage(
                                org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.parser(),
                                extensionRegistry);
                if (resourceBuilder_ == null) {
                  ensureResourceIsMutable();
                  resource_.add(m);
                } else {
                  resourceBuilder_.addMessage(m);
                }
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

      private long timestamp_ ;
      /**
       * <code>int64 timestamp = 1;</code>
       * @return The timestamp.
       */
      @java.lang.Override
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>int64 timestamp = 1;</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(long value) {

        timestamp_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int64 timestamp = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private java.util.List<org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource> resource_ =
              java.util.Collections.emptyList();
      private void ensureResourceIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          resource_ = new java.util.ArrayList<org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource>(resource_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResourceOrBuilder> resourceBuilder_;

      /**
       * <code>repeated .CollectionSetResource resource = 2;</code>
       */
      public java.util.List<org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource> getResourceList() {
        if (resourceBuilder_ == null) {
          return java.util.Collections.unmodifiableList(resource_);
        } else {
          return resourceBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CollectionSetResource resource = 2;</code>
       */
      public int getResourceCount() {
        if (resourceBuilder_ == null) {
          return resource_.size();
        } else {
          return resourceBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CollectionSetResource resource = 2;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource getResource(int index) {
        if (resourceBuilder_ == null) {
          return resource_.get(index);
        } else {
          return resourceBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CollectionSetResource resource = 2;</code>
       */
      public Builder setResource(
              int index, org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource value) {
        if (resourceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureResourceIsMutable();
          resource_.set(index, value);
          onChanged();
        } else {
          resourceBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CollectionSetResource resource = 2;</code>
       */
      public Builder setResource(
              int index, org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.Builder builderForValue) {
        if (resourceBuilder_ == null) {
          ensureResourceIsMutable();
          resource_.set(index, builderForValue.build());
          onChanged();
        } else {
          resourceBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CollectionSetResource resource = 2;</code>
       */
      public Builder addResource(org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource value) {
        if (resourceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureResourceIsMutable();
          resource_.add(value);
          onChanged();
        } else {
          resourceBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CollectionSetResource resource = 2;</code>
       */
      public Builder addResource(
              int index, org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource value) {
        if (resourceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureResourceIsMutable();
          resource_.add(index, value);
          onChanged();
        } else {
          resourceBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CollectionSetResource resource = 2;</code>
       */
      public Builder addResource(
              org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.Builder builderForValue) {
        if (resourceBuilder_ == null) {
          ensureResourceIsMutable();
          resource_.add(builderForValue.build());
          onChanged();
        } else {
          resourceBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CollectionSetResource resource = 2;</code>
       */
      public Builder addResource(
              int index, org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.Builder builderForValue) {
        if (resourceBuilder_ == null) {
          ensureResourceIsMutable();
          resource_.add(index, builderForValue.build());
          onChanged();
        } else {
          resourceBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CollectionSetResource resource = 2;</code>
       */
      public Builder addAllResource(
              java.lang.Iterable<? extends org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource> values) {
        if (resourceBuilder_ == null) {
          ensureResourceIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
                  values, resource_);
          onChanged();
        } else {
          resourceBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CollectionSetResource resource = 2;</code>
       */
      public Builder clearResource() {
        if (resourceBuilder_ == null) {
          resource_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          resourceBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CollectionSetResource resource = 2;</code>
       */
      public Builder removeResource(int index) {
        if (resourceBuilder_ == null) {
          ensureResourceIsMutable();
          resource_.remove(index);
          onChanged();
        } else {
          resourceBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CollectionSetResource resource = 2;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.Builder getResourceBuilder(
              int index) {
        return getResourceFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CollectionSetResource resource = 2;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResourceOrBuilder getResourceOrBuilder(
              int index) {
        if (resourceBuilder_ == null) {
          return resource_.get(index);  } else {
          return resourceBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CollectionSetResource resource = 2;</code>
       */
      public java.util.List<? extends org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResourceOrBuilder>
      getResourceOrBuilderList() {
        if (resourceBuilder_ != null) {
          return resourceBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(resource_);
        }
      }
      /**
       * <code>repeated .CollectionSetResource resource = 2;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.Builder addResourceBuilder() {
        return getResourceFieldBuilder().addBuilder(
                org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.getDefaultInstance());
      }
      /**
       * <code>repeated .CollectionSetResource resource = 2;</code>
       */
      public org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.Builder addResourceBuilder(
              int index) {
        return getResourceFieldBuilder().addBuilder(
                index, org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.getDefaultInstance());
      }
      /**
       * <code>repeated .CollectionSetResource resource = 2;</code>
       */
      public java.util.List<org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.Builder>
      getResourceBuilderList() {
        return getResourceFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResourceOrBuilder>
      getResourceFieldBuilder() {
        if (resourceBuilder_ == null) {
          resourceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                  org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource, org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResource.Builder, org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSetResourceOrBuilder>(
                  resource_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          resource_ = null;
        }
        return resourceBuilder_;
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


      // @@protoc_insertion_point(builder_scope:CollectionSet)
    }

    // @@protoc_insertion_point(class_scope:CollectionSet)
    private static final org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet();
    }

    public static org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CollectionSet>
            PARSER = new com.google.protobuf.AbstractParser<CollectionSet>() {
      @java.lang.Override
      public CollectionSet parsePartialFrom(
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

    public static com.google.protobuf.Parser<CollectionSet> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CollectionSet> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.kafka.producer.model.CollectionSetProtos.CollectionSet getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
          internal_static_StringAttribute_descriptor;
  private static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_StringAttribute_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
          internal_static_NumericAttribute_descriptor;
  private static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_NumericAttribute_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
          internal_static_NodeLevelResource_descriptor;
  private static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_NodeLevelResource_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
          internal_static_InterfaceLevelResource_descriptor;
  private static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_InterfaceLevelResource_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
          internal_static_GenericTypeResource_descriptor;
  private static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_GenericTypeResource_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
          internal_static_ResponseTimeResource_descriptor;
  private static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_ResponseTimeResource_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
          internal_static_CollectionSetResource_descriptor;
  private static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_CollectionSetResource_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
          internal_static_CollectionSet_descriptor;
  private static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_CollectionSet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
          descriptor;
  static {
    java.lang.String[] descriptorData = {
            "\n\023collectionset.proto\032\036google/protobuf/w" +
                    "rappers.proto\".\n\017StringAttribute\022\014\n\004name" +
                    "\030\001 \001(\t\022\r\n\005value\030\002 \001(\t\"\270\001\n\020NumericAttribu" +
                    "te\022\r\n\005group\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\r\n\005value" +
                    "\030\003 \001(\001\022$\n\004type\030\004 \001(\0162\026.NumericAttribute." +
                    "Type\0222\n\014metric_value\030\005 \001(\0132\034.google.prot" +
                    "obuf.DoubleValue\"\036\n\004Type\022\t\n\005GAUGE\020\000\022\013\n\007C" +
                    "OUNTER\020\001\"v\n\021NodeLevelResource\022\017\n\007node_id" +
                    "\030\001 \001(\003\022\026\n\016foreign_source\030\002 \001(\t\022\022\n\nforeig" +
                    "n_id\030\003 \001(\t\022\022\n\nnode_label\030\004 \001(\t\022\020\n\010locati" +
                    "on\030\005 \001(\t\"^\n\026InterfaceLevelResource\022 \n\004no" +
                    "de\030\001 \001(\0132\022.NodeLevelResource\022\020\n\010instance" +
                    "\030\002 \001(\t\022\020\n\010if_index\030\003 \001(\005\"W\n\023GenericTypeR" +
                    "esource\022 \n\004node\030\001 \001(\0132\022.NodeLevelResourc" +
                    "e\022\014\n\004type\030\002 \001(\t\022\020\n\010instance\030\003 \001(\t\":\n\024Res" +
                    "ponseTimeResource\022\020\n\010instance\030\001 \001(\t\022\020\n\010l" +
                    "ocation\030\002 \001(\t\"\327\002\n\025CollectionSetResource\022" +
                    "\"\n\004node\030\001 \001(\0132\022.NodeLevelResourceH\000\022,\n\ti" +
                    "nterface\030\002 \001(\0132\027.InterfaceLevelResourceH" +
                    "\000\022\'\n\007generic\030\003 \001(\0132\024.GenericTypeResource" +
                    "H\000\022)\n\010response\030\004 \001(\0132\025.ResponseTimeResou" +
                    "rceH\000\022\023\n\013resource_id\030\005 \001(\t\022\025\n\rresource_n" +
                    "ame\030\006 \001(\t\022\032\n\022resource_type_name\030\007 \001(\t\022 \n" +
                    "\006string\030\n \003(\0132\020.StringAttribute\022\"\n\007numer" +
                    "ic\030\013 \003(\0132\021.NumericAttributeB\n\n\010resource\"" +
                    "L\n\rCollectionSet\022\021\n\ttimestamp\030\001 \001(\003\022(\n\010r" +
                    "esource\030\002 \003(\0132\026.CollectionSetResourceB@\n" +
                    ")org.opennms.features.kafka.producer.mod" +
                    "elB\023CollectionSetProtosb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
            .internalBuildGeneratedFileFrom(descriptorData,
                    new com.google.protobuf.Descriptors.FileDescriptor[] {
                            com.google.protobuf.WrappersProto.getDescriptor(),
                    });
    internal_static_StringAttribute_descriptor =
            getDescriptor().getMessageTypes().get(0);
    internal_static_StringAttribute_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_StringAttribute_descriptor,
            new java.lang.String[] { "Name", "Value", });
    internal_static_NumericAttribute_descriptor =
            getDescriptor().getMessageTypes().get(1);
    internal_static_NumericAttribute_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_NumericAttribute_descriptor,
            new java.lang.String[] { "Group", "Name", "Value", "Type", "MetricValue", });
    internal_static_NodeLevelResource_descriptor =
            getDescriptor().getMessageTypes().get(2);
    internal_static_NodeLevelResource_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_NodeLevelResource_descriptor,
            new java.lang.String[] { "NodeId", "ForeignSource", "ForeignId", "NodeLabel", "Location", });
    internal_static_InterfaceLevelResource_descriptor =
            getDescriptor().getMessageTypes().get(3);
    internal_static_InterfaceLevelResource_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_InterfaceLevelResource_descriptor,
            new java.lang.String[] { "Node", "Instance", "IfIndex", });
    internal_static_GenericTypeResource_descriptor =
            getDescriptor().getMessageTypes().get(4);
    internal_static_GenericTypeResource_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_GenericTypeResource_descriptor,
            new java.lang.String[] { "Node", "Type", "Instance", });
    internal_static_ResponseTimeResource_descriptor =
            getDescriptor().getMessageTypes().get(5);
    internal_static_ResponseTimeResource_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_ResponseTimeResource_descriptor,
            new java.lang.String[] { "Instance", "Location", });
    internal_static_CollectionSetResource_descriptor =
            getDescriptor().getMessageTypes().get(6);
    internal_static_CollectionSetResource_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_CollectionSetResource_descriptor,
            new java.lang.String[] { "Node", "Interface", "Generic", "Response", "ResourceId", "ResourceName", "ResourceTypeName", "String", "Numeric", "Resource", });
    internal_static_CollectionSet_descriptor =
            getDescriptor().getMessageTypes().get(7);
    internal_static_CollectionSet_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_CollectionSet_descriptor,
            new java.lang.String[] { "Timestamp", "Resource", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
