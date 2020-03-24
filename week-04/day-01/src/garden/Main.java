package garden;

public class Main {
  public static void main(String[] args) {
    Flower flower1 = new Flower("yellow", 10);
    Flower flower2 = new Flower("blue", 30);
    Tree tree1 = new Tree("purple", 10);
    Tree tree2 = new Tree("orange", 30);

    System.out.println(" In my garden there are:\n" +
        "a " + flower1.getColor() + " Flower \n" +
        "a " + flower2.getColor() + " Flower \n " +
        "a " + tree1.getColor() + " Tree \n " +
        "a " + tree2.getColor() + " Tree \n ");
    System.out.println( " -------------------- ");
    System.out.println("The " + flower1.getColor() + " Flower " + ((flower1.doesItNeedWater())? "needs" : "does not need ") +" water \n");
    /*
    The yellow Flower needs water
The blue Flower needs water
The purple Tree needs water
The orange Tree needs water
     */

  }

  public void firstWater() {
  }

  public void secondWater() {

  }
}
