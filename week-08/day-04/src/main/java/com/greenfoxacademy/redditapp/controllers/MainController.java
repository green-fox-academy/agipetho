package com.greenfoxacademy.redditapp.controllers;

import com.greenfoxacademy.redditapp.models.Article;
import com.greenfoxacademy.redditapp.models.User;
import com.greenfoxacademy.redditapp.services.ArticleService;
import com.greenfoxacademy.redditapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("reddit")
public class MainController {
  private ArticleService articleService;
  private UserService userService;

  @Autowired
  public MainController(ArticleService articleService, UserService userService) {
    this.articleService = articleService;
    this.userService = userService;
  }


  @GetMapping("")
  public String listArticles(Model model, String name) {
    model.addAttribute("name", name);
    model.addAttribute("articles", articleService.sortArticleByVotes());
    model.addAttribute("currentUser", userService.findByName(name));
    return "index";
  }

  @GetMapping("submit")
  public String getSubmitPage(Model model, @RequestParam String name) {
    model.addAttribute("newArticle", new Article());
    model.addAttribute("name", name);
    return "submit";
  }

  @PostMapping("submit")
  public String submitPost(@RequestParam String title,
                           @RequestParam String url,
                           @RequestParam String name,
                           Model model) {
    Article article = new Article(title, url);
    article.setUser(userService.findByName(name));
    articleService.addArticle(article);
    return "redirect:/reddit";
  }

  @GetMapping("vote")
  public String vote(@RequestParam String vote,
                     @RequestParam long id,
                     Model model) {
    articleService.countVotes(vote, id);
    return "redirect:/reddit";
  }

  @GetMapping("login")
  public String getLoginPage() {
    return "login";
  }

  @PostMapping("login")
  public String getUserLogin(@RequestParam String name, Model model) {
    User u = userService.findByName(name);
    if (u == null) {
      userService.addUser(new User(name));
    }
    return "redirect:/reddit/?name=" + name;
  }
}
