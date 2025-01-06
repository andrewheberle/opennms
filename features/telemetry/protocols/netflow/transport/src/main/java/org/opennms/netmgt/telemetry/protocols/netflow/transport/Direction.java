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
package org.opennms.netmgt.telemetry.protocols.netflow.transport;

/**
 * Protobuf enum {@code Direction}
 */
public enum Direction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INGRESS = 0;</code>
   */
  INGRESS(0),
  /**
   * <code>EGRESS = 1;</code>
   */
  EGRESS(1),
  /**
   * <code>UNKNOWN = 255;</code>
   */
  UNKNOWN(255),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INGRESS = 0;</code>
   */
  public static final int INGRESS_VALUE = 0;
  /**
   * <code>EGRESS = 1;</code>
   */
  public static final int EGRESS_VALUE = 1;
  /**
   * <code>UNKNOWN = 255;</code>
   */
  public static final int UNKNOWN_VALUE = 255;


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
  public static Direction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Direction forNumber(int value) {
    switch (value) {
      case 0: return INGRESS;
      case 1: return EGRESS;
      case 255: return UNKNOWN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Direction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Direction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Direction>() {
          public Direction findValueByNumber(int number) {
            return Direction.forNumber(number);
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
    return FlowProtos.getDescriptor().getEnumTypes().get(0);
  }

  private static final Direction[] VALUES = values();

  public static Direction valueOf(
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

  private Direction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Direction)
}

