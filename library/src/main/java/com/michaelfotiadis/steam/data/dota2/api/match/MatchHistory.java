package com.michaelfotiadis.steam.data.dota2.api.match;


import com.michaelfotiadis.steam.data.dota2.api.DotaApiModel;

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
