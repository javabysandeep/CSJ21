package array;

public class BiggestNumberArray {
    public static void main(String[] args) {
        int[] array = {1156, 20, 230, 4, 5, 678, 7, 5678};
        int max = array[0];

        for (int index = 1; index < array.length; index++) {
           if(max < array[index]){
               max = array[index];
           }
        }
        System.out.println("Max "+max);

    }
}
