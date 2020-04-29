package com.greenfoxacademy.redditapp.services;

import com.greenfoxacademy.redditapp.models.Article;

public interface ArticleService {

  public void addArticle(Article article);
  public Iterable <Article> getArticles();
  public void countVotes(String vote, long id);
}
