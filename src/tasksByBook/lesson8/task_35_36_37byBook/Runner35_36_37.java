package tasksByBook.lesson8.task_35_36_37byBook;


import java.util.Scanner;

public class Runner35_36_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Solution of task_35byBook:");
        Task_35byBook.main();
        System.out.println();


        System.out.println("Solution of task_36byBook:");
        Task_36byBook.main(scanner);
        System.out.println();


        System.out.println("Solution of task_37byBook:");
        Task_37byBook.main(scanner);
        System.out.println();
        scanner.close();
    }
}
