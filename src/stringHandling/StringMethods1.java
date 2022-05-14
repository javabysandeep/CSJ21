package stringHandling;

public class StringMethods1 {
    public static void main(String[] args) {
        String str = "abc";
        str = str.concat(" xyz");
        System.out.println(str);// abc xyz
        str = str.toUpperCase();
        System.out.println(str);// ABC XYZ
        String str1 = "pqr";
        str1.concat(" xyz");
        System.out.println(str1);//pqr

        str1.toUpperCase();
        System.out.println(str1);//pqr

        //replace a char or substring
        String originalString = "string handling";
        originalString = originalString.replace("string", "exception");
        System.out.println(originalString);

        //spaces at first & last
        String spaces = "    this contains spaces    ";
        spaces = spaces.trim();
        System.out.println(spaces);

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true

        String s3 = "cyber";
        String s4 = "cyber";
        System.out.println(s3==s4);//true
        System.out.println(s3.equals(s4));//true
        System.out.println(s3.compareTo(s4));//collections --> Comparable(FI)

        String institute = "cyber success";
        char ch = institute.charAt(0);
        System.out.println(ch);
        for (char ch1:institute.toCharArray()) {
            System.out.print(ch1);
        }
        System.out.println(institute.contains("y"));
        System.out.println(institute.indexOf("y"));
        System.out.println(institute.startsWith("c"));
        System.out.println(institute.endsWith("ss"));

        String students = " Shlok, Mangesh, Rohit, Bhavesh, Manjusha, Anjali, Rasika";
        String[] strings = students.split(", ");
        for (String student:strings) {
            System.out.println(student);
        }


    }
}
