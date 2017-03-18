package com.michaelfotiadis.steam.dota2.model.response;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.dota2.model.api.match.MatchDetails;

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
