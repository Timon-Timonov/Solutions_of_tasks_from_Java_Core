package tasksByBook.lesson3;

public class Task_10byBook {

    public static void main(String[] args) {
        int a = 2;// size of first building
        int b = 15;

        int c = 9;//size of second building
        int d = 9;

        int e = 15;//size of ground place
        int f = 10;


        if ((a <= e) && (b <= f)) {//case when a||e and b||f
            if ((((e - a) >= c) && (f >= d)) || (((e - a) >= d) && (f >= c))) {
                printOk();
                return;
            }

            if ((((f - b) >= c) && (e >= d)) || (((f - b) >= d) && (e >= c))) {
                printOk();
                return;
            }
        } else if ((b <= e) && (a <= f)) {//case when b||e and a||f

            if ((((e - b) >= c) && (f >= d)) || (((e - b) >= d) && (f >= c))) {
                printOk();
                return;
            }

            if ((((f - a) >= c) && (e >= d)) || (((f - a) >= d) && (e >= c))) {
                printOk();
                return;
            }
        }
        printFail();

    }

    private static void printFail() {
        System.out.println("it is too small place for this buildings!");
    }

    private static void printOk() {
        System.out.println("it is good place for this buildings!");
    }
}
