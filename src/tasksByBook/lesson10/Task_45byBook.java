package tasksByBook.lesson10;

import tasksByBook.lesson10.task_44byBook.MyException;
import tasksByBook.lesson10.task_44byBook.Runner_44;

public class Task_45byBook {
    public static void main(String[] args) {
        try {
            Runner_44.catchException();
        } catch (MyException e) {
            System.out.println("Exception is catched!");
            e.printStackTrace();

        }
    }
}
