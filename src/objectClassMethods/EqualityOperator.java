package objectClassMethods;

import java.util.Objects;

public class EqualityOperator {
    public static void main(String[] args) {
        System.out.println(20 == 'A');//false
        int a = 10;
        int b = 30;
        System.out.println(a == b);//false
        EqualityOperator operator = new EqualityOperator();
        Student s1 = operator.new Student(1,"Abc");
        Student s2 = operator.new Student(1, "Abc");

        System.out.println(s1==s2);//false
        Product product = new Product();
        System.out.println(s1.equals(s2));//false
    }
    class Student{
        Integer studentRollNumber;
        String studentName;

        public Student(Integer studentRollNumber, String studentName) {
            this.studentRollNumber = studentRollNumber;
            this.studentName = studentName;
        }

        public Student() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return studentRollNumber.equals(student.studentRollNumber);
        }

        @Override
        public int hashCode() {
            return Objects.hash(studentRollNumber);
        }
    }
}
