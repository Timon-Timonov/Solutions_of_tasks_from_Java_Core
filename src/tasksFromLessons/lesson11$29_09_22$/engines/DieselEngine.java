package tasksFromLessons.lesson11$29_09_22$.engines;

import tasksFromLessons.lesson11$29_09_22$.Engine;

public class DieselEngine extends Engine {
    private String fuelName="diesel";

    public String getName() {
        return fuelName;
    }

    public DieselEngine(int power) {
        super(power);
    }

    @Override
    public String toString() {
        return "DieselEngine{" +
                "fuelName='" + fuelName + '\'' +
                '}';
    }
}
