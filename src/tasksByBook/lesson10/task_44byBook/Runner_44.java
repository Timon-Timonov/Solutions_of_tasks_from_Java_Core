package tasksByBook.lesson10.task_44byBook;

public class Runner_44 {
    public static void main(String[] args) throws InterruptedException {
        try {
            catchException();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println("The MyException is catched!");
        }



        System.out.println("The code is workking...");
    }

    public static void catchException() throws MyException {
        throw new MyException();
    }
}
