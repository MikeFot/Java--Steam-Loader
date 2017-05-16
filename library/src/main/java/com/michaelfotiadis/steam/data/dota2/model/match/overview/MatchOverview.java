package com.michaelfotiadis.steam.data.dota2.model.match.overview;


import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;
import com.michaelfotiadis.steam.data.dota2.model.player.PlayerOverview;
import com.michaelfotiadis.steam.data.dota2.types.LobbyType;

import java.util.List;

/**
 *
 */
public interface MatchOverview extends DotaApiModel {

    Long getMatchId();

    Integer getMatchSeqNum();

    Integer getStartTime();

    Integer getLobbyType();

    LobbyType getLobbyTypeAsEnum();

    Integer getRadiantTeamId();

    Integer getDireTeamId();

    List<PlayerOverview> getPlayers();
}
