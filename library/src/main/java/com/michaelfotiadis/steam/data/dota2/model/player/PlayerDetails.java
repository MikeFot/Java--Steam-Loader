package com.michaelfotiadis.steam.data.dota2.model.player;


import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;
import com.michaelfotiadis.steam.data.dota2.model.hero.AbilityUpgrade;

import java.util.List;

@SuppressWarnings("ClassWithTooManyFields")
public class PlayerDetails implements DotaApiModel {

    @SerializedName("account_id")
    private final Long accountId;
    @SerializedName("player_slot")
    private final Integer playerSlot;
    @SerializedName("hero_id")
    private final Integer heroId;
    @SerializedName("item_0")
    private final Integer item0;
    @SerializedName("item_1")
    private final Integer item1;
    @SerializedName("item_2")
    private final Integer item2;
    @SerializedName("item_3")
    private final Integer item3;
    @SerializedName("item_4")
    private final Integer item4;
    @SerializedName("item_5")
    private final Integer item5;
    @SerializedName("kills")
    private final Integer kills;
    @SerializedName("deaths")
    private final Integer deaths;
    @SerializedName("assists")
    private final Integer assists;
    @SerializedName("leaver_status")
    private final Integer leaverStatus;
    @SerializedName("gold")
    private final Integer gold;
    @SerializedName("last_hits")
    private final Integer lastHits;
    @SerializedName("denies")
    private final Integer denies;
    @SerializedName("gold_per_min")
    private final Integer goldPerMin;
    @SerializedName("xp_per_min")
    private final Integer xpPerMin;
    @SerializedName("gold_spent")
    private final Integer goldSpent;
    @SerializedName("hero_damage")
    private final Integer heroDamage;
    @SerializedName("tower_damage")
    private final Integer towerDamage;
    @SerializedName("hero_healing")
    private final Integer heroHealing;
    @SerializedName("level")
    private final Integer level;
    @SerializedName("ability_upgrades")
    private final List<AbilityUpgrade> abilityUpgrades;

    public PlayerDetails(final Long accountId, final Integer playerSlot, final Integer heroId, final Integer item0, final Integer item1, final Integer item2, final Integer item3, final Integer item4, final Integer item5, final Integer kills, final Integer deaths, final Integer assists, final Integer leaverStatus, final Integer gold, final Integer lastHits, final Integer denies, final Integer goldPerMin, final Integer xpPerMin, final Integer goldSpent, final Integer heroDamage, final Integer towerDamage, final Integer heroHealing, final Integer level, final List<AbilityUpgrade> abilityUpgrades) {
        this.accountId = accountId;
        this.playerSlot = playerSlot;
        this.heroId = heroId;
        this.item0 = item0;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item5;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.leaverStatus = leaverStatus;
        this.gold = gold;
        this.lastHits = lastHits;
        this.denies = denies;
        this.goldPerMin = goldPerMin;
        this.xpPerMin = xpPerMin;
        this.goldSpent = goldSpent;
        this.heroDamage = heroDamage;
        this.towerDamage = towerDamage;
        this.heroHealing = heroHealing;
        this.level = level;
        this.abilityUpgrades = abilityUpgrades;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public Integer getPlayerSlot() {
        return playerSlot;
    }

    public Integer getHeroId() {
        return heroId;
    }

    public Integer getItem0() {
        return item0;
    }

    public Integer getItem1() {
        return item1;
    }

    public Integer getItem2() {
        return item2;
    }

    public Integer getItem3() {
        return item3;
    }

    public Integer getItem4() {
        return item4;
    }

    public Integer getItem5() {
        return item5;
    }

    public Integer getKills() {
        return kills;
    }

    public Integer getDeaths() {
        return this.deaths;
    }

    public Integer getAssists() {
        return this.assists;
    }

    public Integer getLeaverStatus() {
        return leaverStatus;
    }

    public Integer getGold() {
        return this.gold;
    }

    public Integer getLastHits() {
        return lastHits;
    }

    public Integer getDenies() {
        return this.denies;
    }

    public Integer getGoldPerMin() {
        return this.goldPerMin;
    }

    public Integer getXpPerMin() {
        return xpPerMin;
    }

    public Integer getGoldSpent() {
        return this.goldSpent;
    }

    public Integer getHeroDamage() {
        return heroDamage;
    }

    public Integer getTowerDamage() {
        return towerDamage;
    }

    public Integer getHeroHealing() {
        return heroHealing;
    }

    public Integer getLevel() {
        return level;
    }

    public List<AbilityUpgrade> getAbilityUpgrades() {
        return this.abilityUpgrades;
    }

}