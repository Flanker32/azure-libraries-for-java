/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.sql.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.v2.management.sql.ProxyResource;
import com.microsoft.azure.v2.management.sql.SecurityAlertPolicyState;
import com.microsoft.rest.v2.serializer.JsonFlatten;
import java.util.List;

/**
 * A server security alert policy.
 */
@JsonFlatten
public class ServerSecurityAlertPolicyInner extends ProxyResource {
    /**
     * Specifies the state of the policy, whether it is enabled or disabled.
     * Possible values include: 'New', 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.state", required = true)
    private SecurityAlertPolicyState state;

    /**
     * Specifies an array of alerts that are disabled. Allowed values are:
     * Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly,
     * Data_Exfiltration, Unsafe_Action.
     */
    @JsonProperty(value = "properties.disabledAlerts")
    private List<String> disabledAlerts;

    /**
     * Specifies an array of e-mail addresses to which the alert is sent.
     */
    @JsonProperty(value = "properties.emailAddresses")
    private List<String> emailAddresses;

    /**
     * Specifies that the alert is sent to the account administrators.
     */
    @JsonProperty(value = "properties.emailAccountAdmins")
    private Boolean emailAccountAdmins;

    /**
     * Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). This blob storage will hold
     * all Threat Detection audit logs.
     */
    @JsonProperty(value = "properties.storageEndpoint")
    private String storageEndpoint;

    /**
     * Specifies the identifier key of the Threat Detection audit storage
     * account.
     */
    @JsonProperty(value = "properties.storageAccountAccessKey")
    private String storageAccountAccessKey;

    /**
     * Specifies the number of days to keep in the Threat Detection audit logs.
     */
    @JsonProperty(value = "properties.retentionDays")
    private Integer retentionDays;

    /**
     * Get the state value.
     *
     * @return the state value.
     */
    public SecurityAlertPolicyState state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withState(SecurityAlertPolicyState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the disabledAlerts value.
     *
     * @return the disabledAlerts value.
     */
    public List<String> disabledAlerts() {
        return this.disabledAlerts;
    }

    /**
     * Set the disabledAlerts value.
     *
     * @param disabledAlerts the disabledAlerts value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withDisabledAlerts(List<String> disabledAlerts) {
        this.disabledAlerts = disabledAlerts;
        return this;
    }

    /**
     * Get the emailAddresses value.
     *
     * @return the emailAddresses value.
     */
    public List<String> emailAddresses() {
        return this.emailAddresses;
    }

    /**
     * Set the emailAddresses value.
     *
     * @param emailAddresses the emailAddresses value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withEmailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }

    /**
     * Get the emailAccountAdmins value.
     *
     * @return the emailAccountAdmins value.
     */
    public Boolean emailAccountAdmins() {
        return this.emailAccountAdmins;
    }

    /**
     * Set the emailAccountAdmins value.
     *
     * @param emailAccountAdmins the emailAccountAdmins value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withEmailAccountAdmins(Boolean emailAccountAdmins) {
        this.emailAccountAdmins = emailAccountAdmins;
        return this;
    }

    /**
     * Get the storageEndpoint value.
     *
     * @return the storageEndpoint value.
     */
    public String storageEndpoint() {
        return this.storageEndpoint;
    }

    /**
     * Set the storageEndpoint value.
     *
     * @param storageEndpoint the storageEndpoint value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withStorageEndpoint(String storageEndpoint) {
        this.storageEndpoint = storageEndpoint;
        return this;
    }

    /**
     * Get the storageAccountAccessKey value.
     *
     * @return the storageAccountAccessKey value.
     */
    public String storageAccountAccessKey() {
        return this.storageAccountAccessKey;
    }

    /**
     * Set the storageAccountAccessKey value.
     *
     * @param storageAccountAccessKey the storageAccountAccessKey value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.storageAccountAccessKey = storageAccountAccessKey;
        return this;
    }

    /**
     * Get the retentionDays value.
     *
     * @return the retentionDays value.
     */
    public Integer retentionDays() {
        return this.retentionDays;
    }

    /**
     * Set the retentionDays value.
     *
     * @param retentionDays the retentionDays value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
}
