package com.michaelfotiadis.steam.dota2.loader.lib.model.api.hero;

import com.michaelfotiadis.steam.dota2.loader.lib.model.api.DotaApiModel;

/**
 *
 */
public interface DotaHeroDetails extends DotaApiModel {
    int getID();

    String getPatch();

    String getName();

    int getAlignment();

    int getMovespeed();

    int getMaxDmg();

    int getMinDmg();

    int getHP();

    int getMana();

    float getHPRegen();

    float getManaRegen();

    float getArmor();

    int getRange();

    int getProjectileSpeed();

    int getBaseStr();

    int getBaseAgi();

    int getBaseInt();

    float getStrGain();

    float getAgiGain();

    float getIntGain();

    int getPrimaryStat();

    float getBaseAttackTime();

    int getDayVision();

    int getNightVision();

    float getAttackPoint();

    float getAttackSwing();

    float getCastPoint();

    float getCastSwing();

    float getTurnrate();

    int getLegs();
}
