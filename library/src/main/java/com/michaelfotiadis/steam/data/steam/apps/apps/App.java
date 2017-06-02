package com.michaelfotiadis.steam.data.steam.apps.apps;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.player.SteamApiModel;



/**
 * A list of objects containing the title and app ID of each program available in the store.
 * https://wiki.teamfortress.com/wiki/WebAPI/GetAppList
 */
public class App implements SteamApiModel {

    @SerializedName("appid")
    private final Integer appId;
    @SerializedName("name")
    private final String name;

    public App(final Integer appid, final String name) {
        this.appId = appid;
        this.name = name;
    }

    /**
     * @return An integer containing the program's ID.
     */

    public Integer getId() {
        return appId;
    }

    /**
     * @return A string containing the program's publicly facing title.
     */

    public String getName() {
        return name;
    }
}