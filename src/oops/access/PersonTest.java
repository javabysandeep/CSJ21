package oops.access;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
//        person.age =-20;
        person.setAge(-20);
        System.out.println(person.getAge());
    }
}
