package com.michaelfotiadis.steam.model;


import com.michaelfotiadis.steam.dota2.model.api.DotaApiModel;

/**
 *
 */
public interface AccountDetails extends DotaApiModel {
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
