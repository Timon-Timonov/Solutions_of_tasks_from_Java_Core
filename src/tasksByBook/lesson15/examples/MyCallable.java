package tasksByBook.lesson15.examples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.concurrent.*;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        // возвращает имя потока, который выполняет callable таск
        return Thread.currentThread().getName();
    }

    public static void main(String args[]) {

        ExecutorService pool = Executors.newFixedThreadPool(10);

        List<FutureTask<String>> futureTasks = new ArrayList<>();

        Callable<String> callable = new MyCallable();

        for (int i = 0; i < 100; i++) {

            FutureTask<String> futureTask = new FutureTask<>(callable);
            futureTasks.add(futureTask);
            pool.execute(new Thread(futureTask));
        }

        for (FutureTask<String> future : futureTasks) {
            try {

                    System.out.println(new Date() + "::" + future.get());

            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        pool.shutdown();
    }

}