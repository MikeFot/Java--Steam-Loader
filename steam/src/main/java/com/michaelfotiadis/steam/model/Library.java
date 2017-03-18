package com.michaelfotiadis.steam.model;


import com.michaelfotiadis.steam.dota2.model.api.DotaApiModel;

import java.util.List;

/**
 *
 */
public interface Library extends DotaApiModel {
    Integer getGameCount();

    List<Game> getGames();
}
