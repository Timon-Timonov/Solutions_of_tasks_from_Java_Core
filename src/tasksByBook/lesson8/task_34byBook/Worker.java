package tasksByBook.lesson8.task_34byBook;

public class Worker extends Employee {
    private  int tarif;

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    private int workTime;

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public Worker(String name, String position, int razryad) {
        super(name, position, razryad);
    }

    @Override
    public int zarplata() {
        return tarif*workTime;
    }
}
