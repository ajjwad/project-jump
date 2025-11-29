package phase1.level4;

public class AmPmCheck {
    public static void main(String[] args) {
        int hour=23;
        int minute=42;
        if(hour<12)
            System.out.println(hour+":"+minute+" is AM");
        else
            System.out.println(hour+":"+minute+" is PM");

    }
}
