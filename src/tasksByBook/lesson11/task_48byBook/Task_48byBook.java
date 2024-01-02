package tasksByBook.lesson11.task_48byBook;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_48byBook {
    public static void main(String[] args) {
        File file = new File(ConstantConteiner.PATH_NAME);
        createFileByPathName(file);
        writeTextInFile();
        String textFromFile = reradTextFromFile();
        List<Double> myNumbers = findAndPrintNumbers(textFromFile);
        double sum = sumOfNumbersFromList(myNumbers);
        System.out.println();
        System.out.println("Sum of all numbers from text: " + sum);
        System.out.println();

        Set<Double> set = new HashSet<Double>(myNumbers);
        System.out.println("All numbers after distinct: ");
        set.forEach(System.out::println);
    }


    private static void createFileByPathName(File file) {
        try {
            file.createNewFile();
            System.out.println("File created successfully");
        } catch (IOException e) {
            System.out.println("File do not created. Try again.");
            e.printStackTrace();
        }
    }

    private static void writeTextInFile() {
        try (FileWriter fw = new FileWriter(ConstantConteiner.PATH_NAME);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(ConstantConteiner.TEXT_TO_FILE);
            System.out.println("Text writed successfully.");
        } catch (IOException e) {
            System.out.println("Text dont write in file.");
            e.printStackTrace();
        }
    }

    private static String reradTextFromFile() {
        StringBuilder text = new StringBuilder();
        try (FileReader fr = new FileReader(ConstantConteiner.PATH_NAME);
             BufferedReader br = new BufferedReader(fr)) {
            String line = br.readLine();
            while (line != null) {
                text.append(line);
                line = br.readLine();
            }
            System.out.println("The text have been read from file.");
        } catch (FileNotFoundException e) {
            System.out.println("There is no file with such name!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("It is not so good...");
            e.printStackTrace();
        }
        return text.toString();
    }

    private static List<Double> findAndPrintNumbers(String text) {
        Pattern pattern = Pattern.compile("\\d+[,\\.]?\\d*");
        Matcher matcher = pattern.matcher(text);
        List<Double> num = new ArrayList<Double>();
        System.out.println();
        System.out.println("Numbers, which find in text: ");
        while (matcher.find()) {
            String temp = matcher.group();
            System.out.print(temp + "; ");
            num.add(Double.valueOf(temp.replaceAll(",", ".")));
        }
        System.out.println();
        return num;
    }

    private static double sumOfNumbersFromList(List<Double> list) {
        double sum = 0;

        for (Double d : list) {
            sum += d;
        }
        sum = Math.round(sum * 100_000) / 100_000d;

        return sum;
    }
}
