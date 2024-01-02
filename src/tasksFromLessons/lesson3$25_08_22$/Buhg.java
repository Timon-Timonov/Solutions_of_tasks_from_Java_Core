package tasksFromLessons.lesson3$25_08_22$;

public class Buhg {
    public static void printBalance(UrLi rogaIkopita, String title) {
        System.out.println(title);
        System.out.println("Godovaya viruchka sostavlayet: " + rogaIkopita.getViruchka());
        System.out.println("Summa nalogov za god sostavlayet: " + rogaIkopita.yearTax());
        System.out.println("Pribil za god sostavlayet: " + rogaIkopita.dohod());

    }
}
