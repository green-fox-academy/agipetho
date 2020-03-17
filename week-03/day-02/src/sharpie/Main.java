package sharpie;

public class Main {
  public static void main(String[] args) {
    Sharpie sharpie1 = new Sharpie ("red", 10);
    Sharpie sharpie2 = new Sharpie("blue", 50);
    Sharpie sharpie3 = new Sharpie();

    sharpie1.use();
    sharpie1.use();
    sharpie2.use();

    System.out.println(sharpie1.inkAmount);
    System.out.println(sharpie2.inkAmount);
    System.out.println(sharpie3.color);
  }
}
