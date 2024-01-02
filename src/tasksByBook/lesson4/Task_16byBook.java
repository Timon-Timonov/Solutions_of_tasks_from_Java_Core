package tasksByBook.lesson4;

public class Task_16byBook {
    public static final int START_NUMBER = 1;
    public static final int FINISH_NUMBER = 100;
    public static final int DIVIDER = 7;
    public static final String TEXT_MESSAGE = "Hope!";

    public static void main(String[] args) {
        for (int i = START_NUMBER; i < FINISH_NUMBER; i++) {
            if (i % DIVIDER == 0) {
                System.out.print("Number " + i + ": ");
                System.out.println(TEXT_MESSAGE);
            }
        }
    }
}
