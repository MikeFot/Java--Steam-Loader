package com.michaelfotiadis.steam.api;

import com.michaelfotiadis.steam.data.player.model.backpack.BackpackResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Retrofit interface
 */
public interface PlayerApi {


    @GET("IEconItems_{endpoint_id}/GetPlayerItems/v0001/")
    Call<BackpackResponse> getPlayerItems(@Path("endpoint_id") String endpoint_id,
                                          @Query("key") String key,
                                          @Query("steamid") String steamId64,
                                          @Query("format") String format);
}
