package operators;

public class LogicalOperators {
    public static void main(String[] args) {
        // logical operators are applicable for boolean type.
        // input: boolean, output: boolean

        //AND, OR, NOT, XOR these are not keywords
        // AND operation: &, &&
        // OR operation: |, ||
        // XOR operation: ^
        // NOT: !
        //output: boolean
        //For boolean type : &, &&, |, ||, ^, !
        System.out.println(false & true & true & true);
        System.out.println(false | false |false | false | true);
        System.out.println(false ^ false & false | false | true);
        System.out.println(!true);
        // &, |, ^ are both logical and bitwise operators
        //for number type:

        // truly logical operators: &&, ||, ^, !
        System.out.println(4 & 5);//4 // this is not logical opeartion. this is bitwise operation
        System.out.println(4 | 5);//5 // this is not logical opeartion. this is bitwise operation

        // System.out.println(4 && 5);//CTE
        // System.out.println(4 || 5);//CTE
        System.out.println(4 ^ 5);//1: bitwise XOR operation

        System.out.println( 4 > 5 && 4 > 3 );//false


    }
}
