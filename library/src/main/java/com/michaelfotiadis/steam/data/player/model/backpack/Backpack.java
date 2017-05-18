package com.michaelfotiadis.steam.data.player.model.backpack;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * See: https://wiki.teamfortress.com/wiki/WebAPI/GetPlayerItems
 */
public class Backpack {

    @SerializedName("status")
    private final Integer status;
    @SerializedName("num_backpack_slots")
    private final Integer numBackpackSlots;
    @SerializedName("items")
    private final List<Item> items;

    public Backpack(final Integer status, final Integer numBackpackSlots, final List<Item> items) {
        this.status = status;
        this.numBackpackSlots = numBackpackSlots;
        this.items = items;
    }

    /**
     * 1 Success
     * 8 The steamid parameter was invalid or missing.
     * 15 Backpack is private.
     * 18 The Steam ID given does not exist.
     *
     * @return The status of the request.
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @return The number of backpack slots this user has.
     */
    public Integer getNumBackpackSlots() {
        return numBackpackSlots;
    }

    /**
     * @return A list of item objects.
     */
    public List<Item> getItems() {
        return items;
    }

}