package com.greenfoxacademy.jwt.services;


import com.greenfoxacademy.jwt.models.MoviePerson;
import org.springframework.stereotype.Service;

@Service
public interface MovieService {

  void saveMoviePerson(MoviePerson moviePerson);

  String getBaseUrl();

  String getAPI_KEY();

  String getLANGUAGE();

  int getPAGE();
}
