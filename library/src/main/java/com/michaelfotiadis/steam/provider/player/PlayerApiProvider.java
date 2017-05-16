package com.michaelfotiadis.steam.provider.player;

import com.michaelfotiadis.steam.data.FileFormat;
import com.michaelfotiadis.steam.data.player.model.VanityResponse;
import com.michaelfotiadis.steam.data.player.response.AccountResponse;
import com.michaelfotiadis.steam.net.api.PlayerApi;
import com.michaelfotiadis.steam.provider.SteamCallback;
import com.michaelfotiadis.steam.provider.base.ApiProvider;

import retrofit2.Call;

public class PlayerApiProvider extends ApiProvider<PlayerApi> {


    public PlayerApiProvider(final String key, final PlayerApi api) {
        super(key, api);
    }

    public void getPlayerById(final String steamId,
                              final SteamCallback<AccountResponse> masterCallback) {


        final Call<AccountResponse> call = getApi().getPlayerById(
                getKey(),
                steamId,
                FileFormat.JSON.toString());

        execAsync(call, new WrappedCallback<>(masterCallback));

    }

    public void getIdFromVanityUrl(final String url,
                                   final SteamCallback<VanityResponse> masterCallback) {


        final Call<VanityResponse> call = getApi().getIdFromVanityUrl(
                getKey(),
                url,
                FileFormat.JSON.toString());

        execAsync(call, new WrappedCallback<>(masterCallback));

    }


}
