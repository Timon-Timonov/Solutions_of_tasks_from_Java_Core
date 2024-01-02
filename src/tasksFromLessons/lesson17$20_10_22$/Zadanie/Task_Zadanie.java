package tasksFromLessons.lesson17$20_10_22$.Zadanie;

import java.io.*;
import java.util.TreeMap;

public class Task_Zadanie {
    public static void main(String[] args) {
        writeTextInFile(ConstantConteiner.PATH_NAME, ConstantConteiner.TEXT_TO_FILE);

        String textFromFile = readTextFromFile(ConstantConteiner.PATH_NAME);
        // System.out.println(textFromFile);

        String[] words = cutTextToWords(textFromFile);
        // Arrays.stream(words).forEach(System.out::println);
        System.out.println("Text contain " + words.length + " words.");

        TreeMap<String, Integer> wordsTreeMap = arrayToTreeMap(words);
        System.out.print("The longest word that appears in the text - ");
        printEntryOfTreeMapWithWordsWithNotOneValue(wordsTreeMap, 1);
    }

    private static void writeTextInFile(String path, String text) {
        try (PrintWriter pw = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(path)))) {
            pw.println(ConstantConteiner.TEXT_TO_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readTextFromFile(String path) {
        StringBuilder text = new StringBuilder();
        try (
                BufferedReader br = new BufferedReader(
                        new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                text.append(line + "\n");
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text.toString();
    }

    private static String[] cutTextToWords(String textFromFile) {
        return textFromFile.toLowerCase()
                .replaceAll("[^a-zа-яё]+", " ")
                .trim()
                .split("[ ]+");
    }

    private static TreeMap<String, Integer> arrayToTreeMap(String[] array) {
        TreeMap<String, Integer> map = new TreeMap<>(new KeyLengComparator());
        for (String s : array) {
            if (map.containsKey(s)) {
                Integer i = map.get(s);
                i++;
                map.put(s, i);
            } else {
                map.put(s, 1);
            }
        }
        return map;
    }

    private static void printEntryOfTreeMapWithWordsWithNotOneValue(
            TreeMap<String, Integer> wordsTreeMap, int howMuchValuesToPrint) {
        int count = 1;
        for (String key : wordsTreeMap.keySet()) {
            if (wordsTreeMap.get(key) > 1) {
                System.out.println("\"" + key + "\"  appears " + wordsTreeMap.get(key) + " times.");
                count++;
                if (count <= howMuchValuesToPrint) {
                    continue;
                } else {
                    break;
                }
            } else {
                continue;
            }
        }
    }
}

