package com.michaelfotiadis.steam.provider.dota;

import com.michaelfotiadis.steam.api.dota2.Dota2EconApi;
import com.michaelfotiadis.steam.data.FileFormat;
import com.michaelfotiadis.steam.data.dota2.model.hero.HeroesResponse;
import com.michaelfotiadis.steam.data.dota2.model.item.ItemsResponse;
import com.michaelfotiadis.steam.data.dota2.model.rarity.Rarities;
import com.michaelfotiadis.steam.data.games.ValveGameIds;
import com.michaelfotiadis.steam.provider.SteamCallback;

import retrofit2.Call;

public class Dota2EconApiProvider extends Dota2ApiProvider<Dota2EconApi> {


    private final String endpointId;

    public Dota2EconApiProvider(final String key, final boolean isDebugEnabled, final Dota2EconApi api) {
        super(key, api);

        this.endpointId = isDebugEnabled ? ValveGameIds.DOTA_2_BETA.toString() : ValveGameIds.DOTA_2.toString();

    }

    /**
     * A list of heroes within Dota 2.
     *
     * @param language       optional - request localized names e.g. en_gb
     * @param isItemizedOnly optional - ask for only itemized results
     * @param masterCallback {@link SteamCallback} for delivering the result
     */
    public void getHeroes(final String language,
                          final boolean isItemizedOnly,
                          final SteamCallback<HeroesResponse> masterCallback) {

        final Call<HeroesResponse> call = getApi().getHeroes(
                endpointId,
                getKey(),
                language,
                isItemizedOnly,
                FileFormat.JSON.toString());

        execAsync(call, new WrappedCallback<>(masterCallback));

    }

    /**
     * Dota 2 In-game items
     *
     * @param language       optional - request localized names e.g. en_gb
     * @param masterCallback {@link SteamCallback} for delivering the result
     */
    public void getItems(final String language,
                         final SteamCallback<ItemsResponse> masterCallback) {

        final Call<ItemsResponse> call = getApi().getItems(
                endpointId,
                getKey(),
                language,
                FileFormat.JSON.toString());

        execAsync(call, new WrappedCallback<>(masterCallback));

    }

    /**
     * Dota 2 item rarity list.
     *
     * @param language       optional - request localized names e.g. en_gb
     * @param masterCallback {@link SteamCallback} for delivering the result
     */
    public void getRarities(final String language,
                            final SteamCallback<Rarities> masterCallback) {

        final Call<Rarities> call = getApi().getRarities(
                endpointId,
                getKey(),
                language,
                FileFormat.JSON.toString());

        execAsync(call, new WrappedCallback<>(masterCallback));

    }


}
