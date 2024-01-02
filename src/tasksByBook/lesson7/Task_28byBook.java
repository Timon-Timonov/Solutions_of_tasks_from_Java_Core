package tasksByBook.lesson7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_28byBook {
    public static void main(String[] args) {

        System.out.println(" Enter your text.");
        Scanner scanner = new Scanner(System.in);
        String textToSearchingWords = scanner.nextLine().replaceAll("[\\s]+", " ").strip();
        Pattern pattern = Pattern.compile("[ \"-]?([\\w[а-яА-Я]]+)[!,.\\?\"-]?");
        System.out.println(textToSearchingWords);
        Matcher matcher = pattern.matcher(textToSearchingWords);
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            String temp = matcher.group(1).substring(matcher.group(1).length() - 1);
            System.out.println(temp);
            stringBuilder.append(temp);
            count++;

        }
        System.out.println(count + " words in text.");
        System.out.println(stringBuilder);
        scanner.close();
    }
}
