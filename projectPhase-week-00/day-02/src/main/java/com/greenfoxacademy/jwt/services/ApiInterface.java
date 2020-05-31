package com.greenfoxacademy.jwt.services;

import com.greenfoxacademy.jwt.models.MoviePersonDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {


  //https://api.themoviedb.org/3/movie/get-latest-person?api_key=9537577ff4356e2086588b16cb363876&language=en-US&page=1
  @GET("/3/person/latest")
  Call<MoviePersonDTO> getPopularMovies(
      @Query("api_key") String apiKey,
      @Query("language") String language,
      @Query("page") int page
  );


}
