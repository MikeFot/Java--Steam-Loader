package com.michaelfotiadis.steam.data.steam.player.library;


import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.steam.SteamApiModel;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetOwnedGames">Wiki</a>
 */
public class Game implements SteamApiModel {

    @SerializedName("appid")
    private final Long appId;
    @SerializedName("name")
    private final String name;
    @SerializedName("playtime_forever")
    private final Integer playtimeForever;
    @SerializedName("img_icon_url")
    private final String imgIconUrl;
    @SerializedName("img_logo_url")
    private final String imgLogoUrl;
    @SerializedName("has_community_visible_stats")
    private final Boolean hasCommunityVisibleStats;
    @SerializedName("playtime_2weeks")
    private final Integer playtimeTwoWeeks;

    public Game(final Long appId, final String name, final Integer playtimeForever, final String imgIconUrl, final String imgLogoUrl, final Boolean hasCommunityVisibleStats, final Integer playtimeTwoWeeks) {
        this.appId = appId;
        this.name = name;
        this.playtimeForever = playtimeForever;
        this.imgIconUrl = imgIconUrl;
        this.imgLogoUrl = imgLogoUrl;
        this.hasCommunityVisibleStats = hasCommunityVisibleStats;
        this.playtimeTwoWeeks = playtimeTwoWeeks;
    }

    /**
     * @return An integer containing the program's ID.
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return (Optional)
     * A string containing the program's publicly facing title.
     */
    public String getName() {
        return name;
    }

    /**
     * @return (Optional)
     * An integer of the the player's total playtime, denoted in minutes.
     */
    public Integer getPlaytimeForever() {
        return playtimeForever;
    }

    /**
     * @return (Optional)
     * The program icon's file name, accessible at: http://media.steampowered.com/steamcommunity/public/images/apps/APPID/IMG_ICON_URL.jpg, replacing "APPID" and "IMG_ICON_URL" as necessary.
     */
    public String getImgIconUrl() {
        return imgIconUrl;
    }

    /**
     * @return (Optional)
     * The program logo's file name, accessible at: http://media.steampowered.com/steamcommunity/public/images/apps/APPID/IMG_LOGO_URL.jpg, replacing "APPID" and "IMG_LOGO_URL" as necessary.
     */
    public String getImgLogoUrl() {
        return imgLogoUrl;
    }

    /**
     * @return (Optional)
     * Whether the program has stats accessible via GetUserStatsForGame and GetGlobalStatsForGame.
     */
    public Boolean getHasCommunityVisibleStats() {
        return hasCommunityVisibleStats;
    }

    /**
     * @return Optional)
     * An integer of the player's playtime in the past 2 weeks, denoted in minutes.
     */
    public Integer getPlaytimeTwoWeeks() {
        return playtimeTwoWeeks;
    }

}