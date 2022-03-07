package operators;

public class DecrementOperators {
    public static void main(String[] args) {
        //Pre-Decrement, Post-Decrement
        int a = 5;
        int b = a--;
        int c = --a;
        System.out.println(a);//3
        System.out.println(b);//5
        System.out.println(c);//3

        int result = a++ + ++b + c++ + ++a + --a + b-- + --c + ++b;
        System.out.println("Result " + result);
        System.out.println(a);//
        System.out.println(b);//
        System.out.println(c);//
    }
}
