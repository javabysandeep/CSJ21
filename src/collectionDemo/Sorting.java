package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        Product product1 = new Product(1,"mobile",10000);
        Product product2 = new Product(11,"laptop",20000);
        Product product3 = new Product(10,"charger",1000);
        Product product4 = new Product(12,"adaptor",900);
        Product product5 = new Product(9,"headphones",23900);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
//                return p1.getProductPrice()-p2.getProductPrice();
                return p1.getProductName().compareTo(p2.getProductName());
            }
        };

        Comparator<Product> lambda = (prod1,prod2)->prod1.getProductPrice()- prod2.getProductPrice();
        Collections.sort(productList,lambda);
        for (Product product:productList) {
            System.out.println(product);
        }
        int compare = lambda.compare(product1, product2);
    }
}
class ProductSorter implements Comparator<Product>{
    @Override
    public int compare(Product p1, Product p2) {
//                return p1.getProductPrice()-p2.getProductPrice();
        return p1.getProductName().compareTo(p2.getProductName());
    }
}