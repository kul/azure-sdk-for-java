// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.EntityCommonProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CloudApplication entity property bag. */
@Immutable
public final class CloudApplicationEntityProperties extends EntityCommonProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CloudApplicationEntityProperties.class);

    /*
     * The technical identifier of the application.
     */
    @JsonProperty(value = "appId", access = JsonProperty.Access.WRITE_ONLY)
    private Integer appId;

    /*
     * The name of the related cloud application.
     */
    @JsonProperty(value = "appName", access = JsonProperty.Access.WRITE_ONLY)
    private String appName;

    /*
     * The user defined instance name of the cloud application. It is often
     * used to distinguish between several applications of the same type that a
     * customer has.
     */
    @JsonProperty(value = "instanceName", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceName;

    /**
     * Get the appId property: The technical identifier of the application.
     *
     * @return the appId value.
     */
    public Integer appId() {
        return this.appId;
    }

    /**
     * Get the appName property: The name of the related cloud application.
     *
     * @return the appName value.
     */
    public String appName() {
        return this.appName;
    }

    /**
     * Get the instanceName property: The user defined instance name of the cloud application. It is often used to
     * distinguish between several applications of the same type that a customer has.
     *
     * @return the instanceName value.
     */
    public String instanceName() {
        return this.instanceName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
