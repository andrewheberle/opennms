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
package org.opennms.features.openconfig.proto.jti;

public final class Telemetry {
  private Telemetry() {}
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
   * Result of the operation
   * </pre>
   *
   * Protobuf enum {@code telemetry.ReturnCode}
   */
  public enum ReturnCode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SUCCESS = 0;</code>
     */
    SUCCESS(0),
    /**
     * <code>NO_SUBSCRIPTION_ENTRY = 1;</code>
     */
    NO_SUBSCRIPTION_ENTRY(1),
    /**
     * <code>UNKNOWN_ERROR = 2;</code>
     */
    UNKNOWN_ERROR(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>SUCCESS = 0;</code>
     */
    public static final int SUCCESS_VALUE = 0;
    /**
     * <code>NO_SUBSCRIPTION_ENTRY = 1;</code>
     */
    public static final int NO_SUBSCRIPTION_ENTRY_VALUE = 1;
    /**
     * <code>UNKNOWN_ERROR = 2;</code>
     */
    public static final int UNKNOWN_ERROR_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static ReturnCode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ReturnCode forNumber(int value) {
      switch (value) {
        case 0: return SUCCESS;
        case 1: return NO_SUBSCRIPTION_ENTRY;
        case 2: return UNKNOWN_ERROR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ReturnCode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ReturnCode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ReturnCode>() {
            public ReturnCode findValueByNumber(int number) {
              return ReturnCode.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new IllegalStateException(
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
      return Telemetry.getDescriptor().getEnumTypes().get(0);
    }

    private static final ReturnCode[] VALUES = values();

    public static ReturnCode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ReturnCode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:telemetry.ReturnCode)
  }

  /**
   * <pre>
   * Verbosity Level
   * </pre>
   *
   * Protobuf enum {@code telemetry.VerbosityLevel}
   */
  public enum VerbosityLevel
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DETAIL = 0;</code>
     */
    DETAIL(0),
    /**
     * <code>TERSE = 1;</code>
     */
    TERSE(1),
    /**
     * <code>BRIEF = 2;</code>
     */
    BRIEF(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>DETAIL = 0;</code>
     */
    public static final int DETAIL_VALUE = 0;
    /**
     * <code>TERSE = 1;</code>
     */
    public static final int TERSE_VALUE = 1;
    /**
     * <code>BRIEF = 2;</code>
     */
    public static final int BRIEF_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new IllegalArgumentException(
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
    public static VerbosityLevel valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static VerbosityLevel forNumber(int value) {
      switch (value) {
        case 0: return DETAIL;
        case 1: return TERSE;
        case 2: return BRIEF;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<VerbosityLevel>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        VerbosityLevel> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<VerbosityLevel>() {
            public VerbosityLevel findValueByNumber(int number) {
              return VerbosityLevel.forNumber(number);
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
      return org.opennms.features.openconfig.proto.jti.Telemetry.getDescriptor().getEnumTypes().get(1);
    }

    private static final VerbosityLevel[] VALUES = values();

    public static VerbosityLevel valueOf(
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

    private VerbosityLevel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:telemetry.VerbosityLevel)
  }

  /**
   * <pre>
   * Encoding Type Supported
   * </pre>
   *
   * Protobuf enum {@code telemetry.EncodingType}
   */
  public enum EncodingType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNDEFINED = 0;</code>
     */
    UNDEFINED(0),
    /**
     * <code>XML = 1;</code>
     */
    XML(1),
    /**
     * <code>JSON_IETF = 2;</code>
     */
    JSON_IETF(2),
    /**
     * <code>PROTO3 = 3;</code>
     */
    PROTO3(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNDEFINED = 0;</code>
     */
    public static final int UNDEFINED_VALUE = 0;
    /**
     * <code>XML = 1;</code>
     */
    public static final int XML_VALUE = 1;
    /**
     * <code>JSON_IETF = 2;</code>
     */
    public static final int JSON_IETF_VALUE = 2;
    /**
     * <code>PROTO3 = 3;</code>
     */
    public static final int PROTO3_VALUE = 3;


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
    public static EncodingType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EncodingType forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED;
        case 1: return XML;
        case 2: return JSON_IETF;
        case 3: return PROTO3;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EncodingType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EncodingType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EncodingType>() {
            public EncodingType findValueByNumber(int number) {
              return EncodingType.forNumber(number);
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
      return org.opennms.features.openconfig.proto.jti.Telemetry.getDescriptor().getEnumTypes().get(2);
    }

    private static final EncodingType[] VALUES = values();

    public static EncodingType valueOf(
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

    private EncodingType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:telemetry.EncodingType)
  }

  public interface SubscriptionRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.SubscriptionRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Data associated with a telemetry subscription
     * </pre>
     *
     * <code>.telemetry.SubscriptionInput input = 1;</code>
     * @return Whether the input field is set.
     */
    boolean hasInput();
    /**
     * <pre>
     * Data associated with a telemetry subscription
     * </pre>
     *
     * <code>.telemetry.SubscriptionInput input = 1;</code>
     * @return The input.
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput getInput();
    /**
     * <pre>
     * Data associated with a telemetry subscription
     * </pre>
     *
     * <code>.telemetry.SubscriptionInput input = 1;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInputOrBuilder getInputOrBuilder();

    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Path> 
        getPathListList();
    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.Path getPathList(int index);
    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    int getPathListCount();
    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder> 
        getPathListOrBuilderList();
    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder getPathListOrBuilder(
        int index);

    /**
     * <pre>
     * The below configuration is not defined in Openconfig RPC.
     * It is a proposed extension to configure additional
     * subscription request features.
     * </pre>
     *
     * <code>.telemetry.SubscriptionAdditionalConfig additional_config = 3;</code>
     * @return Whether the additionalConfig field is set.
     */
    boolean hasAdditionalConfig();
    /**
     * <pre>
     * The below configuration is not defined in Openconfig RPC.
     * It is a proposed extension to configure additional
     * subscription request features.
     * </pre>
     *
     * <code>.telemetry.SubscriptionAdditionalConfig additional_config = 3;</code>
     * @return The additionalConfig.
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig getAdditionalConfig();
    /**
     * <pre>
     * The below configuration is not defined in Openconfig RPC.
     * It is a proposed extension to configure additional
     * subscription request features.
     * </pre>
     *
     * <code>.telemetry.SubscriptionAdditionalConfig additional_config = 3;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfigOrBuilder getAdditionalConfigOrBuilder();
  }
  /**
   * <pre>
   * Message sent for a telemetry subscription request
   * </pre>
   *
   * Protobuf type {@code telemetry.SubscriptionRequest}
   */
  public static final class SubscriptionRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.SubscriptionRequest)
      SubscriptionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SubscriptionRequest.newBuilder() to construct.
    private SubscriptionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SubscriptionRequest() {
      pathList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SubscriptionRequest();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest.class, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest.Builder.class);
    }

    private int bitField0_;
    public static final int INPUT_FIELD_NUMBER = 1;
    private org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput input_;
    /**
     * <pre>
     * Data associated with a telemetry subscription
     * </pre>
     *
     * <code>.telemetry.SubscriptionInput input = 1;</code>
     * @return Whether the input field is set.
     */
    @java.lang.Override
    public boolean hasInput() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Data associated with a telemetry subscription
     * </pre>
     *
     * <code>.telemetry.SubscriptionInput input = 1;</code>
     * @return The input.
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput getInput() {
      return input_ == null ? org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput.getDefaultInstance() : input_;
    }
    /**
     * <pre>
     * Data associated with a telemetry subscription
     * </pre>
     *
     * <code>.telemetry.SubscriptionInput input = 1;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInputOrBuilder getInputOrBuilder() {
      return input_ == null ? org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput.getDefaultInstance() : input_;
    }

    public static final int PATH_LIST_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Path> pathList_;
    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Path> getPathListList() {
      return pathList_;
    }
    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder> 
        getPathListOrBuilderList() {
      return pathList_;
    }
    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    @java.lang.Override
    public int getPathListCount() {
      return pathList_.size();
    }
    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.Path getPathList(int index) {
      return pathList_.get(index);
    }
    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder getPathListOrBuilder(
        int index) {
      return pathList_.get(index);
    }

    public static final int ADDITIONAL_CONFIG_FIELD_NUMBER = 3;
    private org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig additionalConfig_;
    /**
     * <pre>
     * The below configuration is not defined in Openconfig RPC.
     * It is a proposed extension to configure additional
     * subscription request features.
     * </pre>
     *
     * <code>.telemetry.SubscriptionAdditionalConfig additional_config = 3;</code>
     * @return Whether the additionalConfig field is set.
     */
    @java.lang.Override
    public boolean hasAdditionalConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The below configuration is not defined in Openconfig RPC.
     * It is a proposed extension to configure additional
     * subscription request features.
     * </pre>
     *
     * <code>.telemetry.SubscriptionAdditionalConfig additional_config = 3;</code>
     * @return The additionalConfig.
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig getAdditionalConfig() {
      return additionalConfig_ == null ? org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig.getDefaultInstance() : additionalConfig_;
    }
    /**
     * <pre>
     * The below configuration is not defined in Openconfig RPC.
     * It is a proposed extension to configure additional
     * subscription request features.
     * </pre>
     *
     * <code>.telemetry.SubscriptionAdditionalConfig additional_config = 3;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfigOrBuilder getAdditionalConfigOrBuilder() {
      return additionalConfig_ == null ? org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig.getDefaultInstance() : additionalConfig_;
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
        output.writeMessage(1, getInput());
      }
      for (int i = 0; i < pathList_.size(); i++) {
        output.writeMessage(2, pathList_.get(i));
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(3, getAdditionalConfig());
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
          .computeMessageSize(1, getInput());
      }
      for (int i = 0; i < pathList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, pathList_.get(i));
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getAdditionalConfig());
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest other = (org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest) obj;

      if (hasInput() != other.hasInput()) return false;
      if (hasInput()) {
        if (!getInput()
            .equals(other.getInput())) return false;
      }
      if (!getPathListList()
          .equals(other.getPathListList())) return false;
      if (hasAdditionalConfig() != other.hasAdditionalConfig()) return false;
      if (hasAdditionalConfig()) {
        if (!getAdditionalConfig()
            .equals(other.getAdditionalConfig())) return false;
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
      if (hasInput()) {
        hash = (37 * hash) + INPUT_FIELD_NUMBER;
        hash = (53 * hash) + getInput().hashCode();
      }
      if (getPathListCount() > 0) {
        hash = (37 * hash) + PATH_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPathListList().hashCode();
      }
      if (hasAdditionalConfig()) {
        hash = (37 * hash) + ADDITIONAL_CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getAdditionalConfig().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest prototype) {
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
     * Message sent for a telemetry subscription request
     * </pre>
     *
     * Protobuf type {@code telemetry.SubscriptionRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.SubscriptionRequest)
        org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest.class, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest.newBuilder()
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
          getInputFieldBuilder();
          getPathListFieldBuilder();
          getAdditionalConfigFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        input_ = null;
        if (inputBuilder_ != null) {
          inputBuilder_.dispose();
          inputBuilder_ = null;
        }
        if (pathListBuilder_ == null) {
          pathList_ = java.util.Collections.emptyList();
        } else {
          pathList_ = null;
          pathListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        additionalConfig_ = null;
        if (additionalConfigBuilder_ != null) {
          additionalConfigBuilder_.dispose();
          additionalConfigBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionRequest_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest result = new org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest result) {
        if (pathListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            pathList_ = java.util.Collections.unmodifiableList(pathList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.pathList_ = pathList_;
        } else {
          result.pathList_ = pathListBuilder_.build();
        }
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.input_ = inputBuilder_ == null
              ? input_
              : inputBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.additionalConfig_ = additionalConfigBuilder_ == null
              ? additionalConfig_
              : additionalConfigBuilder_.build();
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
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest.getDefaultInstance()) return this;
        if (other.hasInput()) {
          mergeInput(other.getInput());
        }
        if (pathListBuilder_ == null) {
          if (!other.pathList_.isEmpty()) {
            if (pathList_.isEmpty()) {
              pathList_ = other.pathList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensurePathListIsMutable();
              pathList_.addAll(other.pathList_);
            }
            onChanged();
          }
        } else {
          if (!other.pathList_.isEmpty()) {
            if (pathListBuilder_.isEmpty()) {
              pathListBuilder_.dispose();
              pathListBuilder_ = null;
              pathList_ = other.pathList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              pathListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPathListFieldBuilder() : null;
            } else {
              pathListBuilder_.addAllMessages(other.pathList_);
            }
          }
        }
        if (other.hasAdditionalConfig()) {
          mergeAdditionalConfig(other.getAdditionalConfig());
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
                    getInputFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                org.opennms.features.openconfig.proto.jti.Telemetry.Path m =
                    input.readMessage(
                        org.opennms.features.openconfig.proto.jti.Telemetry.Path.parser(),
                        extensionRegistry);
                if (pathListBuilder_ == null) {
                  ensurePathListIsMutable();
                  pathList_.add(m);
                } else {
                  pathListBuilder_.addMessage(m);
                }
                break;
              } // case 18
              case 26: {
                input.readMessage(
                    getAdditionalConfigFieldBuilder().getBuilder(),
                    extensionRegistry);
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

      private org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput input_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInputOrBuilder> inputBuilder_;
      /**
       * <pre>
       * Data associated with a telemetry subscription
       * </pre>
       *
       * <code>.telemetry.SubscriptionInput input = 1;</code>
       * @return Whether the input field is set.
       */
      public boolean hasInput() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Data associated with a telemetry subscription
       * </pre>
       *
       * <code>.telemetry.SubscriptionInput input = 1;</code>
       * @return The input.
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput getInput() {
        if (inputBuilder_ == null) {
          return input_ == null ? org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput.getDefaultInstance() : input_;
        } else {
          return inputBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Data associated with a telemetry subscription
       * </pre>
       *
       * <code>.telemetry.SubscriptionInput input = 1;</code>
       */
      public Builder setInput(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput value) {
        if (inputBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          input_ = value;
        } else {
          inputBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Data associated with a telemetry subscription
       * </pre>
       *
       * <code>.telemetry.SubscriptionInput input = 1;</code>
       */
      public Builder setInput(
          org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput.Builder builderForValue) {
        if (inputBuilder_ == null) {
          input_ = builderForValue.build();
        } else {
          inputBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Data associated with a telemetry subscription
       * </pre>
       *
       * <code>.telemetry.SubscriptionInput input = 1;</code>
       */
      public Builder mergeInput(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput value) {
        if (inputBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            input_ != null &&
            input_ != org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput.getDefaultInstance()) {
            getInputBuilder().mergeFrom(value);
          } else {
            input_ = value;
          }
        } else {
          inputBuilder_.mergeFrom(value);
        }
        if (input_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       * Data associated with a telemetry subscription
       * </pre>
       *
       * <code>.telemetry.SubscriptionInput input = 1;</code>
       */
      public Builder clearInput() {
        bitField0_ = (bitField0_ & ~0x00000001);
        input_ = null;
        if (inputBuilder_ != null) {
          inputBuilder_.dispose();
          inputBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Data associated with a telemetry subscription
       * </pre>
       *
       * <code>.telemetry.SubscriptionInput input = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput.Builder getInputBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getInputFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Data associated with a telemetry subscription
       * </pre>
       *
       * <code>.telemetry.SubscriptionInput input = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInputOrBuilder getInputOrBuilder() {
        if (inputBuilder_ != null) {
          return inputBuilder_.getMessageOrBuilder();
        } else {
          return input_ == null ?
              org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput.getDefaultInstance() : input_;
        }
      }
      /**
       * <pre>
       * Data associated with a telemetry subscription
       * </pre>
       *
       * <code>.telemetry.SubscriptionInput input = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInputOrBuilder> 
          getInputFieldBuilder() {
        if (inputBuilder_ == null) {
          inputBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInputOrBuilder>(
                  getInput(),
                  getParentForChildren(),
                  isClean());
          input_ = null;
        }
        return inputBuilder_;
      }

      private java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Path> pathList_ =
        java.util.Collections.emptyList();
      private void ensurePathListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          pathList_ = new java.util.ArrayList<org.opennms.features.openconfig.proto.jti.Telemetry.Path>(pathList_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.Path, org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder> pathListBuilder_;

      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Path> getPathListList() {
        if (pathListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(pathList_);
        } else {
          return pathListBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public int getPathListCount() {
        if (pathListBuilder_ == null) {
          return pathList_.size();
        } else {
          return pathListBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Path getPathList(int index) {
        if (pathListBuilder_ == null) {
          return pathList_.get(index);
        } else {
          return pathListBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public Builder setPathList(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Path value) {
        if (pathListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePathListIsMutable();
          pathList_.set(index, value);
          onChanged();
        } else {
          pathListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public Builder setPathList(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder builderForValue) {
        if (pathListBuilder_ == null) {
          ensurePathListIsMutable();
          pathList_.set(index, builderForValue.build());
          onChanged();
        } else {
          pathListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public Builder addPathList(org.opennms.features.openconfig.proto.jti.Telemetry.Path value) {
        if (pathListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePathListIsMutable();
          pathList_.add(value);
          onChanged();
        } else {
          pathListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public Builder addPathList(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Path value) {
        if (pathListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePathListIsMutable();
          pathList_.add(index, value);
          onChanged();
        } else {
          pathListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public Builder addPathList(
          org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder builderForValue) {
        if (pathListBuilder_ == null) {
          ensurePathListIsMutable();
          pathList_.add(builderForValue.build());
          onChanged();
        } else {
          pathListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public Builder addPathList(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder builderForValue) {
        if (pathListBuilder_ == null) {
          ensurePathListIsMutable();
          pathList_.add(index, builderForValue.build());
          onChanged();
        } else {
          pathListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public Builder addAllPathList(
          java.lang.Iterable<? extends org.opennms.features.openconfig.proto.jti.Telemetry.Path> values) {
        if (pathListBuilder_ == null) {
          ensurePathListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, pathList_);
          onChanged();
        } else {
          pathListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public Builder clearPathList() {
        if (pathListBuilder_ == null) {
          pathList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          pathListBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public Builder removePathList(int index) {
        if (pathListBuilder_ == null) {
          ensurePathListIsMutable();
          pathList_.remove(index);
          onChanged();
        } else {
          pathListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder getPathListBuilder(
          int index) {
        return getPathListFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder getPathListOrBuilder(
          int index) {
        if (pathListBuilder_ == null) {
          return pathList_.get(index);  } else {
          return pathListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder> 
           getPathListOrBuilderList() {
        if (pathListBuilder_ != null) {
          return pathListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(pathList_);
        }
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder addPathListBuilder() {
        return getPathListFieldBuilder().addBuilder(
            org.opennms.features.openconfig.proto.jti.Telemetry.Path.getDefaultInstance());
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder addPathListBuilder(
          int index) {
        return getPathListFieldBuilder().addBuilder(
            index, org.opennms.features.openconfig.proto.jti.Telemetry.Path.getDefaultInstance());
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder> 
           getPathListBuilderList() {
        return getPathListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.Path, org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder> 
          getPathListFieldBuilder() {
        if (pathListBuilder_ == null) {
          pathListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.features.openconfig.proto.jti.Telemetry.Path, org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder>(
                  pathList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          pathList_ = null;
        }
        return pathListBuilder_;
      }

      private org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig additionalConfig_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfigOrBuilder> additionalConfigBuilder_;
      /**
       * <pre>
       * The below configuration is not defined in Openconfig RPC.
       * It is a proposed extension to configure additional
       * subscription request features.
       * </pre>
       *
       * <code>.telemetry.SubscriptionAdditionalConfig additional_config = 3;</code>
       * @return Whether the additionalConfig field is set.
       */
      public boolean hasAdditionalConfig() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * The below configuration is not defined in Openconfig RPC.
       * It is a proposed extension to configure additional
       * subscription request features.
       * </pre>
       *
       * <code>.telemetry.SubscriptionAdditionalConfig additional_config = 3;</code>
       * @return The additionalConfig.
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig getAdditionalConfig() {
        if (additionalConfigBuilder_ == null) {
          return additionalConfig_ == null ? org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig.getDefaultInstance() : additionalConfig_;
        } else {
          return additionalConfigBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The below configuration is not defined in Openconfig RPC.
       * It is a proposed extension to configure additional
       * subscription request features.
       * </pre>
       *
       * <code>.telemetry.SubscriptionAdditionalConfig additional_config = 3;</code>
       */
      public Builder setAdditionalConfig(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig value) {
        if (additionalConfigBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          additionalConfig_ = value;
        } else {
          additionalConfigBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The below configuration is not defined in Openconfig RPC.
       * It is a proposed extension to configure additional
       * subscription request features.
       * </pre>
       *
       * <code>.telemetry.SubscriptionAdditionalConfig additional_config = 3;</code>
       */
      public Builder setAdditionalConfig(
          org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig.Builder builderForValue) {
        if (additionalConfigBuilder_ == null) {
          additionalConfig_ = builderForValue.build();
        } else {
          additionalConfigBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The below configuration is not defined in Openconfig RPC.
       * It is a proposed extension to configure additional
       * subscription request features.
       * </pre>
       *
       * <code>.telemetry.SubscriptionAdditionalConfig additional_config = 3;</code>
       */
      public Builder mergeAdditionalConfig(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig value) {
        if (additionalConfigBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            additionalConfig_ != null &&
            additionalConfig_ != org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig.getDefaultInstance()) {
            getAdditionalConfigBuilder().mergeFrom(value);
          } else {
            additionalConfig_ = value;
          }
        } else {
          additionalConfigBuilder_.mergeFrom(value);
        }
        if (additionalConfig_ != null) {
          bitField0_ |= 0x00000004;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       * The below configuration is not defined in Openconfig RPC.
       * It is a proposed extension to configure additional
       * subscription request features.
       * </pre>
       *
       * <code>.telemetry.SubscriptionAdditionalConfig additional_config = 3;</code>
       */
      public Builder clearAdditionalConfig() {
        bitField0_ = (bitField0_ & ~0x00000004);
        additionalConfig_ = null;
        if (additionalConfigBuilder_ != null) {
          additionalConfigBuilder_.dispose();
          additionalConfigBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The below configuration is not defined in Openconfig RPC.
       * It is a proposed extension to configure additional
       * subscription request features.
       * </pre>
       *
       * <code>.telemetry.SubscriptionAdditionalConfig additional_config = 3;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig.Builder getAdditionalConfigBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getAdditionalConfigFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The below configuration is not defined in Openconfig RPC.
       * It is a proposed extension to configure additional
       * subscription request features.
       * </pre>
       *
       * <code>.telemetry.SubscriptionAdditionalConfig additional_config = 3;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfigOrBuilder getAdditionalConfigOrBuilder() {
        if (additionalConfigBuilder_ != null) {
          return additionalConfigBuilder_.getMessageOrBuilder();
        } else {
          return additionalConfig_ == null ?
              org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig.getDefaultInstance() : additionalConfig_;
        }
      }
      /**
       * <pre>
       * The below configuration is not defined in Openconfig RPC.
       * It is a proposed extension to configure additional
       * subscription request features.
       * </pre>
       *
       * <code>.telemetry.SubscriptionAdditionalConfig additional_config = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfigOrBuilder> 
          getAdditionalConfigFieldBuilder() {
        if (additionalConfigBuilder_ == null) {
          additionalConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfigOrBuilder>(
                  getAdditionalConfig(),
                  getParentForChildren(),
                  isClean());
          additionalConfig_ = null;
        }
        return additionalConfigBuilder_;
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


      // @@protoc_insertion_point(builder_scope:telemetry.SubscriptionRequest)
    }

    // @@protoc_insertion_point(class_scope:telemetry.SubscriptionRequest)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SubscriptionRequest>
        PARSER = new com.google.protobuf.AbstractParser<SubscriptionRequest>() {
      @java.lang.Override
      public SubscriptionRequest parsePartialFrom(
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

    public static com.google.protobuf.Parser<SubscriptionRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SubscriptionRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SubscriptionInputOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.SubscriptionInput)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * List of optional collector endpoints to send data for
     * this subscription.
     * If no collector destinations are specified, the collector
     * destination is assumed to be the requester on the rpc channel.
     * </pre>
     *
     * <code>repeated .telemetry.Collector collector_list = 1;</code>
     */
    java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Collector> 
        getCollectorListList();
    /**
     * <pre>
     * List of optional collector endpoints to send data for
     * this subscription.
     * If no collector destinations are specified, the collector
     * destination is assumed to be the requester on the rpc channel.
     * </pre>
     *
     * <code>repeated .telemetry.Collector collector_list = 1;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.Collector getCollectorList(int index);
    /**
     * <pre>
     * List of optional collector endpoints to send data for
     * this subscription.
     * If no collector destinations are specified, the collector
     * destination is assumed to be the requester on the rpc channel.
     * </pre>
     *
     * <code>repeated .telemetry.Collector collector_list = 1;</code>
     */
    int getCollectorListCount();
    /**
     * <pre>
     * List of optional collector endpoints to send data for
     * this subscription.
     * If no collector destinations are specified, the collector
     * destination is assumed to be the requester on the rpc channel.
     * </pre>
     *
     * <code>repeated .telemetry.Collector collector_list = 1;</code>
     */
    java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.CollectorOrBuilder> 
        getCollectorListOrBuilderList();
    /**
     * <pre>
     * List of optional collector endpoints to send data for
     * this subscription.
     * If no collector destinations are specified, the collector
     * destination is assumed to be the requester on the rpc channel.
     * </pre>
     *
     * <code>repeated .telemetry.Collector collector_list = 1;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.CollectorOrBuilder getCollectorListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Data associated with a telemetry subscription
   * </pre>
   *
   * Protobuf type {@code telemetry.SubscriptionInput}
   */
  public static final class SubscriptionInput extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.SubscriptionInput)
      SubscriptionInputOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SubscriptionInput.newBuilder() to construct.
    private SubscriptionInput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SubscriptionInput() {
      collectorList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SubscriptionInput();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionInput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput.class, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput.Builder.class);
    }

    public static final int COLLECTOR_LIST_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Collector> collectorList_;
    /**
     * <pre>
     * List of optional collector endpoints to send data for
     * this subscription.
     * If no collector destinations are specified, the collector
     * destination is assumed to be the requester on the rpc channel.
     * </pre>
     *
     * <code>repeated .telemetry.Collector collector_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Collector> getCollectorListList() {
      return collectorList_;
    }
    /**
     * <pre>
     * List of optional collector endpoints to send data for
     * this subscription.
     * If no collector destinations are specified, the collector
     * destination is assumed to be the requester on the rpc channel.
     * </pre>
     *
     * <code>repeated .telemetry.Collector collector_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.CollectorOrBuilder> 
        getCollectorListOrBuilderList() {
      return collectorList_;
    }
    /**
     * <pre>
     * List of optional collector endpoints to send data for
     * this subscription.
     * If no collector destinations are specified, the collector
     * destination is assumed to be the requester on the rpc channel.
     * </pre>
     *
     * <code>repeated .telemetry.Collector collector_list = 1;</code>
     */
    @java.lang.Override
    public int getCollectorListCount() {
      return collectorList_.size();
    }
    /**
     * <pre>
     * List of optional collector endpoints to send data for
     * this subscription.
     * If no collector destinations are specified, the collector
     * destination is assumed to be the requester on the rpc channel.
     * </pre>
     *
     * <code>repeated .telemetry.Collector collector_list = 1;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.Collector getCollectorList(int index) {
      return collectorList_.get(index);
    }
    /**
     * <pre>
     * List of optional collector endpoints to send data for
     * this subscription.
     * If no collector destinations are specified, the collector
     * destination is assumed to be the requester on the rpc channel.
     * </pre>
     *
     * <code>repeated .telemetry.Collector collector_list = 1;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.CollectorOrBuilder getCollectorListOrBuilder(
        int index) {
      return collectorList_.get(index);
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
      for (int i = 0; i < collectorList_.size(); i++) {
        output.writeMessage(1, collectorList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < collectorList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, collectorList_.get(i));
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput other = (org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput) obj;

      if (!getCollectorListList()
          .equals(other.getCollectorListList())) return false;
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
      if (getCollectorListCount() > 0) {
        hash = (37 * hash) + COLLECTOR_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCollectorListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput prototype) {
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
     * Data associated with a telemetry subscription
     * </pre>
     *
     * Protobuf type {@code telemetry.SubscriptionInput}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.SubscriptionInput)
        org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInputOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionInput_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionInput_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput.class, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput.newBuilder()
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
        if (collectorListBuilder_ == null) {
          collectorList_ = java.util.Collections.emptyList();
        } else {
          collectorList_ = null;
          collectorListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionInput_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput result = new org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput result) {
        if (collectorListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            collectorList_ = java.util.Collections.unmodifiableList(collectorList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.collectorList_ = collectorList_;
        } else {
          result.collectorList_ = collectorListBuilder_.build();
        }
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput result) {
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
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput.getDefaultInstance()) return this;
        if (collectorListBuilder_ == null) {
          if (!other.collectorList_.isEmpty()) {
            if (collectorList_.isEmpty()) {
              collectorList_ = other.collectorList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureCollectorListIsMutable();
              collectorList_.addAll(other.collectorList_);
            }
            onChanged();
          }
        } else {
          if (!other.collectorList_.isEmpty()) {
            if (collectorListBuilder_.isEmpty()) {
              collectorListBuilder_.dispose();
              collectorListBuilder_ = null;
              collectorList_ = other.collectorList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              collectorListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCollectorListFieldBuilder() : null;
            } else {
              collectorListBuilder_.addAllMessages(other.collectorList_);
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
                org.opennms.features.openconfig.proto.jti.Telemetry.Collector m =
                    input.readMessage(
                        org.opennms.features.openconfig.proto.jti.Telemetry.Collector.parser(),
                        extensionRegistry);
                if (collectorListBuilder_ == null) {
                  ensureCollectorListIsMutable();
                  collectorList_.add(m);
                } else {
                  collectorListBuilder_.addMessage(m);
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

      private java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Collector> collectorList_ =
        java.util.Collections.emptyList();
      private void ensureCollectorListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          collectorList_ = new java.util.ArrayList<org.opennms.features.openconfig.proto.jti.Telemetry.Collector>(collectorList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.Collector, org.opennms.features.openconfig.proto.jti.Telemetry.Collector.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.CollectorOrBuilder> collectorListBuilder_;

      /**
       * <pre>
       * List of optional collector endpoints to send data for
       * this subscription.
       * If no collector destinations are specified, the collector
       * destination is assumed to be the requester on the rpc channel.
       * </pre>
       *
       * <code>repeated .telemetry.Collector collector_list = 1;</code>
       */
      public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Collector> getCollectorListList() {
        if (collectorListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(collectorList_);
        } else {
          return collectorListBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * List of optional collector endpoints to send data for
       * this subscription.
       * If no collector destinations are specified, the collector
       * destination is assumed to be the requester on the rpc channel.
       * </pre>
       *
       * <code>repeated .telemetry.Collector collector_list = 1;</code>
       */
      public int getCollectorListCount() {
        if (collectorListBuilder_ == null) {
          return collectorList_.size();
        } else {
          return collectorListBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * List of optional collector endpoints to send data for
       * this subscription.
       * If no collector destinations are specified, the collector
       * destination is assumed to be the requester on the rpc channel.
       * </pre>
       *
       * <code>repeated .telemetry.Collector collector_list = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Collector getCollectorList(int index) {
        if (collectorListBuilder_ == null) {
          return collectorList_.get(index);
        } else {
          return collectorListBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * List of optional collector endpoints to send data for
       * this subscription.
       * If no collector destinations are specified, the collector
       * destination is assumed to be the requester on the rpc channel.
       * </pre>
       *
       * <code>repeated .telemetry.Collector collector_list = 1;</code>
       */
      public Builder setCollectorList(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Collector value) {
        if (collectorListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCollectorListIsMutable();
          collectorList_.set(index, value);
          onChanged();
        } else {
          collectorListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * List of optional collector endpoints to send data for
       * this subscription.
       * If no collector destinations are specified, the collector
       * destination is assumed to be the requester on the rpc channel.
       * </pre>
       *
       * <code>repeated .telemetry.Collector collector_list = 1;</code>
       */
      public Builder setCollectorList(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Collector.Builder builderForValue) {
        if (collectorListBuilder_ == null) {
          ensureCollectorListIsMutable();
          collectorList_.set(index, builderForValue.build());
          onChanged();
        } else {
          collectorListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of optional collector endpoints to send data for
       * this subscription.
       * If no collector destinations are specified, the collector
       * destination is assumed to be the requester on the rpc channel.
       * </pre>
       *
       * <code>repeated .telemetry.Collector collector_list = 1;</code>
       */
      public Builder addCollectorList(org.opennms.features.openconfig.proto.jti.Telemetry.Collector value) {
        if (collectorListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCollectorListIsMutable();
          collectorList_.add(value);
          onChanged();
        } else {
          collectorListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * List of optional collector endpoints to send data for
       * this subscription.
       * If no collector destinations are specified, the collector
       * destination is assumed to be the requester on the rpc channel.
       * </pre>
       *
       * <code>repeated .telemetry.Collector collector_list = 1;</code>
       */
      public Builder addCollectorList(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Collector value) {
        if (collectorListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCollectorListIsMutable();
          collectorList_.add(index, value);
          onChanged();
        } else {
          collectorListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * List of optional collector endpoints to send data for
       * this subscription.
       * If no collector destinations are specified, the collector
       * destination is assumed to be the requester on the rpc channel.
       * </pre>
       *
       * <code>repeated .telemetry.Collector collector_list = 1;</code>
       */
      public Builder addCollectorList(
          org.opennms.features.openconfig.proto.jti.Telemetry.Collector.Builder builderForValue) {
        if (collectorListBuilder_ == null) {
          ensureCollectorListIsMutable();
          collectorList_.add(builderForValue.build());
          onChanged();
        } else {
          collectorListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of optional collector endpoints to send data for
       * this subscription.
       * If no collector destinations are specified, the collector
       * destination is assumed to be the requester on the rpc channel.
       * </pre>
       *
       * <code>repeated .telemetry.Collector collector_list = 1;</code>
       */
      public Builder addCollectorList(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Collector.Builder builderForValue) {
        if (collectorListBuilder_ == null) {
          ensureCollectorListIsMutable();
          collectorList_.add(index, builderForValue.build());
          onChanged();
        } else {
          collectorListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of optional collector endpoints to send data for
       * this subscription.
       * If no collector destinations are specified, the collector
       * destination is assumed to be the requester on the rpc channel.
       * </pre>
       *
       * <code>repeated .telemetry.Collector collector_list = 1;</code>
       */
      public Builder addAllCollectorList(
          java.lang.Iterable<? extends org.opennms.features.openconfig.proto.jti.Telemetry.Collector> values) {
        if (collectorListBuilder_ == null) {
          ensureCollectorListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, collectorList_);
          onChanged();
        } else {
          collectorListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * List of optional collector endpoints to send data for
       * this subscription.
       * If no collector destinations are specified, the collector
       * destination is assumed to be the requester on the rpc channel.
       * </pre>
       *
       * <code>repeated .telemetry.Collector collector_list = 1;</code>
       */
      public Builder clearCollectorList() {
        if (collectorListBuilder_ == null) {
          collectorList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          collectorListBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * List of optional collector endpoints to send data for
       * this subscription.
       * If no collector destinations are specified, the collector
       * destination is assumed to be the requester on the rpc channel.
       * </pre>
       *
       * <code>repeated .telemetry.Collector collector_list = 1;</code>
       */
      public Builder removeCollectorList(int index) {
        if (collectorListBuilder_ == null) {
          ensureCollectorListIsMutable();
          collectorList_.remove(index);
          onChanged();
        } else {
          collectorListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * List of optional collector endpoints to send data for
       * this subscription.
       * If no collector destinations are specified, the collector
       * destination is assumed to be the requester on the rpc channel.
       * </pre>
       *
       * <code>repeated .telemetry.Collector collector_list = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Collector.Builder getCollectorListBuilder(
          int index) {
        return getCollectorListFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * List of optional collector endpoints to send data for
       * this subscription.
       * If no collector destinations are specified, the collector
       * destination is assumed to be the requester on the rpc channel.
       * </pre>
       *
       * <code>repeated .telemetry.Collector collector_list = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.CollectorOrBuilder getCollectorListOrBuilder(
          int index) {
        if (collectorListBuilder_ == null) {
          return collectorList_.get(index);  } else {
          return collectorListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * List of optional collector endpoints to send data for
       * this subscription.
       * If no collector destinations are specified, the collector
       * destination is assumed to be the requester on the rpc channel.
       * </pre>
       *
       * <code>repeated .telemetry.Collector collector_list = 1;</code>
       */
      public java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.CollectorOrBuilder> 
           getCollectorListOrBuilderList() {
        if (collectorListBuilder_ != null) {
          return collectorListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(collectorList_);
        }
      }
      /**
       * <pre>
       * List of optional collector endpoints to send data for
       * this subscription.
       * If no collector destinations are specified, the collector
       * destination is assumed to be the requester on the rpc channel.
       * </pre>
       *
       * <code>repeated .telemetry.Collector collector_list = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Collector.Builder addCollectorListBuilder() {
        return getCollectorListFieldBuilder().addBuilder(
            org.opennms.features.openconfig.proto.jti.Telemetry.Collector.getDefaultInstance());
      }
      /**
       * <pre>
       * List of optional collector endpoints to send data for
       * this subscription.
       * If no collector destinations are specified, the collector
       * destination is assumed to be the requester on the rpc channel.
       * </pre>
       *
       * <code>repeated .telemetry.Collector collector_list = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Collector.Builder addCollectorListBuilder(
          int index) {
        return getCollectorListFieldBuilder().addBuilder(
            index, org.opennms.features.openconfig.proto.jti.Telemetry.Collector.getDefaultInstance());
      }
      /**
       * <pre>
       * List of optional collector endpoints to send data for
       * this subscription.
       * If no collector destinations are specified, the collector
       * destination is assumed to be the requester on the rpc channel.
       * </pre>
       *
       * <code>repeated .telemetry.Collector collector_list = 1;</code>
       */
      public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Collector.Builder> 
           getCollectorListBuilderList() {
        return getCollectorListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.Collector, org.opennms.features.openconfig.proto.jti.Telemetry.Collector.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.CollectorOrBuilder> 
          getCollectorListFieldBuilder() {
        if (collectorListBuilder_ == null) {
          collectorListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.features.openconfig.proto.jti.Telemetry.Collector, org.opennms.features.openconfig.proto.jti.Telemetry.Collector.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.CollectorOrBuilder>(
                  collectorList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          collectorList_ = null;
        }
        return collectorListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:telemetry.SubscriptionInput)
    }

    // @@protoc_insertion_point(class_scope:telemetry.SubscriptionInput)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SubscriptionInput>
        PARSER = new com.google.protobuf.AbstractParser<SubscriptionInput>() {
      @java.lang.Override
      public SubscriptionInput parsePartialFrom(
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

    public static com.google.protobuf.Parser<SubscriptionInput> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SubscriptionInput> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionInput getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CollectorOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.Collector)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * IP address of collector endpoint
     * </pre>
     *
     * <code>string address = 1;</code>
     * @return The address.
     */
    java.lang.String getAddress();
    /**
     * <pre>
     * IP address of collector endpoint
     * </pre>
     *
     * <code>string address = 1;</code>
     * @return The bytes for address.
     */
    com.google.protobuf.ByteString
        getAddressBytes();

    /**
     * <pre>
     * Transport protocol port number for the collector destination.
     * </pre>
     *
     * <code>uint32 port = 2;</code>
     * @return The port.
     */
    int getPort();
  }
  /**
   * <pre>
   * Collector endpoints to send data specified as an ip+port combination.
   * </pre>
   *
   * Protobuf type {@code telemetry.Collector}
   */
  public static final class Collector extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.Collector)
      CollectorOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Collector.newBuilder() to construct.
    private Collector(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Collector() {
      address_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Collector();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Collector_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Collector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.Collector.class, org.opennms.features.openconfig.proto.jti.Telemetry.Collector.Builder.class);
    }

    public static final int ADDRESS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object address_ = "";
    /**
     * <pre>
     * IP address of collector endpoint
     * </pre>
     *
     * <code>string address = 1;</code>
     * @return The address.
     */
    @java.lang.Override
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * IP address of collector endpoint
     * </pre>
     *
     * <code>string address = 1;</code>
     * @return The bytes for address.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PORT_FIELD_NUMBER = 2;
    private int port_ = 0;
    /**
     * <pre>
     * Transport protocol port number for the collector destination.
     * </pre>
     *
     * <code>uint32 port = 2;</code>
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
      }
      if (port_ != 0) {
        output.writeUInt32(2, port_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
      }
      if (port_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, port_);
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.Collector)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.Collector other = (org.opennms.features.openconfig.proto.jti.Telemetry.Collector) obj;

      if (!getAddress()
          .equals(other.getAddress())) return false;
      if (getPort()
          != other.getPort()) return false;
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
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
      hash = (37 * hash) + PORT_FIELD_NUMBER;
      hash = (53 * hash) + getPort();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.Collector parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Collector parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Collector parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Collector parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Collector parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Collector parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Collector parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Collector parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.Collector parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.Collector parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Collector parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Collector parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.Collector prototype) {
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
     * Collector endpoints to send data specified as an ip+port combination.
     * </pre>
     *
     * Protobuf type {@code telemetry.Collector}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.Collector)
        org.opennms.features.openconfig.proto.jti.Telemetry.CollectorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Collector_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Collector_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.Collector.class, org.opennms.features.openconfig.proto.jti.Telemetry.Collector.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.Collector.newBuilder()
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
        address_ = "";
        port_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Collector_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.Collector getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.Collector.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.Collector build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.Collector result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.Collector buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.Collector result = new org.opennms.features.openconfig.proto.jti.Telemetry.Collector(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.jti.Telemetry.Collector result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.address_ = address_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.port_ = port_;
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
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.Collector) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.Collector)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.Collector other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.Collector.getDefaultInstance()) return this;
        if (!other.getAddress().isEmpty()) {
          address_ = other.address_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.getPort() != 0) {
          setPort(other.getPort());
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
                address_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                port_ = input.readUInt32();
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

      private java.lang.Object address_ = "";
      /**
       * <pre>
       * IP address of collector endpoint
       * </pre>
       *
       * <code>string address = 1;</code>
       * @return The address.
       */
      public java.lang.String getAddress() {
        java.lang.Object ref = address_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          address_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * IP address of collector endpoint
       * </pre>
       *
       * <code>string address = 1;</code>
       * @return The bytes for address.
       */
      public com.google.protobuf.ByteString
          getAddressBytes() {
        java.lang.Object ref = address_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          address_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * IP address of collector endpoint
       * </pre>
       *
       * <code>string address = 1;</code>
       * @param value The address to set.
       * @return This builder for chaining.
       */
      public Builder setAddress(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        address_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * IP address of collector endpoint
       * </pre>
       *
       * <code>string address = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddress() {
        address_ = getDefaultInstance().getAddress();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * IP address of collector endpoint
       * </pre>
       *
       * <code>string address = 1;</code>
       * @param value The bytes for address to set.
       * @return This builder for chaining.
       */
      public Builder setAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        address_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private int port_ ;
      /**
       * <pre>
       * Transport protocol port number for the collector destination.
       * </pre>
       *
       * <code>uint32 port = 2;</code>
       * @return The port.
       */
      @java.lang.Override
      public int getPort() {
        return port_;
      }
      /**
       * <pre>
       * Transport protocol port number for the collector destination.
       * </pre>
       *
       * <code>uint32 port = 2;</code>
       * @param value The port to set.
       * @return This builder for chaining.
       */
      public Builder setPort(int value) {

        port_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Transport protocol port number for the collector destination.
       * </pre>
       *
       * <code>uint32 port = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPort() {
        bitField0_ = (bitField0_ & ~0x00000002);
        port_ = 0;
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


      // @@protoc_insertion_point(builder_scope:telemetry.Collector)
    }

    // @@protoc_insertion_point(class_scope:telemetry.Collector)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.Collector DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.Collector();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.Collector getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Collector>
        PARSER = new com.google.protobuf.AbstractParser<Collector>() {
      @java.lang.Override
      public Collector parsePartialFrom(
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

    public static com.google.protobuf.Parser<Collector> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Collector> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.Collector getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface PathOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.Path)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Data model path of interest
     * Path specification for elements of OpenConfig data models
     * </pre>
     *
     * <code>string path = 1;</code>
     * @return The path.
     */
    java.lang.String getPath();
    /**
     * <pre>
     * Data model path of interest
     * Path specification for elements of OpenConfig data models
     * </pre>
     *
     * <code>string path = 1;</code>
     * @return The bytes for path.
     */
    com.google.protobuf.ByteString
        getPathBytes();

    /**
     * <pre>
     * Regular expression to be used in filtering state leaves
     * </pre>
     *
     * <code>string filter = 2;</code>
     * @return The filter.
     */
    java.lang.String getFilter();
    /**
     * <pre>
     * Regular expression to be used in filtering state leaves
     * </pre>
     *
     * <code>string filter = 2;</code>
     * @return The bytes for filter.
     */
    com.google.protobuf.ByteString
        getFilterBytes();

    /**
     * <pre>
     * If this is set to true, the target device will only send
     * updates to the collector upon a change in data value
     * </pre>
     *
     * <code>bool suppress_unchanged = 3;</code>
     * @return The suppressUnchanged.
     */
    boolean getSuppressUnchanged();

    /**
     * <pre>
     * Maximum time in ms the target device may go without sending
     * a message to the collector. If this time expires with
     * suppress-unchanged set, the target device must send an update
     * message regardless if the data values have changed.
     * </pre>
     *
     * <code>uint32 max_silent_interval = 4;</code>
     * @return The maxSilentInterval.
     */
    int getMaxSilentInterval();

    /**
     * <pre>
     * Time in ms between collection and transmission of the
     * specified data to the collector platform. The target device
     * will sample the corresponding data (e.g,. a counter) and
     * immediately send to the collector destination.
     *
     * If sample-frequency is set to 0, then the network device
     * must emit an update upon every datum change.
     * </pre>
     *
     * <code>uint32 sample_frequency = 5;</code>
     * @return The sampleFrequency.
     */
    int getSampleFrequency();

    /**
     * <pre>
     * EOM needed for each walk cycle of this path?
     *   For periodic sensor, applicable for each complete reap
     *   For event sensor, applicable when initial dump is over
     *     (same as EOS)
     * This feature is not implemented currently.
     * </pre>
     *
     * <code>bool need_eom = 6;</code>
     * @return The needEom.
     */
    boolean getNeedEom();
  }
  /**
   * <pre>
   * Data model path
   * </pre>
   *
   * Protobuf type {@code telemetry.Path}
   */
  public static final class Path extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.Path)
      PathOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Path.newBuilder() to construct.
    private Path(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Path() {
      path_ = "";
      filter_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Path();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Path_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Path_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.Path.class, org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder.class);
    }

    public static final int PATH_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object path_ = "";
    /**
     * <pre>
     * Data model path of interest
     * Path specification for elements of OpenConfig data models
     * </pre>
     *
     * <code>string path = 1;</code>
     * @return The path.
     */
    @java.lang.Override
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Data model path of interest
     * Path specification for elements of OpenConfig data models
     * </pre>
     *
     * <code>string path = 1;</code>
     * @return The bytes for path.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FILTER_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object filter_ = "";
    /**
     * <pre>
     * Regular expression to be used in filtering state leaves
     * </pre>
     *
     * <code>string filter = 2;</code>
     * @return The filter.
     */
    @java.lang.Override
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Regular expression to be used in filtering state leaves
     * </pre>
     *
     * <code>string filter = 2;</code>
     * @return The bytes for filter.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SUPPRESS_UNCHANGED_FIELD_NUMBER = 3;
    private boolean suppressUnchanged_ = false;
    /**
     * <pre>
     * If this is set to true, the target device will only send
     * updates to the collector upon a change in data value
     * </pre>
     *
     * <code>bool suppress_unchanged = 3;</code>
     * @return The suppressUnchanged.
     */
    @java.lang.Override
    public boolean getSuppressUnchanged() {
      return suppressUnchanged_;
    }

    public static final int MAX_SILENT_INTERVAL_FIELD_NUMBER = 4;
    private int maxSilentInterval_ = 0;
    /**
     * <pre>
     * Maximum time in ms the target device may go without sending
     * a message to the collector. If this time expires with
     * suppress-unchanged set, the target device must send an update
     * message regardless if the data values have changed.
     * </pre>
     *
     * <code>uint32 max_silent_interval = 4;</code>
     * @return The maxSilentInterval.
     */
    @java.lang.Override
    public int getMaxSilentInterval() {
      return maxSilentInterval_;
    }

    public static final int SAMPLE_FREQUENCY_FIELD_NUMBER = 5;
    private int sampleFrequency_ = 0;
    /**
     * <pre>
     * Time in ms between collection and transmission of the
     * specified data to the collector platform. The target device
     * will sample the corresponding data (e.g,. a counter) and
     * immediately send to the collector destination.
     *
     * If sample-frequency is set to 0, then the network device
     * must emit an update upon every datum change.
     * </pre>
     *
     * <code>uint32 sample_frequency = 5;</code>
     * @return The sampleFrequency.
     */
    @java.lang.Override
    public int getSampleFrequency() {
      return sampleFrequency_;
    }

    public static final int NEED_EOM_FIELD_NUMBER = 6;
    private boolean needEom_ = false;
    /**
     * <pre>
     * EOM needed for each walk cycle of this path?
     *   For periodic sensor, applicable for each complete reap
     *   For event sensor, applicable when initial dump is over
     *     (same as EOS)
     * This feature is not implemented currently.
     * </pre>
     *
     * <code>bool need_eom = 6;</code>
     * @return The needEom.
     */
    @java.lang.Override
    public boolean getNeedEom() {
      return needEom_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, filter_);
      }
      if (suppressUnchanged_ != false) {
        output.writeBool(3, suppressUnchanged_);
      }
      if (maxSilentInterval_ != 0) {
        output.writeUInt32(4, maxSilentInterval_);
      }
      if (sampleFrequency_ != 0) {
        output.writeUInt32(5, sampleFrequency_);
      }
      if (needEom_ != false) {
        output.writeBool(6, needEom_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, filter_);
      }
      if (suppressUnchanged_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, suppressUnchanged_);
      }
      if (maxSilentInterval_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, maxSilentInterval_);
      }
      if (sampleFrequency_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, sampleFrequency_);
      }
      if (needEom_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, needEom_);
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.Path)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.Path other = (org.opennms.features.openconfig.proto.jti.Telemetry.Path) obj;

      if (!getPath()
          .equals(other.getPath())) return false;
      if (!getFilter()
          .equals(other.getFilter())) return false;
      if (getSuppressUnchanged()
          != other.getSuppressUnchanged()) return false;
      if (getMaxSilentInterval()
          != other.getMaxSilentInterval()) return false;
      if (getSampleFrequency()
          != other.getSampleFrequency()) return false;
      if (getNeedEom()
          != other.getNeedEom()) return false;
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
      hash = (37 * hash) + PATH_FIELD_NUMBER;
      hash = (53 * hash) + getPath().hashCode();
      hash = (37 * hash) + FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getFilter().hashCode();
      hash = (37 * hash) + SUPPRESS_UNCHANGED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSuppressUnchanged());
      hash = (37 * hash) + MAX_SILENT_INTERVAL_FIELD_NUMBER;
      hash = (53 * hash) + getMaxSilentInterval();
      hash = (37 * hash) + SAMPLE_FREQUENCY_FIELD_NUMBER;
      hash = (53 * hash) + getSampleFrequency();
      hash = (37 * hash) + NEED_EOM_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getNeedEom());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.Path parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Path parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Path parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Path parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Path parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Path parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Path parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Path parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.Path parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.Path parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Path parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Path parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.Path prototype) {
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
     * Data model path
     * </pre>
     *
     * Protobuf type {@code telemetry.Path}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.Path)
        org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Path_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Path_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.Path.class, org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.Path.newBuilder()
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
        path_ = "";
        filter_ = "";
        suppressUnchanged_ = false;
        maxSilentInterval_ = 0;
        sampleFrequency_ = 0;
        needEom_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Path_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.Path getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.Path.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.Path build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.Path result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.Path buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.Path result = new org.opennms.features.openconfig.proto.jti.Telemetry.Path(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.jti.Telemetry.Path result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.path_ = path_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.filter_ = filter_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.suppressUnchanged_ = suppressUnchanged_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.maxSilentInterval_ = maxSilentInterval_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.sampleFrequency_ = sampleFrequency_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.needEom_ = needEom_;
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
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.Path) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.Path)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.Path other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.Path.getDefaultInstance()) return this;
        if (!other.getPath().isEmpty()) {
          path_ = other.path_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getFilter().isEmpty()) {
          filter_ = other.filter_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.getSuppressUnchanged() != false) {
          setSuppressUnchanged(other.getSuppressUnchanged());
        }
        if (other.getMaxSilentInterval() != 0) {
          setMaxSilentInterval(other.getMaxSilentInterval());
        }
        if (other.getSampleFrequency() != 0) {
          setSampleFrequency(other.getSampleFrequency());
        }
        if (other.getNeedEom() != false) {
          setNeedEom(other.getNeedEom());
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
                path_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                filter_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 24: {
                suppressUnchanged_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                maxSilentInterval_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 40: {
                sampleFrequency_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              case 48: {
                needEom_ = input.readBool();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
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

      private java.lang.Object path_ = "";
      /**
       * <pre>
       * Data model path of interest
       * Path specification for elements of OpenConfig data models
       * </pre>
       *
       * <code>string path = 1;</code>
       * @return The path.
       */
      public java.lang.String getPath() {
        java.lang.Object ref = path_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          path_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Data model path of interest
       * Path specification for elements of OpenConfig data models
       * </pre>
       *
       * <code>string path = 1;</code>
       * @return The bytes for path.
       */
      public com.google.protobuf.ByteString
          getPathBytes() {
        java.lang.Object ref = path_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          path_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Data model path of interest
       * Path specification for elements of OpenConfig data models
       * </pre>
       *
       * <code>string path = 1;</code>
       * @param value The path to set.
       * @return This builder for chaining.
       */
      public Builder setPath(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        path_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Data model path of interest
       * Path specification for elements of OpenConfig data models
       * </pre>
       *
       * <code>string path = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPath() {
        path_ = getDefaultInstance().getPath();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Data model path of interest
       * Path specification for elements of OpenConfig data models
       * </pre>
       *
       * <code>string path = 1;</code>
       * @param value The bytes for path to set.
       * @return This builder for chaining.
       */
      public Builder setPathBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        path_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object filter_ = "";
      /**
       * <pre>
       * Regular expression to be used in filtering state leaves
       * </pre>
       *
       * <code>string filter = 2;</code>
       * @return The filter.
       */
      public java.lang.String getFilter() {
        java.lang.Object ref = filter_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          filter_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Regular expression to be used in filtering state leaves
       * </pre>
       *
       * <code>string filter = 2;</code>
       * @return The bytes for filter.
       */
      public com.google.protobuf.ByteString
          getFilterBytes() {
        java.lang.Object ref = filter_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          filter_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Regular expression to be used in filtering state leaves
       * </pre>
       *
       * <code>string filter = 2;</code>
       * @param value The filter to set.
       * @return This builder for chaining.
       */
      public Builder setFilter(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        filter_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Regular expression to be used in filtering state leaves
       * </pre>
       *
       * <code>string filter = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFilter() {
        filter_ = getDefaultInstance().getFilter();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Regular expression to be used in filtering state leaves
       * </pre>
       *
       * <code>string filter = 2;</code>
       * @param value The bytes for filter to set.
       * @return This builder for chaining.
       */
      public Builder setFilterBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        filter_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private boolean suppressUnchanged_ ;
      /**
       * <pre>
       * If this is set to true, the target device will only send
       * updates to the collector upon a change in data value
       * </pre>
       *
       * <code>bool suppress_unchanged = 3;</code>
       * @return The suppressUnchanged.
       */
      @java.lang.Override
      public boolean getSuppressUnchanged() {
        return suppressUnchanged_;
      }
      /**
       * <pre>
       * If this is set to true, the target device will only send
       * updates to the collector upon a change in data value
       * </pre>
       *
       * <code>bool suppress_unchanged = 3;</code>
       * @param value The suppressUnchanged to set.
       * @return This builder for chaining.
       */
      public Builder setSuppressUnchanged(boolean value) {

        suppressUnchanged_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * If this is set to true, the target device will only send
       * updates to the collector upon a change in data value
       * </pre>
       *
       * <code>bool suppress_unchanged = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSuppressUnchanged() {
        bitField0_ = (bitField0_ & ~0x00000004);
        suppressUnchanged_ = false;
        onChanged();
        return this;
      }

      private int maxSilentInterval_ ;
      /**
       * <pre>
       * Maximum time in ms the target device may go without sending
       * a message to the collector. If this time expires with
       * suppress-unchanged set, the target device must send an update
       * message regardless if the data values have changed.
       * </pre>
       *
       * <code>uint32 max_silent_interval = 4;</code>
       * @return The maxSilentInterval.
       */
      @java.lang.Override
      public int getMaxSilentInterval() {
        return maxSilentInterval_;
      }
      /**
       * <pre>
       * Maximum time in ms the target device may go without sending
       * a message to the collector. If this time expires with
       * suppress-unchanged set, the target device must send an update
       * message regardless if the data values have changed.
       * </pre>
       *
       * <code>uint32 max_silent_interval = 4;</code>
       * @param value The maxSilentInterval to set.
       * @return This builder for chaining.
       */
      public Builder setMaxSilentInterval(int value) {

        maxSilentInterval_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Maximum time in ms the target device may go without sending
       * a message to the collector. If this time expires with
       * suppress-unchanged set, the target device must send an update
       * message regardless if the data values have changed.
       * </pre>
       *
       * <code>uint32 max_silent_interval = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxSilentInterval() {
        bitField0_ = (bitField0_ & ~0x00000008);
        maxSilentInterval_ = 0;
        onChanged();
        return this;
      }

      private int sampleFrequency_ ;
      /**
       * <pre>
       * Time in ms between collection and transmission of the
       * specified data to the collector platform. The target device
       * will sample the corresponding data (e.g,. a counter) and
       * immediately send to the collector destination.
       *
       * If sample-frequency is set to 0, then the network device
       * must emit an update upon every datum change.
       * </pre>
       *
       * <code>uint32 sample_frequency = 5;</code>
       * @return The sampleFrequency.
       */
      @java.lang.Override
      public int getSampleFrequency() {
        return sampleFrequency_;
      }
      /**
       * <pre>
       * Time in ms between collection and transmission of the
       * specified data to the collector platform. The target device
       * will sample the corresponding data (e.g,. a counter) and
       * immediately send to the collector destination.
       *
       * If sample-frequency is set to 0, then the network device
       * must emit an update upon every datum change.
       * </pre>
       *
       * <code>uint32 sample_frequency = 5;</code>
       * @param value The sampleFrequency to set.
       * @return This builder for chaining.
       */
      public Builder setSampleFrequency(int value) {

        sampleFrequency_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Time in ms between collection and transmission of the
       * specified data to the collector platform. The target device
       * will sample the corresponding data (e.g,. a counter) and
       * immediately send to the collector destination.
       *
       * If sample-frequency is set to 0, then the network device
       * must emit an update upon every datum change.
       * </pre>
       *
       * <code>uint32 sample_frequency = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearSampleFrequency() {
        bitField0_ = (bitField0_ & ~0x00000010);
        sampleFrequency_ = 0;
        onChanged();
        return this;
      }

      private boolean needEom_ ;
      /**
       * <pre>
       * EOM needed for each walk cycle of this path?
       *   For periodic sensor, applicable for each complete reap
       *   For event sensor, applicable when initial dump is over
       *     (same as EOS)
       * This feature is not implemented currently.
       * </pre>
       *
       * <code>bool need_eom = 6;</code>
       * @return The needEom.
       */
      @java.lang.Override
      public boolean getNeedEom() {
        return needEom_;
      }
      /**
       * <pre>
       * EOM needed for each walk cycle of this path?
       *   For periodic sensor, applicable for each complete reap
       *   For event sensor, applicable when initial dump is over
       *     (same as EOS)
       * This feature is not implemented currently.
       * </pre>
       *
       * <code>bool need_eom = 6;</code>
       * @param value The needEom to set.
       * @return This builder for chaining.
       */
      public Builder setNeedEom(boolean value) {

        needEom_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * EOM needed for each walk cycle of this path?
       *   For periodic sensor, applicable for each complete reap
       *   For event sensor, applicable when initial dump is over
       *     (same as EOS)
       * This feature is not implemented currently.
       * </pre>
       *
       * <code>bool need_eom = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearNeedEom() {
        bitField0_ = (bitField0_ & ~0x00000020);
        needEom_ = false;
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


      // @@protoc_insertion_point(builder_scope:telemetry.Path)
    }

    // @@protoc_insertion_point(class_scope:telemetry.Path)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.Path DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.Path();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.Path getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Path>
        PARSER = new com.google.protobuf.AbstractParser<Path>() {
      @java.lang.Override
      public Path parsePartialFrom(
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

    public static com.google.protobuf.Parser<Path> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Path> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.Path getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SubscriptionAdditionalConfigOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.SubscriptionAdditionalConfig)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * limit the number of records sent in the stream
     * </pre>
     *
     * <code>int32 limit_records = 1;</code>
     * @return The limitRecords.
     */
    int getLimitRecords();

    /**
     * <pre>
     * limit the time the stream remains open
     * </pre>
     *
     * <code>int32 limit_time_seconds = 2;</code>
     * @return The limitTimeSeconds.
     */
    int getLimitTimeSeconds();

    /**
     * <pre>
     * EOS needed for this subscription?
     * This feature is not implemented currently.
     * </pre>
     *
     * <code>bool need_eos = 3;</code>
     * @return The needEos.
     */
    boolean getNeedEos();
  }
  /**
   * <pre>
   * Configure subscription request additional features.
   * </pre>
   *
   * Protobuf type {@code telemetry.SubscriptionAdditionalConfig}
   */
  public static final class SubscriptionAdditionalConfig extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.SubscriptionAdditionalConfig)
      SubscriptionAdditionalConfigOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SubscriptionAdditionalConfig.newBuilder() to construct.
    private SubscriptionAdditionalConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SubscriptionAdditionalConfig() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SubscriptionAdditionalConfig();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionAdditionalConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionAdditionalConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig.class, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig.Builder.class);
    }

    public static final int LIMIT_RECORDS_FIELD_NUMBER = 1;
    private int limitRecords_ = 0;
    /**
     * <pre>
     * limit the number of records sent in the stream
     * </pre>
     *
     * <code>int32 limit_records = 1;</code>
     * @return The limitRecords.
     */
    @java.lang.Override
    public int getLimitRecords() {
      return limitRecords_;
    }

    public static final int LIMIT_TIME_SECONDS_FIELD_NUMBER = 2;
    private int limitTimeSeconds_ = 0;
    /**
     * <pre>
     * limit the time the stream remains open
     * </pre>
     *
     * <code>int32 limit_time_seconds = 2;</code>
     * @return The limitTimeSeconds.
     */
    @java.lang.Override
    public int getLimitTimeSeconds() {
      return limitTimeSeconds_;
    }

    public static final int NEED_EOS_FIELD_NUMBER = 3;
    private boolean needEos_ = false;
    /**
     * <pre>
     * EOS needed for this subscription?
     * This feature is not implemented currently.
     * </pre>
     *
     * <code>bool need_eos = 3;</code>
     * @return The needEos.
     */
    @java.lang.Override
    public boolean getNeedEos() {
      return needEos_;
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
      if (limitRecords_ != 0) {
        output.writeInt32(1, limitRecords_);
      }
      if (limitTimeSeconds_ != 0) {
        output.writeInt32(2, limitTimeSeconds_);
      }
      if (needEos_ != false) {
        output.writeBool(3, needEos_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (limitRecords_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, limitRecords_);
      }
      if (limitTimeSeconds_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, limitTimeSeconds_);
      }
      if (needEos_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, needEos_);
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig other = (org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig) obj;

      if (getLimitRecords()
          != other.getLimitRecords()) return false;
      if (getLimitTimeSeconds()
          != other.getLimitTimeSeconds()) return false;
      if (getNeedEos()
          != other.getNeedEos()) return false;
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
      hash = (37 * hash) + LIMIT_RECORDS_FIELD_NUMBER;
      hash = (53 * hash) + getLimitRecords();
      hash = (37 * hash) + LIMIT_TIME_SECONDS_FIELD_NUMBER;
      hash = (53 * hash) + getLimitTimeSeconds();
      hash = (37 * hash) + NEED_EOS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getNeedEos());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig prototype) {
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
     * Configure subscription request additional features.
     * </pre>
     *
     * Protobuf type {@code telemetry.SubscriptionAdditionalConfig}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.SubscriptionAdditionalConfig)
        org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionAdditionalConfig_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionAdditionalConfig_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig.class, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig.newBuilder()
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
        limitRecords_ = 0;
        limitTimeSeconds_ = 0;
        needEos_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionAdditionalConfig_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig result = new org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.limitRecords_ = limitRecords_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.limitTimeSeconds_ = limitTimeSeconds_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.needEos_ = needEos_;
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
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig.getDefaultInstance()) return this;
        if (other.getLimitRecords() != 0) {
          setLimitRecords(other.getLimitRecords());
        }
        if (other.getLimitTimeSeconds() != 0) {
          setLimitTimeSeconds(other.getLimitTimeSeconds());
        }
        if (other.getNeedEos() != false) {
          setNeedEos(other.getNeedEos());
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
                limitRecords_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                limitTimeSeconds_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                needEos_ = input.readBool();
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

      private int limitRecords_ ;
      /**
       * <pre>
       * limit the number of records sent in the stream
       * </pre>
       *
       * <code>int32 limit_records = 1;</code>
       * @return The limitRecords.
       */
      @java.lang.Override
      public int getLimitRecords() {
        return limitRecords_;
      }
      /**
       * <pre>
       * limit the number of records sent in the stream
       * </pre>
       *
       * <code>int32 limit_records = 1;</code>
       * @param value The limitRecords to set.
       * @return This builder for chaining.
       */
      public Builder setLimitRecords(int value) {

        limitRecords_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * limit the number of records sent in the stream
       * </pre>
       *
       * <code>int32 limit_records = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLimitRecords() {
        bitField0_ = (bitField0_ & ~0x00000001);
        limitRecords_ = 0;
        onChanged();
        return this;
      }

      private int limitTimeSeconds_ ;
      /**
       * <pre>
       * limit the time the stream remains open
       * </pre>
       *
       * <code>int32 limit_time_seconds = 2;</code>
       * @return The limitTimeSeconds.
       */
      @java.lang.Override
      public int getLimitTimeSeconds() {
        return limitTimeSeconds_;
      }
      /**
       * <pre>
       * limit the time the stream remains open
       * </pre>
       *
       * <code>int32 limit_time_seconds = 2;</code>
       * @param value The limitTimeSeconds to set.
       * @return This builder for chaining.
       */
      public Builder setLimitTimeSeconds(int value) {

        limitTimeSeconds_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * limit the time the stream remains open
       * </pre>
       *
       * <code>int32 limit_time_seconds = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLimitTimeSeconds() {
        bitField0_ = (bitField0_ & ~0x00000002);
        limitTimeSeconds_ = 0;
        onChanged();
        return this;
      }

      private boolean needEos_ ;
      /**
       * <pre>
       * EOS needed for this subscription?
       * This feature is not implemented currently.
       * </pre>
       *
       * <code>bool need_eos = 3;</code>
       * @return The needEos.
       */
      @java.lang.Override
      public boolean getNeedEos() {
        return needEos_;
      }
      /**
       * <pre>
       * EOS needed for this subscription?
       * This feature is not implemented currently.
       * </pre>
       *
       * <code>bool need_eos = 3;</code>
       * @param value The needEos to set.
       * @return This builder for chaining.
       */
      public Builder setNeedEos(boolean value) {

        needEos_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * EOS needed for this subscription?
       * This feature is not implemented currently.
       * </pre>
       *
       * <code>bool need_eos = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearNeedEos() {
        bitField0_ = (bitField0_ & ~0x00000004);
        needEos_ = false;
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


      // @@protoc_insertion_point(builder_scope:telemetry.SubscriptionAdditionalConfig)
    }

    // @@protoc_insertion_point(class_scope:telemetry.SubscriptionAdditionalConfig)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SubscriptionAdditionalConfig>
        PARSER = new com.google.protobuf.AbstractParser<SubscriptionAdditionalConfig>() {
      @java.lang.Override
      public SubscriptionAdditionalConfig parsePartialFrom(
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

    public static com.google.protobuf.Parser<SubscriptionAdditionalConfig> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SubscriptionAdditionalConfig> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionAdditionalConfig getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SubscriptionReplyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.SubscriptionReply)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Response message to a telemetry subscription creation or
     * get request.
     * </pre>
     *
     * <code>.telemetry.SubscriptionResponse response = 1;</code>
     * @return Whether the response field is set.
     */
    boolean hasResponse();
    /**
     * <pre>
     * Response message to a telemetry subscription creation or
     * get request.
     * </pre>
     *
     * <code>.telemetry.SubscriptionResponse response = 1;</code>
     * @return The response.
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse getResponse();
    /**
     * <pre>
     * Response message to a telemetry subscription creation or
     * get request.
     * </pre>
     *
     * <code>.telemetry.SubscriptionResponse response = 1;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponseOrBuilder getResponseOrBuilder();

    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Path> 
        getPathListList();
    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.Path getPathList(int index);
    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    int getPathListCount();
    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder> 
        getPathListOrBuilderList();
    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder getPathListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * 1. Reply data message sent out using out-of-band channel.
   * </pre>
   *
   * Protobuf type {@code telemetry.SubscriptionReply}
   */
  public static final class SubscriptionReply extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.SubscriptionReply)
      SubscriptionReplyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SubscriptionReply.newBuilder() to construct.
    private SubscriptionReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SubscriptionReply() {
      pathList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SubscriptionReply();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.class, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.Builder.class);
    }

    private int bitField0_;
    public static final int RESPONSE_FIELD_NUMBER = 1;
    private org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse response_;
    /**
     * <pre>
     * Response message to a telemetry subscription creation or
     * get request.
     * </pre>
     *
     * <code>.telemetry.SubscriptionResponse response = 1;</code>
     * @return Whether the response field is set.
     */
    @java.lang.Override
    public boolean hasResponse() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Response message to a telemetry subscription creation or
     * get request.
     * </pre>
     *
     * <code>.telemetry.SubscriptionResponse response = 1;</code>
     * @return The response.
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse getResponse() {
      return response_ == null ? org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse.getDefaultInstance() : response_;
    }
    /**
     * <pre>
     * Response message to a telemetry subscription creation or
     * get request.
     * </pre>
     *
     * <code>.telemetry.SubscriptionResponse response = 1;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponseOrBuilder getResponseOrBuilder() {
      return response_ == null ? org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse.getDefaultInstance() : response_;
    }

    public static final int PATH_LIST_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Path> pathList_;
    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Path> getPathListList() {
      return pathList_;
    }
    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder> 
        getPathListOrBuilderList() {
      return pathList_;
    }
    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    @java.lang.Override
    public int getPathListCount() {
      return pathList_.size();
    }
    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.Path getPathList(int index) {
      return pathList_.get(index);
    }
    /**
     * <pre>
     * List of data models paths and filters
     * which are used in a telemetry operation.
     * </pre>
     *
     * <code>repeated .telemetry.Path path_list = 2;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder getPathListOrBuilder(
        int index) {
      return pathList_.get(index);
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
        output.writeMessage(1, getResponse());
      }
      for (int i = 0; i < pathList_.size(); i++) {
        output.writeMessage(2, pathList_.get(i));
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
          .computeMessageSize(1, getResponse());
      }
      for (int i = 0; i < pathList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, pathList_.get(i));
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply other = (org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply) obj;

      if (hasResponse() != other.hasResponse()) return false;
      if (hasResponse()) {
        if (!getResponse()
            .equals(other.getResponse())) return false;
      }
      if (!getPathListList()
          .equals(other.getPathListList())) return false;
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
      if (hasResponse()) {
        hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getResponse().hashCode();
      }
      if (getPathListCount() > 0) {
        hash = (37 * hash) + PATH_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPathListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply prototype) {
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
     * 1. Reply data message sent out using out-of-band channel.
     * </pre>
     *
     * Protobuf type {@code telemetry.SubscriptionReply}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.SubscriptionReply)
        org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReplyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionReply_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionReply_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.class, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.newBuilder()
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
          getResponseFieldBuilder();
          getPathListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        response_ = null;
        if (responseBuilder_ != null) {
          responseBuilder_.dispose();
          responseBuilder_ = null;
        }
        if (pathListBuilder_ == null) {
          pathList_ = java.util.Collections.emptyList();
        } else {
          pathList_ = null;
          pathListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionReply_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply result = new org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply result) {
        if (pathListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            pathList_ = java.util.Collections.unmodifiableList(pathList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.pathList_ = pathList_;
        } else {
          result.pathList_ = pathListBuilder_.build();
        }
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.response_ = responseBuilder_ == null
              ? response_
              : responseBuilder_.build();
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
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.getDefaultInstance()) return this;
        if (other.hasResponse()) {
          mergeResponse(other.getResponse());
        }
        if (pathListBuilder_ == null) {
          if (!other.pathList_.isEmpty()) {
            if (pathList_.isEmpty()) {
              pathList_ = other.pathList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensurePathListIsMutable();
              pathList_.addAll(other.pathList_);
            }
            onChanged();
          }
        } else {
          if (!other.pathList_.isEmpty()) {
            if (pathListBuilder_.isEmpty()) {
              pathListBuilder_.dispose();
              pathListBuilder_ = null;
              pathList_ = other.pathList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              pathListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPathListFieldBuilder() : null;
            } else {
              pathListBuilder_.addAllMessages(other.pathList_);
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
                input.readMessage(
                    getResponseFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                org.opennms.features.openconfig.proto.jti.Telemetry.Path m =
                    input.readMessage(
                        org.opennms.features.openconfig.proto.jti.Telemetry.Path.parser(),
                        extensionRegistry);
                if (pathListBuilder_ == null) {
                  ensurePathListIsMutable();
                  pathList_.add(m);
                } else {
                  pathListBuilder_.addMessage(m);
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

      private org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse response_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponseOrBuilder> responseBuilder_;
      /**
       * <pre>
       * Response message to a telemetry subscription creation or
       * get request.
       * </pre>
       *
       * <code>.telemetry.SubscriptionResponse response = 1;</code>
       * @return Whether the response field is set.
       */
      public boolean hasResponse() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Response message to a telemetry subscription creation or
       * get request.
       * </pre>
       *
       * <code>.telemetry.SubscriptionResponse response = 1;</code>
       * @return The response.
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse getResponse() {
        if (responseBuilder_ == null) {
          return response_ == null ? org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse.getDefaultInstance() : response_;
        } else {
          return responseBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Response message to a telemetry subscription creation or
       * get request.
       * </pre>
       *
       * <code>.telemetry.SubscriptionResponse response = 1;</code>
       */
      public Builder setResponse(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse value) {
        if (responseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          response_ = value;
        } else {
          responseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Response message to a telemetry subscription creation or
       * get request.
       * </pre>
       *
       * <code>.telemetry.SubscriptionResponse response = 1;</code>
       */
      public Builder setResponse(
          org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse.Builder builderForValue) {
        if (responseBuilder_ == null) {
          response_ = builderForValue.build();
        } else {
          responseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Response message to a telemetry subscription creation or
       * get request.
       * </pre>
       *
       * <code>.telemetry.SubscriptionResponse response = 1;</code>
       */
      public Builder mergeResponse(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse value) {
        if (responseBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            response_ != null &&
            response_ != org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse.getDefaultInstance()) {
            getResponseBuilder().mergeFrom(value);
          } else {
            response_ = value;
          }
        } else {
          responseBuilder_.mergeFrom(value);
        }
        if (response_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       * Response message to a telemetry subscription creation or
       * get request.
       * </pre>
       *
       * <code>.telemetry.SubscriptionResponse response = 1;</code>
       */
      public Builder clearResponse() {
        bitField0_ = (bitField0_ & ~0x00000001);
        response_ = null;
        if (responseBuilder_ != null) {
          responseBuilder_.dispose();
          responseBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Response message to a telemetry subscription creation or
       * get request.
       * </pre>
       *
       * <code>.telemetry.SubscriptionResponse response = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse.Builder getResponseBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getResponseFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Response message to a telemetry subscription creation or
       * get request.
       * </pre>
       *
       * <code>.telemetry.SubscriptionResponse response = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponseOrBuilder getResponseOrBuilder() {
        if (responseBuilder_ != null) {
          return responseBuilder_.getMessageOrBuilder();
        } else {
          return response_ == null ?
              org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse.getDefaultInstance() : response_;
        }
      }
      /**
       * <pre>
       * Response message to a telemetry subscription creation or
       * get request.
       * </pre>
       *
       * <code>.telemetry.SubscriptionResponse response = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponseOrBuilder> 
          getResponseFieldBuilder() {
        if (responseBuilder_ == null) {
          responseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponseOrBuilder>(
                  getResponse(),
                  getParentForChildren(),
                  isClean());
          response_ = null;
        }
        return responseBuilder_;
      }

      private java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Path> pathList_ =
        java.util.Collections.emptyList();
      private void ensurePathListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          pathList_ = new java.util.ArrayList<org.opennms.features.openconfig.proto.jti.Telemetry.Path>(pathList_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.Path, org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder> pathListBuilder_;

      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Path> getPathListList() {
        if (pathListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(pathList_);
        } else {
          return pathListBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public int getPathListCount() {
        if (pathListBuilder_ == null) {
          return pathList_.size();
        } else {
          return pathListBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Path getPathList(int index) {
        if (pathListBuilder_ == null) {
          return pathList_.get(index);
        } else {
          return pathListBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public Builder setPathList(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Path value) {
        if (pathListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePathListIsMutable();
          pathList_.set(index, value);
          onChanged();
        } else {
          pathListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public Builder setPathList(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder builderForValue) {
        if (pathListBuilder_ == null) {
          ensurePathListIsMutable();
          pathList_.set(index, builderForValue.build());
          onChanged();
        } else {
          pathListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public Builder addPathList(org.opennms.features.openconfig.proto.jti.Telemetry.Path value) {
        if (pathListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePathListIsMutable();
          pathList_.add(value);
          onChanged();
        } else {
          pathListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public Builder addPathList(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Path value) {
        if (pathListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePathListIsMutable();
          pathList_.add(index, value);
          onChanged();
        } else {
          pathListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public Builder addPathList(
          org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder builderForValue) {
        if (pathListBuilder_ == null) {
          ensurePathListIsMutable();
          pathList_.add(builderForValue.build());
          onChanged();
        } else {
          pathListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public Builder addPathList(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder builderForValue) {
        if (pathListBuilder_ == null) {
          ensurePathListIsMutable();
          pathList_.add(index, builderForValue.build());
          onChanged();
        } else {
          pathListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public Builder addAllPathList(
          java.lang.Iterable<? extends org.opennms.features.openconfig.proto.jti.Telemetry.Path> values) {
        if (pathListBuilder_ == null) {
          ensurePathListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, pathList_);
          onChanged();
        } else {
          pathListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public Builder clearPathList() {
        if (pathListBuilder_ == null) {
          pathList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          pathListBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public Builder removePathList(int index) {
        if (pathListBuilder_ == null) {
          ensurePathListIsMutable();
          pathList_.remove(index);
          onChanged();
        } else {
          pathListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder getPathListBuilder(
          int index) {
        return getPathListFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder getPathListOrBuilder(
          int index) {
        if (pathListBuilder_ == null) {
          return pathList_.get(index);  } else {
          return pathListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder> 
           getPathListOrBuilderList() {
        if (pathListBuilder_ != null) {
          return pathListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(pathList_);
        }
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder addPathListBuilder() {
        return getPathListFieldBuilder().addBuilder(
            org.opennms.features.openconfig.proto.jti.Telemetry.Path.getDefaultInstance());
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder addPathListBuilder(
          int index) {
        return getPathListFieldBuilder().addBuilder(
            index, org.opennms.features.openconfig.proto.jti.Telemetry.Path.getDefaultInstance());
      }
      /**
       * <pre>
       * List of data models paths and filters
       * which are used in a telemetry operation.
       * </pre>
       *
       * <code>repeated .telemetry.Path path_list = 2;</code>
       */
      public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder> 
           getPathListBuilderList() {
        return getPathListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.Path, org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder> 
          getPathListFieldBuilder() {
        if (pathListBuilder_ == null) {
          pathListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.features.openconfig.proto.jti.Telemetry.Path, org.opennms.features.openconfig.proto.jti.Telemetry.Path.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.PathOrBuilder>(
                  pathList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          pathList_ = null;
        }
        return pathListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:telemetry.SubscriptionReply)
    }

    // @@protoc_insertion_point(class_scope:telemetry.SubscriptionReply)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SubscriptionReply>
        PARSER = new com.google.protobuf.AbstractParser<SubscriptionReply>() {
      @java.lang.Override
      public SubscriptionReply parsePartialFrom(
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

    public static com.google.protobuf.Parser<SubscriptionReply> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SubscriptionReply> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SubscriptionResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.SubscriptionResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Unique id for the subscription on the device. This is
     * generated by the device and returned in a subscription
     * request or when listing existing subscriptions
     * </pre>
     *
     * <code>uint32 subscription_id = 1;</code>
     * @return The subscriptionId.
     */
    int getSubscriptionId();
  }
  /**
   * <pre>
   * Response message to a telemetry subscription creation or get request.
   * </pre>
   *
   * Protobuf type {@code telemetry.SubscriptionResponse}
   */
  public static final class SubscriptionResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.SubscriptionResponse)
      SubscriptionResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SubscriptionResponse.newBuilder() to construct.
    private SubscriptionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SubscriptionResponse() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SubscriptionResponse();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse.class, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse.Builder.class);
    }

    public static final int SUBSCRIPTION_ID_FIELD_NUMBER = 1;
    private int subscriptionId_ = 0;
    /**
     * <pre>
     * Unique id for the subscription on the device. This is
     * generated by the device and returned in a subscription
     * request or when listing existing subscriptions
     * </pre>
     *
     * <code>uint32 subscription_id = 1;</code>
     * @return The subscriptionId.
     */
    @java.lang.Override
    public int getSubscriptionId() {
      return subscriptionId_;
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
      if (subscriptionId_ != 0) {
        output.writeUInt32(1, subscriptionId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (subscriptionId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, subscriptionId_);
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse other = (org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse) obj;

      if (getSubscriptionId()
          != other.getSubscriptionId()) return false;
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
      hash = (37 * hash) + SUBSCRIPTION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSubscriptionId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse prototype) {
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
     * Response message to a telemetry subscription creation or get request.
     * </pre>
     *
     * Protobuf type {@code telemetry.SubscriptionResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.SubscriptionResponse)
        org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse.class, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse.newBuilder()
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
        subscriptionId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_SubscriptionResponse_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse result = new org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.subscriptionId_ = subscriptionId_;
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
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse.getDefaultInstance()) return this;
        if (other.getSubscriptionId() != 0) {
          setSubscriptionId(other.getSubscriptionId());
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
                subscriptionId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

      private int subscriptionId_ ;
      /**
       * <pre>
       * Unique id for the subscription on the device. This is
       * generated by the device and returned in a subscription
       * request or when listing existing subscriptions
       * </pre>
       *
       * <code>uint32 subscription_id = 1;</code>
       * @return The subscriptionId.
       */
      @java.lang.Override
      public int getSubscriptionId() {
        return subscriptionId_;
      }
      /**
       * <pre>
       * Unique id for the subscription on the device. This is
       * generated by the device and returned in a subscription
       * request or when listing existing subscriptions
       * </pre>
       *
       * <code>uint32 subscription_id = 1;</code>
       * @param value The subscriptionId to set.
       * @return This builder for chaining.
       */
      public Builder setSubscriptionId(int value) {

        subscriptionId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Unique id for the subscription on the device. This is
       * generated by the device and returned in a subscription
       * request or when listing existing subscriptions
       * </pre>
       *
       * <code>uint32 subscription_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSubscriptionId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        subscriptionId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:telemetry.SubscriptionResponse)
    }

    // @@protoc_insertion_point(class_scope:telemetry.SubscriptionResponse)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SubscriptionResponse>
        PARSER = new com.google.protobuf.AbstractParser<SubscriptionResponse>() {
      @java.lang.Override
      public SubscriptionResponse parsePartialFrom(
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

    public static com.google.protobuf.Parser<SubscriptionResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SubscriptionResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface OpenConfigDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.OpenConfigData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * router name:export IP address
     * </pre>
     *
     * <code>string system_id = 1;</code>
     * @return The systemId.
     */
    java.lang.String getSystemId();
    /**
     * <pre>
     * router name:export IP address
     * </pre>
     *
     * <code>string system_id = 1;</code>
     * @return The bytes for systemId.
     */
    com.google.protobuf.ByteString
        getSystemIdBytes();

    /**
     * <pre>
     * line card / RE (slot number)
     * </pre>
     *
     * <code>uint32 component_id = 2;</code>
     * @return The componentId.
     */
    int getComponentId();

    /**
     * <pre>
     * PFE (if applicable)
     * </pre>
     *
     * <code>uint32 sub_component_id = 3;</code>
     * @return The subComponentId.
     */
    int getSubComponentId();

    /**
     * <pre>
     * Path specification for elements of OpenConfig data models
     * </pre>
     *
     * <code>string path = 4;</code>
     * @return The path.
     */
    java.lang.String getPath();
    /**
     * <pre>
     * Path specification for elements of OpenConfig data models
     * </pre>
     *
     * <code>string path = 4;</code>
     * @return The bytes for path.
     */
    com.google.protobuf.ByteString
        getPathBytes();

    /**
     * <pre>
     * Sequence number, monotonically increasing for each
     * system_id, component_id, sub_component_id + path.
     * </pre>
     *
     * <code>uint64 sequence_number = 5;</code>
     * @return The sequenceNumber.
     */
    long getSequenceNumber();

    /**
     * <pre>
     * timestamp (milliseconds since epoch)
     * </pre>
     *
     * <code>uint64 timestamp = 6;</code>
     * @return The timestamp.
     */
    long getTimestamp();

    /**
     * <pre>
     * List of key-value pairs
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 7;</code>
     */
    java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue> 
        getKvList();
    /**
     * <pre>
     * List of key-value pairs
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 7;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue getKv(int index);
    /**
     * <pre>
     * List of key-value pairs
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 7;</code>
     */
    int getKvCount();
    /**
     * <pre>
     * List of key-value pairs
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 7;</code>
     */
    java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder> 
        getKvOrBuilderList();
    /**
     * <pre>
     * List of key-value pairs
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 7;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder getKvOrBuilder(
        int index);

    /**
     * <pre>
     * For delete. If filled, it indicates delete
     * </pre>
     *
     * <code>repeated .telemetry.Delete delete = 8;</code>
     */
    java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Delete> 
        getDeleteList();
    /**
     * <pre>
     * For delete. If filled, it indicates delete
     * </pre>
     *
     * <code>repeated .telemetry.Delete delete = 8;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.Delete getDelete(int index);
    /**
     * <pre>
     * For delete. If filled, it indicates delete
     * </pre>
     *
     * <code>repeated .telemetry.Delete delete = 8;</code>
     */
    int getDeleteCount();
    /**
     * <pre>
     * For delete. If filled, it indicates delete
     * </pre>
     *
     * <code>repeated .telemetry.Delete delete = 8;</code>
     */
    java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.DeleteOrBuilder> 
        getDeleteOrBuilderList();
    /**
     * <pre>
     * For delete. If filled, it indicates delete
     * </pre>
     *
     * <code>repeated .telemetry.Delete delete = 8;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.DeleteOrBuilder getDeleteOrBuilder(
        int index);

    /**
     * <pre>
     * If filled, it indicates end of marker for the
     * respective path in the list.
     * </pre>
     *
     * <code>repeated .telemetry.Eom eom = 9;</code>
     */
    java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Eom> 
        getEomList();
    /**
     * <pre>
     * If filled, it indicates end of marker for the
     * respective path in the list.
     * </pre>
     *
     * <code>repeated .telemetry.Eom eom = 9;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.Eom getEom(int index);
    /**
     * <pre>
     * If filled, it indicates end of marker for the
     * respective path in the list.
     * </pre>
     *
     * <code>repeated .telemetry.Eom eom = 9;</code>
     */
    int getEomCount();
    /**
     * <pre>
     * If filled, it indicates end of marker for the
     * respective path in the list.
     * </pre>
     *
     * <code>repeated .telemetry.Eom eom = 9;</code>
     */
    java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.EomOrBuilder> 
        getEomOrBuilderList();
    /**
     * <pre>
     * If filled, it indicates end of marker for the
     * respective path in the list.
     * </pre>
     *
     * <code>repeated .telemetry.Eom eom = 9;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.EomOrBuilder getEomOrBuilder(
        int index);

    /**
     * <pre>
     * If filled, it indicates end of sync for complete subscription
     * </pre>
     *
     * <code>bool sync_response = 10;</code>
     * @return The syncResponse.
     */
    boolean getSyncResponse();
  }
  /**
   * <pre>
   * 2. Telemetry data send back on the same connection as the
   *    subscription request.
   * </pre>
   *
   * Protobuf type {@code telemetry.OpenConfigData}
   */
  public static final class OpenConfigData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.OpenConfigData)
      OpenConfigDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OpenConfigData.newBuilder() to construct.
    private OpenConfigData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OpenConfigData() {
      systemId_ = "";
      path_ = "";
      kv_ = java.util.Collections.emptyList();
      delete_ = java.util.Collections.emptyList();
      eom_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OpenConfigData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_OpenConfigData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_OpenConfigData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData.class, org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData.Builder.class);
    }

    public static final int SYSTEM_ID_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object systemId_ = "";
    /**
     * <pre>
     * router name:export IP address
     * </pre>
     *
     * <code>string system_id = 1;</code>
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
        systemId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * router name:export IP address
     * </pre>
     *
     * <code>string system_id = 1;</code>
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
     * <code>uint32 component_id = 2;</code>
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
     * <code>uint32 sub_component_id = 3;</code>
     * @return The subComponentId.
     */
    @java.lang.Override
    public int getSubComponentId() {
      return subComponentId_;
    }

    public static final int PATH_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object path_ = "";
    /**
     * <pre>
     * Path specification for elements of OpenConfig data models
     * </pre>
     *
     * <code>string path = 4;</code>
     * @return The path.
     */
    @java.lang.Override
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Path specification for elements of OpenConfig data models
     * </pre>
     *
     * <code>string path = 4;</code>
     * @return The bytes for path.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 5;
    private long sequenceNumber_ = 0L;
    /**
     * <pre>
     * Sequence number, monotonically increasing for each
     * system_id, component_id, sub_component_id + path.
     * </pre>
     *
     * <code>uint64 sequence_number = 5;</code>
     * @return The sequenceNumber.
     */
    @java.lang.Override
    public long getSequenceNumber() {
      return sequenceNumber_;
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 6;
    private long timestamp_ = 0L;
    /**
     * <pre>
     * timestamp (milliseconds since epoch)
     * </pre>
     *
     * <code>uint64 timestamp = 6;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int KV_FIELD_NUMBER = 7;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue> kv_;
    /**
     * <pre>
     * List of key-value pairs
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 7;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue> getKvList() {
      return kv_;
    }
    /**
     * <pre>
     * List of key-value pairs
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder> 
        getKvOrBuilderList() {
      return kv_;
    }
    /**
     * <pre>
     * List of key-value pairs
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 7;</code>
     */
    @java.lang.Override
    public int getKvCount() {
      return kv_.size();
    }
    /**
     * <pre>
     * List of key-value pairs
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 7;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue getKv(int index) {
      return kv_.get(index);
    }
    /**
     * <pre>
     * List of key-value pairs
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 7;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder getKvOrBuilder(
        int index) {
      return kv_.get(index);
    }

    public static final int DELETE_FIELD_NUMBER = 8;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Delete> delete_;
    /**
     * <pre>
     * For delete. If filled, it indicates delete
     * </pre>
     *
     * <code>repeated .telemetry.Delete delete = 8;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Delete> getDeleteList() {
      return delete_;
    }
    /**
     * <pre>
     * For delete. If filled, it indicates delete
     * </pre>
     *
     * <code>repeated .telemetry.Delete delete = 8;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.DeleteOrBuilder> 
        getDeleteOrBuilderList() {
      return delete_;
    }
    /**
     * <pre>
     * For delete. If filled, it indicates delete
     * </pre>
     *
     * <code>repeated .telemetry.Delete delete = 8;</code>
     */
    @java.lang.Override
    public int getDeleteCount() {
      return delete_.size();
    }
    /**
     * <pre>
     * For delete. If filled, it indicates delete
     * </pre>
     *
     * <code>repeated .telemetry.Delete delete = 8;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.Delete getDelete(int index) {
      return delete_.get(index);
    }
    /**
     * <pre>
     * For delete. If filled, it indicates delete
     * </pre>
     *
     * <code>repeated .telemetry.Delete delete = 8;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.DeleteOrBuilder getDeleteOrBuilder(
        int index) {
      return delete_.get(index);
    }

    public static final int EOM_FIELD_NUMBER = 9;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Eom> eom_;
    /**
     * <pre>
     * If filled, it indicates end of marker for the
     * respective path in the list.
     * </pre>
     *
     * <code>repeated .telemetry.Eom eom = 9;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Eom> getEomList() {
      return eom_;
    }
    /**
     * <pre>
     * If filled, it indicates end of marker for the
     * respective path in the list.
     * </pre>
     *
     * <code>repeated .telemetry.Eom eom = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.EomOrBuilder> 
        getEomOrBuilderList() {
      return eom_;
    }
    /**
     * <pre>
     * If filled, it indicates end of marker for the
     * respective path in the list.
     * </pre>
     *
     * <code>repeated .telemetry.Eom eom = 9;</code>
     */
    @java.lang.Override
    public int getEomCount() {
      return eom_.size();
    }
    /**
     * <pre>
     * If filled, it indicates end of marker for the
     * respective path in the list.
     * </pre>
     *
     * <code>repeated .telemetry.Eom eom = 9;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.Eom getEom(int index) {
      return eom_.get(index);
    }
    /**
     * <pre>
     * If filled, it indicates end of marker for the
     * respective path in the list.
     * </pre>
     *
     * <code>repeated .telemetry.Eom eom = 9;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.EomOrBuilder getEomOrBuilder(
        int index) {
      return eom_.get(index);
    }

    public static final int SYNC_RESPONSE_FIELD_NUMBER = 10;
    private boolean syncResponse_ = false;
    /**
     * <pre>
     * If filled, it indicates end of sync for complete subscription
     * </pre>
     *
     * <code>bool sync_response = 10;</code>
     * @return The syncResponse.
     */
    @java.lang.Override
    public boolean getSyncResponse() {
      return syncResponse_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(systemId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, systemId_);
      }
      if (componentId_ != 0) {
        output.writeUInt32(2, componentId_);
      }
      if (subComponentId_ != 0) {
        output.writeUInt32(3, subComponentId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, path_);
      }
      if (sequenceNumber_ != 0L) {
        output.writeUInt64(5, sequenceNumber_);
      }
      if (timestamp_ != 0L) {
        output.writeUInt64(6, timestamp_);
      }
      for (int i = 0; i < kv_.size(); i++) {
        output.writeMessage(7, kv_.get(i));
      }
      for (int i = 0; i < delete_.size(); i++) {
        output.writeMessage(8, delete_.get(i));
      }
      for (int i = 0; i < eom_.size(); i++) {
        output.writeMessage(9, eom_.get(i));
      }
      if (syncResponse_ != false) {
        output.writeBool(10, syncResponse_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(systemId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, systemId_);
      }
      if (componentId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, componentId_);
      }
      if (subComponentId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, subComponentId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, path_);
      }
      if (sequenceNumber_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, sequenceNumber_);
      }
      if (timestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, timestamp_);
      }
      for (int i = 0; i < kv_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, kv_.get(i));
      }
      for (int i = 0; i < delete_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, delete_.get(i));
      }
      for (int i = 0; i < eom_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, eom_.get(i));
      }
      if (syncResponse_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, syncResponse_);
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData other = (org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData) obj;

      if (!getSystemId()
          .equals(other.getSystemId())) return false;
      if (getComponentId()
          != other.getComponentId()) return false;
      if (getSubComponentId()
          != other.getSubComponentId()) return false;
      if (!getPath()
          .equals(other.getPath())) return false;
      if (getSequenceNumber()
          != other.getSequenceNumber()) return false;
      if (getTimestamp()
          != other.getTimestamp()) return false;
      if (!getKvList()
          .equals(other.getKvList())) return false;
      if (!getDeleteList()
          .equals(other.getDeleteList())) return false;
      if (!getEomList()
          .equals(other.getEomList())) return false;
      if (getSyncResponse()
          != other.getSyncResponse()) return false;
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
      hash = (37 * hash) + SYSTEM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSystemId().hashCode();
      hash = (37 * hash) + COMPONENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getComponentId();
      hash = (37 * hash) + SUB_COMPONENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSubComponentId();
      hash = (37 * hash) + PATH_FIELD_NUMBER;
      hash = (53 * hash) + getPath().hashCode();
      hash = (37 * hash) + SEQUENCE_NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSequenceNumber());
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimestamp());
      if (getKvCount() > 0) {
        hash = (37 * hash) + KV_FIELD_NUMBER;
        hash = (53 * hash) + getKvList().hashCode();
      }
      if (getDeleteCount() > 0) {
        hash = (37 * hash) + DELETE_FIELD_NUMBER;
        hash = (53 * hash) + getDeleteList().hashCode();
      }
      if (getEomCount() > 0) {
        hash = (37 * hash) + EOM_FIELD_NUMBER;
        hash = (53 * hash) + getEomList().hashCode();
      }
      hash = (37 * hash) + SYNC_RESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSyncResponse());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData prototype) {
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
     * 2. Telemetry data send back on the same connection as the
     *    subscription request.
     * </pre>
     *
     * Protobuf type {@code telemetry.OpenConfigData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.OpenConfigData)
        org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_OpenConfigData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_OpenConfigData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData.class, org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData.newBuilder()
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
        systemId_ = "";
        componentId_ = 0;
        subComponentId_ = 0;
        path_ = "";
        sequenceNumber_ = 0L;
        timestamp_ = 0L;
        if (kvBuilder_ == null) {
          kv_ = java.util.Collections.emptyList();
        } else {
          kv_ = null;
          kvBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000040);
        if (deleteBuilder_ == null) {
          delete_ = java.util.Collections.emptyList();
        } else {
          delete_ = null;
          deleteBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000080);
        if (eomBuilder_ == null) {
          eom_ = java.util.Collections.emptyList();
        } else {
          eom_ = null;
          eomBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000100);
        syncResponse_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_OpenConfigData_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData result = new org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData result) {
        if (kvBuilder_ == null) {
          if (((bitField0_ & 0x00000040) != 0)) {
            kv_ = java.util.Collections.unmodifiableList(kv_);
            bitField0_ = (bitField0_ & ~0x00000040);
          }
          result.kv_ = kv_;
        } else {
          result.kv_ = kvBuilder_.build();
        }
        if (deleteBuilder_ == null) {
          if (((bitField0_ & 0x00000080) != 0)) {
            delete_ = java.util.Collections.unmodifiableList(delete_);
            bitField0_ = (bitField0_ & ~0x00000080);
          }
          result.delete_ = delete_;
        } else {
          result.delete_ = deleteBuilder_.build();
        }
        if (eomBuilder_ == null) {
          if (((bitField0_ & 0x00000100) != 0)) {
            eom_ = java.util.Collections.unmodifiableList(eom_);
            bitField0_ = (bitField0_ & ~0x00000100);
          }
          result.eom_ = eom_;
        } else {
          result.eom_ = eomBuilder_.build();
        }
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.systemId_ = systemId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.componentId_ = componentId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.subComponentId_ = subComponentId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.path_ = path_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.sequenceNumber_ = sequenceNumber_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.timestamp_ = timestamp_;
        }
        if (((from_bitField0_ & 0x00000200) != 0)) {
          result.syncResponse_ = syncResponse_;
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
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData.getDefaultInstance()) return this;
        if (!other.getSystemId().isEmpty()) {
          systemId_ = other.systemId_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.getComponentId() != 0) {
          setComponentId(other.getComponentId());
        }
        if (other.getSubComponentId() != 0) {
          setSubComponentId(other.getSubComponentId());
        }
        if (!other.getPath().isEmpty()) {
          path_ = other.path_;
          bitField0_ |= 0x00000008;
          onChanged();
        }
        if (other.getSequenceNumber() != 0L) {
          setSequenceNumber(other.getSequenceNumber());
        }
        if (other.getTimestamp() != 0L) {
          setTimestamp(other.getTimestamp());
        }
        if (kvBuilder_ == null) {
          if (!other.kv_.isEmpty()) {
            if (kv_.isEmpty()) {
              kv_ = other.kv_;
              bitField0_ = (bitField0_ & ~0x00000040);
            } else {
              ensureKvIsMutable();
              kv_.addAll(other.kv_);
            }
            onChanged();
          }
        } else {
          if (!other.kv_.isEmpty()) {
            if (kvBuilder_.isEmpty()) {
              kvBuilder_.dispose();
              kvBuilder_ = null;
              kv_ = other.kv_;
              bitField0_ = (bitField0_ & ~0x00000040);
              kvBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getKvFieldBuilder() : null;
            } else {
              kvBuilder_.addAllMessages(other.kv_);
            }
          }
        }
        if (deleteBuilder_ == null) {
          if (!other.delete_.isEmpty()) {
            if (delete_.isEmpty()) {
              delete_ = other.delete_;
              bitField0_ = (bitField0_ & ~0x00000080);
            } else {
              ensureDeleteIsMutable();
              delete_.addAll(other.delete_);
            }
            onChanged();
          }
        } else {
          if (!other.delete_.isEmpty()) {
            if (deleteBuilder_.isEmpty()) {
              deleteBuilder_.dispose();
              deleteBuilder_ = null;
              delete_ = other.delete_;
              bitField0_ = (bitField0_ & ~0x00000080);
              deleteBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDeleteFieldBuilder() : null;
            } else {
              deleteBuilder_.addAllMessages(other.delete_);
            }
          }
        }
        if (eomBuilder_ == null) {
          if (!other.eom_.isEmpty()) {
            if (eom_.isEmpty()) {
              eom_ = other.eom_;
              bitField0_ = (bitField0_ & ~0x00000100);
            } else {
              ensureEomIsMutable();
              eom_.addAll(other.eom_);
            }
            onChanged();
          }
        } else {
          if (!other.eom_.isEmpty()) {
            if (eomBuilder_.isEmpty()) {
              eomBuilder_.dispose();
              eomBuilder_ = null;
              eom_ = other.eom_;
              bitField0_ = (bitField0_ & ~0x00000100);
              eomBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEomFieldBuilder() : null;
            } else {
              eomBuilder_.addAllMessages(other.eom_);
            }
          }
        }
        if (other.getSyncResponse() != false) {
          setSyncResponse(other.getSyncResponse());
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
                systemId_ = input.readStringRequireUtf8();
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
                path_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              case 40: {
                sequenceNumber_ = input.readUInt64();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              case 48: {
                timestamp_ = input.readUInt64();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
              case 58: {
                org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue m =
                    input.readMessage(
                        org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.parser(),
                        extensionRegistry);
                if (kvBuilder_ == null) {
                  ensureKvIsMutable();
                  kv_.add(m);
                } else {
                  kvBuilder_.addMessage(m);
                }
                break;
              } // case 58
              case 66: {
                org.opennms.features.openconfig.proto.jti.Telemetry.Delete m =
                    input.readMessage(
                        org.opennms.features.openconfig.proto.jti.Telemetry.Delete.parser(),
                        extensionRegistry);
                if (deleteBuilder_ == null) {
                  ensureDeleteIsMutable();
                  delete_.add(m);
                } else {
                  deleteBuilder_.addMessage(m);
                }
                break;
              } // case 66
              case 74: {
                org.opennms.features.openconfig.proto.jti.Telemetry.Eom m =
                    input.readMessage(
                        org.opennms.features.openconfig.proto.jti.Telemetry.Eom.parser(),
                        extensionRegistry);
                if (eomBuilder_ == null) {
                  ensureEomIsMutable();
                  eom_.add(m);
                } else {
                  eomBuilder_.addMessage(m);
                }
                break;
              } // case 74
              case 80: {
                syncResponse_ = input.readBool();
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

      private java.lang.Object systemId_ = "";
      /**
       * <pre>
       * router name:export IP address
       * </pre>
       *
       * <code>string system_id = 1;</code>
       * @return The systemId.
       */
      public java.lang.String getSystemId() {
        java.lang.Object ref = systemId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          systemId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * router name:export IP address
       * </pre>
       *
       * <code>string system_id = 1;</code>
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
       * router name:export IP address
       * </pre>
       *
       * <code>string system_id = 1;</code>
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
       * router name:export IP address
       * </pre>
       *
       * <code>string system_id = 1;</code>
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
       * router name:export IP address
       * </pre>
       *
       * <code>string system_id = 1;</code>
       * @param value The bytes for systemId to set.
       * @return This builder for chaining.
       */
      public Builder setSystemIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
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
       * <code>uint32 component_id = 2;</code>
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
       * <code>uint32 component_id = 2;</code>
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
       * <code>uint32 component_id = 2;</code>
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
       * <code>uint32 sub_component_id = 3;</code>
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
       * <code>uint32 sub_component_id = 3;</code>
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
       * <code>uint32 sub_component_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSubComponentId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        subComponentId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object path_ = "";
      /**
       * <pre>
       * Path specification for elements of OpenConfig data models
       * </pre>
       *
       * <code>string path = 4;</code>
       * @return The path.
       */
      public java.lang.String getPath() {
        java.lang.Object ref = path_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          path_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Path specification for elements of OpenConfig data models
       * </pre>
       *
       * <code>string path = 4;</code>
       * @return The bytes for path.
       */
      public com.google.protobuf.ByteString
          getPathBytes() {
        java.lang.Object ref = path_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          path_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Path specification for elements of OpenConfig data models
       * </pre>
       *
       * <code>string path = 4;</code>
       * @param value The path to set.
       * @return This builder for chaining.
       */
      public Builder setPath(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        path_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Path specification for elements of OpenConfig data models
       * </pre>
       *
       * <code>string path = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPath() {
        path_ = getDefaultInstance().getPath();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Path specification for elements of OpenConfig data models
       * </pre>
       *
       * <code>string path = 4;</code>
       * @param value The bytes for path to set.
       * @return This builder for chaining.
       */
      public Builder setPathBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        path_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }

      private long sequenceNumber_ ;
      /**
       * <pre>
       * Sequence number, monotonically increasing for each
       * system_id, component_id, sub_component_id + path.
       * </pre>
       *
       * <code>uint64 sequence_number = 5;</code>
       * @return The sequenceNumber.
       */
      @java.lang.Override
      public long getSequenceNumber() {
        return sequenceNumber_;
      }
      /**
       * <pre>
       * Sequence number, monotonically increasing for each
       * system_id, component_id, sub_component_id + path.
       * </pre>
       *
       * <code>uint64 sequence_number = 5;</code>
       * @param value The sequenceNumber to set.
       * @return This builder for chaining.
       */
      public Builder setSequenceNumber(long value) {

        sequenceNumber_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Sequence number, monotonically increasing for each
       * system_id, component_id, sub_component_id + path.
       * </pre>
       *
       * <code>uint64 sequence_number = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearSequenceNumber() {
        bitField0_ = (bitField0_ & ~0x00000010);
        sequenceNumber_ = 0L;
        onChanged();
        return this;
      }

      private long timestamp_ ;
      /**
       * <pre>
       * timestamp (milliseconds since epoch)
       * </pre>
       *
       * <code>uint64 timestamp = 6;</code>
       * @return The timestamp.
       */
      @java.lang.Override
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <pre>
       * timestamp (milliseconds since epoch)
       * </pre>
       *
       * <code>uint64 timestamp = 6;</code>
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
       * timestamp (milliseconds since epoch)
       * </pre>
       *
       * <code>uint64 timestamp = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000020);
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue> kv_ =
        java.util.Collections.emptyList();
      private void ensureKvIsMutable() {
        if (!((bitField0_ & 0x00000040) != 0)) {
          kv_ = new java.util.ArrayList<org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue>(kv_);
          bitField0_ |= 0x00000040;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder> kvBuilder_;

      /**
       * <pre>
       * List of key-value pairs
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 7;</code>
       */
      public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue> getKvList() {
        if (kvBuilder_ == null) {
          return java.util.Collections.unmodifiableList(kv_);
        } else {
          return kvBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * List of key-value pairs
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 7;</code>
       */
      public int getKvCount() {
        if (kvBuilder_ == null) {
          return kv_.size();
        } else {
          return kvBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * List of key-value pairs
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 7;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue getKv(int index) {
        if (kvBuilder_ == null) {
          return kv_.get(index);
        } else {
          return kvBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * List of key-value pairs
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 7;</code>
       */
      public Builder setKv(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue value) {
        if (kvBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureKvIsMutable();
          kv_.set(index, value);
          onChanged();
        } else {
          kvBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * List of key-value pairs
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 7;</code>
       */
      public Builder setKv(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder builderForValue) {
        if (kvBuilder_ == null) {
          ensureKvIsMutable();
          kv_.set(index, builderForValue.build());
          onChanged();
        } else {
          kvBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of key-value pairs
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 7;</code>
       */
      public Builder addKv(org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue value) {
        if (kvBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureKvIsMutable();
          kv_.add(value);
          onChanged();
        } else {
          kvBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * List of key-value pairs
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 7;</code>
       */
      public Builder addKv(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue value) {
        if (kvBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureKvIsMutable();
          kv_.add(index, value);
          onChanged();
        } else {
          kvBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * List of key-value pairs
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 7;</code>
       */
      public Builder addKv(
          org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder builderForValue) {
        if (kvBuilder_ == null) {
          ensureKvIsMutable();
          kv_.add(builderForValue.build());
          onChanged();
        } else {
          kvBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of key-value pairs
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 7;</code>
       */
      public Builder addKv(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder builderForValue) {
        if (kvBuilder_ == null) {
          ensureKvIsMutable();
          kv_.add(index, builderForValue.build());
          onChanged();
        } else {
          kvBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of key-value pairs
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 7;</code>
       */
      public Builder addAllKv(
          java.lang.Iterable<? extends org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue> values) {
        if (kvBuilder_ == null) {
          ensureKvIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, kv_);
          onChanged();
        } else {
          kvBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * List of key-value pairs
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 7;</code>
       */
      public Builder clearKv() {
        if (kvBuilder_ == null) {
          kv_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000040);
          onChanged();
        } else {
          kvBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * List of key-value pairs
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 7;</code>
       */
      public Builder removeKv(int index) {
        if (kvBuilder_ == null) {
          ensureKvIsMutable();
          kv_.remove(index);
          onChanged();
        } else {
          kvBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * List of key-value pairs
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 7;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder getKvBuilder(
          int index) {
        return getKvFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * List of key-value pairs
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 7;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder getKvOrBuilder(
          int index) {
        if (kvBuilder_ == null) {
          return kv_.get(index);  } else {
          return kvBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * List of key-value pairs
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 7;</code>
       */
      public java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder> 
           getKvOrBuilderList() {
        if (kvBuilder_ != null) {
          return kvBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(kv_);
        }
      }
      /**
       * <pre>
       * List of key-value pairs
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 7;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder addKvBuilder() {
        return getKvFieldBuilder().addBuilder(
            org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.getDefaultInstance());
      }
      /**
       * <pre>
       * List of key-value pairs
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 7;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder addKvBuilder(
          int index) {
        return getKvFieldBuilder().addBuilder(
            index, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.getDefaultInstance());
      }
      /**
       * <pre>
       * List of key-value pairs
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 7;</code>
       */
      public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder> 
           getKvBuilderList() {
        return getKvFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder> 
          getKvFieldBuilder() {
        if (kvBuilder_ == null) {
          kvBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder>(
                  kv_,
                  ((bitField0_ & 0x00000040) != 0),
                  getParentForChildren(),
                  isClean());
          kv_ = null;
        }
        return kvBuilder_;
      }

      private java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Delete> delete_ =
        java.util.Collections.emptyList();
      private void ensureDeleteIsMutable() {
        if (!((bitField0_ & 0x00000080) != 0)) {
          delete_ = new java.util.ArrayList<org.opennms.features.openconfig.proto.jti.Telemetry.Delete>(delete_);
          bitField0_ |= 0x00000080;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.Delete, org.opennms.features.openconfig.proto.jti.Telemetry.Delete.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.DeleteOrBuilder> deleteBuilder_;

      /**
       * <pre>
       * For delete. If filled, it indicates delete
       * </pre>
       *
       * <code>repeated .telemetry.Delete delete = 8;</code>
       */
      public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Delete> getDeleteList() {
        if (deleteBuilder_ == null) {
          return java.util.Collections.unmodifiableList(delete_);
        } else {
          return deleteBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * For delete. If filled, it indicates delete
       * </pre>
       *
       * <code>repeated .telemetry.Delete delete = 8;</code>
       */
      public int getDeleteCount() {
        if (deleteBuilder_ == null) {
          return delete_.size();
        } else {
          return deleteBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * For delete. If filled, it indicates delete
       * </pre>
       *
       * <code>repeated .telemetry.Delete delete = 8;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Delete getDelete(int index) {
        if (deleteBuilder_ == null) {
          return delete_.get(index);
        } else {
          return deleteBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * For delete. If filled, it indicates delete
       * </pre>
       *
       * <code>repeated .telemetry.Delete delete = 8;</code>
       */
      public Builder setDelete(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Delete value) {
        if (deleteBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDeleteIsMutable();
          delete_.set(index, value);
          onChanged();
        } else {
          deleteBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * For delete. If filled, it indicates delete
       * </pre>
       *
       * <code>repeated .telemetry.Delete delete = 8;</code>
       */
      public Builder setDelete(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Delete.Builder builderForValue) {
        if (deleteBuilder_ == null) {
          ensureDeleteIsMutable();
          delete_.set(index, builderForValue.build());
          onChanged();
        } else {
          deleteBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * For delete. If filled, it indicates delete
       * </pre>
       *
       * <code>repeated .telemetry.Delete delete = 8;</code>
       */
      public Builder addDelete(org.opennms.features.openconfig.proto.jti.Telemetry.Delete value) {
        if (deleteBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDeleteIsMutable();
          delete_.add(value);
          onChanged();
        } else {
          deleteBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * For delete. If filled, it indicates delete
       * </pre>
       *
       * <code>repeated .telemetry.Delete delete = 8;</code>
       */
      public Builder addDelete(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Delete value) {
        if (deleteBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDeleteIsMutable();
          delete_.add(index, value);
          onChanged();
        } else {
          deleteBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * For delete. If filled, it indicates delete
       * </pre>
       *
       * <code>repeated .telemetry.Delete delete = 8;</code>
       */
      public Builder addDelete(
          org.opennms.features.openconfig.proto.jti.Telemetry.Delete.Builder builderForValue) {
        if (deleteBuilder_ == null) {
          ensureDeleteIsMutable();
          delete_.add(builderForValue.build());
          onChanged();
        } else {
          deleteBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * For delete. If filled, it indicates delete
       * </pre>
       *
       * <code>repeated .telemetry.Delete delete = 8;</code>
       */
      public Builder addDelete(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Delete.Builder builderForValue) {
        if (deleteBuilder_ == null) {
          ensureDeleteIsMutable();
          delete_.add(index, builderForValue.build());
          onChanged();
        } else {
          deleteBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * For delete. If filled, it indicates delete
       * </pre>
       *
       * <code>repeated .telemetry.Delete delete = 8;</code>
       */
      public Builder addAllDelete(
          java.lang.Iterable<? extends org.opennms.features.openconfig.proto.jti.Telemetry.Delete> values) {
        if (deleteBuilder_ == null) {
          ensureDeleteIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, delete_);
          onChanged();
        } else {
          deleteBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * For delete. If filled, it indicates delete
       * </pre>
       *
       * <code>repeated .telemetry.Delete delete = 8;</code>
       */
      public Builder clearDelete() {
        if (deleteBuilder_ == null) {
          delete_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000080);
          onChanged();
        } else {
          deleteBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * For delete. If filled, it indicates delete
       * </pre>
       *
       * <code>repeated .telemetry.Delete delete = 8;</code>
       */
      public Builder removeDelete(int index) {
        if (deleteBuilder_ == null) {
          ensureDeleteIsMutable();
          delete_.remove(index);
          onChanged();
        } else {
          deleteBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * For delete. If filled, it indicates delete
       * </pre>
       *
       * <code>repeated .telemetry.Delete delete = 8;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Delete.Builder getDeleteBuilder(
          int index) {
        return getDeleteFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * For delete. If filled, it indicates delete
       * </pre>
       *
       * <code>repeated .telemetry.Delete delete = 8;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.DeleteOrBuilder getDeleteOrBuilder(
          int index) {
        if (deleteBuilder_ == null) {
          return delete_.get(index);  } else {
          return deleteBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * For delete. If filled, it indicates delete
       * </pre>
       *
       * <code>repeated .telemetry.Delete delete = 8;</code>
       */
      public java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.DeleteOrBuilder> 
           getDeleteOrBuilderList() {
        if (deleteBuilder_ != null) {
          return deleteBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(delete_);
        }
      }
      /**
       * <pre>
       * For delete. If filled, it indicates delete
       * </pre>
       *
       * <code>repeated .telemetry.Delete delete = 8;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Delete.Builder addDeleteBuilder() {
        return getDeleteFieldBuilder().addBuilder(
            org.opennms.features.openconfig.proto.jti.Telemetry.Delete.getDefaultInstance());
      }
      /**
       * <pre>
       * For delete. If filled, it indicates delete
       * </pre>
       *
       * <code>repeated .telemetry.Delete delete = 8;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Delete.Builder addDeleteBuilder(
          int index) {
        return getDeleteFieldBuilder().addBuilder(
            index, org.opennms.features.openconfig.proto.jti.Telemetry.Delete.getDefaultInstance());
      }
      /**
       * <pre>
       * For delete. If filled, it indicates delete
       * </pre>
       *
       * <code>repeated .telemetry.Delete delete = 8;</code>
       */
      public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Delete.Builder> 
           getDeleteBuilderList() {
        return getDeleteFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.Delete, org.opennms.features.openconfig.proto.jti.Telemetry.Delete.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.DeleteOrBuilder> 
          getDeleteFieldBuilder() {
        if (deleteBuilder_ == null) {
          deleteBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.features.openconfig.proto.jti.Telemetry.Delete, org.opennms.features.openconfig.proto.jti.Telemetry.Delete.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.DeleteOrBuilder>(
                  delete_,
                  ((bitField0_ & 0x00000080) != 0),
                  getParentForChildren(),
                  isClean());
          delete_ = null;
        }
        return deleteBuilder_;
      }

      private java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Eom> eom_ =
        java.util.Collections.emptyList();
      private void ensureEomIsMutable() {
        if (!((bitField0_ & 0x00000100) != 0)) {
          eom_ = new java.util.ArrayList<org.opennms.features.openconfig.proto.jti.Telemetry.Eom>(eom_);
          bitField0_ |= 0x00000100;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.Eom, org.opennms.features.openconfig.proto.jti.Telemetry.Eom.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.EomOrBuilder> eomBuilder_;

      /**
       * <pre>
       * If filled, it indicates end of marker for the
       * respective path in the list.
       * </pre>
       *
       * <code>repeated .telemetry.Eom eom = 9;</code>
       */
      public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Eom> getEomList() {
        if (eomBuilder_ == null) {
          return java.util.Collections.unmodifiableList(eom_);
        } else {
          return eomBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * If filled, it indicates end of marker for the
       * respective path in the list.
       * </pre>
       *
       * <code>repeated .telemetry.Eom eom = 9;</code>
       */
      public int getEomCount() {
        if (eomBuilder_ == null) {
          return eom_.size();
        } else {
          return eomBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * If filled, it indicates end of marker for the
       * respective path in the list.
       * </pre>
       *
       * <code>repeated .telemetry.Eom eom = 9;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Eom getEom(int index) {
        if (eomBuilder_ == null) {
          return eom_.get(index);
        } else {
          return eomBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * If filled, it indicates end of marker for the
       * respective path in the list.
       * </pre>
       *
       * <code>repeated .telemetry.Eom eom = 9;</code>
       */
      public Builder setEom(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Eom value) {
        if (eomBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEomIsMutable();
          eom_.set(index, value);
          onChanged();
        } else {
          eomBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * If filled, it indicates end of marker for the
       * respective path in the list.
       * </pre>
       *
       * <code>repeated .telemetry.Eom eom = 9;</code>
       */
      public Builder setEom(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Eom.Builder builderForValue) {
        if (eomBuilder_ == null) {
          ensureEomIsMutable();
          eom_.set(index, builderForValue.build());
          onChanged();
        } else {
          eomBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * If filled, it indicates end of marker for the
       * respective path in the list.
       * </pre>
       *
       * <code>repeated .telemetry.Eom eom = 9;</code>
       */
      public Builder addEom(org.opennms.features.openconfig.proto.jti.Telemetry.Eom value) {
        if (eomBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEomIsMutable();
          eom_.add(value);
          onChanged();
        } else {
          eomBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * If filled, it indicates end of marker for the
       * respective path in the list.
       * </pre>
       *
       * <code>repeated .telemetry.Eom eom = 9;</code>
       */
      public Builder addEom(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Eom value) {
        if (eomBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEomIsMutable();
          eom_.add(index, value);
          onChanged();
        } else {
          eomBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * If filled, it indicates end of marker for the
       * respective path in the list.
       * </pre>
       *
       * <code>repeated .telemetry.Eom eom = 9;</code>
       */
      public Builder addEom(
          org.opennms.features.openconfig.proto.jti.Telemetry.Eom.Builder builderForValue) {
        if (eomBuilder_ == null) {
          ensureEomIsMutable();
          eom_.add(builderForValue.build());
          onChanged();
        } else {
          eomBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * If filled, it indicates end of marker for the
       * respective path in the list.
       * </pre>
       *
       * <code>repeated .telemetry.Eom eom = 9;</code>
       */
      public Builder addEom(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.Eom.Builder builderForValue) {
        if (eomBuilder_ == null) {
          ensureEomIsMutable();
          eom_.add(index, builderForValue.build());
          onChanged();
        } else {
          eomBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * If filled, it indicates end of marker for the
       * respective path in the list.
       * </pre>
       *
       * <code>repeated .telemetry.Eom eom = 9;</code>
       */
      public Builder addAllEom(
          java.lang.Iterable<? extends org.opennms.features.openconfig.proto.jti.Telemetry.Eom> values) {
        if (eomBuilder_ == null) {
          ensureEomIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, eom_);
          onChanged();
        } else {
          eomBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * If filled, it indicates end of marker for the
       * respective path in the list.
       * </pre>
       *
       * <code>repeated .telemetry.Eom eom = 9;</code>
       */
      public Builder clearEom() {
        if (eomBuilder_ == null) {
          eom_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000100);
          onChanged();
        } else {
          eomBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * If filled, it indicates end of marker for the
       * respective path in the list.
       * </pre>
       *
       * <code>repeated .telemetry.Eom eom = 9;</code>
       */
      public Builder removeEom(int index) {
        if (eomBuilder_ == null) {
          ensureEomIsMutable();
          eom_.remove(index);
          onChanged();
        } else {
          eomBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * If filled, it indicates end of marker for the
       * respective path in the list.
       * </pre>
       *
       * <code>repeated .telemetry.Eom eom = 9;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Eom.Builder getEomBuilder(
          int index) {
        return getEomFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * If filled, it indicates end of marker for the
       * respective path in the list.
       * </pre>
       *
       * <code>repeated .telemetry.Eom eom = 9;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.EomOrBuilder getEomOrBuilder(
          int index) {
        if (eomBuilder_ == null) {
          return eom_.get(index);  } else {
          return eomBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * If filled, it indicates end of marker for the
       * respective path in the list.
       * </pre>
       *
       * <code>repeated .telemetry.Eom eom = 9;</code>
       */
      public java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.EomOrBuilder> 
           getEomOrBuilderList() {
        if (eomBuilder_ != null) {
          return eomBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(eom_);
        }
      }
      /**
       * <pre>
       * If filled, it indicates end of marker for the
       * respective path in the list.
       * </pre>
       *
       * <code>repeated .telemetry.Eom eom = 9;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Eom.Builder addEomBuilder() {
        return getEomFieldBuilder().addBuilder(
            org.opennms.features.openconfig.proto.jti.Telemetry.Eom.getDefaultInstance());
      }
      /**
       * <pre>
       * If filled, it indicates end of marker for the
       * respective path in the list.
       * </pre>
       *
       * <code>repeated .telemetry.Eom eom = 9;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.Eom.Builder addEomBuilder(
          int index) {
        return getEomFieldBuilder().addBuilder(
            index, org.opennms.features.openconfig.proto.jti.Telemetry.Eom.getDefaultInstance());
      }
      /**
       * <pre>
       * If filled, it indicates end of marker for the
       * respective path in the list.
       * </pre>
       *
       * <code>repeated .telemetry.Eom eom = 9;</code>
       */
      public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.Eom.Builder> 
           getEomBuilderList() {
        return getEomFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.Eom, org.opennms.features.openconfig.proto.jti.Telemetry.Eom.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.EomOrBuilder> 
          getEomFieldBuilder() {
        if (eomBuilder_ == null) {
          eomBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.features.openconfig.proto.jti.Telemetry.Eom, org.opennms.features.openconfig.proto.jti.Telemetry.Eom.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.EomOrBuilder>(
                  eom_,
                  ((bitField0_ & 0x00000100) != 0),
                  getParentForChildren(),
                  isClean());
          eom_ = null;
        }
        return eomBuilder_;
      }

      private boolean syncResponse_ ;
      /**
       * <pre>
       * If filled, it indicates end of sync for complete subscription
       * </pre>
       *
       * <code>bool sync_response = 10;</code>
       * @return The syncResponse.
       */
      @java.lang.Override
      public boolean getSyncResponse() {
        return syncResponse_;
      }
      /**
       * <pre>
       * If filled, it indicates end of sync for complete subscription
       * </pre>
       *
       * <code>bool sync_response = 10;</code>
       * @param value The syncResponse to set.
       * @return This builder for chaining.
       */
      public Builder setSyncResponse(boolean value) {

        syncResponse_ = value;
        bitField0_ |= 0x00000200;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * If filled, it indicates end of sync for complete subscription
       * </pre>
       *
       * <code>bool sync_response = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearSyncResponse() {
        bitField0_ = (bitField0_ & ~0x00000200);
        syncResponse_ = false;
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


      // @@protoc_insertion_point(builder_scope:telemetry.OpenConfigData)
    }

    // @@protoc_insertion_point(class_scope:telemetry.OpenConfigData)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OpenConfigData>
        PARSER = new com.google.protobuf.AbstractParser<OpenConfigData>() {
      @java.lang.Override
      public OpenConfigData parsePartialFrom(
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

    public static com.google.protobuf.Parser<OpenConfigData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OpenConfigData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.OpenConfigData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface KeyValueOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.KeyValue)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Key
     * </pre>
     *
     * <code>string key = 1;</code>
     * @return The key.
     */
    java.lang.String getKey();
    /**
     * <pre>
     * Key
     * </pre>
     *
     * <code>string key = 1;</code>
     * @return The bytes for key.
     */
    com.google.protobuf.ByteString
        getKeyBytes();

    /**
     * <code>double double_value = 5;</code>
     * @return Whether the doubleValue field is set.
     */
    boolean hasDoubleValue();
    /**
     * <code>double double_value = 5;</code>
     * @return The doubleValue.
     */
    double getDoubleValue();

    /**
     * <code>int64 int_value = 6;</code>
     * @return Whether the intValue field is set.
     */
    boolean hasIntValue();
    /**
     * <code>int64 int_value = 6;</code>
     * @return The intValue.
     */
    long getIntValue();

    /**
     * <code>uint64 uint_value = 7;</code>
     * @return Whether the uintValue field is set.
     */
    boolean hasUintValue();
    /**
     * <code>uint64 uint_value = 7;</code>
     * @return The uintValue.
     */
    long getUintValue();

    /**
     * <code>sint64 sint_value = 8;</code>
     * @return Whether the sintValue field is set.
     */
    boolean hasSintValue();
    /**
     * <code>sint64 sint_value = 8;</code>
     * @return The sintValue.
     */
    long getSintValue();

    /**
     * <code>bool bool_value = 9;</code>
     * @return Whether the boolValue field is set.
     */
    boolean hasBoolValue();
    /**
     * <code>bool bool_value = 9;</code>
     * @return The boolValue.
     */
    boolean getBoolValue();

    /**
     * <code>string str_value = 10;</code>
     * @return Whether the strValue field is set.
     */
    boolean hasStrValue();
    /**
     * <code>string str_value = 10;</code>
     * @return The strValue.
     */
    java.lang.String getStrValue();
    /**
     * <code>string str_value = 10;</code>
     * @return The bytes for strValue.
     */
    com.google.protobuf.ByteString
        getStrValueBytes();

    /**
     * <code>bytes bytes_value = 11;</code>
     * @return Whether the bytesValue field is set.
     */
    boolean hasBytesValue();
    /**
     * <code>bytes bytes_value = 11;</code>
     * @return The bytesValue.
     */
    com.google.protobuf.ByteString getBytesValue();

    org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.ValueCase getValueCase();
  }
  /**
   * <pre>
   * Simple Key-value, where value could be one of scalar types
   * </pre>
   *
   * Protobuf type {@code telemetry.KeyValue}
   */
  public static final class KeyValue extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.KeyValue)
      KeyValueOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KeyValue.newBuilder() to construct.
    private KeyValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KeyValue() {
      key_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new KeyValue();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_KeyValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_KeyValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.class, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder.class);
    }

    private int valueCase_ = 0;
    @SuppressWarnings("serial")
    private java.lang.Object value_;
    public enum ValueCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      DOUBLE_VALUE(5),
      INT_VALUE(6),
      UINT_VALUE(7),
      SINT_VALUE(8),
      BOOL_VALUE(9),
      STR_VALUE(10),
      BYTES_VALUE(11),
      VALUE_NOT_SET(0);
      private final int value;
      private ValueCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ValueCase valueOf(int value) {
        return forNumber(value);
      }

      public static ValueCase forNumber(int value) {
        switch (value) {
          case 5: return DOUBLE_VALUE;
          case 6: return INT_VALUE;
          case 7: return UINT_VALUE;
          case 8: return SINT_VALUE;
          case 9: return BOOL_VALUE;
          case 10: return STR_VALUE;
          case 11: return BYTES_VALUE;
          case 0: return VALUE_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public ValueCase
    getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public static final int KEY_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object key_ = "";
    /**
     * <pre>
     * Key
     * </pre>
     *
     * <code>string key = 1;</code>
     * @return The key.
     */
    @java.lang.Override
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Key
     * </pre>
     *
     * <code>string key = 1;</code>
     * @return The bytes for key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DOUBLE_VALUE_FIELD_NUMBER = 5;
    /**
     * <code>double double_value = 5;</code>
     * @return Whether the doubleValue field is set.
     */
    @java.lang.Override
    public boolean hasDoubleValue() {
      return valueCase_ == 5;
    }
    /**
     * <code>double double_value = 5;</code>
     * @return The doubleValue.
     */
    @java.lang.Override
    public double getDoubleValue() {
      if (valueCase_ == 5) {
        return (java.lang.Double) value_;
      }
      return 0D;
    }

    public static final int INT_VALUE_FIELD_NUMBER = 6;
    /**
     * <code>int64 int_value = 6;</code>
     * @return Whether the intValue field is set.
     */
    @java.lang.Override
    public boolean hasIntValue() {
      return valueCase_ == 6;
    }
    /**
     * <code>int64 int_value = 6;</code>
     * @return The intValue.
     */
    @java.lang.Override
    public long getIntValue() {
      if (valueCase_ == 6) {
        return (java.lang.Long) value_;
      }
      return 0L;
    }

    public static final int UINT_VALUE_FIELD_NUMBER = 7;
    /**
     * <code>uint64 uint_value = 7;</code>
     * @return Whether the uintValue field is set.
     */
    @java.lang.Override
    public boolean hasUintValue() {
      return valueCase_ == 7;
    }
    /**
     * <code>uint64 uint_value = 7;</code>
     * @return The uintValue.
     */
    @java.lang.Override
    public long getUintValue() {
      if (valueCase_ == 7) {
        return (java.lang.Long) value_;
      }
      return 0L;
    }

    public static final int SINT_VALUE_FIELD_NUMBER = 8;
    /**
     * <code>sint64 sint_value = 8;</code>
     * @return Whether the sintValue field is set.
     */
    @java.lang.Override
    public boolean hasSintValue() {
      return valueCase_ == 8;
    }
    /**
     * <code>sint64 sint_value = 8;</code>
     * @return The sintValue.
     */
    @java.lang.Override
    public long getSintValue() {
      if (valueCase_ == 8) {
        return (java.lang.Long) value_;
      }
      return 0L;
    }

    public static final int BOOL_VALUE_FIELD_NUMBER = 9;
    /**
     * <code>bool bool_value = 9;</code>
     * @return Whether the boolValue field is set.
     */
    @java.lang.Override
    public boolean hasBoolValue() {
      return valueCase_ == 9;
    }
    /**
     * <code>bool bool_value = 9;</code>
     * @return The boolValue.
     */
    @java.lang.Override
    public boolean getBoolValue() {
      if (valueCase_ == 9) {
        return (java.lang.Boolean) value_;
      }
      return false;
    }

    public static final int STR_VALUE_FIELD_NUMBER = 10;
    /**
     * <code>string str_value = 10;</code>
     * @return Whether the strValue field is set.
     */
    public boolean hasStrValue() {
      return valueCase_ == 10;
    }
    /**
     * <code>string str_value = 10;</code>
     * @return The strValue.
     */
    public java.lang.String getStrValue() {
      java.lang.Object ref = "";
      if (valueCase_ == 10) {
        ref = value_;
      }
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valueCase_ == 10) {
          value_ = s;
        }
        return s;
      }
    }
    /**
     * <code>string str_value = 10;</code>
     * @return The bytes for strValue.
     */
    public com.google.protobuf.ByteString
        getStrValueBytes() {
      java.lang.Object ref = "";
      if (valueCase_ == 10) {
        ref = value_;
      }
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (valueCase_ == 10) {
          value_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BYTES_VALUE_FIELD_NUMBER = 11;
    /**
     * <code>bytes bytes_value = 11;</code>
     * @return Whether the bytesValue field is set.
     */
    @java.lang.Override
    public boolean hasBytesValue() {
      return valueCase_ == 11;
    }
    /**
     * <code>bytes bytes_value = 11;</code>
     * @return The bytesValue.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBytesValue() {
      if (valueCase_ == 11) {
        return (com.google.protobuf.ByteString) value_;
      }
      return com.google.protobuf.ByteString.EMPTY;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
      }
      if (valueCase_ == 5) {
        output.writeDouble(
            5, (double)((java.lang.Double) value_));
      }
      if (valueCase_ == 6) {
        output.writeInt64(
            6, (long)((java.lang.Long) value_));
      }
      if (valueCase_ == 7) {
        output.writeUInt64(
            7, (long)((java.lang.Long) value_));
      }
      if (valueCase_ == 8) {
        output.writeSInt64(
            8, (long)((java.lang.Long) value_));
      }
      if (valueCase_ == 9) {
        output.writeBool(
            9, (boolean)((java.lang.Boolean) value_));
      }
      if (valueCase_ == 10) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 10, value_);
      }
      if (valueCase_ == 11) {
        output.writeBytes(
            11, (com.google.protobuf.ByteString) value_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
      }
      if (valueCase_ == 5) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(
              5, (double)((java.lang.Double) value_));
      }
      if (valueCase_ == 6) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(
              6, (long)((java.lang.Long) value_));
      }
      if (valueCase_ == 7) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(
              7, (long)((java.lang.Long) value_));
      }
      if (valueCase_ == 8) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt64Size(
              8, (long)((java.lang.Long) value_));
      }
      if (valueCase_ == 9) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(
              9, (boolean)((java.lang.Boolean) value_));
      }
      if (valueCase_ == 10) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, value_);
      }
      if (valueCase_ == 11) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(
              11, (com.google.protobuf.ByteString) value_);
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue other = (org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue) obj;

      if (!getKey()
          .equals(other.getKey())) return false;
      if (!getValueCase().equals(other.getValueCase())) return false;
      switch (valueCase_) {
        case 5:
          if (java.lang.Double.doubleToLongBits(getDoubleValue())
              != java.lang.Double.doubleToLongBits(
                  other.getDoubleValue())) return false;
          break;
        case 6:
          if (getIntValue()
              != other.getIntValue()) return false;
          break;
        case 7:
          if (getUintValue()
              != other.getUintValue()) return false;
          break;
        case 8:
          if (getSintValue()
              != other.getSintValue()) return false;
          break;
        case 9:
          if (getBoolValue()
              != other.getBoolValue()) return false;
          break;
        case 10:
          if (!getStrValue()
              .equals(other.getStrValue())) return false;
          break;
        case 11:
          if (!getBytesValue()
              .equals(other.getBytesValue())) return false;
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
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
      switch (valueCase_) {
        case 5:
          hash = (37 * hash) + DOUBLE_VALUE_FIELD_NUMBER;
          hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
              java.lang.Double.doubleToLongBits(getDoubleValue()));
          break;
        case 6:
          hash = (37 * hash) + INT_VALUE_FIELD_NUMBER;
          hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
              getIntValue());
          break;
        case 7:
          hash = (37 * hash) + UINT_VALUE_FIELD_NUMBER;
          hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
              getUintValue());
          break;
        case 8:
          hash = (37 * hash) + SINT_VALUE_FIELD_NUMBER;
          hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
              getSintValue());
          break;
        case 9:
          hash = (37 * hash) + BOOL_VALUE_FIELD_NUMBER;
          hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
              getBoolValue());
          break;
        case 10:
          hash = (37 * hash) + STR_VALUE_FIELD_NUMBER;
          hash = (53 * hash) + getStrValue().hashCode();
          break;
        case 11:
          hash = (37 * hash) + BYTES_VALUE_FIELD_NUMBER;
          hash = (53 * hash) + getBytesValue().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue prototype) {
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
     * Simple Key-value, where value could be one of scalar types
     * </pre>
     *
     * Protobuf type {@code telemetry.KeyValue}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.KeyValue)
        org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_KeyValue_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_KeyValue_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.class, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.newBuilder()
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
        key_ = "";
        valueCase_ = 0;
        value_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_KeyValue_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue result = new org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        buildPartialOneofs(result);
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.key_ = key_;
        }
      }

      private void buildPartialOneofs(org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue result) {
        result.valueCase_ = valueCase_;
        result.value_ = this.value_;
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
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.getDefaultInstance()) return this;
        if (!other.getKey().isEmpty()) {
          key_ = other.key_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        switch (other.getValueCase()) {
          case DOUBLE_VALUE: {
            setDoubleValue(other.getDoubleValue());
            break;
          }
          case INT_VALUE: {
            setIntValue(other.getIntValue());
            break;
          }
          case UINT_VALUE: {
            setUintValue(other.getUintValue());
            break;
          }
          case SINT_VALUE: {
            setSintValue(other.getSintValue());
            break;
          }
          case BOOL_VALUE: {
            setBoolValue(other.getBoolValue());
            break;
          }
          case STR_VALUE: {
            valueCase_ = 10;
            value_ = other.value_;
            onChanged();
            break;
          }
          case BYTES_VALUE: {
            setBytesValue(other.getBytesValue());
            break;
          }
          case VALUE_NOT_SET: {
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
                key_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 41: {
                value_ = input.readDouble();
                valueCase_ = 5;
                break;
              } // case 41
              case 48: {
                value_ = input.readInt64();
                valueCase_ = 6;
                break;
              } // case 48
              case 56: {
                value_ = input.readUInt64();
                valueCase_ = 7;
                break;
              } // case 56
              case 64: {
                value_ = input.readSInt64();
                valueCase_ = 8;
                break;
              } // case 64
              case 72: {
                value_ = input.readBool();
                valueCase_ = 9;
                break;
              } // case 72
              case 82: {
                java.lang.String s = input.readStringRequireUtf8();
                valueCase_ = 10;
                value_ = s;
                break;
              } // case 82
              case 90: {
                value_ = input.readBytes();
                valueCase_ = 11;
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
      private int valueCase_ = 0;
      private java.lang.Object value_;
      public ValueCase
          getValueCase() {
        return ValueCase.forNumber(
            valueCase_);
      }

      public Builder clearValue() {
        valueCase_ = 0;
        value_ = null;
        onChanged();
        return this;
      }

      private int bitField0_;

      private java.lang.Object key_ = "";
      /**
       * <pre>
       * Key
       * </pre>
       *
       * <code>string key = 1;</code>
       * @return The key.
       */
      public java.lang.String getKey() {
        java.lang.Object ref = key_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          key_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Key
       * </pre>
       *
       * <code>string key = 1;</code>
       * @return The bytes for key.
       */
      public com.google.protobuf.ByteString
          getKeyBytes() {
        java.lang.Object ref = key_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          key_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Key
       * </pre>
       *
       * <code>string key = 1;</code>
       * @param value The key to set.
       * @return This builder for chaining.
       */
      public Builder setKey(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        key_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Key
       * </pre>
       *
       * <code>string key = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearKey() {
        key_ = getDefaultInstance().getKey();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Key
       * </pre>
       *
       * <code>string key = 1;</code>
       * @param value The bytes for key to set.
       * @return This builder for chaining.
       */
      public Builder setKeyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        key_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      /**
       * <code>double double_value = 5;</code>
       * @return Whether the doubleValue field is set.
       */
      public boolean hasDoubleValue() {
        return valueCase_ == 5;
      }
      /**
       * <code>double double_value = 5;</code>
       * @return The doubleValue.
       */
      public double getDoubleValue() {
        if (valueCase_ == 5) {
          return (java.lang.Double) value_;
        }
        return 0D;
      }
      /**
       * <code>double double_value = 5;</code>
       * @param value The doubleValue to set.
       * @return This builder for chaining.
       */
      public Builder setDoubleValue(double value) {

        valueCase_ = 5;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double double_value = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearDoubleValue() {
        if (valueCase_ == 5) {
          valueCase_ = 0;
          value_ = null;
          onChanged();
        }
        return this;
      }

      /**
       * <code>int64 int_value = 6;</code>
       * @return Whether the intValue field is set.
       */
      public boolean hasIntValue() {
        return valueCase_ == 6;
      }
      /**
       * <code>int64 int_value = 6;</code>
       * @return The intValue.
       */
      public long getIntValue() {
        if (valueCase_ == 6) {
          return (java.lang.Long) value_;
        }
        return 0L;
      }
      /**
       * <code>int64 int_value = 6;</code>
       * @param value The intValue to set.
       * @return This builder for chaining.
       */
      public Builder setIntValue(long value) {

        valueCase_ = 6;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 int_value = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIntValue() {
        if (valueCase_ == 6) {
          valueCase_ = 0;
          value_ = null;
          onChanged();
        }
        return this;
      }

      /**
       * <code>uint64 uint_value = 7;</code>
       * @return Whether the uintValue field is set.
       */
      public boolean hasUintValue() {
        return valueCase_ == 7;
      }
      /**
       * <code>uint64 uint_value = 7;</code>
       * @return The uintValue.
       */
      public long getUintValue() {
        if (valueCase_ == 7) {
          return (java.lang.Long) value_;
        }
        return 0L;
      }
      /**
       * <code>uint64 uint_value = 7;</code>
       * @param value The uintValue to set.
       * @return This builder for chaining.
       */
      public Builder setUintValue(long value) {

        valueCase_ = 7;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 uint_value = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUintValue() {
        if (valueCase_ == 7) {
          valueCase_ = 0;
          value_ = null;
          onChanged();
        }
        return this;
      }

      /**
       * <code>sint64 sint_value = 8;</code>
       * @return Whether the sintValue field is set.
       */
      public boolean hasSintValue() {
        return valueCase_ == 8;
      }
      /**
       * <code>sint64 sint_value = 8;</code>
       * @return The sintValue.
       */
      public long getSintValue() {
        if (valueCase_ == 8) {
          return (java.lang.Long) value_;
        }
        return 0L;
      }
      /**
       * <code>sint64 sint_value = 8;</code>
       * @param value The sintValue to set.
       * @return This builder for chaining.
       */
      public Builder setSintValue(long value) {

        valueCase_ = 8;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>sint64 sint_value = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearSintValue() {
        if (valueCase_ == 8) {
          valueCase_ = 0;
          value_ = null;
          onChanged();
        }
        return this;
      }

      /**
       * <code>bool bool_value = 9;</code>
       * @return Whether the boolValue field is set.
       */
      public boolean hasBoolValue() {
        return valueCase_ == 9;
      }
      /**
       * <code>bool bool_value = 9;</code>
       * @return The boolValue.
       */
      public boolean getBoolValue() {
        if (valueCase_ == 9) {
          return (java.lang.Boolean) value_;
        }
        return false;
      }
      /**
       * <code>bool bool_value = 9;</code>
       * @param value The boolValue to set.
       * @return This builder for chaining.
       */
      public Builder setBoolValue(boolean value) {

        valueCase_ = 9;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool bool_value = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearBoolValue() {
        if (valueCase_ == 9) {
          valueCase_ = 0;
          value_ = null;
          onChanged();
        }
        return this;
      }

      /**
       * <code>string str_value = 10;</code>
       * @return Whether the strValue field is set.
       */
      @java.lang.Override
      public boolean hasStrValue() {
        return valueCase_ == 10;
      }
      /**
       * <code>string str_value = 10;</code>
       * @return The strValue.
       */
      @java.lang.Override
      public java.lang.String getStrValue() {
        java.lang.Object ref = "";
        if (valueCase_ == 10) {
          ref = value_;
        }
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (valueCase_ == 10) {
            value_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string str_value = 10;</code>
       * @return The bytes for strValue.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getStrValueBytes() {
        java.lang.Object ref = "";
        if (valueCase_ == 10) {
          ref = value_;
        }
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          if (valueCase_ == 10) {
            value_ = b;
          }
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string str_value = 10;</code>
       * @param value The strValue to set.
       * @return This builder for chaining.
       */
      public Builder setStrValue(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        valueCase_ = 10;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string str_value = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearStrValue() {
        if (valueCase_ == 10) {
          valueCase_ = 0;
          value_ = null;
          onChanged();
        }
        return this;
      }
      /**
       * <code>string str_value = 10;</code>
       * @param value The bytes for strValue to set.
       * @return This builder for chaining.
       */
      public Builder setStrValueBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        valueCase_ = 10;
        value_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>bytes bytes_value = 11;</code>
       * @return Whether the bytesValue field is set.
       */
      public boolean hasBytesValue() {
        return valueCase_ == 11;
      }
      /**
       * <code>bytes bytes_value = 11;</code>
       * @return The bytesValue.
       */
      public com.google.protobuf.ByteString getBytesValue() {
        if (valueCase_ == 11) {
          return (com.google.protobuf.ByteString) value_;
        }
        return com.google.protobuf.ByteString.EMPTY;
      }
      /**
       * <code>bytes bytes_value = 11;</code>
       * @param value The bytesValue to set.
       * @return This builder for chaining.
       */
      public Builder setBytesValue(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        valueCase_ = 11;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes bytes_value = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearBytesValue() {
        if (valueCase_ == 11) {
          valueCase_ = 0;
          value_ = null;
          onChanged();
        }
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


      // @@protoc_insertion_point(builder_scope:telemetry.KeyValue)
    }

    // @@protoc_insertion_point(class_scope:telemetry.KeyValue)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KeyValue>
        PARSER = new com.google.protobuf.AbstractParser<KeyValue>() {
      @java.lang.Override
      public KeyValue parsePartialFrom(
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

    public static com.google.protobuf.Parser<KeyValue> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KeyValue> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface DeleteOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.Delete)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string path = 1;</code>
     * @return The path.
     */
    java.lang.String getPath();
    /**
     * <code>string path = 1;</code>
     * @return The bytes for path.
     */
    com.google.protobuf.ByteString
        getPathBytes();
  }
  /**
   * <pre>
   * Message indicating delete for a particular path
   * </pre>
   *
   * Protobuf type {@code telemetry.Delete}
   */
  public static final class Delete extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.Delete)
      DeleteOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Delete.newBuilder() to construct.
    private Delete(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Delete() {
      path_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Delete();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Delete_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Delete_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.Delete.class, org.opennms.features.openconfig.proto.jti.Telemetry.Delete.Builder.class);
    }

    public static final int PATH_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object path_ = "";
    /**
     * <code>string path = 1;</code>
     * @return The path.
     */
    @java.lang.Override
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      }
    }
    /**
     * <code>string path = 1;</code>
     * @return The bytes for path.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.Delete)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.Delete other = (org.opennms.features.openconfig.proto.jti.Telemetry.Delete) obj;

      if (!getPath()
          .equals(other.getPath())) return false;
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
      hash = (37 * hash) + PATH_FIELD_NUMBER;
      hash = (53 * hash) + getPath().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.Delete parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Delete parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Delete parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Delete parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Delete parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Delete parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Delete parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Delete parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.Delete parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.Delete parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Delete parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Delete parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.Delete prototype) {
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
     * Message indicating delete for a particular path
     * </pre>
     *
     * Protobuf type {@code telemetry.Delete}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.Delete)
        org.opennms.features.openconfig.proto.jti.Telemetry.DeleteOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Delete_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Delete_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.Delete.class, org.opennms.features.openconfig.proto.jti.Telemetry.Delete.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.Delete.newBuilder()
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
        path_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Delete_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.Delete getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.Delete.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.Delete build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.Delete result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.Delete buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.Delete result = new org.opennms.features.openconfig.proto.jti.Telemetry.Delete(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.jti.Telemetry.Delete result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.path_ = path_;
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
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.Delete) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.Delete)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.Delete other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.Delete.getDefaultInstance()) return this;
        if (!other.getPath().isEmpty()) {
          path_ = other.path_;
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
                path_ = input.readStringRequireUtf8();
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

      private java.lang.Object path_ = "";
      /**
       * <code>string path = 1;</code>
       * @return The path.
       */
      public java.lang.String getPath() {
        java.lang.Object ref = path_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          path_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string path = 1;</code>
       * @return The bytes for path.
       */
      public com.google.protobuf.ByteString
          getPathBytes() {
        java.lang.Object ref = path_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          path_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string path = 1;</code>
       * @param value The path to set.
       * @return This builder for chaining.
       */
      public Builder setPath(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        path_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string path = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPath() {
        path_ = getDefaultInstance().getPath();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string path = 1;</code>
       * @param value The bytes for path to set.
       * @return This builder for chaining.
       */
      public Builder setPathBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        path_ = value;
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


      // @@protoc_insertion_point(builder_scope:telemetry.Delete)
    }

    // @@protoc_insertion_point(class_scope:telemetry.Delete)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.Delete DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.Delete();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.Delete getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Delete>
        PARSER = new com.google.protobuf.AbstractParser<Delete>() {
      @java.lang.Override
      public Delete parsePartialFrom(
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

    public static com.google.protobuf.Parser<Delete> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Delete> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.Delete getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface EomOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.Eom)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string path = 1;</code>
     * @return The path.
     */
    java.lang.String getPath();
    /**
     * <code>string path = 1;</code>
     * @return The bytes for path.
     */
    com.google.protobuf.ByteString
        getPathBytes();
  }
  /**
   * <pre>
   * Message indicating EOM for a particular path
   * </pre>
   *
   * Protobuf type {@code telemetry.Eom}
   */
  public static final class Eom extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.Eom)
      EomOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Eom.newBuilder() to construct.
    private Eom(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Eom() {
      path_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Eom();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Eom_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Eom_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.Eom.class, org.opennms.features.openconfig.proto.jti.Telemetry.Eom.Builder.class);
    }

    public static final int PATH_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object path_ = "";
    /**
     * <code>string path = 1;</code>
     * @return The path.
     */
    @java.lang.Override
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      }
    }
    /**
     * <code>string path = 1;</code>
     * @return The bytes for path.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.Eom)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.Eom other = (org.opennms.features.openconfig.proto.jti.Telemetry.Eom) obj;

      if (!getPath()
          .equals(other.getPath())) return false;
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
      hash = (37 * hash) + PATH_FIELD_NUMBER;
      hash = (53 * hash) + getPath().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.Eom parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Eom parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Eom parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Eom parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Eom parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Eom parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Eom parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Eom parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.Eom parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.Eom parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Eom parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.Eom parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.Eom prototype) {
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
     * Message indicating EOM for a particular path
     * </pre>
     *
     * Protobuf type {@code telemetry.Eom}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.Eom)
        org.opennms.features.openconfig.proto.jti.Telemetry.EomOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Eom_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Eom_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.Eom.class, org.opennms.features.openconfig.proto.jti.Telemetry.Eom.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.Eom.newBuilder()
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
        path_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_Eom_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.Eom getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.Eom.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.Eom build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.Eom result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.Eom buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.Eom result = new org.opennms.features.openconfig.proto.jti.Telemetry.Eom(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.jti.Telemetry.Eom result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.path_ = path_;
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
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.Eom) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.Eom)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.Eom other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.Eom.getDefaultInstance()) return this;
        if (!other.getPath().isEmpty()) {
          path_ = other.path_;
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
                path_ = input.readStringRequireUtf8();
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

      private java.lang.Object path_ = "";
      /**
       * <code>string path = 1;</code>
       * @return The path.
       */
      public java.lang.String getPath() {
        java.lang.Object ref = path_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          path_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string path = 1;</code>
       * @return The bytes for path.
       */
      public com.google.protobuf.ByteString
          getPathBytes() {
        java.lang.Object ref = path_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          path_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string path = 1;</code>
       * @param value The path to set.
       * @return This builder for chaining.
       */
      public Builder setPath(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        path_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string path = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPath() {
        path_ = getDefaultInstance().getPath();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string path = 1;</code>
       * @param value The bytes for path to set.
       * @return This builder for chaining.
       */
      public Builder setPathBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        path_ = value;
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


      // @@protoc_insertion_point(builder_scope:telemetry.Eom)
    }

    // @@protoc_insertion_point(class_scope:telemetry.Eom)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.Eom DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.Eom();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.Eom getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Eom>
        PARSER = new com.google.protobuf.AbstractParser<Eom>() {
      @java.lang.Override
      public Eom parsePartialFrom(
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

    public static com.google.protobuf.Parser<Eom> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Eom> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.Eom getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CancelSubscriptionRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.CancelSubscriptionRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Subscription identifier as returned by the device when
     * subscription was requested
     * </pre>
     *
     * <code>uint32 subscription_id = 1;</code>
     * @return The subscriptionId.
     */
    int getSubscriptionId();
  }
  /**
   * <pre>
   * Message sent for a telemetry subscription cancellation request
   * </pre>
   *
   * Protobuf type {@code telemetry.CancelSubscriptionRequest}
   */
  public static final class CancelSubscriptionRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.CancelSubscriptionRequest)
      CancelSubscriptionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CancelSubscriptionRequest.newBuilder() to construct.
    private CancelSubscriptionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CancelSubscriptionRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CancelSubscriptionRequest();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_CancelSubscriptionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_CancelSubscriptionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest.class, org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest.Builder.class);
    }

    public static final int SUBSCRIPTION_ID_FIELD_NUMBER = 1;
    private int subscriptionId_ = 0;
    /**
     * <pre>
     * Subscription identifier as returned by the device when
     * subscription was requested
     * </pre>
     *
     * <code>uint32 subscription_id = 1;</code>
     * @return The subscriptionId.
     */
    @java.lang.Override
    public int getSubscriptionId() {
      return subscriptionId_;
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
      if (subscriptionId_ != 0) {
        output.writeUInt32(1, subscriptionId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (subscriptionId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, subscriptionId_);
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest other = (org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest) obj;

      if (getSubscriptionId()
          != other.getSubscriptionId()) return false;
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
      hash = (37 * hash) + SUBSCRIPTION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSubscriptionId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest prototype) {
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
     * Message sent for a telemetry subscription cancellation request
     * </pre>
     *
     * Protobuf type {@code telemetry.CancelSubscriptionRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.CancelSubscriptionRequest)
        org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_CancelSubscriptionRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_CancelSubscriptionRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest.class, org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest.newBuilder()
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
        subscriptionId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_CancelSubscriptionRequest_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest result = new org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.subscriptionId_ = subscriptionId_;
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
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest.getDefaultInstance()) return this;
        if (other.getSubscriptionId() != 0) {
          setSubscriptionId(other.getSubscriptionId());
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
                subscriptionId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

      private int subscriptionId_ ;
      /**
       * <pre>
       * Subscription identifier as returned by the device when
       * subscription was requested
       * </pre>
       *
       * <code>uint32 subscription_id = 1;</code>
       * @return The subscriptionId.
       */
      @java.lang.Override
      public int getSubscriptionId() {
        return subscriptionId_;
      }
      /**
       * <pre>
       * Subscription identifier as returned by the device when
       * subscription was requested
       * </pre>
       *
       * <code>uint32 subscription_id = 1;</code>
       * @param value The subscriptionId to set.
       * @return This builder for chaining.
       */
      public Builder setSubscriptionId(int value) {

        subscriptionId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Subscription identifier as returned by the device when
       * subscription was requested
       * </pre>
       *
       * <code>uint32 subscription_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSubscriptionId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        subscriptionId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:telemetry.CancelSubscriptionRequest)
    }

    // @@protoc_insertion_point(class_scope:telemetry.CancelSubscriptionRequest)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CancelSubscriptionRequest>
        PARSER = new com.google.protobuf.AbstractParser<CancelSubscriptionRequest>() {
      @java.lang.Override
      public CancelSubscriptionRequest parsePartialFrom(
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

    public static com.google.protobuf.Parser<CancelSubscriptionRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CancelSubscriptionRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CancelSubscriptionReplyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.CancelSubscriptionReply)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Return code
     * </pre>
     *
     * <code>.telemetry.ReturnCode code = 1;</code>
     * @return The enum numeric value on the wire for code.
     */
    int getCodeValue();
    /**
     * <pre>
     * Return code
     * </pre>
     *
     * <code>.telemetry.ReturnCode code = 1;</code>
     * @return The code.
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.ReturnCode getCode();

    /**
     * <pre>
     * Return code string
     * </pre>
     *
     * <code>string code_str = 2;</code>
     * @return The codeStr.
     */
    java.lang.String getCodeStr();
    /**
     * <pre>
     * Return code string
     * </pre>
     *
     * <code>string code_str = 2;</code>
     * @return The bytes for codeStr.
     */
    com.google.protobuf.ByteString
        getCodeStrBytes();
  }
  /**
   * <pre>
   * Reply to telemetry subscription cancellation request
   * </pre>
   *
   * Protobuf type {@code telemetry.CancelSubscriptionReply}
   */
  public static final class CancelSubscriptionReply extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.CancelSubscriptionReply)
      CancelSubscriptionReplyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CancelSubscriptionReply.newBuilder() to construct.
    private CancelSubscriptionReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CancelSubscriptionReply() {
      code_ = 0;
      codeStr_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CancelSubscriptionReply();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_CancelSubscriptionReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_CancelSubscriptionReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply.class, org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply.Builder.class);
    }

    public static final int CODE_FIELD_NUMBER = 1;
    private int code_ = 0;
    /**
     * <pre>
     * Return code
     * </pre>
     *
     * <code>.telemetry.ReturnCode code = 1;</code>
     * @return The enum numeric value on the wire for code.
     */
    @java.lang.Override public int getCodeValue() {
      return code_;
    }
    /**
     * <pre>
     * Return code
     * </pre>
     *
     * <code>.telemetry.ReturnCode code = 1;</code>
     * @return The code.
     */
    @java.lang.Override public org.opennms.features.openconfig.proto.jti.Telemetry.ReturnCode getCode() {
      org.opennms.features.openconfig.proto.jti.Telemetry.ReturnCode result = org.opennms.features.openconfig.proto.jti.Telemetry.ReturnCode.forNumber(code_);
      return result == null ? org.opennms.features.openconfig.proto.jti.Telemetry.ReturnCode.UNRECOGNIZED : result;
    }

    public static final int CODE_STR_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object codeStr_ = "";
    /**
     * <pre>
     * Return code string
     * </pre>
     *
     * <code>string code_str = 2;</code>
     * @return The codeStr.
     */
    @java.lang.Override
    public java.lang.String getCodeStr() {
      java.lang.Object ref = codeStr_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        codeStr_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Return code string
     * </pre>
     *
     * <code>string code_str = 2;</code>
     * @return The bytes for codeStr.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCodeStrBytes() {
      java.lang.Object ref = codeStr_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        codeStr_ = b;
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
      if (code_ != org.opennms.features.openconfig.proto.jti.Telemetry.ReturnCode.SUCCESS.getNumber()) {
        output.writeEnum(1, code_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(codeStr_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, codeStr_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (code_ != org.opennms.features.openconfig.proto.jti.Telemetry.ReturnCode.SUCCESS.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, code_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(codeStr_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, codeStr_);
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply other = (org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply) obj;

      if (code_ != other.code_) return false;
      if (!getCodeStr()
          .equals(other.getCodeStr())) return false;
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
      hash = (37 * hash) + CODE_FIELD_NUMBER;
      hash = (53 * hash) + code_;
      hash = (37 * hash) + CODE_STR_FIELD_NUMBER;
      hash = (53 * hash) + getCodeStr().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply prototype) {
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
     * Reply to telemetry subscription cancellation request
     * </pre>
     *
     * Protobuf type {@code telemetry.CancelSubscriptionReply}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.CancelSubscriptionReply)
        org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReplyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_CancelSubscriptionReply_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_CancelSubscriptionReply_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply.class, org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply.newBuilder()
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
        code_ = 0;
        codeStr_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_CancelSubscriptionReply_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply result = new org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.code_ = code_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.codeStr_ = codeStr_;
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
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply.getDefaultInstance()) return this;
        if (other.code_ != 0) {
          setCodeValue(other.getCodeValue());
        }
        if (!other.getCodeStr().isEmpty()) {
          codeStr_ = other.codeStr_;
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
              case 8: {
                code_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                codeStr_ = input.readStringRequireUtf8();
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

      private int code_ = 0;
      /**
       * <pre>
       * Return code
       * </pre>
       *
       * <code>.telemetry.ReturnCode code = 1;</code>
       * @return The enum numeric value on the wire for code.
       */
      @java.lang.Override public int getCodeValue() {
        return code_;
      }
      /**
       * <pre>
       * Return code
       * </pre>
       *
       * <code>.telemetry.ReturnCode code = 1;</code>
       * @param value The enum numeric value on the wire for code to set.
       * @return This builder for chaining.
       */
      public Builder setCodeValue(int value) {
        code_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Return code
       * </pre>
       *
       * <code>.telemetry.ReturnCode code = 1;</code>
       * @return The code.
       */
      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.ReturnCode getCode() {
        org.opennms.features.openconfig.proto.jti.Telemetry.ReturnCode result = org.opennms.features.openconfig.proto.jti.Telemetry.ReturnCode.forNumber(code_);
        return result == null ? org.opennms.features.openconfig.proto.jti.Telemetry.ReturnCode.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * Return code
       * </pre>
       *
       * <code>.telemetry.ReturnCode code = 1;</code>
       * @param value The code to set.
       * @return This builder for chaining.
       */
      public Builder setCode(org.opennms.features.openconfig.proto.jti.Telemetry.ReturnCode value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        code_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Return code
       * </pre>
       *
       * <code>.telemetry.ReturnCode code = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        code_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object codeStr_ = "";
      /**
       * <pre>
       * Return code string
       * </pre>
       *
       * <code>string code_str = 2;</code>
       * @return The codeStr.
       */
      public java.lang.String getCodeStr() {
        java.lang.Object ref = codeStr_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          codeStr_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Return code string
       * </pre>
       *
       * <code>string code_str = 2;</code>
       * @return The bytes for codeStr.
       */
      public com.google.protobuf.ByteString
          getCodeStrBytes() {
        java.lang.Object ref = codeStr_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          codeStr_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Return code string
       * </pre>
       *
       * <code>string code_str = 2;</code>
       * @param value The codeStr to set.
       * @return This builder for chaining.
       */
      public Builder setCodeStr(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        codeStr_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Return code string
       * </pre>
       *
       * <code>string code_str = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCodeStr() {
        codeStr_ = getDefaultInstance().getCodeStr();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Return code string
       * </pre>
       *
       * <code>string code_str = 2;</code>
       * @param value The bytes for codeStr to set.
       * @return This builder for chaining.
       */
      public Builder setCodeStrBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        codeStr_ = value;
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


      // @@protoc_insertion_point(builder_scope:telemetry.CancelSubscriptionReply)
    }

    // @@protoc_insertion_point(class_scope:telemetry.CancelSubscriptionReply)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CancelSubscriptionReply>
        PARSER = new com.google.protobuf.AbstractParser<CancelSubscriptionReply>() {
      @java.lang.Override
      public CancelSubscriptionReply parsePartialFrom(
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

    public static com.google.protobuf.Parser<CancelSubscriptionReply> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CancelSubscriptionReply> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.CancelSubscriptionReply getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetSubscriptionsRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.GetSubscriptionsRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Subscription identifier as returned by the device when
     * subscription was requested
     * --- or ---
     * 0xFFFFFFFF for all subscription identifiers
     * </pre>
     *
     * <code>uint32 subscription_id = 1;</code>
     * @return The subscriptionId.
     */
    int getSubscriptionId();
  }
  /**
   * <pre>
   * Message sent for a telemetry get request
   * </pre>
   *
   * Protobuf type {@code telemetry.GetSubscriptionsRequest}
   */
  public static final class GetSubscriptionsRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.GetSubscriptionsRequest)
      GetSubscriptionsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetSubscriptionsRequest.newBuilder() to construct.
    private GetSubscriptionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetSubscriptionsRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetSubscriptionsRequest();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetSubscriptionsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetSubscriptionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest.class, org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest.Builder.class);
    }

    public static final int SUBSCRIPTION_ID_FIELD_NUMBER = 1;
    private int subscriptionId_ = 0;
    /**
     * <pre>
     * Subscription identifier as returned by the device when
     * subscription was requested
     * --- or ---
     * 0xFFFFFFFF for all subscription identifiers
     * </pre>
     *
     * <code>uint32 subscription_id = 1;</code>
     * @return The subscriptionId.
     */
    @java.lang.Override
    public int getSubscriptionId() {
      return subscriptionId_;
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
      if (subscriptionId_ != 0) {
        output.writeUInt32(1, subscriptionId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (subscriptionId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, subscriptionId_);
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest other = (org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest) obj;

      if (getSubscriptionId()
          != other.getSubscriptionId()) return false;
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
      hash = (37 * hash) + SUBSCRIPTION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSubscriptionId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest prototype) {
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
     * Message sent for a telemetry get request
     * </pre>
     *
     * Protobuf type {@code telemetry.GetSubscriptionsRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.GetSubscriptionsRequest)
        org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetSubscriptionsRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetSubscriptionsRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest.class, org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest.newBuilder()
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
        subscriptionId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetSubscriptionsRequest_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest result = new org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.subscriptionId_ = subscriptionId_;
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
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest.getDefaultInstance()) return this;
        if (other.getSubscriptionId() != 0) {
          setSubscriptionId(other.getSubscriptionId());
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
                subscriptionId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

      private int subscriptionId_ ;
      /**
       * <pre>
       * Subscription identifier as returned by the device when
       * subscription was requested
       * --- or ---
       * 0xFFFFFFFF for all subscription identifiers
       * </pre>
       *
       * <code>uint32 subscription_id = 1;</code>
       * @return The subscriptionId.
       */
      @java.lang.Override
      public int getSubscriptionId() {
        return subscriptionId_;
      }
      /**
       * <pre>
       * Subscription identifier as returned by the device when
       * subscription was requested
       * --- or ---
       * 0xFFFFFFFF for all subscription identifiers
       * </pre>
       *
       * <code>uint32 subscription_id = 1;</code>
       * @param value The subscriptionId to set.
       * @return This builder for chaining.
       */
      public Builder setSubscriptionId(int value) {

        subscriptionId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Subscription identifier as returned by the device when
       * subscription was requested
       * --- or ---
       * 0xFFFFFFFF for all subscription identifiers
       * </pre>
       *
       * <code>uint32 subscription_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSubscriptionId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        subscriptionId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:telemetry.GetSubscriptionsRequest)
    }

    // @@protoc_insertion_point(class_scope:telemetry.GetSubscriptionsRequest)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetSubscriptionsRequest>
        PARSER = new com.google.protobuf.AbstractParser<GetSubscriptionsRequest>() {
      @java.lang.Override
      public GetSubscriptionsRequest parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetSubscriptionsRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetSubscriptionsRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetSubscriptionsReplyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.GetSubscriptionsReply)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * List of current telemetry subscriptions
     * </pre>
     *
     * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
     */
    java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply> 
        getSubscriptionListList();
    /**
     * <pre>
     * List of current telemetry subscriptions
     * </pre>
     *
     * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply getSubscriptionList(int index);
    /**
     * <pre>
     * List of current telemetry subscriptions
     * </pre>
     *
     * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
     */
    int getSubscriptionListCount();
    /**
     * <pre>
     * List of current telemetry subscriptions
     * </pre>
     *
     * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
     */
    java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReplyOrBuilder> 
        getSubscriptionListOrBuilderList();
    /**
     * <pre>
     * List of current telemetry subscriptions
     * </pre>
     *
     * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReplyOrBuilder getSubscriptionListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Reply to telemetry subscription get request
   * </pre>
   *
   * Protobuf type {@code telemetry.GetSubscriptionsReply}
   */
  public static final class GetSubscriptionsReply extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.GetSubscriptionsReply)
      GetSubscriptionsReplyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetSubscriptionsReply.newBuilder() to construct.
    private GetSubscriptionsReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetSubscriptionsReply() {
      subscriptionList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetSubscriptionsReply();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetSubscriptionsReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetSubscriptionsReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply.class, org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply.Builder.class);
    }

    public static final int SUBSCRIPTION_LIST_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply> subscriptionList_;
    /**
     * <pre>
     * List of current telemetry subscriptions
     * </pre>
     *
     * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply> getSubscriptionListList() {
      return subscriptionList_;
    }
    /**
     * <pre>
     * List of current telemetry subscriptions
     * </pre>
     *
     * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReplyOrBuilder> 
        getSubscriptionListOrBuilderList() {
      return subscriptionList_;
    }
    /**
     * <pre>
     * List of current telemetry subscriptions
     * </pre>
     *
     * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
     */
    @java.lang.Override
    public int getSubscriptionListCount() {
      return subscriptionList_.size();
    }
    /**
     * <pre>
     * List of current telemetry subscriptions
     * </pre>
     *
     * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply getSubscriptionList(int index) {
      return subscriptionList_.get(index);
    }
    /**
     * <pre>
     * List of current telemetry subscriptions
     * </pre>
     *
     * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReplyOrBuilder getSubscriptionListOrBuilder(
        int index) {
      return subscriptionList_.get(index);
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
      for (int i = 0; i < subscriptionList_.size(); i++) {
        output.writeMessage(1, subscriptionList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < subscriptionList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, subscriptionList_.get(i));
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply other = (org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply) obj;

      if (!getSubscriptionListList()
          .equals(other.getSubscriptionListList())) return false;
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
      if (getSubscriptionListCount() > 0) {
        hash = (37 * hash) + SUBSCRIPTION_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSubscriptionListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply prototype) {
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
     * Reply to telemetry subscription get request
     * </pre>
     *
     * Protobuf type {@code telemetry.GetSubscriptionsReply}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.GetSubscriptionsReply)
        org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReplyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetSubscriptionsReply_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetSubscriptionsReply_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply.class, org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply.newBuilder()
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
        if (subscriptionListBuilder_ == null) {
          subscriptionList_ = java.util.Collections.emptyList();
        } else {
          subscriptionList_ = null;
          subscriptionListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetSubscriptionsReply_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply result = new org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply result) {
        if (subscriptionListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            subscriptionList_ = java.util.Collections.unmodifiableList(subscriptionList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.subscriptionList_ = subscriptionList_;
        } else {
          result.subscriptionList_ = subscriptionListBuilder_.build();
        }
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply result) {
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
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply.getDefaultInstance()) return this;
        if (subscriptionListBuilder_ == null) {
          if (!other.subscriptionList_.isEmpty()) {
            if (subscriptionList_.isEmpty()) {
              subscriptionList_ = other.subscriptionList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSubscriptionListIsMutable();
              subscriptionList_.addAll(other.subscriptionList_);
            }
            onChanged();
          }
        } else {
          if (!other.subscriptionList_.isEmpty()) {
            if (subscriptionListBuilder_.isEmpty()) {
              subscriptionListBuilder_.dispose();
              subscriptionListBuilder_ = null;
              subscriptionList_ = other.subscriptionList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              subscriptionListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSubscriptionListFieldBuilder() : null;
            } else {
              subscriptionListBuilder_.addAllMessages(other.subscriptionList_);
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
                org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply m =
                    input.readMessage(
                        org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.parser(),
                        extensionRegistry);
                if (subscriptionListBuilder_ == null) {
                  ensureSubscriptionListIsMutable();
                  subscriptionList_.add(m);
                } else {
                  subscriptionListBuilder_.addMessage(m);
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

      private java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply> subscriptionList_ =
        java.util.Collections.emptyList();
      private void ensureSubscriptionListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          subscriptionList_ = new java.util.ArrayList<org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply>(subscriptionList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReplyOrBuilder> subscriptionListBuilder_;

      /**
       * <pre>
       * List of current telemetry subscriptions
       * </pre>
       *
       * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
       */
      public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply> getSubscriptionListList() {
        if (subscriptionListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(subscriptionList_);
        } else {
          return subscriptionListBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * List of current telemetry subscriptions
       * </pre>
       *
       * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
       */
      public int getSubscriptionListCount() {
        if (subscriptionListBuilder_ == null) {
          return subscriptionList_.size();
        } else {
          return subscriptionListBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * List of current telemetry subscriptions
       * </pre>
       *
       * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply getSubscriptionList(int index) {
        if (subscriptionListBuilder_ == null) {
          return subscriptionList_.get(index);
        } else {
          return subscriptionListBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * List of current telemetry subscriptions
       * </pre>
       *
       * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
       */
      public Builder setSubscriptionList(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply value) {
        if (subscriptionListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSubscriptionListIsMutable();
          subscriptionList_.set(index, value);
          onChanged();
        } else {
          subscriptionListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * List of current telemetry subscriptions
       * </pre>
       *
       * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
       */
      public Builder setSubscriptionList(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.Builder builderForValue) {
        if (subscriptionListBuilder_ == null) {
          ensureSubscriptionListIsMutable();
          subscriptionList_.set(index, builderForValue.build());
          onChanged();
        } else {
          subscriptionListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of current telemetry subscriptions
       * </pre>
       *
       * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
       */
      public Builder addSubscriptionList(org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply value) {
        if (subscriptionListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSubscriptionListIsMutable();
          subscriptionList_.add(value);
          onChanged();
        } else {
          subscriptionListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * List of current telemetry subscriptions
       * </pre>
       *
       * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
       */
      public Builder addSubscriptionList(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply value) {
        if (subscriptionListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSubscriptionListIsMutable();
          subscriptionList_.add(index, value);
          onChanged();
        } else {
          subscriptionListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * List of current telemetry subscriptions
       * </pre>
       *
       * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
       */
      public Builder addSubscriptionList(
          org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.Builder builderForValue) {
        if (subscriptionListBuilder_ == null) {
          ensureSubscriptionListIsMutable();
          subscriptionList_.add(builderForValue.build());
          onChanged();
        } else {
          subscriptionListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of current telemetry subscriptions
       * </pre>
       *
       * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
       */
      public Builder addSubscriptionList(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.Builder builderForValue) {
        if (subscriptionListBuilder_ == null) {
          ensureSubscriptionListIsMutable();
          subscriptionList_.add(index, builderForValue.build());
          onChanged();
        } else {
          subscriptionListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of current telemetry subscriptions
       * </pre>
       *
       * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
       */
      public Builder addAllSubscriptionList(
          java.lang.Iterable<? extends org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply> values) {
        if (subscriptionListBuilder_ == null) {
          ensureSubscriptionListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, subscriptionList_);
          onChanged();
        } else {
          subscriptionListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * List of current telemetry subscriptions
       * </pre>
       *
       * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
       */
      public Builder clearSubscriptionList() {
        if (subscriptionListBuilder_ == null) {
          subscriptionList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          subscriptionListBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * List of current telemetry subscriptions
       * </pre>
       *
       * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
       */
      public Builder removeSubscriptionList(int index) {
        if (subscriptionListBuilder_ == null) {
          ensureSubscriptionListIsMutable();
          subscriptionList_.remove(index);
          onChanged();
        } else {
          subscriptionListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * List of current telemetry subscriptions
       * </pre>
       *
       * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.Builder getSubscriptionListBuilder(
          int index) {
        return getSubscriptionListFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * List of current telemetry subscriptions
       * </pre>
       *
       * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReplyOrBuilder getSubscriptionListOrBuilder(
          int index) {
        if (subscriptionListBuilder_ == null) {
          return subscriptionList_.get(index);  } else {
          return subscriptionListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * List of current telemetry subscriptions
       * </pre>
       *
       * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
       */
      public java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReplyOrBuilder> 
           getSubscriptionListOrBuilderList() {
        if (subscriptionListBuilder_ != null) {
          return subscriptionListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(subscriptionList_);
        }
      }
      /**
       * <pre>
       * List of current telemetry subscriptions
       * </pre>
       *
       * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.Builder addSubscriptionListBuilder() {
        return getSubscriptionListFieldBuilder().addBuilder(
            org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.getDefaultInstance());
      }
      /**
       * <pre>
       * List of current telemetry subscriptions
       * </pre>
       *
       * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.Builder addSubscriptionListBuilder(
          int index) {
        return getSubscriptionListFieldBuilder().addBuilder(
            index, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.getDefaultInstance());
      }
      /**
       * <pre>
       * List of current telemetry subscriptions
       * </pre>
       *
       * <code>repeated .telemetry.SubscriptionReply subscription_list = 1;</code>
       */
      public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.Builder> 
           getSubscriptionListBuilderList() {
        return getSubscriptionListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReplyOrBuilder> 
          getSubscriptionListFieldBuilder() {
        if (subscriptionListBuilder_ == null) {
          subscriptionListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReply.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.SubscriptionReplyOrBuilder>(
                  subscriptionList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          subscriptionList_ = null;
        }
        return subscriptionListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:telemetry.GetSubscriptionsReply)
    }

    // @@protoc_insertion_point(class_scope:telemetry.GetSubscriptionsReply)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetSubscriptionsReply>
        PARSER = new com.google.protobuf.AbstractParser<GetSubscriptionsReply>() {
      @java.lang.Override
      public GetSubscriptionsReply parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetSubscriptionsReply> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetSubscriptionsReply> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.GetSubscriptionsReply getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetOperationalStateRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.GetOperationalStateRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Per-subscription_id level operational state can be requested.
     *
     * Subscription identifier as returned by the device when
     * subscription was requested
     * --- or ---
     * 0xFFFFFFFF for all subscription identifiers including agent-level
     * operational stats
     * --- or ---
     * If subscription_id is not present then sent only agent-level
     * operational stats
     * </pre>
     *
     * <code>uint32 subscription_id = 1;</code>
     * @return The subscriptionId.
     */
    int getSubscriptionId();

    /**
     * <pre>
     * Control verbosity of the output
     * </pre>
     *
     * <code>.telemetry.VerbosityLevel verbosity = 2;</code>
     * @return The enum numeric value on the wire for verbosity.
     */
    int getVerbosityValue();
    /**
     * <pre>
     * Control verbosity of the output
     * </pre>
     *
     * <code>.telemetry.VerbosityLevel verbosity = 2;</code>
     * @return The verbosity.
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.VerbosityLevel getVerbosity();
  }
  /**
   * <pre>
   * Message sent for telemetry agent operational states request
   * </pre>
   *
   * Protobuf type {@code telemetry.GetOperationalStateRequest}
   */
  public static final class GetOperationalStateRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.GetOperationalStateRequest)
      GetOperationalStateRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetOperationalStateRequest.newBuilder() to construct.
    private GetOperationalStateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetOperationalStateRequest() {
      verbosity_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetOperationalStateRequest();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetOperationalStateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetOperationalStateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest.class, org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest.Builder.class);
    }

    public static final int SUBSCRIPTION_ID_FIELD_NUMBER = 1;
    private int subscriptionId_ = 0;
    /**
     * <pre>
     * Per-subscription_id level operational state can be requested.
     *
     * Subscription identifier as returned by the device when
     * subscription was requested
     * --- or ---
     * 0xFFFFFFFF for all subscription identifiers including agent-level
     * operational stats
     * --- or ---
     * If subscription_id is not present then sent only agent-level
     * operational stats
     * </pre>
     *
     * <code>uint32 subscription_id = 1;</code>
     * @return The subscriptionId.
     */
    @java.lang.Override
    public int getSubscriptionId() {
      return subscriptionId_;
    }

    public static final int VERBOSITY_FIELD_NUMBER = 2;
    private int verbosity_ = 0;
    /**
     * <pre>
     * Control verbosity of the output
     * </pre>
     *
     * <code>.telemetry.VerbosityLevel verbosity = 2;</code>
     * @return The enum numeric value on the wire for verbosity.
     */
    @java.lang.Override public int getVerbosityValue() {
      return verbosity_;
    }
    /**
     * <pre>
     * Control verbosity of the output
     * </pre>
     *
     * <code>.telemetry.VerbosityLevel verbosity = 2;</code>
     * @return The verbosity.
     */
    @java.lang.Override public org.opennms.features.openconfig.proto.jti.Telemetry.VerbosityLevel getVerbosity() {
      org.opennms.features.openconfig.proto.jti.Telemetry.VerbosityLevel result = org.opennms.features.openconfig.proto.jti.Telemetry.VerbosityLevel.forNumber(verbosity_);
      return result == null ? org.opennms.features.openconfig.proto.jti.Telemetry.VerbosityLevel.UNRECOGNIZED : result;
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
      if (subscriptionId_ != 0) {
        output.writeUInt32(1, subscriptionId_);
      }
      if (verbosity_ != org.opennms.features.openconfig.proto.jti.Telemetry.VerbosityLevel.DETAIL.getNumber()) {
        output.writeEnum(2, verbosity_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (subscriptionId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, subscriptionId_);
      }
      if (verbosity_ != org.opennms.features.openconfig.proto.jti.Telemetry.VerbosityLevel.DETAIL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, verbosity_);
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest other = (org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest) obj;

      if (getSubscriptionId()
          != other.getSubscriptionId()) return false;
      if (verbosity_ != other.verbosity_) return false;
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
      hash = (37 * hash) + SUBSCRIPTION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSubscriptionId();
      hash = (37 * hash) + VERBOSITY_FIELD_NUMBER;
      hash = (53 * hash) + verbosity_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest prototype) {
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
     * Message sent for telemetry agent operational states request
     * </pre>
     *
     * Protobuf type {@code telemetry.GetOperationalStateRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.GetOperationalStateRequest)
        org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetOperationalStateRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetOperationalStateRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest.class, org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest.newBuilder()
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
        subscriptionId_ = 0;
        verbosity_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetOperationalStateRequest_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest result = new org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.subscriptionId_ = subscriptionId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.verbosity_ = verbosity_;
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
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest.getDefaultInstance()) return this;
        if (other.getSubscriptionId() != 0) {
          setSubscriptionId(other.getSubscriptionId());
        }
        if (other.verbosity_ != 0) {
          setVerbosityValue(other.getVerbosityValue());
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
                subscriptionId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                verbosity_ = input.readEnum();
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

      private int subscriptionId_ ;
      /**
       * <pre>
       * Per-subscription_id level operational state can be requested.
       *
       * Subscription identifier as returned by the device when
       * subscription was requested
       * --- or ---
       * 0xFFFFFFFF for all subscription identifiers including agent-level
       * operational stats
       * --- or ---
       * If subscription_id is not present then sent only agent-level
       * operational stats
       * </pre>
       *
       * <code>uint32 subscription_id = 1;</code>
       * @return The subscriptionId.
       */
      @java.lang.Override
      public int getSubscriptionId() {
        return subscriptionId_;
      }
      /**
       * <pre>
       * Per-subscription_id level operational state can be requested.
       *
       * Subscription identifier as returned by the device when
       * subscription was requested
       * --- or ---
       * 0xFFFFFFFF for all subscription identifiers including agent-level
       * operational stats
       * --- or ---
       * If subscription_id is not present then sent only agent-level
       * operational stats
       * </pre>
       *
       * <code>uint32 subscription_id = 1;</code>
       * @param value The subscriptionId to set.
       * @return This builder for chaining.
       */
      public Builder setSubscriptionId(int value) {

        subscriptionId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Per-subscription_id level operational state can be requested.
       *
       * Subscription identifier as returned by the device when
       * subscription was requested
       * --- or ---
       * 0xFFFFFFFF for all subscription identifiers including agent-level
       * operational stats
       * --- or ---
       * If subscription_id is not present then sent only agent-level
       * operational stats
       * </pre>
       *
       * <code>uint32 subscription_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSubscriptionId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        subscriptionId_ = 0;
        onChanged();
        return this;
      }

      private int verbosity_ = 0;
      /**
       * <pre>
       * Control verbosity of the output
       * </pre>
       *
       * <code>.telemetry.VerbosityLevel verbosity = 2;</code>
       * @return The enum numeric value on the wire for verbosity.
       */
      @java.lang.Override public int getVerbosityValue() {
        return verbosity_;
      }
      /**
       * <pre>
       * Control verbosity of the output
       * </pre>
       *
       * <code>.telemetry.VerbosityLevel verbosity = 2;</code>
       * @param value The enum numeric value on the wire for verbosity to set.
       * @return This builder for chaining.
       */
      public Builder setVerbosityValue(int value) {
        verbosity_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Control verbosity of the output
       * </pre>
       *
       * <code>.telemetry.VerbosityLevel verbosity = 2;</code>
       * @return The verbosity.
       */
      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.VerbosityLevel getVerbosity() {
        org.opennms.features.openconfig.proto.jti.Telemetry.VerbosityLevel result = org.opennms.features.openconfig.proto.jti.Telemetry.VerbosityLevel.forNumber(verbosity_);
        return result == null ? org.opennms.features.openconfig.proto.jti.Telemetry.VerbosityLevel.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * Control verbosity of the output
       * </pre>
       *
       * <code>.telemetry.VerbosityLevel verbosity = 2;</code>
       * @param value The verbosity to set.
       * @return This builder for chaining.
       */
      public Builder setVerbosity(org.opennms.features.openconfig.proto.jti.Telemetry.VerbosityLevel value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        verbosity_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Control verbosity of the output
       * </pre>
       *
       * <code>.telemetry.VerbosityLevel verbosity = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearVerbosity() {
        bitField0_ = (bitField0_ & ~0x00000002);
        verbosity_ = 0;
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


      // @@protoc_insertion_point(builder_scope:telemetry.GetOperationalStateRequest)
    }

    // @@protoc_insertion_point(class_scope:telemetry.GetOperationalStateRequest)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetOperationalStateRequest>
        PARSER = new com.google.protobuf.AbstractParser<GetOperationalStateRequest>() {
      @java.lang.Override
      public GetOperationalStateRequest parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetOperationalStateRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetOperationalStateRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetOperationalStateReplyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.GetOperationalStateReply)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * List of key-value pairs where
     *     key      = operational state definition
     *     value    = operational state value
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 1;</code>
     */
    java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue> 
        getKvList();
    /**
     * <pre>
     * List of key-value pairs where
     *     key      = operational state definition
     *     value    = operational state value
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 1;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue getKv(int index);
    /**
     * <pre>
     * List of key-value pairs where
     *     key      = operational state definition
     *     value    = operational state value
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 1;</code>
     */
    int getKvCount();
    /**
     * <pre>
     * List of key-value pairs where
     *     key      = operational state definition
     *     value    = operational state value
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 1;</code>
     */
    java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder> 
        getKvOrBuilderList();
    /**
     * <pre>
     * List of key-value pairs where
     *     key      = operational state definition
     *     value    = operational state value
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 1;</code>
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder getKvOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Reply to telemetry agent operational states request
   * </pre>
   *
   * Protobuf type {@code telemetry.GetOperationalStateReply}
   */
  public static final class GetOperationalStateReply extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.GetOperationalStateReply)
      GetOperationalStateReplyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetOperationalStateReply.newBuilder() to construct.
    private GetOperationalStateReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetOperationalStateReply() {
      kv_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetOperationalStateReply();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetOperationalStateReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetOperationalStateReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply.class, org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply.Builder.class);
    }

    public static final int KV_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue> kv_;
    /**
     * <pre>
     * List of key-value pairs where
     *     key      = operational state definition
     *     value    = operational state value
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 1;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue> getKvList() {
      return kv_;
    }
    /**
     * <pre>
     * List of key-value pairs where
     *     key      = operational state definition
     *     value    = operational state value
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder> 
        getKvOrBuilderList() {
      return kv_;
    }
    /**
     * <pre>
     * List of key-value pairs where
     *     key      = operational state definition
     *     value    = operational state value
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 1;</code>
     */
    @java.lang.Override
    public int getKvCount() {
      return kv_.size();
    }
    /**
     * <pre>
     * List of key-value pairs where
     *     key      = operational state definition
     *     value    = operational state value
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 1;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue getKv(int index) {
      return kv_.get(index);
    }
    /**
     * <pre>
     * List of key-value pairs where
     *     key      = operational state definition
     *     value    = operational state value
     * </pre>
     *
     * <code>repeated .telemetry.KeyValue kv = 1;</code>
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder getKvOrBuilder(
        int index) {
      return kv_.get(index);
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
      for (int i = 0; i < kv_.size(); i++) {
        output.writeMessage(1, kv_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < kv_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, kv_.get(i));
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply other = (org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply) obj;

      if (!getKvList()
          .equals(other.getKvList())) return false;
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
      if (getKvCount() > 0) {
        hash = (37 * hash) + KV_FIELD_NUMBER;
        hash = (53 * hash) + getKvList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply prototype) {
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
     * Reply to telemetry agent operational states request
     * </pre>
     *
     * Protobuf type {@code telemetry.GetOperationalStateReply}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.GetOperationalStateReply)
        org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReplyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetOperationalStateReply_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetOperationalStateReply_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply.class, org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply.newBuilder()
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
        if (kvBuilder_ == null) {
          kv_ = java.util.Collections.emptyList();
        } else {
          kv_ = null;
          kvBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_GetOperationalStateReply_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply result = new org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply result) {
        if (kvBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            kv_ = java.util.Collections.unmodifiableList(kv_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.kv_ = kv_;
        } else {
          result.kv_ = kvBuilder_.build();
        }
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply result) {
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
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply.getDefaultInstance()) return this;
        if (kvBuilder_ == null) {
          if (!other.kv_.isEmpty()) {
            if (kv_.isEmpty()) {
              kv_ = other.kv_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureKvIsMutable();
              kv_.addAll(other.kv_);
            }
            onChanged();
          }
        } else {
          if (!other.kv_.isEmpty()) {
            if (kvBuilder_.isEmpty()) {
              kvBuilder_.dispose();
              kvBuilder_ = null;
              kv_ = other.kv_;
              bitField0_ = (bitField0_ & ~0x00000001);
              kvBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getKvFieldBuilder() : null;
            } else {
              kvBuilder_.addAllMessages(other.kv_);
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
                org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue m =
                    input.readMessage(
                        org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.parser(),
                        extensionRegistry);
                if (kvBuilder_ == null) {
                  ensureKvIsMutable();
                  kv_.add(m);
                } else {
                  kvBuilder_.addMessage(m);
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

      private java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue> kv_ =
        java.util.Collections.emptyList();
      private void ensureKvIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          kv_ = new java.util.ArrayList<org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue>(kv_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder> kvBuilder_;

      /**
       * <pre>
       * List of key-value pairs where
       *     key      = operational state definition
       *     value    = operational state value
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 1;</code>
       */
      public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue> getKvList() {
        if (kvBuilder_ == null) {
          return java.util.Collections.unmodifiableList(kv_);
        } else {
          return kvBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * List of key-value pairs where
       *     key      = operational state definition
       *     value    = operational state value
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 1;</code>
       */
      public int getKvCount() {
        if (kvBuilder_ == null) {
          return kv_.size();
        } else {
          return kvBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * List of key-value pairs where
       *     key      = operational state definition
       *     value    = operational state value
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue getKv(int index) {
        if (kvBuilder_ == null) {
          return kv_.get(index);
        } else {
          return kvBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * List of key-value pairs where
       *     key      = operational state definition
       *     value    = operational state value
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 1;</code>
       */
      public Builder setKv(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue value) {
        if (kvBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureKvIsMutable();
          kv_.set(index, value);
          onChanged();
        } else {
          kvBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * List of key-value pairs where
       *     key      = operational state definition
       *     value    = operational state value
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 1;</code>
       */
      public Builder setKv(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder builderForValue) {
        if (kvBuilder_ == null) {
          ensureKvIsMutable();
          kv_.set(index, builderForValue.build());
          onChanged();
        } else {
          kvBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of key-value pairs where
       *     key      = operational state definition
       *     value    = operational state value
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 1;</code>
       */
      public Builder addKv(org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue value) {
        if (kvBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureKvIsMutable();
          kv_.add(value);
          onChanged();
        } else {
          kvBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * List of key-value pairs where
       *     key      = operational state definition
       *     value    = operational state value
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 1;</code>
       */
      public Builder addKv(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue value) {
        if (kvBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureKvIsMutable();
          kv_.add(index, value);
          onChanged();
        } else {
          kvBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * List of key-value pairs where
       *     key      = operational state definition
       *     value    = operational state value
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 1;</code>
       */
      public Builder addKv(
          org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder builderForValue) {
        if (kvBuilder_ == null) {
          ensureKvIsMutable();
          kv_.add(builderForValue.build());
          onChanged();
        } else {
          kvBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of key-value pairs where
       *     key      = operational state definition
       *     value    = operational state value
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 1;</code>
       */
      public Builder addKv(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder builderForValue) {
        if (kvBuilder_ == null) {
          ensureKvIsMutable();
          kv_.add(index, builderForValue.build());
          onChanged();
        } else {
          kvBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * List of key-value pairs where
       *     key      = operational state definition
       *     value    = operational state value
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 1;</code>
       */
      public Builder addAllKv(
          java.lang.Iterable<? extends org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue> values) {
        if (kvBuilder_ == null) {
          ensureKvIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, kv_);
          onChanged();
        } else {
          kvBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * List of key-value pairs where
       *     key      = operational state definition
       *     value    = operational state value
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 1;</code>
       */
      public Builder clearKv() {
        if (kvBuilder_ == null) {
          kv_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          kvBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * List of key-value pairs where
       *     key      = operational state definition
       *     value    = operational state value
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 1;</code>
       */
      public Builder removeKv(int index) {
        if (kvBuilder_ == null) {
          ensureKvIsMutable();
          kv_.remove(index);
          onChanged();
        } else {
          kvBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * List of key-value pairs where
       *     key      = operational state definition
       *     value    = operational state value
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder getKvBuilder(
          int index) {
        return getKvFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * List of key-value pairs where
       *     key      = operational state definition
       *     value    = operational state value
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder getKvOrBuilder(
          int index) {
        if (kvBuilder_ == null) {
          return kv_.get(index);  } else {
          return kvBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * List of key-value pairs where
       *     key      = operational state definition
       *     value    = operational state value
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 1;</code>
       */
      public java.util.List<? extends org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder> 
           getKvOrBuilderList() {
        if (kvBuilder_ != null) {
          return kvBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(kv_);
        }
      }
      /**
       * <pre>
       * List of key-value pairs where
       *     key      = operational state definition
       *     value    = operational state value
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder addKvBuilder() {
        return getKvFieldBuilder().addBuilder(
            org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.getDefaultInstance());
      }
      /**
       * <pre>
       * List of key-value pairs where
       *     key      = operational state definition
       *     value    = operational state value
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 1;</code>
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder addKvBuilder(
          int index) {
        return getKvFieldBuilder().addBuilder(
            index, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.getDefaultInstance());
      }
      /**
       * <pre>
       * List of key-value pairs where
       *     key      = operational state definition
       *     value    = operational state value
       * </pre>
       *
       * <code>repeated .telemetry.KeyValue kv = 1;</code>
       */
      public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder> 
           getKvBuilderList() {
        return getKvFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder> 
          getKvFieldBuilder() {
        if (kvBuilder_ == null) {
          kvBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValue.Builder, org.opennms.features.openconfig.proto.jti.Telemetry.KeyValueOrBuilder>(
                  kv_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          kv_ = null;
        }
        return kvBuilder_;
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


      // @@protoc_insertion_point(builder_scope:telemetry.GetOperationalStateReply)
    }

    // @@protoc_insertion_point(class_scope:telemetry.GetOperationalStateReply)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetOperationalStateReply>
        PARSER = new com.google.protobuf.AbstractParser<GetOperationalStateReply>() {
      @java.lang.Override
      public GetOperationalStateReply parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetOperationalStateReply> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetOperationalStateReply> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.GetOperationalStateReply getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface DataEncodingRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.DataEncodingRequest)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * Message sent for a data encoding request
   * </pre>
   *
   * Protobuf type {@code telemetry.DataEncodingRequest}
   */
  public static final class DataEncodingRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.DataEncodingRequest)
      DataEncodingRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DataEncodingRequest.newBuilder() to construct.
    private DataEncodingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DataEncodingRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DataEncodingRequest();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_DataEncodingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_DataEncodingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest.class, org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest.Builder.class);
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
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest other = (org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest) obj;

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
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest prototype) {
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
     * Message sent for a data encoding request
     * </pre>
     *
     * Protobuf type {@code telemetry.DataEncodingRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.DataEncodingRequest)
        org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_DataEncodingRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_DataEncodingRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest.class, org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest.newBuilder()
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
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_DataEncodingRequest_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest result = new org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest(this);
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
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest.getDefaultInstance()) return this;
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


      // @@protoc_insertion_point(builder_scope:telemetry.DataEncodingRequest)
    }

    // @@protoc_insertion_point(class_scope:telemetry.DataEncodingRequest)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DataEncodingRequest>
        PARSER = new com.google.protobuf.AbstractParser<DataEncodingRequest>() {
      @java.lang.Override
      public DataEncodingRequest parsePartialFrom(
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

    public static com.google.protobuf.Parser<DataEncodingRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DataEncodingRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface DataEncodingReplyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:telemetry.DataEncodingReply)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
     * @return A list containing the encodingList.
     */
    java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.EncodingType> getEncodingListList();
    /**
     * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
     * @return The count of encodingList.
     */
    int getEncodingListCount();
    /**
     * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
     * @param index The index of the element to return.
     * @return The encodingList at the given index.
     */
    org.opennms.features.openconfig.proto.jti.Telemetry.EncodingType getEncodingList(int index);
    /**
     * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
     * @return A list containing the enum numeric values on the wire for encodingList.
     */
    java.util.List<java.lang.Integer>
    getEncodingListValueList();
    /**
     * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of encodingList at the given index.
     */
    int getEncodingListValue(int index);
  }
  /**
   * <pre>
   * Reply to data encodings supported request
   * </pre>
   *
   * Protobuf type {@code telemetry.DataEncodingReply}
   */
  public static final class DataEncodingReply extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:telemetry.DataEncodingReply)
      DataEncodingReplyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DataEncodingReply.newBuilder() to construct.
    private DataEncodingReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DataEncodingReply() {
      encodingList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DataEncodingReply();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_DataEncodingReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_DataEncodingReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply.class, org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply.Builder.class);
    }

    public static final int ENCODING_LIST_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<java.lang.Integer> encodingList_;
    private static final com.google.protobuf.Internal.ListAdapter.Converter<
        java.lang.Integer, org.opennms.features.openconfig.proto.jti.Telemetry.EncodingType> encodingList_converter_ =
            new com.google.protobuf.Internal.ListAdapter.Converter<
                java.lang.Integer, org.opennms.features.openconfig.proto.jti.Telemetry.EncodingType>() {
              public org.opennms.features.openconfig.proto.jti.Telemetry.EncodingType convert(java.lang.Integer from) {
                org.opennms.features.openconfig.proto.jti.Telemetry.EncodingType result = org.opennms.features.openconfig.proto.jti.Telemetry.EncodingType.forNumber(from);
                return result == null ? org.opennms.features.openconfig.proto.jti.Telemetry.EncodingType.UNRECOGNIZED : result;
              }
            };
    /**
     * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
     * @return A list containing the encodingList.
     */
    @java.lang.Override
    public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.EncodingType> getEncodingListList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, org.opennms.features.openconfig.proto.jti.Telemetry.EncodingType>(encodingList_, encodingList_converter_);
    }
    /**
     * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
     * @return The count of encodingList.
     */
    @java.lang.Override
    public int getEncodingListCount() {
      return encodingList_.size();
    }
    /**
     * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
     * @param index The index of the element to return.
     * @return The encodingList at the given index.
     */
    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.EncodingType getEncodingList(int index) {
      return encodingList_converter_.convert(encodingList_.get(index));
    }
    /**
     * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
     * @return A list containing the enum numeric values on the wire for encodingList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
    getEncodingListValueList() {
      return encodingList_;
    }
    /**
     * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of encodingList at the given index.
     */
    @java.lang.Override
    public int getEncodingListValue(int index) {
      return encodingList_.get(index);
    }
    private int encodingListMemoizedSerializedSize;

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
      getSerializedSize();
      if (getEncodingListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(encodingListMemoizedSerializedSize);
      }
      for (int i = 0; i < encodingList_.size(); i++) {
        output.writeEnumNoTag(encodingList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < encodingList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeEnumSizeNoTag(encodingList_.get(i));
        }
        size += dataSize;
        if (!getEncodingListList().isEmpty()) {  size += 1;
          size += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(dataSize);
        }encodingListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply)) {
        return super.equals(obj);
      }
      org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply other = (org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply) obj;

      if (!encodingList_.equals(other.encodingList_)) return false;
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
      if (getEncodingListCount() > 0) {
        hash = (37 * hash) + ENCODING_LIST_FIELD_NUMBER;
        hash = (53 * hash) + encodingList_.hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply parseFrom(
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
    public static Builder newBuilder(org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply prototype) {
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
     * Reply to data encodings supported request
     * </pre>
     *
     * Protobuf type {@code telemetry.DataEncodingReply}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:telemetry.DataEncodingReply)
        org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReplyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_DataEncodingReply_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_DataEncodingReply_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply.class, org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply.Builder.class);
      }

      // Construct using org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply.newBuilder()
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
        encodingList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.internal_static_telemetry_DataEncodingReply_descriptor;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply getDefaultInstanceForType() {
        return org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply build() {
        org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply buildPartial() {
        org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply result = new org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          encodingList_ = java.util.Collections.unmodifiableList(encodingList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.encodingList_ = encodingList_;
      }

      private void buildPartial0(org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply result) {
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
        if (other instanceof org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply) {
          return mergeFrom((org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply other) {
        if (other == org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply.getDefaultInstance()) return this;
        if (!other.encodingList_.isEmpty()) {
          if (encodingList_.isEmpty()) {
            encodingList_ = other.encodingList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEncodingListIsMutable();
            encodingList_.addAll(other.encodingList_);
          }
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
                int tmpRaw = input.readEnum();
                ensureEncodingListIsMutable();
                encodingList_.add(tmpRaw);
                break;
              } // case 8
              case 10: {
                int length = input.readRawVarint32();
                int oldLimit = input.pushLimit(length);
                while(input.getBytesUntilLimit() > 0) {
                  int tmpRaw = input.readEnum();
                  ensureEncodingListIsMutable();
                  encodingList_.add(tmpRaw);
                }
                input.popLimit(oldLimit);
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

      private java.util.List<java.lang.Integer> encodingList_ =
        java.util.Collections.emptyList();
      private void ensureEncodingListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          encodingList_ = new java.util.ArrayList<java.lang.Integer>(encodingList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
       * @return A list containing the encodingList.
       */
      public java.util.List<org.opennms.features.openconfig.proto.jti.Telemetry.EncodingType> getEncodingListList() {
        return new com.google.protobuf.Internal.ListAdapter<
            java.lang.Integer, org.opennms.features.openconfig.proto.jti.Telemetry.EncodingType>(encodingList_, encodingList_converter_);
      }
      /**
       * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
       * @return The count of encodingList.
       */
      public int getEncodingListCount() {
        return encodingList_.size();
      }
      /**
       * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
       * @param index The index of the element to return.
       * @return The encodingList at the given index.
       */
      public org.opennms.features.openconfig.proto.jti.Telemetry.EncodingType getEncodingList(int index) {
        return encodingList_converter_.convert(encodingList_.get(index));
      }
      /**
       * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The encodingList to set.
       * @return This builder for chaining.
       */
      public Builder setEncodingList(
          int index, org.opennms.features.openconfig.proto.jti.Telemetry.EncodingType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEncodingListIsMutable();
        encodingList_.set(index, value.getNumber());
        onChanged();
        return this;
      }
      /**
       * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
       * @param value The encodingList to add.
       * @return This builder for chaining.
       */
      public Builder addEncodingList(org.opennms.features.openconfig.proto.jti.Telemetry.EncodingType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEncodingListIsMutable();
        encodingList_.add(value.getNumber());
        onChanged();
        return this;
      }
      /**
       * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
       * @param values The encodingList to add.
       * @return This builder for chaining.
       */
      public Builder addAllEncodingList(
          java.lang.Iterable<? extends org.opennms.features.openconfig.proto.jti.Telemetry.EncodingType> values) {
        ensureEncodingListIsMutable();
        for (org.opennms.features.openconfig.proto.jti.Telemetry.EncodingType value : values) {
          encodingList_.add(value.getNumber());
        }
        onChanged();
        return this;
      }
      /**
       * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEncodingList() {
        encodingList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
       * @return A list containing the enum numeric values on the wire for encodingList.
       */
      public java.util.List<java.lang.Integer>
      getEncodingListValueList() {
        return java.util.Collections.unmodifiableList(encodingList_);
      }
      /**
       * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
       * @param index The index of the value to return.
       * @return The enum numeric value on the wire of encodingList at the given index.
       */
      public int getEncodingListValue(int index) {
        return encodingList_.get(index);
      }
      /**
       * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The enum numeric value on the wire for encodingList to set.
       * @return This builder for chaining.
       */
      public Builder setEncodingListValue(
          int index, int value) {
        ensureEncodingListIsMutable();
        encodingList_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
       * @param value The enum numeric value on the wire for encodingList to add.
       * @return This builder for chaining.
       */
      public Builder addEncodingListValue(int value) {
        ensureEncodingListIsMutable();
        encodingList_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .telemetry.EncodingType encoding_list = 1;</code>
       * @param values The enum numeric values on the wire for encodingList to add.
       * @return This builder for chaining.
       */
      public Builder addAllEncodingListValue(
          java.lang.Iterable<java.lang.Integer> values) {
        ensureEncodingListIsMutable();
        for (int value : values) {
          encodingList_.add(value);
        }
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


      // @@protoc_insertion_point(builder_scope:telemetry.DataEncodingReply)
    }

    // @@protoc_insertion_point(class_scope:telemetry.DataEncodingReply)
    private static final org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply();
    }

    public static org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DataEncodingReply>
        PARSER = new com.google.protobuf.AbstractParser<DataEncodingReply>() {
      @java.lang.Override
      public DataEncodingReply parsePartialFrom(
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

    public static com.google.protobuf.Parser<DataEncodingReply> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DataEncodingReply> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.features.openconfig.proto.jti.Telemetry.DataEncodingReply getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_SubscriptionRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_SubscriptionRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_SubscriptionInput_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_SubscriptionInput_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_Collector_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_Collector_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_Path_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_Path_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_SubscriptionAdditionalConfig_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_SubscriptionAdditionalConfig_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_SubscriptionReply_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_SubscriptionReply_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_SubscriptionResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_SubscriptionResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_OpenConfigData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_OpenConfigData_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_KeyValue_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_KeyValue_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_Delete_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_Delete_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_Eom_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_Eom_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_CancelSubscriptionRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_CancelSubscriptionRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_CancelSubscriptionReply_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_CancelSubscriptionReply_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_GetSubscriptionsRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_GetSubscriptionsRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_GetSubscriptionsReply_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_GetSubscriptionsReply_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_GetOperationalStateRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_GetOperationalStateRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_GetOperationalStateReply_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_GetOperationalStateReply_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_DataEncodingRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_DataEncodingRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_telemetry_DataEncodingReply_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_telemetry_DataEncodingReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017telemetry.proto\022\ttelemetry\"\252\001\n\023Subscri" +
      "ptionRequest\022+\n\005input\030\001 \001(\0132\034.telemetry." +
      "SubscriptionInput\022\"\n\tpath_list\030\002 \003(\0132\017.t" +
      "elemetry.Path\022B\n\021additional_config\030\003 \001(\013" +
      "2\'.telemetry.SubscriptionAdditionalConfi" +
      "g\"A\n\021SubscriptionInput\022,\n\016collector_list" +
      "\030\001 \003(\0132\024.telemetry.Collector\"*\n\tCollecto" +
      "r\022\017\n\007address\030\001 \001(\t\022\014\n\004port\030\002 \001(\r\"\211\001\n\004Pat" +
      "h\022\014\n\004path\030\001 \001(\t\022\016\n\006filter\030\002 \001(\t\022\032\n\022suppr" +
      "ess_unchanged\030\003 \001(\010\022\033\n\023max_silent_interv" +
      "al\030\004 \001(\r\022\030\n\020sample_frequency\030\005 \001(\r\022\020\n\010ne" +
      "ed_eom\030\006 \001(\010\"c\n\034SubscriptionAdditionalCo" +
      "nfig\022\025\n\rlimit_records\030\001 \001(\005\022\032\n\022limit_tim" +
      "e_seconds\030\002 \001(\005\022\020\n\010need_eos\030\003 \001(\010\"j\n\021Sub" +
      "scriptionReply\0221\n\010response\030\001 \001(\0132\037.telem" +
      "etry.SubscriptionResponse\022\"\n\tpath_list\030\002" +
      " \003(\0132\017.telemetry.Path\"/\n\024SubscriptionRes" +
      "ponse\022\027\n\017subscription_id\030\001 \001(\r\"\205\002\n\016OpenC" +
      "onfigData\022\021\n\tsystem_id\030\001 \001(\t\022\024\n\014componen" +
      "t_id\030\002 \001(\r\022\030\n\020sub_component_id\030\003 \001(\r\022\014\n\004" +
      "path\030\004 \001(\t\022\027\n\017sequence_number\030\005 \001(\004\022\021\n\tt" +
      "imestamp\030\006 \001(\004\022\037\n\002kv\030\007 \003(\0132\023.telemetry.K" +
      "eyValue\022!\n\006delete\030\010 \003(\0132\021.telemetry.Dele" +
      "te\022\033\n\003eom\030\t \003(\0132\016.telemetry.Eom\022\025\n\rsync_" +
      "response\030\n \001(\010\"\273\001\n\010KeyValue\022\013\n\003key\030\001 \001(\t" +
      "\022\026\n\014double_value\030\005 \001(\001H\000\022\023\n\tint_value\030\006 " +
      "\001(\003H\000\022\024\n\nuint_value\030\007 \001(\004H\000\022\024\n\nsint_valu" +
      "e\030\010 \001(\022H\000\022\024\n\nbool_value\030\t \001(\010H\000\022\023\n\tstr_v" +
      "alue\030\n \001(\tH\000\022\025\n\013bytes_value\030\013 \001(\014H\000B\007\n\005v" +
      "alue\"\026\n\006Delete\022\014\n\004path\030\001 \001(\t\"\023\n\003Eom\022\014\n\004p" +
      "ath\030\001 \001(\t\"4\n\031CancelSubscriptionRequest\022\027" +
      "\n\017subscription_id\030\001 \001(\r\"P\n\027CancelSubscri" +
      "ptionReply\022#\n\004code\030\001 \001(\0162\025.telemetry.Ret" +
      "urnCode\022\020\n\010code_str\030\002 \001(\t\"2\n\027GetSubscrip" +
      "tionsRequest\022\027\n\017subscription_id\030\001 \001(\r\"P\n" +
      "\025GetSubscriptionsReply\0227\n\021subscription_l" +
      "ist\030\001 \003(\0132\034.telemetry.SubscriptionReply\"" +
      "c\n\032GetOperationalStateRequest\022\027\n\017subscri" +
      "ption_id\030\001 \001(\r\022,\n\tverbosity\030\002 \001(\0162\031.tele" +
      "metry.VerbosityLevel\";\n\030GetOperationalSt" +
      "ateReply\022\037\n\002kv\030\001 \003(\0132\023.telemetry.KeyValu" +
      "e\"\025\n\023DataEncodingRequest\"C\n\021DataEncoding" +
      "Reply\022.\n\rencoding_list\030\001 \003(\0162\027.telemetry" +
      ".EncodingType*G\n\nReturnCode\022\013\n\007SUCCESS\020\000" +
      "\022\031\n\025NO_SUBSCRIPTION_ENTRY\020\001\022\021\n\rUNKNOWN_E" +
      "RROR\020\002*2\n\016VerbosityLevel\022\n\n\006DETAIL\020\000\022\t\n\005" +
      "TERSE\020\001\022\t\n\005BRIEF\020\002*A\n\014EncodingType\022\r\n\tUN" +
      "DEFINED\020\000\022\007\n\003XML\020\001\022\r\n\tJSON_IETF\020\002\022\n\n\006PRO" +
      "TO3\020\0032\374\003\n\023OpenConfigTelemetry\022S\n\022telemet" +
      "rySubscribe\022\036.telemetry.SubscriptionRequ" +
      "est\032\031.telemetry.OpenConfigData\"\0000\001\022i\n\033ca" +
      "ncelTelemetrySubscription\022$.telemetry.Ca" +
      "ncelSubscriptionRequest\032\".telemetry.Canc" +
      "elSubscriptionReply\"\000\022c\n\031getTelemetrySub" +
      "scriptions\022\".telemetry.GetSubscriptionsR" +
      "equest\032 .telemetry.GetSubscriptionsReply" +
      "\"\000\022l\n\034getTelemetryOperationalState\022%.tel" +
      "emetry.GetOperationalStateRequest\032#.tele" +
      "metry.GetOperationalStateReply\"\000\022R\n\020getD" +
      "ataEncodings\022\036.telemetry.DataEncodingReq" +
      "uest\032\034.telemetry.DataEncodingReply\"\000B+\n)" +
      "org.opennms.features.openconfig.proto.jt" +
      "ib\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_telemetry_SubscriptionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_telemetry_SubscriptionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_SubscriptionRequest_descriptor,
        new java.lang.String[] { "Input", "PathList", "AdditionalConfig", });
    internal_static_telemetry_SubscriptionInput_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_telemetry_SubscriptionInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_SubscriptionInput_descriptor,
        new java.lang.String[] { "CollectorList", });
    internal_static_telemetry_Collector_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_telemetry_Collector_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_Collector_descriptor,
        new java.lang.String[] { "Address", "Port", });
    internal_static_telemetry_Path_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_telemetry_Path_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_Path_descriptor,
        new java.lang.String[] { "Path", "Filter", "SuppressUnchanged", "MaxSilentInterval", "SampleFrequency", "NeedEom", });
    internal_static_telemetry_SubscriptionAdditionalConfig_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_telemetry_SubscriptionAdditionalConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_SubscriptionAdditionalConfig_descriptor,
        new java.lang.String[] { "LimitRecords", "LimitTimeSeconds", "NeedEos", });
    internal_static_telemetry_SubscriptionReply_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_telemetry_SubscriptionReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_SubscriptionReply_descriptor,
        new java.lang.String[] { "Response", "PathList", });
    internal_static_telemetry_SubscriptionResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_telemetry_SubscriptionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_SubscriptionResponse_descriptor,
        new java.lang.String[] { "SubscriptionId", });
    internal_static_telemetry_OpenConfigData_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_telemetry_OpenConfigData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_OpenConfigData_descriptor,
        new java.lang.String[] { "SystemId", "ComponentId", "SubComponentId", "Path", "SequenceNumber", "Timestamp", "Kv", "Delete", "Eom", "SyncResponse", });
    internal_static_telemetry_KeyValue_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_telemetry_KeyValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_KeyValue_descriptor,
        new java.lang.String[] { "Key", "DoubleValue", "IntValue", "UintValue", "SintValue", "BoolValue", "StrValue", "BytesValue", "Value", });
    internal_static_telemetry_Delete_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_telemetry_Delete_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_Delete_descriptor,
        new java.lang.String[] { "Path", });
    internal_static_telemetry_Eom_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_telemetry_Eom_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_Eom_descriptor,
        new java.lang.String[] { "Path", });
    internal_static_telemetry_CancelSubscriptionRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_telemetry_CancelSubscriptionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_CancelSubscriptionRequest_descriptor,
        new java.lang.String[] { "SubscriptionId", });
    internal_static_telemetry_CancelSubscriptionReply_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_telemetry_CancelSubscriptionReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_CancelSubscriptionReply_descriptor,
        new java.lang.String[] { "Code", "CodeStr", });
    internal_static_telemetry_GetSubscriptionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_telemetry_GetSubscriptionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_GetSubscriptionsRequest_descriptor,
        new java.lang.String[] { "SubscriptionId", });
    internal_static_telemetry_GetSubscriptionsReply_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_telemetry_GetSubscriptionsReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_GetSubscriptionsReply_descriptor,
        new java.lang.String[] { "SubscriptionList", });
    internal_static_telemetry_GetOperationalStateRequest_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_telemetry_GetOperationalStateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_GetOperationalStateRequest_descriptor,
        new java.lang.String[] { "SubscriptionId", "Verbosity", });
    internal_static_telemetry_GetOperationalStateReply_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_telemetry_GetOperationalStateReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_GetOperationalStateReply_descriptor,
        new java.lang.String[] { "Kv", });
    internal_static_telemetry_DataEncodingRequest_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_telemetry_DataEncodingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_DataEncodingRequest_descriptor,
        new java.lang.String[] { });
    internal_static_telemetry_DataEncodingReply_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_telemetry_DataEncodingReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_telemetry_DataEncodingReply_descriptor,
        new java.lang.String[] { "EncodingList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
