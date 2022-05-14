package stringHandling;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("stringbuilder");
//        stringBuilder.reverse();
//        stringBuilder.append(" adding at the last");
        System.out.println("Actual how many chars are there "+stringBuilder.length());
        System.out.println("how many chars can store there "+stringBuilder.capacity());
        stringBuilder.insert(0,"new string");
        System.out.println(stringBuilder);
        StringBuilder sb = new StringBuilder();
        System.out.println("Default capacity "+sb.capacity());

        StringBuilder deleteMe = new StringBuilder("some string to delete");
//        deleteMe.deleteCharAt(0);
        deleteMe.delete(0,deleteMe.length());
        System.out.println(deleteMe);

        String string = new String("String object");
        StringBuilder stringContain = new StringBuilder(string);

        System.out.println(stringContain.codePointAt(0));

        String str= new String("By default points to HEAP");
        System.out.println("HEAP "+str.hashCode());
        str = str.intern();
        System.out.println("SCP "+str.hashCode());
        String doubleQuotes = "welcome \"double \"";
        System.out.println(doubleQuotes);
    }
}
