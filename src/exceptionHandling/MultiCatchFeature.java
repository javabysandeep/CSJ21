package exceptionHandling;

public class MultiCatchFeature {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
            int[] array = new int[2];
            System.out.println(array[20]);
        } catch (NullPointerException np) {
            System.out.println("String is null");
        } catch (NegativeArraySizeException nase) {
            System.out.println("Array size is negative");
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Index is out of bound");
        }

        //multi catch
        System.out.println("****** Multi catch *********");
        try {
            String str = "null";
            System.out.println("String length: "+str.length());
            int[] array = new int[2];
            System.out.println(array[20]);
        }catch (NullPointerException | NegativeArraySizeException | ArrayIndexOutOfBoundsException exception){
            System.out.println("Handling all three exceptions at once "+ exception.getMessage());
        }
    }
}
