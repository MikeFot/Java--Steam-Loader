package com.michaelfotiadis.steam.model.api;


import com.michaelfotiadis.steam.model.SteamApiModel;

/**
 *
 */
public interface VanityResponse extends SteamApiModel {
    String getSteamid();

    Integer getSuccess();

    String getMessage();
}
