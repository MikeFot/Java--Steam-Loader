package com.michaelfotiadis.steam.api.dota2;

import com.michaelfotiadis.steam.data.ResultContainer;
import com.michaelfotiadis.steam.data.dota2.model.match.details.MatchDetails;
import com.michaelfotiadis.steam.data.dota2.model.match.history.MatchHistory;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Dota2MatchApi {

    @GET("IDOTA2Match_{endpoint_id}/GetMatchDetails/V1/")
    Call<ResultContainer<MatchDetails>> getMatchById(@Path("endpoint_id") String endpoint_id,
                                                     @Query("key") String key,
                                                     @Query("match_id") String match_id,
                                                     @Query("format") String format);

    @GET("IDOTA2Match_{endpoint_id}/GetMatchHistory/V1/")
    Call<ResultContainer<MatchHistory>> getMatchHistory(@Path("endpoint_id") String endpoint_id,
                                                        @Query("key") String key,
                                                        @Query("account_id") String id,
                                                        @Query("hero_id") String heroId,
                                                        @Query("game_mode") Integer gameMode,
                                                        @Query("skill") Integer skillBracket,
                                                        @Query("min_players") Integer minPlayers,
                                                        @Query("league_id") String leagueId,
                                                        @Query("start_at_match_id") String startAtMatchId,
                                                        @Query("tournament_games_only") Boolean tournamentGamesOnly,
                                                        @Query("matches_requested") Integer matches,
                                                        @Query("format") String format);

    @GET("IDOTA2Match_{endpoint_id}/GetMatchHistoryBySequenceNum/V1/")
    Call<ResultContainer<MatchHistory>> getMatchHistoryBySequenceNumber(@Path("endpoint_id") String endpoint_id,
                                                                        @Query("key") String key,
                                                                        @Query("start_at_match_seq_num") String id,
                                                                        @Query("matches_requested") Integer matches,
                                                                        @Query("format") String format);


}
