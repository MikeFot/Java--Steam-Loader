package com.michaelfotiadis.steam.net.api;

import com.michaelfotiadis.steam.dota2.model.response.MatchDetailsResponse;
import com.michaelfotiadis.steam.dota2.model.response.MatchHistoryResponse;
import com.michaelfotiadis.steam.model.response.AccountResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Dota2Api {

    @GET("IDOTA2Match_570/GetMatchDetails/V001/?format=json")
    Call<MatchDetailsResponse> getMatchById(@Query("key") String key,
                                            @Query("match_id") String id);

    @GET("ISteamUser/GetPlayerSummaries/v0002/")
    Call<AccountResponse> getPlayerById(@Query("key") String key,
                                        @Query("steamids") String id);

    @GET("IDOTA2Match_570/GetMatchHistory/V001/")
    Call<MatchHistoryResponse> getMatchHistory(@Query("key") String key,
                                               @Query("account_id") String id,
                                               @Query("matches_requested") int matches);

}
