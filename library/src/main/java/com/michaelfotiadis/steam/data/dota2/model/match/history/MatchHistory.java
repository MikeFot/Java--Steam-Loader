package com.michaelfotiadis.steam.data.dota2.model.match.history;


import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;
import com.michaelfotiadis.steam.data.dota2.model.match.overview.MatchOverview;

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

    String getStatusDetail();
}
