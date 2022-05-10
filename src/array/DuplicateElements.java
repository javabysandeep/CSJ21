package array;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] array = {115, 20, 230, 4, 5, 6789, 7, 5678,115};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(i!=j && array[i]==array[j]){
                    System.out.println("duplicate found "+array[i]);
                    break;
                }

            }
        }

    }
}
