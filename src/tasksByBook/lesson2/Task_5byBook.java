package tasksByBook.lesson2;

public class Task_5byBook {

    public static final int SECONDS_IN_MINUTE = 60;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int HOURS_IN_ONE_DAY = 24;
    public static final int DAYS_IN_A_WEEK = 7;

    public static void main(String[] args) {

        int timeSec = 1743740;

        int sec, min, hour, days, week;
        int x = timeSec;

        sec = timeSec % SECONDS_IN_MINUTE;
        x = (x - sec) / SECONDS_IN_MINUTE;

        min = x % MINUTES_IN_HOUR;
        x = (x - min) / MINUTES_IN_HOUR;

        hour = x % HOURS_IN_ONE_DAY;
        x = (x - hour) / HOURS_IN_ONE_DAY;

        days = x % DAYS_IN_A_WEEK;
        x = (x - days) / DAYS_IN_A_WEEK;

        week = x;

        System.out.print(timeSec + " seconds. It is - ");

        if (week != 0) {
            System.out.print(week + " week(s) ");
        }
        if (days != 0) {
            System.out.print(days + " day(s) ");
        }
        if (hour != 0) {
            System.out.print(hour + " hour(s) ");
        }
        if (min != 0) {
            System.out.print(min + " minute(s) ");
        }
        if (sec != 0) {
            System.out.print(sec + " second(s)");
        }
        System.out.println(".");
    }
}
