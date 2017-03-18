package com.michaelfotiadis.steam.dota2.model.api.match;

import com.michaelfotiadis.steam.dota2.model.api.DotaApiModel;
import com.michaelfotiadis.steam.dota2.model.api.player.PlayerDetails;

import java.util.List;

/**
 *
 */
public interface MatchDetails extends DotaApiModel {

    List<PlayerDetails> getPlayers();

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
