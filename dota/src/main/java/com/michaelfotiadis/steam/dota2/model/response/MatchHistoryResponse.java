package com.michaelfotiadis.steam.dota2.model.response;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.dota2.model.api.match.MatchHistory;

public class MatchHistoryResponse {
    @SerializedName("result")
    private final MatchHistory result;

    public MatchHistoryResponse(MatchHistory result) {
        this.result = result;
    }

    public MatchHistory getResult() {
        return result;
    }

}
