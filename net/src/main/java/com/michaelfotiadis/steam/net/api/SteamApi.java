package com.michaelfotiadis.steam.net.api;

import com.michaelfotiadis.steam.model.api.VanityResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Retrofit interface
 */
public interface SteamApi {

    @GET("ISteamUser/ResolveVanityURL/v0001/")
    Call<VanityResponse> getIdFromVanityUrl(@Query("key") String key,
                                            @Query("vanityurl") String url);

}
