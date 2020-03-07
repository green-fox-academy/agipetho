import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egy számot!");
        int pyramidNumber = scanner.nextInt();

        for (int i = 1; i <= pyramidNumber; i++) {
            for (int j = 0; j < (pyramidNumber - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < ((2*i) -1); k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
