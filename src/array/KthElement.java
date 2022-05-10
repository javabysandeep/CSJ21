package array;

public class KthElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int kth = 5 ;

        if(kth >=0 && kth < array.length){
            System.out.println(array[kth]);
        }

    }
}
