package com.michaelfotiadis.steam.dota2.loader.lib.model.api.steam;


import com.michaelfotiadis.steam.dota2.loader.lib.model.api.DotaApiModel;

/**
 *
 */
public interface SteamAccountDetails extends DotaApiModel {
    String getSteamId();

    String getAvatar();

    Integer getCommunityVisibilityState();

    Integer getProfileState();

    String getPersonaName();

    Long getLastLogOff();

    String getProfileUrl();

    String getAvatarMedium();

    String getAvatarFull();

    Integer getPersonaState();

    String getPrimaryClanId();

    Integer getTimeCreated();

    Integer getPersonaStateFlags();

    String getLocCountryCode();

    String getLocStateCode();
}
