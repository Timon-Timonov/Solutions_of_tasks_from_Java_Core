package tasksFromLessons.lesson3$25_08_22$;

public class Runner {
    public static void main(String[] args) {
        UrLi uric = new UrLi(20);
        uric.setViruchka(2250);

        OAO rogaIkopita = new OAO(18, 8);
        rogaIkopita.setViruchka(32250);

        Buhg.printBalance(uric, "Balance of Ur litso:");

        System.out.println();

        Buhg.printBalance(rogaIkopita, "Balance of OAO: ");


    }
}
