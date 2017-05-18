package com.michaelfotiadis.steam.data.steam.news;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.player.SteamApiModel;

import java.util.List;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetNewsForApp">Wiki</a>
 */
public class AppNews implements SteamApiModel {


    @SerializedName("appid")
    private final Integer appId;
    @SerializedName("newsitems")
    private final List<NewsItem> newsItems;
    @SerializedName("count")
    private final Integer count;

    public AppNews(final Integer appId, final List<NewsItem> newsItems, final Integer count) {
        this.appId = appId;
        this.newsItems = newsItems;
        this.count = count;
    }

    /**
     * @return The appid of the item news is fetched for.
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * @return A list of objects describing each news item.
     */
    public List<NewsItem> getNewsItems() {
        return newsItems;
    }

    /**
     * @return Number of items returned.
     */
    public Integer getCount() {
        return count;
    }
}