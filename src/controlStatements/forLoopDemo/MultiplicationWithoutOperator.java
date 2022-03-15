package controlStatements.forLoopDemo;

public class MultiplicationWithoutOperator {
    public static void main(String[] args) {
        int number1 = 50;
        int number2 = 20;
//        int result = number1 * number2;//1000
        int sum = 0;
        for (int i = 1; i <= number1; i++) {
            sum = sum + number2;
        }
        System.out.println(sum);

    }
}

