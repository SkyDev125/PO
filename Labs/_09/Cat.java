package Labs._09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Cat {
    public static void main(String[] args) {
        for (String s : args) {
            cat(s);
        }
    }

    public static void cat(String file) {
        RandomAccessFile input = null;
        String line = null;
        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                if (input != null)
                    input.close();
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }
}
