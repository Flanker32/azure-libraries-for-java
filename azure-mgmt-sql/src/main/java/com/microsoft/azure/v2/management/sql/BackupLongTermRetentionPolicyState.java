/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.sql;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for BackupLongTermRetentionPolicyState.
 */
public enum BackupLongTermRetentionPolicyState {
    /**
     * Enum value Disabled.
     */
    DISABLED("Disabled"),

    /**
     * Enum value Enabled.
     */
    ENABLED("Enabled");

    /**
     * The actual serialized value for a BackupLongTermRetentionPolicyState instance.
     */
    private final String value;

    BackupLongTermRetentionPolicyState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a BackupLongTermRetentionPolicyState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed BackupLongTermRetentionPolicyState object, or null if unable to parse.
     */
    @JsonCreator
    public static BackupLongTermRetentionPolicyState fromString(String value) {
        BackupLongTermRetentionPolicyState[] items = BackupLongTermRetentionPolicyState.values();
        for (BackupLongTermRetentionPolicyState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
