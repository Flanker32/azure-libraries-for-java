/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.v2.management.network.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.v2.management.network.PacketCaptureStatus;
import com.microsoft.azure.v2.management.network.PcError;
import com.microsoft.azure.v2.management.network.PcStatus;
import com.microsoft.azure.v2.management.resources.fluentcore.model.implementation.WrapperImpl;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Implementation for {@link PacketCaptureStatus}.
 */
@LangDefinition
class PacketCaptureStatusImpl extends WrapperImpl<PacketCaptureQueryStatusResultInner>
        implements PacketCaptureStatus {
    PacketCaptureStatusImpl(PacketCaptureQueryStatusResultInner innerObject) {
        super(innerObject);
    }

    @Override
    public String name() {
        return inner().name();
    }

    @Override
    public String id() {
        return inner().id();
    }

    @Override
    public OffsetDateTime captureStartTime() {
        return inner().captureStartTime();
    }

    @Override
    public PcStatus packetCaptureStatus() {
        return inner().packetCaptureStatus();
    }

    @Override
    public String stopReason() {
        return inner().stopReason();
    }

    @Override
    public List<PcError> packetCaptureErrors() {
        return inner().packetCaptureError();
    }
}
