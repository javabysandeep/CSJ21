package exceptionHandling;

public class TryCatchFinallyDemo3 {
    public static void main(String[] args) {
        System.out.println(m1());
    }

    private static int m1() {
        try{
            System.out.println(10/0);//--> throw new AE() ---> JRE --> Catch
           return 1;
        }catch (Exception ex){
            return 2;
        }finally {
           return 3;
        }
    }
}
