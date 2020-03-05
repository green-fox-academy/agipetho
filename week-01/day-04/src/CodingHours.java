public class CodingHours {
    public static void main(String[] args) {
        int codingHours = 6;
        int numberWeeks = 17;
        int weeklyWorkHours = 52;

        System.out.println(codingHours * numberWeeks *5);
        System.out.println( ((float)(codingHours * 5) / weeklyWorkHours) *100 + "%");
    }
}
