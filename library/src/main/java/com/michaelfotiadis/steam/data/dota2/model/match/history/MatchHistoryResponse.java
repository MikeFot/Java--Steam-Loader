package com.michaelfotiadis.steam.data.dota2.model.match.history;

import com.google.gson.annotations.SerializedName;

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
