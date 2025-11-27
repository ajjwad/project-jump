package phase1.level2;

public class EvenOddCheck {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 7;

        boolean isNum1Even = (num1 % 2 == 0);
        boolean isNum2Even = (num2 % 2 == 0);

        if (isNum1Even && isNum2Even) {
            System.out.println("Both numbers are even");
        } else if (!isNum1Even && !isNum2Even) {
            System.out.println("Both numbers are odd");
        } else {
            System.out.println("One number is even and the other is odd");
        }
    }
}
