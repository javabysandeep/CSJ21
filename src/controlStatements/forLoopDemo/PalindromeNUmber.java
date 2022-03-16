package controlStatements.forLoopDemo;

public class PalindromeNUmber {
    public static void main(String[] args) {
        int number = 151;
        int oldNumber = number;
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum = sum * 10 + lastDigit;
            number = number / 10;
        }
        System.out.println(sum == oldNumber ? "Palindrome" : "Not a Palindrome");
    }
}
