package com.michaelfotiadis.steam.data.dota2.response;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.api.match.MatchDetails;

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
