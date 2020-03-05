public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double highInM = 1.78;

        double bmi = (massInKg / (highInM * highInM));
        System.out.println(bmi);

        System.out.println("Ideális!:)");
    }
}
