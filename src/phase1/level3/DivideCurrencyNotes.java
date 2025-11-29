package phase1.level3;

public class DivideCurrencyNotes {
    public static void main(String[] args) {
        int amount=4697800;
        if (amount%100!=0 || amount<=0)
            System.out.println("Amount cannot be evenly divided");
        else {
            int n2000=amount/2000;
            amount=amount%2000;

            int n500=amount/500;
            amount=amount%500;

            int n100=amount/100;
            amount=amount%100;

            System.out.println("2000 notes: " + n2000);
            System.out.println("500 notes: " + n500);
            System.out.println("100 notes: " + n100);
        }
    }
}
