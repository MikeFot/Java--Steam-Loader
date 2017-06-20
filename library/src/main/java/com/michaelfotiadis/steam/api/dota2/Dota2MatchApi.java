package com.michaelfotiadis.steam.api.dota2;

import com.michaelfotiadis.steam.data.ResultContainer;
import com.michaelfotiadis.steam.data.dota2.model.leagues.Leagues;
import com.michaelfotiadis.steam.data.dota2.model.live.LiveGames;
import com.michaelfotiadis.steam.data.dota2.model.match.details.MatchDetails;
import com.michaelfotiadis.steam.data.dota2.model.match.history.MatchHistory;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Dota2MatchApi {

    String BASE_URL = "IDOTA2Match_";

    /**
     * @param endpoint_id Dota2 Prod or Dev path ID (570 or 205790)
     * @param key         Your Steam Web API key. Without this, the server will return an HTTP 403 (forbidden) error.
     * @param match_id    Match id
     * @param format      (Optional) The file format to return output in.
     * @return {@link MatchDetails} for the requested match
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetMatchDetails">Wiki</a>
     */
    @GET(BASE_URL + "{endpoint_id}/GetMatchDetails/V1/")
    Call<ResultContainer<MatchDetails>> getMatchById(@Path("endpoint_id") String endpoint_id,
                                                     @Query("key") String key,
                                                     @Query("match_id") String match_id,
                                                     @Query("format") String format);

    /**
     * @param endpoint_id         Dota2 Prod or Dev path ID (570 or 205790)
     * @param key                 Your Steam Web API key. Without this, the server will return an HTTP 403 (forbidden) error.
     * @param accountId3          (Optional) 32-bit account ID.
     * @param heroId              (Optional) A list of hero IDs can be found via the GetHeroes method.
     * @param gameMode            (Optional) 0 - None
     *                            1 - All Pick
     *                            2 - Captain's Mode
     *                            3 - Random Draft
     *                            4 - Single Draft
     *                            5 - All Random
     *                            6 - Intro
     *                            7 - Diretide
     *                            8 - Reverse Captain's Mode
     *                            9 - The Greeviling
     *                            10 - Tutorial
     *                            11 - Mid Only
     *                            12 - Least Played
     *                            13 - New Player Pool
     *                            14 - Compendium Matchmaking
     *                            16 - Captain's Draft
     * @param skillBracket        (Optional) Skill bracket for the matches (Ignored if an account ID is specified). 0 - Any, 1 - Normal, 2 - High, 3 - Very High
     * @param minPlayers          (Optional) Minimum amount of players in a match for the match to be returned.
     * @param leagueId            (Optional) Only return matches from this league. A list of league IDs can be found via the GetLeagueListing method.
     * @param startAtMatchId      (Optional) Start searching for matches equal to or older than this match ID.
     * @param tournamentGamesOnly (Optional) Whether to limit results to tournament matches. (0 = false, 1 = true)
     * @param matchesRequested    (Optional) Amount of matches to include in results (default: 25).
     * @param format              (Optional) The file format to return output in.
     * @return A list of Match Overviews. Status code 15 will be returned if the user has not allowed it.
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetMatchHistory">Wiki</a>
     */
    @GET(BASE_URL + "{endpoint_id}/GetMatchHistory/V1/")
    Call<ResultContainer<MatchHistory>> getMatchHistory(@Path("endpoint_id") String endpoint_id,
                                                        @Query("key") String key,
                                                        @Query("account_id") String accountId3,
                                                        @Query("hero_id") String heroId,
                                                        @Query("game_mode") Integer gameMode,
                                                        @Query("skill") Integer skillBracket,
                                                        @Query("min_players") Integer minPlayers,
                                                        @Query("league_id") String leagueId,
                                                        @Query("start_at_match_id") String startAtMatchId,
                                                        @Query("tournament_games_only") Integer tournamentGamesOnly,
                                                        @Query("matches_requested") Integer matchesRequested,
                                                        @Query("format") String format);

    /**
     * WebAPI/GetMatchHistoryBySequenceNum
     *
     * @param endpoint_id    Dota2 Prod or Dev path ID (570 or 205790)
     * @param key            Your Steam Web API key. Without this, the server will return an HTTP 403 (forbidden) error.
     * @param startAtMatchId (Optional) (uint64)
     *                       The match sequence number to start returning results from.
     * @param matches        (Optional) (uint32)
     *                       The amount of matches to return.
     * @param format         (Optional) The file format to return output in.
     * @return {@link MatchHistory} starting at sequence number
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetMatchHistoryBySequenceNum">Wiki</a>
     */
    @GET(BASE_URL + "{endpoint_id}/GetMatchHistoryBySequenceNum/V1/")
    Call<ResultContainer<MatchHistory>> getMatchHistoryBySequenceNumber(@Path("endpoint_id") String endpoint_id,
                                                                        @Query("key") String key,
                                                                        @Query("start_at_match_seq_num") String startAtMatchId,
                                                                        @Query("matches_requested") Integer matches,
                                                                        @Query("format") String format);


    /**
     * WebAPI/GetLeagueListing
     *
     * @param endpoint_id Dota2 Prod or Dev path ID (570 or 205790)
     * @param key         Your Steam Web API key. Without this, the server will return an HTTP 403 (forbidden) error.
     * @param language    (Optional) The language to provide hero names in.
     * @param format      (Optional) The file format to return output in.
     * @return {@link Leagues} A list of leagues supported in-game via DotaTV.
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetLeagueListing">Wiki</a>
     */
    @GET(BASE_URL + "{endpoint_id}/GetLeagueListing/V1/")
    Call<ResultContainer<Leagues>> getLeagueListing(@Path("endpoint_id") String endpoint_id,
                                                    @Query("key") String key,
                                                    @Query("language") String language,
                                                    @Query("format") String format);


    /**
     * WebAPI/GetLiveLeagueGames
     *
     * @param endpoint_id Dota2 Prod or Dev path ID (570 or 205790)
     * @param key         Your Steam Web API key. Without this, the server will return an HTTP 403 (forbidden) error.
     * @param language    (Optional) The language to provide hero names in.
     * @param format      (Optional) The file format to return output in.
     * @return {@link Leagues} A list of games in-progress.
     * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetLiveLeagueGames">Wiki</a>
     */
    @GET(BASE_URL + "{endpoint_id}/GetLiveLeagueGames/V1/")
    Call<ResultContainer<LiveGames>> getLiveLeagueGames(@Path("endpoint_id") String endpoint_id,
                                                        @Query("key") String key,
                                                        @Query("language") String language,
                                                        @Query("format") String format);


}
