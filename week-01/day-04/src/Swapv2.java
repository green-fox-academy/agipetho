public class Swapv2 {
    public static void main(String[] args) {
            int a = 123;
            int b = 526;
            System.out.println("Before swapping, a = " + a);
            System.out.println("Before swapping, b = " + b);

            int temp = a;
            a = b;
            b = temp;
            System.out.println("After swapping, a = " + a);
            System.out.println("After swapping, b = " + b);
        }
}
