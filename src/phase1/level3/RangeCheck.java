package phase1.level3;

public class RangeCheck {
    public static void main(String[] args) {
        int num = 456;

        if (num >= 100 && num <= 999) {
            System.out.println(num + " lies within [100, 999]");
        } else {
            System.out.println(num + " does not lie within [100, 999]");
        }
    }
}
