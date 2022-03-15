package controlStatements.ifElseDemo;

public class BillCalculator {
    public static void main(String[] args) {
        int productRate = 2000;
        int productQuantity = 10;
        int amount = productQuantity * productRate;

        /*<5000 10%
        >=5000 and <10000 15%
        >=10000 and <20000 20%
        >=20000 50%*/
        float discount = 0.0f;
        if (amount < 5000) {
            discount = (float) (amount * 0.1);
        } else if (amount >= 5000 && amount < 10000) {
            discount = (float) (amount * 0.15);
        } else if (amount >= 10000 && amount < 20000) {
            discount = (float) (amount * 0.20);
        } else if (amount >= 20000) {
            discount = (float) (amount * 0.50);
        }
        System.out.println("Final bill " + (amount - discount));
    }
}
