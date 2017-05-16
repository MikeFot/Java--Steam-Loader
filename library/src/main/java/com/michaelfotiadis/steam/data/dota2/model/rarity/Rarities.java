package com.michaelfotiadis.steam.data.dota2.model.rarity;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

import java.util.List;

public class Rarities implements DotaApiModel {

    @SerializedName("count")
    private final Integer count;
    @SerializedName("rarities")
    private final List<Rarity> rarities = null;
    @SerializedName("status")
    private final Integer status;


    public Rarities(final Integer count, final Integer status) {
        this.count = count;
        this.status = status;
    }

    /**
     * Count of rarities. This number is off by 1 and you should invoke {@link #getActualCount()} instead.
     *
     * @return Possible number of rarities. This number appears to be[1] currently incorrect and off by one.
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Actual number of rarities
     *
     * @return adjusted number of results
     */
    public Integer getActualCount() {
        return count != null ? count - 1 : null;
    }

    /**
     * @return List of rarity objects
     */
    public List<Rarity> getRarities() {
        return rarities;
    }

    /**
     * @return http status code
     */
    public Integer getStatus() {
        return status;
    }

}