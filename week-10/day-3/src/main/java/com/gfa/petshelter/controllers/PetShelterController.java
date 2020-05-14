package com.gfa.petshelter.controllers;

import com.gfa.petshelter.models.Human;
import com.gfa.petshelter.models.Pet;
import com.gfa.petshelter.services.HumanService;
import com.gfa.petshelter.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PetShelterController {

  HumanService humanService;
  PetService petService;

  @Autowired
  public PetShelterController(HumanService humanService, PetService petService) {
    this.humanService = humanService;
    this.petService = petService;
  }


  @GetMapping("/list-humans")
  public String getListOfHumans(Model model,
                                @RequestParam(required = false) boolean wantsToEdit,
                                @RequestParam(required = false) Long id,
                                @ModelAttribute Human human) {
    Human h = new Human();
    if (id != null) {
      h = humanService.findHumanByID(id);
    }
    model.addAttribute("humans", humanService.getAllHumans());
    model.addAttribute("human", wantsToEdit ? h : new Human());
    return "main";
  }

  @PostMapping("/add-human")
  public String addHuman(@ModelAttribute Human human) {
    humanService.addHuman(human);
    return "redirect:/list-humans";
  }

  @GetMapping("/delete/{id}")
  public String deleteHuman(@PathVariable Long id) {
    humanService.deleteHuman(id);
    return "redirect:/list-humans";
  }

  @GetMapping("/edit/{id}")
  public String editHuman(@PathVariable Long id) {
    return "redirect:/list-humans/?wantsToEdit=true&id=" + id;
  }

  @GetMapping("/list-pets")
  public String showAllPets(Model model) {
    model.addAttribute("pets", petService.returnAllPets());
    model.addAttribute("humans", humanService.getAllHumans());
    model.addAttribute("human", new Human());//az adatot nem hasznalja belole, de ez ahhoz kell,
    // h a Thymeleaf ki tudja tolteni az adatszerkezetet
    return "pets";
  }

  @PostMapping("/add-pet")
  public String addPet(@RequestParam String petName, //azert nem objectkent vesszuk at, mert nem tudna az egesz objectet kitolteni
                       @RequestParam Long id) {
    Pet pet = new Pet(petName);
    petService.addPet(pet, id);
    return "redirect:/list-pets";
  }
}
