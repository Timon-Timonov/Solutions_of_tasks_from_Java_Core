package tasksByBook.lesson4;

public class Task_17byBook {
    public static final int NUMBER = 548417195;


    public static void main(String[] args) {
        String str = "";
        int number = NUMBER;

        for (int i = 0; number > 0; ) {
            int x = number % 1000;
            str = " " + x + str;
            number /= 1000;
        }

        System.out.println(NUMBER + " -->  " + str);
    }
}
