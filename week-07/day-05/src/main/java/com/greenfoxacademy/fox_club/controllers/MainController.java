package com.greenfoxacademy.fox_club.controllers;

import com.greenfoxacademy.fox_club.services.FoxService;
import com.greenfoxacademy.fox_club.services.NutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class MainController {

  private FoxService foxService;
  private NutritionService nutritionService;

  @Autowired
  public MainController(FoxService foxService, NutritionService nutritionService) {
    this.foxService = foxService;
    this.nutritionService = nutritionService;
  }

  @GetMapping("/")
  public String getInfoPage(@RequestParam(required = false) String name, Model model) {
    model.addAttribute("name", name);
    model.addAttribute("selectedFox", foxService.getFox(name));
    model.addAttribute("foods", nutritionService.getListOfFoods());
    model.addAttribute("drinks", nutritionService.getListOfDrinks());
    return "index";
  }

  @GetMapping("/login")
  public String showLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String getLoginInfo(@RequestParam String name) {
    return "redirect:/?name=" + name;
  }
}
