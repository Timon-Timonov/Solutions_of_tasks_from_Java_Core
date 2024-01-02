package tasksByBook.lesson13.task_56byBook;

public class Runner_56 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " start.");
        Thread thread1 = new Deadlocker_1();
        thread1.setName("Deadlocker_1");
        Thread thread2 = new DeadLocker_2();
        thread2.setName("Deadlocker_2");



        thread1.start();
        thread2.start();
        System.out.println(Thread.currentThread().getName() + " finish.");
    }
}
