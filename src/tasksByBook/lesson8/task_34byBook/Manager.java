package tasksByBook.lesson8.task_34byBook;

public class Manager extends Ingineer {

    public Manager(String name, String position, int razryad, int stavka) {
        super(name, position, razryad, stavka);
    }

    @Override
    public int zarplata() {
        return (int)(getTarif()*getWorkTime()*(1+getPerCentOfPremi()));
    }
}
