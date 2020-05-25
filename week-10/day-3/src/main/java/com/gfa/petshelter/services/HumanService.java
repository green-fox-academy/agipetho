package com.gfa.petshelter.services;


import com.gfa.petshelter.models.Human;
import com.gfa.petshelter.repositories.HumanRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HumanService {

  HumanRepository humanRepository;

  @Autowired
  public HumanService(HumanRepository humanRepository) {
    this.humanRepository = humanRepository;
  }

  public List<Human> getAllHumans() {
    return humanRepository.findAll();
  }

  public void addHuman(Human human) {
    humanRepository.save(human);
  }

  public void deleteHuman(Long id) {
    humanRepository.deleteById(id);
  }

  public Human findHumanByID(Long id) {
    return humanRepository.findById(id).orElse(null);
  }

  public Human findHumanByName(String name) {
    return humanRepository.findByName(name).orElse(null);
  }

  public void deletHumanById(long id) throws NotFoundException {
    Optional<Human> optionalHuman = humanRepository.findById(id);
    if (optionalHuman.isPresent()) {
      Human h = optionalHuman.get();
      humanRepository.delete(h);
    } else {
      throw new NotFoundException("No human on the given index" + id);
    }
  }

  public List<String> returnPetNames(int referenceAge) {
    return humanRepository.findAllPetsWhereHumansWithAgeGreaterThan(referenceAge);
  }
}
