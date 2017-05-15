package com.michaelfotiadis.steam.provider.net.gson;

import com.michaelfotiadis.steam.data.dota2.api.hero.AbilityUpgrade;
import com.michaelfotiadis.steam.data.dota2.api.hero.AbilityUpgradeImpl;
import com.michaelfotiadis.steam.data.dota2.api.hero.Hero;
import com.michaelfotiadis.steam.data.dota2.api.hero.HeroContainer;
import com.michaelfotiadis.steam.data.dota2.api.hero.HeroContainerImpl;
import com.michaelfotiadis.steam.data.dota2.api.hero.HeroDetails;
import com.michaelfotiadis.steam.data.dota2.api.hero.HeroDetailsImpl;
import com.michaelfotiadis.steam.data.dota2.api.hero.HeroImpl;
import com.michaelfotiadis.steam.data.dota2.api.item.Item;
import com.michaelfotiadis.steam.data.dota2.api.item.ItemContainer;
import com.michaelfotiadis.steam.data.dota2.api.item.ItemContainerImpl;
import com.michaelfotiadis.steam.data.dota2.api.item.ItemImpl;
import com.michaelfotiadis.steam.data.dota2.api.match.MatchDetails;
import com.michaelfotiadis.steam.data.dota2.api.match.MatchDetailsImpl;
import com.michaelfotiadis.steam.data.dota2.api.match.MatchHistory;
import com.michaelfotiadis.steam.data.dota2.api.match.MatchHistoryImpl;
import com.michaelfotiadis.steam.data.dota2.api.match.MatchOverview;
import com.michaelfotiadis.steam.data.dota2.api.match.MatchOverviewImpl;
import com.michaelfotiadis.steam.data.dota2.api.player.PlayerDetails;
import com.michaelfotiadis.steam.data.dota2.api.player.PlayerDetailsImpl;
import com.michaelfotiadis.steam.data.dota2.api.player.PlayerOverview;
import com.michaelfotiadis.steam.data.dota2.api.player.PlayerOverviewImpl;
import com.michaelfotiadis.steam.data.player.api.AccountDetails;
import com.michaelfotiadis.steam.data.player.api.AccountDetailsImpl;
import com.michaelfotiadis.steam.data.player.api.Game;
import com.michaelfotiadis.steam.data.player.api.GameImpl;
import com.michaelfotiadis.steam.data.player.api.Library;
import com.michaelfotiadis.steam.data.player.api.LibraryImpl;
import com.michaelfotiadis.steam.data.player.api.User;
import com.michaelfotiadis.steam.data.player.api.UserImpl;
import com.michaelfotiadis.steam.data.player.api.VanityResponse;
import com.michaelfotiadis.steam.data.player.api.VanityResponseImpl;

import java.util.HashSet;
import java.util.Set;

/* package */ final class TypeAdapterFactoryCreator {
    private static final String JSON_TYPE_FIELD = "gsonObjectType";

    private final Set<RuntimeTypeAdapterFactory> mAdapters;
    private final Set<Class<?>> mBaseTypes = new HashSet<>();
    private final Set<Class<?>> mSubTypes = new HashSet<>();

    TypeAdapterFactoryCreator() {
        mAdapters = new HashSet<>();

        // Steam models
        mAdapters.add(create(AccountDetails.class, AccountDetailsImpl.class));
        mAdapters.add(create(Game.class, GameImpl.class));
        mAdapters.add(create(Library.class, LibraryImpl.class));
        mAdapters.add(create(User.class, UserImpl.class));
        mAdapters.add(create(VanityResponse.class, VanityResponseImpl.class));
        // Dota Hero player
        mAdapters.add(create(AbilityUpgrade.class, AbilityUpgradeImpl.class));
        mAdapters.add(create(Hero.class, HeroImpl.class));
        mAdapters.add(create(HeroContainer.class, HeroContainerImpl.class));
        mAdapters.add(create(HeroDetails.class, HeroDetailsImpl.class));
        // Dota Item player
        mAdapters.add(create(Item.class, ItemImpl.class));
        mAdapters.add(create(ItemContainer.class, ItemContainerImpl.class));
        // Dota Player player
        mAdapters.add(create(PlayerOverview.class, PlayerOverviewImpl.class));
        mAdapters.add(create(PlayerDetails.class, PlayerDetailsImpl.class));
        // Dota Match player
        mAdapters.add(create(MatchDetails.class, MatchDetailsImpl.class));
        mAdapters.add(create(MatchHistory.class, MatchHistoryImpl.class));
        mAdapters.add(create(MatchOverview.class, MatchOverviewImpl.class));

    }

    /**
     * Generates a collection of {@link RuntimeTypeAdapterFactory}
     *
     * @return {@link Set} of {@link RuntimeTypeAdapterFactory}
     */
    Set<RuntimeTypeAdapterFactory> getAdapters() {
        return mAdapters;
    }

    private <T> RuntimeTypeAdapterFactory create(final Class<T> baseType, final Class<? extends T> subType) {
        final String subTypeName = subType.getSimpleName();

        if (!mBaseTypes.add(baseType)) {
            throw new IllegalStateException("You have already added BaseType " + baseType.getName());
        }

        if (!mSubTypes.add(subType)) {
            throw new IllegalStateException("You have already added SubType " + subType.getName());
        }

        return RuntimeTypeAdapterFactory
                .of(baseType, subTypeName, JSON_TYPE_FIELD)
                .registerSubtype(subType, subTypeName);
    }

}