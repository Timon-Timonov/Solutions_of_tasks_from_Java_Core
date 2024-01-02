package tasksByBook.lesson16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task_65byBook {

    public static final int HOUR_START_OF_MEETING = 13;
    public static final int MINUTE_START_OF_MEETING = 00;
    public static final int DURING_OF_EVERYWEEK_MEETING_MONTHS = 2;

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDateTime timeNow = today.atTime(LocalTime.now());

        LocalDateTime dateTimeFirstMeeting = today.atTime(LocalTime.of(HOUR_START_OF_MEETING, MINUTE_START_OF_MEETING));
        LocalDateTime dateTimeateTimeLastMeeting = dateTimeFirstMeeting
                .plusMonths(DURING_OF_EVERYWEEK_MEETING_MONTHS);


        int count = 1;
        if (timeNow.isBefore(dateTimeFirstMeeting)) {
            System.out.println(count++ + ") " + dateTimeFirstMeeting);
        }
        for (int i = 1; dateTimeFirstMeeting.plusWeeks(i).isBefore(dateTimeateTimeLastMeeting); i++) {
            System.out.println(count++ + ") " + dateTimeFirstMeeting.plusWeeks(i));
        }
    }
}
