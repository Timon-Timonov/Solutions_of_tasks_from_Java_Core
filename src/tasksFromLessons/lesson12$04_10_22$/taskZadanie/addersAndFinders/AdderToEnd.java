package tasksFromLessons.lesson12$04_10_22$.taskZadanie.addersAndFinders;

import tasksFromLessons.lesson12$04_10_22$.taskZadanie.AdderToList;

import java.util.List;

public class AdderToEnd implements AdderToList {
    @Override
    public void adElement(List list, Integer element) {
        list.add(element);
    }
}
