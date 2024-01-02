package tasksFromLessons.lesson12$04_10_22$.taskZadanie.addersAndFinders;

import tasksFromLessons.lesson12$04_10_22$.taskZadanie.AdderToList;

import java.util.List;

public class AdderToMiddle implements AdderToList {


    public AdderToMiddle() {
    }

    @Override
    public void adElement(List list, Integer element) {
        list.add(list.size() / 2, element);
    }
}
