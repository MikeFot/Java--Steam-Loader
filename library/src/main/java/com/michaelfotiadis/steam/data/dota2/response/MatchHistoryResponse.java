package com.michaelfotiadis.steam.data.dota2.response;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.api.match.MatchHistory;

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
