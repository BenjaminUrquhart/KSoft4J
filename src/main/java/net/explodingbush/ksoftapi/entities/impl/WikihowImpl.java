package net.explodingbush.ksoftapi.entities.impl;

import net.explodingbush.ksoftapi.entities.Wikihow;
import org.json.JSONObject;

public class WikihowImpl implements Wikihow {

    private final JSONObject json;
    public WikihowImpl(JSONObject json) {
        this.json = json;
    }

    @Override
    public String getImage() {
        return json.getString("url");
    }

    @Override
    public String getTitle() {
        return json.getString("title");
    }

    @Override
    public boolean isNsfw() {
        return json.getBoolean("nsfw");
    }

    @Override
    public String getArticleUrl() {
        return json.getString("article_url");
    }
}
