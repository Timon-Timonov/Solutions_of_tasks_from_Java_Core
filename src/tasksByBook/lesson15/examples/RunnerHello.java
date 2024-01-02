package tasksByBook.lesson15.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class RunnerHello {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        List<FutureTask> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(new FutureTask<>(new HelloCalable()));
        }

        for (FutureTask<String> futureTask : list) {
            pool.execute(new Thread((futureTask)));
        }

        pool.shutdown();

        for (FutureTask<String> futureTask : list) {
            System.out.println(futureTask.get());
        }

    }
}
