package com.greenfoxacademy.fox_club.services;

import com.greenfoxacademy.fox_club.models.Drink;
import com.greenfoxacademy.fox_club.models.Food;
import com.greenfoxacademy.fox_club.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
  private List<Fox> foxes;

  public FoxService(){
    this.foxes = new ArrayList<>();
    foxes.add(new Fox("Csele", Food.HAMBURGER, Drink.WATER));
    foxes.add(new Fox("Iny", Food.CURRY, Drink.COLA));
    foxes.add(new Fox("Vuk", Food.PASTA, Drink.LEMONADE));
    foxes.add(new Fox("A kis Herceg rokaja", Food.TACO, Drink.MILK));
  }


}
