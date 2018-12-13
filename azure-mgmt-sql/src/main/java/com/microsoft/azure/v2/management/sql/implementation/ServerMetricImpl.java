/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.v2.management.sql.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.v2.management.resources.fluentcore.model.implementation.WrapperImpl;
import com.microsoft.azure.v2.management.sql.ServerMetric;
import java.time.OffsetDateTime;

/**
 * Implementation for DatabaseMetric interface.
 */
@LangDefinition
class ServerMetricImpl
    extends WrapperImpl<ServerUsageInner>
    implements ServerMetric {

    protected ServerMetricImpl(ServerUsageInner innerObject) {
        super(innerObject);
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String resourceName() {
        return this.inner().resourceName();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public double currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public double limit() {
        return this.inner().limit();
    }

    @Override
    public String unit() {
        return this.inner().unit();
    }

    @Override
    public OffsetDateTime nextResetTime() {
        return this.inner().nextResetTime();
    }
}
