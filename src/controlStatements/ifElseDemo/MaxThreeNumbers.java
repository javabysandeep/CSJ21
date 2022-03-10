package controlStatements.ifElseDemo;

public class MaxThreeNumbers {
    public static void main(String[] args) {
        int number1 = 1000;
        int number2 = 2000;
        int number3 = 300;

        if (number1 > number2 && number1 > number3) {
            System.out.println("Max  is " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }

    }

}
