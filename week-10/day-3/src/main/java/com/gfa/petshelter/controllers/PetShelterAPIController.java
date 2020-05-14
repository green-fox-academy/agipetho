package com.gfa.petshelter.controllers;

import com.gfa.petshelter.services.HumanService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
public class PetShelterAPIController {

  HumanService humanService;

  @Autowired
  public PetShelterAPIController(HumanService humanService) {
    this.humanService = humanService;
  }

//  @GetMapping("/api/human/{id}")
//  public ResponseEntity<?> returnDataOnHuman(@PathVariable long id) {
//
//  }

  @DeleteMapping("/api/human/{id}")
  public ResponseEntity<?> deleteHuman(@PathVariable long id) {
    HttpStatus status;

    try {
      humanService.deletHumanById(id);
      status = HttpStatus.OK;
    } catch (NotFoundException ex) {
      status = HttpStatus.NOT_FOUND;
      //return ResponseEntity.badRequest().body(new Error("Please provide what to do with the numbers!"));
    }
    return ResponseEntity.status(status).build();
  }
}
