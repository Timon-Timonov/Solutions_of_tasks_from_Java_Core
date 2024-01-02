package tasksByBook.lesson14.task_58byBook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;


public class MyCallable implements Callable<List<String>> {

    private Object obj;


    public MyCallable(Object obj) {
        this.obj = obj;
    }

    @Override
    public List<String> call() {
        System.out.println(Thread.currentThread().getName() + " start.");

        Random random = new Random();

        File file = new File(Runner_58.PATH_NAME_OF_DIR);
        file.mkdirs();

        for (int i = 0; i < Runner_58.COUNT_OF_FILES; i++) {

            String fileName = Runner_58.FILE_NAME_HEAD +
                    (i + 1) +
                    Runner_58.FILE_NAME_TAIL;

            String pathName = Runner_58.PATH_NAME_OF_DIR + fileName;

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathName, true))) {

                synchronized (obj) {
                    for (int j = 0; j < Runner_58.COUNT_OF_LINES_IN_EACH_FILE; j++) {
                        int randIndex = random.nextInt(Runner_58.LINES.length);
                        String line = (j + 1) + ") " +
                                Runner_58.LINES[randIndex] +
                                " (" + Thread.currentThread().getName() + ")\n";

                        try {
                            bw.write(line);
                            System.out.println((new SimpleDateFormat("HH:mm:ss").format(new Date()) +
                                    Thread.currentThread().getName() + " write line: " + line.stripTrailing()
                                    + " to file " + fileName.substring(1)));
                        } catch (IOException e) {
                            System.out.println("The line have not written in file!(" + Thread.currentThread().getName() + ")");
                            e.printStackTrace();
                        }
                    }
                }

            } catch (IOException e) {
                System.out.println("Problems with creation of FileWriter!(" + Thread.currentThread().getName() + ")");
                e.printStackTrace();
            }
        }

        List<String> list = new ArrayList<>();
        if (file.exists() && file.isDirectory()) {
            for (String name : file.list()) {
                list.add(name);
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " The file is not exist, or it is not a directory.");
            return null;
        }


        long time = (random.nextInt((int) (Runner_58.MAX_TIME_TO_SLEEP_THREAD
                - Runner_58.MIN_TIME_TO_SLEEP_THREAD + 1))
                + Runner_58.MIN_TIME_TO_SLEEP_THREAD);

        try {
            Thread.sleep(time);
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " finish.");
        return list;
    }
}
