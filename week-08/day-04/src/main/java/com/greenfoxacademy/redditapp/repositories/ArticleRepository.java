package com.greenfoxacademy.redditapp.repositories;


import com.greenfoxacademy.redditapp.models.Article;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {

//  @Query(value = "SELECT * FROM reddit_articles ORDER BY number_of_votes DESC", nativeQuery = true)
  List<Article> findAllByOrderByNumberOfVotesDesc();
}
