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
 * Class to implement the Ember EZSP command <b>dGpSentHandler</b>.
 * <p>
 * A callback to the GP endpoint to indicate the result of the GPDF transmission.
 * <p>
 * This class provides methods for processing EZSP commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EzspDGpSentHandler extends EzspFrameResponse {
    public static final int FRAME_ID = 0xC7;

    /**
     * An EmberStatus value indicating success or the reason for failure.
     * <p>
     * EZSP type is <i>EmberStatus</i> - Java type is {@link EmberStatus}
     */
    private EmberStatus status;

    /**
     * The handle of the GPDF.
     * <p>
     * EZSP type is <i>uint8_t</i> - Java type is {@link int}
     */
    private int gpepHandle;

    /**
     * Response and Handler constructor
     */
    public EzspDGpSentHandler(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        // Deserialize the fields
        status = deserializer.deserializeEmberStatus();
        gpepHandle = deserializer.deserializeUInt8();
    }

    /**
     * An EmberStatus value indicating success or the reason for failure.
     * <p>
     * EZSP type is <i>EmberStatus</i> - Java type is {@link EmberStatus}
     *
     * @return the current status as {@link EmberStatus}
     */
    public EmberStatus getStatus() {
        return status;
    }

    /**
     * An EmberStatus value indicating success or the reason for failure.
     *
     * @param status the status to set as {@link EmberStatus}
     */
    public void setStatus(EmberStatus status) {
        this.status = status;
    }

    /**
     * The handle of the GPDF.
     * <p>
     * EZSP type is <i>uint8_t</i> - Java type is {@link int}
     *
     * @return the current gpepHandle as {@link int}
     */
    public int getGpepHandle() {
        return gpepHandle;
    }

    /**
     * The handle of the GPDF.
     *
     * @param gpepHandle the gpepHandle to set as {@link int}
     */
    public void setGpepHandle(int gpepHandle) {
        this.gpepHandle = gpepHandle;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(71);
        builder.append("EzspDGpSentHandler [status=");
        builder.append(status);
        builder.append(", gpepHandle=");
        builder.append(gpepHandle);
        builder.append(']');
        return builder.toString();
    }
}
