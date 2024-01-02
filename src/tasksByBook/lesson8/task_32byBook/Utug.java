package tasksByBook.lesson8.task_32byBook;

public class Utug extends BitovTecnika {
    private String producer;


    public Utug(String name, int power, String color, String usingZone, String producer) {
        super(name, power, color, usingZone);
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        String ifOn=(super.isOn()?" connected to electricity, ":" disconected from electricity, ");
        return "Utug{" +super.getColor()+" color, "+
                "producer='" + producer + '\'' +ifOn+
                '}';
    }
}
