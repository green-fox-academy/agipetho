package com.greenfoxacademy.redditapp.services;

import com.greenfoxacademy.redditapp.models.Article;
import com.greenfoxacademy.redditapp.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {

  ArticleRepository articleRepository;

  @Autowired
  public ArticleServiceImpl(ArticleRepository articleRepository) {
    this.articleRepository = articleRepository;
  }

  @Override
  public void addArticle(Article article) {
    articleRepository.save(article);
  }


  public Iterable<Article> getArticles() {
    return articleRepository.findAll();
  }

  @Override
  public void countVotes(String vote, long id) {
    if (vote.equals("up")) {
      Optional<Article> optionalArticle = articleRepository.findById(id);
      if (optionalArticle.isPresent()) {
        Article a = optionalArticle.get();
        a.setNumberOfVotes(a.getNumberOfVotes() + 1);
        articleRepository.save(a);
      } else {
        // do nothing
      }
    } else if (vote.equals("down")) {
      Optional<Article> optionalArticle = articleRepository.findById(id);
      if (optionalArticle.isPresent()) {
        Article a = optionalArticle.get();
        a.setNumberOfVotes(a.getNumberOfVotes() - 1);
        articleRepository.save(a);
      } else {
        // do nothing
      }
    } else {
      // do nothing
    }
  }

  @Override
  public List<Article> sortArticleByVotes() {
    return articleRepository.getAllByOrderByNumberOfVotes();
  }
}