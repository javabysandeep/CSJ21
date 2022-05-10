package array;

import java.util.Scanner;

public class AcceptArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array size ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the array elements");
        for (int index = 0; index < size; index++) {
            array[index] = scanner.nextInt();
        }
        System.out.println("Array accepted ");
        for (int index = 0; index < size; index++) {
            System.out.println(array[index]);
        }

    }
}
