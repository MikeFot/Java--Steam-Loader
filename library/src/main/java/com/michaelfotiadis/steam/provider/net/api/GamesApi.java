package com.michaelfotiadis.steam.provider.net.api;

import com.michaelfotiadis.steam.data.player.response.LibraryResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GamesApi {

    @GET("IPlayerService/GetOwnedGames/v0001/?format=json")
    Call<LibraryResponse> getGamesList(@Query("key") String key,
                                       @Query("steamid") String id,
                                       @Query("include_appinfo") boolean includeAppInfo,
                                       @Query("include_played_free_games") boolean includePlayedFreeGames);

}
