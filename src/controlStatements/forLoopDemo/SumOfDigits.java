package controlStatements.forLoopDemo;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 123;
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum = sum + lastDigit;
            number = number / 10;
        }
        System.out.println("Sum of digits " + sum);
    }
}
