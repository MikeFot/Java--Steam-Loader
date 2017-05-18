package com.michaelfotiadis.steam.data.dota2.model.match.history;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;
import com.michaelfotiadis.steam.data.dota2.model.match.overview.MatchOverview;

import java.util.List;

public class MatchHistory implements DotaApiModel {

    @SerializedName("status")
    private final Integer status;
    @SerializedName("statusDetail")
    private final String statusDetail;
    @SerializedName("num_results")
    private final Integer numResults;
    @SerializedName("total_results")
    private final Integer totalResults;
    @SerializedName("results_remaining")
    private final Integer resultsRemaining;
    @SerializedName("matches")
    private final List<MatchOverview> matches;

    public MatchHistory(final Integer status, final String statusDetail, final Integer numResults, final Integer totalResults, final Integer resultsRemaining, final List<MatchOverview> matches) {
        this.status = status;
        this.statusDetail = statusDetail;
        this.numResults = numResults;
        this.totalResults = totalResults;
        this.resultsRemaining = resultsRemaining;
        this.matches = matches;
    }

    /**
     * 1 - Success
     * 8 - 'matches_requested' must be greater than 0.
     * 15 - Cannot get match history for a user that hasn't allowed it.
     *
     * @return status code
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @return The number of matches in this response.
     */
    public Integer getNumResults() {
        return numResults;
    }

    /**
     * @return The total number of matches for the query.
     */
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * @return The number of matches left for this query.
     */
    public Integer getResultsRemaining() {
        return resultsRemaining;
    }

    /**
     * @return A list of matches.
     */
    public List<MatchOverview> getMatches() {
        return matches;
    }

    /**
     * @return A message explaining the status, should status not be 1.
     */
    public String getStatusDetail() {
        return statusDetail;
    }
}