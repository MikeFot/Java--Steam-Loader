package com.michaelfotiadis.steam.api.steam;

import com.michaelfotiadis.steam.data.ResponseContainer;
import com.michaelfotiadis.steam.data.steam.users.friends.FriendsListResponse;
import com.michaelfotiadis.steam.data.steam.users.user.PlayerSummaries;
import com.michaelfotiadis.steam.data.steam.users.vanity.Vanity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UsersApi {

    String BASE_URL = "ISteamUser/";

    /**
     * WebAPI/GetPlayerSummaries
     *
     * @param key        Your Steam Web API key. Without this, the server will return an HTTP 403 (forbidden) error.
     * @param steamIds64 A comma-separated list of 64 bit IDs to retrieve profiles for.
     * @param format     (optional) The file format to return output in.
     * @return A list of profile objects. Contained information varies depending on whether or
     * not the user has their profile set to Friends only or Private.
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetPlayerSummaries">Wiki</a>
     */
    @GET(BASE_URL + "GetPlayerSummaries/v0002/")
    Call<ResponseContainer<PlayerSummaries>> getPlayerSummaries(@Query("key") String key,
                                                                @Query("steamids") String steamIds64,
                                                                @Query("format") String format);

    /**
     * WebAPI/ResolveVanityURL
     *
     * @param key       Your Steam Web API key. Without this, the server will return an HTTP 403 (forbidden) error.
     * @param vanityUrl The user's vanity URL that you would like to retrieve a steam ID for, e.g. http://steamcommunity.com/id/gabelogannewell would use "gabelogannewell"
     * @param format    (optional) The file format to return output in.
     * @return Response containing the 64 bit Steam ID the vanity URL resolves to.
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/ResolveVanityURL">Wiki</a>
     */
    @GET(BASE_URL + "ResolveVanityURL/v0001/")
    Call<ResponseContainer<Vanity>> getResolveVanityUrl(@Query("key") String key,
                                                        @Query("vanityurl") String vanityUrl,
                                                        @Query("format") String format);

    /**
     * WebAPI/GetFriendList
     *
     * @param key          Your Steam Web API key. Without this, the server will return an HTTP 403 (forbidden) error.
     * @param steamId      The 64 bit ID of the user to retrieve a list for.
     * @param relationship Filter by a given role: 'all' & 'friend'
     * @param format       (optional) The file format to return output in.
     * @return list of friends or null if profile private
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetFriendList">Wiki</a>
     */
    @GET(BASE_URL + "GetFriendList/v1")
    Call<FriendsListResponse> getFriendsList(@Query("key") String key,
                                             @Query("steamid") String steamId,
                                             @Query("relationship") String relationship,
                                             @Query("format") String format);


}
