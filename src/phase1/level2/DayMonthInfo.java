package phase1.level2;

public class DayMonthInfo {
    public static void main(String[] args) {
        int dayNumber=6;
        int monthNumber=3;

        switch(dayNumber){
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Invalid day number"); break;
        }

        switch (monthNumber) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 days (ignoring leap years)");
                break;
            default:
                System.out.println("Invalid month number");
        }
    }
}
