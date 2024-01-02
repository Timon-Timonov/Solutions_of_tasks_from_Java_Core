package tasksFromLessons.lesson11$29_09_22$.engines;

import tasksFromLessons.lesson11$29_09_22$.Engine;

public class ElectricEngine extends Engine {
    private String EnergiName = "electric";

    public String getName() {
        return EnergiName;
    }

    public ElectricEngine(int power) {
        super(power);
    }

    @Override
    public String toString() {
        return "ElectricEngine{" +
                "EnergiName='" + EnergiName + '\'' +
                '}';
    }
}
