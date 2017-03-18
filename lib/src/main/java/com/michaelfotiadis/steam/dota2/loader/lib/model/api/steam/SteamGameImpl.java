package com.michaelfotiadis.steam.dota2.loader.lib.model.api.steam;


import com.google.gson.annotations.SerializedName;

public class SteamGameImpl implements SteamGame {

    @SerializedName("appid")
    private final Long mAppId;
    @SerializedName("name")
    private final String mName;
    @SerializedName("playtime_forever")
    private final Integer mPlaytimeForever;
    @SerializedName("img_icon_url")
    private final String mImgIconUrl;
    @SerializedName("img_logo_url")
    private final String mImgLogoUrl;
    @SerializedName("has_community_visible_stats")
    private final Boolean mHasCommunityVisibleStats;
    @SerializedName("playtime_2weeks")
    private final Integer mPlaytimeTwoWeeks;

    public SteamGameImpl(final Long appId, final String name, final Integer playtimeForever, final String imgIconUrl, final String imgLogoUrl, final Boolean hasCommunityVisibleStats, final Integer playtimeTwoWeeks) {
        mAppId = appId;
        mName = name;
        mPlaytimeForever = playtimeForever;
        mImgIconUrl = imgIconUrl;
        mImgLogoUrl = imgLogoUrl;
        mHasCommunityVisibleStats = hasCommunityVisibleStats;
        mPlaytimeTwoWeeks = playtimeTwoWeeks;
    }

    @Override
    public Long getAppId() {
        return mAppId;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public Integer getPlaytimeForever() {
        return mPlaytimeForever;
    }

    @Override
    public String getImgIconUrl() {
        return mImgIconUrl;
    }

    @Override
    public String getImgLogoUrl() {
        return mImgLogoUrl;
    }
    @Override
    public Boolean getHasCommunityVisibleStats() {
        return mHasCommunityVisibleStats;
    }

    @Override
    public Integer getPlaytimeTwoWeeks() {
        return mPlaytimeTwoWeeks;
    }

}