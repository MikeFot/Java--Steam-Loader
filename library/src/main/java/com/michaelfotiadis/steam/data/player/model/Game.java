package com.michaelfotiadis.steam.data.player.model;


import com.michaelfotiadis.steam.data.player.SteamApiModel;

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
