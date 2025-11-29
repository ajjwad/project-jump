package phase2.level1;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int num=5,sum=0;
        for(int i=1;i<=num;i++)
            sum+=i;
        System.out.println("Sum of "+num+" natural numbers is:"+sum);
    }
}
