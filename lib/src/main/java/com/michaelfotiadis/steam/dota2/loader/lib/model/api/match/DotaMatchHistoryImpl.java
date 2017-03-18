package com.michaelfotiadis.steam.dota2.loader.lib.model.api.match;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DotaMatchHistoryImpl implements DotaMatchHistory {

    @SerializedName("status")
    private final Integer status;
    @SerializedName("num_results")
    private final Integer numResults;
    @SerializedName("total_results")
    private final Integer totalResults;
    @SerializedName("results_remaining")
    private final Integer resultsRemaining;
    @SerializedName("matches")
    private final List<DotaMatchOverview> matches;

    public DotaMatchHistoryImpl(final Integer status, final Integer numResults, final Integer totalResults, final Integer resultsRemaining, final List<DotaMatchOverview> matches) {
        this.status = status;
        this.numResults = numResults;
        this.totalResults = totalResults;
        this.resultsRemaining = resultsRemaining;
        this.matches = matches;
    }

    @Override
    public Integer getStatus() {
        return status;
    }

    @Override
    public Integer getNumResults() {
        return numResults;
    }

    @Override
    public Integer getTotalResults() {
        return totalResults;
    }

    @Override
    public Integer getResultsRemaining() {
        return resultsRemaining;
    }

    @Override
    public List<DotaMatchOverview> getMatches() {
        return matches;
    }

}