package com.gfa.petshelter.controllers;

import com.gfa.petshelter.models.Human;
import com.gfa.petshelter.services.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PetShelterController {

  HumanService humanService;

  @Autowired
  public PetShelterController(HumanService humanService) {
    this.humanService = humanService;
  }

  @GetMapping("/list-humans")
  public String getListOfHumans(Model model) {
    model.addAttribute("humans", humanService.getAllHumans());
    model.addAttribute("human", new Human());
    return "main";
  }

  @PostMapping("/add-human")
  public String addHuman(@ModelAttribute Human human) {
    humanService.addHuman(human);
    return "redirect:/list-humans";
  }

  @PostMapping("/delete")
  public String deleteHuman(@RequestParam Long id) {
    humanService.deleteHuman(id);
    return "redirect:/list-humans";
  }
}
