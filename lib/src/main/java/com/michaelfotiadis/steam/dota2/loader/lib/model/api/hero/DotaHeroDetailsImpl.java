package com.michaelfotiadis.steam.dota2.loader.lib.model.api.hero;


import com.google.gson.annotations.SerializedName;

public class DotaHeroDetailsImpl implements DotaHeroDetails {

    @SerializedName("ID")
    private final int mId;
    @SerializedName("Patch")
    private final String mPatch;
    @SerializedName("Name")
    private final String mName;
    @SerializedName("Alignment")
    private final int mAlignment;
    @SerializedName("Movespeed")
    private final int mMoveSpeed;
    @SerializedName("MaxDmg")
    private final int mMaxDmg;
    @SerializedName("MinDmg")
    private final int mMinDmg;
    @SerializedName("HP")
    private final int mHp;
    @SerializedName("Mana")
    private final int mMana;
    @SerializedName("HPRegen")
    private final float mHPRegen;
    @SerializedName("ManaRegen")
    private final float mManaRegen;
    @SerializedName("Armor")
    private final float mArmor;
    @SerializedName("Range")
    private final int mRange;
    @SerializedName("ProjectileSpeed")
    private final int mProjectileSpeed;
    @SerializedName("BaseStr")
    private final int mBaseStr;
    @SerializedName("BaseAgi")
    private final int mBaseAgi;
    @SerializedName("BaseInt")
    private final int mBaseInt;
    @SerializedName("StrGain")
    private final float mStrGain;
    @SerializedName("AgiGain")
    private final float mAgiGain;
    @SerializedName("IntGain")
    private final float mIntGain;
    @SerializedName("PrimaryStat")
    private final int mPrimaryStat;
    @SerializedName("BaseAttackTime")
    private final float mBaseAttackTime;
    @SerializedName("DayVision")
    private final int mDayVision;
    @SerializedName("NightVision")
    private final int mNightVision;
    @SerializedName("AttackPoint")
    private final float mAttackPoint;
    @SerializedName("AttackSwing")
    private final float mAttackSwing;
    @SerializedName("CastPoint")
    private final float mCastPoint;
    @SerializedName("CastSwing")
    private final float mCastSwing;
    @SerializedName("Turnrate")
    private final float mTurnrate;
    @SerializedName("Legs")
    private final int mLegs;

    public DotaHeroDetailsImpl(final int id, final String patch, final String name, final int alignment, final int moveSpeed, final int maxDmg, final int minDmg, final int hp, final int mana, final float HPRegen, final float manaRegen, final float armor, final int range, final int projectileSpeed, final int baseStr, final int baseAgi, final int baseInt, final float strGain, final float agiGain, final float intGain, final int primaryStat, final float baseAttackTime, final int dayVision, final int nightVision, final float attackPoint, final float attackSwing, final float castPoint, final float castSwing, final float turnrate, final int legs) {
        mId = id;
        mPatch = patch;
        mName = name;
        mAlignment = alignment;
        mMoveSpeed = moveSpeed;
        mMaxDmg = maxDmg;
        mMinDmg = minDmg;
        mHp = hp;
        mMana = mana;
        mHPRegen = HPRegen;
        mManaRegen = manaRegen;
        mArmor = armor;
        mRange = range;
        mProjectileSpeed = projectileSpeed;
        mBaseStr = baseStr;
        mBaseAgi = baseAgi;
        mBaseInt = baseInt;
        mStrGain = strGain;
        mAgiGain = agiGain;
        mIntGain = intGain;
        mPrimaryStat = primaryStat;
        mBaseAttackTime = baseAttackTime;
        mDayVision = dayVision;
        mNightVision = nightVision;
        mAttackPoint = attackPoint;
        mAttackSwing = attackSwing;
        mCastPoint = castPoint;
        mCastSwing = castSwing;
        mTurnrate = turnrate;
        mLegs = legs;
    }

    @Override
    public int getID() {
        return mId;
    }

    @Override
    public String getPatch() {
        return mPatch;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public int getAlignment() {
        return mAlignment;
    }

    @Override
    public int getMovespeed() {
        return mMoveSpeed;
    }

    @Override
    public int getMaxDmg() {
        return mMaxDmg;
    }

    @Override
    public int getMinDmg() {
        return mMinDmg;
    }

    @Override
    public int getHP() {
        return mHp;
    }

    @Override
    public int getMana() {
        return mMana;
    }

    @Override
    public float getHPRegen() {
        return mHPRegen;
    }

    @Override
    public float getManaRegen() {
        return mManaRegen;
    }

    @Override
    public float getArmor() {
        return mArmor;
    }

    @Override
    public int getRange() {
        return mRange;
    }

    @Override
    public int getProjectileSpeed() {
        return mProjectileSpeed;
    }

    @Override
    public int getBaseStr() {
        return mBaseStr;
    }

    @Override
    public int getBaseAgi() {
        return mBaseAgi;
    }

    @Override
    public int getBaseInt() {
        return mBaseInt;
    }

    @Override
    public float getStrGain() {
        return mStrGain;
    }

    @Override
    public float getAgiGain() {
        return mAgiGain;
    }

    @Override
    public float getIntGain() {
        return mIntGain;
    }

    @Override
    public int getPrimaryStat() {
        return mPrimaryStat;
    }

    @Override
    public float getBaseAttackTime() {
        return mBaseAttackTime;
    }

    @Override
    public int getDayVision() {
        return mDayVision;
    }

    @Override
    public int getNightVision() {
        return mNightVision;
    }

    @Override
    public float getAttackPoint() {
        return mAttackPoint;
    }

    @Override
    public float getAttackSwing() {
        return mAttackSwing;
    }

    @Override
    public float getCastPoint() {
        return mCastPoint;
    }

    @Override
    public float getCastSwing() {
        return mCastSwing;
    }

    @Override
    public float getTurnrate() {
        return mTurnrate;
    }

    @Override
    public int getLegs() {
        return mLegs;
    }

}
