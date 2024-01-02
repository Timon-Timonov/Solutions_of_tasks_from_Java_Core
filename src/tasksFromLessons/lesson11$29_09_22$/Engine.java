package tasksFromLessons.lesson11$29_09_22$;

public abstract class Engine {
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public abstract String getName();

    public Engine(int power) {
        this.power = power;
    }
}
