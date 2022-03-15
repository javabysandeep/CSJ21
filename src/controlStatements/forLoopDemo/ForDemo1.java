package controlStatements.forLoopDemo;

public class ForDemo1 {
    public static void main(String[] args) {

       /* for (System.out.println("initialization"); true; System.out.println("Decrement/increment")) {
            System.out.println("for");
        }*/
        //infinite loop
       /* for (int i = 1; ; i++) {
            System.out.println(i);
        }*/

        /*for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }*/
        /*for (int j = 0, k = 11; j < k; j++, k--) {
            System.out.println(j);
        }*/

        int i = 0, j = 1, k = 2;
        for (; i < j; ) {
            System.out.println(i);
            i++;
            j++;
        }
    }
}
