package array;

public class OddEvenArrayElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int index = 0; index < array.length; index++) {
            int number = array[index];
            if(number%2==0){
                System.out.println(number);
            }
        }

    }
}
