package com.michaelfotiadis.steam.data.player.api;


import com.google.gson.annotations.SerializedName;

public class GameImpl implements Game {

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

    public GameImpl(final Long appId, final String name, final Integer playtimeForever, final String imgIconUrl, final String imgLogoUrl, final Boolean hasCommunityVisibleStats, final Integer playtimeTwoWeeks) {
        this.appId = appId;
        this.name = name;
        this.playtimeForever = playtimeForever;
        this.imgIconUrl = imgIconUrl;
        this.imgLogoUrl = imgLogoUrl;
        this.hasCommunityVisibleStats = hasCommunityVisibleStats;
        this.playtimeTwoWeeks = playtimeTwoWeeks;
    }

    @Override
    public Long getAppId() {
        return this.appId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getPlaytimeForever() {
        return playtimeForever;
    }

    @Override
    public String getImgIconUrl() {
        return imgIconUrl;
    }

    @Override
    public String getImgLogoUrl() {
        return imgLogoUrl;
    }

    @Override
    public Boolean getHasCommunityVisibleStats() {
        return hasCommunityVisibleStats;
    }

    @Override
    public Integer getPlaytimeTwoWeeks() {
        return playtimeTwoWeeks;
    }

}