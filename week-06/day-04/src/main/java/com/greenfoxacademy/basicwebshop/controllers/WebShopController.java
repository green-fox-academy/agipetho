package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.models.ShopItems;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
public class WebShopController {
  ShopItems bcKormendShopeItems = new ShopItems();

  @GetMapping("/webshop")
  public String wholeWebshop(Model model) {
    model.addAttribute("items", bcKormendShopeItems.getShopItems());
    return "webshop";
  }

  @GetMapping("/only-available")
  public String onlyAvailable(Model model) {
    model.addAttribute("items", bcKormendShopeItems.onlyAvailable());
    return "webshop";
  }

  @GetMapping("/cheapest-first")
  public String cheapestFirst(Model model) {
    model.addAttribute("items", bcKormendShopeItems.cheapestFirst());
    return "webshop";
  }

  @GetMapping("/contains-Whilson")
  public String containsWhilson(Model model) {
    model.addAttribute("items", bcKormendShopeItems.containsWhilson());
    return "webshop";
  }

  @GetMapping("/average-Stock")
  public String averageStock(Model model) {
    model.addAttribute("average", bcKormendShopeItems.averageStock());
    return "averagestock";
  }
}


