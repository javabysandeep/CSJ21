package array;

public class Demo2 {
    public static void main(String args[]) {
        // different ways to create array
        //way 1
        int array[];//declaration
        array = new int[5];// initialization --> assign the value

        System.out.println(array);// object address which contains 5 variables
        array[0] = 100;
        System.out.println(array[0]);//100
        System.out.println(array[1]);//0

        //way 2
        int arr[] = new int[5];// declaration + initialization

        // way 3
        int array3[] = {1, 2, 3, 4, 500};// it is created with size 5
        System.out.println(array3[4]);//500
        System.out.println("Array size " + array3.length);

        int[] array4 = new int[5];

        int a, b, c, d[] = new int[4];
        a = 10;
        b = 20;
        c = 30;
        System.out.println(d[3]);

    }
}
