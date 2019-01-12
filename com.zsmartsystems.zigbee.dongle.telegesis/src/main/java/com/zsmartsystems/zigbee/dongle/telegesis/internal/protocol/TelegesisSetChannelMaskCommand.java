/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.telegesis.internal.protocol;


/**
 * Class to implement the Telegesis command <b>Set Channel Mask</b>.
 * <p>
 * Sets the channel mask
 * <p>
 * This class provides methods for processing Telegesis AT API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class TelegesisSetChannelMaskCommand extends TelegesisFrame implements TelegesisCommand {
    /**
     * Command field
     */
    private Integer channelMask;

    /**
     *
     * @param channelMask the channelMask to set as {@link Integer}
     */
    public void setChannelMask(Integer channelMask) {
        this.channelMask = channelMask;
    }

    @Override
    public int[] serialize() {
        // Serialize the command fields
        serializeCommand("ATS00=");
        serializeInt16(channelMask);

        return getPayload();
    }

    @Override
    public boolean deserialize(int[] data) {
        // Handle standard status responses (ie. OK / ERROR)
        if (handleIncomingStatus(data)) {
            return true;
        }

        initialiseDeserializer(data);


        return false;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(210);
        // First present the command parameters...
        // Then the responses later if they are available
        builder.append("TelegesisSetChannelMaskCommand [channelMask=");
        builder.append(String.format("%04X", channelMask));
        if (status != null) {
            builder.append(", status=");
            builder.append(status);
        }
        builder.append(']');
        return builder.toString();
    }
}
