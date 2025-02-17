// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ies for the solution content item. */
@Fluent
public final class MetadataCategories {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetadataCategories.class);

    /*
     * domain for the solution content item
     */
    @JsonProperty(value = "domains")
    private List<String> domains;

    /*
     * Industry verticals for the solution content item
     */
    @JsonProperty(value = "verticals")
    private List<String> verticals;

    /**
     * Get the domains property: domain for the solution content item.
     *
     * @return the domains value.
     */
    public List<String> domains() {
        return this.domains;
    }

    /**
     * Set the domains property: domain for the solution content item.
     *
     * @param domains the domains value to set.
     * @return the MetadataCategories object itself.
     */
    public MetadataCategories withDomains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    /**
     * Get the verticals property: Industry verticals for the solution content item.
     *
     * @return the verticals value.
     */
    public List<String> verticals() {
        return this.verticals;
    }

    /**
     * Set the verticals property: Industry verticals for the solution content item.
     *
     * @param verticals the verticals value to set.
     * @return the MetadataCategories object itself.
     */
    public MetadataCategories withVerticals(List<String> verticals) {
        this.verticals = verticals;
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
