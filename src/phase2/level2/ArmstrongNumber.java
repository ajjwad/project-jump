package phase2.level2;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=153;
        int originalNum=num;
        int sum=0;
        while(num>0) {
            sum += Math.pow(num % 10, 3);
            num /= 10;
        }
        if(originalNum==sum)
            System.out.println("It is a Armstrong number");
        else
            System.out.println("It is not a Armstrong number");
    }
}
