package tasksByBook.lesson8.task_32byBook;

public class Runner_32 {
    public static void main(String[] args) {
        BitovTecnika gazonokosilka = new BitovTecnika("gazonokosilka", 3500, "Green", "garden");
        System.out.println(gazonokosilka);
        gazonokosilka.switchOn();
        System.out.println(gazonokosilka);


        Utug utug = new Utug("utug", 1500, "white", "laundry", "pHILIPS");
        System.out.println(utug);
        utug.switchOn();
        System.out.println(utug);


        BitovTecnika carWash = new BitovTecnika("carWash", 2500, "ORANGE", "garage");
        System.out.println(carWash);


    }

}
