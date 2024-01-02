package tasksByBook.lesson18.task_70byBook;

import java.io.Serializable;
import java.util.Objects;

public class Man implements Serializable, Comparable<Man> {

    private int id;
    private String surName;
    private String name;
    protected int age;
    public String placeOfBirth;
    String city;


    public String getCity() {
        return city;
    }

    @Override
    public int compareTo(Man o) {
        return this.id - (o.id);
    }

    protected void setCity(String city) {
        this.city = city;
    }

    public Man(int id) {
        this.id = id;
    }

    public Man() {

    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    private void incrAge() {
        this.age++;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Man)) return false;
        Man man = (Man) o;
        return id == man.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Man{" +
                "id=" + id +
                ", surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                '}';
    }


    public void sayHello(String text) {
        System.out.println("Hello from " + name + "!!! I from " + city + "." +
                "\n I want tell you " + text);
    }
}
