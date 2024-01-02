package tasksByBook.lesson3;

public class Task_7byBook {

    public static int a = 8;
    public static int b = 8;
    public static int r = 5;

    public static boolean cover = (4 * r * r) >= (a * a + b * b);
    public static boolean fail = (2 * r) <= (Math.min(a, b));

    public static void main(String[] args) {


        printSolution();
    }

    public static void printSolution() {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("r=" + r);

        if (cover) {
            System.out.println("It is possible to cover the hole by this paper.");
        } else if (fail) {
            System.out.println("This paper pull down throuw the hole.");
        } else {
            System.out.println("It is imposible to cover the hole by this paper.");
        }
    }
}
