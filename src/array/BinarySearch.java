package array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 23,24, 56, 67, 78, 89};
        int key = 89;
        int left = 0;
        int right = array.length - 1;
        int mid = (left + right) / 2;

        while (left <= right) {
            if (array[mid] == key) {
                System.out.println("Key found at index " + mid);
                break;
            }
            if (key < array[mid]) {
                right = mid - 1;
                mid = (left + right) / 2;
            }
            if (key > array[mid]) {
                left = mid + 1;
                mid = (left + right) / 2;
            }
        }

    }
}
