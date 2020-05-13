package com.gfa.petshelter.services;


import com.gfa.petshelter.repositories.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HumanService {

  HumanRepository humanRepository;

  @Autowired
  public HumanService(HumanRepository humanRepository) {
    this.humanRepository = humanRepository;
  }
}
