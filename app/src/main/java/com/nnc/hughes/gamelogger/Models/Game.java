
package com.nnc.hughes.gamelogger.Models;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Game {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("created_at")
    @Expose
    private Integer createdAt;
    @SerializedName("updated_at")
    @Expose
    private Integer updatedAt;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("rating")
    @Expose
    private Double rating;
    @SerializedName("popularity")
    @Expose
    private Double popularity;
    @SerializedName("aggregated_rating")
    @Expose
    private Double aggregatedRating;
    @SerializedName("aggregated_rating_count")
    @Expose
    private Integer aggregatedRatingCount;
    @SerializedName("total_rating")
    @Expose
    private Double totalRating;
    @SerializedName("total_rating_count")
    @Expose
    private Integer totalRatingCount;
    @SerializedName("rating_count")
    @Expose
    private Integer ratingCount;
    @SerializedName("games")
    @Expose
    private List<Integer> games = null;
    @SerializedName("tags")
    @Expose
    private List<Integer> tags = null;
    @SerializedName("developers")
    @Expose
    private List<Integer> developers = null;
    @SerializedName("publishers")
    @Expose
    private List<Integer> publishers = null;
    @SerializedName("game_engines")
    @Expose
    private List<Integer> gameEngines = null;
    @SerializedName("category")
    @Expose
    private Integer category;
    @SerializedName("player_perspectives")
    @Expose
    private List<Integer> playerPerspectives = null;
    @SerializedName("game_modes")
    @Expose
    private List<Integer> gameModes = null;
    @SerializedName("keywords")
    @Expose
    private List<Integer> keywords = null;
    @SerializedName("themes")
    @Expose
    private List<Integer> themes = null;
    @SerializedName("genres")
    @Expose
    private List<Integer> genres = null;
    @SerializedName("first_release_date")
    @Expose
    private Integer firstReleaseDate;
    @SerializedName("release_dates")
    @Expose
    private List<ReleaseDate> releaseDates = null;
    @SerializedName("alternative_names")
    @Expose
    private List<AlternativeName> alternativeNames = null;
    @SerializedName("screenshots")
    @Expose
    private List<Screenshot> screenshots = null;
    @SerializedName("videos")
    @Expose
    private List<Video> videos = null;
    @SerializedName("cover")
    @Expose
    private Cover cover;
    @SerializedName("esrb")
    @Expose
    private Esrb esrb;
    @SerializedName("pegi")
    @Expose
    private Pegi pegi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public Double getAggregatedRating() {
        return aggregatedRating;
    }

    public void setAggregatedRating(Double aggregatedRating) {
        this.aggregatedRating = aggregatedRating;
    }

    public Integer getAggregatedRatingCount() {
        return aggregatedRatingCount;
    }

    public void setAggregatedRatingCount(Integer aggregatedRatingCount) {
        this.aggregatedRatingCount = aggregatedRatingCount;
    }

    public Double getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(Double totalRating) {
        this.totalRating = totalRating;
    }

    public Integer getTotalRatingCount() {
        return totalRatingCount;
    }

    public void setTotalRatingCount(Integer totalRatingCount) {
        this.totalRatingCount = totalRatingCount;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }

    public List<Integer> getGames() {
        return games;
    }

    public void setGames(List<Integer> games) {
        this.games = games;
    }

    public List<Integer> getTags() {
        return tags;
    }

    public void setTags(List<Integer> tags) {
        this.tags = tags;
    }

    public List<Integer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Integer> developers) {
        this.developers = developers;
    }

    public List<Integer> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<Integer> publishers) {
        this.publishers = publishers;
    }

    public List<Integer> getGameEngines() {
        return gameEngines;
    }

    public void setGameEngines(List<Integer> gameEngines) {
        this.gameEngines = gameEngines;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public List<Integer> getPlayerPerspectives() {
        return playerPerspectives;
    }

    public void setPlayerPerspectives(List<Integer> playerPerspectives) {
        this.playerPerspectives = playerPerspectives;
    }

    public List<Integer> getGameModes() {
        return gameModes;
    }

    public void setGameModes(List<Integer> gameModes) {
        this.gameModes = gameModes;
    }

    public List<Integer> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<Integer> keywords) {
        this.keywords = keywords;
    }

    public List<Integer> getThemes() {
        return themes;
    }

    public void setThemes(List<Integer> themes) {
        this.themes = themes;
    }

    public List<Integer> getGenres() {
        return genres;
    }

    public void setGenres(List<Integer> genres) {
        this.genres = genres;
    }

    public Integer getFirstReleaseDate() {
        return firstReleaseDate;
    }

    public void setFirstReleaseDate(Integer firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
    }

    public List<ReleaseDate> getReleaseDates() {
        return releaseDates;
    }

    public void setReleaseDates(List<ReleaseDate> releaseDates) {
        this.releaseDates = releaseDates;
    }

    public List<AlternativeName> getAlternativeNames() {
        return alternativeNames;
    }

    public void setAlternativeNames(List<AlternativeName> alternativeNames) {
        this.alternativeNames = alternativeNames;
    }

    public List<Screenshot> getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(List<Screenshot> screenshots) {
        this.screenshots = screenshots;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public Esrb getEsrb() {
        return esrb;
    }

    public void setEsrb(Esrb esrb) {
        this.esrb = esrb;
    }

    public Pegi getPegi() {
        return pegi;
    }

    public void setPegi(Pegi pegi) {
        this.pegi = pegi;
    }

}
