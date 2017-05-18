package com.michaelfotiadis.steam.data.player.model;


import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.player.SteamApiModel;

public class Game implements SteamApiModel {

    @SerializedName("appid")
    private final Long appId;
    @SerializedName("name")
    private final String name;
    @SerializedName("playtime_forever")
    private final Integer playtimeForever;
    @SerializedName("img_icon_url")
    private final String imgIconUrl;
    @SerializedName("img_logo_url")
    private final String imgLogoUrl;
    @SerializedName("has_community_visible_stats")
    private final Boolean hasCommunityVisibleStats;
    @SerializedName("playtime_2weeks")
    private final Integer playtimeTwoWeeks;

    public Game(final Long appId, final String name, final Integer playtimeForever, final String imgIconUrl, final String imgLogoUrl, final Boolean hasCommunityVisibleStats, final Integer playtimeTwoWeeks) {
        this.appId = appId;
        this.name = name;
        this.playtimeForever = playtimeForever;
        this.imgIconUrl = imgIconUrl;
        this.imgLogoUrl = imgLogoUrl;
        this.hasCommunityVisibleStats = hasCommunityVisibleStats;
        this.playtimeTwoWeeks = playtimeTwoWeeks;
    }

    public Long getAppId() {
        return this.appId;
    }

    public String getName() {
        return name;
    }

    public Integer getPlaytimeForever() {
        return playtimeForever;
    }

    public String getImgIconUrl() {
        return imgIconUrl;
    }

    public String getImgLogoUrl() {
        return imgLogoUrl;
    }

    public Boolean getHasCommunityVisibleStats() {
        return hasCommunityVisibleStats;
    }

    public Integer getPlaytimeTwoWeeks() {
        return playtimeTwoWeeks;
    }

}