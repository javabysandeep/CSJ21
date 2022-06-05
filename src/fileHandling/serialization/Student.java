package fileHandling.serialization;

import java.io.Serializable;

public class Student implements Serializable {
    int rollNumber;
    String name;
    transient String username;
    transient String password;

    public Student(int rollNumber, String name, String username, String password) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
