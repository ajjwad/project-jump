package phase1.level3;

public class FirstLastFourDigit {
    public static void main(String[] args) {
        int num=1231;
        int firstDigit=num/1000;
        int lastDigit=num%10;

        if(firstDigit==lastDigit)
            System.out.println("First and last digit are equal");
        else
            System.out.println("Not equal");
    }
}
