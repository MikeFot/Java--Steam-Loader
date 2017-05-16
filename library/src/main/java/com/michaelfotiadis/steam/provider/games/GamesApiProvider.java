package com.michaelfotiadis.steam.provider.games;

import com.michaelfotiadis.steam.data.FileFormat;
import com.michaelfotiadis.steam.data.player.response.LibraryResponse;
import com.michaelfotiadis.steam.net.api.GamesApi;
import com.michaelfotiadis.steam.provider.SteamCallback;
import com.michaelfotiadis.steam.provider.base.ApiProvider;

import retrofit2.Call;

public class GamesApiProvider extends ApiProvider<GamesApi> {


    public GamesApiProvider(final String key, final GamesApi api) {
        super(key, api);
    }

    public void getLibrary(final String steamId,
                           final boolean includeAppInfo,
                           final boolean includeFreeGames,
                           final SteamCallback<LibraryResponse> masterCallback) {


        final Call<LibraryResponse> call = getApi().getGamesList(
                getKey(),
                steamId,
                includeAppInfo,
                includeFreeGames,
                FileFormat.JSON.toString());

        execAsync(call, new WrappedCallback<>(masterCallback));

    }


}
