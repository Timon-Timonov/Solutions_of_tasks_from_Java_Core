package tasksByBook.lesson17.task_67byBook;

import java.time.LocalDate;

public class Task_67byBook {
    private static Task_67byBook instance;

    private Task_67byBook() {
    }

    public static Task_67byBook getInstance() {
        if (instance == null) {
            instance = new Task_67byBook();
        }
        return instance;
    }

    public void printCurrentDate() {
        System.out.println(LocalDate.now());
    }
}
