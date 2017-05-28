package com.michaelfotiadis.steam.api.dota2;

import com.michaelfotiadis.steam.data.dota2.model.hero.HeroesResponse;
import com.michaelfotiadis.steam.data.dota2.model.item.ItemsResponse;
import com.michaelfotiadis.steam.data.dota2.model.rarity.Rarities;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Dota2EconApi {

    String BASE_URL = "IEconDOTA2_";

    /**
     * WebAPI/GetHeroes
     *
     * @param endpoint_id  Dota2 Prod or Dev path ID (570 or 205790)
     * @param key          Your Steam Web API key. Without this, the server will return an HTTP 403 (forbidden) error.
     * @param language     (Optional) The language to provide hero names in.
     * @param itemizedOnly (Optional) Return a list of itemized heroes only.
     * @param format       (Optional) The file format to return output in.
     * @return A list of current Dota2 Heroes
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetHeroes">Wiki</a>
     */
    @GET(BASE_URL + "_{endpoint_id}/GetHeroes/v1")
    Call<HeroesResponse> getHeroes(@Path("endpoint_id") String endpoint_id,
                                   @Query("key") String key,
                                   @Query("language") String language,
                                   @Query("itemizedonly") Boolean itemizedOnly,
                                   @Query("format") String format);

    /**
     * WebAPI/GetGameItems
     *
     * @param endpoint_id Dota2 Prod or Dev path ID (570 or 205790)
     * @param key         Your Steam Web API key. Without this, the server will return an HTTP 403 (forbidden) error.
     * @param language    (Optional) The language to provide item names in.
     * @param format      (Optional) The file format to return output in.
     * @return A list of current Dota2 Items
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetGameItems">Wiki</a>
     */
    @GET(BASE_URL + "_{endpoint_id}/GetGameItems/v1")
    Call<ItemsResponse> getItems(@Path("endpoint_id") String endpoint_id,
                                 @Query("key") String key,
                                 @Query("language") String language,
                                 @Query("format") String format);

    /**
     * WebAPI/GetRarities
     *
     * @param endpoint_id Dota2 Prod or Dev path ID (570 or 205790)
     * @param key         Your Steam Web API key. Without this, the server will return an HTTP 403 (forbidden) error.
     * @param language    (Optional) The language to provide item names in.
     * @param format      (Optional) The file format to return output in.
     * @return List of rarity objects
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetRarities">Wiki</a>
     */
    @GET(BASE_URL + "_{endpoint_id}/GetRarities/v1")
    Call<Rarities> getRarities(@Path("endpoint_id") String endpoint_id,
                               @Query("key") String key,
                               @Query("language") String language,
                               @Query("format") String format);

}
