package tasksFromLessons.lesson12$04_10_22$.taskZadanie;

import java.util.List;

public interface AdderToList<T extends Integer> {
    void adElement(List list, T element);
}
