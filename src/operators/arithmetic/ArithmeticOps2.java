package operators.arithmetic;

public class ArithmeticOps2 {
    public static void main(String[] args) {
        // +, -, *, /, %
        System.out.println(10 + 10);//20
        System.out.println(10 - 10); //0
        System.out.println(10 * 10);//100
        System.out.println(10 / 10);//1
        System.out.println(10 % 10);//0

        System.out.println((char) ('A' + 32));//a

        System.out.println(10 / 1);//Q=10
        System.out.println(10 % 1); // R=0

        System.out.println(1 / 10); // Q = 0
        System.out.println(1 % 10); // R = 1

        //System.out.println(10 / 0);//ArithmeticException divide by zero
        // System.out.println(10 % 0);//ArithmeticException divide by zero

        System.out.println(10.0 / 0);//Infinity
        System.out.println(10.0 % 0);//NaN- Not A Number

        //Arithmetic Operations are not allowed for boolean type data.
        //System.out.println(true+false);//CTE


    }
}
