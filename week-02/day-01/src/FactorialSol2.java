/*
// - Create a function called `factorio`
//   that returns it's input's factorial
 */

public class FactorialSol2 {
  public static void main(String[] args) {
    int fNumber = 5;
    System.out.println(factorio(fNumber));
  }

  public static int factorio(int number){
    int factorio = 1;
    for (int i = 1; i <=number ; i++) {
      factorio *=i;
    }
    return factorio;
  }
}
