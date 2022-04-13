package oops.classComponents;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Please enter the number ");
        //int number = scanner.nextInt();
        // System.out.println("Table of " + number + "\n");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 100; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
