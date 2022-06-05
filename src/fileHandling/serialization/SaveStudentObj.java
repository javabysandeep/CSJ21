package fileHandling.serialization;

import java.io.*;

public class SaveStudentObj {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student(1,"Bhavana","bhanu","bhanu@321");
        File bhavanaRecord = new File("bhavana.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(bhavanaRecord);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(s1);

        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Object written to the file");
    }
}
