package tasksByBook.lesson7;
/* Он раскрыл глаза, надеясь увидать, чем кончилась борьба французов с артиллеристами, и желая знать, убит или нет рыжий артиллерист, взяты или спасены пушки.*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_26byBook {
    public static void main(String[] args) {
        System.out.println("Enter your line for searching dots: ");
        Scanner scanner = new Scanner(System.in);
        String textForDotSearching = scanner.nextLine();
        Pattern pattern = Pattern.compile("[-!?.,:;\"]");
        Matcher matcher = pattern.matcher(textForDotSearching);

        int count = 0;
        int index = 0;

        while (matcher.find()) {
            count++;
        }
        scanner.close();
        System.out.println("In your line " + count + " punktuation marks.");

    }
}
