package tasksFromLessons.lesson4$30_08_22$;

public class Task_5 {
    public static final int SECONDS_IN_ONE_MINUTE = 60;
    public static final int MINUTES_IN_ONE_HOUR = 60;
    public static final int HOURS_IN_ONE_DAY = 24;
    public static final int DAYS_IN_ONE_WEEK = 7;

    private long seconds;

    private int sec;
    private int minutes;
    private int hours;
    private int days;
    private int weeks;


    public Task_5(long seconds) {
        this.seconds = seconds;
        printCorrectTimeInterval(seconds);
    }

    private void printCorrectTimeInterval(long time) {

        System.out.println(time + " seconds it is: ");

        sec = (int) time % SECONDS_IN_ONE_MINUTE;
        time /= SECONDS_IN_ONE_MINUTE;
        minutes = (int) time % MINUTES_IN_ONE_HOUR;
        time /= MINUTES_IN_ONE_HOUR;
        hours = (int) time % HOURS_IN_ONE_DAY;
        time /= HOURS_IN_ONE_DAY;
        days = (int) time % DAYS_IN_ONE_WEEK;
        time /= DAYS_IN_ONE_WEEK;
        weeks = (int) time / DAYS_IN_ONE_WEEK;


        if (weeks != 0) {
            System.out.println(weeks + " weeks ");
        }
        if (days != 0) {
            System.out.println(days + " days ");
        }
        if (hours != 0) {
            System.out.println(hours + " hours ");
        }
        if (minutes != 0) {
            System.out.println(minutes + " minutes ");
        }
        if (sec != 0) {
            System.out.println(sec + " seconds ");
        }
    }
}
