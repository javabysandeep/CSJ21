package controlStatements;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1 and number2");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Addition " + (number1 + number2));

       /* System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name);*/
    }
}
