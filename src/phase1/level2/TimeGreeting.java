package phase1.level2;

public class TimeGreeting {
    public static void main(String[] args) {
        int hour = 17;
        if (hour < 0 || hour > 23) {
            System.out.println("Invalid hour");
        } else if (hour <= 5) {
            System.out.println("Good Night");
        } else if (hour <= 11) {
            System.out.println("Good Morning");
        } else if (hour <= 17) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }
    }
}
