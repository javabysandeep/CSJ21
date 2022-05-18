package exceptionHandling;

public class TryCatchFinallyDemo4 {
    public static void main(String[] args) {
        try{
            try{
                System.out.println(10/0);
            }catch (ArithmeticException ex){
                System.out.println("Internal catch");
            }finally {
                System.out.println("internal finally");
            }
        } catch (Exception ex){
            System.out.println("outer catch");
        }
        System.out.println("rest of the code");
    }
}
