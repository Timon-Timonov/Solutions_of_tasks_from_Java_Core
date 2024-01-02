package tasksByBook.lesson4;

public class Task_14byBook {

    public static void main(String[] args) {

        long x = 7893823445l;
        int sum = 0;
        long a = x;

        do {
            sum += a % 10;
            a /= 10;
        } while (a > 0);

        System.out.println("The sum of members " + x + " : " + sum + ".");
    }
}
