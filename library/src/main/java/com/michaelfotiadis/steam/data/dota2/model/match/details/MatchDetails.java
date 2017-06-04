package com.michaelfotiadis.steam.data.dota2.model.match.details;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;
import com.michaelfotiadis.steam.data.dota2.model.player.PlayerDetails;
import com.michaelfotiadis.steam.data.dota2.types.GameMode;
import com.michaelfotiadis.steam.data.dota2.types.LobbyType;

import java.util.List;

@SuppressWarnings("ClassWithTooManyFields")
public class MatchDetails implements DotaApiModel {

    @SerializedName("players")
    private final List<PlayerDetails> players;
    @SerializedName("season")
    private final String season;
    @SerializedName("radiant_win")
    private final Boolean radiantWin;
    @SerializedName("duration")
    private final Integer duration;
    @SerializedName("start_time")
    private final Long startTime;
    @SerializedName("match_id")
    private final Long matchId;
    @SerializedName("match_seq_num")
    private final Long matchSeqNum;
    @SerializedName("tower_status_radiant")
    private final Long towerStatusRadiant;
    @SerializedName("tower_status_dire")
    private final Long towerStatusDire;
    @SerializedName("barracks_status_radiant")
    private final Long barracksStatusRadiant;
    @SerializedName("barracks_status_dire")
    private final Long barracksStatusDire;
    @SerializedName("cluster")
    private final Integer cluster;
    @SerializedName("first_blood_time")
    private final Integer firstBloodTime;
    @SerializedName("lobby_type")
    private final Integer lobbyType;
    @SerializedName("human_players")
    private final Integer humanPlayers;
    @SerializedName("leagueid")
    private final Integer leagueid;
    @SerializedName("positive_votes")
    private final Integer positiveVotes;
    @SerializedName("negative_votes")
    private final Integer negativeVotes;
    @SerializedName("game_mode")
    private final Integer gameMode;
    @SerializedName("picks_bans")
    private final List<PickBans> pickBans;
    @SerializedName("engine")
    private final Integer engine;
    @SerializedName("radiant_score")
    private final String radiantScore;
    @SerializedName("dire_score")
    private final String direScore;

