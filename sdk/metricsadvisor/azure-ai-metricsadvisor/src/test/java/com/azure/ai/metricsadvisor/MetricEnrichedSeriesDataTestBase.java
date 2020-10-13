// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.metricsadvisor;

import com.azure.ai.metricsadvisor.models.DimensionKey;
import com.azure.ai.metricsadvisor.models.MetricEnrichedSeriesData;
import com.azure.ai.metricsadvisor.models.MetricsAdvisorServiceVersion;
import com.azure.core.http.HttpClient;
import org.junit.jupiter.api.Assertions;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class MetricEnrichedSeriesDataTestBase extends MetricsAdvisorClientTestBase {
    public abstract void getEnrichedSeriesData(HttpClient httpClient, MetricsAdvisorServiceVersion serviceVersion);

    // Pre-configured test resource.
    protected static class GetEnrichedSeriesDataInput {
        static final GetEnrichedSeriesDataInput INSTANCE = new GetEnrichedSeriesDataInput();
        final DimensionKey seriesKey = new DimensionKey()
            .put("Dim1", "Common Lime")
            .put("Dim2", "Antelope");
        final String detectionConfigurationId = "e87d899d-a5a0-4259-b752-11aea34d5e34";
        final OffsetDateTime startTime = OffsetDateTime.parse("2020-08-12T00:00:00Z");
        final OffsetDateTime endTime = OffsetDateTime.parse("2020-09-12T00:00:00Z");

        List<DimensionKey> getSeriesKeys() {
            final List<DimensionKey> seriesKeys = new ArrayList<DimensionKey>();
            seriesKeys.add(this.seriesKey);
            return seriesKeys;
        }
    }

    protected void assertGetEnrichedSeriesDataOutput(MetricEnrichedSeriesData enrichedSeriesData) {
        Assertions.assertNotNull(enrichedSeriesData);
        DimensionKey enrichedSeriesKey = enrichedSeriesData.getSeriesKey();
        Assertions.assertNotNull(enrichedSeriesKey);
        Assertions.assertTrue(GetEnrichedSeriesDataInput.INSTANCE.seriesKey.equals(enrichedSeriesKey));
        // Fixed test data has exactly 27 data points in the time range.
        List<OffsetDateTime> timestamps = enrichedSeriesData.getTimestampList();
        Assertions.assertEquals(27, timestamps.size());
        // Ensure the received data points are in requested range.
        for (OffsetDateTime timestamp : timestamps) {
            Assertions.assertNotNull(timestamp);
            boolean isInRange = (timestamp.isEqual(GetEnrichedSeriesDataInput.INSTANCE.startTime)
                || timestamp.isAfter(GetEnrichedSeriesDataInput.INSTANCE.startTime))
                && (timestamp.isEqual(GetEnrichedSeriesDataInput.INSTANCE.endTime)
                || timestamp.isBefore(GetEnrichedSeriesDataInput.INSTANCE.endTime));
            Assertions.assertTrue(isInRange);
        }
    }
}