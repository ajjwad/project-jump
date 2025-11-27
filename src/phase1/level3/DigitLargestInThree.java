package phase1.level3;

public class DigitLargestInThree {
    public static void main(String[] args) {
        int num = 423;
        int digit1 = num/100;
        int digit2 = (num/10) % 10;
        int digit3 = num%10;

        if (digit2 > digit1 && digit2 > digit3) {
            System.out.println("Middle digit " + digit2 + " is the largest.");
        } else if (digit2 < digit1 && digit2 < digit3) {
            System.out.println("Middle digit " + digit2 + " is the smallest.");
        } else {
            System.out.println("Middle digit " + digit2 + " is neither largest nor smallest.");
        }
    }
}
