package com.michaelfotiadis.steam.dota2.loader.lib.model.wrapper;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.dota2.loader.lib.model.api.match.DotaMatchHistory;

public class MatchHistoryResponse {
    @SerializedName("result")
    private final DotaMatchHistory mResult;

    public MatchHistoryResponse(DotaMatchHistory result) {
        this.mResult = result;
    }
    public DotaMatchHistory getResult() {
        return mResult;
    }

}
