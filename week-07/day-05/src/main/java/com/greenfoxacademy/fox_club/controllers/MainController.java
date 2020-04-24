package com.greenfoxacademy.fox_club.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class MainController {

  @GetMapping("/")
  public String getInfoPage() {
    return "index";
  }

  @GetMapping("/login")
  public String showLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String getLoginInfo(Model model, @RequestParam("name") String name) {
    model.addAttribute("name", "name");
    return "redirect:/?name=" + name;
  }
}
