package controlStatements.forLoopDemo;

public class SumOfNumbers {
    public static void main(String[] args) {
        int n = 50;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of 50 numbers is "+sum);
    }
}

