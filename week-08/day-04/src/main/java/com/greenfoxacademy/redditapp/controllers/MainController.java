package com.greenfoxacademy.redditapp.controllers;

import com.greenfoxacademy.redditapp.models.Article;
import com.greenfoxacademy.redditapp.models.User;
import com.greenfoxacademy.redditapp.services.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {
  private ArticleServiceImpl articleService;

  @Autowired
  public MainController(ArticleServiceImpl articleservice) {
    this.articleService = articleservice;
  }

  @GetMapping("reddit")
  public String listArticles(Model model) {
    model.addAttribute("articles", articleService.sortArticleByVotes());
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

  @GetMapping("/reddit/vote")
  public String vote(@RequestParam String vote,
                     @RequestParam long id,
                     Model model) {
    articleService.countVotes(vote, id);
    return "redirect:/reddit";
  }

  @GetMapping("reddit/login")
  public String getLoginPage() {
    return "login";
  }

  @PostMapping("reddit/login")
  public String getUserLogin(@RequestParam String name, Model model) {
    return "redirect:/reddit/?name=" + name;
  }

}
