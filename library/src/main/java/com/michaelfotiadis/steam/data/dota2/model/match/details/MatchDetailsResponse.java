package com.michaelfotiadis.steam.data.dota2.model.match.details;

import com.google.gson.annotations.SerializedName;

public class MatchDetailsResponse {
    @SerializedName("result")
    private final MatchDetails result;

    public MatchDetailsResponse(MatchDetails result) {
        this.result = result;
    }

    public MatchDetails getResult() {
        return result;
    }

}
