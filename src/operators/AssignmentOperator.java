package operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        int number = 100;// value assignment
        int number2 = number;//variable assignment
        int number3 = 10 / 3 + 20;//expression assignment
        int number4 = add(number2, number3);//method call
        //LHS must be variable only
    }
    private static int add(int i, int j) {
        return i + j;
    }
}
