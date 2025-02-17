// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A site for the Webchat channel. */
@Fluent
public class WebChatSite {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebChatSite.class);

    /*
     * Site Id
     */
    @JsonProperty(value = "siteId", access = JsonProperty.Access.WRITE_ONLY)
    private String siteId;

    /*
     * Site name
     */
    @JsonProperty(value = "siteName", required = true)
    private String siteName;

    /*
     * Primary key. Value only returned through POST to the action Channel List
     * API, otherwise empty.
     */
    @JsonProperty(value = "key", access = JsonProperty.Access.WRITE_ONLY)
    private String key;

    /*
     * Secondary key. Value only returned through POST to the action Channel
     * List API, otherwise empty.
     */
    @JsonProperty(value = "key2", access = JsonProperty.Access.WRITE_ONLY)
    private String key2;

    /*
     * Whether this site is enabled for DirectLine channel
     */
    @JsonProperty(value = "isEnabled", required = true)
    private boolean isEnabled;

    /*
     * Whether this site is enabled for preview versions of Webchat
     */
    @JsonProperty(value = "isWebchatPreviewEnabled", required = true)
    private boolean isWebchatPreviewEnabled;

    /**
     * Get the siteId property: Site Id.
     *
     * @return the siteId value.
     */
    public String siteId() {
        return this.siteId;
    }

    /**
     * Get the siteName property: Site name.
     *
     * @return the siteName value.
     */
    public String siteName() {
        return this.siteName;
    }

    /**
     * Set the siteName property: Site name.
     *
     * @param siteName the siteName value to set.
     * @return the WebChatSite object itself.
     */
    public WebChatSite withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    /**
     * Get the key property: Primary key. Value only returned through POST to the action Channel List API, otherwise
     * empty.
     *
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Get the key2 property: Secondary key. Value only returned through POST to the action Channel List API, otherwise
     * empty.
     *
     * @return the key2 value.
     */
    public String key2() {
        return this.key2;
    }

    /**
     * Get the isEnabled property: Whether this site is enabled for DirectLine channel.
     *
     * @return the isEnabled value.
     */
    public boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Whether this site is enabled for DirectLine channel.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the WebChatSite object itself.
     */
    public WebChatSite withIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the isWebchatPreviewEnabled property: Whether this site is enabled for preview versions of Webchat.
     *
     * @return the isWebchatPreviewEnabled value.
     */
    public boolean isWebchatPreviewEnabled() {
        return this.isWebchatPreviewEnabled;
    }

    /**
     * Set the isWebchatPreviewEnabled property: Whether this site is enabled for preview versions of Webchat.
     *
     * @param isWebchatPreviewEnabled the isWebchatPreviewEnabled value to set.
     * @return the WebChatSite object itself.
     */
    public WebChatSite withIsWebchatPreviewEnabled(boolean isWebchatPreviewEnabled) {
        this.isWebchatPreviewEnabled = isWebchatPreviewEnabled;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (siteName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property siteName in model WebChatSite"));
        }
    }
}
