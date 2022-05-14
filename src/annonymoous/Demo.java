package annonymoous;

public class Demo {
    public static void main(String[] args) {
        ProductService productService =  new ProductService(){
            @Override
            public void registerProduct() {
                System.out.println("register through anonymous");
            }
        };
        productService.registerProduct();

        ProductService lambda = ()->{
            System.out.println("register through lambda");
        };
        lambda.registerProduct();
    }
}

class ProductServiceImpl implements ProductService{
    @Override
    public void registerProduct() {

    }
}