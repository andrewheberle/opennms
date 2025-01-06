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
package org.opennms.netmgt.flows.persistence.model;

public interface FlowDocumentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FlowDocument)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Flow timestamp in milliseconds.
   * </pre>
   *
   * <code>uint64 timestamp = 1;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <pre>
   * Number of bytes transferred in the flow
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value num_bytes = 2;</code>
   * @return Whether the numBytes field is set.
   */
  boolean hasNumBytes();
  /**
   * <pre>
   * Number of bytes transferred in the flow
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value num_bytes = 2;</code>
   * @return The numBytes.
   */
  com.google.protobuf.UInt64Value getNumBytes();
  /**
   * <pre>
   * Number of bytes transferred in the flow
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value num_bytes = 2;</code>
   */
  com.google.protobuf.UInt64ValueOrBuilder getNumBytesOrBuilder();

  /**
   * <pre>
   * Direction of the flow (egress vs ingress)
   * </pre>
   *
   * <code>.Direction direction = 3;</code>
   * @return The enum numeric value on the wire for direction.
   */
  int getDirectionValue();
  /**
   * <pre>
   * Direction of the flow (egress vs ingress)
   * </pre>
   *
   * <code>.Direction direction = 3;</code>
   * @return The direction.
   */
  org.opennms.netmgt.flows.persistence.model.Direction getDirection();

  /**
   * <pre>
   *  Destination address.
   * </pre>
   *
   * <code>string dst_address = 4;</code>
   * @return The dstAddress.
   */
  java.lang.String getDstAddress();
  /**
   * <pre>
   *  Destination address.
   * </pre>
   *
   * <code>string dst_address = 4;</code>
   * @return The bytes for dstAddress.
   */
  com.google.protobuf.ByteString
      getDstAddressBytes();

  /**
   * <pre>
   * Destination address hostname.
   * </pre>
   *
   * <code>string dst_hostname = 5;</code>
   * @return The dstHostname.
   */
  java.lang.String getDstHostname();
  /**
   * <pre>
   * Destination address hostname.
   * </pre>
   *
   * <code>string dst_hostname = 5;</code>
   * @return The bytes for dstHostname.
   */
  com.google.protobuf.ByteString
      getDstHostnameBytes();

  /**
   * <pre>
   * Destination autonomous system (AS).
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value dst_as = 6;</code>
   * @return Whether the dstAs field is set.
   */
  boolean hasDstAs();
  /**
   * <pre>
   * Destination autonomous system (AS).
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value dst_as = 6;</code>
   * @return The dstAs.
   */
  com.google.protobuf.UInt64Value getDstAs();
  /**
   * <pre>
   * Destination autonomous system (AS).
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value dst_as = 6;</code>
   */
  com.google.protobuf.UInt64ValueOrBuilder getDstAsOrBuilder();

  /**
   * <pre>
   * The number of contiguous bits in the source address subnet mask.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value dst_mask_len = 7;</code>
   * @return Whether the dstMaskLen field is set.
   */
  boolean hasDstMaskLen();
  /**
   * <pre>
   * The number of contiguous bits in the source address subnet mask.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value dst_mask_len = 7;</code>
   * @return The dstMaskLen.
   */
  com.google.protobuf.UInt32Value getDstMaskLen();
  /**
   * <pre>
   * The number of contiguous bits in the source address subnet mask.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value dst_mask_len = 7;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getDstMaskLenOrBuilder();

  /**
   * <pre>
   * Destination port.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value dst_port = 8;</code>
   * @return Whether the dstPort field is set.
   */
  boolean hasDstPort();
  /**
   * <pre>
   * Destination port.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value dst_port = 8;</code>
   * @return The dstPort.
   */
  com.google.protobuf.UInt32Value getDstPort();
  /**
   * <pre>
   * Destination port.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value dst_port = 8;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getDstPortOrBuilder();

  /**
   * <pre>
   * Slot number of the flow-switching engine.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value engine_id = 9;</code>
   * @return Whether the engineId field is set.
   */
  boolean hasEngineId();
  /**
   * <pre>
   * Slot number of the flow-switching engine.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value engine_id = 9;</code>
   * @return The engineId.
   */
  com.google.protobuf.UInt32Value getEngineId();
  /**
   * <pre>
   * Slot number of the flow-switching engine.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value engine_id = 9;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getEngineIdOrBuilder();

  /**
   * <pre>
   * Type of flow-switching engine.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value engine_type = 10;</code>
   * @return Whether the engineType field is set.
   */
  boolean hasEngineType();
  /**
   * <pre>
   * Type of flow-switching engine.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value engine_type = 10;</code>
   * @return The engineType.
   */
  com.google.protobuf.UInt32Value getEngineType();
  /**
   * <pre>
   * Type of flow-switching engine.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value engine_type = 10;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getEngineTypeOrBuilder();

  /**
   * <pre>
   * Unix timestamp in ms at which the previous exported packet-
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value delta_switched = 11;</code>
   * @return Whether the deltaSwitched field is set.
   */
  boolean hasDeltaSwitched();
  /**
   * <pre>
   * Unix timestamp in ms at which the previous exported packet-
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value delta_switched = 11;</code>
   * @return The deltaSwitched.
   */
  com.google.protobuf.UInt64Value getDeltaSwitched();
  /**
   * <pre>
   * Unix timestamp in ms at which the previous exported packet-
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value delta_switched = 11;</code>
   */
  com.google.protobuf.UInt64ValueOrBuilder getDeltaSwitchedOrBuilder();

  /**
   * <pre>
   * -associated with this flow was switched.
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value first_switched = 12;</code>
   * @return Whether the firstSwitched field is set.
   */
  boolean hasFirstSwitched();
  /**
   * <pre>
   * -associated with this flow was switched.
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value first_switched = 12;</code>
   * @return The firstSwitched.
   */
  com.google.protobuf.UInt64Value getFirstSwitched();
  /**
   * <pre>
   * -associated with this flow was switched.
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value first_switched = 12;</code>
   */
  com.google.protobuf.UInt64ValueOrBuilder getFirstSwitchedOrBuilder();

  /**
   * <pre>
   * -associated with this flow was switched.
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value last_switched = 13;</code>
   * @return Whether the lastSwitched field is set.
   */
  boolean hasLastSwitched();
  /**
   * <pre>
   * -associated with this flow was switched.
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value last_switched = 13;</code>
   * @return The lastSwitched.
   */
  com.google.protobuf.UInt64Value getLastSwitched();
  /**
   * <pre>
   * -associated with this flow was switched.
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value last_switched = 13;</code>
   */
  com.google.protobuf.UInt64ValueOrBuilder getLastSwitchedOrBuilder();

  /**
   * <pre>
   * Number of flow records in the associated packet.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value num_flow_records = 14;</code>
   * @return Whether the numFlowRecords field is set.
   */
  boolean hasNumFlowRecords();
  /**
   * <pre>
   * Number of flow records in the associated packet.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value num_flow_records = 14;</code>
   * @return The numFlowRecords.
   */
  com.google.protobuf.UInt32Value getNumFlowRecords();
  /**
   * <pre>
   * Number of flow records in the associated packet.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value num_flow_records = 14;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getNumFlowRecordsOrBuilder();

  /**
   * <pre>
   * Number of packets in the flow.
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value num_packets = 15;</code>
   * @return Whether the numPackets field is set.
   */
  boolean hasNumPackets();
  /**
   * <pre>
   * Number of packets in the flow.
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value num_packets = 15;</code>
   * @return The numPackets.
   */
  com.google.protobuf.UInt64Value getNumPackets();
  /**
   * <pre>
   * Number of packets in the flow.
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value num_packets = 15;</code>
   */
  com.google.protobuf.UInt64ValueOrBuilder getNumPacketsOrBuilder();

  /**
   * <pre>
   * Flow packet sequence number.
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value flow_seq_num = 16;</code>
   * @return Whether the flowSeqNum field is set.
   */
  boolean hasFlowSeqNum();
  /**
   * <pre>
   * Flow packet sequence number.
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value flow_seq_num = 16;</code>
   * @return The flowSeqNum.
   */
  com.google.protobuf.UInt64Value getFlowSeqNum();
  /**
   * <pre>
   * Flow packet sequence number.
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value flow_seq_num = 16;</code>
   */
  com.google.protobuf.UInt64ValueOrBuilder getFlowSeqNumOrBuilder();

  /**
   * <pre>
   * Input SNMP ifIndex.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value input_snmp_ifindex = 17;</code>
   * @return Whether the inputSnmpIfindex field is set.
   */
  boolean hasInputSnmpIfindex();
  /**
   * <pre>
   * Input SNMP ifIndex.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value input_snmp_ifindex = 17;</code>
   * @return The inputSnmpIfindex.
   */
  com.google.protobuf.UInt32Value getInputSnmpIfindex();
  /**
   * <pre>
   * Input SNMP ifIndex.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value input_snmp_ifindex = 17;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getInputSnmpIfindexOrBuilder();

  /**
   * <pre>
   * Output SNMP ifIndex.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value output_snmp_ifindex = 18;</code>
   * @return Whether the outputSnmpIfindex field is set.
   */
  boolean hasOutputSnmpIfindex();
  /**
   * <pre>
   * Output SNMP ifIndex.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value output_snmp_ifindex = 18;</code>
   * @return The outputSnmpIfindex.
   */
  com.google.protobuf.UInt32Value getOutputSnmpIfindex();
  /**
   * <pre>
   * Output SNMP ifIndex.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value output_snmp_ifindex = 18;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getOutputSnmpIfindexOrBuilder();

  /**
   * <pre>
   * IPv4 vs IPv6.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value ip_protocol_version = 19;</code>
   * @return Whether the ipProtocolVersion field is set.
   */
  boolean hasIpProtocolVersion();
  /**
   * <pre>
   * IPv4 vs IPv6.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value ip_protocol_version = 19;</code>
   * @return The ipProtocolVersion.
   */
  com.google.protobuf.UInt32Value getIpProtocolVersion();
  /**
   * <pre>
   * IPv4 vs IPv6.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value ip_protocol_version = 19;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getIpProtocolVersionOrBuilder();

  /**
   * <pre>
   * Next hop IpAddress.
   * </pre>
   *
   * <code>string next_hop_address = 20;</code>
   * @return The nextHopAddress.
   */
  java.lang.String getNextHopAddress();
  /**
   * <pre>
   * Next hop IpAddress.
   * </pre>
   *
   * <code>string next_hop_address = 20;</code>
   * @return The bytes for nextHopAddress.
   */
  com.google.protobuf.ByteString
      getNextHopAddressBytes();

  /**
   * <pre>
   * Next hop hostname.
   * </pre>
   *
   * <code>string next_hop_hostname = 21;</code>
   * @return The nextHopHostname.
   */
  java.lang.String getNextHopHostname();
  /**
   * <pre>
   * Next hop hostname.
   * </pre>
   *
   * <code>string next_hop_hostname = 21;</code>
   * @return The bytes for nextHopHostname.
   */
  com.google.protobuf.ByteString
      getNextHopHostnameBytes();

  /**
   * <pre>
   * IP protocol number i.e 6 for TCP, 17 for UDP
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value protocol = 22;</code>
   * @return Whether the protocol field is set.
   */
  boolean hasProtocol();
  /**
   * <pre>
   * IP protocol number i.e 6 for TCP, 17 for UDP
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value protocol = 22;</code>
   * @return The protocol.
   */
  com.google.protobuf.UInt32Value getProtocol();
  /**
   * <pre>
   * IP protocol number i.e 6 for TCP, 17 for UDP
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value protocol = 22;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getProtocolOrBuilder();

  /**
   * <pre>
   * Sampling algorithm ID.
   * </pre>
   *
   * <code>.SamplingAlgorithm sampling_algorithm = 23;</code>
   * @return The enum numeric value on the wire for samplingAlgorithm.
   */
  int getSamplingAlgorithmValue();
  /**
   * <pre>
   * Sampling algorithm ID.
   * </pre>
   *
   * <code>.SamplingAlgorithm sampling_algorithm = 23;</code>
   * @return The samplingAlgorithm.
   */
  org.opennms.netmgt.flows.persistence.model.SamplingAlgorithm getSamplingAlgorithm();

  /**
   * <pre>
   * Sampling interval.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue sampling_interval = 24;</code>
   * @return Whether the samplingInterval field is set.
   */
  boolean hasSamplingInterval();
  /**
   * <pre>
   * Sampling interval.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue sampling_interval = 24;</code>
   * @return The samplingInterval.
   */
  com.google.protobuf.DoubleValue getSamplingInterval();
  /**
   * <pre>
   * Sampling interval.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue sampling_interval = 24;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getSamplingIntervalOrBuilder();

  /**
   * <pre>
   * Source address.
   * </pre>
   *
   * <code>string src_address = 26;</code>
   * @return The srcAddress.
   */
  java.lang.String getSrcAddress();
  /**
   * <pre>
   * Source address.
   * </pre>
   *
   * <code>string src_address = 26;</code>
   * @return The bytes for srcAddress.
   */
  com.google.protobuf.ByteString
      getSrcAddressBytes();

  /**
   * <pre>
   * Source hostname.
   * </pre>
   *
   * <code>string src_hostname = 27;</code>
   * @return The srcHostname.
   */
  java.lang.String getSrcHostname();
  /**
   * <pre>
   * Source hostname.
   * </pre>
   *
   * <code>string src_hostname = 27;</code>
   * @return The bytes for srcHostname.
   */
  com.google.protobuf.ByteString
      getSrcHostnameBytes();

  /**
   * <pre>
   * Source AS number.
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value src_as = 28;</code>
   * @return Whether the srcAs field is set.
   */
  boolean hasSrcAs();
  /**
   * <pre>
   * Source AS number.
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value src_as = 28;</code>
   * @return The srcAs.
   */
  com.google.protobuf.UInt64Value getSrcAs();
  /**
   * <pre>
   * Source AS number.
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value src_as = 28;</code>
   */
  com.google.protobuf.UInt64ValueOrBuilder getSrcAsOrBuilder();

  /**
   * <pre>
   * The number of contiguous bits in the destination address subnet mask.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value src_mask_len = 29;</code>
   * @return Whether the srcMaskLen field is set.
   */
  boolean hasSrcMaskLen();
  /**
   * <pre>
   * The number of contiguous bits in the destination address subnet mask.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value src_mask_len = 29;</code>
   * @return The srcMaskLen.
   */
  com.google.protobuf.UInt32Value getSrcMaskLen();
  /**
   * <pre>
   * The number of contiguous bits in the destination address subnet mask.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value src_mask_len = 29;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getSrcMaskLenOrBuilder();

  /**
   * <pre>
   * Source port.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value src_port = 30;</code>
   * @return Whether the srcPort field is set.
   */
  boolean hasSrcPort();
  /**
   * <pre>
   * Source port.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value src_port = 30;</code>
   * @return The srcPort.
   */
  com.google.protobuf.UInt32Value getSrcPort();
  /**
   * <pre>
   * Source port.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value src_port = 30;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getSrcPortOrBuilder();

  /**
   * <pre>
   * TCP Flags.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value tcp_flags = 31;</code>
   * @return Whether the tcpFlags field is set.
   */
  boolean hasTcpFlags();
  /**
   * <pre>
   * TCP Flags.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value tcp_flags = 31;</code>
   * @return The tcpFlags.
   */
  com.google.protobuf.UInt32Value getTcpFlags();
  /**
   * <pre>
   * TCP Flags.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value tcp_flags = 31;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getTcpFlagsOrBuilder();

  /**
   * <pre>
   * TOS
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value tos = 32;</code>
   * @return Whether the tos field is set.
   */
  boolean hasTos();
  /**
   * <pre>
   * TOS
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value tos = 32;</code>
   * @return The tos.
   */
  com.google.protobuf.UInt32Value getTos();
  /**
   * <pre>
   * TOS
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value tos = 32;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getTosOrBuilder();

  /**
   * <pre>
   * Netflow version
   * </pre>
   *
   * <code>.NetflowVersion netflow_version = 33;</code>
   * @return The enum numeric value on the wire for netflowVersion.
   */
  int getNetflowVersionValue();
  /**
   * <pre>
   * Netflow version
   * </pre>
   *
   * <code>.NetflowVersion netflow_version = 33;</code>
   * @return The netflowVersion.
   */
  org.opennms.netmgt.flows.persistence.model.NetflowVersion getNetflowVersion();

  /**
   * <pre>
   * VLAN ID.
   * </pre>
   *
   * <code>string vlan = 34;</code>
   * @return The vlan.
   */
  java.lang.String getVlan();
  /**
   * <pre>
   * VLAN ID.
   * </pre>
   *
   * <code>string vlan = 34;</code>
   * @return The bytes for vlan.
   */
  com.google.protobuf.ByteString
      getVlanBytes();

  /**
   * <code>.NodeInfo src_node = 35;</code>
   * @return Whether the srcNode field is set.
   */
  boolean hasSrcNode();
  /**
   * <code>.NodeInfo src_node = 35;</code>
   * @return The srcNode.
   */
  org.opennms.netmgt.flows.persistence.model.NodeInfo getSrcNode();
  /**
   * <code>.NodeInfo src_node = 35;</code>
   */
  org.opennms.netmgt.flows.persistence.model.NodeInfoOrBuilder getSrcNodeOrBuilder();

  /**
   * <code>.NodeInfo exporter_node = 36;</code>
   * @return Whether the exporterNode field is set.
   */
  boolean hasExporterNode();
  /**
   * <code>.NodeInfo exporter_node = 36;</code>
   * @return The exporterNode.
   */
  org.opennms.netmgt.flows.persistence.model.NodeInfo getExporterNode();
  /**
   * <code>.NodeInfo exporter_node = 36;</code>
   */
  org.opennms.netmgt.flows.persistence.model.NodeInfoOrBuilder getExporterNodeOrBuilder();

  /**
   * <code>.NodeInfo dest_node = 37;</code>
   * @return Whether the destNode field is set.
   */
  boolean hasDestNode();
  /**
   * <code>.NodeInfo dest_node = 37;</code>
   * @return The destNode.
   */
  org.opennms.netmgt.flows.persistence.model.NodeInfo getDestNode();
  /**
   * <code>.NodeInfo dest_node = 37;</code>
   */
  org.opennms.netmgt.flows.persistence.model.NodeInfoOrBuilder getDestNodeOrBuilder();

  /**
   * <code>string application = 38;</code>
   * @return The application.
   */
  java.lang.String getApplication();
  /**
   * <code>string application = 38;</code>
   * @return The bytes for application.
   */
  com.google.protobuf.ByteString
      getApplicationBytes();

  /**
   * <code>string host = 39;</code>
   * @return The host.
   */
  java.lang.String getHost();
  /**
   * <code>string host = 39;</code>
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString
      getHostBytes();

  /**
   * <code>string location = 40;</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <code>string location = 40;</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <code>.Locality src_locality = 41;</code>
   * @return The enum numeric value on the wire for srcLocality.
   */
  int getSrcLocalityValue();
  /**
   * <code>.Locality src_locality = 41;</code>
   * @return The srcLocality.
   */
  org.opennms.netmgt.flows.persistence.model.Locality getSrcLocality();

  /**
   * <code>.Locality dst_locality = 42;</code>
   * @return The enum numeric value on the wire for dstLocality.
   */
  int getDstLocalityValue();
  /**
   * <code>.Locality dst_locality = 42;</code>
   * @return The dstLocality.
   */
  org.opennms.netmgt.flows.persistence.model.Locality getDstLocality();

  /**
   * <code>.Locality flow_locality = 43;</code>
   * @return The enum numeric value on the wire for flowLocality.
   */
  int getFlowLocalityValue();
  /**
   * <code>.Locality flow_locality = 43;</code>
   * @return The flowLocality.
   */
  org.opennms.netmgt.flows.persistence.model.Locality getFlowLocality();

  /**
   * <pre>
   * Applied clock correction im milliseconds.
   * </pre>
   *
   * <code>uint64 clock_correction = 45;</code>
   * @return The clockCorrection.
   */
  long getClockCorrection();

  /**
   * <pre>
   * DSCP; upper 6 bits of TOS
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value dscp = 46;</code>
   * @return Whether the dscp field is set.
   */
  boolean hasDscp();
  /**
   * <pre>
   * DSCP; upper 6 bits of TOS
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value dscp = 46;</code>
   * @return The dscp.
   */
  com.google.protobuf.UInt32Value getDscp();
  /**
   * <pre>
   * DSCP; upper 6 bits of TOS
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value dscp = 46;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getDscpOrBuilder();

  /**
   * <pre>
   * ECN; lower 2 bits of TOS
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value ecn = 47;</code>
   * @return Whether the ecn field is set.
   */
  boolean hasEcn();
  /**
   * <pre>
   * ECN; lower 2 bits of TOS
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value ecn = 47;</code>
   * @return The ecn.
   */
  com.google.protobuf.UInt32Value getEcn();
  /**
   * <pre>
   * ECN; lower 2 bits of TOS
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value ecn = 47;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getEcnOrBuilder();
}
