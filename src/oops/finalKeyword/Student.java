package oops.finalKeyword;

public  class Student {
    int studentId;
    String studentName;

    //final method cannot be overridden
    final void register(){
        System.out.println("registering");
    }
}
// final class cannot be extended
class Child extends Student{
    /*@Override
    void register() {
        System.out.println("register method overridden");
    }*/
}
