package array;

public class ArrayStudents {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(1,"Sachin");
        students[1] = new Student(2,"Akshat");
        students[2] = new Student(3,"xyz");
        students[3] = new Student(4,"abx");
        students[4] = new Student(5,"say");
        for (int i = 0; i < students.length ; i++) {
            System.out.println(students[i]);
        }
        students[1].display();
    }
}
