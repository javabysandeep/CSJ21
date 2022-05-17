package exceptionHandling;

public class FinallyDemo {
    public static void main(String[] args) {
        try{
            System.out.println(10/1);
            //System.exit(0);
        }finally {
            System.out.println("Finally");
        }
        System.out.println("rest of the code");
    }
}

//output
//10 finally rest of the code
