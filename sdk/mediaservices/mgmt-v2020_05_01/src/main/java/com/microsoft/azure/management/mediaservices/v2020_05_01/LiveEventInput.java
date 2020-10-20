/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The live event input.
 */
public class LiveEventInput {
    /**
     * The input protocol for the live event. This is specified at creation
     * time and cannot be updated. Possible values include: 'FragmentedMP4',
     * 'RTMP'.
     */
    @JsonProperty(value = "streamingProtocol", required = true)
    private LiveEventInputProtocol streamingProtocol;

    /**
     * Access control for live event input.
     */
    @JsonProperty(value = "accessControl")
    private LiveEventInputAccessControl accessControl;

    /**
     * ISO 8601 time duration of the key frame interval duration of the input.
     * This value sets the EXT-X-TARGETDURATION property in the HLS output. For
     * example, use PT2S to indicate 2 seconds. Leave the value empty for
     * encoding live events.
     */
    @JsonProperty(value = "keyFrameIntervalDuration")
    private String keyFrameIntervalDuration;

    /**
     * A UUID in string form to uniquely identify the stream. This can be
     * specified at creation time but cannot be updated. If omitted, the
     * service will generate a unique value.
     */
    @JsonProperty(value = "accessToken")
    private String accessToken;

    /**
     * The input endpoints for the live event.
     */
    @JsonProperty(value = "endpoints")
    private List<LiveEventEndpoint> endpoints;

    /**
     * Get the input protocol for the live event. This is specified at creation time and cannot be updated. Possible values include: 'FragmentedMP4', 'RTMP'.
     *
     * @return the streamingProtocol value
     */
    public LiveEventInputProtocol streamingProtocol() {
        return this.streamingProtocol;
    }

    /**
     * Set the input protocol for the live event. This is specified at creation time and cannot be updated. Possible values include: 'FragmentedMP4', 'RTMP'.
     *
     * @param streamingProtocol the streamingProtocol value to set
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withStreamingProtocol(LiveEventInputProtocol streamingProtocol) {
        this.streamingProtocol = streamingProtocol;
        return this;
    }

    /**
     * Get access control for live event input.
     *
     * @return the accessControl value
     */
    public LiveEventInputAccessControl accessControl() {
        return this.accessControl;
    }

    /**
     * Set access control for live event input.
     *
     * @param accessControl the accessControl value to set
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withAccessControl(LiveEventInputAccessControl accessControl) {
        this.accessControl = accessControl;
        return this;
    }

    /**
     * Get iSO 8601 time duration of the key frame interval duration of the input. This value sets the EXT-X-TARGETDURATION property in the HLS output. For example, use PT2S to indicate 2 seconds. Leave the value empty for encoding live events.
     *
     * @return the keyFrameIntervalDuration value
     */
    public String keyFrameIntervalDuration() {
        return this.keyFrameIntervalDuration;
    }

    /**
     * Set iSO 8601 time duration of the key frame interval duration of the input. This value sets the EXT-X-TARGETDURATION property in the HLS output. For example, use PT2S to indicate 2 seconds. Leave the value empty for encoding live events.
     *
     * @param keyFrameIntervalDuration the keyFrameIntervalDuration value to set
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withKeyFrameIntervalDuration(String keyFrameIntervalDuration) {
        this.keyFrameIntervalDuration = keyFrameIntervalDuration;
        return this;
    }

    /**
     * Get a UUID in string form to uniquely identify the stream. This can be specified at creation time but cannot be updated. If omitted, the service will generate a unique value.
     *
     * @return the accessToken value
     */
    public String accessToken() {
        return this.accessToken;
    }

    /**
     * Set a UUID in string form to uniquely identify the stream. This can be specified at creation time but cannot be updated. If omitted, the service will generate a unique value.
     *
     * @param accessToken the accessToken value to set
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the input endpoints for the live event.
     *
     * @return the endpoints value
     */
    public List<LiveEventEndpoint> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the input endpoints for the live event.
     *
     * @param endpoints the endpoints value to set
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withEndpoints(List<LiveEventEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

}