import java.util.Scanner;
public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egy számot!");
        int diamondNumber = scanner.nextInt();
        double dividedNumber = (double) diamondNumber / 2;
        long roundhalfDiamond = Math.round (dividedNumber);
        int halfDiamond = diamondNumber / 2;

        for (int i = 1; i <= roundhalfDiamond; i++) {
            for (int j = 0; j < (halfDiamond - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < ((2*i) -1); k++) {
                System.out.print("*");
            }
//            System.out.println();
        }
        for (int i = halfDiamond; i > 0; i--) {
            for (int j = 0; j < (halfDiamond - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < ((2*i) -1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
