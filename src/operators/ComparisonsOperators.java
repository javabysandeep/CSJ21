package operators;

public class ComparisonsOperators {
    public static void main(String[] args) {
        //>, <, >=, <=, ==, !=

        //==, != are applicable for both numbers and boolean
        // output of comparison operators will be boolean type only.

        /*System.out.println(true > true);//CTE
        System.out.println(true < true);//CTE
        System.out.println(true >= true);//CTE
        System.out.println(true <= true);//CTE*/
        System.out.println(true == true);//true
        System.out.println(true != true);//false

        System.out.println("relation check for numbers ");
        System.out.println(10 > 20);//false
        System.out.println(10 > 10);//false
        System.out.println(10 >= 10);//true
        System.out.println(10 == 10);//true
        System.out.println(10 != 10);//false
        System.out.println(10 < 'A');//true
//        System.out.println(10 < "A");//CTE
//        System.out.println("String"-10);//CTE
    }
}
