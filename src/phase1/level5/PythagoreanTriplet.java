package phase1.level5;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        int a=3,b=4,c=5;
        if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)
            System.out.println("It is an pythagorean triplet");
        else
            System.out.println("Not a triplet");
    }
}
