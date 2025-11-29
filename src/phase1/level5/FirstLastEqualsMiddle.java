package phase1.level5;

public class FirstLastEqualsMiddle {
    public static void main(String[] args) {
        int num=143;
        int firstDigit=num/100;
        int lastDigit=num%10;
        int middleDigit= (num%100)/10;
        if(firstDigit+lastDigit==middleDigit)
            System.out.println("first and last digit equals the middle digit");
        else
            System.out.println("first and last digit not equals the middle digit");

    }
}
