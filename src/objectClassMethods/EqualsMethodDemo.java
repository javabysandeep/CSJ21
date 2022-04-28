package objectClassMethods;

public class EqualsMethodDemo {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Mobile",5000);
        Product product2 = new Product(1,"Mobile",5000);

        int a = 30;
        int b  = 30;
        System.out.println(a==b);
        System.out.println(product1==product2);//false ---> similar to object class equals method
        System.out.println(product1.equals(product2));//true

        System.out.println(product1.hashCode()==product2.hashCode());//true
    }
}
