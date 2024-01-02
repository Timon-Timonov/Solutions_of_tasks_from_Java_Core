package tasksByBook.lesson6;

public class Task_24byBook {
    public static final int SECONDS_IN_ONE_MINUTE = 60;
    public static final int SECONDS_IN_ONE_HOUR = 3600;
    private int seconds;
    private int minutes;
    private int hours;

    public Task_24byBook(int seconds) {
        this.hours = seconds / SECONDS_IN_ONE_HOUR;
        this.minutes = (seconds - this.hours * SECONDS_IN_ONE_HOUR) / SECONDS_IN_ONE_MINUTE;
        this.seconds = seconds - this.hours * SECONDS_IN_ONE_HOUR - this.minutes * SECONDS_IN_ONE_MINUTE;

    }

    public Task_24byBook(int hours, int munutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int compareTo(Task_24byBook obj) {
        if (this.getFullSeconds() > obj.getFullSeconds()) {
            return 1;
        } else if (this.getFullSeconds() < obj.getFullSeconds()) {
            return -1;
        }
        return 0;
    }

    public int getFullSeconds() {
        return seconds + minutes * SECONDS_IN_ONE_MINUTE + hours * SECONDS_IN_ONE_HOUR;
    }

    @Override
    public String toString() {
        return "Count of seconds: " + this.getFullSeconds() + ".";
    }
}
