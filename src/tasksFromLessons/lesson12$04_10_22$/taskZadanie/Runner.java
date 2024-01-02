package tasksFromLessons.lesson12$04_10_22$.taskZadanie;

import tasksFromLessons.lesson12$04_10_22$.taskZadanie.addersAndFinders.AdderToEnd;
import tasksFromLessons.lesson12$04_10_22$.taskZadanie.addersAndFinders.AdderToMiddle;
import tasksFromLessons.lesson12$04_10_22$.taskZadanie.addersAndFinders.AdderToStart;
import tasksFromLessons.lesson12$04_10_22$.taskZadanie.addersAndFinders.RandomFinder;
import tasksFromLessons.lesson12$04_10_22$.taskZadanie.boxes.MyArrayListBox;
import tasksFromLessons.lesson12$04_10_22$.taskZadanie.boxes.MyLinkedListBox;


import java.util.Date;
import java.util.Random;


public class Runner {

    public static final int MAX_VALUE = 1_000_000;
    public static final int COUNT_OF_ELEMENTS_FOR_ADD = 100_000;
    public static final int COUNT_OF_ELEMENTS_FOR_GET = 10_000;

    public static void main(String[] args) {

        MyLinkedListBox linBox = new MyLinkedListBox(new AdderToEnd(), new RandomFinder());
        MyArrayListBox arBox = new MyArrayListBox(new AdderToEnd(), new RandomFinder());

        Random random = new Random();

        System.out.println();
        System.out.println("Process of filling lists to end: ");
        Date dateStartLink = new Date();
        for (int i = 0; i < COUNT_OF_ELEMENTS_FOR_ADD; i++) {
            linBox.adder(random.nextInt(MAX_VALUE));
        }
        Date dateFinisLink = new Date();

        Date dateStartArr = new Date();
        for (int i = 0; i < COUNT_OF_ELEMENTS_FOR_ADD; i++) {
            arBox.adder(random.nextInt(MAX_VALUE));
        }
        Date dateFinisArr = new Date();

        System.out.println("LinkedList process; " + (dateFinisLink.getTime() - dateStartLink.getTime()) + " msec.");
        System.out.println("ArrayList process; " + (dateFinisArr.getTime() - dateStartArr.getTime()) + " msec.");


        System.out.println();
        System.out.println("Process of getting from lists: ");
        dateStartLink = new Date();
        Integer in = null;
        for (int i = 0; i < COUNT_OF_ELEMENTS_FOR_GET; i++) {
            in = linBox.finder();
            //linBox.adder(random.nextInt(MAX_VALUE));
        }
        dateFinisLink = new Date();


        dateStartArr = new Date();
        for (int i = 0; i < COUNT_OF_ELEMENTS_FOR_GET; i++) {
            in = arBox.finder();
            //arBox.adder(random.nextInt(MAX_VALUE));
        }
        dateFinisArr = new Date();

        System.out.println("LinkedList process; " + (dateFinisLink.getTime() - dateStartLink.getTime()) + " msec.");
        System.out.println("ArrayList process; " + (dateFinisArr.getTime() - dateStartArr.getTime()) + " msec.");


        System.out.println();
        System.out.println("Process of filling lists to meddle: ");
        linBox.getMyLinkedList().clear();
        arBox.getMyArrayList().clear();

        linBox.setAdder(new AdderToMiddle());
        arBox.setAdder(new AdderToMiddle());


        dateStartLink = new Date();
        for (int i = 0; i < COUNT_OF_ELEMENTS_FOR_ADD; i++) {
            linBox.adder(random.nextInt(MAX_VALUE));
        }
        dateFinisLink = new Date();


        dateStartArr = new Date();
        for (int i = 0; i < COUNT_OF_ELEMENTS_FOR_ADD; i++) {
            arBox.adder(random.nextInt(MAX_VALUE));
        }
        dateFinisArr = new Date();

        System.out.println("LinkedList process; " + (dateFinisLink.getTime() - dateStartLink.getTime()) + " msec.");
        System.out.println("ArrayList process; " + (dateFinisArr.getTime() - dateStartArr.getTime()) + " msec.");


        System.out.println();
        System.out.println("Process of filling lists to start: ");
        linBox.getMyLinkedList().clear();
        arBox.getMyArrayList().clear();

        linBox.setAdder(new AdderToStart());
        arBox.setAdder(new AdderToStart());


        dateStartLink = new Date();
        for (int i = 0; i < COUNT_OF_ELEMENTS_FOR_ADD; i++) {
            linBox.adder(random.nextInt(MAX_VALUE));
        }
        dateFinisLink = new Date();


        dateStartArr = new Date();
        for (int i = 0; i < COUNT_OF_ELEMENTS_FOR_ADD; i++) {
            arBox.adder(random.nextInt(MAX_VALUE));
        }
        dateFinisArr = new Date();

        System.out.println("LinkedList process; " + (dateFinisLink.getTime() - dateStartLink.getTime()) + " msec.");
        System.out.println("ArrayList process; " + (dateFinisArr.getTime() - dateStartArr.getTime()) + " msec.");
    }
}
