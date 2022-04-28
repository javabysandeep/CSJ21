package objectClassMethods;

public class HashCodeDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1=student2;

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student1.getClass());

        student1.studentId = 100;
        student1.studentName = "Bhavana";
        System.out.println(student1);
        System.out.println(student1.toString());
    }
}

class Student{
    int studentId;
    String studentName;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}

