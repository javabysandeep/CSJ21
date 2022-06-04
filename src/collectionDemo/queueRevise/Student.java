package collectionDemo.queueRevise;

public class Student /*implements Comparable<Student> */{
    int rollNumber;
    String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }

   /* @Override
    public int compareTo(Student student) {
        return this.rollNumber - student.rollNumber;
    }*/
}
