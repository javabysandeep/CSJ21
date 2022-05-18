package exceptionHandling;

public class ThrowKeyword2 {
    public static void main(String[] args) {
        //System.out.println(10/0);// throwing the ae object done automatically
        //explicitly
       // throw new ArithmeticException("divide by zeroo000");
        //System.out.println("rest of the code");
        try{
            throw new ArithmeticException();
        }catch (ArithmeticException ae){
            System.out.println("divide by zero");
        }
    }

}
