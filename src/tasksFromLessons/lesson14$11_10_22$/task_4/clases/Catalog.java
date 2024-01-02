package tasksFromLessons.lesson14$11_10_22$.task_4.clases;

import tasksFromLessons.lesson14$11_10_22$.task_4.comparators.NameComparator;
import tasksFromLessons.lesson14$11_10_22$.task_4.comparators.PriceComparator;
import tasksFromLessons.lesson14$11_10_22$.task_4.comparators.ProductComparator;
import tasksFromLessons.lesson14$11_10_22$.task_4.comparators.RatingComparator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Catalog {

    private ProductComparator comparator = new NameComparator();
    private Set<Product> catalog = new HashSet<Product>();


    public void addProductToCatalog(Product product) {
        catalog.add(product);
    }

    public void deleteProductFromCatalog(Product product) {
        catalog.remove(product);
    }

    public void clearCatalog() {
        catalog.clear();
    }


    public void setReversOrder() {
        comparator.setIsReversOrder(true);
    }

    public void setNormalOrder() {
        comparator.setIsReversOrder(false);
    }


    public void setNameSort() {
        this.comparator = new NameComparator();
    }

    public void setPriceSort() {
        this.comparator = new PriceComparator();
    }

    public void setRatingSort() {
        this.comparator = new RatingComparator();
    }


    public void printAllCatalog() {
        Set<Product> tempSet = new TreeSet<Product>(comparator);
        tempSet.addAll(catalog);

        int count = 1;
        for (Product product : tempSet) {
            System.out.println(count++ + ")\t" + product.toString());
        }
    }
}
