/*
The Tree
needs water if its current water amount is less then 10
when watering it the tree can only absorb the 40% of the water
eg. watering with 10 the tree's amount of water should only increase with 4
 */

package garden;

public class Tree extends Garden {
  private String color;
  private double currentWater;
  private boolean doesItNeedWater;

  public Tree (String color, double currentWater) {
    this.color = color;
    this.currentWater = currentWater;
    if (currentWater < 10) {
      doesItNeedWater = true;
    }
  }

  public String getColor() {
    return color;
  }

  public double getCurrentWater() {
    return currentWater;
  }

  public boolean isDoesItNeedWater() {
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
