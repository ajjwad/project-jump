package phase1.level5;

public class GP {
    public static void main(String[] args) {
        int a=16,b=4,c=8;

        if(b*b==a*c || c*c==a*b || a*a==b*c)
            System.out.println("It is an GP");
        else
            System.out.println("Not an GP");
    }
}