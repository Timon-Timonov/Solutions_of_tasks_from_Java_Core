package tasksByBook.lesson9;

import java.util.*;

public class Task_42byBook {

    public static void main(String[] args) {

        System.out.println("Enter your text!");
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        Set<String> words = new HashSet<>();

        String text = scanner.nextLine();
        String[] array = text.toLowerCase().split("[\\s[^a-zа-яё]]+");

        int wordsLenght = 0;

        for (String s : array) {
            wordsLenght = words.size();
            words.add(s);
            if (wordsLenght < words.size()) {
                map.put(s, 1);
            } else {
                Integer i = map.get(s);
                i++;
                map.put(s, i);
            }
        }

        for (Map.Entry en : map.entrySet()) {
            System.out.println(en.toString());

        }
    }
}
