package com.michaelfotiadis.steam.model;


import com.michaelfotiadis.steam.dota2.model.api.DotaApiModel;

/**
 *
 */
public interface User extends DotaApiModel {

    AccountDetails getAccountDetails();

    Library getGameLibrary();

}
