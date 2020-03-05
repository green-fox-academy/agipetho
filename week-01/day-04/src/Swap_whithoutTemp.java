public class Swap_whithoutTemp {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        System.out.println("Before swapping, a = " + a);
        System.out.println("Before swapping, b = " + b);

        a = a + b;
        b = a - b;
        a = a- b;
        System.out.println("After swapping, a = " + a);
        System.out.println("After swapping, b = " + b);
    }
}
