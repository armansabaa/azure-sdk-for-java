/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Azure Automation Runbook notification receiver.
 */
public class AutomationRunbookReceiver {
    /**
     * The Azure automation account Id which holds this runbook and
     * authenticate to Azure resource.
     */
    @JsonProperty(value = "automationAccountId", required = true)
    private String automationAccountId;

    /**
     * The name for this runbook.
     */
    @JsonProperty(value = "runbookName", required = true)
    private String runbookName;

    /**
     * The resource id for webhook linked to this runbook.
     */
    @JsonProperty(value = "webhookResourceId", required = true)
    private String webhookResourceId;

    /**
     * Indicates whether this instance is global runbook.
     */
    @JsonProperty(value = "isGlobalRunbook", required = true)
    private boolean isGlobalRunbook;

    /**
     * Indicates name of the webhook.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The URI where webhooks should be sent.
     */
    @JsonProperty(value = "serviceUri")
    private String serviceUri;

    /**
     * Indicates whether to use common alert schema.
     */
    @JsonProperty(value = "useCommonAlertSchema", required = true)
    private boolean useCommonAlertSchema;

    /**
     * Get the Azure automation account Id which holds this runbook and authenticate to Azure resource.
     *
     * @return the automationAccountId value
     */
    public String automationAccountId() {
        return this.automationAccountId;
    }

    /**
     * Set the Azure automation account Id which holds this runbook and authenticate to Azure resource.
     *
     * @param automationAccountId the automationAccountId value to set
     * @return the AutomationRunbookReceiver object itself.
     */
    public AutomationRunbookReceiver withAutomationAccountId(String automationAccountId) {
        this.automationAccountId = automationAccountId;
        return this;
    }

    /**
     * Get the name for this runbook.
     *
     * @return the runbookName value
     */
    public String runbookName() {
        return this.runbookName;
    }

    /**
     * Set the name for this runbook.
     *
     * @param runbookName the runbookName value to set
     * @return the AutomationRunbookReceiver object itself.
     */
    public AutomationRunbookReceiver withRunbookName(String runbookName) {
        this.runbookName = runbookName;
        return this;
    }

    /**
     * Get the resource id for webhook linked to this runbook.
     *
     * @return the webhookResourceId value
     */
    public String webhookResourceId() {
        return this.webhookResourceId;
    }

    /**
     * Set the resource id for webhook linked to this runbook.
     *
     * @param webhookResourceId the webhookResourceId value to set
     * @return the AutomationRunbookReceiver object itself.
     */
    public AutomationRunbookReceiver withWebhookResourceId(String webhookResourceId) {
        this.webhookResourceId = webhookResourceId;
        return this;
    }

    /**
     * Get indicates whether this instance is global runbook.
     *
     * @return the isGlobalRunbook value
     */
    public boolean isGlobalRunbook() {
        return this.isGlobalRunbook;
    }

    /**
     * Set indicates whether this instance is global runbook.
     *
     * @param isGlobalRunbook the isGlobalRunbook value to set
     * @return the AutomationRunbookReceiver object itself.
     */
    public AutomationRunbookReceiver withIsGlobalRunbook(boolean isGlobalRunbook) {
        this.isGlobalRunbook = isGlobalRunbook;
        return this;
    }

    /**
     * Get indicates name of the webhook.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set indicates name of the webhook.
     *
     * @param name the name value to set
     * @return the AutomationRunbookReceiver object itself.
     */
    public AutomationRunbookReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the URI where webhooks should be sent.
     *
     * @return the serviceUri value
     */
    public String serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set the URI where webhooks should be sent.
     *
     * @param serviceUri the serviceUri value to set
     * @return the AutomationRunbookReceiver object itself.
     */
    public AutomationRunbookReceiver withServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get indicates whether to use common alert schema.
     *
     * @return the useCommonAlertSchema value
     */
    public boolean useCommonAlertSchema() {
        return this.useCommonAlertSchema;
    }

    /**
     * Set indicates whether to use common alert schema.
     *
     * @param useCommonAlertSchema the useCommonAlertSchema value to set
     * @return the AutomationRunbookReceiver object itself.
     */
    public AutomationRunbookReceiver withUseCommonAlertSchema(boolean useCommonAlertSchema) {
        this.useCommonAlertSchema = useCommonAlertSchema;
        return this;
    }

}