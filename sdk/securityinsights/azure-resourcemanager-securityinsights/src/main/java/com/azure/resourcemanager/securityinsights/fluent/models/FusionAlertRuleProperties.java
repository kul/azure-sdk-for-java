// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.AlertSeverity;
import com.azure.resourcemanager.securityinsights.models.AttackTactic;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Fusion alert rule base property bag. */
@Fluent
public final class FusionAlertRuleProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FusionAlertRuleProperties.class);

    /*
     * The Name of the alert rule template used to create this rule.
     */
    @JsonProperty(value = "alertRuleTemplateName", required = true)
    private String alertRuleTemplateName;

    /*
     * The description of the alert rule.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * The display name for alerts created by this alert rule.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * Determines whether this alert rule is enabled or disabled.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * The last time that this alert has been modified.
     */
    @JsonProperty(value = "lastModifiedUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedUtc;

    /*
     * The severity for alerts created by this alert rule.
     */
    @JsonProperty(value = "severity", access = JsonProperty.Access.WRITE_ONLY)
    private AlertSeverity severity;

    /*
     * The tactics of the alert rule
     */
    @JsonProperty(value = "tactics", access = JsonProperty.Access.WRITE_ONLY)
    private List<AttackTactic> tactics;

    /**
     * Get the alertRuleTemplateName property: The Name of the alert rule template used to create this rule.
     *
     * @return the alertRuleTemplateName value.
     */
    public String alertRuleTemplateName() {
        return this.alertRuleTemplateName;
    }

    /**
     * Set the alertRuleTemplateName property: The Name of the alert rule template used to create this rule.
     *
     * @param alertRuleTemplateName the alertRuleTemplateName value to set.
     * @return the FusionAlertRuleProperties object itself.
     */
    public FusionAlertRuleProperties withAlertRuleTemplateName(String alertRuleTemplateName) {
        this.alertRuleTemplateName = alertRuleTemplateName;
        return this;
    }

    /**
     * Get the description property: The description of the alert rule.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the displayName property: The display name for alerts created by this alert rule.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the enabled property: Determines whether this alert rule is enabled or disabled.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Determines whether this alert rule is enabled or disabled.
     *
     * @param enabled the enabled value to set.
     * @return the FusionAlertRuleProperties object itself.
     */
    public FusionAlertRuleProperties withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the lastModifiedUtc property: The last time that this alert has been modified.
     *
     * @return the lastModifiedUtc value.
     */
    public OffsetDateTime lastModifiedUtc() {
        return this.lastModifiedUtc;
    }

    /**
     * Get the severity property: The severity for alerts created by this alert rule.
     *
     * @return the severity value.
     */
    public AlertSeverity severity() {
        return this.severity;
    }

    /**
     * Get the tactics property: The tactics of the alert rule.
     *
     * @return the tactics value.
     */
    public List<AttackTactic> tactics() {
        return this.tactics;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (alertRuleTemplateName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property alertRuleTemplateName in model FusionAlertRuleProperties"));
        }
    }
}
