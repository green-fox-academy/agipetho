package com.greenfoxacademy.redditapp.services;

import com.greenfoxacademy.redditapp.models.Article;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArticleService {

  void addArticle(Article article);

  Article findById(Long id);

  Iterable<Article> getArticles();

  void countVotes(String vote, long id);

  List<Article> sortArticleByVotes();

  void addUserToArticle(Long userId, Long articleId);
}
