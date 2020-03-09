import java.util.Arrays;

// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

public class Sum {
    public static void main(String[] args) {
     int nNumber = 2;
        System.out.println(sum(nNumber));
    }
    public static int sum(int k){
        int l = 0;
        for (int i = 0; i <= k; i++) {
           l += i;
        }
        return l;
        }
}
