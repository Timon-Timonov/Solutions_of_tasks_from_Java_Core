package tasksFromLessons.lesson13$06_10_22$.task_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;

        System.out.println("Enter line ofNumbers:");
        line = scanner.nextLine();
        String[] numbers = line.split("\\D+");
        System.out.print("All line: ");
        System.out.println(line);

        Set<Integer> mySet = new HashSet<Integer>();
        for (String s : numbers) {
            mySet.add(Integer.valueOf(s));
        }
        System.out.print("Line after distinct: ");
        for (Integer i : mySet) {
            System.out.print(i + ", ");

        }

    }

}
