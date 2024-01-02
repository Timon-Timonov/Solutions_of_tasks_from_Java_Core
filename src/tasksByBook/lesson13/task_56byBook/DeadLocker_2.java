package tasksByBook.lesson13.task_56byBook;

public class DeadLocker_2 extends Thread {
    @Override
    public void run() {
        synchronized (Integer.class) {
            System.out.println(Thread.currentThread().getName() + " start." +
                    " And took over Integer.class");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (String.class) {
                System.out.println(Thread.currentThread().getName() +
                        " Took over String.class");
            }
        }
        System.out.println(Thread.currentThread().getName() + " finish.");
    }
}
