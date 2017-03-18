package com.michaelfotiadis.steam.model.api;


import com.michaelfotiadis.steam.model.SteamApiModel;

import java.util.List;

/**
 *
 */
public interface Library extends SteamApiModel {
    Integer getGameCount();

    List<Game> getGames();
}
