/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.command;

import com.zsmartsystems.zigbee.dongle.ember.ezsp.EzspFrameResponse;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EmberStatus;

/**
 * Class to implement the Ember EZSP command <b>removeDevice</b>.
 * <p>
 * This command sends an APS remove device using APS encryption to the destination indicating
 * either to remove itself from the network, or one of its children.
 * <p>
 * This class provides methods for processing EZSP commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EzspRemoveDeviceResponse extends EzspFrameResponse {
    public static final int FRAME_ID = 0xA8;

    /**
     * An EmberStatus value indicating success, or the reason for failure
     * <p>
     * EZSP type is <i>EmberStatus</i> - Java type is {@link EmberStatus}
     */
    private EmberStatus status;

    /**
     * Response and Handler constructor
     */
    public EzspRemoveDeviceResponse(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        // Deserialize the fields
        status = deserializer.deserializeEmberStatus();
    }

    /**
     * An EmberStatus value indicating success, or the reason for failure
     * <p>
     * EZSP type is <i>EmberStatus</i> - Java type is {@link EmberStatus}
     *
     * @return the current status as {@link EmberStatus}
     */
    public EmberStatus getStatus() {
        return status;
    }

    /**
     * An EmberStatus value indicating success, or the reason for failure
     *
     * @param status the status to set as {@link EmberStatus}
     */
    public void setStatus(EmberStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(52);
        builder.append("EzspRemoveDeviceResponse [status=");
        builder.append(status);
        builder.append(']');
        return builder.toString();
    }
}
