package com.greenfoxacademy.redditapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class MainController {

  @GetMapping ("/")
  public String test(){
    return "index";
  }

  @GetMapping ("/submit")
  public String getSubmitPage(){
    return "submit";
  }

  @PostMapping ("/submit")
  public String submitPost(@RequestParam String title, String url){
      return "redirect:/";
  }
}
