package tasksFromLessons.lesson14$11_10_22$.task_4.comparators;

import tasksFromLessons.lesson14$11_10_22$.task_4.clases.Product;

import java.util.Comparator;

public abstract class ProductComparator implements Comparator<Product> {
    private boolean isReversOrder = false;

    public boolean getIsReversOrder() {
        return isReversOrder;
    }

    public void setIsReversOrder(boolean reversOrder) {
        isReversOrder = reversOrder;
    }
}
