// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.TICheckRequirementsProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Threat Intelligence Platforms data connector check requirements. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("ThreatIntelligence")
@Fluent
public final class TICheckRequirements extends DataConnectorsCheckRequirements {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TICheckRequirements.class);

    /*
     * Threat Intelligence Platforms data connector check required properties
     */
    @JsonProperty(value = "properties")
    private TICheckRequirementsProperties innerProperties;

    /**
     * Get the innerProperties property: Threat Intelligence Platforms data connector check required properties.
     *
     * @return the innerProperties value.
     */
    private TICheckRequirementsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
