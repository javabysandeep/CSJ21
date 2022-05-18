package exceptionHandling;

public class TryCatchFinallyDemo5 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
            String str = "null";
            System.out.println(str.length());
            System.out.println(str.charAt(0));
            int[] array = new int[-20];

        } catch (ArithmeticException ex) {
            System.out.println("handling AE");
        } catch (NullPointerException np) {
            System.out.println("handling null");
        } catch (StringIndexOutOfBoundsException siobi) {
            System.out.println("handling string index out of bound");
        } catch (Exception exception) {
            System.out.println("generic exception");
        }
        System.out.println("rest of the code");
    }
}
