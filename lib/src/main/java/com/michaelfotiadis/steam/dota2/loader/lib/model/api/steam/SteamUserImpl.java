package com.michaelfotiadis.steam.dota2.loader.lib.model.api.steam;


/**
 */
public class SteamUserImpl implements SteamUser {

    private final SteamAccountDetails mAccountDetails;
    private final SteamLibrary mGameLibrary;


    public SteamUserImpl(final SteamAccountDetails accountDetails, final SteamLibrary gameLibrary) {
        mAccountDetails = accountDetails;
        mGameLibrary = gameLibrary;
    }

    @Override
    public SteamAccountDetails getAccountDetails() {
        return mAccountDetails;
    }

    @Override
    public SteamLibrary getGameLibrary() {
        return mGameLibrary;
    }

}
