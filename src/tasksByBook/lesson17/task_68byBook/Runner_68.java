package tasksByBook.lesson17.task_68byBook;

public class Runner_68 {
    public static void main(String[] args) {

        Director director = new Director();
        Thread thread = new Thread(director);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        director.printList();
    }
}
