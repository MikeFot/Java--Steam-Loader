package com.michaelfotiadis.steam.data.dota2.api.match;


import com.michaelfotiadis.steam.data.dota2.api.DotaApiModel;
import com.michaelfotiadis.steam.data.dota2.api.player.PlayerOverview;

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
