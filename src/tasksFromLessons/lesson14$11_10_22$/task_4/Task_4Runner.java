package tasksFromLessons.lesson14$11_10_22$.task_4;

import tasksFromLessons.lesson14$11_10_22$.task_4.clases.Catalog;
import tasksFromLessons.lesson14$11_10_22$.task_4.clases.Product;

import java.util.Random;

public class Task_4Runner {
    public static final String[] NAMES_OF_PRODUCTS = {"Toy", "Pencil", "Pen", "Desk", "Bag", "Scisors", "Knife",
            "Bolt", "Car", "Plane", "Gun", "Computer", "Mouse"};
    public static final double MAX_PRICE_OF_PRODUCT = 10_000;
    public static final double MAX_RATING = 10;
    public static final int COUNT_OF_PRODUCTS_TO_CREATE = 30;

    public static void main(String[] args) {

        Catalog catalog = new Catalog();

        creatingOfProductsToCatalog(catalog);
        System.out.println("All catalog after creation:");//default nameSort normal order
        catalog.printAllCatalog();
        System.out.println();

        catalog.setReversOrder();
        System.out.println("All catalog with revers order by names:");
        catalog.printAllCatalog();
        System.out.println();

        catalog.setPriceSort();
        System.out.println("All catalog with normal order by price:");
        catalog.printAllCatalog();
        System.out.println();

        catalog.setRatingSort();
        System.out.println("All catalog with normal order by rating:");
        catalog.printAllCatalog();
        System.out.println();

        catalog.setReversOrder();
        System.out.println("All catalog with revers order by rating:");
        catalog.printAllCatalog();
        System.out.println();


        catalog.setNormalOrder();
        System.out.println("All catalog with normal order by rating:");
        catalog.printAllCatalog();
        System.out.println();
    }

    private static void creatingOfProductsToCatalog(Catalog catalog) {
        Random random = new Random();
        for (int i = 0; i < COUNT_OF_PRODUCTS_TO_CREATE; i++) {
            Product product = new Product(
                    NAMES_OF_PRODUCTS[random.nextInt(NAMES_OF_PRODUCTS.length)],
                    Math.random() * MAX_PRICE_OF_PRODUCT,
                    Math.random() * MAX_RATING);
            catalog.addProductToCatalog(product);
        }
    }
}
