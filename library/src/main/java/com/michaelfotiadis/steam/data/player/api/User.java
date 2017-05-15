package com.michaelfotiadis.steam.data.player.api;


import com.michaelfotiadis.steam.data.player.SteamApiModel;

/**
 *
 */
public interface User extends SteamApiModel {

    AccountDetails getAccountDetails();

    Library getGameLibrary();

}
