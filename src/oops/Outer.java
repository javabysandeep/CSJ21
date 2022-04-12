package oops;

public class Outer {
     int outerVar = 100;
    class Inner{
         int innerVar = 200;
         //static int staticVar;
         //static {}
        //static void m1(){}
    }
    static class StaticNested {
        int innerVar = 400;
        static int staticVar =300;
        static {}
        static void m1(){
            System.out.println("Static method");
        }

        void m2(){
            System.out.println("instance method");
        }
    }
}
