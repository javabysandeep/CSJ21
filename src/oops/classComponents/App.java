package oops.classComponents;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        System.out.println(student.studentId);
        System.out.println(student.studentName);
        student.registerStudent();

        System.out.println(Student.CollegeName);
        Student.print();



    }
}
