package com.michaelfotiadis.steam.provider;

import com.michaelfotiadis.steam.model.response.LibraryResponse;
import com.michaelfotiadis.steam.net.api.GamesApi;

import retrofit2.Call;

public class GamesProvider extends Provider<GamesApi> {


    public GamesProvider(final String key, final GamesApi api) {
        super(key, api);
    }

    public void getLibrary(final String steamId,
                           final boolean includeAppInfo,
                           final boolean includeFreeGames,
                           final SteamCallback<LibraryResponse> masterCallback) {


        final Call<LibraryResponse> call = getApi().getGamesList(getKey(), steamId, includeAppInfo, includeFreeGames);

        execAsync(call, new WrappedCallback<>(masterCallback));

    }


}
