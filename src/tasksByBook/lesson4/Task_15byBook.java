package tasksByBook.lesson4;

public class Task_15byBook {

    public static final int START_NUMBER = 50;
    public static final int FINISH_NUMBER = 70;
    public static final int COUNT = 2;

    public static void main(String[] args) {
        int count = 0;
        int number = 0;

        for (int i = START_NUMBER; i <= FINISH_NUMBER; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else if (j == (i - 1)) {
                    count++;
                }
            }
            if (count == COUNT) {
                number = i;
                break;
            }
        }
        System.out.println(COUNT + "th prime number is " + number);
    }
}
