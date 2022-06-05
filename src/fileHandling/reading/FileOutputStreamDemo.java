package fileHandling.reading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalTime;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("write1.txt");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        String str = "we are writing to the file in terms of bytes";
        long start = System.currentTimeMillis();
        for (int i=0; i<=1000000;i++) {
            fileOutputStream.write('A');
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken "+(end-start));
        System.out.println("File write complete");
        fileOutputStream.close();

    }
}
