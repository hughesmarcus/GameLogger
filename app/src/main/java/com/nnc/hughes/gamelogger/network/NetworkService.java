package com.nnc.hughes.gamelogger.network;

/**
 * Created by marcus on 7/18/17.
 */
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
public class NetworkService {
    @GET("genres/?fields=*&limit=40{sort_by}")
    Call<Movies> discoverMovies(@Path("sort_by") String sortBy, @Query("api_key") String apiKey);

}
