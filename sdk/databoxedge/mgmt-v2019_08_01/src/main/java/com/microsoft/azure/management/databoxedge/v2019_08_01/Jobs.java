/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import rx.Observable;
import com.microsoft.azure.management.databoxedge.v2019_08_01.implementation.JobsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Jobs.
 */
public interface Jobs extends HasInner<JobsInner> {
    /**
     * Gets the details of a specified job on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param name The job name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataBoxEdgeDeviceJob> getAsync(String deviceName, String name, String resourceGroupName);

}