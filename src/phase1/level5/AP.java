package phase1.level5;

public class AP {
    public static void main(String[] args) {
        int a=7,b=3,c=5;

        if(2*b==a+c || 2*c==a+b || 2*a==b+c)
            System.out.println("It is an AP");
        else
            System.out.println("Not an AP");
    }
}