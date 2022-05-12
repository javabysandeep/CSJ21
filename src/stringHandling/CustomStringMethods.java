package stringHandling;

public class CustomStringMethods {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'A'};
        chars = replace('A', 'a', chars);
        for (char ch : chars) {
            System.out.print(ch + " ");
        }
        System.out.println(contains('a', chars));

        // array only contains digits
        char[] digits = {'1','2','3'};
        System.out.println("Only chars "+isCharsOnly(digits));;
        System.out.println("Only Digits "+isDigitsOnly(digits));;

    }

    private static boolean isDigitsOnly(char[] chars) {
        if(chars==null){
            return false;
        }
        for (int index = 0; index < chars.length; index++) {
            if(!(chars[index] >='0' && chars[index]<='9')){
                return false;
            }
        }
        return true;
    }
    private static boolean isCharsOnly(char[] chars) {
        if(chars==null){
            return false;
        }
        for (int index = 0; index < chars.length; index++) {
            if(!(chars[index] >='A' && chars[index]<='z')){
                return false;
            }
        }
        return true;
    }

    private static boolean contains(char ch, char[] chars) {
        for (int index = 0; index < chars.length; index++) {
            if (ch == chars[index]) {
                return true;
            }
        }
        return false;
    }

    private static char[] replace(char oldChar, char newChar, char[] chars) {
        if (chars == null) {
            return null;
        }
        for (int index = 0; index < chars.length; index++) {
            if (chars[index] == 'A') {
                chars[index] = 'a';
            }
        }
        return chars;
    }

}
