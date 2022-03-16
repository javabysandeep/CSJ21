package controlStatements.forLoopDemo;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int oldNumber = number;
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum = sum + lastDigit * lastDigit * lastDigit;
            number = number / 10;
        }
        System.out.println(sum == oldNumber ? "Armstrong" : "Not a armstrong");
    }
}
