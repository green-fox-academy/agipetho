/*
The Tree
needs water if its current water amount is less then 10
when watering it the tree can only absorb the 40% of the water
eg. watering with 10 the tree's amount of water should only increase with 4
 */

package garden;

public class Tree extends Plant {
  protected boolean doesThisPlantNeedWater;

  public Tree(String color, double currentWater) {
    super.color = color;
    super.currentWater = currentWater;
  }

  @Override
  public boolean doesThisPlantNeedWater() {
    if (currentWater < 10) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void waterPlant(double waterPerPlant) {
    if (currentWater < 10) {
      currentWater = currentWater + (0.40 * waterPerPlant);
    }
  }

  @Override
  public String whoAmI() {
    return "Tree";
  }
}
