package operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        // &, |, ^, <<, >>, >>>, ~

        System.out.println(4 & 5); //4
        System.out.println(4 | 5); //5
        System.out.println(4 ^ 5); //1
        System.out.println(4 << 1); //8
        System.out.println(4 >> 1); //2
        System.out.println(4 >> 2); //1
        System.out.println(4 << 2); //16
        System.out.println(~4);//-5
        System.out.println(~5);//-6
        System.out.println(~-5);//4
        // result = invertSign(number+1)
        System.out.println("Binary 4= "+Integer.toBinaryString(4));
        System.out.println("Binary -5= "+Integer.toBinaryString(-5));
        //todo : how to represent negative numbers in binary
    }
}
