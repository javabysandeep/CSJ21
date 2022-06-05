package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        File file = new File("xyz.txt");
       file.createNewFile();
       System.out.println(file.getPath());
    }
}
