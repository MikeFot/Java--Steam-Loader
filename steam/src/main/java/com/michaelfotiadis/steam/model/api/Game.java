package com.michaelfotiadis.steam.model.api;


import com.michaelfotiadis.steam.model.SteamApiModel;

/**
 *
 */
public interface Game extends SteamApiModel {

    Long getAppId();

    String getName();

    Integer getPlaytimeForever();

    String getImgIconUrl();

    String getImgLogoUrl();

    Boolean getHasCommunityVisibleStats();

    Integer getPlaytimeTwoWeeks();
}
