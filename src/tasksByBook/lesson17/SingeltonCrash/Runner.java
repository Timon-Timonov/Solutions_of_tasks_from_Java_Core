package tasksByBook.lesson17.SingeltonCrash;

import java.time.Instant;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        List<MySingelton> singl = new ArrayList<>();
        List<Thread> thrt = new ArrayList<>();

        for (int i = 0; i < 150; i++) {
            Thread thread = new Thread(new Mythread(singl));
            thrt.add(thread);
        }
        System.out.println(thrt.size() + " потоки созданы");

        Instant i1 = Instant.now();


        for (Thread t : thrt) {
            t.start();
        }

        Thread.sleep(1);
        for (Thread t : thrt) {
            t.join();
        }

        Instant i2 = Instant.now();


        Thread.sleep(1);
        double time = ((i2.getEpochSecond()*1000000000 + i2.getNano()) - (i1.getEpochSecond()*1000000000 + i1.getNano()))/1000000d;
        System.out.println(singl.size() + "количество ссылок на сингелтон \n " + "продолжительность " + time);


        MySingelton my = singl.get(0);
        boolean a = singl.stream().allMatch((sin) -> (sin.equals(my)));
        System.out.println(a ? "norma." : " SLOMALSYA!!!");
    }
}
