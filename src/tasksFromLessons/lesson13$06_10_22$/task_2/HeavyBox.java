package tasksFromLessons.lesson13$06_10_22$.task_2;

import java.util.Objects;

public class HeavyBox {
    private int weight;
    private int volume;

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", volume=" + volume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavyBox heavyBox = (HeavyBox) o;
        return weight == heavyBox.weight &&
                volume == heavyBox.volume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, volume);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public HeavyBox(int weight, int volume) {
        this.weight = weight;
        this.volume = volume;
    }
}
