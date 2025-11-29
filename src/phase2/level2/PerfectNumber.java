package phase2.level2;

public class PerfectNumber {
    public static void main(String[] args) {
        int num=28,sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                sum+=i;
        }
        if(sum==num)
            System.out.println("It is a perfect number");
        else
            System.out.println("Not a perfect number");
    }
}
