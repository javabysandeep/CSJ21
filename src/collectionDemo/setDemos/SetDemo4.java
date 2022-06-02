package collectionDemo.setDemos;

import collectionDemo.listDemos.Product;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo4 {
    public static void main(String[] args) {
        // unique elements and sorting order.
        // Data will be sorted but for that elements should be of same type.
        // slower why? because sorting needs to happen

        //TreeSet needs data of type Comparable or Comparator
        TreeSet<Product> products = new TreeSet();

        Product product1 = new Product(101, "mobile",10000);
        Product product2 = new Product(11, "laptop",120000);
        Product product3 = new Product(10, "bottles",100);
        Product product4 = new Product(1, "charger",1000);
        Product product5 = new Product(2, "camera",21000);
        Product product6 = new Product(2, "camera",23000);
        Product product7 = new Product(2, "camera",24000);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);

        products.forEach(System.out::println);

    }
}
