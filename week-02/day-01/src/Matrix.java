import javax.swing.*;

// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
public class Matrix {
    public static void main(String[] args) {
        int [] [] multiDimensionalArray = new int [4][4];
        for (int i = 0; i <multiDimensionalArray.length ; i++) {
            for (int j = 0; j < multiDimensionalArray.length; j++) {
                if (j == i) {
                    System.out.print(1);
                }
                    else {
                        System.out.print(0);
                }
            }
            System.out.println();
        }

    }
}
