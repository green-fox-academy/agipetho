package com.greenfoxacademy.jwt.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moviepeople")
public class MoviePerson {

  private Boolean adult;
  private String biography;
  private String birthday;
  private String deathday;
  private Long gender;
  private String homepage;
  @Id
  private Long id;
  private String imdbId;
  private String name;
  private String placeOfBirth;
  private Long popularity;
  private String profilePath;

  public MoviePerson() {
  }

  public MoviePerson(MoviePersonDTO moviePersonDTO) {
    this.adult = moviePersonDTO.getAdult();
    this.biography = moviePersonDTO.getBiography();
    this.birthday = moviePersonDTO.getBirthday();
    this.deathday = moviePersonDTO.getDeathday();
    this.gender = moviePersonDTO.getGender();
    this.homepage = moviePersonDTO.getHomepage();
    this.id = moviePersonDTO.getId();
    this.imdbId = moviePersonDTO.getImdbId();
    this.name = moviePersonDTO.getName();
    this.placeOfBirth = moviePersonDTO.getPlaceOfBirth();
    this.popularity = moviePersonDTO.getPopularity();
    this.profilePath = moviePersonDTO.getProfilePath();
  }
}