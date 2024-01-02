package tasksByBook.lesson6;

public class Runner24_25 {
    public static void main(String[] args) {
        Task_24byBook clock_1 = new Task_24byBook(95644544);
        Task_24byBook clock_2 = new Task_24byBook(288, 54, 38);


        System.out.println("clock_2.compareTo(clock_1)=" + clock_2.compareTo(clock_1));
        System.out.println("clock_1 total count of srconds: " + clock_1.getFullSeconds());
        System.out.println(clock_1.toString());
        System.out.println("clock_2 total count of srconds: " + clock_2.getFullSeconds());
        System.out.println(clock_2.toString());


        Task_25byBook atm = new Task_25byBook(15, 8, 6);
        System.out.println("Total sum in the atm:" + atm.getTotalSum());
        while (true) {
            if (atm.getCash() < 0) {
                continue;
            } else {
                break;
            }
        }

        System.out.println("Total sum in the atm:" + atm.getTotalSum());
        atm.addMoney(0, 25, 1);
        System.out.println("Total sum in the atm after adding money:" + atm.getTotalSum());

    }
}
