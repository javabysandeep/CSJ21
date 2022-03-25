package controlStatements.pattern;

public class DiamondPattern {
    public static void main(String[] args) {
        int number = 5;
        for (int row = 1; row < number; row++) {
            for (int space = number - 1; space > row; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <=row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = 1; row < number-1; row++) {
            for (int space = 1; space <=row; space++) {
                System.out.print(" ");
            }
            for (int star = number-1; star >row; star--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
