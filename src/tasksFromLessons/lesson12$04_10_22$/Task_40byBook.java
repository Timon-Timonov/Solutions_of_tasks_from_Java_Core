package tasksFromLessons.lesson12$04_10_22$;

import java.util.*;

public class Task_40byBook {

    public static final int COUNT_OF_NUMBERS = 100;
    public static final int MAX_VALUE_OF_NUMBERS = 10;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < COUNT_OF_NUMBERS; i++) {
            Integer integer = random.nextInt(1 + MAX_VALUE_OF_NUMBERS);
            list.add(integer);
        }

        System.out.println("Created list with numbers: ");
        printCollection(list);


        Set<Integer> set = new HashSet<>(list);
        System.out.println("Created set with unique numbers: ");
        printCollection(set);

        list.clear();
        list.addAll(set);
        System.out.println("List with unique numbers: ");
        printCollection(list);


    }

    public static void printCollection(Collection list) {
        for (Object i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
