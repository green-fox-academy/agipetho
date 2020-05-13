package com.gfa.petshelter.services;


import com.gfa.petshelter.models.Human;
import com.gfa.petshelter.repositories.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumanService {

  HumanRepository humanRepository;

  @Autowired
  public HumanService(HumanRepository humanRepository) {
    this.humanRepository = humanRepository;
  }

  public List<Human> getAllHumans(){
    return humanRepository.findAll();
  }

  public void addHuman(Human human){
    humanRepository.save(human);
  }

  public void deleteHuman(Long id){
    humanRepository.deleteById(id);
  }
}
