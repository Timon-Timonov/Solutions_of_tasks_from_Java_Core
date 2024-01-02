package tasksByBook.lesson3;

public class Task_11byBook {
    public static void main(String[] args) {
        int a =1;
        printTodayScedule(a);
    }

    private static void printTodayScedule(int a) {
        switch (a) {
            case 1:
                printSchedule_1();
                break;
            case 2:
                printSchedule_2();
                break;
            case 3:
                printSchedule_3();
                break;
            case 4:
                printSchedule_4();
                break;
            case 5:
                printSchedule_5();
                break;
            case 6:
                printSchedule_6();
                break;
            case 7:
                printSchedule_7();
                break;
            default:
                System.out.println("There is no day of week with such number!");
        }
    }


    private static void printSchedule_1() {
        System.out.println("Sunday schedule.");
        System.out.println("First sunday task: ");
        System.out.println("Second sunday task: ");
        System.out.println("Third sunday task: ");
        System.out.println("etc.... ");
    }

    private static void printSchedule_2() {
        System.out.println("Monday schedule.");
        System.out.println("First monday task: ");
        System.out.println("Second monday task: ");
        System.out.println("Third monday task: ");
        System.out.println("etc.... ");
    }

    private static void printSchedule_3() {
        System.out.println("Tuesday schedule.");
        System.out.println("First tuesday task: ");
        System.out.println("Second tuesday task: ");
        System.out.println("Third tuesday task: ");
        System.out.println("etc.... ");
    }

    private static void printSchedule_4() {
        System.out.println("Wednesday schedule.");
        System.out.println("First wednesday task: ");
        System.out.println("Second wednesday task: ");
        System.out.println("Third wednesday task: ");
        System.out.println("etc.... ");
    }

    private static void printSchedule_5() {
        System.out.println("Thursday schedule.");
        System.out.println("First thursday task: ");
        System.out.println("Second thursday task: ");
        System.out.println("Third thursday task: ");
        System.out.println("etc.... ");
    }

    private static void printSchedule_6() {
        System.out.println("Friday schedule.");
        System.out.println("First friday task: ");
        System.out.println("Second friday task: ");
        System.out.println("Third friday task: ");
        System.out.println("etc.... ");
    }

    private static void printSchedule_7() {
        System.out.println("Satarday schedule.");
        System.out.println("First satarday task: ");
        System.out.println("Second satarday task: ");
        System.out.println("Third satarday task: ");
        System.out.println("etc.... ");
    }
}
