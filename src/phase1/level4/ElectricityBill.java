package phase1.level4;

public class ElectricityBill {
    public static void main(String[] args) {
        int units = 250;

        double bill = 0;

        if (units <= 100) {
            bill = units * 4.0;
        } else if (units <= 200) {
            bill = 100 * 4.0 + (units - 100) * 5.0;
        } else {
            bill = 100 * 4.0 + 100 * 5.0 + (units - 200) * 6.0;
        }
        System.out.println("Bill for " + units + " units: Rs" + bill);
    }
}
