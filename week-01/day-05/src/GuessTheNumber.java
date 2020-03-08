import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNumber= 1002;
        System.out.println("Guess the number!");

        for (int i = 1; i < 999999999; i++) {
            int guessedNumber = scanner.nextInt();
            if (guessedNumber < myNumber){
                System.out.println("The stored number is higher. Guess again!");
            }
            else if (guessedNumber > myNumber){
                System.out.println("The stored number is lower. Guess again!");
            }
            else {
                System.out.println("The found number: " + guessedNumber + " You had " + i + " guess" + ((i>1) ? "es." : "."));
            return;
            }
        }
    }
}
