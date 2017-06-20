package com.michaelfotiadis.steam.data.dota2.model.live;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetLiveLeagueGames">Wiki</a>
 */
public class LivePlayerDetails implements DotaApiModel {

    @SerializedName("player_slot")
    private final Integer playerSlot;
    @SerializedName("account_id")
    private final Integer accountId;
    @SerializedName("hero_id")
    private final Integer heroId;
    @SerializedName("kills")
    private final Integer kills;
    @SerializedName("death")
    private final Integer death;
    @SerializedName("assists")
    private final Integer assists;
    @SerializedName("last_hits")
    private final Integer lastHits;
    @SerializedName("denies")
    private final Integer denies;
    @SerializedName("gold")
    private final Integer gold;
    @SerializedName("level")
    private final Integer level;
    @SerializedName("gold_per_min")
    private final Integer goldPerMin;
    @SerializedName("xp_per_min")
    private final Integer xpPerMin;
    @SerializedName("ultimate_state")
    private final Integer ultimateState;
    @SerializedName("ultimate_cooldown")
    private final Integer ultimateCooldown;
    @SerializedName("item0")
    private final Integer item0;
    @SerializedName("item1")
    private final Integer item1;
    @SerializedName("item2")
    private final Integer item2;
    @SerializedName("item3")
    private final Integer item3;
    @SerializedName("item4")
    private final Integer item4;
    @SerializedName("item5")
    private final Integer item5;
    @SerializedName("respawn_timer")
    private final Integer respawnTimer;
    @SerializedName("position_x")
    private final Double positionX;
    @SerializedName("position_y")
    private final Double positionY;
    @SerializedName("net_worth")
    private final Integer netWorth;

    private LivePlayerDetails(final Builder builder) {
        playerSlot = builder.playerSlot;
        accountId = builder.accountId;
        heroId = builder.heroId;
        kills = builder.kills;
        death = builder.death;
        assists = builder.assists;
        lastHits = builder.lastHits;
        denies = builder.denies;
        gold = builder.gold;
        level = builder.level;
        goldPerMin = builder.goldPerMin;
        xpPerMin = builder.xpPerMin;
        ultimateState = builder.ultimateState;
        ultimateCooldown = builder.ultimateCooldown;
        item0 = builder.item0;
        item1 = builder.item1;
        item2 = builder.item2;
        item3 = builder.item3;
        item4 = builder.item4;
        item5 = builder.item5;
        respawnTimer = builder.respawnTimer;
        positionX = builder.positionX;
        positionY = builder.positionY;
        netWorth = builder.netWorth;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getPlayerSlot() {
        return playerSlot;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public Integer getHeroId() {
        return heroId;
    }

    public Integer getKills() {
        return kills;
    }

    public Integer getDeath() {
        return death;
    }

    public Integer getAssists() {
        return assists;
    }

    public Integer getLastHits() {
        return lastHits;
    }

    public Integer getDenies() {
        return denies;
    }

    public Integer getGold() {
        return gold;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getGoldPerMin() {
        return goldPerMin;
    }

    public Integer getXpPerMin() {
        return xpPerMin;
    }

    public Integer getUltimateState() {
        return ultimateState;
    }

    public Integer getUltimateCooldown() {
        return ultimateCooldown;
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

    public Integer getRespawnTimer() {
        return respawnTimer;
    }

    public Double getPositionX() {
        return positionX;
    }

    public Double getPositionY() {
        return positionY;
    }

    public Integer getNetWorth() {
        return netWorth;
    }


    public static final class Builder {
        private Integer playerSlot;
        private Integer accountId;
        private Integer heroId;
        private Integer kills;
        private Integer death;
        private Integer assists;
        private Integer lastHits;
        private Integer denies;
        private Integer gold;
        private Integer level;
        private Integer goldPerMin;
        private Integer xpPerMin;
        private Integer ultimateState;
        private Integer ultimateCooldown;
        private Integer item0;
        private Integer item1;
        private Integer item2;
        private Integer item3;
        private Integer item4;
        private Integer item5;
        private Integer respawnTimer;
        private Double positionX;
        private Double positionY;
        private Integer netWorth;

        private Builder() {
        }

        public Builder withPlayerSlot(final Integer val) {
            playerSlot = val;
            return this;
        }

        public Builder withAccountId(final Integer val) {
            accountId = val;
            return this;
        }

        public Builder withHeroId(final Integer val) {
            heroId = val;
            return this;
        }

        public Builder withKills(final Integer val) {
            kills = val;
            return this;
        }

        public Builder withDeath(final Integer val) {
            death = val;
            return this;
        }

        public Builder withAssists(final Integer val) {
            assists = val;
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

        public Builder withGold(final Integer val) {
            gold = val;
            return this;
        }

        public Builder withLevel(final Integer val) {
            level = val;
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

        public Builder withUltimateState(final Integer val) {
            ultimateState = val;
            return this;
        }

        public Builder withUltimateCooldown(final Integer val) {
            ultimateCooldown = val;
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

        public Builder withRespawnTimer(final Integer val) {
            respawnTimer = val;
            return this;
        }

        public Builder withPositionX(final Double val) {
            positionX = val;
            return this;
        }

        public Builder withPositionY(final Double val) {
            positionY = val;
            return this;
        }

        public Builder withNetWorth(final Integer val) {
            netWorth = val;
            return this;
        }

        public LivePlayerDetails build() {
            return new LivePlayerDetails(this);
        }
    }
}