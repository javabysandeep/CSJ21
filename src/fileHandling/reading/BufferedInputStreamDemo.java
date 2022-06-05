package fileHandling.reading;

import java.io.*;

public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("write1.txt");

        FileInputStream fis = new FileInputStream(file);

        BufferedInputStream bis = new BufferedInputStream(fis);

        int read = bis.read();;
        long start = System.currentTimeMillis();

        while (read !=-1){
            System.out.print((char)read);
            read = bis.read();
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken "+(end-start));
        System.out.println("File read complete");

        bis.close();
        fis.close();

    }
}
