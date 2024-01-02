package tasksFromLessons.lesson12$04_10_22$.taskZadanie;

import java.util.List;
import java.util.Random;

public interface FinderFromList<T extends Integer> {
    public T findRandomElement(List<Integer> list, Random random);
}
