package tasksByBook.lesson14.task_60byBook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Runner_60 {
    public static final int COUNT_OF_THREADS_IN_POOL = 3;
    public static final int COUNT_OF_TASKS_FOR_POOL = 10;
    public static final String TEXT = "Hello World";
    public static final String PATH = "d:\\Java_worckspace\\All_prolects\\My Java projects\\" +
            "My solutions of Jd1 tasks\\src\\tasksByBook\\lesson14\\task_60byBook\\";
    public static final String FILE_NAME = "myFileWithText.txt";


    public static void main(String[] args) {
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date())
                + Thread.currentThread().getName() + " start.");
        ExecutorService pool = Executors.newFixedThreadPool(COUNT_OF_THREADS_IN_POOL);
        Callable<Object> callable = new MyCallable();
        for (int i = 0; i < COUNT_OF_TASKS_FOR_POOL; i++) {
            Future<Object> future = pool.submit(callable);
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date())
                    + Thread.currentThread().getName() + " future_"+(i+1)+" submited.");
        }
        pool.shutdown();
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date())
                + Thread.currentThread().getName() + " finish.");
    }



    public synchronized static void writeTextInFile(String tetx){
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(PATH+FILE_NAME,true))){
            bw.write(tetx+"\n");
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date())
                    +Thread.currentThread().getName()+" write text in file.");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
