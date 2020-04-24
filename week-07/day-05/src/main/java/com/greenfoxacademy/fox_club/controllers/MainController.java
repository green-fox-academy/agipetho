package com.greenfoxacademy.fox_club.controllers;

import com.greenfoxacademy.fox_club.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class MainController {

  FoxService foxService;

  @GetMapping("/")
  public String getInfoPage(@RequestParam(required = false) String name, Model model) {
      model.addAttribute("name", name);
    return "index";
  }

  @GetMapping("/login")
  public String showLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String getLoginInfo(Model model, @RequestParam String name) {
    return "redirect:/?name=" + name;
  }
}
