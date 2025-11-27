package phase1.level2;

public class GradeScale {
    public static void main(String[] args) {
        int mark = 67;

        if (mark < 0 || mark > 100) {
            System.out.println("Invalid grade");
        } else if (mark <= 20) {
            System.out.println("F Grade");
        } else if (mark <= 40) {
            System.out.println("D Grade");
        } else if (mark <= 60) {
            System.out.println("C Grade");
        } else if (mark <= 80) {
            System.out.println("B Grade");
        } else { // 81–100
            System.out.println("A Grade");
        }
    }
}
