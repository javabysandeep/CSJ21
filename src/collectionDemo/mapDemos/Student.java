package collectionDemo.mapDemos;

import java.util.Objects;

public class Student implements Comparable<Student> {
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

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber);
    }*/

     @Override
    public int compareTo(Student student) {
        return this.rollNumber - student.rollNumber;
    }
}
