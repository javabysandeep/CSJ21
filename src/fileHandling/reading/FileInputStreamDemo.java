package fileHandling.reading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("read.txt");
        file.createNewFile();
        FileInputStream fis = new FileInputStream(file);
        int data = fis.read();
        while (data != -1) {
            System.out.print((char)data);
            data = fis.read();
        }
        fis.close();

    }
}
