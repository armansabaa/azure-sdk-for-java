/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.communication.v2020_08_20_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AggregationType.
 */
public final class AggregationType extends ExpandableStringEnum<AggregationType> {
    /** Static value Average for AggregationType. */
    public static final AggregationType AVERAGE = fromString("Average");

    /** Static value Minimum for AggregationType. */
    public static final AggregationType MINIMUM = fromString("Minimum");

    /** Static value Maximum for AggregationType. */
    public static final AggregationType MAXIMUM = fromString("Maximum");

    /** Static value Total for AggregationType. */
    public static final AggregationType TOTAL = fromString("Total");

    /** Static value Count for AggregationType. */
    public static final AggregationType COUNT = fromString("Count");

    /**
     * Creates or finds a AggregationType from its string representation.
     * @param name a name to look for
     * @return the corresponding AggregationType
     */
    @JsonCreator
    public static AggregationType fromString(String name) {
        return fromString(name, AggregationType.class);
    }

    /**
     * @return known AggregationType values
     */
    public static Collection<AggregationType> values() {
        return values(AggregationType.class);
    }
}