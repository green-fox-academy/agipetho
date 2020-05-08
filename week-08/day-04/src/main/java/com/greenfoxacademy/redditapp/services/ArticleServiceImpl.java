package com.greenfoxacademy.redditapp.services;

import com.greenfoxacademy.redditapp.models.Article;
import com.greenfoxacademy.redditapp.models.User;
import com.greenfoxacademy.redditapp.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {

  ArticleRepository articleRepository;
  UserService userService;

  @Autowired
  public ArticleServiceImpl(ArticleRepository articleRepository, UserService userService) {
    this.articleRepository = articleRepository;
    this.userService = userService;
  }

  public ArticleServiceImpl() {
  }

  @Override
  public void addArticle(Article article) {
    articleRepository.save(article);
  }

  @Override
  public Article findById(Long id) {
    return articleRepository.findById(id).orElse(null);
  }

  @Override
  public Iterable<Article> getArticles() {
    return articleRepository.findAll();
  }

  @Override
  public void countVotes(String vote, long id) {
    Optional<Article> optionalArticle = articleRepository.findById(id);
    if (optionalArticle.isPresent()) {
      Article a = optionalArticle.get();
      if (vote.equals("up")) {
        a.setNumberOfVotes(a.getNumberOfVotes() + 1);
        articleRepository.save(a);
      } else if (vote.equals("down")) {
        a.setNumberOfVotes(a.getNumberOfVotes() - 1);
        articleRepository.save(a);
      }
    }
    //Comment: in the normal usage it is not possible to get it,
    // in other circumstances we don't want to hande it so no 'else' is needed
  }

  @Override
  public List<Article> sortArticleByVotes() {
    return articleRepository.findAllByOrderByNumberOfVotesDesc();
  }

  @Override
  public void addUserToArticle(Long userId, Long articleId) {
    Article article = findById(articleId);
    User user = userService.findByID(userId);
    article.setUser(user);
    articleRepository.save(article);
  }
}