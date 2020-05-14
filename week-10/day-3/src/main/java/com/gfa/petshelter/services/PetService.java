package com.gfa.petshelter.services;


import com.gfa.petshelter.models.Human;
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

  public List<Pet> returnAllPets() {
    return (List) petRepository.findAll();
  }

  public void addPet(Pet pet, Long id) {
    Human human = humanService.humanRepository.findById(id).orElse(null);
    pet.setHuman(human);
    petRepository.save(pet);
  }

  public Pet findPetById(Long id) {
    return petRepository.findById(id).orElse(null);
  }

  public void addHumanToPet(Long humanId, Long petId) {
    Pet pet = findPetById(petId);
    Human human = humanService.findHumanByID(humanId);
    pet.setHuman(human);
    petRepository.save(pet);
  }
}
