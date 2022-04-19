package oops.polymorphism.methodOverloading;

public class Addition {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    public static int add(int num1, int num2, int num3) {
        return num1 + num2+num3;
    }
    /*public static String add(int num1, int num2) {
        return ""+num1 + num2;
    }*/
    public static String add(String num1, String num2) {
        return num1 + num2;
    }
}
