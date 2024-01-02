package tasksFromLessons.lesson12$04_10_22$.taskZadanie.boxes;

import tasksFromLessons.lesson12$04_10_22$.taskZadanie.AdderToList;
import tasksFromLessons.lesson12$04_10_22$.taskZadanie.FinderFromList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyArrayListBox {
    private AdderToList adder;
    private FinderFromList finder;
    private Random random = new Random();
    private List<Integer> myArrayList = new ArrayList<>();

    public Random getRandom() {
        return random;
    }

    public List<Integer> getMyArrayList() {
        return myArrayList;
    }

    public AdderToList getAdder() {
        return adder;
    }

    public void setAdder(AdderToList adder) {
        this.adder = adder;
    }

    public FinderFromList getFinder() {
        return finder;
    }

    public void setFinder(FinderFromList finder) {
        this.finder = finder;
    }

    public MyArrayListBox(AdderToList adder, FinderFromList finder) {
        this.adder = adder;
        this.finder = finder;
    }
    public void adder(Integer element) {
        adder.adElement(getMyArrayList(), element);
    }

    public Integer finder() {
        return finder.findRandomElement(getMyArrayList(), getRandom());
    }

}
