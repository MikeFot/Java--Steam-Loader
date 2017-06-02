package com.michaelfotiadis.steam.data.steam.apps.server;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.player.SteamApiModel;

import java.util.List;



/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetServersAtAddress">Wiki</a>
 */
public class ServersContainer implements SteamApiModel {

    @SerializedName("success")
    private final Boolean success;
    @SerializedName("servers")
    private final List<Server> servers;

    public ServersContainer(final Boolean success, final List<Server> servers) {
        this.success = success;
        this.servers = servers;
    }

    /**
     * @return Returns true if ip address is valid, does not mean server is functioning properly.
     */

    public Boolean getSuccess() {
        return success;
    }

    /**
     * @return A list of every server from this ip address.
     */

    public List<Server> getServers() {
        return servers;
    }
}