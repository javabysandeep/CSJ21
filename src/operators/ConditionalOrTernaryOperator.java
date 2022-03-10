package operators;

public class ConditionalOrTernaryOperator {
    public static void main(String[] args) {
        //(op1)?op2 :op3;
        System.out.println(
                (4 < 5) ? "its true" : false
        );

        //maximum of three numbers
        int n1 = 100;
        int n2 = 200;
        int n3 = 30;
        int max = (n1 > n2 && n1 > n3) ? n1 : ((n2 > n1 && n2 > n3) ? n2 : n3);
        System.out.println("Max "+max);


    }
}
