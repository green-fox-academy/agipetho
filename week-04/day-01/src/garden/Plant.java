package garden;

public abstract class Plant {
  protected String color;
  protected double currentWater;

  public Plant() {
  }

  public abstract boolean doesThisPlantNeedWater();

  public abstract String whoAmI();

  public void waterPlant(double waterPerPlant) {
  }
}
