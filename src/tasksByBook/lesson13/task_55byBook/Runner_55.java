package tasksByBook.lesson13.task_55byBook;

import java.util.ArrayList;
import java.util.List;

public class Runner_55 {

    public static final int COUNT_OF_THREADS = 10;
    public static final long TIME_TO_SLEEP = 2_000;

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " start.");
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < COUNT_OF_THREADS; i++) {
            list.add(new Thread(new MyThread()));
        }
       list.forEach(Thread::start);
        System.out.println(Thread.currentThread().getName() + " finish.");
    }
}
