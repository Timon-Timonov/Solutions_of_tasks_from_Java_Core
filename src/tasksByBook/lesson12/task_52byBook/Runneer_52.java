package tasksByBook.lesson12.task_52byBook;

public class Runneer_52 {
    //With extend Thread:
    /*public static void main(String[] args) {
        for (int i = 0; i < ConstantConteiner.COUNT_OF_THREADS; i++) {
            Thread thread = new MyThread();
            thread.start();
        }
    }*/


    //With implements Runnable:
    public static void main(String[] args) {
        for (int i = 0; i < ConstantConteiner.COUNT_OF_THREADS; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }
}
