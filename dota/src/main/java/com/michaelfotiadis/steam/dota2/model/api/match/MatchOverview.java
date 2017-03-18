package com.michaelfotiadis.steam.dota2.model.api.match;


import com.michaelfotiadis.steam.dota2.model.api.DotaApiModel;
import com.michaelfotiadis.steam.dota2.model.api.player.PlayerOverview;

import java.util.List;

/**
 *
 */
public interface MatchOverview extends DotaApiModel {

    Long getMatchId();

    Integer getMatchSeqNum();

    Integer getStartTime();

    Integer getLobbyType();

    Integer getRadiantTeamId();

    Integer getDireTeamId();

    List<PlayerOverview> getPlayers();
}
