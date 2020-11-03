// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ServiceStatistics model. */
@Fluent
public final class ServiceStatistics {
    /*
     * Service level resource counters.
     */
    @JsonProperty(value = "counters", required = true)
    private ServiceCounters counters;

    /*
     * Service level general limits.
     */
    @JsonProperty(value = "limits", required = true)
    private ServiceLimits limits;

    /** Creates an instance of ServiceStatistics class. */
    @JsonCreator
    public ServiceStatistics(
            @JsonProperty(value = "counters") ServiceCounters counters,
            @JsonProperty(value = "limits") ServiceLimits limits) {
        this.counters = counters;
        this.limits = limits;
    }

    /**
     * Get the counters property: Service level resource counters.
     *
     * @return the counters value.
     */
    public ServiceCounters getCounters() {
        return this.counters;
    }

    /**
     * Set the counters property: Service level resource counters.
     *
     * @param counters the counters value to set.
     * @return the ServiceStatistics object itself.
     */
    /**
     * Get the limits property: Service level general limits.
     *
     * @return the limits value.
     */
    public ServiceLimits getLimits() {
        return this.limits;
    }

    /**
     * Set the limits property: Service level general limits.
     *
     * @param limits the limits value to set.
     * @return the ServiceStatistics object itself.
     */
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getCounters() == null) {
            throw new IllegalArgumentException("Missing required property counters in model ServiceStatistics");
        } else {
            getCounters().validate();
        }
        if (getLimits() == null) {
            throw new IllegalArgumentException("Missing required property limits in model ServiceStatistics");
        } else {
            getLimits().validate();
        }
    }
}