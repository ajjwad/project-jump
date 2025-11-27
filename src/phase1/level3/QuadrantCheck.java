package phase1.level3;

public class QuadrantCheck {
    public static void main(String[] args) {
        int x = 5;
        int y = -3;

        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println("On Y axis");
        } else if (y == 0) {
            System.out.println("On X axis");
        } else if (x > 0 && y > 0) {
            System.out.println("First Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("Second Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("Third Quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("Fourth Quadrant");
        }
    }
}
