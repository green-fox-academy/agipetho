import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many miles?");
        double quantMile = scanner.nextDouble();
        System.out.println("It's " + quantMile * 1.7 + " km.");
    }
}
