package tasksFromLessons.lesson8$20_09_22$;

import java.util.Objects;

public abstract class Man {
    private String name;
    private int age;
    private String town;
    private int id;

    public Man() {
    }

    public Man(String name, int age, String town, int id) {
        this.name = name;
        this.age = age;
        this.town = town;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", town='" + town + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return id == man.id &&
                Objects.equals(name, man.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
