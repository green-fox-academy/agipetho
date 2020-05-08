package com.greenfoxacademy.redditapp.services;

import com.greenfoxacademy.redditapp.models.Article;
import com.greenfoxacademy.redditapp.models.User;
import com.greenfoxacademy.redditapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public Iterable<Article> getArticlesForOneUser() {
    return null;
  }

  @Override
  public User findByID(Long id) {
    if (userRepository.findById(id).isPresent()) {
      User user = userRepository.findById(id).get();
      return user;
    }
    return null;
  }

  @Override
  public User findByName(String userName) {
    if (userRepository.getByUserName(userName) != null) {
      return userRepository.getByUserName(userName);
    } else {
      return null;
    }
  }

  @Override
  public List<User> returnAllUsers() {
    List<User> users = new ArrayList<>();
    userRepository
        .findAll()
        .forEach(users::add);
    return users;
  }

  @Override
  public void addArticleToUser(Article article, User user) {
    List<Article> articles = user.getArticles();
    articles.add(article);
    user.setArticles(articles);
    userRepository.save(user);
  }

  @Override
  public void addUser(User user) {
    userRepository.save(user);
  }
}
