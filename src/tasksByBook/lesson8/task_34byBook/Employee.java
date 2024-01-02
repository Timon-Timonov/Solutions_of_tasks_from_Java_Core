package tasksByBook.lesson8.task_34byBook;

public abstract class Employee {
    private String name;
    private String position;

    private int razryad;


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }



    public int getRazryad() {
        return razryad;
    }

    public void setRazryad(int razryad) {
        this.razryad = razryad;
    }

    public Employee(String name, String position, int razryad) {
        this.name = name;
        this.position = position;
        this.razryad = razryad;
    }
    public abstract int zarplata();
}
