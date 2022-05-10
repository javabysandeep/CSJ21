package array;

public class SecondSmallestNumberArray {
    public static void main(String[] args) {
        int[] array = {1156, 20, 230, 4, 5, 6789, 7, 5678};
        int smallest = array[0];
        int secondSmallest = array[0];

        for (int index = 1; index < array.length; index++) {
            if (smallest > array[index]) {
                smallest = array[index];
            }
            if (smallest < array[index] && secondSmallest > array[index]) {
                secondSmallest = array[index];
            }
        }
        System.out.println("Smallest " + smallest);
        System.out.println("Second Smallest " + secondSmallest);

    }
}
