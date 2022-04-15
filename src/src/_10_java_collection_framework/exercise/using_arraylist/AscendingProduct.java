package _10_java_collection_framework.exercise.using_arraylist;

import java.util.Comparator;

public class AscendingProduct implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getProductPrice() > o2.getProductPrice()) {
            return 1;
        } else if (o2.getProductPrice() < o2.getProductPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}

