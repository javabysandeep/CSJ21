package exceptionHandling;

import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        //System.out.println(10/0);//ex--> JRE---> DEH --> prints--> terminate
        // ex obj is given to JRE ---> throw new ArithemeticException

        // manually creating the object and giving to JRE
        //throw new ArithmeticException("Divide by zero");
        //System.out.println("rest of the code");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        try {
            //exception prone code.
            // ex object implicitly --> JRE --> Ex Handler
            System.out.println("division is " + (number1 / number2));
            System.exit(0);
        }
        //exception handler provided by developer.
        catch (ArithmeticException arithmeticException){
            // exception handling code.
            //alternate code
            System.out.println("Wrong input. Please input other than zero");
        }
        finally {
            // db connection close
            // server connection close
            // file closing
            //This will always execute. irrespective of the exception comes or not
            System.out.println("finally always executes");
        }
        System.out.println("Rest of the code.");
    }
}
