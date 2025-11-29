package phase1.level4;

public class FindMedian {
    public static void main(String[] args) {
        int a=15;
        int b=7;
        int c=12;

        //method 1
        int total=a+b+c;
        int max=Math.max(a,Math.max(b,c));
        int min=Math.min(a,Math.min(b,c));
        int median=total-(max+min);
        System.out.println("Median is "+median);

        //method 2
        if((a>=b && a<=c) || (a<=b && a>=c))
            System.out.println(a+" is the median");
        else if ((b>=a && b<=c) || (b<=a && b>=c)) {
            System.out.println(b+" is the median");
        }else
            System.out.println(c+" is the median");
    }
}
