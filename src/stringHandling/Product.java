package stringHandling;

public final class Product {
    private int productId;
    private String productName;
    // How can we change the state[instance variables value change] of an object?
    //1. if instances are public we can access them directly.
    //2. through public setter methods we can access them.
    //3. from the child classes.

    //Immutable: we can't change the state[instance variables] of an object.
    //Q. How to make the class immutable?
    //1. make the instances variable private
    //2. do not provide the public setters.
    //3.  make the class final


    public Product() {
    }

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
}

class App {
    public static void main(String[] args) {
        Product product = new Product(101, "abc");
        Product product2 = product;
        Product product3 = product;
        Product product4 = product;
        String str = new String("welcome to immutable class");

        String s1country = ("India");
        String s2country = ("India");
        String s3 = ("India");
        String s4 = ("India");

    }
}