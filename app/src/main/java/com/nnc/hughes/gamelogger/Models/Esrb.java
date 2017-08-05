
package com.nnc.hughes.gamelogger.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Esrb {

    @SerializedName("rating")
    @Expose
    private Integer rating;

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

}
