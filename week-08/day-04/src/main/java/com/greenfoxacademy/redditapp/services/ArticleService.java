package com.greenfoxacademy.redditapp.services;

import com.greenfoxacademy.redditapp.models.Article;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArticleService {

  public void addArticle(Article article);
  public Iterable <Article> getArticles();
  public void countVotes(String vote, long id);
  public List<Article> sortArticleByVotes();;
}
