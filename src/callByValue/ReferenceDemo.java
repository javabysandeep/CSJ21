package callByValue;

public class ReferenceDemo {
    public static void main(String[] args) {
        Student student = new Student(1,"Sachin");
        changeMe(student);
        System.out.println(student);//
    }

    private static void changeMe(Student student) {
        student = new Student();
        student.id = 102;
        student.name = "Sehvag";
        System.out.println(student);//
    }
}
