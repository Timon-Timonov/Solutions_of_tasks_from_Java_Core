package tasksByBook.lesson8.task_35_36_37byBook;

import java.util.Arrays;
import java.util.Scanner;

public class Task_36byBook {
    public static void main(Scanner scanner) {
        System.out.println("Enter season: ");

        SeasonsOfTheYear seasonsOfTheYear = null;
        String season;


        do {
            season = scanner.nextLine().trim().toLowerCase();

            try {
                seasonsOfTheYear = SeasonsOfTheYear.valueOf(season);
            } catch (IllegalArgumentException e) {
                System.out.println("You have to choose season from ");
                System.out.println(Arrays.toString(SeasonsOfTheYear.values()));
                System.out.println("Enter season again: ");
            }
        } while (seasonsOfTheYear == null);


        int current = seasonsOfTheYear.ordinal();
        int next = ((current + 1) <= (SeasonsOfTheYear.values().length - 1) ? (current + 1) : 0);

        System.out.println("Next season: " + SeasonsOfTheYear.values()[next]);
    }
}
