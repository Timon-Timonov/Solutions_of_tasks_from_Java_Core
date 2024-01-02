package tasksByBook.lesson7;


/*Он раскрыл глаза0xaaa, надеясь 0XAAAAувидать, чем кончилась борьба0x9191 французов с артиллеристами, и желая знать, убит или нет рыжий артиллерист, взяты или спасены пушки.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_29byBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text.");
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("0[xX]{1}[0-9a-eA-E]{1,4}");
        //Pattern pattern = Pattern.compile("\\uhhhh");//??????
        Matcher matcher = pattern.matcher(text);

        int count = 0;

        while (matcher.find()) {
            String temp = matcher.group();
            System.out.println(temp);

            count++;

        }
        System.out.println(count + " words in text.");
        scanner.close();
    }
}
