package tasksFromLessons.lesson3$25_08_22$;

public class OAO extends UrLi {
    private int roadTax;

    @Override
    public float yearTax() {
        return super.getViruchka() * (super.getTax() + roadTax) / PERCENT;
    }

    @Override
    public float dohod() {
        return super.getViruchka() * (1 - (float)(super.getTax()+roadTax)/ PERCENT);
    }

    public OAO(int tax, int roadTax) {
        super(tax);
        this.roadTax = roadTax;
    }
}
