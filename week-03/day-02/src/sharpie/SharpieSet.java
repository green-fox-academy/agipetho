package sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  private List<Sharpie> setOfSharpies;

  public SharpieSet () {
    setOfSharpies = new ArrayList<>();
  }

  public void add(Sharpie sharpie){
    setOfSharpies.add(sharpie);
  }

  public void useASharpie(int index){
    setOfSharpies.get(index).use();
  }
  public int countUsable() {
    int counter = 0;
    for (Sharpie sharpie : setOfSharpies) {
      if (sharpie.inkAmount > 0) {
        counter++;
      }
    }
    return counter;
  }

  public void removeTrash() {
    for ( Sharpie sharpie: setOfSharpies) {
      if (sharpie.inkAmount <= 0){
        setOfSharpies.remove(sharpie);
      }
    }
  }

  @Override
  public String toString() {
    String output = new String();
    for (Sharpie sharpie : setOfSharpies) {
      output += sharpie.color + sharpie.width + sharpie.inkAmount + "\n";
    }
    return output;
  }
}
