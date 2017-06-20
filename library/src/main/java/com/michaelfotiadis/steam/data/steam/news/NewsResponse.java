package com.michaelfotiadis.steam.data.steam.news;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.steam.SteamApiModel;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetNewsForApp">Wiki</a>
 */
public class NewsResponse implements SteamApiModel {

    @SerializedName("appnews")
    private final AppNews appNews;

    public NewsResponse(final AppNews appNews) {
        this.appNews = appNews;
    }

    public AppNews getAppNews() {
        return appNews;
    }
}