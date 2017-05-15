package com.michaelfotiadis.steam.provider.net.api;

import com.michaelfotiadis.steam.data.player.api.VanityResponse;
import com.michaelfotiadis.steam.data.player.response.AccountResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Retrofit interface
 */
public interface PlayerApi {

    @GET("ISteamUser/GetPlayerSummaries/v0002/")
    Call<AccountResponse> getPlayerById(@Query("key") String key,
                                        @Query("steamids") String id);

    @GET("ISteamUser/ResolveVanityURL/v0001/")
    Call<VanityResponse> getIdFromVanityUrl(@Query("key") String key,
                                            @Query("vanityurl") String url);

}
