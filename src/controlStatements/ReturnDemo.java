package controlStatements;

public class ReturnDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("Rest of the code in main method");
        System.out.println("Rest of the code in main method");
    }
}
