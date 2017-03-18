package com.michaelfotiadis.steam.dota2.loader.lib.model.api.match;


import com.michaelfotiadis.steam.dota2.loader.lib.model.api.DotaApiModel;

import java.util.List;

/**
 *
 */
public interface DotaMatchHistory extends DotaApiModel {
    Integer getStatus();

    Integer getNumResults();

    Integer getTotalResults();

    Integer getResultsRemaining();

    List<DotaMatchOverview> getMatches();
}
