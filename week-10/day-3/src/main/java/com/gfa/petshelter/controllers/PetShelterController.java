package com.gfa.petshelter.controllers;

import com.gfa.petshelter.services.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PetShelterController {

  HumanService humanService;

  @Autowired
  public PetShelterController(HumanService humanService) {
    this.humanService = humanService;
  }
}
