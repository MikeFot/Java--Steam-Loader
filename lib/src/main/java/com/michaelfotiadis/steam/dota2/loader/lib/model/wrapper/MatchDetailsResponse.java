package com.michaelfotiadis.steam.dota2.loader.lib.model.wrapper;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.dota2.loader.lib.model.api.match.DotaMatchDetails;

public class MatchDetailsResponse {
    @SerializedName("result")
    private final DotaMatchDetails mResult;

    public MatchDetailsResponse(DotaMatchDetails result) {
        this.mResult = result;
    }
    public DotaMatchDetails getResult() {
        return mResult;
    }

}
