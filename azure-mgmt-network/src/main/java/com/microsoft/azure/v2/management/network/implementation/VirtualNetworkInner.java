/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.v2.Resource;
import com.microsoft.azure.v2.SubResource;
import com.microsoft.azure.v2.management.network.AddressSpace;
import com.microsoft.azure.v2.management.network.DhcpOptions;
import com.microsoft.rest.v2.annotations.SkipParentValidation;
import com.microsoft.rest.v2.serializer.JsonFlatten;
import java.util.List;

/**
 * Virtual Network resource.
 */
@JsonFlatten
@SkipParentValidation
public class VirtualNetworkInner extends Resource {
    /**
     * The AddressSpace that contains an array of IP address ranges that can be
     * used by subnets.
     */
    @JsonProperty(value = "properties.addressSpace")
    private AddressSpace addressSpace;

    /**
     * The dhcpOptions that contains an array of DNS servers available to VMs
     * deployed in the virtual network.
     */
    @JsonProperty(value = "properties.dhcpOptions")
    private DhcpOptions dhcpOptions;

    /**
     * A list of subnets in a Virtual Network.
     */
    @JsonProperty(value = "properties.subnets")
    private List<SubnetInner> subnetsProperty;

    /**
     * A list of peerings in a Virtual Network.
     */
    @JsonProperty(value = "properties.virtualNetworkPeerings")
    private List<VirtualNetworkPeeringInner> virtualNetworkPeeringsProperty;

    /**
     * The resourceGuid property of the Virtual Network resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * The provisioning state of the PublicIP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Indicates if DDoS protection is enabled for all the protected resources
     * in the virtual network. It requires a DDoS protection plan associated
     * with the resource.
     */
    @JsonProperty(value = "properties.enableDdosProtection")
    private Boolean enableDdosProtection;

    /**
     * Indicates if VM protection is enabled for all the subnets in the virtual
     * network.
     */
    @JsonProperty(value = "properties.enableVmProtection")
    private Boolean enableVmProtection;

    /**
     * The DDoS protection plan associated with the virtual network.
     */
    @JsonProperty(value = "properties.ddosProtectionPlan")
    private SubResource ddosProtectionPlan;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the addressSpace value.
     *
     * @return the addressSpace value.
     */
    public AddressSpace addressSpace() {
        return this.addressSpace;
    }

    /**
     * Set the addressSpace value.
     *
     * @param addressSpace the addressSpace value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withAddressSpace(AddressSpace addressSpace) {
        this.addressSpace = addressSpace;
        return this;
    }

    /**
     * Get the dhcpOptions value.
     *
     * @return the dhcpOptions value.
     */
    public DhcpOptions dhcpOptions() {
        return this.dhcpOptions;
    }

    /**
     * Set the dhcpOptions value.
     *
     * @param dhcpOptions the dhcpOptions value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withDhcpOptions(DhcpOptions dhcpOptions) {
        this.dhcpOptions = dhcpOptions;
        return this;
    }

    /**
     * Get the subnetsProperty value.
     *
     * @return the subnetsProperty value.
     */
    public List<SubnetInner> subnetsProperty() {
        return this.subnetsProperty;
    }

    /**
     * Set the subnetsProperty value.
     *
     * @param subnetsProperty the subnetsProperty value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withSubnetsProperty(List<SubnetInner> subnetsProperty) {
        this.subnetsProperty = subnetsProperty;
        return this;
    }

    /**
     * Get the virtualNetworkPeeringsProperty value.
     *
     * @return the virtualNetworkPeeringsProperty value.
     */
    public List<VirtualNetworkPeeringInner> virtualNetworkPeeringsProperty() {
        return this.virtualNetworkPeeringsProperty;
    }

    /**
     * Set the virtualNetworkPeeringsProperty value.
     *
     * @param virtualNetworkPeeringsProperty the virtualNetworkPeeringsProperty
     * value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withVirtualNetworkPeeringsProperty(List<VirtualNetworkPeeringInner> virtualNetworkPeeringsProperty) {
        this.virtualNetworkPeeringsProperty = virtualNetworkPeeringsProperty;
        return this;
    }

    /**
     * Get the resourceGuid value.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid value.
     *
     * @param resourceGuid the resourceGuid value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the enableDdosProtection value.
     *
     * @return the enableDdosProtection value.
     */
    public Boolean enableDdosProtection() {
        return this.enableDdosProtection;
    }

    /**
     * Set the enableDdosProtection value.
     *
     * @param enableDdosProtection the enableDdosProtection value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withEnableDdosProtection(Boolean enableDdosProtection) {
        this.enableDdosProtection = enableDdosProtection;
        return this;
    }

    /**
     * Get the enableVmProtection value.
     *
     * @return the enableVmProtection value.
     */
    public Boolean enableVmProtection() {
        return this.enableVmProtection;
    }

    /**
     * Set the enableVmProtection value.
     *
     * @param enableVmProtection the enableVmProtection value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withEnableVmProtection(Boolean enableVmProtection) {
        this.enableVmProtection = enableVmProtection;
        return this;
    }

    /**
     * Get the ddosProtectionPlan value.
     *
     * @return the ddosProtectionPlan value.
     */
    public SubResource ddosProtectionPlan() {
        return this.ddosProtectionPlan;
    }

    /**
     * Set the ddosProtectionPlan value.
     *
     * @param ddosProtectionPlan the ddosProtectionPlan value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withDdosProtectionPlan(SubResource ddosProtectionPlan) {
        this.ddosProtectionPlan = ddosProtectionPlan;
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the id value.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withId(String id) {
        this.id = id;
        return this;
    }
}