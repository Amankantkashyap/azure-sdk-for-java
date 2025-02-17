// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Twilio linked service type properties. */
@Fluent
public final class TwilioLinkedServiceTypeProperties {
    /*
     * The Account SID of Twilio service.
     */
    @JsonProperty(value = "userName", required = true)
    private Object username;

    /*
     * The auth token of Twilio service.
     */
    @JsonProperty(value = "password", required = true)
    private SecretBase password;

    /**
     * Get the username property: The Account SID of Twilio service.
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: The Account SID of Twilio service.
     *
     * @param username the username value to set.
     * @return the TwilioLinkedServiceTypeProperties object itself.
     */
    public TwilioLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The auth token of Twilio service.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: The auth token of Twilio service.
     *
     * @param password the password value to set.
     * @return the TwilioLinkedServiceTypeProperties object itself.
     */
    public TwilioLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (username() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property username in model TwilioLinkedServiceTypeProperties"));
        }
        if (password() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property password in model TwilioLinkedServiceTypeProperties"));
        } else {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TwilioLinkedServiceTypeProperties.class);
}
