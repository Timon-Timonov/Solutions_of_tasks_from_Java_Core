package tasksByBook.lesson11.task_47byBook;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task_47byBook {


    public static void main(String[] args) throws IOException {
        File file = new File(ConstantConteiner.PATH_NAME);
        createAndWritFile(file);
        String textFromFile = readFromFile(file);
        checkWordsAndDots(textFromFile);

    }

    private static void checkWordsAndDots(String text) {
        Pattern pattern = Pattern.compile("\\s?\\b([\\wА-Яа-яЁё]+)\\b\\s?");
        Matcher matcher = pattern.matcher(text);

        int countOfWords = 0;
        int countOfDots = 0;

        while (matcher.find()) {
            matcher.group(1);
            countOfWords++;
        }

        pattern = Pattern.compile("[^А-Яа-яЁё\\w\\s]");
        matcher = pattern.matcher(text);

        while (matcher.find()) {
            matcher.group();
            countOfDots++;
        }

        System.out.println("words - " + countOfWords);
        System.out.println("punctuation mark - " + countOfDots);
    }

    private static String readFromFile(File file) {
        StringBuilder text = new StringBuilder();
        try (FileReader fr = new FileReader(ConstantConteiner.PATH_NAME); BufferedReader br = new BufferedReader(fr)) {
            String line = br.readLine();

            while (line != null) {
                text.append(line + "\n");
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Something wrong with PATH_NAME!");
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            System.out.println("Try once more to read the file.");
            e.printStackTrace();
            return null;
        }
        return text.toString();
    }

    private static void createAndWritFile(File file) {
        try {
            boolean isNewFile = file.createNewFile();
            if (isNewFile) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exist!");
                System.out.println("All information in the file will be overwritten.");
            }
        } catch (IOException e) {
            System.out.println("Something wrong with PATH_NAME.");
            System.out.println("FIle do not created.");
            e.printStackTrace();
        }
        try (PrintWriter pw = new PrintWriter(ConstantConteiner.PATH_NAME)) {
            pw.print(ConstantConteiner.TEXT_TO_FILE);
            System.out.println("The text has been recorded in the file!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
            return;
        }
    }
}
