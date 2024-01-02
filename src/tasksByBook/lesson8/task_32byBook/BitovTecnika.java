package tasksByBook.lesson8.task_32byBook;

public class BitovTecnika extends Tecnika {

    private String usingZone;

    public BitovTecnika(String name, int power, String color, String usingZone) {
        super(name, power, color);
        this.usingZone=usingZone;
    }

    @Override
    public void switchOff() {
        super.switchOff();
        System.out.println(super.getName()+" disconected from electricity.");
    }

    @Override
    public void switchOn() {
        super.switchOn();
        System.out.println(super.getName()+" conected to electricity.");
    }
}
