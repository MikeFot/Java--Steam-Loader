package com.michaelfotiadis.steam.data.dota2.model.live;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

import java.util.List;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetLiveLeagueGames">Wiki</a>
 */
public class LiveGame implements DotaApiModel {

    @SerializedName("players")
    private final List<LivePlayer> players;
    @SerializedName("radiant_team")
    private final LiveTeam radiantTeam;
    @SerializedName("dire_team")
    private final LiveTeam direTeam;
    @SerializedName("lobby_id")
    private final String lobbyId;
    @SerializedName("match_id")
    private final Long matchId;
    @SerializedName("spectators")
    private final Integer spectators;
    @SerializedName("series_id")
    private final Long seriesId;
    @SerializedName("game_number")
    private final Integer gameNumber;
    @SerializedName("league_id")
    private final Long leagueId;
    @SerializedName("stream_delay_s")
    private final Integer streamDelayS;
    @SerializedName("radiant_series_wins")
    private final Integer radiantSeriesWins;
    @SerializedName("dire_series_wins")
    private final Integer direSeriesWins;
    @SerializedName("series_type")
    private final Integer seriesType;
    @SerializedName("league_series_id")
    private final Integer leagueSeriesId;
    @SerializedName("league_game_id")
    private final Integer leagueGameId;
    @SerializedName("stage_name")
    private final String stageName;
    @SerializedName("league_tier")
    private final Integer leagueTier;
    @SerializedName("scoreboard")
    private final Scoreboard scoreboard;

    private LiveGame(final Builder builder) {
        players = builder.players;
        radiantTeam = builder.radiantTeam;
        direTeam = builder.direTeam;
        lobbyId = builder.lobbyId;
        matchId = builder.matchId;
        spectators = builder.spectators;
        seriesId = builder.seriesId;
        gameNumber = builder.gameNumber;
        leagueId = builder.leagueId;
        streamDelayS = builder.streamDelayS;
        radiantSeriesWins = builder.radiantSeriesWins;
        direSeriesWins = builder.direSeriesWins;
        seriesType = builder.seriesType;
        leagueSeriesId = builder.leagueSeriesId;
        leagueGameId = builder.leagueGameId;
        stageName = builder.stageName;
        leagueTier = builder.leagueTier;
        scoreboard = builder.scoreboard;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * @return The list of players within a game.
     */
    public List<LivePlayer> getPlayers() {
        return players;
    }

    /**
     * @return Information about the team playing as radiant for this match.
     */
    public LiveTeam getRadiantTeam() {
        return radiantTeam;
    }

    /**
     * @return Information about the team playing as dire for this match.
     */
    public LiveTeam getDireTeam() {
        return direTeam;
    }

    /**
     * @return Unique ID for the matches lobby.
     */
    public String getLobbyId() {

        return lobbyId;
    }

    public Long getMatchId() {
        return matchId;
    }

    /**
     * @return Number of spectators at time of query.
     */
    public Integer getSpectators() {
        return spectators;
    }

    public Long getSeriesId() {
        return seriesId;
    }

    public Integer getGameNumber() {
        return gameNumber;
    }

    public Long getLeagueId() {
        return leagueId;
    }

    public Integer getStreamDelayS() {
        return streamDelayS;
    }

    public Integer getRadiantSeriesWins() {
        return radiantSeriesWins;
    }

    public Integer getDireSeriesWins() {
        return direSeriesWins;
    }

    public Integer getSeriesType() {
        return seriesType;
    }

    public Integer getLeagueSeriesId() {
        return leagueSeriesId;
    }

    public Integer getLeagueGameId() {
        return leagueGameId;
    }

    public String getStageName() {
        return stageName;
    }

    public Integer getLeagueTier() {
        return leagueTier;
    }

    public Scoreboard getScoreboard() {
        return scoreboard;
    }


    public static final class Builder {
        private List<LivePlayer> players;
        private LiveTeam radiantTeam;
        private LiveTeam direTeam;
        private String lobbyId;
        private Long matchId;
        private Integer spectators;
        private Long seriesId;
        private Integer gameNumber;
        private Long leagueId;
        private Integer streamDelayS;
        private Integer radiantSeriesWins;
        private Integer direSeriesWins;
        private Integer seriesType;
        private Integer leagueSeriesId;
        private Integer leagueGameId;
        private String stageName;
        private Integer leagueTier;
        private Scoreboard scoreboard;

        private Builder() {
        }

        public Builder withPlayers(final List<LivePlayer> val) {
            players = val;
            return this;
        }

        public Builder withRadiantTeam(final LiveTeam val) {
            radiantTeam = val;
            return this;
        }

        public Builder withDireTeam(final LiveTeam val) {
            direTeam = val;
            return this;
        }

        public Builder withLobbyId(final String val) {
            lobbyId = val;
            return this;
        }

        public Builder withMatchId(final Long val) {
            matchId = val;
            return this;
        }

        public Builder withSpectators(final Integer val) {
            spectators = val;
            return this;
        }

        public Builder withSeriesId(final Long val) {
            seriesId = val;
            return this;
        }

        public Builder withGameNumber(final Integer val) {
            gameNumber = val;
            return this;
        }

        public Builder withLeagueId(final Long val) {
            leagueId = val;
            return this;
        }

        public Builder withStreamDelayS(final Integer val) {
            streamDelayS = val;
            return this;
        }

        public Builder withRadiantSeriesWins(final Integer val) {
            radiantSeriesWins = val;
            return this;
        }

        public Builder withDireSeriesWins(final Integer val) {
            direSeriesWins = val;
            return this;
        }

        public Builder withSeriesType(final Integer val) {
            seriesType = val;
            return this;
        }

        public Builder withLeagueSeriesId(final Integer val) {
            leagueSeriesId = val;
            return this;
        }

        public Builder withLeagueGameId(final Integer val) {
            leagueGameId = val;
            return this;
        }

        public Builder withStageName(final String val) {
            stageName = val;
            return this;
        }

        public Builder withLeagueTier(final Integer val) {
            leagueTier = val;
            return this;
        }

        public Builder withScoreboard(final Scoreboard val) {
            scoreboard = val;
            return this;
        }

        public LiveGame build() {
            return new LiveGame(this);
        }
    }

}