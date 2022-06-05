package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/sandeepbhingle/Documents/training/CSJ21/src/destination/abc050622.txt");
        boolean fileCreated = file.createNewFile();
        System.out.println("File created "+fileCreated);

        File folder = new File("/Users/sandeepbhingle/Documents/training/CSJ21/src/dir");
        boolean mkdir = folder.mkdir();
        System.out.println("Folder created "+mkdir);
        boolean renameTo = folder.renameTo(new File("/Users/sandeepbhingle/Documents/training/CSJ21/src/destination"));
        System.out.println("rename "+renameTo);

        System.out.println("Permissions");
        System.out.println(file.isDirectory());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println(file.delete());
    }
}
