package com.michaelfotiadis.steam.data.dota2.model.player;


import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;
import com.michaelfotiadis.steam.data.dota2.model.hero.AbilityUpgrade;
import com.michaelfotiadis.steam.data.dota2.model.hero.AdditionalUnits;
import com.michaelfotiadis.steam.data.dota2.types.LeaverStatus;

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
    @SerializedName("additional_units")
    private final List<AdditionalUnits> aditionalUnits;

    private PlayerDetails(final Builder builder) {
        accountId = builder.accountId;
        playerSlot = builder.playerSlot;
        heroId = builder.heroId;
        item0 = builder.item0;
        item1 = builder.item1;
        item2 = builder.item2;
        item3 = builder.item3;
        item4 = builder.item4;
        item5 = builder.item5;
        kills = builder.kills;
        deaths = builder.deaths;
        assists = builder.assists;
        leaverStatus = builder.leaverStatus;
        gold = builder.gold;
        lastHits = builder.lastHits;
        denies = builder.denies;
        goldPerMin = builder.goldPerMin;
        xpPerMin = builder.xpPerMin;
        goldSpent = builder.goldSpent;
        heroDamage = builder.heroDamage;
        towerDamage = builder.towerDamage;
        heroHealing = builder.heroHealing;
        level = builder.level;
        abilityUpgrades = builder.abilityUpgrades;
        aditionalUnits = builder.aditionalUnits;
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    /**
     * @return 32-bit account ID
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * @return A player's slot is returned via an 8-bit unsigned integer. The first bit represent the player's team, false if Radiant and true if dire. The final three bits represent the player's position in that team, from 0-4.
     */
    public Integer getPlayerSlot() {
        return playerSlot;
    }

    /**
     * @return The hero's unique ID. A list of hero IDs can be found via the GetHeroes method.
     */
    public Integer getHeroId() {
        return heroId;
    }

    /**
     * @return ID of the top-left inventory item.
     */
    public Integer getItem0() {
        return item0;
    }

    /**
     * @return ID of the top-center inventory item.
     */
    public Integer getItem1() {
        return item1;
    }

    /**
     * @return ID of the top-right inventory item.
     */
    public Integer getItem2() {
        return item2;
    }

    /**
     * @return ID of the bottom-left inventory item.
     */
    public Integer getItem3() {
        return item3;
    }

    /**
     * @return ID of the bottom-center inventory item.
     */
    public Integer getItem4() {
        return item4;
    }

    /**
     * @return ID of the bottom-right inventory item.
     */
    public Integer getItem5() {
        return item5;
    }

    /**
     * @return he amount of kills attributed to this player.
     */
    public Integer getKills() {
        return kills;
    }

    /**
     * @return The amount of times this player died during the match.
     */
    public Integer getDeaths() {
        return this.deaths;
    }

    /**
     * @return The amount of assists attributed to this player.
     */
    public Integer getAssists() {
        return this.assists;
    }

    /**
     * @return 0 - NONE - finished match, no abandon.
     * 1 - DISCONNECTED - player DC, no abandon.
     * 2 - DISCONNECTED_TOO_LONG - player DC > 5min, abandoned.
     * 3 - ABANDONED - player DC, clicked leave, abandoned.
     * 4 - AFK - player AFK, abandoned.
     * 5 - NEVER_CONNECTED - player never connected, no abandon.
     * 6 - NEVER_CONNECTED_TOO_LONG - player took too long to connect, no abandon.
     */
    public Integer getLeaverStatus() {
        return leaverStatus;
    }

    /**
     * @return Resolved enum leaver status
     */
    public LeaverStatus getLeaverStatusAsEnum() {
        return LeaverStatus.fromValue(leaverStatus);
    }

    /**
     * @return The amount of gold the player had remaining at the end of the match.
     */
    public Integer getGold() {
        return this.gold;
    }

    /**
     * @return The amount of last-hits the player got during the match.
     */
    public Integer getLastHits() {
        return lastHits;
    }

    /**
     * @return The amount of denies the player got during the match.
     */
    public Integer getDenies() {
        return this.denies;
    }

    /**
     * @return The player's overall gold/minute.
     */
    public Integer getGoldPerMin() {
        return this.goldPerMin;
    }

    /**
     * @return The player's overall experience/minute.
     */
    public Integer getXpPerMin() {
        return xpPerMin;
    }

    /**
     * @return The amount of gold the player spent during the match.
     */
    public Integer getGoldSpent() {
        return this.goldSpent;
    }

    /**
     * @return The amount of damage the player dealt to heroes.
     */
    public Integer getHeroDamage() {
        return heroDamage;
    }

    /**
     * @return The amount of damage the player dealt to towers.
     */
    public Integer getTowerDamage() {
        return towerDamage;
    }

    /**
     * @return The amount of health the player had healed on heroes.
     */
    public Integer getHeroHealing() {
        return heroHealing;
    }

    /**
     * @return The player's level at match end.
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * @return A list detailing a player's ability upgrades.
     */
    public List<AbilityUpgrade> getAbilityUpgrades() {
        return this.abilityUpgrades;
    }

    /**
     * @return Additional playable units owned by the player.
     */
    public List<AdditionalUnits> getAditionalUnits() {
        return aditionalUnits;
    }


    public static final class Builder {
        private Long accountId;
        private Integer playerSlot;
        private Integer heroId;
        private Integer item0;
        private Integer item1;
        private Integer item2;
        private Integer item3;
        private Integer item4;
        private Integer item5;
        private Integer kills;
        private Integer deaths;
        private Integer assists;
        private Integer leaverStatus;
        private Integer gold;
        private Integer lastHits;
        private Integer denies;
        private Integer goldPerMin;
        private Integer xpPerMin;
        private Integer goldSpent;
        private Integer heroDamage;
        private Integer towerDamage;
        private Integer heroHealing;
        private Integer level;
        private List<AbilityUpgrade> abilityUpgrades;
        private List<AdditionalUnits> aditionalUnits;

        private Builder() {
        }

        public Builder withAccountId(final Long val) {
            accountId = val;
            return this;
        }

        public Builder withPlayerSlot(final Integer val) {
            playerSlot = val;
            return this;
        }

        public Builder withHeroId(final Integer val) {
            heroId = val;
            return this;
        }

        public Builder withItem0(final Integer val) {
            item0 = val;
            return this;
        }

        public Builder withItem1(final Integer val) {
            item1 = val;
            return this;
        }

        public Builder withItem2(final Integer val) {
            item2 = val;
            return this;
        }

        public Builder withItem3(final Integer val) {
            item3 = val;
            return this;
        }

        public Builder withItem4(final Integer val) {
            item4 = val;
            return this;
        }

        public Builder withItem5(final Integer val) {
            item5 = val;
            return this;
        }

        public Builder withKills(final Integer val) {
            kills = val;
            return this;
        }

        public Builder withDeaths(final Integer val) {
            deaths = val;
            return this;
        }

        public Builder withAssists(final Integer val) {
            assists = val;
            return this;
        }

        public Builder withLeaverStatus(final Integer val) {
            leaverStatus = val;
            return this;
        }

        public Builder withGold(final Integer val) {
            gold = val;
            return this;
        }

        public Builder withLastHits(final Integer val) {
            lastHits = val;
            return this;
        }

        public Builder withDenies(final Integer val) {
            denies = val;
            return this;
        }

        public Builder withGoldPerMin(final Integer val) {
            goldPerMin = val;
            return this;
        }

        public Builder withXpPerMin(final Integer val) {
            xpPerMin = val;
            return this;
        }

        public Builder withGoldSpent(final Integer val) {
            goldSpent = val;
            return this;
        }

        public Builder withHeroDamage(final Integer val) {
            heroDamage = val;
            return this;
        }

        public Builder withTowerDamage(final Integer val) {
            towerDamage = val;
            return this;
        }

        public Builder withHeroHealing(final Integer val) {
            heroHealing = val;
            return this;
        }

        public Builder withLevel(final Integer val) {
            level = val;
            return this;
        }

        public Builder withAbilityUpgrades(final List<AbilityUpgrade> val) {
            abilityUpgrades = val;
            return this;
        }

        public Builder withAditionalUnits(final List<AdditionalUnits> val) {
            aditionalUnits = val;
            return this;
        }

        public PlayerDetails build() {
            return new PlayerDetails(this);
        }
    }
}