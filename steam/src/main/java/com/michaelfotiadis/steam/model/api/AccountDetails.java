package com.michaelfotiadis.steam.model.api;


import com.michaelfotiadis.steam.model.SteamApiModel;

/**
 *
 */
public interface AccountDetails extends SteamApiModel {
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
