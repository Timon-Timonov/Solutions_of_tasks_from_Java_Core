package tasksFromLessons.lesson11$29_09_22$.engines;

import tasksFromLessons.lesson11$29_09_22$.Engine;

public class GasolineEngine extends Engine {
    private String fuelName = "gasoline";

    public String getName() {
        return fuelName;
    }

    public GasolineEngine(int power) {
        super(power);
    }

    @Override
    public String toString() {
        return "GasolineEngine{" +
                "fuelName='" + fuelName + '\'' +
                '}';
    }
}
