package tasksByBook.lesson13.task_55byBook;

public class MyThread implements Runnable {
    @Override
    public void run() {
        doSomething();

    }

    private void doSomething() {
        synchronized (MyThread.class) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(Runner_55.TIME_TO_SLEEP);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
