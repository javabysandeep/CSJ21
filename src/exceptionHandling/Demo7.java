package exceptionHandling;

public class Demo7 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException exception){
            System.out.println("dr is zero");
            System.out.println(10/0);
        }
        System.out.println("rest of the code");
    }
}
