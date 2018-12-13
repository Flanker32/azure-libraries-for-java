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
import com.microsoft.azure.v2.management.sql.SloUsageMetric;
import com.microsoft.rest.v2.serializer.JsonFlatten;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Represents a Service Tier Advisor.
 */
@JsonFlatten
public class ServiceTierAdvisorInner extends ProxyResource {
    /**
     * The observation period start (ISO8601 format).
     */
    @JsonProperty(value = "properties.observationPeriodStart", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime observationPeriodStart;

    /**
     * The observation period start (ISO8601 format).
     */
    @JsonProperty(value = "properties.observationPeriodEnd", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime observationPeriodEnd;

    /**
     * The activeTimeRatio for service tier advisor.
     */
    @JsonProperty(value = "properties.activeTimeRatio", access = JsonProperty.Access.WRITE_ONLY)
    private Double activeTimeRatio;

    /**
     * Gets or sets minDtu for service tier advisor.
     */
    @JsonProperty(value = "properties.minDtu", access = JsonProperty.Access.WRITE_ONLY)
    private Double minDtu;

    /**
     * Gets or sets avgDtu for service tier advisor.
     */
    @JsonProperty(value = "properties.avgDtu", access = JsonProperty.Access.WRITE_ONLY)
    private Double avgDtu;

    /**
     * Gets or sets maxDtu for service tier advisor.
     */
    @JsonProperty(value = "properties.maxDtu", access = JsonProperty.Access.WRITE_ONLY)
    private Double maxDtu;

    /**
     * Gets or sets maxSizeInGB for service tier advisor.
     */
    @JsonProperty(value = "properties.maxSizeInGB", access = JsonProperty.Access.WRITE_ONLY)
    private Double maxSizeInGB;

    /**
     * Gets or sets serviceLevelObjectiveUsageMetrics for the service tier
     * advisor.
     */
    @JsonProperty(value = "properties.serviceLevelObjectiveUsageMetrics", access = JsonProperty.Access.WRITE_ONLY)
    private List<SloUsageMetric> serviceLevelObjectiveUsageMetrics;

    /**
     * Gets or sets currentServiceLevelObjective for service tier advisor.
     */
    @JsonProperty(value = "properties.currentServiceLevelObjective", access = JsonProperty.Access.WRITE_ONLY)
    private String currentServiceLevelObjective;

    /**
     * Gets or sets currentServiceLevelObjectiveId for service tier advisor.
     */
    @JsonProperty(value = "properties.currentServiceLevelObjectiveId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID currentServiceLevelObjectiveId;

    /**
     * Gets or sets usageBasedRecommendationServiceLevelObjective for service
     * tier advisor.
     */
    @JsonProperty(value = "properties.usageBasedRecommendationServiceLevelObjective", access = JsonProperty.Access.WRITE_ONLY)
    private String usageBasedRecommendationServiceLevelObjective;

    /**
     * Gets or sets usageBasedRecommendationServiceLevelObjectiveId for service
     * tier advisor.
     */
    @JsonProperty(value = "properties.usageBasedRecommendationServiceLevelObjectiveId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID usageBasedRecommendationServiceLevelObjectiveId;

    /**
     * Gets or sets databaseSizeBasedRecommendationServiceLevelObjective for
     * service tier advisor.
     */
    @JsonProperty(value = "properties.databaseSizeBasedRecommendationServiceLevelObjective", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseSizeBasedRecommendationServiceLevelObjective;

    /**
     * Gets or sets databaseSizeBasedRecommendationServiceLevelObjectiveId for
     * service tier advisor.
     */
    @JsonProperty(value = "properties.databaseSizeBasedRecommendationServiceLevelObjectiveId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID databaseSizeBasedRecommendationServiceLevelObjectiveId;

    /**
     * Gets or sets disasterPlanBasedRecommendationServiceLevelObjective for
     * service tier advisor.
     */
    @JsonProperty(value = "properties.disasterPlanBasedRecommendationServiceLevelObjective", access = JsonProperty.Access.WRITE_ONLY)
    private String disasterPlanBasedRecommendationServiceLevelObjective;

    /**
     * Gets or sets disasterPlanBasedRecommendationServiceLevelObjectiveId for
     * service tier advisor.
     */
    @JsonProperty(value = "properties.disasterPlanBasedRecommendationServiceLevelObjectiveId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID disasterPlanBasedRecommendationServiceLevelObjectiveId;

    /**
     * Gets or sets overallRecommendationServiceLevelObjective for service tier
     * advisor.
     */
    @JsonProperty(value = "properties.overallRecommendationServiceLevelObjective", access = JsonProperty.Access.WRITE_ONLY)
    private String overallRecommendationServiceLevelObjective;

    /**
     * Gets or sets overallRecommendationServiceLevelObjectiveId for service
     * tier advisor.
     */
    @JsonProperty(value = "properties.overallRecommendationServiceLevelObjectiveId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID overallRecommendationServiceLevelObjectiveId;

    /**
     * Gets or sets confidence for service tier advisor.
     */
    @JsonProperty(value = "properties.confidence", access = JsonProperty.Access.WRITE_ONLY)
    private double confidence;

    /**
     * Get the observationPeriodStart value.
     *
     * @return the observationPeriodStart value.
     */
    public OffsetDateTime observationPeriodStart() {
        return this.observationPeriodStart;
    }

    /**
     * Get the observationPeriodEnd value.
     *
     * @return the observationPeriodEnd value.
     */
    public OffsetDateTime observationPeriodEnd() {
        return this.observationPeriodEnd;
    }

    /**
     * Get the activeTimeRatio value.
     *
     * @return the activeTimeRatio value.
     */
    public Double activeTimeRatio() {
        return this.activeTimeRatio;
    }

    /**
     * Get the minDtu value.
     *
     * @return the minDtu value.
     */
    public Double minDtu() {
        return this.minDtu;
    }

    /**
     * Get the avgDtu value.
     *
     * @return the avgDtu value.
     */
    public Double avgDtu() {
        return this.avgDtu;
    }

    /**
     * Get the maxDtu value.
     *
     * @return the maxDtu value.
     */
    public Double maxDtu() {
        return this.maxDtu;
    }

    /**
     * Get the maxSizeInGB value.
     *
     * @return the maxSizeInGB value.
     */
    public Double maxSizeInGB() {
        return this.maxSizeInGB;
    }

    /**
     * Get the serviceLevelObjectiveUsageMetrics value.
     *
     * @return the serviceLevelObjectiveUsageMetrics value.
     */
    public List<SloUsageMetric> serviceLevelObjectiveUsageMetrics() {
        return this.serviceLevelObjectiveUsageMetrics;
    }

    /**
     * Get the currentServiceLevelObjective value.
     *
     * @return the currentServiceLevelObjective value.
     */
    public String currentServiceLevelObjective() {
        return this.currentServiceLevelObjective;
    }

    /**
     * Get the currentServiceLevelObjectiveId value.
     *
     * @return the currentServiceLevelObjectiveId value.
     */
    public UUID currentServiceLevelObjectiveId() {
        return this.currentServiceLevelObjectiveId;
    }

    /**
     * Get the usageBasedRecommendationServiceLevelObjective value.
     *
     * @return the usageBasedRecommendationServiceLevelObjective value.
     */
    public String usageBasedRecommendationServiceLevelObjective() {
        return this.usageBasedRecommendationServiceLevelObjective;
    }

    /**
     * Get the usageBasedRecommendationServiceLevelObjectiveId value.
     *
     * @return the usageBasedRecommendationServiceLevelObjectiveId value.
     */
    public UUID usageBasedRecommendationServiceLevelObjectiveId() {
        return this.usageBasedRecommendationServiceLevelObjectiveId;
    }

    /**
     * Get the databaseSizeBasedRecommendationServiceLevelObjective value.
     *
     * @return the databaseSizeBasedRecommendationServiceLevelObjective value.
     */
    public String databaseSizeBasedRecommendationServiceLevelObjective() {
        return this.databaseSizeBasedRecommendationServiceLevelObjective;
    }

    /**
     * Get the databaseSizeBasedRecommendationServiceLevelObjectiveId value.
     *
     * @return the databaseSizeBasedRecommendationServiceLevelObjectiveId
     * value.
     */
    public UUID databaseSizeBasedRecommendationServiceLevelObjectiveId() {
        return this.databaseSizeBasedRecommendationServiceLevelObjectiveId;
    }

    /**
     * Get the disasterPlanBasedRecommendationServiceLevelObjective value.
     *
     * @return the disasterPlanBasedRecommendationServiceLevelObjective value.
     */
    public String disasterPlanBasedRecommendationServiceLevelObjective() {
        return this.disasterPlanBasedRecommendationServiceLevelObjective;
    }

    /**
     * Get the disasterPlanBasedRecommendationServiceLevelObjectiveId value.
     *
     * @return the disasterPlanBasedRecommendationServiceLevelObjectiveId
     * value.
     */
    public UUID disasterPlanBasedRecommendationServiceLevelObjectiveId() {
        return this.disasterPlanBasedRecommendationServiceLevelObjectiveId;
    }

    /**
     * Get the overallRecommendationServiceLevelObjective value.
     *
     * @return the overallRecommendationServiceLevelObjective value.
     */
    public String overallRecommendationServiceLevelObjective() {
        return this.overallRecommendationServiceLevelObjective;
    }

    /**
     * Get the overallRecommendationServiceLevelObjectiveId value.
     *
     * @return the overallRecommendationServiceLevelObjectiveId value.
     */
    public UUID overallRecommendationServiceLevelObjectiveId() {
        return this.overallRecommendationServiceLevelObjectiveId;
    }

    /**
     * Get the confidence value.
     *
     * @return the confidence value.
     */
    public double confidence() {
        return this.confidence;
    }
}
