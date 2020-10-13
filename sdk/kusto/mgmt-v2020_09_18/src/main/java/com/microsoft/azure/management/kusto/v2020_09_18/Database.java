/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_09_18;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.kusto.v2020_09_18.implementation.DatabaseInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.kusto.v2020_09_18.implementation.KustoManager;

/**
 * Type representing Database.
 */
public interface Database extends HasInner<DatabaseInner>, Indexable, Refreshable<Database>, Updatable<Database.Update>, HasManager<KustoManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Database definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCluster, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Database definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Database definition.
         */
        interface Blank extends WithCluster {
        }

        /**
         * The stage of the database definition allowing to specify Cluster.
         */
        interface WithCluster {
           /**
            * Specifies resourceGroupName, clusterName.
            * @param resourceGroupName The name of the resource group containing the Kusto cluster
            * @param clusterName The name of the Kusto cluster
            * @return the next definition stage
            */
            WithCreate withExistingCluster(String resourceGroupName, String clusterName);
        }

        /**
         * The stage of the database definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Resource location
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Database>, DefinitionStages.WithLocation {
        }
    }
    /**
     * The template for a Database update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Database>, UpdateStages.WithLocation {
    }

    /**
     * Grouping of Database update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the database update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Resource location
             * @return the next update stage
             */
            Update withLocation(String location);
        }

    }
}