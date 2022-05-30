package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class ListOfProducts {
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

        //1. create a separate class and implement the Comparator and pass the obj to sort method.


        //2. create a Anonymous class and implement the Comparator and pass the obj to sort method.
        //Anonymous class
       /* Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return product1.getProductName().compareTo(product2.getProductName());
            }
        };*/

        //3. lambda way
        Comparator<Product> lambda = (p1, p2)->p1.getProductName().compareTo(p2.getProductName());

        /*//4. Comparing
        // Method reference
        Comparator<Product> comp = Comparator.comparing(Product::getProductPrice);
        //comparing is a static method which accepts data of type Function
        //Functon --> It is functional interface which has R apply(T t)
        Collections.sort(productList, comp);*/

        Collections.sort(productList,lambda);
        for (Product product:productList) {
            System.out.println(product);
        }
        Function<String, Integer> function = (string)-> string.length();
        System.out.println(function.apply("functional interface"));

    }
}
class SortProductsByPrice implements Comparator<Product>{
    @Override
    public int compare(Product product1, Product product2) {
        return product1.getProductPrice()-product2.getProductPrice();
    }
}
class SortProductsByName implements Comparator<Product>{
    @Override
    public int compare(Product product1, Product product2) {
        return product1.getProductName().compareTo(product2.getProductName());
    }
}
