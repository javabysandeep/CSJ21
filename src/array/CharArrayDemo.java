package array;

public class CharArrayDemo {
    public static void main(String[] args) {
        char[] chars = {'a','b','c','d'};
        char[] name = new char[10];//abcdefghij --> 9423895782894
        char[] newName = new char[20];
        newName[0] ='A';
        newName[1] ='B';
        char[] newName1 = new char[40];


        for (int i = 0; i < chars.length ; i++) {
            chars[i] = (char)(chars[i]- 32);
        }
        for (char ch:chars) {
            System.out.print(ch+" ");
        }
    }
}
