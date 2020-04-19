package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.models.ShopItems;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/contains-Wilson")
  public String containsWhilson(Model model) {
    model.addAttribute("items", bcKormendShopeItems.containsWilson());
    return "webshop";
  }

  @GetMapping("/average-stock")
  public String averageStock(Model model) {
    model.addAttribute("info", bcKormendShopeItems.averageStock());
    return "infopage";
  }

  @GetMapping("/most-expensive")
  public String mostExpensive(Model model) {
    model.addAttribute("info", bcKormendShopeItems.mostExpensive());
    return "infopage";
  }

  @RequestMapping(value = "/search", method = RequestMethod.POST)
  public String search(@RequestParam("searchInput") String searchInput, Model model) {
    model.addAttribute("items", bcKormendShopeItems.search(searchInput));
    return "webshop";
  }
}


