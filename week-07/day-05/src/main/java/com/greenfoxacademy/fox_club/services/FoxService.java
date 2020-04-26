package com.greenfoxacademy.fox_club.services;

import com.greenfoxacademy.fox_club.models.Drink;
import com.greenfoxacademy.fox_club.models.Food;
import com.greenfoxacademy.fox_club.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FoxService {
  private Map<String, Fox> foxes;

  public FoxService() {
    this.foxes = new HashMap<>();
    foxes.put("Csele", new Fox("Csele", Food.HAMBURGER, Drink.WATER));
    foxes.put("Iny", new Fox("Iny", Food.CURRY, Drink.COLA));
    foxes.put("Vuk", new Fox("Vuk", Food.PASTA, Drink.LEMONADE));
    foxes.put("A kis Herceg rokaja", new Fox("A kis Herceg rokaja", Food.TACO, Drink.MILK));
  }

  public Fox getFox(String name) {
    return foxes.get(name);
  }

  public Map<String, Fox> getFoxes() {
    return foxes;
  }
}
