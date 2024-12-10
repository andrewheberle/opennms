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
package org.opennms.features.openconfig.proto.gnmi;

public final class GnmiExt {
  private GnmiExt() {}
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
   * RegisteredExtension is an enumeration acting as a registry for extensions
   * defined by external sources.
   * </pre>
   *
   * Protobuf enum {@code gnmi_ext.ExtensionID}
   */
  public enum ExtensionID
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * New extensions are to be defined within this enumeration - their definition
     * MUST link to a reference describing their implementation.
     * </pre>
     *
     * <code>EID_UNSET = 0;</code>
     */
    EID_UNSET(0),
    /**
     * <pre>
     * An experimental extension that may be used during prototyping of a new
     * extension.
     * </pre>
     *
     * <code>EID_EXPERIMENTAL = 999;</code>
     */
    EID_EXPERIMENTAL(999),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * New extensions are to be defined within this enumeration - their definition
     * MUST link to a reference describing their implementation.
     * </pre>
     *
     * <code>EID_UNSET = 0;</code>
     */
    public static final int EID_UNSET_VALUE = 0;
    /**
     * <pre>
     * An experimental extension that may be used during prototyping of a new
     * extension.
     * </pre>
     *
     * <code>EID_EXPERIMENTAL = 999;</code>
     */
    public static final int EID_EXPERIMENTAL_VALUE = 999;


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
    public static ExtensionID valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ExtensionID forNumber(int value) {
      switch (value) {
        case 0: return EID_UNSET;
        case 999: return EID_EXPERIMENTAL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ExtensionID>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ExtensionID> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ExtensionID>() {
            public ExtensionID findValueByNumber(int number) {
              return ExtensionID.forNumber(number);
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
      return org.opennms.features.openconfig.proto.gnmi.GnmiExt.getDescriptor().getEnumTypes().get(0);
    }

    private static final ExtensionID[] VALUES = values();

    public static ExtensionID valueOf(
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

    private ExtensionID(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:gnmi_ext.ExtensionID)
  }

  public interface ExtensionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gnmi_ext.Extension)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * A registered extension.
     * </pre>
     *
     * <code>.gnmi_ext.RegisteredExtension registered_ext = 1;</code>
     * @return Whether the registeredExt field is set.
     */
    boolean hasRegisteredExt();
    /**
     * <pre>
     * A registered extension.
     * </pre>
     *
     * <code>.gnmi_ext.RegisteredExtension registered_ext = 1;</code>
     * @return The registeredExt.
     */
    org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension getRegisteredExt();
    /**
     * <pre>
     * A registered extension.
     * </pre>
     *
     * <code>.gnmi_ext.RegisteredExtension registered_ext = 1;</code>
     */
    org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtensionOrBuilder getRegisteredExtOrBuilder();

    /**
     * <pre>
     * Well known extensions.
     * </pre>
     *
     * <code>.gnmi_ext.MasterArbitration master_arbitration = 2;</code>
     * @return Whether the masterArbitration field is set.
     */
    boolean hasMasterArbitration();
    /**
     * <pre>
     * Well known extensions.
     * </pre>
     *
     * <code>.gnmi_ext.MasterArbitration master_arbitration = 2;</code>
     * @return The masterArbitration.
     */
    org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration getMasterArbitration();
    /**
     * <pre>
     * Well known extensions.
     * </pre>
     *
     * <code>.gnmi_ext.MasterArbitration master_arbitration = 2;</code>
     */
    org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitrationOrBuilder getMasterArbitrationOrBuilder();

    org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension.ExtCase getExtCase();
  }
  /**
   * <pre>
   * The Extension message contains a single gNMI extension.
   * </pre>
   *
   * Protobuf type {@code gnmi_ext.Extension}
   */
  public static final class Extension extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gnmi_ext.Extension)
      ExtensionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Extension.newBuilder() to construct.
    private Extension(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Extension() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Extension();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_Extension_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_Extension_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension.class, org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension.Builder.class);
    }

    private int extCase_ = 0;
    @SuppressWarnings("serial")
    private java.lang.Object ext_;
    public enum ExtCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      REGISTERED_EXT(1),
      MASTER_ARBITRATION(2),
      EXT_NOT_SET(0);
      private final int value;
      private ExtCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ExtCase valueOf(int value) {
        return forNumber(value);
      }

      public static ExtCase forNumber(int value) {
        switch (value) {
          case 1: return REGISTERED_EXT;
          case 2: return MASTER_ARBITRATION;
          case 0: return EXT_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public ExtCase
    getExtCase() {
      return ExtCase.forNumber(
          extCase_);
    }

    public static final int REGISTERED_EXT_FIELD_NUMBER = 1;
    /**
     * <pre>
     * A registered extension.
     * </pre>
     *
     * <code>.gnmi_ext.RegisteredExtension registered_ext = 1;</code>
     * @return Whether the registeredExt field is set.
     */
    @java.lang.Override
    public boolean hasRegisteredExt() {
      return extCase_ == 1;
    }
    /**
     * <pre>
     * A registered extension.
     * </pre>
     *
     * <code>.gnmi_ext.RegisteredExtension registered_ext = 1;</code>
     * @return The registeredExt.
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension getRegisteredExt() {
      if (extCase_ == 1) {
         return (org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension) ext_;
      }
      return org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.getDefaultInstance();
    }
    /**
     * <pre>
     * A registered extension.
     * </pre>
     *
     * <code>.gnmi_ext.RegisteredExtension registered_ext = 1;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtensionOrBuilder getRegisteredExtOrBuilder() {
      if (extCase_ == 1) {
         return (org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension) ext_;
      }
      return org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.getDefaultInstance();
    }

    public static final int MASTER_ARBITRATION_FIELD_NUMBER = 2;
    /**
     * <pre>
     * Well known extensions.
     * </pre>
     *
     * <code>.gnmi_ext.MasterArbitration master_arbitration = 2;</code>
     * @return Whether the masterArbitration field is set.
     */
    @java.lang.Override
    public boolean hasMasterArbitration() {
      return extCase_ == 2;
    }
    /**
     * <pre>
     * Well known extensions.
     * </pre>
     *
     * <code>.gnmi_ext.MasterArbitration master_arbitration = 2;</code>
     * @return The masterArbitration.
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration getMasterArbitration() {
      if (extCase_ == 2) {
         return (org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration) ext_;
      }
      return org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.getDefaultInstance();
    }
    /**
     * <pre>
     * Well known extensions.
     * </pre>
     *
     * <code>.gnmi_ext.MasterArbitration master_arbitration = 2;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitrationOrBuilder getMasterArbitrationOrBuilder() {
      if (extCase_ == 2) {
         return (org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration) ext_;
      }
      return org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.getDefaultInstance();
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
      if (extCase_ == 1) {
        output.writeMessage(1, (org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension) ext_);
      }
      if (extCase_ == 2) {
        output.writeMessage(2, (org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration) ext_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (extCase_ == 1) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, (org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension) ext_);
      }
      if (extCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, (org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration) ext_);
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension other = (org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension) obj;

      if (!getExtCase().equals(other.getExtCase())) return false;
      switch (extCase_) {
        case 1:
          if (!getRegisteredExt()
              .equals(other.getRegisteredExt())) return false;
          break;
        case 2:
          if (!getMasterArbitration()
              .equals(other.getMasterArbitration())) return false;
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
      switch (extCase_) {
        case 1:
          hash = (37 * hash) + REGISTERED_EXT_FIELD_NUMBER;
          hash = (53 * hash) + getRegisteredExt().hashCode();
          break;
        case 2:
          hash = (37 * hash) + MASTER_ARBITRATION_FIELD_NUMBER;
          hash = (53 * hash) + getMasterArbitration().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension prototype) {
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
     * The Extension message contains a single gNMI extension.
     * </pre>
     *
     * Protobuf type {@code gnmi_ext.Extension}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gnmi_ext.Extension)
        org.opennms.features.openconfig.proto.gnmi.GnmiExt.ExtensionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_Extension_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_Extension_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension.class, org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension.newBuilder()
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
        if (registeredExtBuilder_ != null) {
          registeredExtBuilder_.clear();
        }
        if (masterArbitrationBuilder_ != null) {
          masterArbitrationBuilder_.clear();
        }
        extCase_ = 0;
        ext_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_Extension_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension build() {
        org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension buildPartial() {
        org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension result = new org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        buildPartialOneofs(result);
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension result) {
        int from_bitField0_ = bitField0_;
      }

      private void buildPartialOneofs(org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension result) {
        result.extCase_ = extCase_;
        result.ext_ = this.ext_;
        if (extCase_ == 1 &&
            registeredExtBuilder_ != null) {
          result.ext_ = registeredExtBuilder_.build();
        }
        if (extCase_ == 2 &&
            masterArbitrationBuilder_ != null) {
          result.ext_ = masterArbitrationBuilder_.build();
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
        if (other instanceof org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension) {
          return mergeFrom((org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension other) {
        if (other == org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension.getDefaultInstance()) return this;
        switch (other.getExtCase()) {
          case REGISTERED_EXT: {
            mergeRegisteredExt(other.getRegisteredExt());
            break;
          }
          case MASTER_ARBITRATION: {
            mergeMasterArbitration(other.getMasterArbitration());
            break;
          }
          case EXT_NOT_SET: {
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
                    getRegisteredExtFieldBuilder().getBuilder(),
                    extensionRegistry);
                extCase_ = 1;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getMasterArbitrationFieldBuilder().getBuilder(),
                    extensionRegistry);
                extCase_ = 2;
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
      private int extCase_ = 0;
      private java.lang.Object ext_;
      public ExtCase
          getExtCase() {
        return ExtCase.forNumber(
            extCase_);
      }

      public Builder clearExt() {
        extCase_ = 0;
        ext_ = null;
        onChanged();
        return this;
      }

      private int bitField0_;

      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension, org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.Builder, org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtensionOrBuilder> registeredExtBuilder_;
      /**
       * <pre>
       * A registered extension.
       * </pre>
       *
       * <code>.gnmi_ext.RegisteredExtension registered_ext = 1;</code>
       * @return Whether the registeredExt field is set.
       */
      @java.lang.Override
      public boolean hasRegisteredExt() {
        return extCase_ == 1;
      }
      /**
       * <pre>
       * A registered extension.
       * </pre>
       *
       * <code>.gnmi_ext.RegisteredExtension registered_ext = 1;</code>
       * @return The registeredExt.
       */
      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension getRegisteredExt() {
        if (registeredExtBuilder_ == null) {
          if (extCase_ == 1) {
            return (org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension) ext_;
          }
          return org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.getDefaultInstance();
        } else {
          if (extCase_ == 1) {
            return registeredExtBuilder_.getMessage();
          }
          return org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.getDefaultInstance();
        }
      }
      /**
       * <pre>
       * A registered extension.
       * </pre>
       *
       * <code>.gnmi_ext.RegisteredExtension registered_ext = 1;</code>
       */
      public Builder setRegisteredExt(org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension value) {
        if (registeredExtBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ext_ = value;
          onChanged();
        } else {
          registeredExtBuilder_.setMessage(value);
        }
        extCase_ = 1;
        return this;
      }
      /**
       * <pre>
       * A registered extension.
       * </pre>
       *
       * <code>.gnmi_ext.RegisteredExtension registered_ext = 1;</code>
       */
      public Builder setRegisteredExt(
          org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.Builder builderForValue) {
        if (registeredExtBuilder_ == null) {
          ext_ = builderForValue.build();
          onChanged();
        } else {
          registeredExtBuilder_.setMessage(builderForValue.build());
        }
        extCase_ = 1;
        return this;
      }
      /**
       * <pre>
       * A registered extension.
       * </pre>
       *
       * <code>.gnmi_ext.RegisteredExtension registered_ext = 1;</code>
       */
      public Builder mergeRegisteredExt(org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension value) {
        if (registeredExtBuilder_ == null) {
          if (extCase_ == 1 &&
              ext_ != org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.getDefaultInstance()) {
            ext_ = org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.newBuilder((org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension) ext_)
                .mergeFrom(value).buildPartial();
          } else {
            ext_ = value;
          }
          onChanged();
        } else {
          if (extCase_ == 1) {
            registeredExtBuilder_.mergeFrom(value);
          } else {
            registeredExtBuilder_.setMessage(value);
          }
        }
        extCase_ = 1;
        return this;
      }
      /**
       * <pre>
       * A registered extension.
       * </pre>
       *
       * <code>.gnmi_ext.RegisteredExtension registered_ext = 1;</code>
       */
      public Builder clearRegisteredExt() {
        if (registeredExtBuilder_ == null) {
          if (extCase_ == 1) {
            extCase_ = 0;
            ext_ = null;
            onChanged();
          }
        } else {
          if (extCase_ == 1) {
            extCase_ = 0;
            ext_ = null;
          }
          registeredExtBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * A registered extension.
       * </pre>
       *
       * <code>.gnmi_ext.RegisteredExtension registered_ext = 1;</code>
       */
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.Builder getRegisteredExtBuilder() {
        return getRegisteredExtFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * A registered extension.
       * </pre>
       *
       * <code>.gnmi_ext.RegisteredExtension registered_ext = 1;</code>
       */
      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtensionOrBuilder getRegisteredExtOrBuilder() {
        if ((extCase_ == 1) && (registeredExtBuilder_ != null)) {
          return registeredExtBuilder_.getMessageOrBuilder();
        } else {
          if (extCase_ == 1) {
            return (org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension) ext_;
          }
          return org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.getDefaultInstance();
        }
      }
      /**
       * <pre>
       * A registered extension.
       * </pre>
       *
       * <code>.gnmi_ext.RegisteredExtension registered_ext = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension, org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.Builder, org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtensionOrBuilder> 
          getRegisteredExtFieldBuilder() {
        if (registeredExtBuilder_ == null) {
          if (!(extCase_ == 1)) {
            ext_ = org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.getDefaultInstance();
          }
          registeredExtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension, org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.Builder, org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtensionOrBuilder>(
                  (org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension) ext_,
                  getParentForChildren(),
                  isClean());
          ext_ = null;
        }
        extCase_ = 1;
        onChanged();
        return registeredExtBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration, org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.Builder, org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitrationOrBuilder> masterArbitrationBuilder_;
      /**
       * <pre>
       * Well known extensions.
       * </pre>
       *
       * <code>.gnmi_ext.MasterArbitration master_arbitration = 2;</code>
       * @return Whether the masterArbitration field is set.
       */
      @java.lang.Override
      public boolean hasMasterArbitration() {
        return extCase_ == 2;
      }
      /**
       * <pre>
       * Well known extensions.
       * </pre>
       *
       * <code>.gnmi_ext.MasterArbitration master_arbitration = 2;</code>
       * @return The masterArbitration.
       */
      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration getMasterArbitration() {
        if (masterArbitrationBuilder_ == null) {
          if (extCase_ == 2) {
            return (org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration) ext_;
          }
          return org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.getDefaultInstance();
        } else {
          if (extCase_ == 2) {
            return masterArbitrationBuilder_.getMessage();
          }
          return org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.getDefaultInstance();
        }
      }
      /**
       * <pre>
       * Well known extensions.
       * </pre>
       *
       * <code>.gnmi_ext.MasterArbitration master_arbitration = 2;</code>
       */
      public Builder setMasterArbitration(org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration value) {
        if (masterArbitrationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ext_ = value;
          onChanged();
        } else {
          masterArbitrationBuilder_.setMessage(value);
        }
        extCase_ = 2;
        return this;
      }
      /**
       * <pre>
       * Well known extensions.
       * </pre>
       *
       * <code>.gnmi_ext.MasterArbitration master_arbitration = 2;</code>
       */
      public Builder setMasterArbitration(
          org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.Builder builderForValue) {
        if (masterArbitrationBuilder_ == null) {
          ext_ = builderForValue.build();
          onChanged();
        } else {
          masterArbitrationBuilder_.setMessage(builderForValue.build());
        }
        extCase_ = 2;
        return this;
      }
      /**
       * <pre>
       * Well known extensions.
       * </pre>
       *
       * <code>.gnmi_ext.MasterArbitration master_arbitration = 2;</code>
       */
      public Builder mergeMasterArbitration(org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration value) {
        if (masterArbitrationBuilder_ == null) {
          if (extCase_ == 2 &&
              ext_ != org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.getDefaultInstance()) {
            ext_ = org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.newBuilder((org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration) ext_)
                .mergeFrom(value).buildPartial();
          } else {
            ext_ = value;
          }
          onChanged();
        } else {
          if (extCase_ == 2) {
            masterArbitrationBuilder_.mergeFrom(value);
          } else {
            masterArbitrationBuilder_.setMessage(value);
          }
        }
        extCase_ = 2;
        return this;
      }
      /**
       * <pre>
       * Well known extensions.
       * </pre>
       *
       * <code>.gnmi_ext.MasterArbitration master_arbitration = 2;</code>
       */
      public Builder clearMasterArbitration() {
        if (masterArbitrationBuilder_ == null) {
          if (extCase_ == 2) {
            extCase_ = 0;
            ext_ = null;
            onChanged();
          }
        } else {
          if (extCase_ == 2) {
            extCase_ = 0;
            ext_ = null;
          }
          masterArbitrationBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * Well known extensions.
       * </pre>
       *
       * <code>.gnmi_ext.MasterArbitration master_arbitration = 2;</code>
       */
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.Builder getMasterArbitrationBuilder() {
        return getMasterArbitrationFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Well known extensions.
       * </pre>
       *
       * <code>.gnmi_ext.MasterArbitration master_arbitration = 2;</code>
       */
      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitrationOrBuilder getMasterArbitrationOrBuilder() {
        if ((extCase_ == 2) && (masterArbitrationBuilder_ != null)) {
          return masterArbitrationBuilder_.getMessageOrBuilder();
        } else {
          if (extCase_ == 2) {
            return (org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration) ext_;
          }
          return org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.getDefaultInstance();
        }
      }
      /**
       * <pre>
       * Well known extensions.
       * </pre>
       *
       * <code>.gnmi_ext.MasterArbitration master_arbitration = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration, org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.Builder, org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitrationOrBuilder> 
          getMasterArbitrationFieldBuilder() {
        if (masterArbitrationBuilder_ == null) {
          if (!(extCase_ == 2)) {
            ext_ = org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.getDefaultInstance();
          }
          masterArbitrationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration, org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.Builder, org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitrationOrBuilder>(
                  (org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration) ext_,
                  getParentForChildren(),
                  isClean());
          ext_ = null;
        }
        extCase_ = 2;
        onChanged();
        return masterArbitrationBuilder_;
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


      // @@protoc_insertion_point(builder_scope:gnmi_ext.Extension)
    }

    // @@protoc_insertion_point(class_scope:gnmi_ext.Extension)
    private static final org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension();
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Extension>
        PARSER = new com.google.protobuf.AbstractParser<Extension>() {
      @java.lang.Override
      public Extension parsePartialFrom(
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

    public static com.google.protobuf.Parser<Extension> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Extension> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Extension getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RegisteredExtensionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gnmi_ext.RegisteredExtension)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The unique ID assigned to this extension.
     * </pre>
     *
     * <code>.gnmi_ext.ExtensionID id = 1;</code>
     * @return The enum numeric value on the wire for id.
     */
    int getIdValue();
    /**
     * <pre>
     * The unique ID assigned to this extension.
     * </pre>
     *
     * <code>.gnmi_ext.ExtensionID id = 1;</code>
     * @return The id.
     */
    org.opennms.features.openconfig.proto.gnmi.GnmiExt.ExtensionID getId();

    /**
     * <pre>
     * The binary-marshalled protobuf extension payload.
     * </pre>
     *
     * <code>bytes msg = 2;</code>
     * @return The msg.
     */
    com.google.protobuf.ByteString getMsg();
  }
  /**
   * <pre>
   * The RegisteredExtension message defines an extension which is defined outside
   * of this file.
   * </pre>
   *
   * Protobuf type {@code gnmi_ext.RegisteredExtension}
   */
  public static final class RegisteredExtension extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gnmi_ext.RegisteredExtension)
      RegisteredExtensionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RegisteredExtension.newBuilder() to construct.
    private RegisteredExtension(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RegisteredExtension() {
      id_ = 0;
      msg_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RegisteredExtension();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_RegisteredExtension_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_RegisteredExtension_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.class, org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_ = 0;
    /**
     * <pre>
     * The unique ID assigned to this extension.
     * </pre>
     *
     * <code>.gnmi_ext.ExtensionID id = 1;</code>
     * @return The enum numeric value on the wire for id.
     */
    @java.lang.Override public int getIdValue() {
      return id_;
    }
    /**
     * <pre>
     * The unique ID assigned to this extension.
     * </pre>
     *
     * <code>.gnmi_ext.ExtensionID id = 1;</code>
     * @return The id.
     */
    @java.lang.Override public org.opennms.features.openconfig.proto.gnmi.GnmiExt.ExtensionID getId() {
      org.opennms.features.openconfig.proto.gnmi.GnmiExt.ExtensionID result = org.opennms.features.openconfig.proto.gnmi.GnmiExt.ExtensionID.forNumber(id_);
      return result == null ? org.opennms.features.openconfig.proto.gnmi.GnmiExt.ExtensionID.UNRECOGNIZED : result;
    }

    public static final int MSG_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString msg_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The binary-marshalled protobuf extension payload.
     * </pre>
     *
     * <code>bytes msg = 2;</code>
     * @return The msg.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMsg() {
      return msg_;
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
      if (id_ != org.opennms.features.openconfig.proto.gnmi.GnmiExt.ExtensionID.EID_UNSET.getNumber()) {
        output.writeEnum(1, id_);
      }
      if (!msg_.isEmpty()) {
        output.writeBytes(2, msg_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != org.opennms.features.openconfig.proto.gnmi.GnmiExt.ExtensionID.EID_UNSET.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, id_);
      }
      if (!msg_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, msg_);
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension other = (org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension) obj;

      if (id_ != other.id_) return false;
      if (!getMsg()
          .equals(other.getMsg())) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + id_;
      hash = (37 * hash) + MSG_FIELD_NUMBER;
      hash = (53 * hash) + getMsg().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension prototype) {
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
     * The RegisteredExtension message defines an extension which is defined outside
     * of this file.
     * </pre>
     *
     * Protobuf type {@code gnmi_ext.RegisteredExtension}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gnmi_ext.RegisteredExtension)
        org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtensionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_RegisteredExtension_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_RegisteredExtension_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.class, org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.newBuilder()
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
        id_ = 0;
        msg_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_RegisteredExtension_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension build() {
        org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension buildPartial() {
        org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension result = new org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.msg_ = msg_;
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
        if (other instanceof org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension) {
          return mergeFrom((org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension other) {
        if (other == org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension.getDefaultInstance()) return this;
        if (other.id_ != 0) {
          setIdValue(other.getIdValue());
        }
        if (other.getMsg() != com.google.protobuf.ByteString.EMPTY) {
          setMsg(other.getMsg());
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
                id_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                msg_ = input.readBytes();
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

      private int id_ = 0;
      /**
       * <pre>
       * The unique ID assigned to this extension.
       * </pre>
       *
       * <code>.gnmi_ext.ExtensionID id = 1;</code>
       * @return The enum numeric value on the wire for id.
       */
      @java.lang.Override public int getIdValue() {
        return id_;
      }
      /**
       * <pre>
       * The unique ID assigned to this extension.
       * </pre>
       *
       * <code>.gnmi_ext.ExtensionID id = 1;</code>
       * @param value The enum numeric value on the wire for id to set.
       * @return This builder for chaining.
       */
      public Builder setIdValue(int value) {
        id_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The unique ID assigned to this extension.
       * </pre>
       *
       * <code>.gnmi_ext.ExtensionID id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.ExtensionID getId() {
        org.opennms.features.openconfig.proto.gnmi.GnmiExt.ExtensionID result = org.opennms.features.openconfig.proto.gnmi.GnmiExt.ExtensionID.forNumber(id_);
        return result == null ? org.opennms.features.openconfig.proto.gnmi.GnmiExt.ExtensionID.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * The unique ID assigned to this extension.
       * </pre>
       *
       * <code>.gnmi_ext.ExtensionID id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(org.opennms.features.openconfig.proto.gnmi.GnmiExt.ExtensionID value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        id_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The unique ID assigned to this extension.
       * </pre>
       *
       * <code>.gnmi_ext.ExtensionID id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString msg_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * The binary-marshalled protobuf extension payload.
       * </pre>
       *
       * <code>bytes msg = 2;</code>
       * @return The msg.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getMsg() {
        return msg_;
      }
      /**
       * <pre>
       * The binary-marshalled protobuf extension payload.
       * </pre>
       *
       * <code>bytes msg = 2;</code>
       * @param value The msg to set.
       * @return This builder for chaining.
       */
      public Builder setMsg(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        msg_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The binary-marshalled protobuf extension payload.
       * </pre>
       *
       * <code>bytes msg = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMsg() {
        bitField0_ = (bitField0_ & ~0x00000002);
        msg_ = getDefaultInstance().getMsg();
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


      // @@protoc_insertion_point(builder_scope:gnmi_ext.RegisteredExtension)
    }

    // @@protoc_insertion_point(class_scope:gnmi_ext.RegisteredExtension)
    private static final org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension();
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RegisteredExtension>
        PARSER = new com.google.protobuf.AbstractParser<RegisteredExtension>() {
      @java.lang.Override
      public RegisteredExtension parsePartialFrom(
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

    public static com.google.protobuf.Parser<RegisteredExtension> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RegisteredExtension> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.gnmi.GnmiExt.RegisteredExtension getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface MasterArbitrationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gnmi_ext.MasterArbitration)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.gnmi_ext.Role role = 1;</code>
     * @return Whether the role field is set.
     */
    boolean hasRole();
    /**
     * <code>.gnmi_ext.Role role = 1;</code>
     * @return The role.
     */
    org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role getRole();
    /**
     * <code>.gnmi_ext.Role role = 1;</code>
     */
    org.opennms.features.openconfig.proto.gnmi.GnmiExt.RoleOrBuilder getRoleOrBuilder();

    /**
     * <code>.gnmi_ext.Uint128 election_id = 2;</code>
     * @return Whether the electionId field is set.
     */
    boolean hasElectionId();
    /**
     * <code>.gnmi_ext.Uint128 election_id = 2;</code>
     * @return The electionId.
     */
    org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 getElectionId();
    /**
     * <code>.gnmi_ext.Uint128 election_id = 2;</code>
     */
    org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128OrBuilder getElectionIdOrBuilder();
  }
  /**
   * <pre>
   * MasterArbitration is used to select the master among multiple gNMI clients
   * with the same Roles. The client with the largest election_id is honored as
   * the master.
   * The document about gNMI master arbitration can be found at
   * https://github.com/openconfig/reference/blob/master/rpc/gnmi/gnmi-master-arbitration.md
   * </pre>
   *
   * Protobuf type {@code gnmi_ext.MasterArbitration}
   */
  public static final class MasterArbitration extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gnmi_ext.MasterArbitration)
      MasterArbitrationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MasterArbitration.newBuilder() to construct.
    private MasterArbitration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MasterArbitration() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MasterArbitration();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_MasterArbitration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_MasterArbitration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.class, org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.Builder.class);
    }

    private int bitField0_;
    public static final int ROLE_FIELD_NUMBER = 1;
    private org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role role_;
    /**
     * <code>.gnmi_ext.Role role = 1;</code>
     * @return Whether the role field is set.
     */
    @java.lang.Override
    public boolean hasRole() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.gnmi_ext.Role role = 1;</code>
     * @return The role.
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role getRole() {
      return role_ == null ? org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role.getDefaultInstance() : role_;
    }
    /**
     * <code>.gnmi_ext.Role role = 1;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.gnmi.GnmiExt.RoleOrBuilder getRoleOrBuilder() {
      return role_ == null ? org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role.getDefaultInstance() : role_;
    }

    public static final int ELECTION_ID_FIELD_NUMBER = 2;
    private org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 electionId_;
    /**
     * <code>.gnmi_ext.Uint128 election_id = 2;</code>
     * @return Whether the electionId field is set.
     */
    @java.lang.Override
    public boolean hasElectionId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.gnmi_ext.Uint128 election_id = 2;</code>
     * @return The electionId.
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 getElectionId() {
      return electionId_ == null ? org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128.getDefaultInstance() : electionId_;
    }
    /**
     * <code>.gnmi_ext.Uint128 election_id = 2;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128OrBuilder getElectionIdOrBuilder() {
      return electionId_ == null ? org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128.getDefaultInstance() : electionId_;
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
        output.writeMessage(1, getRole());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(2, getElectionId());
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
          .computeMessageSize(1, getRole());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getElectionId());
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration other = (org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration) obj;

      if (hasRole() != other.hasRole()) return false;
      if (hasRole()) {
        if (!getRole()
            .equals(other.getRole())) return false;
      }
      if (hasElectionId() != other.hasElectionId()) return false;
      if (hasElectionId()) {
        if (!getElectionId()
            .equals(other.getElectionId())) return false;
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
      if (hasRole()) {
        hash = (37 * hash) + ROLE_FIELD_NUMBER;
        hash = (53 * hash) + getRole().hashCode();
      }
      if (hasElectionId()) {
        hash = (37 * hash) + ELECTION_ID_FIELD_NUMBER;
        hash = (53 * hash) + getElectionId().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration prototype) {
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
     * MasterArbitration is used to select the master among multiple gNMI clients
     * with the same Roles. The client with the largest election_id is honored as
     * the master.
     * The document about gNMI master arbitration can be found at
     * https://github.com/openconfig/reference/blob/master/rpc/gnmi/gnmi-master-arbitration.md
     * </pre>
     *
     * Protobuf type {@code gnmi_ext.MasterArbitration}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gnmi_ext.MasterArbitration)
        org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitrationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_MasterArbitration_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_MasterArbitration_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.class, org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.newBuilder()
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
          getRoleFieldBuilder();
          getElectionIdFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        role_ = null;
        if (roleBuilder_ != null) {
          roleBuilder_.dispose();
          roleBuilder_ = null;
        }
        electionId_ = null;
        if (electionIdBuilder_ != null) {
          electionIdBuilder_.dispose();
          electionIdBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_MasterArbitration_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration build() {
        org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration buildPartial() {
        org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration result = new org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.role_ = roleBuilder_ == null
              ? role_
              : roleBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.electionId_ = electionIdBuilder_ == null
              ? electionId_
              : electionIdBuilder_.build();
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
        if (other instanceof org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration) {
          return mergeFrom((org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration other) {
        if (other == org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration.getDefaultInstance()) return this;
        if (other.hasRole()) {
          mergeRole(other.getRole());
        }
        if (other.hasElectionId()) {
          mergeElectionId(other.getElectionId());
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
                    getRoleFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getElectionIdFieldBuilder().getBuilder(),
                    extensionRegistry);
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

      private org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role role_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role, org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role.Builder, org.opennms.features.openconfig.proto.gnmi.GnmiExt.RoleOrBuilder> roleBuilder_;
      /**
       * <code>.gnmi_ext.Role role = 1;</code>
       * @return Whether the role field is set.
       */
      public boolean hasRole() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.gnmi_ext.Role role = 1;</code>
       * @return The role.
       */
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role getRole() {
        if (roleBuilder_ == null) {
          return role_ == null ? org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role.getDefaultInstance() : role_;
        } else {
          return roleBuilder_.getMessage();
        }
      }
      /**
       * <code>.gnmi_ext.Role role = 1;</code>
       */
      public Builder setRole(org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role value) {
        if (roleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          role_ = value;
        } else {
          roleBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.gnmi_ext.Role role = 1;</code>
       */
      public Builder setRole(
          org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role.Builder builderForValue) {
        if (roleBuilder_ == null) {
          role_ = builderForValue.build();
        } else {
          roleBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.gnmi_ext.Role role = 1;</code>
       */
      public Builder mergeRole(org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role value) {
        if (roleBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            role_ != null &&
            role_ != org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role.getDefaultInstance()) {
            getRoleBuilder().mergeFrom(value);
          } else {
            role_ = value;
          }
        } else {
          roleBuilder_.mergeFrom(value);
        }
        if (role_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.gnmi_ext.Role role = 1;</code>
       */
      public Builder clearRole() {
        bitField0_ = (bitField0_ & ~0x00000001);
        role_ = null;
        if (roleBuilder_ != null) {
          roleBuilder_.dispose();
          roleBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.gnmi_ext.Role role = 1;</code>
       */
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role.Builder getRoleBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getRoleFieldBuilder().getBuilder();
      }
      /**
       * <code>.gnmi_ext.Role role = 1;</code>
       */
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.RoleOrBuilder getRoleOrBuilder() {
        if (roleBuilder_ != null) {
          return roleBuilder_.getMessageOrBuilder();
        } else {
          return role_ == null ?
              org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role.getDefaultInstance() : role_;
        }
      }
      /**
       * <code>.gnmi_ext.Role role = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role, org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role.Builder, org.opennms.features.openconfig.proto.gnmi.GnmiExt.RoleOrBuilder> 
          getRoleFieldBuilder() {
        if (roleBuilder_ == null) {
          roleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role, org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role.Builder, org.opennms.features.openconfig.proto.gnmi.GnmiExt.RoleOrBuilder>(
                  getRole(),
                  getParentForChildren(),
                  isClean());
          role_ = null;
        }
        return roleBuilder_;
      }

      private org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 electionId_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128, org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128.Builder, org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128OrBuilder> electionIdBuilder_;
      /**
       * <code>.gnmi_ext.Uint128 election_id = 2;</code>
       * @return Whether the electionId field is set.
       */
      public boolean hasElectionId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.gnmi_ext.Uint128 election_id = 2;</code>
       * @return The electionId.
       */
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 getElectionId() {
        if (electionIdBuilder_ == null) {
          return electionId_ == null ? org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128.getDefaultInstance() : electionId_;
        } else {
          return electionIdBuilder_.getMessage();
        }
      }
      /**
       * <code>.gnmi_ext.Uint128 election_id = 2;</code>
       */
      public Builder setElectionId(org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 value) {
        if (electionIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          electionId_ = value;
        } else {
          electionIdBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.gnmi_ext.Uint128 election_id = 2;</code>
       */
      public Builder setElectionId(
          org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128.Builder builderForValue) {
        if (electionIdBuilder_ == null) {
          electionId_ = builderForValue.build();
        } else {
          electionIdBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.gnmi_ext.Uint128 election_id = 2;</code>
       */
      public Builder mergeElectionId(org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 value) {
        if (electionIdBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            electionId_ != null &&
            electionId_ != org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128.getDefaultInstance()) {
            getElectionIdBuilder().mergeFrom(value);
          } else {
            electionId_ = value;
          }
        } else {
          electionIdBuilder_.mergeFrom(value);
        }
        if (electionId_ != null) {
          bitField0_ |= 0x00000002;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.gnmi_ext.Uint128 election_id = 2;</code>
       */
      public Builder clearElectionId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        electionId_ = null;
        if (electionIdBuilder_ != null) {
          electionIdBuilder_.dispose();
          electionIdBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.gnmi_ext.Uint128 election_id = 2;</code>
       */
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128.Builder getElectionIdBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getElectionIdFieldBuilder().getBuilder();
      }
      /**
       * <code>.gnmi_ext.Uint128 election_id = 2;</code>
       */
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128OrBuilder getElectionIdOrBuilder() {
        if (electionIdBuilder_ != null) {
          return electionIdBuilder_.getMessageOrBuilder();
        } else {
          return electionId_ == null ?
              org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128.getDefaultInstance() : electionId_;
        }
      }
      /**
       * <code>.gnmi_ext.Uint128 election_id = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128, org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128.Builder, org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128OrBuilder> 
          getElectionIdFieldBuilder() {
        if (electionIdBuilder_ == null) {
          electionIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128, org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128.Builder, org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128OrBuilder>(
                  getElectionId(),
                  getParentForChildren(),
                  isClean());
          electionId_ = null;
        }
        return electionIdBuilder_;
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


      // @@protoc_insertion_point(builder_scope:gnmi_ext.MasterArbitration)
    }

    // @@protoc_insertion_point(class_scope:gnmi_ext.MasterArbitration)
    private static final org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration();
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MasterArbitration>
        PARSER = new com.google.protobuf.AbstractParser<MasterArbitration>() {
      @java.lang.Override
      public MasterArbitration parsePartialFrom(
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

    public static com.google.protobuf.Parser<MasterArbitration> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MasterArbitration> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.gnmi.GnmiExt.MasterArbitration getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface Uint128OrBuilder extends
      // @@protoc_insertion_point(interface_extends:gnmi_ext.Uint128)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 high = 1;</code>
     * @return The high.
     */
    long getHigh();

    /**
     * <code>uint64 low = 2;</code>
     * @return The low.
     */
    long getLow();
  }
  /**
   * <pre>
   * Representation of unsigned 128-bit integer.
   * </pre>
   *
   * Protobuf type {@code gnmi_ext.Uint128}
   */
  public static final class Uint128 extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gnmi_ext.Uint128)
      Uint128OrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Uint128.newBuilder() to construct.
    private Uint128(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Uint128() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Uint128();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_Uint128_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_Uint128_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128.class, org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128.Builder.class);
    }

    public static final int HIGH_FIELD_NUMBER = 1;
    private long high_ = 0L;
    /**
     * <code>uint64 high = 1;</code>
     * @return The high.
     */
    @java.lang.Override
    public long getHigh() {
      return high_;
    }

    public static final int LOW_FIELD_NUMBER = 2;
    private long low_ = 0L;
    /**
     * <code>uint64 low = 2;</code>
     * @return The low.
     */
    @java.lang.Override
    public long getLow() {
      return low_;
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
      if (high_ != 0L) {
        output.writeUInt64(1, high_);
      }
      if (low_ != 0L) {
        output.writeUInt64(2, low_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (high_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, high_);
      }
      if (low_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, low_);
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 other = (org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128) obj;

      if (getHigh()
          != other.getHigh()) return false;
      if (getLow()
          != other.getLow()) return false;
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
      hash = (37 * hash) + HIGH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getHigh());
      hash = (37 * hash) + LOW_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getLow());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 prototype) {
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
     * Representation of unsigned 128-bit integer.
     * </pre>
     *
     * Protobuf type {@code gnmi_ext.Uint128}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gnmi_ext.Uint128)
        org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_Uint128_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_Uint128_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128.class, org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128.newBuilder()
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
        high_ = 0L;
        low_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_Uint128_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 build() {
        org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 buildPartial() {
        org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 result = new org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.high_ = high_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.low_ = low_;
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
        if (other instanceof org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128) {
          return mergeFrom((org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 other) {
        if (other == org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128.getDefaultInstance()) return this;
        if (other.getHigh() != 0L) {
          setHigh(other.getHigh());
        }
        if (other.getLow() != 0L) {
          setLow(other.getLow());
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
                high_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                low_ = input.readUInt64();
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

      private long high_ ;
      /**
       * <code>uint64 high = 1;</code>
       * @return The high.
       */
      @java.lang.Override
      public long getHigh() {
        return high_;
      }
      /**
       * <code>uint64 high = 1;</code>
       * @param value The high to set.
       * @return This builder for chaining.
       */
      public Builder setHigh(long value) {

        high_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 high = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearHigh() {
        bitField0_ = (bitField0_ & ~0x00000001);
        high_ = 0L;
        onChanged();
        return this;
      }

      private long low_ ;
      /**
       * <code>uint64 low = 2;</code>
       * @return The low.
       */
      @java.lang.Override
      public long getLow() {
        return low_;
      }
      /**
       * <code>uint64 low = 2;</code>
       * @param value The low to set.
       * @return This builder for chaining.
       */
      public Builder setLow(long value) {

        low_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 low = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLow() {
        bitField0_ = (bitField0_ & ~0x00000002);
        low_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:gnmi_ext.Uint128)
    }

    // @@protoc_insertion_point(class_scope:gnmi_ext.Uint128)
    private static final org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128();
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Uint128>
        PARSER = new com.google.protobuf.AbstractParser<Uint128>() {
      @java.lang.Override
      public Uint128 parsePartialFrom(
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

    public static com.google.protobuf.Parser<Uint128> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Uint128> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Uint128 getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RoleOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gnmi_ext.Role)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * More fields can be added if needed, for example, to specify what paths the
     * role can read/write.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    java.lang.String getId();
    /**
     * <pre>
     * More fields can be added if needed, for example, to specify what paths the
     * role can read/write.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    com.google.protobuf.ByteString
        getIdBytes();
  }
  /**
   * <pre>
   * There can be one master for each role. The role is identified by its id.
   * </pre>
   *
   * Protobuf type {@code gnmi_ext.Role}
   */
  public static final class Role extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gnmi_ext.Role)
      RoleOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Role.newBuilder() to construct.
    private Role(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Role() {
      id_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Role();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_Role_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_Role_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role.class, org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object id_ = "";
    /**
     * <pre>
     * More fields can be added if needed, for example, to specify what paths the
     * role can read/write.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * More fields can be added if needed, for example, to specify what paths the
     * role can read/write.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role other = (org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role) obj;

      if (!getId()
          .equals(other.getId())) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role prototype) {
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
     * There can be one master for each role. The role is identified by its id.
     * </pre>
     *
     * Protobuf type {@code gnmi_ext.Role}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gnmi_ext.Role)
        org.opennms.features.openconfig.proto.gnmi.GnmiExt.RoleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_Role_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_Role_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role.class, org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role.newBuilder()
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
        id_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.internal_static_gnmi_ext_Role_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role build() {
        org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role buildPartial() {
        org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role result = new org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
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
        if (other instanceof org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role) {
          return mergeFrom((org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role other) {
        if (other == org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role.getDefaultInstance()) return this;
        if (!other.getId().isEmpty()) {
          id_ = other.id_;
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
                id_ = input.readStringRequireUtf8();
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

      private java.lang.Object id_ = "";
      /**
       * <pre>
       * More fields can be added if needed, for example, to specify what paths the
       * role can read/write.
       * </pre>
       *
       * <code>string id = 1;</code>
       * @return The id.
       */
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * More fields can be added if needed, for example, to specify what paths the
       * role can read/write.
       * </pre>
       *
       * <code>string id = 1;</code>
       * @return The bytes for id.
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * More fields can be added if needed, for example, to specify what paths the
       * role can read/write.
       * </pre>
       *
       * <code>string id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        id_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * More fields can be added if needed, for example, to specify what paths the
       * role can read/write.
       * </pre>
       *
       * <code>string id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        id_ = getDefaultInstance().getId();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * More fields can be added if needed, for example, to specify what paths the
       * role can read/write.
       * </pre>
       *
       * <code>string id = 1;</code>
       * @param value The bytes for id to set.
       * @return This builder for chaining.
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        id_ = value;
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


      // @@protoc_insertion_point(builder_scope:gnmi_ext.Role)
    }

    // @@protoc_insertion_point(class_scope:gnmi_ext.Role)
    private static final org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role();
    }

    public static org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Role>
        PARSER = new com.google.protobuf.AbstractParser<Role>() {
      @java.lang.Override
      public Role parsePartialFrom(
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

    public static com.google.protobuf.Parser<Role> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Role> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.gnmi.GnmiExt.Role getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gnmi_ext_Extension_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gnmi_ext_Extension_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gnmi_ext_RegisteredExtension_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gnmi_ext_RegisteredExtension_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gnmi_ext_MasterArbitration_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gnmi_ext_MasterArbitration_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gnmi_ext_Uint128_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gnmi_ext_Uint128_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gnmi_ext_Role_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gnmi_ext_Role_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016gnmi_ext.proto\022\010gnmi_ext\"\206\001\n\tExtension" +
      "\0227\n\016registered_ext\030\001 \001(\0132\035.gnmi_ext.Regi" +
      "steredExtensionH\000\0229\n\022master_arbitration\030" +
      "\002 \001(\0132\033.gnmi_ext.MasterArbitrationH\000B\005\n\003" +
      "ext\"E\n\023RegisteredExtension\022!\n\002id\030\001 \001(\0162\025" +
      ".gnmi_ext.ExtensionID\022\013\n\003msg\030\002 \001(\014\"Y\n\021Ma" +
      "sterArbitration\022\034\n\004role\030\001 \001(\0132\016.gnmi_ext" +
      ".Role\022&\n\013election_id\030\002 \001(\0132\021.gnmi_ext.Ui" +
      "nt128\"$\n\007Uint128\022\014\n\004high\030\001 \001(\004\022\013\n\003low\030\002 " +
      "\001(\004\"\022\n\004Role\022\n\n\002id\030\001 \001(\t*3\n\013ExtensionID\022\r" +
      "\n\tEID_UNSET\020\000\022\025\n\020EID_EXPERIMENTAL\020\347\007BW\n*" +
      "org.opennms.features.openconfig.proto.gn" +
      "miZ)github.com/openconfig/gnmi/proto/gnm" +
      "i_extb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_gnmi_ext_Extension_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gnmi_ext_Extension_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gnmi_ext_Extension_descriptor,
        new java.lang.String[] { "RegisteredExt", "MasterArbitration", "Ext", });
    internal_static_gnmi_ext_RegisteredExtension_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_gnmi_ext_RegisteredExtension_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gnmi_ext_RegisteredExtension_descriptor,
        new java.lang.String[] { "Id", "Msg", });
    internal_static_gnmi_ext_MasterArbitration_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_gnmi_ext_MasterArbitration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gnmi_ext_MasterArbitration_descriptor,
        new java.lang.String[] { "Role", "ElectionId", });
    internal_static_gnmi_ext_Uint128_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_gnmi_ext_Uint128_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gnmi_ext_Uint128_descriptor,
        new java.lang.String[] { "High", "Low", });
    internal_static_gnmi_ext_Role_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_gnmi_ext_Role_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gnmi_ext_Role_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
