package com.michaelfotiadis.steam.model;


import com.michaelfotiadis.steam.dota2.model.api.DotaApiModel;

/**
 *
 */
public interface VanityResponse extends DotaApiModel {
    String getSteamid();

    Integer getSuccess();

    String getMessage();
}
