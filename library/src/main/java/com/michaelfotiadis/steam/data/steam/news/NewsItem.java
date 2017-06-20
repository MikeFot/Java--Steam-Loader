package com.michaelfotiadis.steam.data.steam.news;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.steam.SteamApiModel;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetNewsForApp">Wiki</a>
 */
public class NewsItem implements SteamApiModel {

    @SerializedName("gid")
    private final String gId;
    @SerializedName("title")
    private final String title;
    @SerializedName("url")
    private final String url;
    @SerializedName("is_external_url")
    private final Boolean isExternalUrl;
    @SerializedName("author")
    private final String author;
    @SerializedName("contents")
    private final String contents;
    @SerializedName("feedLabel")
    private final String feedLabel;
    @SerializedName("date")
    private final Long date;
    @SerializedName("feedname")
    private final String feedName;
    @SerializedName("feed_type")
    private final Integer feedType;
    @SerializedName("appid")
    private final Integer appId;

    public NewsItem(final String gId, final String title, final String url, final Boolean isExternalUrl, final String author, final String contents, final String feedLabel, final Long date, final String feedName, final Integer feedType, final Integer appId) {
        this.gId = gId;
        this.title = title;
        this.url = url;
        this.isExternalUrl = isExternalUrl;
        this.author = author;
        this.contents = contents;
        this.feedLabel = feedLabel;
        this.date = date;
        this.feedName = feedName;
        this.feedType = feedType;
        this.appId = appId;
    }

    private NewsItem(final Builder builder) {
        gId = builder.gId;
        title = builder.title;
        url = builder.url;
        isExternalUrl = builder.isExternalUrl;
        author = builder.author;
        contents = builder.contents;
        feedLabel = builder.feedLabel;
        date = builder.date;
        feedName = builder.feedName;
        feedType = builder.feedType;
        appId = builder.appId;
    }

    /**
     * @return The unique identifier of the news item.
     */
    public String getGId() {
        return gId;
    }

    /**
     * @return Title of the news item.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return Permanent link to the item
     */
    public String getUrl() {
        return url;
    }

    /**
     * @return true if the url given links to an external website. false if it links to the Steam store.
     */
    public Boolean isExternalUrl() {
        return isExternalUrl;
    }

    /**
     * @return The author of the news item.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return The article body with a length equal to the given length with an appended ellipsis if it is exceeded.
     */
    public String getContents() {
        return contents;
    }

    /**
     * @return The category label of the news item.
     */
    public String getFeedLabel() {
        return feedLabel;
    }

    /**
     * @return A unix timestamp of the date the item was posted.
     */
    public Long getDate() {
        return date;
    }

    /**
     * @return An internal tag that describes the source of the news item.
     */
    public String getFeedName() {
        return feedName;
    }

    public Integer getFeedType() {
        return feedType;
    }

    /**
     * @return The appid of the item news is fetched for.
     */
    public Integer getAppId() {
        return appId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public static final class Builder {
        private String gId;
        private String title;
        private String url;
        private Boolean isExternalUrl;
        private String author;
        private String contents;
        private String feedLabel;
        private Long date;
        private String feedName;
        private Integer feedType;
        private Integer appId;

        private Builder() {
        }

        public Builder withGId(final String val) {
            gId = val;
            return this;
        }

        public Builder withTitle(final String val) {
            title = val;
            return this;
        }

        public Builder withUrl(final String val) {
            url = val;
            return this;
        }

        public Builder withIsExternalUrl(final Boolean val) {
            isExternalUrl = val;
            return this;
        }

        public Builder withAuthor(final String val) {
            author = val;
            return this;
        }

        public Builder withContents(final String val) {
            contents = val;
            return this;
        }

        public Builder withFeedLabel(final String val) {
            feedLabel = val;
            return this;
        }

        public Builder withDate(final Long val) {
            date = val;
            return this;
        }

        public Builder withFeedName(final String val) {
            feedName = val;
            return this;
        }

        public Builder withFeedType(final Integer val) {
            feedType = val;
            return this;
        }

        public Builder withAppId(final Integer val) {
            appId = val;
            return this;
        }

        public NewsItem build() {
            return new NewsItem(this);
        }
    }
}