package tasksByBook.lesson13.task_57byBook;

import java.util.List;
import java.util.Random;

public class Prod implements Runnable {

    private final List<Integer> productList;
    private final MyCounter totalCounter;
    private int myCounter = 0;
    private Random random;
    private final Object synch;
    private boolean isRun = true;


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start.");

        while (isRun) {
            if (productList.size() > ConstantConteiner.MIN_COUNT_OF_ELEMENTS_TO_SLEEP_PRODUCERS) {
                try {
                    Thread.sleep(ConstantConteiner.COUNT_OF_MILLIS_TO_SLEEP);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                while (productList.size() < ConstantConteiner.MAX_COUNT_OF_ELEMENTS_TO_SLEEP_PRODUCERS) {
                    if (isRun) {
                        produceElement();
                    } else break;
                    checkIsRun();
                    Thread.yield();
                }
            }
            checkIsRun();
        }
        System.out.println(Thread.currentThread().getName() + " has produced " + myCounter + " elements.");
        System.out.println(Thread.currentThread().getName() + " finish.");
    }

    private void checkIsRun() {


        /*if (totalCounter.getCount() >= ConstantConteiner.COUNT_OF_ELEMENTS_TO_STOP_PROCESS) {
            isRun = false;
        }*/


        /*if (Thread.interrupted()) {
            isRun = false;
        }*/


        if (Thread.currentThread().isInterrupted()) {
            isRun = false;
        }


    }

    private void produceElement() {
        int value = random.nextInt(ConstantConteiner.MAX_VALUE_OF_ELEMENT
                - ConstantConteiner.MIN_VALUE_OF_ELEMENT + 1)
                + ConstantConteiner.MIN_VALUE_OF_ELEMENT;
        synchronized (synch) {
            productList.add(value);
        }
        myCounter++;
        System.out.println(Thread.currentThread().getName() + " produced " + myCounter + "th element.");
    }

    public Prod(List<Integer> productList, MyCounter totalCounter, Random random, Object synch) {
        this.productList = productList;
        this.totalCounter = totalCounter;
        this.random = random;
        this.synch = synch;
    }
}
