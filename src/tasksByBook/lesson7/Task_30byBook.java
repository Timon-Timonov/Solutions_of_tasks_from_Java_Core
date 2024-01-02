package tasksByBook.lesson7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_30byBook {
    public static void main(String[] args) {
        System.out.println("Enter your text.");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Pattern pattern=Pattern.compile("<p[^>]+>");
        Matcher matcher=pattern.matcher(text);
        //text = text.replaceAll("<p[.[^>]]*>", "<p>");

        System.out.println(text);

    }
}
