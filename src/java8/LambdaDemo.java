package java8;

import java.util.ArrayList;

public class LambdaDemo {
    public static void main(String[] args) {
        I1 i1 = (num1, num2) -> num1 + num2;
        System.out.println(i1.add(10, 20));
    }
}
