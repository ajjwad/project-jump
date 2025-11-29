package phase1.level5;

public class CoordinateCheck {
    public static void main(String[] args) {
        int x=0,y=3;
        if(x==0 && y==0)
            System.out.println("x,y is on origin");
        else if (x==0) {
            System.out.println("Point lies on y axis");
        } else if (y==0) {
            System.out.println("Point lies on x axis");
        }else
            System.out.println("None");
    }
}
