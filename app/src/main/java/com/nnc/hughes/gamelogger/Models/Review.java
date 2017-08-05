
package com.nnc.hughes.gamelogger.Models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Review implements Parcelable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("created_at")
    @Expose
    private Integer createdAt;
    @SerializedName("updated_at")
    @Expose
    private Integer updatedAt;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("game")
    @Expose
    private Integer game;
    @SerializedName("category")
    @Expose
    private Integer category;
    @SerializedName("likes")
    @Expose
    private Integer likes;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("rating_category")
    @Expose
    private Integer ratingCategory;
    @SerializedName("platform")
    @Expose
    private Integer platform;
    @SerializedName("introduction")
    @Expose
    private String introduction;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("conclusion")
    @Expose
    private String conclusion;
    @SerializedName("positive_points")
    @Expose
    private String positivePoints;
    @SerializedName("negative_points")
    @Expose
    private String negativePoints;
    public final static Parcelable.Creator<Review> CREATOR = new Creator<Review>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Review createFromParcel(Parcel in) {
            Review instance = new Review();
            instance.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.createdAt = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.updatedAt = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.username = ((String) in.readValue((String.class.getClassLoader())));
            instance.slug = ((String) in.readValue((String.class.getClassLoader())));
            instance.url = ((String) in.readValue((String.class.getClassLoader())));
            instance.title = ((String) in.readValue((String.class.getClassLoader())));
            instance.game = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.category = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.likes = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.views = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.ratingCategory = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.platform = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.introduction = ((String) in.readValue((String.class.getClassLoader())));
            instance.content = ((String) in.readValue((String.class.getClassLoader())));
            instance.conclusion = ((String) in.readValue((String.class.getClassLoader())));
            instance.positivePoints = ((String) in.readValue((String.class.getClassLoader())));
            instance.negativePoints = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Review[] newArray(int size) {
            return (new Review[size]);
        }

    };

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getGame() {
        return game;
    }

    public void setGame(Integer game) {
        this.game = game;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getRatingCategory() {
        return ratingCategory;
    }

    public void setRatingCategory(Integer ratingCategory) {
        this.ratingCategory = ratingCategory;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getPositivePoints() {
        return positivePoints;
    }

    public void setPositivePoints(String positivePoints) {
        this.positivePoints = positivePoints;
    }

    public String getNegativePoints() {
        return negativePoints;
    }

    public void setNegativePoints(String negativePoints) {
        this.negativePoints = negativePoints;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(createdAt);
        dest.writeValue(updatedAt);
        dest.writeValue(username);
        dest.writeValue(slug);
        dest.writeValue(url);
        dest.writeValue(title);
        dest.writeValue(game);
        dest.writeValue(category);
        dest.writeValue(likes);
        dest.writeValue(views);
        dest.writeValue(ratingCategory);
        dest.writeValue(platform);
        dest.writeValue(introduction);
        dest.writeValue(content);
        dest.writeValue(conclusion);
        dest.writeValue(positivePoints);
        dest.writeValue(negativePoints);
    }

    public int describeContents() {
        return 0;
    }

}