package com.michaelfotiadis.steam.data.steam.apps.apps;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Nonnull;

/**
 * https://wiki.teamfortress.com/wiki/WebAPI/GetAppList
 */
public class SteamAppsResponse {

    @SerializedName("applist")
    private final Apps apps;

    public SteamAppsResponse(final Apps apps) {
        this.apps = apps;
    }

    @Nonnull
    public Apps getApplist() {
        return apps;
    }
}