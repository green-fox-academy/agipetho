package com.gfa.petshelter.controllers;

import com.gfa.petshelter.services.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetShelterAPIController {

  HumanService humanService;

  @Autowired
  public PetShelterAPIController(HumanService humanService) {
    this.humanService = humanService;
  }
}
