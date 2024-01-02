package tasksByBook.lesson8.task_38byBook;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of motorcycle: ");
        String name = scanner.nextLine().trim();
        //Vehicle moto = new Motorcycle(name);
        Motorcycle moto = new Motorcycle(name);
        Garage garage_1 = new Garage(moto);
        System.out.println("Garage_1 save " + garage_1.getVehicle().getClass().getSimpleName()
                + " " + garage_1.getVehicle().getName());


        System.out.println("Enter name of car: ");
        name = scanner.nextLine().trim();
        //Vehicle car = new Car(name);
        Car car = new Car(name);
        Garage garage_2 = new Garage(car);
        System.out.println("Garage_2 save " + garage_2.getVehicle().getClass().getSimpleName()
                + " " + garage_2.getVehicle().getName());
        scanner.close();

        System.out.println();
        System.out.println("Changing of garages:");
        Vehicle vehicle = garage_2.getVehicle();
        garage_2.setVehicle(garage_1.getVehicle());
        garage_1.setVehicle(vehicle);
        System.out.println("Garage_1 save " + garage_1.getVehicle().getClass().getSimpleName()
                + " " + garage_1.getVehicle().getName());
        System.out.println("Garage_2 save " + garage_2.getVehicle().getClass().getSimpleName()
                + " " + garage_2.getVehicle().getName());
    }
}
