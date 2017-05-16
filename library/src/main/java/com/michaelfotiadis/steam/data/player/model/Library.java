package com.michaelfotiadis.steam.data.player.model;


import com.michaelfotiadis.steam.data.player.SteamApiModel;

import java.util.List;

/**
 *
 */
public interface Library extends SteamApiModel {
    Integer getGameCount();

    List<Game> getGames();
}
