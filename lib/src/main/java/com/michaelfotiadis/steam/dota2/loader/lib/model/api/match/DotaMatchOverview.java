package com.michaelfotiadis.steam.dota2.loader.lib.model.api.match;


import com.michaelfotiadis.steam.dota2.loader.lib.model.api.DotaApiModel;
import com.michaelfotiadis.steam.dota2.loader.lib.model.api.player.DotaPlayerOverview;

import java.util.List;

/**
 *
 */
public interface DotaMatchOverview extends DotaApiModel {

    Long getMatchId();

    Integer getMatchSeqNum();

    Integer getStartTime();

    Integer getLobbyType();

    Integer getRadiantTeamId();

    Integer getDireTeamId();

    List<DotaPlayerOverview> getPlayers();
}
