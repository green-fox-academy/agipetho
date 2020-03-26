/*
The Tree
needs water if its current water amount is less then 10
when watering it the tree can only absorb the 40% of the water
eg. watering with 10 the tree's amount of water should only increase with 4
 */

package garden;

public class Tree extends Plant {

  protected boolean doesThisTreeNeedWater;

  public Tree(String color, double currentWater) {
    super.color = color;
    super.currentWater = currentWater;
    if (currentWater < 10) {
      this.doesThisTreeNeedWater = true;
    }
  }

  @Override
  public double waterPlant(double waterAmount) {
    if (doesThisTreeNeedWater) {
      currentWater = currentWater + (0.40 * waterAmount);
    }
    return currentWater;
  }

  @Override
  public String whoAmI() {
    return "Tree";

  }

  public boolean doesThisTreeNeedWaterNeedWater() {
    return doesThisTreeNeedWater;
  }
}
