package com.greenfoxacademy.redditapp.services;

import com.greenfoxacademy.redditapp.models.Article;
import com.greenfoxacademy.redditapp.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

  ArticleRepository articleRepository;

@Autowired
  public ArticleService(ArticleRepository articleRepository) {
    this.articleRepository = articleRepository;
  }

  public void addArticle(Article article) {
  articleRepository.save(article);
  }

  public Iterable <Article> getArticles(){
  return articleRepository.findAll();
  }
}
