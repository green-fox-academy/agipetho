package com.greenfoxacademy.jwt.services;


import com.greenfoxacademy.jwt.models.MoviePerson;
import com.greenfoxacademy.jwt.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

  private MovieRepository movieRepository;
  private String BASE_URL = "https://api.themoviedb.org";
  private String API_KEY = "dc6e4b64943549c9f83d055f94ecd8c5";
  private String LANGUAGE = "en-US";
  private int PAGE = 1;



  @Autowired
  public MovieServiceImpl(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
  }

  @Override
  public void saveMoviePerson(MoviePerson moviePerson) {
    movieRepository.save(moviePerson);
  }

  public String getBaseUrl() {
    return BASE_URL;
  }

  public String getAPI_KEY() {
    return API_KEY;
  }

  public String getLANGUAGE() {
    return LANGUAGE;
  }

  public int getPAGE() {
    return PAGE;
  }
}
