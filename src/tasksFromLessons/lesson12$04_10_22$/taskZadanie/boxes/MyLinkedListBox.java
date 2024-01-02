package tasksFromLessons.lesson12$04_10_22$.taskZadanie.boxes;

import tasksFromLessons.lesson12$04_10_22$.taskZadanie.AdderToList;
import tasksFromLessons.lesson12$04_10_22$.taskZadanie.FinderFromList;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyLinkedListBox {
    private AdderToList adder;
    private FinderFromList finder;
    private Random random = new Random();
    private List<Integer> myLinkedList = new LinkedList<Integer>();

    public MyLinkedListBox(AdderToList adder, FinderFromList finder) {
        this.adder = adder;
        this.finder = finder;
    }

    public List<Integer> getMyLinkedList() {
        return myLinkedList;
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

    public Random getRandom() {
        return random;
    }

    public void adder(Integer element) {
        adder.adElement(getMyLinkedList(), element);
    }

    public Integer finder() {
        return finder.findRandomElement(getMyLinkedList(), getRandom());
    }
}
