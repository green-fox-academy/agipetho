package com.greenfoxacademy.redditapp.models;

import javax.persistence.*;

@Entity
@Table(name = "reddit_articles")
public class Article {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private long numberOfVotes;
  private String title;
  private String url;

  public Article() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getNumberOfVotes() {
    return numberOfVotes;
  }

  public void setNumberOfVotes(long numberOfVotes) {
    this.numberOfVotes = numberOfVotes;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
