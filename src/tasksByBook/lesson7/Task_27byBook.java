package tasksByBook.lesson7;
/*   Он   раскрыл   глаза,   надеясь увидать,   чем кончилась   борьба    французов с   артиллеристами, и   желая   знать, убит или  нет   рыжий артиллерист,   взяты или спасены  пушки.   */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_27byBook {
    public static void main(String[] args) {

        System.out.println(" Enter your text for searching words.");
        Scanner scanner = new Scanner(System.in);
        String textToSearchingWords = scanner.nextLine().replaceAll("[\\s]+", " ").strip();
        Pattern pattern = Pattern.compile("[ \"-]?([\\w[а-яА-Я]]+)[!,.\\?\"-]?");
        System.out.println(textToSearchingWords);
        Matcher matcher = pattern.matcher(textToSearchingWords);
        int count = 0;
        while (matcher.find()) {
            count++;

        }
        System.out.println(count + " words in text.");
        scanner.close();
    }
}
