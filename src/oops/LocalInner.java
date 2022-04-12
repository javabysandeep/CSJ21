package oops;

public class LocalInner {
    public static void main(String[] args) {
        class A{
            int var = 30;
            void m1(){
                System.out.println("instance method of local inner class");
            }
        }
        A a = new A();
        System.out.println(a.var);
        a.m1();
    }
    void display(){
        //A a = new A(); //CTE
    }

}
