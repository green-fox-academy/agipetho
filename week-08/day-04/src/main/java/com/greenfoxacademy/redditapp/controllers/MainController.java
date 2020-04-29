package com.greenfoxacademy.redditapp.controllers;

import com.greenfoxacademy.redditapp.models.Article;
import com.greenfoxacademy.redditapp.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller

public class MainController {
  private ArticleService articleService;

  @Autowired
  public MainController(ArticleService articleservice) {
    this.articleService = articleservice;
  }

  @GetMapping("reddit")
  public String listArticles(Model model) {
    model.addAttribute("articles", articleService.getArticles());
    return "index";
  }

  @GetMapping("reddit/submit")
  public String getSubmitPage(Model model) {
    model.addAttribute("newArticle", new Article());
    return "submit";
  }

  @PostMapping("reddit/submit")
  public String submitPost(@ModelAttribute Article article, Model model) {
    articleService.addArticle(article);
    return "redirect:/reddit";
  }
}
