package com.michaelfotiadis.steam.net.api.steam;

import com.michaelfotiadis.steam.data.ResponseContainer;
import com.michaelfotiadis.steam.data.steam.apps.apps.SteamAppsResponse;
import com.michaelfotiadis.steam.data.steam.apps.server.ServersContainer;
import com.michaelfotiadis.steam.data.steam.apps.uptodatecheck.UpToDateCheck;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AppsApi {

    String BASE_URL = "ISteamApps/";

    /**
     * WebAPI/GetAppList
     *
     * @param format (Optional) The file format to return output in.
     * @return A list of objects containing the title and app ID of each program available in the store.
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetAppList">Wiki</a>
     */
    @GET(BASE_URL + "GetAppList/v2/")
    Call<SteamAppsResponse> getSteamApps(@Nullable @Query("format") String format);

    /**
     * WebAPI/GetServersAtAddress
     *
     * @param ipV4   IP Address of Server (IPv4 format)
     * @param format (Optional) The file format to return output in.
     * @return Server information
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetServersAtAddress">Wiki</a>
     */
    @GET(BASE_URL + "GetServersAtAddress/v1/")
    Call<ResponseContainer<ServersContainer>> getServersAtAddress(@Nonnull @Query("addr") String ipV4,
                                                                  @Nullable @Query("format") String format);

    /**
     * WebAPI/UpToDateCheck
     *
     * @param appId            (uint32) AppID of game
     * @param installedVersion (uint32) The installed version of the game
     * @param format           @param format (Optional) The file format to return output in.
     * @return Up to date check
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/UpToDateCheck">Wiki</a>
     */
    @GET(BASE_URL + "UpToDateCheck/v1")
    Call<ResponseContainer<UpToDateCheck>> getIsAppUpToDate(@Nonnull @Query("appid") String appId,
                                                            @Nonnull @Query("version") String installedVersion,
                                                            @Nullable @Query("format") String format);

}
