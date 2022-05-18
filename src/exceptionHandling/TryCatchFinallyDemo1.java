package exceptionHandling;

public class TryCatchFinallyDemo1 {
    public static void main(String[] args) {
        try{
            //exception prone code
            System.out.println(10/1);
            System.exit(0);
            System.out.println("Rest of the try");
            // AE --> JRE --> EX Handler
        }catch (ArithmeticException ae){
            System.out.println("Invalid number");
        }finally {
            System.out.println("To have clean up code");
        }
        System.out.println("Rest of the code");
    }
}
