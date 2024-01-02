package tasksFromLessons.lesson12$04_10_22$.taskZadanie.addersAndFinders;

import tasksFromLessons.lesson12$04_10_22$.taskZadanie.FinderFromList;

import java.util.List;
import java.util.Random;

public class RandomFinder implements FinderFromList {
    @Override
    public Integer findRandomElement(List list, Random random) {
        return (Integer) list.get(random.nextInt(list.size()));
    }


}
