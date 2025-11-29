package phase1.level5;

public class ValidDate {
    public static void main(String[] args) {
        int day=23;
        int month=12;
        boolean isValid=false;

        if(month>=1 && month<=12){
            switch (month){
                case 2: isValid= day>=1 && day<=28; break;
                case 4: case 6: case 9: case 11: isValid= day>=1 && day<=31; break;
                default: isValid= day>=1 && day<=31; break;
            }
        }

        if(isValid) System.out.println(day+"/"+month+" is a valid date");
        else System.out.println(day+"/"+month+" is not a valid date");
    }
}
