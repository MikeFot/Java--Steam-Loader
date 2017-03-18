package com.michaelfotiadis.steam.dota2.loader.lib.model.api.match;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DotaMatchHistoryImpl implements DotaMatchHistory {

    @SerializedName("status")
    private final Integer mStatus;
    @SerializedName("num_results")
    private final Integer mNumResults;
    @SerializedName("total_results")
    private final Integer mTotalResults;
    @SerializedName("results_remaining")
    private final Integer mResultsRemaining;
    @SerializedName("matches")
    private final List<DotaMatchOverview> mMatches;

    public DotaMatchHistoryImpl(final Integer status, final Integer numResults, final Integer totalResults, final Integer resultsRemaining, final List<DotaMatchOverview> matches) {
        mStatus = status;
        mNumResults = numResults;
        mTotalResults = totalResults;
        mResultsRemaining = resultsRemaining;
        mMatches = matches;
    }

    @Override
    public Integer getStatus() {
        return mStatus;
    }

    @Override
    public Integer getNumResults() {
        return mNumResults;
    }

    @Override
    public Integer getTotalResults() {
        return mTotalResults;
    }

    @Override
    public Integer getResultsRemaining() {
        return mResultsRemaining;
    }

    @Override
    public List<DotaMatchOverview> getMatches() {
        return mMatches;
    }

}