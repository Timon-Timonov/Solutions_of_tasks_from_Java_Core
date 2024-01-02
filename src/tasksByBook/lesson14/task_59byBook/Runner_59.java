package tasksByBook.lesson14.task_59byBook;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class Runner_59 {

    public static final int COUNT_OF_THREADS_IN_POOL = 3;
    public static final int MAX_VALUE_OF_NUMBERS = 10_000;
    public static final int COUNT_OF_TASKS_FOR_POOL = 10;
    public static final int COUNT_OF_NUMBERS = 10;
    public static final long MIN_TIME_TO_SLEEP_THREAD = 1_000;
    public static final long MAX_TIME_TO_SLEEP_THREAD = 10_000;

    public static void main(String[] args) {
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date())
                + Thread.currentThread().getName() + " start.");

        ExecutorService pool = Executors.newFixedThreadPool(COUNT_OF_THREADS_IN_POOL);
        Callable<String> callable = new MyCallable();
        List<Future<String>> myList = new ArrayList<>();
        for (int i = 0; i < COUNT_OF_TASKS_FOR_POOL; i++) {
            Future<String> future = pool.submit(callable);
            myList.add(future);
        }

        for (int i = 0; i < myList.size(); i++) {
            try {
                System.out.println(Thread.currentThread().getName()
                        + " The object of MyFuture_" + (i + 1) + " return value - " + myList.get(i).get() + ".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        pool.shutdown();
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date())
                + Thread.currentThread().getName() + " finish.");
    }
}
