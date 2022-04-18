package oops.inheritance.constructorChaining;

public class Child extends Parent{
    int number = 300;
    Child(){
        super();// call to the super class constructor
        System.out.println("child class zero param con");
        System.out.println("child number "+this.number);
        System.out.println("super number "+super.number);
    }
}
