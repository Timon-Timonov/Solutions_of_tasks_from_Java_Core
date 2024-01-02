package tasksByBook.lesson17.task_69byBook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyLogger {


    private static MyLogger logger;


    public void addLogLine(String line) {


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Runner_69.LOG_FILE_PATH_NAME, true))) {
            bw.write(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy:-:HH/mm/ss| ")) + line + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static MyLogger getLogger() {
        if (logger == null) {
            logger = new MyLogger();
        }
        return logger;
    }

    private MyLogger() {
    }
}
