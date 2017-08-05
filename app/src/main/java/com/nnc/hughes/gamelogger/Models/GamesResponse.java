package com.nnc.hughes.gamelogger.Models;

import java.util.List;

/**
 * Created by marcus on 8/4/17.
 */

public class GamesResponse {
    private List<Game> games = null;

    public List<Game> getData() {
        return games;
    }

    public void setData(List<Game> games) {
        this.games = games;
    }
}
