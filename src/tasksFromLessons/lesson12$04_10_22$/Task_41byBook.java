package tasksFromLessons.lesson12$04_10_22$;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task_41byBook {

    public static final int MAX_GRADE_VALUE = 10;
    public static final int MIN_GRADE_VALUE = 3;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            list.add(random.nextInt(MAX_GRADE_VALUE + 1 - MIN_GRADE_VALUE) + MIN_GRADE_VALUE);
        }


        System.out.println("Created list with grades:");
        Task_40byBook.printCollection(list);

        Iterator<Integer> iterator = list.iterator();
        Integer max = 0;
        Integer i = null;
        while (iterator.hasNext()) {
            i = iterator.next();
            if (max < i) {
                max = i;
            }
        }
        System.out.println("The max grade is " + max);
    }
}
