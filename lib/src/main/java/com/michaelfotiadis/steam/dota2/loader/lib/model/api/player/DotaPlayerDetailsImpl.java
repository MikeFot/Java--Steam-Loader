package com.michaelfotiadis.steam.dota2.loader.lib.model.api.player;


import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.dota2.loader.lib.model.api.hero.DotaAbilityUpgrade;

import java.util.List;

@SuppressWarnings("ClassWithTooManyFields")
public class DotaPlayerDetailsImpl implements DotaPlayerDetails {

    @SerializedName("account_id")
    private final Long mAccountId;
    @SerializedName("player_slot")
    private final Integer mPlayerSlot;
    @SerializedName("hero_id")
    private final Integer mHeroId;
    @SerializedName("item_0")
    private final Integer mItem0;
    @SerializedName("item_1")
    private final Integer mItem1;
    @SerializedName("item_2")
    private final Integer mItem2;
    @SerializedName("item_3")
    private final Integer mItem3;
    @SerializedName("item_4")
    private final Integer mItem4;
    @SerializedName("item_5")
    private final Integer mItem5;
    @SerializedName("kills")
    private final Integer mKills;
    @SerializedName("deaths")
    private final Integer mDeaths;
    @SerializedName("assists")
    private final Integer mAssists;
    @SerializedName("leaver_status")
    private final Integer mLeaverStatus;
    @SerializedName("gold")
    private final Integer mGold;
    @SerializedName("last_hits")
    private final Integer mLastHits;
    @SerializedName("denies")
    private final Integer mDenies;
    @SerializedName("gold_per_min")
    private final Integer mGoldPerMin;
    @SerializedName("xp_per_min")
    private final Integer mXpPerMin;
    @SerializedName("gold_spent")
    private final Integer mGoldSpent;
    @SerializedName("hero_damage")
    private final Integer mHeroDamage;
    @SerializedName("tower_damage")
    private final Integer mTowerDamage;
    @SerializedName("hero_healing")
    private final Integer mHeroHealing;
    @SerializedName("level")
    private final Integer mLevel;
    @SerializedName("ability_upgrades")
    private final List<DotaAbilityUpgrade> mAbilityUpgrades;

    public DotaPlayerDetailsImpl(final Long accountId, final Integer playerSlot, final Integer heroId, final Integer item0, final Integer item1, final Integer item2, final Integer item3, final Integer item4, final Integer item5, final Integer kills, final Integer deaths, final Integer assists, final Integer leaverStatus, final Integer gold, final Integer lastHits, final Integer denies, final Integer goldPerMin, final Integer xpPerMin, final Integer goldSpent, final Integer heroDamage, final Integer towerDamage, final Integer heroHealing, final Integer level, final List<DotaAbilityUpgrade> abilityUpgrades) {
        mAccountId = accountId;
        mPlayerSlot = playerSlot;
        mHeroId = heroId;
        mItem0 = item0;
        mItem1 = item1;
        mItem2 = item2;
        mItem3 = item3;
        mItem4 = item4;
        mItem5 = item5;
        mKills = kills;
        mDeaths = deaths;
        mAssists = assists;
        mLeaverStatus = leaverStatus;
        mGold = gold;
        mLastHits = lastHits;
        mDenies = denies;
        mGoldPerMin = goldPerMin;
        mXpPerMin = xpPerMin;
        mGoldSpent = goldSpent;
        mHeroDamage = heroDamage;
        mTowerDamage = towerDamage;
        mHeroHealing = heroHealing;
        mLevel = level;
        mAbilityUpgrades = abilityUpgrades;
    }

    @Override
    public Long getAccountId() {
        return mAccountId;
    }

    @Override
    public Integer getPlayerSlot() {
        return mPlayerSlot;
    }

    @Override
    public Integer getHeroId() {
        return mHeroId;
    }

    @Override
    public Integer getItem0() {
        return mItem0;
    }

    @Override
    public Integer getItem1() {
        return mItem1;
    }

    @Override
    public Integer getItem2() {
        return mItem2;
    }

    @Override
    public Integer getItem3() {
        return mItem3;
    }

    @Override
    public Integer getItem4() {
        return mItem4;
    }

    @Override
    public Integer getItem5() {
        return mItem5;
    }

    @Override
    public Integer getKills() {
        return mKills;
    }

    @Override
    public Integer getDeaths() {
        return mDeaths;
    }

    @Override
    public Integer getAssists() {
        return mAssists;
    }

    @Override
    public Integer getLeaverStatus() {
        return mLeaverStatus;
    }

    @Override
    public Integer getGold() {
        return mGold;
    }

    @Override
    public Integer getLastHits() {
        return mLastHits;
    }

    @Override
    public Integer getDenies() {
        return mDenies;
    }

    @Override
    public Integer getGoldPerMin() {
        return mGoldPerMin;
    }

    @Override
    public Integer getXpPerMin() {
        return mXpPerMin;
    }

    @Override
    public Integer getGoldSpent() {
        return mGoldSpent;
    }

    @Override
    public Integer getHeroDamage() {
        return mHeroDamage;
    }

    @Override
    public Integer getTowerDamage() {
        return mTowerDamage;
    }

    @Override
    public Integer getHeroHealing() {
        return mHeroHealing;
    }

    @Override
    public Integer getLevel() {
        return mLevel;
    }

    @Override
    public List<DotaAbilityUpgrade> getAbilityUpgrades() {
        return mAbilityUpgrades;
    }

}