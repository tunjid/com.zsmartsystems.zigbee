/**
 * Copyright (c) 2016-2020 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.metering;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

/**
 * Configure Mirror value object class.
 * <p>
 * Cluster: <b>Metering</b>. Command ID 0x08 is sent <b>FROM</b> the server.
 * This command is a <b>specific</b> command used for the Metering cluster.
 * <p>
 * FIXME: ConfigureMirror is sent to the mirror once the mirror has been created. The command
 * deals with the operational configuration of the Mirror.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2020-01-12T12:33:13Z")
public class ConfigureMirror extends ZclMeteringCommand {
    /**
     * The cluster ID to which this command belongs.
     */
    public static int CLUSTER_ID = 0x0702;

    /**
     * The command ID.
     */
    public static int COMMAND_ID = 0x08;

    /**
     * Issuer Event ID command message field.
     * <p>
     * Unique identifier generated by the device being mirrored. When new information is
     * provided that replaces older information, this field allows devices to determine
     * which information is newer. It is recommended that the value contained in this field is a
     * UTC based time stamp (UTCTime data type) identifying when the command was issued. Thus,
     * newer information will have a value in the Issuer Event ID field that is larger than older
     * information.
     */
    private Integer issuerEventId;

    /**
     * Reporting Interval command message field.
     * <p>
     * An unsigned 24-bit integer to denote the interval, in seconds, at which a mirrored meter
     * intends to use the ReportAttribute command.
     */
    private Integer reportingInterval;

    /**
     * Mirror Notification Reporting command message field.
     * <p>
     * A Boolean used to advise a BOMD how the Notification flags should be acquired (see
     * below).
     * <p>
     * When Mirror Notification Reporting is set, the MirrorReportAttributeResponse
     * command is enabled. In that case, the Metering client on the mirror endpoint shall
     * respond to the last or only ReportAttribute command with the
     * MirrorReportAttributeResponse.
     * <p>
     * If Mirror Notification Reporting is set to FALSE, the MirrorReportAttributeResponse
     * command shall not be enabled; the Metering server may poll the Notification flags by
     * means of a normal ReadAttribute command.
     */
    private Boolean mirrorNotificationReporting;

    /**
     * Notification Scheme command message field.
     * <p>
     * This unsigned 8-bit integer allows for the pre-loading of the Notification Flags bit
     * mapping to ZCL or Smart Energy Standard commands.
     */
    private Integer notificationScheme;

    /**
     * Default constructor.
     *
     * @deprecated from release 1.3.0. Use the parameterised constructor instead of the default contructor and setters.
     */
    @Deprecated
    public ConfigureMirror() {
        clusterId = CLUSTER_ID;
        commandId = COMMAND_ID;
        genericCommand = false;
        commandDirection = ZclCommandDirection.SERVER_TO_CLIENT;
    }

    /**
     * Constructor providing all required parameters.
     *
     * @param issuerEventId {@link Integer} Issuer Event ID
     * @param reportingInterval {@link Integer} Reporting Interval
     * @param mirrorNotificationReporting {@link Boolean} Mirror Notification Reporting
     * @param notificationScheme {@link Integer} Notification Scheme
     */
    public ConfigureMirror(
            Integer issuerEventId,
            Integer reportingInterval,
            Boolean mirrorNotificationReporting,
            Integer notificationScheme) {

        clusterId = CLUSTER_ID;
        commandId = COMMAND_ID;
        genericCommand = false;
        commandDirection = ZclCommandDirection.SERVER_TO_CLIENT;

        this.issuerEventId = issuerEventId;
        this.reportingInterval = reportingInterval;
        this.mirrorNotificationReporting = mirrorNotificationReporting;
        this.notificationScheme = notificationScheme;
    }

    /**
     * Gets Issuer Event ID.
     * <p>
     * Unique identifier generated by the device being mirrored. When new information is
     * provided that replaces older information, this field allows devices to determine
     * which information is newer. It is recommended that the value contained in this field is a
     * UTC based time stamp (UTCTime data type) identifying when the command was issued. Thus,
     * newer information will have a value in the Issuer Event ID field that is larger than older
     * information.
     *
     * @return the Issuer Event ID
     */
    public Integer getIssuerEventId() {
        return issuerEventId;
    }

    /**
     * Sets Issuer Event ID.
     * <p>
     * Unique identifier generated by the device being mirrored. When new information is
     * provided that replaces older information, this field allows devices to determine
     * which information is newer. It is recommended that the value contained in this field is a
     * UTC based time stamp (UTCTime data type) identifying when the command was issued. Thus,
     * newer information will have a value in the Issuer Event ID field that is larger than older
     * information.
     *
     * @param issuerEventId the Issuer Event ID
     * @deprecated as of 1.3.0. Use the parameterised constructor instead to ensure that all mandatory fields are provided.
     */
    @Deprecated
    public void setIssuerEventId(final Integer issuerEventId) {
        this.issuerEventId = issuerEventId;
    }

    /**
     * Gets Reporting Interval.
     * <p>
     * An unsigned 24-bit integer to denote the interval, in seconds, at which a mirrored meter
     * intends to use the ReportAttribute command.
     *
     * @return the Reporting Interval
     */
    public Integer getReportingInterval() {
        return reportingInterval;
    }

    /**
     * Sets Reporting Interval.
     * <p>
     * An unsigned 24-bit integer to denote the interval, in seconds, at which a mirrored meter
     * intends to use the ReportAttribute command.
     *
     * @param reportingInterval the Reporting Interval
     * @deprecated as of 1.3.0. Use the parameterised constructor instead to ensure that all mandatory fields are provided.
     */
    @Deprecated
    public void setReportingInterval(final Integer reportingInterval) {
        this.reportingInterval = reportingInterval;
    }

    /**
     * Gets Mirror Notification Reporting.
     * <p>
     * A Boolean used to advise a BOMD how the Notification flags should be acquired (see
     * below).
     * <p>
     * When Mirror Notification Reporting is set, the MirrorReportAttributeResponse
     * command is enabled. In that case, the Metering client on the mirror endpoint shall
     * respond to the last or only ReportAttribute command with the
     * MirrorReportAttributeResponse.
     * <p>
     * If Mirror Notification Reporting is set to FALSE, the MirrorReportAttributeResponse
     * command shall not be enabled; the Metering server may poll the Notification flags by
     * means of a normal ReadAttribute command.
     *
     * @return the Mirror Notification Reporting
     */
    public Boolean getMirrorNotificationReporting() {
        return mirrorNotificationReporting;
    }

    /**
     * Sets Mirror Notification Reporting.
     * <p>
     * A Boolean used to advise a BOMD how the Notification flags should be acquired (see
     * below).
     * <p>
     * When Mirror Notification Reporting is set, the MirrorReportAttributeResponse
     * command is enabled. In that case, the Metering client on the mirror endpoint shall
     * respond to the last or only ReportAttribute command with the
     * MirrorReportAttributeResponse.
     * <p>
     * If Mirror Notification Reporting is set to FALSE, the MirrorReportAttributeResponse
     * command shall not be enabled; the Metering server may poll the Notification flags by
     * means of a normal ReadAttribute command.
     *
     * @param mirrorNotificationReporting the Mirror Notification Reporting
     * @deprecated as of 1.3.0. Use the parameterised constructor instead to ensure that all mandatory fields are provided.
     */
    @Deprecated
    public void setMirrorNotificationReporting(final Boolean mirrorNotificationReporting) {
        this.mirrorNotificationReporting = mirrorNotificationReporting;
    }

    /**
     * Gets Notification Scheme.
     * <p>
     * This unsigned 8-bit integer allows for the pre-loading of the Notification Flags bit
     * mapping to ZCL or Smart Energy Standard commands.
     *
     * @return the Notification Scheme
     */
    public Integer getNotificationScheme() {
        return notificationScheme;
    }

    /**
     * Sets Notification Scheme.
     * <p>
     * This unsigned 8-bit integer allows for the pre-loading of the Notification Flags bit
     * mapping to ZCL or Smart Energy Standard commands.
     *
     * @param notificationScheme the Notification Scheme
     * @deprecated as of 1.3.0. Use the parameterised constructor instead to ensure that all mandatory fields are provided.
     */
    @Deprecated
    public void setNotificationScheme(final Integer notificationScheme) {
        this.notificationScheme = notificationScheme;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(issuerEventId, ZclDataType.UNSIGNED_32_BIT_INTEGER);
        serializer.serialize(reportingInterval, ZclDataType.UNSIGNED_24_BIT_INTEGER);
        serializer.serialize(mirrorNotificationReporting, ZclDataType.BOOLEAN);
        serializer.serialize(notificationScheme, ZclDataType.UNSIGNED_8_BIT_INTEGER);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        issuerEventId = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_32_BIT_INTEGER);
        reportingInterval = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_24_BIT_INTEGER);
        mirrorNotificationReporting = (Boolean) deserializer.deserialize(ZclDataType.BOOLEAN);
        notificationScheme = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(173);
        builder.append("ConfigureMirror [");
        builder.append(super.toString());
        builder.append(", issuerEventId=");
        builder.append(issuerEventId);
        builder.append(", reportingInterval=");
        builder.append(reportingInterval);
        builder.append(", mirrorNotificationReporting=");
        builder.append(mirrorNotificationReporting);
        builder.append(", notificationScheme=");
        builder.append(notificationScheme);
        builder.append(']');
        return builder.toString();
    }

}
