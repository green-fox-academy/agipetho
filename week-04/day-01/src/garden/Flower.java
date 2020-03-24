package garden;
/*
The Flower
needs water if its current water amount is less then 5
when watering it the flower can only absorb the 75% of the water
eg. watering with 10 the flower's amount of water should only increase with 7.5
 */

public class Flower extends Garden {
  private String color;
  private double currentWater;
  private boolean doesItNeedWater;

  public Flower(String color, double currentWater) {
    this.color = color;
    this.currentWater = currentWater;
    if (currentWater < 5) {
      doesItNeedWater = true;
    }
  }

  public void waterFlower (double waterAmount){
    if (doesItNeedWater) {
      currentWater = (int) (currentWater + (0.75 * waterAmount));
    }
  }

  public String getColor() {
    return color;
  }

  public double getCurrentWater() {
    return currentWater;
  }

  public boolean doesItNeedWater() {
    return doesItNeedWater;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setCurrentWater(double currentWater) {
    this.currentWater = currentWater;
  }

  public void setDoesItNeedWater(boolean doesItNeedWater) {
    this.doesItNeedWater = doesItNeedWater;
  }
}
