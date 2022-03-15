package controlStatements;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 100;
        char operation = '-';
        switch (operation) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;
            case '%':
                System.out.println(number1 % number2);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
