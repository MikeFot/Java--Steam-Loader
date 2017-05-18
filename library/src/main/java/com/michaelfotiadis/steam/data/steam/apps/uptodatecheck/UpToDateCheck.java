package com.michaelfotiadis.steam.data.steam.apps.uptodatecheck;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class UpToDateCheck {

    @SerializedName("success")
    private final Boolean success;
    @SerializedName("up_to_date")
    private final Boolean upToDate;
    @SerializedName("version_is_listable")
    private final Boolean versionIsListable;
    @SerializedName("required_version")
    private final Integer requiredVersion;
    @SerializedName("message")
    private final String message;

    public UpToDateCheck(final Boolean success, final Boolean upToDate, final Boolean versionIsListable, final Integer requiredVersion, final String message) {
        this.success = success;
        this.upToDate = upToDate;
        this.versionIsListable = versionIsListable;
        this.requiredVersion = requiredVersion;
        this.message = message;
    }

    private UpToDateCheck(final Builder builder) {
        success = builder.success;
        upToDate = builder.upToDate;
        versionIsListable = builder.versionIsListable;
        requiredVersion = builder.requiredVersion;
        message = builder.message;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * @return Boolean indicating if request was successful.
     */
    @Nonnull
    public Boolean getSuccess() {
        return success;
    }

    /**
     * @return Boolean indicating if the given version number is the most current version.
     */
    @Nonnull
    public Boolean getUpToDate() {
        return upToDate;
    }

    /**
     * @return Boolean indicating if the given version can be listed in public changelogs.
     */
    @Nonnull
    public Boolean getVersionIsListable() {
        return versionIsListable;
    }

    /**
     * @return Integer of the most current version of the app available.
     */
    @Nullable
    public Integer getRequiredVersion() {
        return requiredVersion;
    }

    /**
     * @return A string giving the status message if applicable.
     */
    @Nullable
    public String getMessage() {
        return message;
    }


    public static final class Builder {
        private Boolean success;
        private Boolean upToDate;
        private Boolean versionIsListable;
        private Integer requiredVersion;
        private String message;

        private Builder() {
        }

        public Builder withSuccess(final Boolean val) {
            success = val;
            return this;
        }

        public Builder withUpToDate(final Boolean val) {
            upToDate = val;
            return this;
        }

        public Builder withVersionIsListable(final Boolean val) {
            versionIsListable = val;
            return this;
        }

        public Builder withRequiredVersion(final Integer val) {
            requiredVersion = val;
            return this;
        }

        public Builder withMessage(final String val) {
            message = val;
            return this;
        }

        public UpToDateCheck build() {
            return new UpToDateCheck(this);
        }
    }
}