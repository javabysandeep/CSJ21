package array;

public class Matrix1 {
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        // {    {0,0,0},
        //      {0,0,0}
        // }
        // { ref1, ref2}
        // ref1{0,0,0}
        //ref2 {0,0,0}
        for (int row = 0; row <array.length ; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column]+" ");
            }
            System.out.println();
        }
        int[][] arr = {
                {1,2,3},
                {4,5,6,7},
                {4,5,6,7,8}
        };
        System.out.println("custom arr");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

    }
}
