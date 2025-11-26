package phase1.level1;

public class ThreeLargestNumbers {
    public static void main(String[] args) {
        int num1=43;
        int num2=83;
        int num3=17;

        int largest;
        if(num1>=num2 && num1>=num3)
            largest=num1;
        else if(num2>=num1 && num2>=num3)
            largest=num2;
        else
            largest=num3;
        System.out.println("Largest is "+largest);
    }
}
