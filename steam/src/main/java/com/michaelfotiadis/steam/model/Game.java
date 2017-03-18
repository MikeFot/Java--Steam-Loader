package com.michaelfotiadis.steam.model;


import com.michaelfotiadis.steam.dota2.model.api.DotaApiModel;

/**
 *
 */
public interface Game extends DotaApiModel {

    Long getAppId();

    String getName();

    Integer getPlaytimeForever();

    String getImgIconUrl();

    String getImgLogoUrl();

    Boolean getHasCommunityVisibleStats();

    Integer getPlaytimeTwoWeeks();
}
