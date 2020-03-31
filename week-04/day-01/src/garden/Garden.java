
/*
The task is to create a garden application, so in your main method you should create a garden with flowers and trees.
 The program should demonstrate an example garden with two flowers (yellow and blue) and two trees (purple and orange).
 In the example after creating them you should show the user, how the garden looks like.
 After that the program should water the garden twice, first with the amount of 40 then with 70.
  And after every watering the user should see the state of the garden as you can see in the output.
 */

/*
The Garden
is able to hold unlimited amount of flowers or trees
when watering it should only water those what needs water with equally divided amount amongst them
eg. watering with 40 and 4 of them need water then each gets watered with 10
 */
package garden;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Garden {
  List<Plant> plants;

  public Garden() {
    plants = new ArrayList<>();

    Plant flower1 = new Flower("yellow", 0);
    Plant flower2 = new Flower("blue", 0);
    Plant tree1 = new Tree("purple", 0);
    Plant tree2 = new Tree("orange", 0);

    plants.add(flower1);
    plants.add(flower2);
    plants.add(tree1);
    plants.add(tree2);
  }

  public void showMyGarden() {
    System.out.println("In my garden there are: ");
    for (Plant plant : plants) {
      System.out.println("a " + plant.color + " " + plant.whoAmI());
    }
    System.out.println("---------");
    for (Plant plant : plants) {
      System.out.println("The " + plant.color + " " + plant.whoAmI() + ((plant.doesThisPlantNeedWater()) ? " needs" : " does not need ") + " water");
    }
    for (Plant plant : plants) {
      System.out.println(plant.currentWater);
    }
  }

  public void waterMyGarden() {
    int counterOfPlants = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("How much water do you want to use?");
    int waterAmount = scanner.nextInt();

    try {
      for (Plant plant : plants) {
        if (plant.doesThisPlantNeedWater()) {
          counterOfPlants++;
        }
      }
      for (Plant plant : plants) {
        plant.waterPlant((waterAmount / counterOfPlants));
      }
    } catch (ArithmeticException e) {
      System.out.println("Arithmetical execption, do not divide with zero!");
    }
  }
}
