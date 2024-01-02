package tasksByBook.lesson8.task_38byBook;

public class Garage<T extends Vehicle> {
    private T vehicle;

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }
}
