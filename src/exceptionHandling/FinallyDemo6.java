package exceptionHandling;

public class FinallyDemo6 {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            System.out.println(10/0);//->
            System.exit(0);
            System.out.println("try");
            System.out.println("try");

        }catch (ArithmeticException exception){
            System.out.println("Denominator is zero");
        }finally {
            System.out.println("finally");
        }
        System.out.println("rest of the code");
    }
}
//output
//try
//denominator
//finally
// rest of the code
