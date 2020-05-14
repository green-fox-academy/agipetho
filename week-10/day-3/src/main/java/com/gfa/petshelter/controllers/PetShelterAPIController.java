package com.gfa.petshelter.controllers;

import com.gfa.petshelter.services.HumanService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PetShelterAPIController {

  HumanService humanService;

  @Autowired
  public PetShelterAPIController(HumanService humanService) {
    this.humanService = humanService;
  }

  @GetMapping("/api/human/{id}")
  public ResponseEntity<?> returnDataOnHuman(@PathVariable long id) {
    if (humanService.findHumanByID(id) == null) {
      return ResponseEntity.badRequest().body(new Error("No human on the given index" + id));
    } else {
      return ResponseEntity.ok().body(humanService.findHumanByID(id));
      //return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Error("No human on the given index" + id));
    }
  }

  @DeleteMapping("/api/human/{id}")
  public ResponseEntity<?> deleteHuman(@PathVariable long id) {
    HttpStatus status;
    try {
      humanService.deletHumanById(id);
      status = HttpStatus.OK;
    } catch (NotFoundException ex) {
      status = HttpStatus.NOT_FOUND;
      //return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Error("No human on the given index" + id));
    }
    return ResponseEntity.status(status).build();
  }

  @GetMapping("/api/pet-names-older-human")
  public List<String> getPetsForOlderThanHumans(@RequestParam int referenceAge) {
    return humanService.returnPetNames(referenceAge);

  }
}
