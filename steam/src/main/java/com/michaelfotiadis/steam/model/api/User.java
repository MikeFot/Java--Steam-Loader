package com.michaelfotiadis.steam.model.api;


import com.michaelfotiadis.steam.model.SteamApiModel;

/**
 *
 */
public interface User extends SteamApiModel {

    AccountDetails getAccountDetails();

    Library getGameLibrary();

}
