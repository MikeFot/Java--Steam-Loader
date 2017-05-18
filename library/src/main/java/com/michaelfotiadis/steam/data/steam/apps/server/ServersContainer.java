package com.michaelfotiadis.steam.data.steam.apps.server;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Nonnull;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetServersAtAddress">Wiki</a>
 */
public class ServersContainer {

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
    @Nonnull
    public Boolean getSuccess() {
        return success;
    }

    /**
     * @return A list of every server from this ip address.
     */
    @Nonnull
    public List<Server> getServers() {
        return servers;
    }
}