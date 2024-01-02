package tasksByBook.lesson15.task_62byBook;

import java.util.Objects;

public class Person {
    private String name;
    private String surName;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(surName, person.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                " \tname='" + name + '\'' +
                ", \tsurName='" + surName + '\'' +
                ", \tage=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }
}
