package phase1.level5;

public class CenturyCheck {
    public static void main(String[] args) {
        int year = 2025;
        int century;
        if (year % 100 == 0) {
            century = year / 100;
        } else {
            century = (year / 100) + 1;
        }
        System.out.println(year + " year is in " + century + " century");
    }
}
