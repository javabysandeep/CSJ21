package fileHandling.reading;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("write1.txt");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        String str = "we are writing to the file in terms of bytes";
        long start = System.currentTimeMillis();
        for (int i=0; i<=Integer.MAX_VALUE/2;i++) {
            bufferedOutputStream.write('A');
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken "+(end-start));
        System.out.println("File write complete");

        bufferedOutputStream.close();
        fileOutputStream.close();

    }
}
