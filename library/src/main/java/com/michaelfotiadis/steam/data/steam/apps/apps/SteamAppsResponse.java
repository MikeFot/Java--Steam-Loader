package com.michaelfotiadis.steam.data.steam.apps.apps;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.steam.SteamApiModel;



/**
 * https://wiki.teamfortress.com/wiki/WebAPI/GetAppList
 */
public class SteamAppsResponse implements SteamApiModel {

    @SerializedName("applist")
    private final Apps apps;

    public SteamAppsResponse(final Apps apps) {
        this.apps = apps;
    }


    public Apps getApplist() {
        return apps;
    }
}