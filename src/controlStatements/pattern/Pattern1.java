package controlStatements.pattern;

public class Pattern1 {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 4;
        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= columns; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
