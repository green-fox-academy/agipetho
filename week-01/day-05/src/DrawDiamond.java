import java.util.Scanner;
public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number of row of the diamond!");
        int diamondCnt = scanner.nextInt();
        double dividedNumber = (double) diamondCnt / 2;
        int roundhalfDiamond = (int) Math.round (dividedNumber);
        int halfDiamond = diamondCnt / 2;

        for (int i = 1; i <= halfDiamond; i++) {
            for (int j = 0; j < (roundhalfDiamond - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < ((2*i) -1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = roundhalfDiamond; i > 0; i--) {
            for (int j = 0; j < (roundhalfDiamond - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < ((2*i) -1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
