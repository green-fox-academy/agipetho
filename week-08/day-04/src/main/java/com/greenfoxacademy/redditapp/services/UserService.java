package com.greenfoxacademy.redditapp.services;


import com.greenfoxacademy.redditapp.models.Article;
import com.greenfoxacademy.redditapp.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
  Iterable<Article> getArticlesForOneUser();
  User findByID(Long id);
  List<User> returnAllUsers();
  void addArticleToUser(Article article, User user);
}
