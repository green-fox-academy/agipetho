package com.greenfoxacademy.jwt.models;

public class Movie {

  String title;

  public Movie(String title) {
    this.title = title;
  }

  public Movie() {
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
