package com.springapp.mvc;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author a.samoilich
 */
public class Content implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -6492499098564221788L;

    private String news_id;
    private String news_url;
    private String img_src;
    private String img_alt;
    private String date_updated;
    private String news_title;
    private String news_content;
    private boolean parsed;
    private String short_url;

    public String getNews_id() {
        return news_id;
    }

    public void setNews_id(String news_id) {
        this.news_id = news_id;
    }

    public String getNews_url() {
        return news_url;
    }

    public void setNews_url(String news_url) {
        this.news_url = news_url;
    }

    public String getImg_src() {
        return img_src;
    }

    public void setImg_src(String img_src) {
        this.img_src = img_src;
    }

    public String getImg_alt() {
        return img_alt;
    }

    public void setImg_alt(String img_alt) {
        this.img_alt = img_alt;
    }

    public String getDate_updated() {
        return date_updated;
    }

    public void setDate_updated(String date_updated) {
        this.date_updated = date_updated;
    }

    public String getNews_title() {
        return news_title;
    }

    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }

    public String getNews_content() {
        return news_content;
    }

    public void setNews_content(String news_content) {
        this.news_content = news_content;
    }

    public boolean isParsed() {
        return parsed;
    }

    public void setParsed(boolean parsed) {
        this.parsed = parsed;
    }

    public String getShort_url() {
        return short_url;
    }

    public void setShort_url(String short_url) {
        this.short_url = short_url;
    }

    @Override
    public String toString() {
        return "NewsContent [news_id=" + news_id + ", news_url=" + news_url
                + ", img_src=" + img_src + ", img_alt=" + img_alt
                + ", date_updated=" + date_updated + ", news_title="
                + news_title + ", news_content=" + news_content + ", parsed="
                + parsed + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((date_updated == null) ? 0 : date_updated.hashCode());
        result = prime * result + ((img_alt == null) ? 0 : img_alt.hashCode());
        result = prime * result + ((img_src == null) ? 0 : img_src.hashCode());
        result = prime * result
                + ((news_content == null) ? 0 : news_content.hashCode());
        result = prime * result + ((news_id == null) ? 0 : news_id.hashCode());
        result = prime * result
                + ((news_title == null) ? 0 : news_title.hashCode());
        result = prime * result
                + ((news_url == null) ? 0 : news_url.hashCode());
        result = prime * result + (parsed ? 1231 : 1237);
        result = prime * result
                + ((short_url == null) ? 0 : short_url.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Content other = (Content) obj;
        if (date_updated == null) {
            if (other.date_updated != null)
                return false;
        } else if (!date_updated.equals(other.date_updated))
            return false;
        if (img_alt == null) {
            if (other.img_alt != null)
                return false;
        } else if (!img_alt.equals(other.img_alt))
            return false;
        if (img_src == null) {
            if (other.img_src != null)
                return false;
        } else if (!img_src.equals(other.img_src))
            return false;
        if (news_content == null) {
            if (other.news_content != null)
                return false;
        } else if (!news_content.equals(other.news_content))
            return false;
        if (news_id == null) {
            if (other.news_id != null)
                return false;
        } else if (!news_id.equals(other.news_id))
            return false;
        if (news_title == null) {
            if (other.news_title != null)
                return false;
        } else if (!news_title.equals(other.news_title))
            return false;
        if (news_url == null) {
            if (other.news_url != null)
                return false;
        } else if (!news_url.equals(other.news_url))
            return false;
        if (parsed != other.parsed)
            return false;
        if (short_url == null) {
            if (other.short_url != null)
                return false;
        } else if (!short_url.equals(other.short_url))
            return false;
        return true;
    }

}
