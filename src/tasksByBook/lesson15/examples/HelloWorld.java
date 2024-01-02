package tasksByBook.lesson15.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class HelloWorld {

    public static void main(String[] args) throws Exception {

        Callable callable = (new HelloCalable());

        ExecutorService pool = Executors.newFixedThreadPool(100);

        List<FutureTask> callables = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            callables.add(new FutureTask(callable));
        }
        for (FutureTask<String> fut : callables) {
            pool.execute(fut);
            System.out.println(fut.get());
        }

        pool.shutdown();
    }
}

