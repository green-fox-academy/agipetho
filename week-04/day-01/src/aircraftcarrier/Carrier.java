/*
Carrier
Create a class that represents an aircraft-carrier

The carrier should be able to store aircrafts
Each carrier should have a store of ammo represented as number
The initial ammo should be given by a parameter in its constructor
The carrier also has a health point given in its constructor as well

 */

/*
Methods
add
It should take a new aircraft and add it to its storage
fill
It should fill all the aircraft with ammo and subtract the needed ammo from the ammo storage
If there is not enough ammo then it should start to fill the aircrafts with priority first
If there is no ammo when this method is called, it should throw an exception
fight
It should take another carrier as a reference parameter and fire all the ammo from the aircrafts to it, then subtract all the damage from its health points
getStatus
It should return a string about itself and all of its aircrafts' statuses in the following format:
 */

package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private List<Aircraft> myAircrafts = new ArrayList<>();
  private int storeOfAmmo;
  private int healthPoint;
  private int grandTotalDamage;

  public Carrier(int storeOfAmmo, int healthPoint) {
    this.storeOfAmmo = storeOfAmmo;
    this.healthPoint = healthPoint;
    grandTotalDamage = 0;
  }

  public void add(String type) {
    Aircraft aircraft = new Aircraft(type);
    myAircrafts.add(aircraft);
  }

  public void fill() {
    for (Aircraft aircraft : myAircrafts) {
      if (aircraft.isPriority()) {
        storeOfAmmo = aircraft.refill(storeOfAmmo);
        if (storeOfAmmo == 0) {
          throw new NumberFormatException(); //to look for an appropriate exception
        }
      }
    }
    for (Aircraft aircraft : myAircrafts) {
      if (!aircraft.isPriority()) {
        storeOfAmmo = aircraft.refill(storeOfAmmo);
        if (storeOfAmmo == 0) {
          throw new NumberFormatException(); //to look for an appropriate exception
        }
      }
    }
  }

  public void fight(Carrier other) {
    if (this == other) {
      System.out.println("Self distruction!!!!");
    }
    int totalDamage = 0;
    for (Aircraft aircraft : myAircrafts) {
      totalDamage = totalDamage + aircraft.fight();
    }
    other.healthPoint = other.healthPoint - totalDamage;
    grandTotalDamage = grandTotalDamage + totalDamage;
  }

  public void getStatus() {
    if (healthPoint <= 0) {
      System.out.println("It's dead Jim :(");
    }
    System.out.println("HP: " + healthPoint + " Aircraft count: " + myAircrafts.size() + " Ammo Storage: " + storeOfAmmo + " Total damage: " + grandTotalDamage);
    for (Aircraft aircraft : myAircrafts) {
      System.out.println(aircraft.getStatus());
    }
  }
}