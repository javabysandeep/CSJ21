package exceptionHandling;

public class FinallyDemo2 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            //System.exit(0);
        }finally {
            System.out.println("Finally");
        }
        System.out.println("rest of the code");
    }
}
//output
// finally
