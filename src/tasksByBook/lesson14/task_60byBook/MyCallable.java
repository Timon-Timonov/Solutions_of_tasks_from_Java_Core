package tasksByBook.lesson14.task_60byBook;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date())
                + Thread.currentThread().getName() + " start.");


        String text = Runner_60.TEXT + new SimpleDateFormat("HH:mm:ss").format(new Date());
        Runner_60.writeTextInFile(text);


        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date())
                + Thread.currentThread().getName() + " finish.");
        return null;
    }
}
