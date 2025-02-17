// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Channel definition. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "channelName",
    defaultImpl = Channel.class)
@JsonTypeName("Channel")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AlexaChannel", value = AlexaChannel.class),
    @JsonSubTypes.Type(name = "FacebookChannel", value = FacebookChannel.class),
    @JsonSubTypes.Type(name = "EmailChannel", value = EmailChannel.class),
    @JsonSubTypes.Type(name = "MsTeamsChannel", value = MsTeamsChannel.class),
    @JsonSubTypes.Type(name = "SkypeChannel", value = SkypeChannel.class),
    @JsonSubTypes.Type(name = "KikChannel", value = KikChannel.class),
    @JsonSubTypes.Type(name = "WebChatChannel", value = WebChatChannel.class),
    @JsonSubTypes.Type(name = "DirectLineChannel", value = DirectLineChannel.class),
    @JsonSubTypes.Type(name = "TelegramChannel", value = TelegramChannel.class),
    @JsonSubTypes.Type(name = "SmsChannel", value = SmsChannel.class),
    @JsonSubTypes.Type(name = "SlackChannel", value = SlackChannel.class),
    @JsonSubTypes.Type(name = "LineChannel", value = LineChannel.class),
    @JsonSubTypes.Type(name = "DirectLineSpeechChannel", value = DirectLineSpeechChannel.class)
})
@Fluent
public class Channel {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Channel.class);

    /*
     * Entity Tag of the resource
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Provisioning state of the resource
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Specifies the location of the resource.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the etag property: Entity Tag of the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Entity Tag of the resource.
     *
     * @param etag the etag value to set.
     * @return the Channel object itself.
     */
    public Channel withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the location property: Specifies the location of the resource.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Specifies the location of the resource.
     *
     * @param location the location value to set.
     * @return the Channel object itself.
     */
    public Channel withLocation(String location) {
        this.location = location;
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
