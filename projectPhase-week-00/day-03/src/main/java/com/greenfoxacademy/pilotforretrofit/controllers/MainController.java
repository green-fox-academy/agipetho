package com.greenfoxacademy.pilotforretrofit.controllers;

import java.io.IOException;

import com.greenfoxacademy.pilotforretrofit.models.MovieResults;
import com.greenfoxacademy.pilotforretrofit.services.ApiInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@RestController
public class MainController {

  public static String BASE_URL = "https://api.themoviedb.org";
  private String API_KEY = "9537577ff4356e2086588b16cb363876";
  private String LANGUAGE = "en-US";
  private int PAGE = 1;

  @GetMapping("/prova")
  public ResponseEntity getPopularMovies() throws IOException {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build();
    ApiInterface apiInterface = retrofit.create(ApiInterface.class);
    Call<MovieResults> call = apiInterface.getPopularMovies(API_KEY, LANGUAGE, PAGE);
    Response<MovieResults> response = call.execute();
    return ResponseEntity.ok(response.body());
  }
}
