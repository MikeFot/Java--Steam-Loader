package com.michaelfotiadis.steam.dota2.loader.lib.model.api.player;


import com.michaelfotiadis.steam.dota2.loader.lib.model.api.DotaApiModel;
import com.michaelfotiadis.steam.dota2.loader.lib.model.api.hero.DotaAbilityUpgrade;

import java.util.List;

/**
 *
 */
public interface DotaPlayerDetails extends DotaApiModel {
    Long getAccountId();

    Integer getPlayerSlot();

    Integer getHeroId();

    Integer getItem0();

    Integer getItem1();

    Integer getItem2();

    Integer getItem3();

    Integer getItem4();

    Integer getItem5();

    Integer getKills();

    Integer getDeaths();

    Integer getAssists();

    Integer getLeaverStatus();

    Integer getGold();

    Integer getLastHits();

    Integer getDenies();

    Integer getGoldPerMin();

    Integer getXpPerMin();

    Integer getGoldSpent();

    Integer getHeroDamage();

    Integer getTowerDamage();

    Integer getHeroHealing();

    Integer getLevel();

    List<DotaAbilityUpgrade> getAbilityUpgrades();
}
