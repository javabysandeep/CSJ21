package controlStatements.pattern;

public class FlyodTriangle {
    public static void main(String[] args) {
        int number = 5;
        int counter = 1;
        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
}
