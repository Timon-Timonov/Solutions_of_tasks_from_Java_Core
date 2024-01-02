package tasksByBook.lesson8.task_35_36_37byBook;

import java.util.Arrays;
import java.util.Scanner;

public class Task_37byBook {
    public static void main(Scanner scanner) {

        SeasonsOfTheYear seasonsOfTheYear = null;
        String season;
        int countOfDays;


        do {
            season = scanner.nextLine().trim().toLowerCase();
            try {
                seasonsOfTheYear = SeasonsOfTheYear.valueOf(season);
            } catch (IllegalArgumentException e) {
                System.out.println("Enter season again.");
                System.out.println("You have to choose from: ");
                System.out.println(Arrays.toString(SeasonsOfTheYear.values()));
            }
        } while (seasonsOfTheYear == null);

        countOfDays = seasonsOfTheYear.getCountOfDays();
        System.out.println("There are " + countOfDays + " days in this season.");
        System.out.println();
    }
}
