package com.greenfoxacademy.fox_club.services;

import com.greenfoxacademy.fox_club.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
  private List<Fox> foxes;

  public FoxService(){
    this.foxes = new ArrayList<>();
    foxes.add(new Fox("Csele"));
    foxes.add(new Fox("Iny"));
    foxes.add(new Fox("Vuk"));
    foxes.add(new Fox("A kis Herceg rokaja"));
  }
}
