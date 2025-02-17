// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The PermissionsResourceProviderItem model. */
@Fluent
public final class PermissionsResourceProviderItem extends ResourceProvider {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PermissionsResourceProviderItem.class);

    /** {@inheritDoc} */
    @Override
    public PermissionsResourceProviderItem withProvider(ProviderName provider) {
        super.withProvider(provider);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PermissionsResourceProviderItem withPermissionsDisplayText(String permissionsDisplayText) {
        super.withPermissionsDisplayText(permissionsDisplayText);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PermissionsResourceProviderItem withProviderDisplayName(String providerDisplayName) {
        super.withProviderDisplayName(providerDisplayName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PermissionsResourceProviderItem withScope(PermissionProviderScope scope) {
        super.withScope(scope);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PermissionsResourceProviderItem withRequiredPermissions(RequiredPermissions requiredPermissions) {
        super.withRequiredPermissions(requiredPermissions);
        return this;
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
