package exceptionHandling;

public class HandleExceptions {
    public static void main(String[] args) {
        System.out.println(10 / 0);
        System.out.println("rest of the code");
        //1. try catch
        //2. throws
        // keywords: try, catch, finally, throw, throws
       //valid
        try{}catch (Exception ex){}finally {}
        try{}catch (Exception ex){}
        try{}finally{}
        try{}catch (NullPointerException np){}catch (NegativeArraySizeException na){}finally {

        }
    }
}
