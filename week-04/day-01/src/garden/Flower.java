package garden;
/*
The Flower
needs water if its current water amount is less then 5
when watering it the flower can only absorb the 75% of the water
eg. watering with 10 the flower's amount of water should only increase with 7.5
 */

public class Flower extends Plant {
  protected boolean doesThisPlantNeedWater;

  public Flower(String color, double currentWater) {
    super.color = color;
    super.currentWater = currentWater;
  }


  @Override
  public boolean doesThisPlantNeedWater() {
    if (currentWater < 5) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void waterPlant(double waterPerPlant) {
    if (currentWater < 5) {
      currentWater = currentWater + (0.75 * waterPerPlant);
    }
  }

  @Override
  public String whoAmI() {
    return "Flower";
  }
}
