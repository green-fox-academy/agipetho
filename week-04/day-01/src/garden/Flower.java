package garden;
/*
The Flower
needs water if its current water amount is less then 5
when watering it the flower can only absorb the 75% of the water
eg. watering with 10 the flower's amount of water should only increase with 7.5
 */

public class Flower extends Plant {
  protected boolean doesThisFlowerNeedWater;

  public Flower(String color, double currentWater) {
    super.color = color;
    super.currentWater = currentWater;
    if (currentWater < 10) {
      this.doesThisFlowerNeedWater = true;
    }
  }

  @Override
  public double waterPlant(double waterAmount) {
    if (doesThisFlowerNeedWater) {
      currentWater = currentWater + (0.75 * waterAmount);
    }
    return currentWater;
  }

  @Override
  public String whoAmI() {
    return "Flower";
  }

  public boolean doesThisFlowerNeedWater() {
    return doesThisFlowerNeedWater;
  }
}
