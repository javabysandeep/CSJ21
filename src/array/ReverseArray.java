package array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] reversedArray = reverseArray(array);
        for (int i = 0; i < reversedArray.length ; i++) {
            System.out.print(reversedArray[i]+"\t ");
        }
    }

    private static int[] reverseArray(int[] array) {
        int left = 0;
        int right = array.length-1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right]= temp;
            left++;
            right--;
        }
        return array;
    }
}
