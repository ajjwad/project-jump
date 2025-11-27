package phase1.level3;

public class ThreeDigitDistinct {
    public static void main(String[] args) {
        int num = 553;
        int digit1 = num/100;
        int digit2 = (num/10) % 10;
        int digit3 = num%10;

        if (digit1 != digit2 && digit2 != digit3 && digit1 != digit3) {
            System.out.println(num + " has all distinct digits");
        } else {
            System.out.println(num + " does not have all distinct digits");
        }
    }
}
