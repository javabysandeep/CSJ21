package exceptionHandling;

public class ThrowVsThrows {
    public static void main(String[] args) throws Exception {
        try {
            m1();
            m2();
            m3();
            m4();
            m5();
        } catch (Exception exception) {
            System.out.println("Handling all exceptions in one place");
        }
        //throw new InvalidAgeException("Invalid Age");
        System.out.println("Main rest of the code");

    }

    private static void m1() throws Exception {
        throw new Exception();

    }

    private static void m2() throws Exception {
        throw new Exception();
    }

    private static void m3() throws Exception {
        throw new Exception();
    }

    private static void m4() throws Exception {
        throw new Exception();
    }

    private static void m5() throws Exception {
        throw new Exception();
    }
}
