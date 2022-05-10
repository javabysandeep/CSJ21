package array;

public class SecondBiggestNumberArray {
    public static void main(String[] args) {
        int[] array = {1156, 20, 230, 4, 5, 6789, 7, 5678};
        int max = array[0];
        int secondMax = array[0];

        for (int index = 1; index < array.length; index++) {
            if (max < array[index]) {
                max = array[index];
            }
            if (max > array[index] && secondMax < array[index]) {
                secondMax = array[index];
            }
        }
        System.out.println("Max " + max);
        System.out.println("Second Max " + secondMax);

    }
}
