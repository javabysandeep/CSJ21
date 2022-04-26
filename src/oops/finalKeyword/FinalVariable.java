package oops.finalKeyword;

public class FinalVariable {
    public static final int number;
    public final int instanceVar;

    public FinalVariable(int instanceVar) {
        this.instanceVar = instanceVar;
    }

    static {
        number = 300;
    }
    public static void main(String[] args) {
        final int a = 20;
        //a  = 30;//cte
        final Student student = new Student();
        student.studentId = 100;
        student.studentName = "abc";

        student.studentId = 200;
        student.studentName = "xyz";
        Student student2 = new Student();
        //student = student2;

    }
}
