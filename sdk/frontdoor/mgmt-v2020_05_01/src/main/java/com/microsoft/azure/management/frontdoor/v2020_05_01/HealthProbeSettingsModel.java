/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Load balancing settings for a backend pool.
 */
@JsonFlatten
public class HealthProbeSettingsModel extends SubResource {
    /**
     * The path to use for the health probe. Default is /.
     */
    @JsonProperty(value = "properties.path")
    private String path;

    /**
     * Protocol scheme to use for this probe. Possible values include: 'Http',
     * 'Https'.
     */
    @JsonProperty(value = "properties.protocol")
    private FrontDoorProtocol protocol;

    /**
     * The number of seconds between health probes.
     */
    @JsonProperty(value = "properties.intervalInSeconds")
    private Integer intervalInSeconds;

    /**
     * Configures which HTTP method to use to probe the backends defined under
     * backendPools. Possible values include: 'GET', 'HEAD'.
     */
    @JsonProperty(value = "properties.healthProbeMethod")
    private FrontDoorHealthProbeMethod healthProbeMethod;

    /**
     * Whether to enable health probes to be made against backends defined
     * under backendPools. Health probes can only be disabled if there is a
     * single enabled backend in single enabled backend pool. Possible values
     * include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.enabledState")
    private HealthProbeEnabled enabledState;

    /**
     * Resource status. Possible values include: 'Creating', 'Enabling',
     * 'Enabled', 'Disabling', 'Disabled', 'Deleting'.
     */
    @JsonProperty(value = "properties.resourceState")
    private FrontDoorResourceState resourceState;

    /**
     * Resource name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the path to use for the health probe. Default is /.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path to use for the health probe. Default is /.
     *
     * @param path the path value to set
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get protocol scheme to use for this probe. Possible values include: 'Http', 'Https'.
     *
     * @return the protocol value
     */
    public FrontDoorProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set protocol scheme to use for this probe. Possible values include: 'Http', 'Https'.
     *
     * @param protocol the protocol value to set
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withProtocol(FrontDoorProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the number of seconds between health probes.
     *
     * @return the intervalInSeconds value
     */
    public Integer intervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * Set the number of seconds between health probes.
     *
     * @param intervalInSeconds the intervalInSeconds value to set
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
        return this;
    }

    /**
     * Get configures which HTTP method to use to probe the backends defined under backendPools. Possible values include: 'GET', 'HEAD'.
     *
     * @return the healthProbeMethod value
     */
    public FrontDoorHealthProbeMethod healthProbeMethod() {
        return this.healthProbeMethod;
    }

    /**
     * Set configures which HTTP method to use to probe the backends defined under backendPools. Possible values include: 'GET', 'HEAD'.
     *
     * @param healthProbeMethod the healthProbeMethod value to set
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withHealthProbeMethod(FrontDoorHealthProbeMethod healthProbeMethod) {
        this.healthProbeMethod = healthProbeMethod;
        return this;
    }

    /**
     * Get whether to enable health probes to be made against backends defined under backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend pool. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the enabledState value
     */
    public HealthProbeEnabled enabledState() {
        return this.enabledState;
    }

    /**
     * Set whether to enable health probes to be made against backends defined under backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend pool. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param enabledState the enabledState value to set
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withEnabledState(HealthProbeEnabled enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Get resource status. Possible values include: 'Creating', 'Enabling', 'Enabled', 'Disabling', 'Disabled', 'Deleting'.
     *
     * @return the resourceState value
     */
    public FrontDoorResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Set resource status. Possible values include: 'Creating', 'Enabling', 'Enabled', 'Disabling', 'Disabled', 'Deleting'.
     *
     * @param resourceState the resourceState value to set
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withResourceState(FrontDoorResourceState resourceState) {
        this.resourceState = resourceState;
        return this;
    }

    /**
     * Get resource name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set resource name.
     *
     * @param name the name value to set
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}