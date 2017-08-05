package com.nnc.hughes.gamelogger.network;

/**
 * Created by marcus on 7/18/17.
 */

import com.nnc.hughes.gamelogger.Models.Game;
import com.nnc.hughes.gamelogger.Models.GamesResponse;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface NetworkService {
    @GET("genres/{id}?fields=*&")
    Observable<GamesResponse> getGameByGenre(@Path("id") String id, @QueryMap Map<String, String> options, @Query("api_key") String apiKey);

    @GET("games/?fields=*&")
    Observable<GamesResponse> showGames(@QueryMap Map<String, String> options, @Query("api_key") String apiKey);

    @GET("games/{id}?fields=*&")
    Observable<GamesResponse> showGame(@Path("id") String id, @QueryMap Map<String, String> options, @Query("api_key") String apiKey);
}
