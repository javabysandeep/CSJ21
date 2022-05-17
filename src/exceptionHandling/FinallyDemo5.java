package exceptionHandling;

public class FinallyDemo5 {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            System.out.println(10/1);//->
            System.out.println("try");
            System.out.println("try");
            System.exit(0);

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
// rest of the code
