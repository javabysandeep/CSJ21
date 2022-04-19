package oops.polymorphism.methodOverloading;

public class App {
    public static void main(String[] args) {
        System.out.println(Addition.add(20, 30));
        System.out.println(Addition.add(20, 30, 50));
        System.out.println(Addition.add("10", "20"));
    }
}
