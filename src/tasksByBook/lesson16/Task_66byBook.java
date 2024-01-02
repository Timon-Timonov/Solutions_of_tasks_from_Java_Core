package tasksByBook.lesson16;

import java.time.LocalDate;

public class Task_66byBook {

    public static final int DAYS_AGO = 60;

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today is: " + today);
        System.out.println(DAYS_AGO + " days ago was: " + today.minusDays(DAYS_AGO));


    }
}
