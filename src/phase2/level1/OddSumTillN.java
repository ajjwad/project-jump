package phase2.level1;

public class OddSumTillN {
    public static void main(String[] args) {
        int num=120,sum=0;
        for(int i=0;i<=num;i++) {
            if (i % 2 != 0)
                sum+=i;
        }
        System.out.println("Sum of numbers till "+num+" is:"+sum);
    }
}
