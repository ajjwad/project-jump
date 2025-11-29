package phase2.level1;

public class NFactorial {
    public static void main(String[] args) {
        int num=6,fact=1;
        for(int i=1;i<=num;i++)
            fact*=i;
        System.out.println("Factorial of "+num+" is:"+fact);
    }
}
