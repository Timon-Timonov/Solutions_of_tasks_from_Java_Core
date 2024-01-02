package tasksByBook.lesson8.task_35_36_37byBook;

public enum SeasonsOfTheYear {
    winter(1, "cold", 90),
    spring(2, "green", 92),
    summer(3, "bright", 92),
    autumn(4, "yellow", 91);


    private int id;
    private String description;
    private int CountOfDays;

    SeasonsOfTheYear(int id, String description, int countOfDays) {
        this.id = id;
        this.description = description;
        CountOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public int getCountOfDays() {
        return CountOfDays;
    }
}
