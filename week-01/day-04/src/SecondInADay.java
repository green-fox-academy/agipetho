public class SecondInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int remainingSeconds = (60 - currentSeconds) + (60 * (59 - currentMinutes)) + (3600 * (23 - currentHours));

        System.out.println(remainingSeconds);
    }
}
