package controlStatements.pattern;

public class Pattern3 {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 4;
        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
}
