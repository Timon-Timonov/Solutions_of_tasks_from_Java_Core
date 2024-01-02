package tasksByBook.lesson17.task_69byBook;

import java.io.File;
import java.nio.file.Path;

public class Runner_69 {
    public static final String LOG_FILE_PATH_NAME = "src\\tasksByBook\\lesson17\\task_69byBook\\log.txt";

    public static final int SLEEP_TIME = 600;

    public static void main(String[] args) throws InterruptedException {

        MyLogger logger = MyLogger.getLogger();


        logger.addLogLine("BEDA!!!");
        Thread.sleep(SLEEP_TIME);
        logger.addLogLine("EXCEPTION!!!");
        Thread.sleep(SLEEP_TIME);
        logger.addLogLine("KOTOSTROFA!!!");
        Thread.sleep(SLEEP_TIME);
        logger.addLogLine("TRABL!!!");
        Thread.sleep(SLEEP_TIME);
        logger.addLogLine("GOLOVNAYK!!!");

    }
}
