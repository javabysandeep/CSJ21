package fileHandling.serialization;

import java.io.*;

public class ReadStudentObj {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student(1,"Bhavana","bhanu","bhanu@321");
        File bhavanaRecord = new File("bhavana.txt");
        FileInputStream fileInputStream = new FileInputStream(bhavanaRecord);

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Student student = (Student) objectInputStream.readObject();

        System.out.println(student);
        objectInputStream.close();
        fileInputStream.close();
        System.out.println("Object written to the file");
    }
}
