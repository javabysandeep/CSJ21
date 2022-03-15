package controlStatements.ifElseDemo;

public class IsCharacter {
    public static void main(String[] args) {
        char ch = '9';
        if((ch >='A' && ch<='Z') || (ch >='a' && ch<='z')){
            System.out.println("Alphabet");
        } else{
            System.out.println("not a alphabaet");
        }

    }
}
