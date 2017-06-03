package com.michaelfotiadis.steam.provider.image;

import com.michaelfotiadis.steam.provider.base.AssetProvider;

import java.util.Locale;

public class ImageProvider extends AssetProvider {

    private static final String BASE_ENDPOINT = "http://cdn.dota2.com/apps/dota2/images/";
    private static final String STEAM_ENDPOINT = "http://media.steampowered.com/steamcommunity/public/images/apps/%s/%s.jpg";

    private static final String ENDPOINT_ITEM = BASE_ENDPOINT + "items/%s_%s";
    private static final String ENDPOINT_HERO = BASE_ENDPOINT + "heroes/%s_%s";

    private static final String PREFIX_ITEM = "item_";
    private static final String PREFIX_HERO = "npc_dota_hero_";
    private static final String PREFIX_RECIPE = "recipe";


    public String getItemImageEndpoint(final String itemName) {

        if (itemName == null || itemName.isEmpty()) {
            return "";
        }

        String searchName = itemName.startsWith(PREFIX_ITEM) ? itemName.replaceAll(PREFIX_ITEM, "") : itemName;

        if (searchName.startsWith(PREFIX_RECIPE)) {
            searchName = PREFIX_RECIPE;
        }

        return String.format(Locale.US, ENDPOINT_ITEM, searchName.toLowerCase(Locale.US), Size.LARGE_HORIZONTAL.toString());

    }

    public String getHeroImageEndpoint(final String heroName) {

        return this.getHeroImageEndpoint(heroName, Size.LARGE_HORIZONTAL);

    }

    public String getHeroImageEndpoint(final String heroName, final Size size) {

        if (heroName == null || heroName.isEmpty()) {
            return "";
        }

        final String searchName = heroName.startsWith(PREFIX_HERO) ? heroName.replaceAll(PREFIX_HERO, "") : heroName;

        return String.format(Locale.US, ENDPOINT_HERO, searchName.toLowerCase(Locale.US), size.toString());

    }

    public String getGameImageEndpoint(final String appId, final String imageUrl) {

        if (appId == null || imageUrl == null || appId.isEmpty() || imageUrl.isEmpty()) {
            return "";
        }

        return String.format(Locale.US, STEAM_ENDPOINT, appId, imageUrl);


    }

}
