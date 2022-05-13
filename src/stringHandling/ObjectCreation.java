package stringHandling;

public class ObjectCreation {
    public static void main(String[] args) {
        String s1 = new String("abc");
        // HEAP 1 // SCP 1
        String s2 = new String("abc");
        // HEAP 1 --> SCP 0
        String s3 = new String("abc");
        // HEAP 1 --> SCP 0
        String s4 ="abc";
        // HEAP --> 0, SCP 0
        String s5 ="abc";
        String s6 ="abc";
        String s7 ="abc";
        String s8 ="abc";
        System.out.println(s1==s2);//false
        System.out.println(s1==s3); //false
        System.out.println(s1.equals(s2));//true
        System.out.println(s7==s8);//true
        System.out.println(s5==s8);//true


    }
}
