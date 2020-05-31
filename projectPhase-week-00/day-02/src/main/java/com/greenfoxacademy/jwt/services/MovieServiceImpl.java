package com.greenfoxacademy.jwt.services;


import com.greenfoxacademy.jwt.models.MoviePerson;
import com.greenfoxacademy.jwt.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

  private MovieRepository movieRepository;

  @Autowired
  public MovieServiceImpl(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
  }

  @Override
  public void saveMoviePerson(MoviePerson moviePerson) {
    movieRepository.save(moviePerson);
  }
}
