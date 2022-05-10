package array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {11, 20, 23, 4, 5, 6, 7, 8};
        int key = 23;

        for (int index = 0; index < array.length; index++) {
           if(key==array[index]){
               System.out.println("Found at index "+index);
               break;
           }
        }

    }
}
