package objectClassMethods.cloning;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Order order = new Order(1,100);
        Product p1 = new Product(1,"Mobile",5000,1,order);
        Product p2 = p1;//reference copy. It is not a object cloning
        Product p3 = (Product) p1.clone();
        System.out.println(p1);
        System.out.println(p3);
        System.out.println("Change the order object with the help of p1");
        p1.order.orderId=2;
        p1.order.orderQuantity=200;
        System.out.println(p1);
        System.out.println(p3);

    }
    static class Product implements Cloneable{
        int productId;
        String productName;
        long productPrice;
        int productQuantity;
        Order order;

        public Product(int productId, String productName, long productPrice, int productQuantity, Order order) {
            this.productId = productId;
            this.productName = productName;
            this.productPrice = productPrice;
            this.productQuantity = productQuantity;
            this.order = order;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Product product = (Product) super.clone();
            Order order = (Order)product.order.clone();
            product.order = order;
            return product;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "productId=" + productId +
                    ", productName='" + productName + '\'' +
                    ", productPrice=" + productPrice +
                    ", productQuantity=" + productQuantity +
                    ", order=" + order +
                    '}';
        }
    }
    static class Order implements Cloneable{
        int orderId;
        int orderQuantity;

        public Order(int orderId, int orderQuantity) {
            this.orderId = orderId;
            this.orderQuantity = orderQuantity;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "orderId=" + orderId +
                    ", orderQuantity=" + orderQuantity +
                    '}';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
