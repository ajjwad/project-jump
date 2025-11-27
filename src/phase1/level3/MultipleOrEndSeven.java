package phase1.level3;

public class MultipleOrEndSeven {
    public static void main(String[] args) {
        int num=27;

        if(num%7==0)
            System.out.println(num+" is a multiple of 7");
        else if (num%10==7) {
            System.out.println(num+" ends with 7");
        }
    }
}
