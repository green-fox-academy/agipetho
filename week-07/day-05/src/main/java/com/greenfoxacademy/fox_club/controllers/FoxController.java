package com.greenfoxacademy.fox_club.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FoxController {

  @GetMapping("/nutritionStore")
  public String getNutritionInfo(Model model) {
    return "nutrition";
  }

//  @PostMapping("/nutritionStore")
//  @ResponseBody
//  public String changeNutrition(Model model, @RequestParam String name) {
//    return "login";
//  }
}
