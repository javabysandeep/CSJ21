package array;

public class Demo3 {
    public static void main(String[] args) {
        int[] array = {12,13,345,67,8,9,0,10};
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        // 13 address = BA + INDEX * memorySize
        //  = 100 + 2*4 ---> 108
    }
}
