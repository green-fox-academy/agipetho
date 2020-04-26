package com.greenfoxacademy.fox_club.controllers;

import com.greenfoxacademy.fox_club.services.FoxService;
import com.greenfoxacademy.fox_club.services.NutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class FoxController {

  private NutritionService nutritionService;
  private FoxService foxService;

  @Autowired
  public FoxController(NutritionService nutritionService, FoxService foxService) {
    this.nutritionService = nutritionService;
    this.foxService = foxService;
  }

  @GetMapping("/nutritionStore")
  public String getNutritionInfo(@RequestParam String name, Model model) {
    model.addAttribute("selectedFox", foxService.getFox(name));
    model.addAttribute("foods", nutritionService.getListOfFoods());
    model.addAttribute("drinks", nutritionService.getListOfDrinks());
    return "nutrition";
  }
}
