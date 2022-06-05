package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/sandeepbhingle/Documents/training/CSJ21/src/destination/xyz.txt");
        file.createNewFile();
       // System.out.println(file.getAbsoluteFile());
    }
}
