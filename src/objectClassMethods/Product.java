package objectClassMethods;

import java.util.Objects;

public class Product {
    Integer productId;
    String productName;
    Integer productPrice;

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return product.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    public Product(Integer productId, String productName, Integer productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Product() {
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("some cleanup activity");
    }
}
