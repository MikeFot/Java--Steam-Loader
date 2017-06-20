package com.michaelfotiadis.steam.data.steam.users.backpack;

import com.google.gson.annotations.SerializedName;

/**
 * If the item is equipped, contains an array of equip information
 * See: https://wiki.teamfortress.com/wiki/WebAPI/GetPlayerItems
 */
public class Equipped {

    @SerializedName("class")
    private final Integer weaponClass;
    @SerializedName("slot")
    private final Integer weaponSlot;

    public Equipped(final Integer weaponClass, final Integer weaponSlot) {
        this.weaponClass = weaponClass;
        this.weaponSlot = weaponSlot;
    }

    /**
     * The class the weapon is equipped to (numeric index).
     * 0 Scout
     * 1 Scout [3]
     * 2 Sniper
     * 3 Soldier
     * 4 Demoman
     * 5 Medic
     * 6 Heavy
     * 7 Pyro
     * 8 Spy
     * 9 Engineer
     *
     * @return The class the weapon is equipped to (numeric index).
     */
    public Integer getWeaponClass() {
        return weaponClass;
    }

    /**
     * The slot the weapon is equipped in (numeric index).
     * 0 Primary
     * 1 Secondary
     * 2 Melee
     * 4 Building
     * 6 PDA2
     * 7 Head
     * 8 Misc 1
     * 9 Action
     * 10 Misc 2
     * 65535 Set when the class had the item equipped previously.
     *
     * @return The slot the weapon is equipped in (numeric index).
     */
    public Integer getWeaponSlot() {
        return weaponSlot;
    }
}