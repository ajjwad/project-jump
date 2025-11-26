package phase1.level1;

public class TemperatureType {
    public static void main(String[] args) {
        int temp=43;
        if(temp<=25)
            System.out.println("It is Cold");
        else if(temp>25 && temp<33)
            System.out.println("It is Warm");
        else if(temp>=33)
            System.out.println("It is Hot");
    }
}
