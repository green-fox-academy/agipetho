package com.greenfoxacademy.jwt.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class MoviePersonDTO implements Serializable {

  @SerializedName("adult")
  @Expose
  private Boolean adult;
  @SerializedName("also_known_as")
  @Expose
  private List<String> alsoKnownAs = null;
  @SerializedName("biography")
  @Expose
  private String biography;
  @SerializedName("birthday")
  @Expose
  private String birthday;
  @SerializedName("deathday")
  @Expose
  private String deathday;
  @SerializedName("gender")
  @Expose
  private Long gender;
  @SerializedName("homepage")
  @Expose
  private String homepage;
  @SerializedName("id")
  @Expose
  private Long id;
  @SerializedName("imdb_id")
  @Expose
  private String imdbId;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("place_of_birth")
  @Expose
  private String placeOfBirth;
  @SerializedName("popularity")
  @Expose
  private Long popularity;
  @SerializedName("profile_path")
  @Expose
  private String profilePath;
  private final static long serialVersionUID = 5080585361080602957L;

  public Boolean getAdult() {
    return adult;
  }

  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

  public List<String> getAlsoKnownAs() {
    return alsoKnownAs;
  }

  public void setAlsoKnownAs(List<String> alsoKnownAs) {
    this.alsoKnownAs = alsoKnownAs;
  }

  public String getBiography() {
    return biography;
  }

  public void setBiography(String biography) {
    this.biography = biography;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getDeathday() {
    return deathday;
  }

  public void setDeathday(String deathday) {
    this.deathday = deathday;
  }

  public Long getGender() {
    return gender;
  }

  public void setGender(Long gender) {
    this.gender = gender;
  }

  public String getHomepage() {
    return homepage;
  }

  public void setHomepage(String homepage) {
    this.homepage = homepage;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getImdbId() {
    return imdbId;
  }

  public void setImdbId(String imdbId) {
    this.imdbId = imdbId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPlaceOfBirth() {
    return placeOfBirth;
  }

  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  public Long getPopularity() {
    return popularity;
  }

  public void setPopularity(Long popularity) {
    this.popularity = popularity;
  }

  public String getProfilePath() {
    return profilePath;
  }

  public void setProfilePath(String profilePath) {
    this.profilePath = profilePath;
  }
}