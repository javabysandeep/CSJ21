package controlStatements.forLoopDemo;

public class DivisionWithoutOperator {
    public static void main(String[] args) {
        int nr = 17;
        int dr = 0;
        int quotient = 0;
        int remainder = 0;
        while (nr >= 0 && nr >= dr && dr> 0) {
            nr = nr - dr;
            quotient++;
        }
        System.out.println("Quotient " + quotient);
        System.out.println("Remainder " + nr);

    }
}

