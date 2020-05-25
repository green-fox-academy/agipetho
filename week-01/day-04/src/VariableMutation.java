public class VariableMutation {
  public static void main(String[] args) {
    int a = 3;
    a += 10;
    System.out.println(a);

    int e = 8;
    e = e * e * e;
    System.out.println(e);

    int f1 = 123;
    int f2 = 345;
    boolean isf1biggerthanf2 = f1 > f2;
    System.out.println(isf1biggerthanf2);

    int h = 135798745;
    int divisor = 11;
    boolean divide11 = (h % divisor) == 0;
    System.out.println(divide11);

    int i1 = 10;
    int i2 = 3;
    boolean isItHigherSmaller = (i2 * i2 < i1 && i1 < i2 * i2 * i2);
    System.out.println(isItHigherSmaller);

    int j = 1521;
    boolean isDividable = ((j % 3) == 0) || ((j % 5) == 0);
    System.out.println(isDividable);


  }
}
