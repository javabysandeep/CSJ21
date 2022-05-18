package exceptionHandling;

public class ThrowKeyword {
    public static void main(String[] args) {
        //System.out.println(10/0);
        //throw new ArithmeticException("divide by zero");
        //throw new CustomException("user defined exception");
        try{
            //System.out.println(10/0);// implicitly
            throw new ArithmeticException();// explicitly
        }catch (ArithmeticException ae){
            System.out.println("invalid input");
        }
    }

}

// How to create a custom exception ?
// Interview questions
class CustomException extends RuntimeException{
    public CustomException(String message) {
        super(message);
    }

    public CustomException() {
        super();
    }
}