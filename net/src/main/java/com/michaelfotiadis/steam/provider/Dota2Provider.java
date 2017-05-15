package com.michaelfotiadis.steam.provider;

import com.michaelfotiadis.steam.dota2.model.response.MatchDetailsResponse;
import com.michaelfotiadis.steam.dota2.model.response.MatchHistoryResponse;
import com.michaelfotiadis.steam.net.api.Dota2Api;

import retrofit2.Call;

public class Dota2Provider extends Provider<Dota2Api> {


    public Dota2Provider(final String key, final Dota2Api api) {
        super(key, api);
    }

    public void getMatchById(final String id,
                             final SteamCallback<MatchDetailsResponse> masterCallback) {

        final Call<MatchDetailsResponse> call = getApi().getMatchById(getKey(), id);
        execAsync(call, new WrappedCallback<>(masterCallback));

    }

    public void getMatchHistory(final String accountId,
                                final int numberOfMatches,
                                final SteamCallback<MatchHistoryResponse> masterCallback) {

        final Call<MatchHistoryResponse> call = getApi().getMatchHistory(getKey(), accountId, numberOfMatches);
        execAsync(call, new WrappedCallback<>(masterCallback));

    }


}
