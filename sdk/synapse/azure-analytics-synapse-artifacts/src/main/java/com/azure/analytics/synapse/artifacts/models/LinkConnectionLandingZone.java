// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LinkConnectionLandingZone model. */
@Fluent
public final class LinkConnectionLandingZone {
    /*
     * Linked service reference
     */
    @JsonProperty(value = "linkedService")
    private LinkedServiceReference linkedService;

    /*
     * Landing zone's file system name
     */
    @JsonProperty(value = "fileSystem")
    private String fileSystem;

    /*
     * Landing zone's folder path name
     */
    @JsonProperty(value = "folderPath")
    private String folderPath;

    /*
     * Landing zone's sas token
     */
    @JsonProperty(value = "sasToken")
    private SecureString sasToken;

    /**
     * Get the linkedService property: Linked service reference.
     *
     * @return the linkedService value.
     */
    public LinkedServiceReference getLinkedService() {
        return this.linkedService;
    }

    /**
     * Set the linkedService property: Linked service reference.
     *
     * @param linkedService the linkedService value to set.
     * @return the LinkConnectionLandingZone object itself.
     */
    public LinkConnectionLandingZone setLinkedService(LinkedServiceReference linkedService) {
        this.linkedService = linkedService;
        return this;
    }

    /**
     * Get the fileSystem property: Landing zone's file system name.
     *
     * @return the fileSystem value.
     */
    public String getFileSystem() {
        return this.fileSystem;
    }

    /**
     * Set the fileSystem property: Landing zone's file system name.
     *
     * @param fileSystem the fileSystem value to set.
     * @return the LinkConnectionLandingZone object itself.
     */
    public LinkConnectionLandingZone setFileSystem(String fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }

    /**
     * Get the folderPath property: Landing zone's folder path name.
     *
     * @return the folderPath value.
     */
    public String getFolderPath() {
        return this.folderPath;
    }

    /**
     * Set the folderPath property: Landing zone's folder path name.
     *
     * @param folderPath the folderPath value to set.
     * @return the LinkConnectionLandingZone object itself.
     */
    public LinkConnectionLandingZone setFolderPath(String folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the sasToken property: Landing zone's sas token.
     *
     * @return the sasToken value.
     */
    public SecureString getSasToken() {
        return this.sasToken;
    }

    /**
     * Set the sasToken property: Landing zone's sas token.
     *
     * @param sasToken the sasToken value to set.
     * @return the LinkConnectionLandingZone object itself.
     */
    public LinkConnectionLandingZone setSasToken(SecureString sasToken) {
        this.sasToken = sasToken;
        return this;
    }
}
