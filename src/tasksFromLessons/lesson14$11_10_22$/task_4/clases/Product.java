package tasksFromLessons.lesson14$11_10_22$.task_4.clases;

import java.util.Objects;

public class Product {
    @Override
    public String toString() {
        return "{" +
                "name='" + name + "\'" +
                ",\t"+ (name.length() > 7 ? "" : "\t")+ (name.length() > 8 ? "" : "\t") +
                "price=" + price +
                ",\t\t\trating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Double.compare(product.rating, rating) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, rating);
    }

    private String name;
    private double price;
    private double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = Math.round(price * 100) / 100d;
        this.rating = Math.round(rating * 100) / 100d;
    }
}
