//public class AnimalsAndLegs {
//    public static void main(String[] args) {
//         Write a program that asks for two integers
//         The first represents the number of chickens the farmer has
//         The second represents the number of pigs owned by the farmer
//         It should print how many legs all the animals have
//    }
//}

import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
//        one scanner is enough!!!!
    System.out.println("How many chickens do you have?");
    int chicken = input.nextInt();
    System.out.println("How many pigs do you have?");
    int pig = input.nextInt();

    System.out.println("There are " + ((chicken * 2) + (pig * 4)) + " legs at your farm.");

  }
}
