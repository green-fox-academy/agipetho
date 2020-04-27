package com.greenfoxacademy.fox_club.services;

import com.greenfoxacademy.fox_club.models.Drink;
import com.greenfoxacademy.fox_club.models.Food;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NutritionService {
  private List<Food> listOfFoods;
  private List<Drink> listOfDrinks;

  public NutritionService() {
    listOfFoods = new ArrayList<Food>();
    listOfDrinks = new ArrayList<Drink>();
  }

  public List<Food> getListOfFoods() {
    return listOfFoods;
  }

  public List<Drink> getListOfDrinks() {
    return listOfDrinks;
  }

  public void setListOfFoods(List<Food> listOfFoods) {
    this.listOfFoods = listOfFoods;
  }

  public void setListOfDrinks(List<Drink> listOfDrinks) {
    this.listOfDrinks = listOfDrinks;
  }

}
