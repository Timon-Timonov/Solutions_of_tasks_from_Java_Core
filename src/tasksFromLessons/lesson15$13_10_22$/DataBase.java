package tasksFromLessons.lesson15$13_10_22$;

import java.util.Set;
import java.util.TreeSet;

public class DataBase {
    private String name;
    private Set<Buyer> buyerSet = new TreeSet<Buyer>();

    public DataBase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Buyer> getBuyerCopySet() {
        return new TreeSet<Buyer>(buyerSet);
    }


    public void addLine(Buyer buyer, Product product) {
        if (buyerSet.contains(buyer)) {
            for (Buyer by : buyerSet) {
                if (buyer.equals(by)) {
                    by.addProduct(product);
                }
            }
        } else {
            buyer.addProduct(product);
            buyerSet.add(buyer);
        }
    }


    public void deleteBuyer(Buyer buyer) {
        buyerSet.remove(buyer);
    }


    public void printDataBase() {
        StringBuilder str = new StringBuilder("DataBase name=" + name + ", list of buyers:\n");
        int count = 1;
        for (Buyer buyer : buyerSet) {
            str.append(count++ + ") " + buyer.toString() + "\n");
        }
        System.out.println(str);
    }
}
