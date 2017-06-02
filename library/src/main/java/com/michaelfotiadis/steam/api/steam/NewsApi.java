package com.michaelfotiadis.steam.api.steam;

import com.michaelfotiadis.steam.data.steam.news.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsApi {

    String BASE_URL = "ISteamNews/";

    /**
     * WebAPI/GetNewsForApp
     *
     * @param appId     (uint32) The game/item to retrieve news for. This can be any valid app ID as seen in the Steam store.
     * @param maxLength (Optional) (uint32) The max length of the contents field.
     * @param endDate   (Optional) (uint32) Unix timestamp, returns posts before this date.
     * @param count     (Optional) (uint32) The max number of news items to retrieve. Default: 20.
     * @param feeds     (Optional) (string) Commma-seperated list of feed names to return news for.
     * @param format    (Optional) The file format to return output in.
     * @return News Feed for the selected game
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetNewsForApp">Wiki</a>
     */
    @GET(BASE_URL + "GetNewsForApp/v0002")
    Call<NewsResponse> getNewsForApp(@Query("appid") String appId,
                                     @Query("maxlength") String maxLength,
                                     @Query("enddate") String endDate,
                                     @Query("count") String count,
                                     @Query("feeds") String feeds,
                                     @Query("format") String format);

}
