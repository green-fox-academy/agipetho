/*Sharpie Set
Reuse your Sharpie class
Create SharpieSet class
it contains a list of Sharpie
countUsable() -> sharpie is usable if it has ink in it
removeTrash() -> removes all unusable sharpies

 */

package sharpie;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    SharpieSet mySharpieSet = new SharpieSet();
    mySharpieSet.add(new Sharpie("red", 10));
    mySharpieSet.add(new Sharpie("blue", 50));
    mySharpieSet.add(new Sharpie("green", 30));

    for (int i = 0; i < 160; i++) {
      mySharpieSet.useASharpie(1);
    }
    System.out.println(mySharpieSet.countUsable());
    mySharpieSet.removeTrash();
    System.out.println(mySharpieSet.toString());
  }
}


//Solution for the simple Sharpie exercise:
//Sharpie sharpie1 = new Sharpie("red", 10);
//Sharpie sharpie2 = new Sharpie("blue", 50);
//Sharpie sharpie3 = new Sharpie("green", 30);

// sharpie1.use();
//sharpie1.use();
// sharpie2.use();

//System.out.println(sharpie1.inkAmount);
//System.out.println(sharpie2.inkAmount);
//System.out.println(sharpie3.color);

