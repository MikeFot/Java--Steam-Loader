package com.michaelfotiadis.steam.dota2.loader.lib.model.api.steam;


import com.michaelfotiadis.steam.dota2.loader.lib.model.api.DotaApiModel;

import java.util.List;

/**
 *
 */
public interface SteamLibrary extends DotaApiModel {
    Integer getGameCount();

    List<SteamGame> getGames();
}
