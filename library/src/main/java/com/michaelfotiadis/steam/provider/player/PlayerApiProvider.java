package com.michaelfotiadis.steam.provider.player;

import com.michaelfotiadis.steam.data.FileFormat;
import com.michaelfotiadis.steam.data.ResponseContainer;
import com.michaelfotiadis.steam.data.steam.users.player.PlayerSummaries;
import com.michaelfotiadis.steam.data.steam.users.vanity.Vanity;
import com.michaelfotiadis.steam.net.api.steam.UsersApi;
import com.michaelfotiadis.steam.provider.SteamCallback;
import com.michaelfotiadis.steam.provider.base.ApiProvider;

import retrofit2.Call;

public class PlayerApiProvider extends ApiProvider<UsersApi> {


    public PlayerApiProvider(final String key, final UsersApi api) {
        super(key, api);
    }

    public void getPlayerSummaries(final String[] steamIds,
                                   final SteamCallback<ResponseContainer<PlayerSummaries>> masterCallback) {

        String query = steamIds[0];
        if (steamIds.length > 1) {
            for (int i = 1; i < steamIds.length; i++) {
                query += "," + steamIds[i];
            }
        }

        final Call<ResponseContainer<PlayerSummaries>> call = getApi().getPlayerSummaries(
                getKey(),
                query,
                FileFormat.JSON.toString());

        execAsync(call, new WrappedCallback<>(masterCallback));

    }

    public void getIdFromVanityUrl(final String url,
                                   final SteamCallback<ResponseContainer<Vanity>> masterCallback) {


        final Call<ResponseContainer<Vanity>> call = getApi().getResolveVanityUrl(
                getKey(),
                url,
                FileFormat.JSON.toString());

        execAsync(call, new WrappedCallback<>(masterCallback));

    }


}
