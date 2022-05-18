package exceptionHandling;

public class DefaultExceptionHandling {
    public static void main(String[] args) {
        // An object is created. ArithmeticException
        // Who is creating this object? ---> JRE
        // Why does this object is created?-->
        // To store the information regarding the exception
        // and why it has occurred and where it has occurred.

        // This object is given to JRE ---> Exception Handler
//        --->  This object is given to default exception handler.
        // DEH ---> prints the content of the object and terminates
        // the abnormally.
        int[] array = new int[20];// NegativeArraySizeException
        //System.out.println(10/0);
        System.out.println("abc");
        System.out.println("abc");
        System.out.println(10/-12);


    }
}
