package phase1.level2;

public class TriangleType {
    public static void main(String[] args) {
        int side1=3;
        int side2=4;
        int side3=5;
        if(side1==side2 || side2==side3 || side3==side1)
            System.out.println("It is an isosceles triangle");
        else if(side1==side2 && side2==side3)
            System.out.println("It is an equilateral triangle");
        else
            System.out.println("It is an scalene triangle");
    }
}
