// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.BookmarkRelationsClient;
import com.azure.resourcemanager.securityinsights.fluent.models.RelationInner;
import com.azure.resourcemanager.securityinsights.models.BookmarkRelations;
import com.azure.resourcemanager.securityinsights.models.Relation;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class BookmarkRelationsImpl implements BookmarkRelations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BookmarkRelationsImpl.class);

    private final BookmarkRelationsClient innerClient;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    public BookmarkRelationsImpl(
        BookmarkRelationsClient innerClient,
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Relation> list(String resourceGroupName, String workspaceName, String bookmarkId) {
        PagedIterable<RelationInner> inner = this.serviceClient().list(resourceGroupName, workspaceName, bookmarkId);
        return Utils.mapPage(inner, inner1 -> new RelationImpl(inner1, this.manager()));
    }

    public PagedIterable<Relation> list(
        String resourceGroupName,
        String workspaceName,
        String bookmarkId,
        String filter,
        String orderby,
        Integer top,
        String skipToken,
        Context context) {
        PagedIterable<RelationInner> inner =
            this
                .serviceClient()
                .list(resourceGroupName, workspaceName, bookmarkId, filter, orderby, top, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new RelationImpl(inner1, this.manager()));
    }

    public Relation get(String resourceGroupName, String workspaceName, String bookmarkId, String relationName) {
        RelationInner inner = this.serviceClient().get(resourceGroupName, workspaceName, bookmarkId, relationName);
        if (inner != null) {
            return new RelationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Relation> getWithResponse(
        String resourceGroupName, String workspaceName, String bookmarkId, String relationName, Context context) {
        Response<RelationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, bookmarkId, relationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RelationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String workspaceName, String bookmarkId, String relationName) {
        this.serviceClient().delete(resourceGroupName, workspaceName, bookmarkId, relationName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String bookmarkId, String relationName, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, workspaceName, bookmarkId, relationName, context);
    }

    public Relation getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String bookmarkId = Utils.getValueFromIdByName(id, "bookmarks");
        if (bookmarkId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'bookmarks'.", id)));
        }
        String relationName = Utils.getValueFromIdByName(id, "relations");
        if (relationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'relations'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, workspaceName, bookmarkId, relationName, Context.NONE)
            .getValue();
    }

    public Response<Relation> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String bookmarkId = Utils.getValueFromIdByName(id, "bookmarks");
        if (bookmarkId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'bookmarks'.", id)));
        }
        String relationName = Utils.getValueFromIdByName(id, "relations");
        if (relationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'relations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, bookmarkId, relationName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String bookmarkId = Utils.getValueFromIdByName(id, "bookmarks");
        if (bookmarkId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'bookmarks'.", id)));
        }
        String relationName = Utils.getValueFromIdByName(id, "relations");
        if (relationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'relations'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, workspaceName, bookmarkId, relationName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String bookmarkId = Utils.getValueFromIdByName(id, "bookmarks");
        if (bookmarkId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'bookmarks'.", id)));
        }
        String relationName = Utils.getValueFromIdByName(id, "relations");
        if (relationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'relations'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, workspaceName, bookmarkId, relationName, context);
    }

    private BookmarkRelationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }

    public RelationImpl define(String name) {
        return new RelationImpl(name, this.manager());
    }
}
