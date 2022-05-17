package exceptionHandling;

public class FinallyDemo4 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            System.exit(0);
        }catch (ArithmeticException exception){
            System.out.println("Denominator is zero");
        }finally {
            System.out.println("Finally");
        }
        System.out.println("rest of the code");
    }
}
//output
//Denominator is zero
// finally
//rest of the code
