package garden;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Plant {
  public String color;
  public double currentWater;

  public Plant() {
  }

  public boolean doesThisPlantNeedWater() {
    return true;
  }

  public String whoAmI() {
    return null;
  }

  public double waterPlant(double waterPerPlant) {
    return 1;
  }
}
