package oops;

public class Product {
    int productId;
    String productName;
    int productPrice;
    static int counter=0;

    public Product() {
        System.out.println(" zero Con");
    }

    public Product(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        System.out.println("param con");
    }

    void showProductDetails() {
        System.out.println(productId + "\t" + productName + "\t" + productPrice);
    }

    {
        counter++;
        System.out.println("Counter from instance block "+counter);
    }
    static {
        System.out.println("Static block");
    }
}
