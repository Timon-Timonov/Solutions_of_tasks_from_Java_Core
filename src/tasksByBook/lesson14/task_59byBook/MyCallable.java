package tasksByBook.lesson14.task_59byBook;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()) + Thread.currentThread().getName() + " start.");

        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < Runner_59.COUNT_OF_NUMBERS; i++) {
            list.add(random.nextInt(Runner_59.MAX_VALUE_OF_NUMBERS));
        }

        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date())
                + Thread.currentThread().getName() + " list with values created successfully.");

        Integer sum = 0;
        for (Integer i : list) {
            sum += i;
        }

        long timeToSleep = (long) random.nextInt((int)
                (Runner_59.MAX_TIME_TO_SLEEP_THREAD - Runner_59.MIN_TIME_TO_SLEEP_THREAD)
                + 1) + Runner_59.MIN_TIME_TO_SLEEP_THREAD;

        Thread.sleep(timeToSleep);

        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date())
                + Thread.currentThread().getName() + " finish with result " + sum + ".");
        return sum.toString();
    }
}
