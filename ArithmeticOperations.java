public class ArithmeticOperations {
    public static void main(String[] args) {
        System.out.println('A'+'A');//130
        System.out.println('A'+ 65);//130
        System.out.println('A'+65.0f);//130.0f
        System.out.println('A'+135l);//200l
        System.out.println('A'/10);//6
        System.out.println('A'%10);//5
    }
}


// (operand1) +,-,*,/,% (operand2)
// (byte, short, int, char) +,-,*,/,% (byte, short, int, char)--> int
// (byte, short, int, char, long) +,-,*,/,% (byte, short, int, char,long)--> long
// (byte, short, int, char, long, float) +,-,*,/,% (byte, short, int, char,long, float)--> float
// (byte, short, int, char, long, float, double) +,-,*,/,% (byte, short, int, char,long, float, double)--> double