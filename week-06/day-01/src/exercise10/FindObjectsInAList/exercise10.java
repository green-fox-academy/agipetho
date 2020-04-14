/*
Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:

Write a Stream Expression to find the foxes with green color!
Write a Stream Expression to find the foxes with green color, and age less then 5 years!
Write a Stream Expression to find the frequency of foxes by color!
 */

package exercise10.FindObjectsInAList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class exercise10 {
  public static void main(String[] args) {

    List<Fox> myFoxes = new ArrayList<>();

    Fox fox1 = new Fox("vetulus", "green", 2);
    Fox fox2 = new Fox("Vuk", "red", 3);
    Fox fox3 = new Fox("GFA", "green", 6);
    Fox fox4 = new Fox("Karak", "red", 13);
    Fox fox5 = new Fox("vulpi", "blue", 2);

    myFoxes.add(fox1);
    myFoxes.add(fox2);
    myFoxes.add(fox3);
    myFoxes.add(fox4);
    myFoxes.add(fox5);

    System.out.println(myFoxes.size());

    System.out.println("Green color foxes: ");
    myFoxes.stream()
        .filter(x -> x.getColor().equals("green"))
        .forEach(x -> System.out.println(x.getName()));

    System.out.println("--------- '\n' Green color + age less than 5: ");

    myFoxes.stream()
        .filter(x -> x.getColor().equals("green") && x.getAge() < 5)
        .forEach(x -> System.out.println(x.getName()));

    System.out.println("--------- '\n' Frequency of foxes by color: ");
    Map<String, Long> foxFrequenciessByColor = myFoxes.stream()
        .collect(Collectors.groupingBy(f -> f.getColor(), Collectors.counting()));
    foxFrequenciessByColor.forEach((k, v) -> System.out.println(k + ":" + v));
  }
}
