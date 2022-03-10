package controlStatements.ifElseDemo;

public class Demo {
    public static void main(String[] args) {
        String fileName = "doc";
        if (false) {
            System.out.println("if body");
            System.out.println("if body");
            System.out.println("if body");
            System.out.println("if body");
        }
        //System.out.println("indepedent statements");
        else{
            System.out.println("else");
            System.out.println("else");
            System.out.println("else");
            System.out.println("else");
        }

    }

    private static boolean isFile() {
        return true;
    }
}
