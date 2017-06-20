package com.michaelfotiadis.steam.provider.player;

import com.michaelfotiadis.steam.api.steam.PlayerApi;
import com.michaelfotiadis.steam.data.FileFormat;
import com.michaelfotiadis.steam.data.ResponseContainer;
import com.michaelfotiadis.steam.data.steam.player.badges.Badges;
import com.michaelfotiadis.steam.data.steam.player.level.PlayerLevel;
import com.michaelfotiadis.steam.data.steam.player.library.Library;
import com.michaelfotiadis.steam.data.steam.player.quests.Quests;
import com.michaelfotiadis.steam.data.steam.users.recent.RecentlyPlayed;
import com.michaelfotiadis.steam.provider.SteamCallback;
import com.michaelfotiadis.steam.provider.base.ApiProvider;

import java.util.HashMap;

import retrofit2.Call;

public class PlayerApiProvider extends ApiProvider<PlayerApi> {


    public PlayerApiProvider(final String key, final PlayerApi api) {
        super(key, api);
    }

    /**
     * @param id64             The 64 bit ID of the player.
     * @param includeAppInfo   true if you want application info included
     * @param includeFreeGames true if you want free games included
     * @param masterCallback   {@link SteamCallback} for delivering the result
     */
    public void getLibrary(final String id64,
                           final Boolean includeAppInfo,
                           final Boolean includeFreeGames,
                           final SteamCallback<ResponseContainer<Library>> masterCallback) {

        final int appInfo = (includeAppInfo) ? 1 : 0;
        final int freeGames = (includeFreeGames) ? 1 : 0;

        final Call<ResponseContainer<Library>> call = getApi().getGamesList(
                getKey(),
                sanitiseId64(id64),
                appInfo,
                freeGames,
                new HashMap<String, String>(),
                FileFormat.JSON.toString());

        execAsync(call, new WrappedCallback<>(masterCallback));

    }

    /**
     * Returns a response containing the player level
     *
     * @param id64           The 64 bit ID of the player.
     * @param masterCallback {@link SteamCallback} for delivering the result
     */
    public void getPlayerLevel(final String id64,
                               final SteamCallback<ResponseContainer<PlayerLevel>> masterCallback) {

        final Call<ResponseContainer<PlayerLevel>> call = getApi().getPlayerLevel(
                getKey(),
                sanitiseId64(id64),
                FileFormat.JSON.toString());

        execAsync(call, new WrappedCallback<>(masterCallback));

    }

    /**
     * Returns a list of recently played games for the selected player
     *
     * @param id64           The 64 bit ID of the player.
     * @param masterCallback {@link SteamCallback} for delivering the result
     */
    public void getRecentlyPlayed(final String id64,
                                  final SteamCallback<ResponseContainer<RecentlyPlayed>> masterCallback) {

        final Call<ResponseContainer<RecentlyPlayed>> call = getApi().getRecentlyPlayed(
                getKey(),
                sanitiseId64(id64),
                null,
                FileFormat.JSON.toString());

        execAsync(call, new WrappedCallback<>(masterCallback));

    }

    /**
     * Returns a list badges for the selected player
     *
     * @param id64           The 64 bit ID of the player.
     * @param masterCallback {@link SteamCallback} for delivering the result
     */
    public void getBadges(final String id64,
                          final SteamCallback<ResponseContainer<Badges>> masterCallback) {

        final Call<ResponseContainer<Badges>> call = getApi().getBadges(
                getKey(),
                sanitiseId64(id64),
                FileFormat.JSON.toString());

        execAsync(call, new WrappedCallback<>(masterCallback));

    }

    /**
     * Returns badge progess for the selected player and badge id
     *
     * @param id64           The 64 bit ID of the player.
     * @param badgeId        (optional) badge id
     * @param masterCallback {@link SteamCallback} for delivering the result
     */
    public void getCommunityBadgeProgress(final String id64,
                                          final String badgeId,
                                          final SteamCallback<ResponseContainer<Quests>> masterCallback) {

        final Call<ResponseContainer<Quests>> call = getApi().getCommunityBadgeProgress(
                getKey(),
                sanitiseId64(id64),
                badgeId,
                FileFormat.JSON.toString());

        execAsync(call, new WrappedCallback<>(masterCallback));

    }


}
