package com.michaelfotiadis.steam.provider.net.api;

import com.michaelfotiadis.steam.data.dota2.response.MatchDetailsResponse;
import com.michaelfotiadis.steam.data.dota2.response.MatchHistoryResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Dota2Api {

    @GET("IDOTA2Match_570/GetMatchDetails/V001/?format=json")
    Call<MatchDetailsResponse> getMatchById(@Query("key") String key,
                                            @Query("match_id") String id);

    @GET("IDOTA2Match_570/GetMatchHistory/V001/")
    Call<MatchHistoryResponse> getMatchHistory(@Query("key") String key,
                                               @Query("account_id") String id,
                                               @Query("matches_requested") int matches);

}