    private MatchDetails(final Builder builder) {
        players = builder.players;
        season = builder.season;
        radiantWin = builder.radiantWin;
        duration = builder.duration;
        startTime = builder.startTime;
        matchId = builder.matchId;
        matchSeqNum = builder.matchSeqNum;
        towerStatusRadiant = builder.towerStatusRadiant;
        towerStatusDire = builder.towerStatusDire;
        barracksStatusRadiant = builder.barracksStatusRadiant;
        barracksStatusDire = builder.barracksStatusDire;
        cluster = builder.cluster;
        firstBloodTime = builder.firstBloodTime;
        lobbyType = builder.lobbyType;
        humanPlayers = builder.humanPlayers;
        leagueid = builder.leagueid;
        positiveVotes = builder.positiveVotes;
        negativeVotes = builder.negativeVotes;
        gameMode = builder.gameMode;
        pickBans = builder.pickBans;
        engine = builder.engine;
        radiantScore = builder.radiantScore;
        direScore = builder.direScore;
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    /**
     * @return List of players in the match.
     */
    public List<PlayerDetails> getPlayers() {
        return players;
    }

    /**
     * @return The season the game was played in.
     */
    public String getSeason() {
        return season;
    }

    /**
     * @return Dictates the winner of the match, true for radiant; false for dire.
     */
    public Boolean getRadiantWin() {
        return radiantWin;
    }

    /**
     * @return The length of the match, in seconds since the match began.
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return Unix timestamp of when the match began.
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * @return The matches unique ID.
     */
    public Long getMatchId() {
        return matchId;
    }

    /**
     * @return A 'sequence number', representing the order in which matches were recorded.
     */
    public Long getMatchSeqNum() {
        return matchSeqNum;
    }

    /**
     * @return A particular teams tower status is given as a 16-bit unsigned integer. The rightmost 11 bits represent individual towers belonging to that team; see below for a visual representation.
     */
    public Long getTowerStatusRadiant() {
        return towerStatusRadiant;
    }

    /**
     * @return A particular teams tower status is given as a 16-bit unsigned integer. The rightmost 11 bits represent individual towers belonging to that team; see below for a visual representation.
     */
    public Long getTowerStatusDire() {
        return towerStatusDire;
    }

    /**
     * @return A particular teams tower status is given as an 8-bit unsigned integer. The rightmost 6 bits represent the barracks belonging to that team; see below for a visual representation.
     */
    public Long getBarracksStatusRadiant() {
        return this.barracksStatusRadiant;
    }

    /**
     * @return A particular teams tower status is given as an 8-bit unsigned integer. The rightmost 6 bits represent the barracks belonging to that team; see below for a visual representation.
     */
    public Long getBarracksStatusDire() {
        return this.barracksStatusDire;
    }

    /**
     * @return The server cluster the match was played upon. Used for downloading replays of matches.
     */
    public Integer getCluster() {
        return this.cluster;
    }

    /**
     * @return The time in seconds since the match began when first-blood occurred.
     */
    public Integer getFirstBloodTime() {
        return this.firstBloodTime;
    }

    /**
     * @return -1 - Invalid
     * 0 - Public matchmaking
     * 1 - Practise
     * 2 - Tournament
     * 3 - Tutorial
     * 4 - Co-op with bots.
     * 5 - Team match
     * 6 - Solo Queue
     * 7 - Ranked
     * 8 - 1v1 Mid
     */
    public Integer getLobbyType() {
        return lobbyType;
    }

    /**
     * @return Resolved Lobby Type as enum
     */
    public LobbyType getLobbyTypeAsEnum() {
        return LobbyType.fromValue(lobbyType);
    }

    /**
     * @return The amount of human players within the match.
     */
    public Integer getHumanPlayers() {
        return humanPlayers;
    }

    /**
     * @return The league that this match was a part of. A list of league IDs can be found via the GetLeagueListing method.
     */
    public Integer getLeagueid() {
        return leagueid;
    }

    /**
     * @return The number of thumbs-up the game has received by users.
     */
    public Integer getPositiveVotes() {
        return positiveVotes;
    }

    /**
     * @return The number of thumbs-down the game has received by users.
     */
    public Integer getNegativeVotes() {
        return negativeVotes;
    }

    /**
     * @return 0 - None
     * 1 - All Pick
     * 2 - Captain's Mode
     * 3 - Random Draft
     * 4 - Single Draft
     * 5 - All Random
     * 6 - Intro
     * 7 - Diretide
     * 8 - Reverse Captain's Mode
     * 9 - The Greeviling
     * 10 - Tutorial
     * 11 - Mid Only
     * 12 - Least Played
     * 13 - New Player Pool
     * 14 - Compendium Matchmaking
     * 15 - Co-op vs Bots
     * 16 - Captains Draft
     * 18 - Ability Draft
     * 20 - All Random Deathmatch
     * 21 - 1v1 Mid Only
     * 22 - Ranked Matchmaking
     */
    public Integer getGameMode() {
        return this.gameMode;
    }

    /**
     * @return resolved GameMode as enum
     */
    public GameMode getGameModeAsEnum() {
        return GameMode.fromValue(gameMode);
    }

    /**
     * @return A list of the picks and bans in the match, if the game mode is Captains Mode.
     */
    public List<PickBans> getPickBans() {
        return pickBans;
    }

    /**
     * @return 0 - Source 1
     * 1 - Source 2
     */
    public Integer getEngine() {
        return engine;
    }

    /**
     * @return Undocumented
     */
    public String getRadiantScore() {
        return radiantScore;
    }

    /**
     * @return Undocumented
     */
    public String getDireScore() {
        return direScore;
    }


    public static final class Builder {
        private List<PlayerDetails> players;
        private String season;
        private Boolean radiantWin;
        private Integer duration;
        private Long startTime;
        private Long matchId;
        private Long matchSeqNum;
        private Long towerStatusRadiant;
        private Long towerStatusDire;
        private Long barracksStatusRadiant;
        private Long barracksStatusDire;
        private Integer cluster;
        private Integer firstBloodTime;
        private Integer lobbyType;
        private Integer humanPlayers;
        private Integer leagueid;
        private Integer positiveVotes;
        private Integer negativeVotes;
        private Integer gameMode;
        private List<PickBans> pickBans;
        private Integer engine;
        private String radiantScore;
        private String direScore;

        private Builder() {
        }

        public Builder withPlayers(final List<PlayerDetails> val) {
            players = val;
            return this;
        }

        public Builder withSeason(final String val) {
            season = val;
            return this;
        }

        public Builder withRadiantWin(final Boolean val) {
            radiantWin = val;
            return this;
        }

        public Builder withDuration(final Integer val) {
            duration = val;
            return this;
        }

        public Builder withStartTime(final Long val) {
            startTime = val;
            return this;
        }

        public Builder withMatchId(final Long val) {
            matchId = val;
            return this;
        }

        public Builder withMatchSeqNum(final Long val) {
            matchSeqNum = val;
            return this;
        }

        public Builder withTowerStatusRadiant(final Long val) {
            towerStatusRadiant = val;
            return this;
        }

        public Builder withTowerStatusDire(final Long val) {
            towerStatusDire = val;
            return this;
        }

        public Builder withBarracksStatusRadiant(final Long val) {
            barracksStatusRadiant = val;
            return this;
        }

        public Builder withBarracksStatusDire(final Long val) {
            barracksStatusDire = val;
            return this;
        }

        public Builder withCluster(final Integer val) {
            cluster = val;
            return this;
        }

        public Builder withFirstBloodTime(final Integer val) {
            firstBloodTime = val;
            return this;
        }

        public Builder withLobbyType(final Integer val) {
            lobbyType = val;
            return this;
        }

        public Builder withHumanPlayers(final Integer val) {
            humanPlayers = val;
            return this;
        }

        public Builder withLeagueid(final Integer val) {
            leagueid = val;
            return this;
        }

        public Builder withPositiveVotes(final Integer val) {
            positiveVotes = val;
            return this;
        }

        public Builder withNegativeVotes(final Integer val) {
            negativeVotes = val;
            return this;
        }

        public Builder withGameMode(final Integer val) {
            gameMode = val;
            return this;
        }

        public Builder withPickBans(final List<PickBans> val) {
            pickBans = val;
            return this;
        }

        public Builder withEngine(final Integer val) {
            engine = val;
            return this;
        }

        public Builder withRadiantScore(final String val) {
            radiantScore = val;
            return this;
        }

        public Builder withDireScore(final String val) {
            direScore = val;
            return this;
        }

        public MatchDetails build() {
            return new MatchDetails(this);
        }
    }
}