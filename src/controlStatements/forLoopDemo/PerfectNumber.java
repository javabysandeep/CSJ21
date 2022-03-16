package controlStatements.forLoopDemo;

public class PerfectNumber {
    public static void main(String[] args) {
        int number = 6;
        int sumOfFactors = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfFactors = sumOfFactors + i;
            }
        }
        System.out.println(sumOfFactors == number ? "Perfect" : "Not a Perfect");
    }
}
