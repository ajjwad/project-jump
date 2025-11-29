package phase1.level4;

public class TaxEligibility {
    public static void main(String[] args) {
        int age=23;
        int income=323000;
        if(age>18){
            if(income>500000)
                System.out.println("Eligible for tax");
            else
                System.out.println("Not Eligible for tax");
        }else
            System.out.println("Not Eligible for tax");
    }
}
