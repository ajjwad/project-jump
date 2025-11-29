package phase1.level5;

public class SumVsProduct {
    public static void main(String[] args) {
        int num=1223;
        int dig1=num/1000;
        int dig2=(num%1000)/100;
        int dig3=(num%1000)/10;
        int dig4=num%10;

        if(num<1000) dig1=0;
        if(num<100) dig2=0;
        if(num<10) dig3=0;

        if(dig1+dig2+dig3+dig4 > dig1*dig2*dig3*dig4)
            System.out.println(" sum of its digits is greater than the product of its digits");
        else
            System.out.println(" sum of its digits is not greater than the product of its digits");

    }
}
