package phase1.level3;

public class DigitCheck {
    public static void main(String[] args) {
        int num=532;

        if (num < 0) {
            System.out.println("Negative number");
        } else if (num <= 9) {
            System.out.println("It is a single digit");
        } else if (num <= 99) {
            System.out.println("It is a double digit");
        } else {
            System.out.println("It is a multi digit");
        }
    }
}
