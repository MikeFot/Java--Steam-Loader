package com.michaelfotiadis.steam.data.dota2.model.match.details;

import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;
import com.michaelfotiadis.steam.data.dota2.model.player.PlayerDetails;

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
