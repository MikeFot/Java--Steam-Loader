package com.michaelfotiadis.steam.net.api.dota2;

import com.michaelfotiadis.steam.data.dota2.model.hero.HeroContainer;
import com.michaelfotiadis.steam.data.dota2.model.item.ItemResponse;
import com.michaelfotiadis.steam.data.dota2.model.match.details.MatchDetailsResponse;
import com.michaelfotiadis.steam.data.dota2.model.match.history.MatchHistoryResponse;
import com.michaelfotiadis.steam.data.dota2.model.rarity.Rarities;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Dota2Api {

    @GET("IDOTA2Match_{endpoint_id}/GetMatchDetails/V1/")
    Call<MatchDetailsResponse> getMatchById(@Path("endpoint_id") String endpoint_id,
                                            @Query("key") String key,
                                            @Query("match_id") String match_id,
                                            @Query("format") String format);

    @GET("IDOTA2Match_{endpoint_id}/GetMatchHistory/V1/")
    Call<MatchHistoryResponse> getMatchHistory(@Path("endpoint_id") String endpoint_id,
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
    Call<MatchHistoryResponse> getMatchHistoryBySequenceNumber(@Path("endpoint_id") String endpoint_id,
                                                               @Query("key") String key,
                                                               @Query("start_at_match_seq_num") String id,
                                                               @Query("matches_requested") Integer matches,
                                                               @Query("format") String format);

    @GET("IEconDOTA2_{endpoint_id}/GetHeroes/v1")
    Call<HeroContainer> getHeroes(@Path("endpoint_id") String endpoint_id,
                                  @Query("key") String key,
                                  @Query("language") String language,
                                  @Query("itemizedonly") Boolean itemizedOnly,
                                  @Query("format") String format);

    @GET("IEconDOTA2_{endpoint_id}/GetGameItems/v1")
    Call<ItemResponse> getItems(@Path("endpoint_id") String endpoint_id,
                                @Query("key") String key,
                                @Query("language") String language,
                                @Query("format") String format);

    @GET("IEconDOTA2_{endpoint_id}/GetRarities/v1")
    Call<Rarities> getRarities(@Path("endpoint_id") String endpoint_id,
                               @Query("key") String key,
                               @Query("language") String language,
                               @Query("format") String format);

}
