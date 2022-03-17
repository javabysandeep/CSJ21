package controlStatements;

public class ReturnDemo2 {
    public static void main(String[] args) {
        m1();
        System.out.println("Rest of the code in main method");
        System.out.println("Rest of the code in main method");
    }

    static void m1() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("Rest of the in m1");
    }

}
