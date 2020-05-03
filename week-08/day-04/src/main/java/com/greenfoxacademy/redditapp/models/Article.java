package com.greenfoxacademy.redditapp.models;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reddit_articles")
public class Article {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private long numberOfVotes;
  private String title;
  private String url;

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  @Temporal(TemporalType.DATE)
  private Date date;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn
  private User user;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Article(String title, String url) {
    this.title = title;
    this.url = url;
    numberOfVotes = 0;
    this.date = new Date();
  }

  public Article() {
    this.date = new Date();
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
