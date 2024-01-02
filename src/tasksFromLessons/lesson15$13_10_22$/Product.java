package tasksFromLessons.lesson15$13_10_22$;

import java.util.Objects;

import static tasksFromLessons.lesson15$13_10_22$.Task_1Runner.PART_OF_ONE_TO_SAVE_COUNT;

public class Product implements Comparable<Product> {
    private String name;
    private double count;

    public void incrCount(double count) {

        this.count = Math.round((this.count + count) * PART_OF_ONE_TO_SAVE_COUNT) *1d/ PART_OF_ONE_TO_SAVE_COUNT;
    }

    public String getName() {
        return name;
    }

    public double getCount() {
        return count;
    }

    public Product(String name, double count) {
        this.name = name;
        this.count = Math.round(this.count * PART_OF_ONE_TO_SAVE_COUNT) *1d/ PART_OF_ONE_TO_SAVE_COUNT;
    }

    @Override
    public int compareTo(Product o) {
        return name.compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return ' ' + name + ' ' + count;
    }
}
