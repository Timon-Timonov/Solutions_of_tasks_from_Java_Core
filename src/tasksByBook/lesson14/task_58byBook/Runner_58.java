package tasksByBook.lesson14.task_58byBook;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class Runner_58 {

    public static final int COUNT_OF_THREADS_IN_POOL = 3;
    public static final int COUNT_TASKS_FOR_POOL = 10;
    public static final int COUNT_OF_FILES = 10;
    public static final int COUNT_OF_LINES_IN_EACH_FILE = 10;
    public static final long MIN_TIME_TO_SLEEP_THREAD = 1_000;
    public static final long MAX_TIME_TO_SLEEP_THREAD = 3_000;
    public static final String PATH_NAME_OF_DIR = "src\\tasksByBook\\lesson14\\task_58byBook\\myFiles";
    public static final String FILE_NAME_HEAD = "\\myFile_";
    public static final String FILE_NAME_TAIL = ".txt";
    public static final String[] LINES = {"AAAAA",
            "BBBBB",
            "CCCCC",
            "DDDDD",
            "EEEEE",
            "FFFFF",
            "GGGGG",
            "HHHHH",
            "IIIII",
            "JJJJJ",
            "KKKKK",
    };


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName() + " start.");

        Object obj = new Object();
        ExecutorService pool = Executors.newFixedThreadPool(COUNT_OF_THREADS_IN_POOL);
        Callable<List<String>> callable = new MyCallable(obj);
        List<Future<List<String>>> myList = new ArrayList<>();

        for (int i = 0; i < COUNT_TASKS_FOR_POOL; i++) {

            Future<List<String>> future = pool.submit(callable);
            System.out.println((i + 1) + "th future has submited.");

            myList.add(future);
        }

        for (Future<List<String>> future : myList) {
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()) + future.get().toString());
        }

        pool.shutdown();
        System.out.println(Thread.currentThread().getName() + " finish.");
    }
}
