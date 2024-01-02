package tasksByBook.lesson8.task_35_36_37byBook;

import java.util.Arrays;

public class Task_35byBook {
    public static void main() {
        System.out.println(Arrays.toString(SeasonsOfTheYear.values()));
        for (int i = 0; i < SeasonsOfTheYear.values().length; i++) {
            System.out.print(SeasonsOfTheYear.values()[i].getId() + ") ");
            System.out.print(SeasonsOfTheYear.values()[i] + ", ");
            System.out.print(SeasonsOfTheYear.values()[i].getCountOfDays() + ", ");
            System.out.print(SeasonsOfTheYear.values()[i].getDescription() + "; ");
            System.out.println();
        }
    }
}
