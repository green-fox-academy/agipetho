package garden;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Garden myGarden = new Garden();
    myGarden.showMyGarden();
    myGarden.waterMyGarden();
    myGarden.showMyGarden();
    myGarden.waterMyGarden();
    myGarden.showMyGarden();
  }
}