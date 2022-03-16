package controlStatements.forLoopDemo;

public class PowerOfTwoNumber {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 5;
        int power = 1;
        for (int i = 1; i <= number2; i++) {
            power = power * number1;
        }
        System.out.println("Power " + power);
    }
}
