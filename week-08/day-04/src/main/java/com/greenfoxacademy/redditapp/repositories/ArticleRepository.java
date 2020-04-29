package com.greenfoxacademy.redditapp.repositories;


import com.greenfoxacademy.redditapp.models.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
}
