package com.michaelfotiadis.steam.api.steam;

import com.michaelfotiadis.steam.data.ResponseContainer;
import com.michaelfotiadis.steam.data.steam.player.badges.Badges;
import com.michaelfotiadis.steam.data.steam.player.level.PlayerLevel;
import com.michaelfotiadis.steam.data.steam.player.library.Library;
import com.michaelfotiadis.steam.data.steam.player.quests.Quests;
import com.michaelfotiadis.steam.data.steam.users.recent.RecentlyPlayed;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface PlayerApi {

    String BASE_URL = "IPlayerService/";


    /**
     * WebAPI/GetOwnedGames
     *
     * @param key                    Your Steam Web API key. Without this, the server will return an HTTP 403 (forbidden) error.
     * @param id                     (Optional) (uint64)
     *                               The 64 bit ID of the player.
     * @param includeAppInfo         (Optional) (bool)
     *                               Whether or not to include additional details of apps - name and images. Defaults to false.
     * @param includePlayedFreeGames (Optional) (bool)
     *                               Whether or not to list free-to-play games in the results. Defaults to false.
     * @param appids_filter          (Optional) (uint32)
     *                               Restricts results to the appids passed here. This is an array and should be passed like appids_filter[0]=440&appids_filter[1]=570
     * @param format                 (Optional) The file format to return output in.
     * @return {@link Library} response
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetOwnedGames">Wiki</a>
     */
    @GET(BASE_URL + "GetOwnedGames/v0001/")
    Call<ResponseContainer<Library>> getGamesList(@Query("key") String key,
                                                  @Query("steamid") String id,
                                                  @Query("include_appinfo") Integer includeAppInfo,
                                                  @Query("include_played_free_games") Integer includePlayedFreeGames,
                                                  @QueryMap Map<String, String> appids_filter,
                                                  @Query("format") String format);

    /**
     * https://wiki.teamfortress.com/wiki/WebAPI/GetSteamLevel
     *
     * @param key       Your Steam Web API key. Without this, the server will return an HTTP 403 (forbidden) error.
     * @param steamId64 Player ID 64
     * @param format    (Optional) The file format to return output in.
     * @return {@link PlayerLevel} for the requested player
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetSteamLevel">Wiki</a>
     */
    @GET(BASE_URL + "GetSteamLevel/v1/")
    Call<ResponseContainer<PlayerLevel>> getPlayerLevel(@Query("key") String key,
                                                        @Query("steamid") String steamId64,
                                                        @Query("format") String format);

    /**
     * WebAPI/GetRecentlyPlayedGames
     *
     * @param key       Your Steam Web API key. Without this, the server will return an HTTP 403 (forbidden) error.
     * @param steamId64 (Optional) Player ID 64
     * @param count     (Optional) Number of games requested
     * @param format    (Optional) The file format to return output in.
     * @return {@link PlayerLevel} for the requested player
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetRecentlyPlayedGames">Wiki</a>
     */
    @GET(BASE_URL + "GetRecentlyPlayedGames/v1")
    Call<ResponseContainer<RecentlyPlayed>> getRecentlyPlayed(@Query("key") String key,
                                                              @Query("steamid") String steamId64,
                                                              @Query("count") Integer count,
                                                              @Query("format") String format);

    /**
     * WebAPI/GetBadges
     *
     * @param key       Your Steam Web API key. Without this, the server will return an HTTP 403 (forbidden) error.
     * @param steamId64 Player ID 64
     * @param format    (Optional) The file format to return output in.
     * @return {@link Badges} for the requested player
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetBadges">Wiki</a
     */
    @GET(BASE_URL + "GetBadges/v1")
    Call<ResponseContainer<Badges>> getBadges(@Query("key") String key,
                                              @Query("steamid") String steamId64,
                                              @Query("format") String format);

    /**
     * WebAPI/GetCommunityBadgeProgress
     *
     * @param key       Your Steam Web API key. Without this, the server will return an HTTP 403 (forbidden) error.
     * @param steamId64 Player ID 64
     * @param badgeId   (Optional) (int32)
     *                  An badge id.
     * @param format    (Optional) The file format to return output in.
     * @return {@link Quests} for the requested player and (optional) badge id
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetCommunityBadgeProgress">Wiki</a
     */
    @GET(BASE_URL + "GetCommunityBadgeProgress/v1")
    Call<ResponseContainer<Quests>> getCommunityBadgeProgress(@Query("key") String key,
                                                              @Query("steamid") String steamId64,
                                                              @Query("badgeid") String badgeId,
                                                              @Query("format") String format);


}
