package exceptionHandling;

public class ThrowsKeyword {
    public static void main(String[] args) throws Exception {
        //1. try catch
       /* try{
            throw new Exception("checked exception");
        }catch (Exception ex){
            System.out.println("handling with try catch");
        }*/
        //2. throws
        throw new Exception("checked exception");
    }
}
