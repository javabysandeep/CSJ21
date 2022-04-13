package oops.access;

public class Person {
    private int age;
    private String name;
    private String address;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
