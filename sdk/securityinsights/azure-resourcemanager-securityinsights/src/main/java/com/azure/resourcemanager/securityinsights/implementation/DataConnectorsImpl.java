// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.DataConnectorsClient;
import com.azure.resourcemanager.securityinsights.fluent.models.DataConnectorInner;
import com.azure.resourcemanager.securityinsights.models.DataConnector;
import com.azure.resourcemanager.securityinsights.models.DataConnectorConnectBody;
import com.azure.resourcemanager.securityinsights.models.DataConnectors;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DataConnectorsImpl implements DataConnectors {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataConnectorsImpl.class);

    private final DataConnectorsClient innerClient;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    public DataConnectorsImpl(
        DataConnectorsClient innerClient,
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DataConnector> list(String resourceGroupName, String workspaceName) {
        PagedIterable<DataConnectorInner> inner = this.serviceClient().list(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new DataConnectorImpl(inner1, this.manager()));
    }

    public PagedIterable<DataConnector> list(String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<DataConnectorInner> inner = this.serviceClient().list(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new DataConnectorImpl(inner1, this.manager()));
    }

    public DataConnector get(String resourceGroupName, String workspaceName, String dataConnectorId) {
        DataConnectorInner inner = this.serviceClient().get(resourceGroupName, workspaceName, dataConnectorId);
        if (inner != null) {
            return new DataConnectorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataConnector> getWithResponse(
        String resourceGroupName, String workspaceName, String dataConnectorId, Context context) {
        Response<DataConnectorInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, dataConnectorId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataConnectorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DataConnector createOrUpdate(
        String resourceGroupName, String workspaceName, String dataConnectorId, DataConnectorInner dataConnector) {
        DataConnectorInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, workspaceName, dataConnectorId, dataConnector);
        if (inner != null) {
            return new DataConnectorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataConnector> createOrUpdateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String dataConnectorId,
        DataConnectorInner dataConnector,
        Context context) {
        Response<DataConnectorInner> inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, dataConnectorId, dataConnector, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataConnectorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String workspaceName, String dataConnectorId) {
        this.serviceClient().delete(resourceGroupName, workspaceName, dataConnectorId);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String dataConnectorId, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, workspaceName, dataConnectorId, context);
    }

    public void connect(
        String resourceGroupName, String workspaceName, String dataConnectorId, DataConnectorConnectBody connectBody) {
        this.serviceClient().connect(resourceGroupName, workspaceName, dataConnectorId, connectBody);
    }

    public Response<Void> connectWithResponse(
        String resourceGroupName,
        String workspaceName,
        String dataConnectorId,
        DataConnectorConnectBody connectBody,
        Context context) {
        return this
            .serviceClient()
            .connectWithResponse(resourceGroupName, workspaceName, dataConnectorId, connectBody, context);
    }

    public void disconnect(String resourceGroupName, String workspaceName, String dataConnectorId) {
        this.serviceClient().disconnect(resourceGroupName, workspaceName, dataConnectorId);
    }

    public Response<Void> disconnectWithResponse(
        String resourceGroupName, String workspaceName, String dataConnectorId, Context context) {
        return this.serviceClient().disconnectWithResponse(resourceGroupName, workspaceName, dataConnectorId, context);
    }

    private DataConnectorsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }
}
