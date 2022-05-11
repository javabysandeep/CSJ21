package array;

import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrix1 = acceptMatrix();
        int[][] matrix2 = acceptMatrix();
        int[][] add = addMatrices(matrix1,matrix2);
        printMatrix(add);
        int[][] sub = subMatrices(matrix1,matrix2);
    }

    private static int[][] subMatrices(int[][] matrix1, int[][] matrix2) {
        return null;
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] addition = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i <addition.length ; i++) {
            for (int j = 0; j < addition[i].length; j++) {
                addition[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return addition;
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] acceptMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row and column size");
        int rowSize  = scanner.nextInt();
        int columnSize  = scanner.nextInt();
        int[][] matrix = new int[rowSize][columnSize];

        System.out.println("Enter the matrix values ");
        // {
        //  {1,2,3,4,5}
        //  {6,7,8,9,10}
        // }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }
        return  matrix;
    }
}
