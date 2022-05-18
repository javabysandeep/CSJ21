package exceptionHandling;

public class ThrowsKeyword3 {
    public static void main(String[] args) {
        try{
            m1();
        }catch (ArithmeticException ae){
            System.out.println("invalid denominator");
        }
        System.out.println("rest of the main");
    }

    private static void m1() {
        m2();
        System.out.println("rest of the m1");
    }

    private static void m2() {
        System.out.println(10 / 0);
        System.out.println("rest of the m2");
    }
}
//unchecked exceptions will be automatically be propagated from calling method to caller method
//