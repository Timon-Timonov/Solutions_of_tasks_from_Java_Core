package tasksFromLessons.lesson11$29_09_22$;

import tasksFromLessons.lesson11$29_09_22$.engines.DieselEngine;
import tasksFromLessons.lesson11$29_09_22$.engines.ElectricEngine;
import tasksFromLessons.lesson11$29_09_22$.engines.GasolineEngine;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Car> garage = new ArrayList<Car>();

        Car volvo = new Car("Volvo");
        Car opel = new Car("Opel");
        Car tesla = new Car("Tesla");

        volvo.setEngine(new DieselEngine(95));
        opel.setEngine(new GasolineEngine(110));
        tesla.setEngine(new ElectricEngine(160));

        garage.add(volvo);
        garage.add(opel);
        garage.add(tesla);

        for (Car c : garage) {
            System.out.println(c);

        }
    }
}
