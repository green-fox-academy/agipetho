package com.greenfoxacademy.redditapp.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "users")
public class User {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;
  private String userName;

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "user", cascade = CascadeType.ALL)
  private List<Article> articles;

  public User() {
    this.articles = new ArrayList<>();
  }

  public User(String userName){
    this. userName = userName;
    this.articles = new ArrayList<>();
  }

  public List<Article> getArticles(){
    return articles;
  }

  public void setArticles(List<Article> articles) {
    this.articles = articles;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
