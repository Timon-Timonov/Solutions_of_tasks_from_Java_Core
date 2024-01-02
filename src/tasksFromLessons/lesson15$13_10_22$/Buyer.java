package tasksFromLessons.lesson15$13_10_22$;

import java.util.*;

public class Buyer implements Comparable<Buyer> {

    private String name;
    private Set<Product> productSet = new TreeSet<Product>();


    public void addProduct(Product prod) {
        if (productSet.contains(prod)) {
            for (Product product : productSet) {
                if (prod.equals(product)) {
                    product.incrCount(prod.getCount());
                }
            }
        } else {
            productSet.add(prod);
        }
    }


    public Set<Product> getProductCopySet() {
        return new TreeSet<Product>(productSet);
    }

    public String getName() {
        return name;
    }

    public Buyer(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buyer buyer = (Buyer) o;
        return Objects.equals(name, buyer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Buyer o) {
        return name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        StringBuilder toStr = new StringBuilder(name + ": ");
        int count = 1;
        for (Product p : productSet) {
            toStr.append("\n\t\t\t" + count++ + " ");
            toStr.append(p.toString());
        }
        return toStr.toString();
    }
}
