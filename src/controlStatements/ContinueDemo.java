package controlStatements;

public class ContinueDemo {
    public static void main(String[] args) {
//        continue;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 1; i <=10 ; i++) {
            if(i%2==0){
                continue;
            }
            System.out.println("A");
            System.out.println("B");
            System.out.println("C");
            System.out.println("D");
            System.out.println("E");
            System.out.println("End of loop");
        }
    }
}
