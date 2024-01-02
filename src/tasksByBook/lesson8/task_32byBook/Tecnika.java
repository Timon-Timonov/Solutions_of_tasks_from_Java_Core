package tasksByBook.lesson8.task_32byBook;

import java.util.Objects;

public abstract class Tecnika {
    private String name;
    private int power;
    private String color;
    private boolean isOn=false;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tecnika tecnika = (Tecnika) o;
        return power == tecnika.power &&
                name.equals(tecnika.name) &&
                Objects.equals(color, tecnika.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power, color);
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

    public Tecnika(String name, int power, String color) {
        this.name = name;
        this.power = power;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ticnica name: " + name + ";"
                + "tecnika power: " + power + ";"
                + "tecnika color: " + color +
                "device is on - "+isOn+ ".";
    }

    public boolean isOn() {
        return isOn;
    }

    public void switchOn(){
        isOn=true;
    }

    public void switchOff(){
        isOn=false;
    }

}
