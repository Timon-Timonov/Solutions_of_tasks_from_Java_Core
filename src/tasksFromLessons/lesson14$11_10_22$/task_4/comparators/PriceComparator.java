package tasksFromLessons.lesson14$11_10_22$.task_4.comparators;

import tasksFromLessons.lesson14$11_10_22$.task_4.clases.Product;

public class PriceComparator extends ProductComparator {
    @Override
    public int compare(Product o1, Product o2) {
        int comp = (int) (o1.getPrice() - o2.getPrice());
        if (comp != 0) {
            if (super.getIsReversOrder()) {
                return comp * (-1);
            } else
                return comp;
        } else
            return o1.getName().compareTo(o2.getName());
    }
}
