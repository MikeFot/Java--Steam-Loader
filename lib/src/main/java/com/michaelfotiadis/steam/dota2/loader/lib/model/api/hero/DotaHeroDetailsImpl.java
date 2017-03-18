package com.michaelfotiadis.steam.dota2.loader.lib.model.api.hero;


import com.google.gson.annotations.SerializedName;

public class DotaHeroDetailsImpl implements DotaHeroDetails {

    @SerializedName("ID")
    private final Integer id;
    @SerializedName("Patch")
    private final String patch;
    @SerializedName("Name")
    private final String name;
    @SerializedName("Alignment")
    private final Integer alignment;
    @SerializedName("Movespeed")
    private final Integer moveSpeed;
    @SerializedName("MaxDmg")
    private final Integer maxDmg;
    @SerializedName("MinDmg")
    private final Integer minDmg;
    @SerializedName("HP")
    private final Integer hp;
    @SerializedName("Mana")
    private final Integer mana;
    @SerializedName("HPRegen")
    private final Float hpRegen;
    @SerializedName("ManaRegen")
    private final Float manaRegen;
    @SerializedName("Armor")
    private final Float armor;
    @SerializedName("Range")
    private final Integer range;
    @SerializedName("ProjectileSpeed")
    private final Integer projectileSpeed;
    @SerializedName("BaseStr")
    private final Integer baseStr;
    @SerializedName("BaseAgi")
    private final Integer baseAgi;
    @SerializedName("BaseInt")
    private final Integer baseInt;
    @SerializedName("StrGain")
    private final Float strGain;
    @SerializedName("AgiGain")
    private final Float agiGain;
    @SerializedName("IntGain")
    private final Float intGain;
    @SerializedName("PrimaryStat")
    private final Integer primaryStat;
    @SerializedName("BaseAttackTime")
    private final Float baseAttackTime;
    @SerializedName("DayVision")
    private final Integer dayVision;
    @SerializedName("NightVision")
    private final Integer nightVision;
    @SerializedName("AttackPoint")
    private final Float attackPoint;
    @SerializedName("AttackSwing")
    private final Float attackSwing;
    @SerializedName("CastPoint")
    private final Float castPoint;
    @SerializedName("CastSwing")
    private final Float castSwing;
    @SerializedName("Turnrate")
    private final Float turnrate;
    @SerializedName("Legs")
    private final Integer legs;

    public DotaHeroDetailsImpl(final Integer id, final String patch, final String name, final Integer alignment, final Integer moveSpeed, final Integer maxDmg, final Integer minDmg, final Integer hp, final Integer mana, final Float HPRegen, final Float manaRegen, final Float armor, final Integer range, final Integer projectileSpeed, final Integer baseStr, final Integer baseAgi, final Integer baseInt, final Float strGain, final Float agiGain, final Float intGain, final Integer primaryStat, final Float baseAttackTime, final Integer dayVision, final Integer nightVision, final Float attackPoint, final Float attackSwing, final Float castPoint, final Float castSwing, final Float turnrate, final Integer legs) {
        this.id = id;
        this.patch = patch;
        this.name = name;
        this.alignment = alignment;
        this.moveSpeed = moveSpeed;
        this.maxDmg = maxDmg;
        this.minDmg = minDmg;
        this.hp = hp;
        this.mana = mana;
        this.hpRegen = HPRegen;
        this.manaRegen = manaRegen;
        this.armor = armor;
        this.range = range;
        this.projectileSpeed = projectileSpeed;
        this.baseStr = baseStr;
        this.baseAgi = baseAgi;
        this.baseInt = baseInt;
        this.strGain = strGain;
        this.agiGain = agiGain;
        this.intGain = intGain;
        this.primaryStat = primaryStat;
        this.baseAttackTime = baseAttackTime;
        this.dayVision = dayVision;
        this.nightVision = nightVision;
        this.attackPoint = attackPoint;
        this.attackSwing = attackSwing;
        this.castPoint = castPoint;
        this.castSwing = castSwing;
        this.turnrate = turnrate;
        this.legs = legs;
    }

    @Override
    public Integer getID() {
        return id;
    }

    @Override
    public String getPatch() {
        return patch;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getAlignment() {
        return this.alignment;
    }

    @Override
    public Integer getMovespeed() {
        return moveSpeed;
    }

    @Override
    public Integer getMaxDmg() {
        return maxDmg;
    }

    @Override
    public Integer getMinDmg() {
        return minDmg;
    }

    @Override
    public Integer getHP() {
        return hp;
    }

    @Override
    public Integer getMana() {
        return mana;
    }

    public Float getHpRegen() {
        return hpRegen;
    }

    @Override
    public Float getManaRegen() {
        return manaRegen;
    }

    @Override
    public Float getArmor() {
        return this.armor;
    }

    @Override
    public Integer getRange() {
        return range;
    }

    @Override
    public Integer getProjectileSpeed() {
        return projectileSpeed;
    }

    @Override
    public Integer getBaseStr() {
        return this.baseStr;
    }

    @Override
    public Integer getBaseAgi() {
        return this.baseAgi;
    }

    @Override
    public Integer getBaseInt() {
        return this.baseInt;
    }

    @Override
    public Float getStrGain() {
        return strGain;
    }

    @Override
    public Float getAgiGain() {
        return this.agiGain;
    }

    @Override
    public Float getIntGain() {
        return intGain;
    }

    @Override
    public Integer getPrimaryStat() {
        return primaryStat;
    }

    @Override
    public Float getBaseAttackTime() {
        return this.baseAttackTime;
    }

    @Override
    public Integer getDayVision() {
        return this.dayVision;
    }

    @Override
    public Integer getNightVision() {
        return nightVision;
    }

    @Override
    public Float getAttackPoint() {
        return this.attackPoint;
    }

    @Override
    public Float getAttackSwing() {
        return this.attackSwing;
    }

    @Override
    public Float getCastPoint() {
        return this.castPoint;
    }

    @Override
    public Float getCastSwing() {
        return this.castSwing;
    }

    @Override
    public Float getTurnrate() {
        return turnrate;
    }

    @Override
    public Integer getLegs() {
        return legs;
    }

}
