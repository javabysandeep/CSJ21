package oops.classComponents;

import java.io.PrintStream;

public class PrintExplain {
    public static void main(String[] args) {
        System.out.println("some value");
        System.out.println(A.var);
        A.out.println("some value");

    }
}

class A {
    static int var = 100;
    static PrintStream out = new PrintStream(System.out);
}
