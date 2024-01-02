package tasksByBook.lesson15.examples;

import java.util.concurrent.Callable;

public class HelloCalable implements Callable {
    @Override
    public String call() throws Exception {
        Thread.sleep(100);
        return Thread.currentThread().getName()+" Hello World!";
    }
}
