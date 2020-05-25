public class Cuboid {
  public static void main(String[] args) {
    double a = 10.5;
    double b = 20.8;
    double c = 30.7;

    double surface = 2 * (a * b) + 2 * (a * c) + 2 * (c * b);
    double volume = a * b * c;

    System.out.println(surface);
    System.out.println(volume);

  }
}
