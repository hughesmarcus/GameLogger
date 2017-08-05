package com.nnc.hughes.gamelogger.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pegi {

    @SerializedName("synopsis")
    @Expose
    private String synopsis;
    @SerializedName("rating")
    @Expose
    private Integer rating;

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

}
