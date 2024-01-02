package tasksByBook.lesson8.task_34byBook;

public class Ingineer extends Worker {
    private float perCentOfPremi;
    private int stavka;

    public int getStavka() {
        return stavka;
    }

    public void setStavka(int stavka) {
        this.stavka = stavka;
    }

    public float getPerCentOfPremi() {
        return perCentOfPremi;
    }

    public void setPerCentOfPremi(int perCentOfPremi) {
        this.perCentOfPremi = perCentOfPremi;
    }

    @Override
    public int zarplata() {
        return (int)(stavka+stavka*perCentOfPremi);
    }

    public Ingineer(String name, String position, int razryad,int stavka) {
        super(name, position, razryad);
        this.stavka=stavka;
    }
}
