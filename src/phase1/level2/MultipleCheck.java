package phase1.level2;

public class MultipleCheck {
    public static void main(String[] args) {
        int a=5;
        int b=13;

        if(a==0 || b==0)
            System.out.println("Invalid operation");
        else if (a%b==0) {
            System.out.println(a+" is a multiple of "+b);
        }
        else if (b%a==0) {
            System.out.println(b+" is a multiple of "+a);
        }
        else
            System.out.println("Neither is a multiple of other");
    }
}
