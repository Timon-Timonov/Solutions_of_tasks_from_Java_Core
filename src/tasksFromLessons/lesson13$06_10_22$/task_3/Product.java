package tasksFromLessons.lesson13$06_10_22$.task_3;

import java.util.Objects;

public class Product {
    private int price;
    private int size;

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price &&
                size == product.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, size);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Product(int price, int size) {
        this.price = price;
        this.size = size;
    }
}
