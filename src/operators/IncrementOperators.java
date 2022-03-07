package operators;

public class IncrementOperators {
    public static void main(String[] args) {
        //Pre-increment, Post-increment
        int a = 1;
        int b = a++;
        int c = ++a;
        System.out.println(a);//3
        System.out.println(b);//1
        System.out.println(c);//3

        System.out.println(a++ + ++b + c++ + ++a);//13
        System.out.println(a);// 5
        System.out.println(b);// 2
        System.out.println(c);// 4

        // Increment decrement operators must be used on variables not on values directly
//        System.out.println(10++);//CTE
    }
}
