package com.michaelfotiadis.steam.provider;

import com.michaelfotiadis.steam.model.api.VanityResponse;
import com.michaelfotiadis.steam.model.response.AccountResponse;
import com.michaelfotiadis.steam.net.api.PlayerApi;

import retrofit2.Call;

public class PlayerProvider extends Provider<PlayerApi> {


    public PlayerProvider(final String key, final PlayerApi api) {
        super(key, api);
    }

    public void getPlayerById(final String steamId,
                              final SteamCallback<AccountResponse> masterCallback) {


        final Call<AccountResponse> call = getApi().getPlayerById(getKey(), steamId);

        execAsync(call, new WrappedCallback<>(masterCallback));

    }

    public void getIdFromVanityUrl(final String url,
                                   final SteamCallback<VanityResponse> masterCallback) {


        final Call<VanityResponse> call = getApi().getIdFromVanityUrl(getKey(), url);

        execAsync(call, new WrappedCallback<>(masterCallback));

    }


}
