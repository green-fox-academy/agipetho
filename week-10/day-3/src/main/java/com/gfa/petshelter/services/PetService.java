package com.gfa.petshelter.services;


import com.gfa.petshelter.models.Pet;
import com.gfa.petshelter.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

  PetRepository petRepository;
  HumanService humanService;

  @Autowired
  public PetService(PetRepository petRepository, HumanService humanService) {
    this.petRepository = petRepository;
    this.humanService = humanService;
  }

  public List<Pet> returnAllPets(){
    return (List) petRepository.findAll();
  }
}
