package tasksByBook.lesson12.task_54byBook;

public class Runner_54 {
    public static void main(String[] args) {
        for (int i = 0; i < ConstantConteiner.COUNT_OF_THREADS; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }
}

