package objectClassMethods;

public class FinalizeDemo {
    public static void main(String[] args) {
        Product product = new Product();
        product= null;
        System.gc();// calling gc explicitly
        System.out.println(product);
    }
}
