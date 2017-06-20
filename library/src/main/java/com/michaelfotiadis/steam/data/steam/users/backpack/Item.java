package com.michaelfotiadis.steam.data.steam.users.backpack;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Item {

    @SerializedName("id")
    private final Integer id;
    @SerializedName("original_id")
    private final Integer originalId;
    @SerializedName("defindex")
    private final Integer defindex;
    @SerializedName("level")
    private final Integer level;
    @SerializedName("quality")
    private final Integer quality;
    @SerializedName("inventory")
    private final Integer inventory;
    @SerializedName("quantity")
    private final Integer quantity;
    @SerializedName("equipped")
    private final List<Equipped> equipped;
    @SerializedName("flag_cannot_trade")
    private final Boolean flagCannotTrade;
    @SerializedName("flag_cannot_craft")
    private final Boolean flagCannotCraft;
    @SerializedName("attributes")
    private final List<ItemAttribute> attributes;
    @SerializedName("style")
    private final Integer style;

    public Item(final Integer id, final Integer originalId, final Integer defindex, final Integer level, final Integer quality, final Integer inventory, final Integer quantity, final List<Equipped> equipped, final Boolean flagCannotTrade, final Boolean flagCannotCraft, final List<ItemAttribute> attributes, final Integer style) {
        this.id = id;
        this.originalId = originalId;
        this.defindex = defindex;
        this.level = level;
        this.quality = quality;
        this.inventory = inventory;
        this.quantity = quantity;
        this.equipped = equipped;
        this.flagCannotTrade = flagCannotTrade;
        this.flagCannotCraft = flagCannotCraft;
        this.attributes = attributes;
        this.style = style;
    }

    /**
     * @return The unique ID of the specific item.
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return The ID of the item before it was customized, traded, or otherwise changed.
     */
    public Integer getOriginalId() {
        return originalId;
    }

    /**
     * @return The defindex of the item, as found in the item array returned from GetSchema.
     */
    public Integer getDefindex() {
        return defindex;
    }

    /**
     * @return The arbitrary "level" value of the item as displayed in the inventory.
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * @return The quality of the item (see definition in GetSchema).
     */
    public Integer getQuality() {
        return quality;
    }

    /**
     * @return An inventory token as described here, or '0' if the item has been awarded and not yet found (placed in the backpack).
     */
    public Integer getInventory() {
        return inventory;
    }

    /**
     * @return The number of "uses" an item has, generally only has a value in excess of '1' on "usable items", such as the Dueling Mini-Game.
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @return If the item is equipped, contains an array of equip information
     */
    public List<Equipped> getEquipped() {
        return equipped;
    }

    /**
     * @return A boolean value that is true if the item cannot be traded. Assume false if not present.
     */
    public Boolean getFlagCannotTrade() {
        return flagCannotTrade;
    }

    /**
     * @return A boolean value that is true if the item cannot be used in crafting. Assume false if not present.
     */
    public Boolean getFlagCannotCraft() {
        return flagCannotCraft;
    }

    /**
     * @return If the item has additional effects to the ones normally associated with it as described in GetSchema, contains a list of objects.
     */
    public List<ItemAttribute> getAttributes() {
        return attributes;
    }

    /**
     * @return An integer that can be used as an index to the item's style list.
     */
    public Integer getStyle() {
        return style;
    }
}