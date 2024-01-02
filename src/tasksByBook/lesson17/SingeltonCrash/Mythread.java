package tasksByBook.lesson17.SingeltonCrash;

import java.util.List;

public class Mythread implements Runnable {

    List<MySingelton> list;

    public Mythread(List<MySingelton> list) {
        this.list = list;
    }

    @Override
    public void run() {
        MySingelton my = MySingelton.getInstance();
        synchronized (list) {
            list.add(my);
        }
        System.out.println(Thread.currentThread().getName() + "  finish  " + list.size());
    }
}
