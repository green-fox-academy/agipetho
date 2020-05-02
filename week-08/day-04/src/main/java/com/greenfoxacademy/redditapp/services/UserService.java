package com.greenfoxacademy.redditapp.services;


import com.greenfoxacademy.redditapp.models.Article;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
  public Iterable <Article> getArticlesForOneUser();
}
