package com.michaelfotiadis.steam.data.dota2.model.hero;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

public class AdditionalUnits implements DotaApiModel {

    @SerializedName("unitname")
    private final String unitName;
    @SerializedName("item_0")
    private final Integer item0;
    @SerializedName("item_1")
    private final Integer item1;
    @SerializedName("item_2")
    private final Integer item2;
    @SerializedName("item_3")
    private final Integer item3;
    @SerializedName("item_4")
    private final Integer item4;
    @SerializedName("item_5")
    private final Integer item5;

    public AdditionalUnits(final String unitName, final Integer item0, final Integer item1, final Integer item2, final Integer item3, final Integer item4, final Integer item5) {
        this.unitName = unitName;
        this.item0 = item0;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item5;
    }

    private AdditionalUnits(final Builder builder) {
        unitName = builder.unitName;
        item0 = builder.item0;
        item1 = builder.item1;
        item2 = builder.item2;
        item3 = builder.item3;
        item4 = builder.item4;
        item5 = builder.item5;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * @return The name of the unit
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * @return ID of the top-left inventory item.
     */
    public Integer getItem0() {
        return item0;
    }

    /**
     * @return ID of the top-center inventory item.
     */
    public Integer getItem1() {
        return item1;
    }

    /**
     * @return ID of the top-right inventory item.
     */
    public Integer getItem2() {
        return item2;
    }

    /**
     * @return ID of the bottom-left inventory item.
     */
    public Integer getItem3() {
        return item3;
    }

    /**
     * @return ID of the bottom-center inventory item.
     */
    public Integer getItem4() {
        return item4;
    }

    /**
     * @return ID of the bottom-right inventory item.
     */
    public Integer getItem5() {
        return item5;
    }


    public static final class Builder {
        private String unitName;
        private Integer item0;
        private Integer item1;
        private Integer item2;
        private Integer item3;
        private Integer item4;
        private Integer item5;

        private Builder() {
        }

        public Builder withUnitName(final String val) {
            unitName = val;
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

        public AdditionalUnits build() {
            return new AdditionalUnits(this);
        }
    }
}
