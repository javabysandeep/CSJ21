package callByValue;

public class Demo {
    public static void main(String[] args) {
        //call by value : we call the methods by passing the value
        //call by reference : we call the methods by passing the original reference.
        // Java is strictly call by value.
        int num1 = 10;
        int num2 = 20;
        int add = add(num1, num2);
        System.out.println(num1+" "+num2);//10, 20
        System.out.println("Add "+add);// 50

        int[] array = {1,2,3,4,5};
        reverse(array);
        System.out.println(array[0]);//1
    }

    private static void reverse(int[] array) {
        //array = new int[5];
        array[0] = 20;
    }

    private static int add(int num1, int num2) {
        num1 = 20;
        num2 = 30;
        return num1 + num2;
    }
}
