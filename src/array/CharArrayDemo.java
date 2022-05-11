package array;

public class CharArrayDemo {
    public static void main(String[] args) {
        char[] chars = {'a','b','c','d'};
        for (int i = 0; i < chars.length ; i++) {
            chars[i] = (char)(chars[i]- 32);
        }
        for (char ch:chars) {
            System.out.print(ch+" ");
        }
    }
}
