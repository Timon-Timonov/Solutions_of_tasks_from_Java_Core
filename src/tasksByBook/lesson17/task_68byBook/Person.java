package tasksByBook.lesson17.task_68byBook;

import java.util.Objects;

public class Person  {
    private String name;
    private String surName;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                " \tname='" + name + '\'' +
                ", \tsurName='" + surName + '\'' +
                ", \tage=" + age +
                '}';
    }

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

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }


    public void incrAge() {
        this.age++;
    }


    public Person build() {
        return new Person();
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setSurName(String surName) {
        this.surName = surName;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }
}
