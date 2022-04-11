package oops;

public class BlockDemo {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product(1,"abc",100);
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();
        System.out.println("No of objects created "+Product.counter);
        product2.showProductDetails();
    }
}
