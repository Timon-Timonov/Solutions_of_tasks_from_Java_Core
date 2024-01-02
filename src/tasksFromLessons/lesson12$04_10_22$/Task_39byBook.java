package tasksFromLessons.lesson12$04_10_22$;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task_39byBook {

    public static final int COUNT_OF_PERSONS_IN_CLASS = 30;
    public static final int MAX_GRADE = 5;
    public static final int MIN_GRADE = 2;
    public static final int MIN_POSITIV_GRADE = 3;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < COUNT_OF_PERSONS_IN_CLASS; i++) {
            list.add((Integer) random.nextInt(MAX_GRADE - MIN_GRADE + 1) + MIN_GRADE);
        }

        System.out.println("LIST:");
        printList(list);
        System.out.println();


        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i < MIN_POSITIV_GRADE) {
                iterator.remove();
            }
        }

        System.out.println("LIST with all positive:");
        printList(list);
        System.out.println();

    }

    private static void printList(List<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
