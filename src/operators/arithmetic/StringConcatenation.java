package operators.arithmetic;

public class StringConcatenation {
    public static void main(String[] args) {
        //string concatenation will happen when one of the operand is String type
        //Mathematical addition will happen when both of the operands are of number type
        //Operator precedence - BODMAS
        //Expression evaluation order is left to right

        System.out.println("A" + 65 + 'A');//A65A

        System.out.println(65 + 'A' + "A");//130A

        System.out.println('A' + 'B' + "A");//131A




    }
}
