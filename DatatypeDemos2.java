public class DatatypeDemos2 {
    public static void main(String[] args) {
        byte b1 = 127;
        byte b2 = 3;

        // explicit typecasting
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3); // -127

        // implicit typecasting
        int intValue = b1;
        System.out.println(intValue);

        // arithmetic operations: +, -, * , /, % are not applicable for boolean
        boolean booleanvalue = true;

        // Invalid: TRUE, True

        float floatValue = 123.12f;

        int floatToInt = (int) floatValue;
        System.out.println(floatToInt);

        char ch1 = (char) floatValue;
        char ch2 = 'A';
        char ch3 = 65;
        char ch4 = 'A' + 66;
        System.out.println(ch1);//{
        System.out.println(ch2); // A
        System.out.println(ch3); // A
        System.out.println(ch4); // char

        
    }

}
