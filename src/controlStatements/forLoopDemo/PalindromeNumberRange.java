package controlStatements.forLoopDemo;

public class PalindromeNumberRange {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int number = i;
            int oldNumber = number;
            int sum = 0;
            while (number > 0) {
                int lastDigit = number % 10;
                sum = sum * 10 + lastDigit;
                number = number / 10;
            }
            if (sum == oldNumber) System.out.println(oldNumber);
        }

    }
}
