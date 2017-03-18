package com.michaelfotiadis.steam.dota2.model.api.match;


import com.michaelfotiadis.steam.dota2.model.api.DotaApiModel;

import java.util.List;

/**
 *
 */
public interface MatchHistory extends DotaApiModel {
    Integer getStatus();

    Integer getNumResults();

    Integer getTotalResults();

    Integer getResultsRemaining();

    List<MatchOverview> getMatches();
}
