package stringHandling;

public class Demo {
    public static void main(String[] args) {
        String str = "abc";
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 ="abc";
        String s4 ="abc";
    }
}
class Employee{
    //Composition >> Has A type of Relationship
    Address address;
    //Aggregation --> Inheritance --> IS-A Type

}
class Address{
    String city;
    String state;
    String Country;
    int pincode;
    String street;
}
