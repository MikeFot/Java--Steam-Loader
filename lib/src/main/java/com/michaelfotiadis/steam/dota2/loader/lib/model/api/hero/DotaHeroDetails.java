package com.michaelfotiadis.steam.dota2.loader.lib.model.api.hero;

import com.michaelfotiadis.steam.dota2.loader.lib.model.api.DotaApiModel;

/**
 *
 */
public interface DotaHeroDetails extends DotaApiModel {
    Integer getID();

    String getPatch();

    String getName();

    Integer getAlignment();

    Integer getMovespeed();

    Integer getMaxDmg();

    Integer getMinDmg();

    Integer getHP();

    Integer getMana();

    Float getHpRegen();

    Float getManaRegen();

    Float getArmor();

    Integer getRange();

    Integer getProjectileSpeed();

    Integer getBaseStr();

    Integer getBaseAgi();

    Integer getBaseInt();

    Float getStrGain();

    Float getAgiGain();

    Float getIntGain();

    Integer getPrimaryStat();

    Float getBaseAttackTime();

    Integer getDayVision();

    Integer getNightVision();

    Float getAttackPoint();

    Float getAttackSwing();

    Float getCastPoint();

    Float getCastSwing();

    Float getTurnrate();

    Integer getLegs();
}
