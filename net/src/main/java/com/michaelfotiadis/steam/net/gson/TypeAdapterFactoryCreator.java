package com.michaelfotiadis.steam.net.gson;

import com.michaelfotiadis.steam.dota2.model.api.hero.AbilityUpgrade;
import com.michaelfotiadis.steam.dota2.model.api.hero.AbilityUpgradeImpl;
import com.michaelfotiadis.steam.dota2.model.api.hero.Hero;
import com.michaelfotiadis.steam.dota2.model.api.hero.HeroContainer;
import com.michaelfotiadis.steam.dota2.model.api.hero.HeroContainerImpl;
import com.michaelfotiadis.steam.dota2.model.api.hero.HeroDetails;
import com.michaelfotiadis.steam.dota2.model.api.hero.HeroDetailsImpl;
import com.michaelfotiadis.steam.dota2.model.api.hero.HeroImpl;
import com.michaelfotiadis.steam.dota2.model.api.item.Item;
import com.michaelfotiadis.steam.dota2.model.api.item.ItemContainer;
import com.michaelfotiadis.steam.dota2.model.api.item.ItemContainerImpl;
import com.michaelfotiadis.steam.dota2.model.api.item.ItemImpl;
import com.michaelfotiadis.steam.dota2.model.api.match.MatchDetails;
import com.michaelfotiadis.steam.dota2.model.api.match.MatchDetailsImpl;
import com.michaelfotiadis.steam.dota2.model.api.match.MatchHistory;
import com.michaelfotiadis.steam.dota2.model.api.match.MatchHistoryImpl;
import com.michaelfotiadis.steam.dota2.model.api.match.MatchOverview;
import com.michaelfotiadis.steam.dota2.model.api.match.MatchOverviewImpl;
import com.michaelfotiadis.steam.dota2.model.api.player.PlayerDetails;
import com.michaelfotiadis.steam.dota2.model.api.player.PlayerDetailsImpl;
import com.michaelfotiadis.steam.dota2.model.api.player.PlayerOverview;
import com.michaelfotiadis.steam.dota2.model.api.player.PlayerOverviewImpl;
import com.michaelfotiadis.steam.model.api.AccountDetails;
import com.michaelfotiadis.steam.model.api.AccountDetailsImpl;
import com.michaelfotiadis.steam.model.api.Game;
import com.michaelfotiadis.steam.model.api.GameImpl;
import com.michaelfotiadis.steam.model.api.Library;
import com.michaelfotiadis.steam.model.api.LibraryImpl;
import com.michaelfotiadis.steam.model.api.User;
import com.michaelfotiadis.steam.model.api.UserImpl;
import com.michaelfotiadis.steam.model.api.VanityResponse;
import com.michaelfotiadis.steam.model.api.VanityResponseImpl;

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
        // Dota Hero model
        mAdapters.add(create(AbilityUpgrade.class, AbilityUpgradeImpl.class));
        mAdapters.add(create(Hero.class, HeroImpl.class));
        mAdapters.add(create(HeroContainer.class, HeroContainerImpl.class));
        mAdapters.add(create(HeroDetails.class, HeroDetailsImpl.class));
        // Dota Item model
        mAdapters.add(create(Item.class, ItemImpl.class));
        mAdapters.add(create(ItemContainer.class, ItemContainerImpl.class));
        // Dota Player model
        mAdapters.add(create(PlayerOverview.class, PlayerOverviewImpl.class));
        mAdapters.add(create(PlayerDetails.class, PlayerDetailsImpl.class));
        // Dota Match model
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