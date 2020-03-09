import java.util.Arrays;
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

public class Factorial {
    public static void main(String[] args) {
    int input = 2;
        System.out.println(factorio(input));
    }
    public static int factorio(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a *= i;
        }
        return a;
        }
    }
//{5!=5x4x3x2x1=120}
