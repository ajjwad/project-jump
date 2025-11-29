package phase2.level2;

public class SumOfDigits {
    public static void main(String[] args) {
        int num=235,sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("Sum of the digits is:"+sum);
    }
}
