package com.michaelfotiadis.steam.data.steam.apps.apps;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Nonnull;

/**
 * See: https://wiki.teamfortress.com/wiki/WebAPI/GetAppList
 */
public class Apps {

    @SerializedName("apps")
    private final List<App> apps;


    public Apps(final List<App> apps) {
        this.apps = apps;
    }

    /**
     * @return A list of objects containing the title and app ID of each program available in the store.
     */
    @Nonnull
    public List<App> getApps() {
        return apps;
    }
}