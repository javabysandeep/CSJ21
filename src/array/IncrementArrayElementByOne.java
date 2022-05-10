package array;

public class IncrementArrayElementByOne {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            ++array[index];
        }
        System.out.println("Array elements after increment ");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
