package com.michaelfotiadis.steam.data.steam.apps.apps;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.player.SteamApiModel;

import java.util.List;


/**
 * See: https://wiki.teamfortress.com/wiki/WebAPI/GetAppList
 */
public class Apps implements SteamApiModel {

    @SerializedName("apps")
    private final List<App> apps;


    public Apps(final List<App> apps) {
        this.apps = apps;
    }

    /**
     * @return A list of objects containing the title and app ID of each program available in the store.
     */

    public List<App> getApps() {
        return apps;
    }
}