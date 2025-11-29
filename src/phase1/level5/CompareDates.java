package phase1.level5;

public class CompareDates {
    public static void main(String[] args) {
        int day1=11,month1=8;
        int day2=4,month2=12;

        if(month1<month2)
            System.out.println(day1+"/"+month1+" comes before "+day2+"/"+month2);
        else if (month2>month1) {
            System.out.println(day2+"/"+month2+" comes before "+day1+"/"+month1);
        }else {
            if (day1 < day2) {
                System.out.println(day1 + "/" + month1 + " comes before " + day2 + "/" + month2);
            } else if (day1 > day2) {
                System.out.println(day2 + "/" + month2 + " comes before " + day1 + "/" + month1);
            } else {
                System.out.println("Both dates are the same");
            }
        }
    }
}
