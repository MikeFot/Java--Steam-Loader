package com.michaelfotiadis.steam.data.steam.apps.server;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.steam.SteamApiModel;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetServersAtAddress">https://wiki.teamfortress.com/wiki/WebAPI/GetServersAtAddress</a>
 */
public class Server implements SteamApiModel {

    @SerializedName("addr")
    private final String addr;
    @SerializedName("gmsindex")
    private final Integer gmsindex;
    @SerializedName("message")
    private final String message;
    @SerializedName("appid")
    private final Integer appid;
    @SerializedName("gamedir")
    private final String gamedir;
    @SerializedName("region")
    private final Integer region;
    @SerializedName("secure")
    private final Boolean secure;
    @SerializedName("lan")
    private final Boolean lan;
    @SerializedName("gameport")
    private final Integer gameport;
    @SerializedName("specport")
    private final Integer specport;

    public Server(final String addr, final Integer gmsindex, final String message, final Integer appid, final String gamedir, final Integer region, final Boolean secure, final Boolean lan, final Integer gameport, final Integer specport) {
        this.addr = addr;
        this.gmsindex = gmsindex;
        this.message = message;
        this.appid = appid;
        this.gamedir = gamedir;
        this.region = region;
        this.secure = secure;
        this.lan = lan;
        this.gameport = gameport;
        this.specport = specport;
    }

    private Server(final Builder builder) {
        addr = builder.addr;
        gmsindex = builder.gmsindex;
        message = builder.message;
        appid = builder.appid;
        gamedir = builder.gamedir;
        region = builder.region;
        secure = builder.secure;
        lan = builder.lan;
        gameport = builder.gameport;
        specport = builder.specport;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * @return Gives the ip address, and the port number. Ex: "64.94.100.204:27015"
     */
    public String getAddr() {
        return addr;
    }

    /**
     * @return Gives the gmsindex. (?) Ex: 65534
     */
    public Integer getGmsindex() {
        return gmsindex;
    }

    /**
     * @return Description
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return Gives the steam game appid. Ex: 730
     */
    public Integer getAppid() {
        return appid;
    }

    /**
     * @return Tells which directory the game is from. Ex: "csgo"
     */
    public String getGamedir() {
        return gamedir;
    }

    /**
     * @return Gives the region of the server. Ex: 1
     */
    public Integer getRegion() {
        return region;
    }

    /**
     * @return Boolean, if server is secure or not. Ex: true
     */
    public Boolean getSecure() {
        return secure;
    }

    /**
     * @return Boolean, if server is a lan game. Ex: false
     */
    public Boolean getLan() {
        return lan;
    }

    /**
     * @return Gives the port number for the server. Ex: 27015
     */
    public Integer getGameport() {
        return gameport;
    }

    /**
     * @return Gives the specport. Ex: 0
     */
    public Integer getSpecport() {
        return specport;
    }


    public static final class Builder {
        private String addr;
        private Integer gmsindex;
        private String message;
        private Integer appid;
        private String gamedir;
        private Integer region;
        private Boolean secure;
        private Boolean lan;
        private Integer gameport;
        private Integer specport;

        private Builder() {
        }

        public Builder withAddr(final String val) {
            addr = val;
            return this;
        }

        public Builder withGmsindex(final Integer val) {
            gmsindex = val;
            return this;
        }

        public Builder withMessage(final String val) {
            message = val;
            return this;
        }

        public Builder withAppid(final Integer val) {
            appid = val;
            return this;
        }

        public Builder withGamedir(final String val) {
            gamedir = val;
            return this;
        }

        public Builder withRegion(final Integer val) {
            region = val;
            return this;
        }

        public Builder withSecure(final Boolean val) {
            secure = val;
            return this;
        }

        public Builder withLan(final Boolean val) {
            lan = val;
            return this;
        }

        public Builder withGameport(final Integer val) {
            gameport = val;
            return this;
        }

        public Builder withSpecport(final Integer val) {
            specport = val;
            return this;
        }

        public Server build() {
            return new Server(this);
        }
    }
}