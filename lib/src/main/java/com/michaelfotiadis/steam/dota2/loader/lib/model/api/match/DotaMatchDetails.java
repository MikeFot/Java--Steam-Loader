package com.michaelfotiadis.steam.dota2.loader.lib.model.api.match;

import com.michaelfotiadis.steam.dota2.loader.lib.model.api.DotaApiModel;
import com.michaelfotiadis.steam.dota2.loader.lib.model.api.player.DotaPlayerDetails;

import java.util.List;

/**
 *
 */
public interface DotaMatchDetails extends DotaApiModel {

    List<DotaPlayerDetails> getPlayers();

    Boolean getRadiantWin();

    Integer getDuration();

    Long getStartTime();

    Long getMatchId();

    Long getMatchSeqNum();

    Long getTowerStatusRadiant();

    Long getTowerStatusDire();

    Long getBarracksStatusRadiant();

    Long getBarracksStatusDire();

    Integer getCluster();

    Integer getFirstBloodTime();

    Integer getLobbyType();

    Integer getHumanPlayers();

    Integer getLeagueid();

    Integer getPositiveVotes();

    Integer getNegativeVotes();

    Integer getGameMode();
}
