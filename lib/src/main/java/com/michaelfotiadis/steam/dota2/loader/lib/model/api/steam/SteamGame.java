package com.michaelfotiadis.steam.dota2.loader.lib.model.api.steam;


import com.michaelfotiadis.steam.dota2.loader.lib.model.api.DotaApiModel;

/**
 *
 */
public interface SteamGame extends DotaApiModel {

    Long getAppId();

    String getName();

    Integer getPlaytimeForever();

    String getImgIconUrl();

    String getImgLogoUrl();

    Boolean getHasCommunityVisibleStats();

    Integer getPlaytimeTwoWeeks();
}
