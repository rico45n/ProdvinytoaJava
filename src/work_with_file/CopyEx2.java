package work_with_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {
    public static void main(String[] args) {
        try(FileOutputStream outputStream = new FileOutputStream("test4.jpg")) {


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
