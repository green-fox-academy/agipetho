package com.greenfoxacademy.redditapp.controllers;

import com.greenfoxacademy.redditapp.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping
public class MainController {
  private ArticleService articleService;

  @Autowired
  public MainController(ArticleService articleservice) {
    this.articleService = articleservice;
  }

  @GetMapping("/")
  public String test() {
    return "index";
  }

  @GetMapping("/submit")
  public String getSubmitPage() {
    return "submit";
  }

  @PostMapping("/submit")
  public String submitPost(@RequestParam String title, String url) {
    return "redirect:/";
  }
}
