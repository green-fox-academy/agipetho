package com.greenfoxacademy.redditapp.controllers;

import com.greenfoxacademy.redditapp.models.Article;
import com.greenfoxacademy.redditapp.models.User;
import com.greenfoxacademy.redditapp.services.ArticleServiceImpl;
import com.greenfoxacademy.redditapp.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {
  private ArticleServiceImpl articleService;
  private UserServiceImpl userService;

  @Autowired
  public MainController(ArticleServiceImpl articleService, UserServiceImpl userService) {
    this.articleService = articleService;
    this.userService = userService;
  }


  @GetMapping("reddit")
  public String listArticles(Model model, String name) {
    model.addAttribute("name", name);
    model.addAttribute("articles", articleService.sortArticleByVotes());
    model.addAttribute("currentUser", userService.findByName(name));
    return "index";
  }

  @GetMapping("reddit/submit")
  public String getSubmitPage(Model model, @RequestParam String name) {
    model.addAttribute("newArticle", new Article());
    model.addAttribute("name", name);
    return "submit";
  }

  @PostMapping("reddit/submit")
  //public String submitPost(@ModelAttribute Article article, @RequestParam String user, Model model) {
  public String submitPost(@RequestParam String title, @RequestParam String url, @RequestParam String user, Model model) {
    Article article = new Article(title, url);
    User u = userService.findByName(user);
    if (u != null) {
      article.setUser(u);
    } else {
      // TODO: create a new user in the repository
    }
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
