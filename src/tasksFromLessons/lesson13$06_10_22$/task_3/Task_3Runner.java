package tasksFromLessons.lesson13$06_10_22$.task_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Task_3Runner {
    public static void main(String[] args) {
        Map<String, Product> shop = new HashMap<String, Product>();
        Random random = new Random();
        String[] pool = {"Tom", "CAT", "maouse", "Jerry", "DOG", "Frog", "Bill", "Gena", "Chebyrashka", "Anton"};

        for (int i = 0; i < 10; i++) {
            shop.put(pool[i], new Product(random.nextInt(50), random.nextInt(35)));
        }
        System.out.println();
        iterateEntryset(shop);
        System.out.println();
        iterateKeys(shop);
        System.out.println();
        iterateValues(shop);
    }

    public static void iterateEntryset(Map<String, Product> map) {
        for (Map.Entry<String, Product> set : map.entrySet()) {
            System.out.println(set.toString());
        }
    }

    public static void iterateKeys(Map<String, Product> map) {

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void iterateValues(Map<String, Product> map) {
        map.values().stream()
                .forEach((s) -> System.out.println(s));
    }
}
