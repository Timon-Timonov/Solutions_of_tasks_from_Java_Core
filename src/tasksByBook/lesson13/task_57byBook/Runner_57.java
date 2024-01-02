package tasksByBook.lesson13.task_57byBook;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Runner_57 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " start.");

        List<Integer> productList = new LinkedList<>();
        MyCounter totalCounter = new MyCounter();
        List<Thread> threads = new ArrayList<>();
        Random random = new Random();
        Object synch = new Object();

        startFullingOfList(productList, random);


        createProducers(productList, totalCounter, threads, random, synch);

        createOfConsumers(productList, totalCounter, threads, synch);

        threads.forEach(Thread::start);


//start
        while (true) {
            if (totalCounter.getCount() >= ConstantConteiner.COUNT_OF_ELEMENTS_TO_STOP_PROCESS) {
                for (Thread thread : threads) {
                    thread.interrupt();
                }
                break;
            }
            try {
                Thread.sleep(ConstantConteiner.COUNT_OF_MILLIS_TO_SLEEP);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//finish


        for (Thread thr : threads) {
            try {

                thr.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }//join All

        System.out.println("There is " + totalCounter.getCount() + " products consumed.");

        System.out.println("The rest products in list: " + productList.size());

        System.out.println(Thread.currentThread().getName() + " finish.");
    }

    private static void createOfConsumers(List<Integer> productList,
                                          MyCounter totalCounter, List<Thread> threads, Object synch) {
        for (int i = 0; i < ConstantConteiner.COUNT_OF_CONSUMERS; i++) {
            Thread thread = new Thread(new Cons(productList, totalCounter, synch));
            thread.setName(ConstantConteiner.CONSUMERS_NAME + (i + 1));
            threads.add(thread);
        }
    }

    private static void createProducers(List<Integer> productList, MyCounter totalCounter, List<Thread> threads,
                                        Random random, Object synch) {
        for (int i = 0; i < ConstantConteiner.COUNT_OF_PRODUCERS; i++) {
            Thread thread = new Thread(new Prod(productList, totalCounter, random, synch));
            thread.setName((i + 1) + ConstantConteiner.PRODUSERS_NAME);
            threads.add(thread);
        }
    }

    private static void startFullingOfList(List<Integer> productList, Random random) {
        for (int i = 0; i < ConstantConteiner.START_COUNT_OF_ELEMENTS; i++) {
            int value = random.nextInt(ConstantConteiner.MAX_VALUE_OF_ELEMENT
                    - ConstantConteiner.MIN_VALUE_OF_ELEMENT + 1)
                    + ConstantConteiner.MIN_VALUE_OF_ELEMENT;

            productList.add(value);
        }
    }
}
