package tasksFromLessons.lesson3$25_08_22$;

public class UrLi {
    public static final int PERCENT = 100;
    private int tax;
    private int viruchka;

    public float dohod() {
        return ((float) viruchka - yearTax()) ;
    }

    public float yearTax() {
        return viruchka * tax / PERCENT;
    }

    public int getTax() {
        return tax;
    }

    public int getViruchka() {
        return viruchka;
    }

    public void setViruchka(int viruchka) {
        this.viruchka = viruchka;
    }

    public UrLi(int tax) {
        this.tax = tax;
    }
}
