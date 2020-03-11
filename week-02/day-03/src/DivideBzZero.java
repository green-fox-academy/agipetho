
// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;

public class DivideBzZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int divisor = scanner.nextInt();

//        while (divisor == 0){
//            System.out.println("Give me a number");
//            int dividor = scanner.nextInt();
//        }

        try {
            int result = 10 / divisor;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
            main(null);
        }
    }
}
