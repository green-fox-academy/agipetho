import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner hasonlito = new Scanner(System.in);
        System.out.println("Írj be egy számot!");
        int number = hasonlito.nextInt();

        if (number <= 0) {
            System.out.println("Not enogh");
        }
        else if (number == 1){
            System.out.println("One");
        }
        else if (number == 2){
            System.out.println("Two");
        } else {
            System.out.println("A lot");
        }


    }
}
