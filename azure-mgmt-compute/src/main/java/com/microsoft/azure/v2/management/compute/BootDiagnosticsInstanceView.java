/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.compute;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The instance view of a virtual machine boot diagnostics.
 */
public final class BootDiagnosticsInstanceView {
    /**
     * The console screenshot blob URI.
     */
    @JsonProperty(value = "consoleScreenshotBlobUri")
    private String consoleScreenshotBlobUri;

    /**
     * The Linux serial console log blob Uri.
     */
    @JsonProperty(value = "serialConsoleLogBlobUri")
    private String serialConsoleLogBlobUri;

    /**
     * Get the consoleScreenshotBlobUri value.
     *
     * @return the consoleScreenshotBlobUri value.
     */
    public String consoleScreenshotBlobUri() {
        return this.consoleScreenshotBlobUri;
    }

    /**
     * Set the consoleScreenshotBlobUri value.
     *
     * @param consoleScreenshotBlobUri the consoleScreenshotBlobUri value to
     * set.
     * @return the BootDiagnosticsInstanceView object itself.
     */
    public BootDiagnosticsInstanceView withConsoleScreenshotBlobUri(String consoleScreenshotBlobUri) {
        this.consoleScreenshotBlobUri = consoleScreenshotBlobUri;
        return this;
    }

    /**
     * Get the serialConsoleLogBlobUri value.
     *
     * @return the serialConsoleLogBlobUri value.
     */
    public String serialConsoleLogBlobUri() {
        return this.serialConsoleLogBlobUri;
    }

    /**
     * Set the serialConsoleLogBlobUri value.
     *
     * @param serialConsoleLogBlobUri the serialConsoleLogBlobUri value to set.
     * @return the BootDiagnosticsInstanceView object itself.
     */
    public BootDiagnosticsInstanceView withSerialConsoleLogBlobUri(String serialConsoleLogBlobUri) {
        this.serialConsoleLogBlobUri = serialConsoleLogBlobUri;
        return this;
    }
}