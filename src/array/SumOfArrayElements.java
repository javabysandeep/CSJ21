package array;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum += array[index];
        }
        System.out.println("Sum of array elements "+sum);
        System.out.println("Average of array elements "+sum/ array.length);
    }
}
