package com.michaelfotiadis.steam.dota2.loader.lib.model.api.steam;


import com.michaelfotiadis.steam.dota2.loader.lib.model.api.DotaApiModel;

/**
 *
 */
public interface SteamUser extends DotaApiModel {
    SteamAccountDetails getAccountDetails();

    SteamLibrary getGameLibrary();
}
