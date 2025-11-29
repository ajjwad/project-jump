package phase1.level5;

public class HourMinuteAngle {
    public static void main(String[] args) {
        int hour=6;
        int minute=32;

        /*
            For HOUR
            12 hours present in clock, each hour angle=360/12=30
            For 1 hour, 30 deg is the angle
            For each minute, it will be 30 degree/60 minute = 0.5 dergree per minute
            So for hour, the angle will be calculated by ->
                angle for that hour * 30 + the drifted value for the hour will be based on the minute
        */
        double hourAngle= (hour%12)*30 + minute*0.5;

        // For MINUTE, each minute will be 360 deg/60 min= 6 deg/min
        double minuteAngle= minute*6.0;

        //done to make angle positive
        double angle= Math.abs(hourAngle-minuteAngle);

        double smallerAngle=Math.min(angle, 360-angle);

        System.out.printf("Angle at %d:%02d = %.1f°\n", hour, minute, smallerAngle);
    }
}
