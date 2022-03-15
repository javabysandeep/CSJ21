package controlStatements.forLoopDemo;

public class SumOfNumbersEven {
    public static void main(String[] args) {
        int n = 50;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println("Sum of 50 numbers is " + sum);
    }
}

