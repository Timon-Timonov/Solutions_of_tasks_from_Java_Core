package tasksByBook.lesson13.task_57byBook;

import java.util.List;

public class Cons implements Runnable {


    private List<Integer> productList;
    private final MyCounter totalCounter;
    private int myCounter = 0;
    private boolean isRun = true;
    Object synch;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start.");
        while (isRun) {
            if (productList.size() > ConstantConteiner.COUNT_OF_ELEMENTS_TO_SLEEP_CONSUMERS) {
                int value = 0;
                int count = 0;
                synchronized (synch) {
                    if (!productList.isEmpty()) {
                        value = productList.remove(0);
                        totalCounter.addToValueCount(1);
                        count = totalCounter.getCount();
                    }
                }
                if (value != 0) {
                    myCounter++;
                    System.out.println(Thread.currentThread().getName() + " consume " + myCounter + "th element. TotCount=" + count);
                    Thread.yield();
                }
            } else {
                try {
                    Thread.sleep(ConstantConteiner.COUNT_OF_MILLIS_TO_SLEEP);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            checkIsRun();
        }


        System.out.println(Thread.currentThread().getName() + " has consumed " + myCounter + " elements.");
        System.out.println(Thread.currentThread().getName() + " finish.");
    }

    private void checkIsRun() {


      /*  if (totalCounter.getCount() >= ConstantConteiner.COUNT_OF_ELEMENTS_TO_STOP_PROCESS) {
            isRun = false;
        }*/


        /*if (Thread.interrupted()) {
            isRun = false;
        }*/


        if (Thread.currentThread().isInterrupted()) {
            isRun = false;
        }


    }

    public Cons(List<Integer> productList, MyCounter totalCounter, Object synch) {
        this.productList = productList;
        this.totalCounter = totalCounter;
        this.synch = synch;
    }
}
