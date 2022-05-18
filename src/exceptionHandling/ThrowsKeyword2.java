package exceptionHandling;

public class ThrowsKeyword2 {
    public static void main(String[] args)  {
        try {
            m1();
        } catch (Exception e) {
            System.out.println("Handled in main");
        }
    }

    private static void m1() throws Exception,NullPointerException  {
        m2();
    }

    private static void m2() throws Exception {
        //checked exception
        throw new Exception();
    }
}
