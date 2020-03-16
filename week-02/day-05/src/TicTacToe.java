//public class TicTacToe {

//  public static void main(String[] args) {
    // Write a function that takes a filename as a parameter
    // The file contains an ended Tic-Tac-Toe match
    // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
    // Return "X", "O" or "Draw" based on the input file

//    System.out.println(ticTacResult("win-o.txt"));
    // Should print "O"

 //   System.out.println(ticTacResult("win-x.txt"));
    // Should print "X"

//    System.out.println(ticTacResult("draw.txt"));
    // Should print "Draw"
//  }
//}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.IntStream;

public class TicTacToe {
  public static void main(String[] args) {
    System.out.println(ticTacToe("files/draw.txt"));
  }
  public static String ticTacToe (String filepath){
    Path ticTacFilePath = Paths.get(filepath);
    try {
      List<String> ticTacLines = Files.readAllLines(ticTacFilePath);
      int [] [] ticTacMatrix = new int[3][3];
      for (int i = 0; i < 3 ; i++) {
        String row = ticTacLines.get(i);
        char [] rowArray = row.toCharArray();
        for (int j = 0; j < 3; j++) {
          ticTacMatrix[i][j] = (rowArray[j] == 'X') ? 1 : 0;
        }
      }
      int sumOfColoumn1 = 0;
      for(int i = 0; i < 3 ; i++) {
        sumOfColoumn1 += ticTacMatrix[i][0];
      }
      int sumOfColoumn2 = 0;
      for(int i = 0; i < 3 ; i++) {
        sumOfColoumn2 += ticTacMatrix[i][1];
      }
      int sumOfColoumn3 = 0;
      for(int i = 0; i < 3 ; i++) {
        sumOfColoumn3 += ticTacMatrix[i][2];
      }

      int sumOfRow1 = 0;
      for(int j = 0; j < 3 ; j++) {
        sumOfRow1 += ticTacMatrix[0][j];
      }
      int sumOfRow2 = 0;
      for(int j = 0; j < 3 ; j++) {
        sumOfRow2 += ticTacMatrix[1][j];
      }
      int sumOfRow3 = 0;
      for(int j = 0; j < 3 ; j++) {
        sumOfRow3 += ticTacMatrix[2][j];
      }
      int sumOfDiagonal = ticTacMatrix[0][0] + ticTacMatrix[1][1] + ticTacMatrix[2][2];

      if ((sumOfColoumn1 == 3) || (sumOfColoumn2 == 3) || (sumOfColoumn3) == 3 || (sumOfRow1 == 3) || (sumOfRow2 == 3) || (sumOfRow3 == 3) || (sumOfDiagonal == 3)){
        System.out.println("X");
      }
      else if ((sumOfColoumn1 == 0) || (sumOfColoumn2 == 0) || (sumOfColoumn3) == 0 || (sumOfRow1 == 0) || (sumOfRow2 == 0) || (sumOfRow3 == 0) || (sumOfDiagonal == 0)){
        System.out.println("O");
      }
      else {
        System.out.println("Draw");
      }
    }catch (IOException e){
      System.out.println("Files is not found");
    }
    return "everything went well";
  }
}
