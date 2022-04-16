package oops.inheritance.example1;

public class Example1 {
    public static void main(String[] args) {
       //case 1
        A a = new A();
        System.out.println(a.number);//100

        // case 2
        B  b = new B();
        System.out.println(b.number);//300
        System.out.println(b.number2);//200
        System.out.println(b.number3); //400

        A ab = new B();
        System.out.println(ab.number);//100
//        System.out.println(ab.number2);//CTE
    }
}
