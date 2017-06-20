package com.michaelfotiadis.steam.data.steam.users.backpack;

import com.google.gson.annotations.SerializedName;

/**
 * If the item has additional effects to the ones normally associated with it as described in GetSchema, contains a list of objects.
 * See: https://wiki.teamfortress.com/wiki/WebAPI/GetPlayerItems
 */
public class ItemAttribute {

    @SerializedName("defindex")
    private final Integer defindex;
    @SerializedName("value")
    private final Integer value;
    @SerializedName("float_value")
    private final Integer floatValue;
    @SerializedName("account_info")
    private final AccountInfo accountInfo;


    public ItemAttribute(final Integer defindex, final Integer value, final Integer floatValue, final AccountInfo accountInfo) {
        this.defindex = defindex;
        this.value = value;
        this.floatValue = floatValue;
        this.accountInfo = accountInfo;
    }

    /**
     * @return The index to the attributes definition in the schema, e.g. 133 for the medal number attribute for the Gentle Manne's Service Medal.
     */
    public Integer getDefindex() {
        return defindex;
    }

    /**
     * @return The value for this attribute for this item, e.g. the medal number for the Gentle Manne's Service Medal.
     */
    public Integer getValue() {
        return value;
    }

    /**
     * @return The floating point value for this attribute if it has one.
     */
    public Integer getFloatValue() {
        return floatValue;
    }

    /**
     * @return Set on attributes with a Steam ID as the value.
     */
    public AccountInfo getAccountInfo() {
        return accountInfo;
    }
}