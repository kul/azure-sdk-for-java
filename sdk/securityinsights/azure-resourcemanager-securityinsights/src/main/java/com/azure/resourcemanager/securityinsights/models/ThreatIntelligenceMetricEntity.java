// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes threat intelligence metric entity. */
@Fluent
public final class ThreatIntelligenceMetricEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ThreatIntelligenceMetricEntity.class);

    /*
     * Metric name
     */
    @JsonProperty(value = "metricName")
    private String metricName;

    /*
     * Metric value
     */
    @JsonProperty(value = "metricValue")
    private Integer metricValue;

    /**
     * Get the metricName property: Metric name.
     *
     * @return the metricName value.
     */
    public String metricName() {
        return this.metricName;
    }

    /**
     * Set the metricName property: Metric name.
     *
     * @param metricName the metricName value to set.
     * @return the ThreatIntelligenceMetricEntity object itself.
     */
    public ThreatIntelligenceMetricEntity withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * Get the metricValue property: Metric value.
     *
     * @return the metricValue value.
     */
    public Integer metricValue() {
        return this.metricValue;
    }

    /**
     * Set the metricValue property: Metric value.
     *
     * @param metricValue the metricValue value to set.
     * @return the ThreatIntelligenceMetricEntity object itself.
     */
    public ThreatIntelligenceMetricEntity withMetricValue(Integer metricValue) {
        this.metricValue = metricValue;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
