package work_with_file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {

        String text = "Privet mir.\n" + "Zapisivai vse v file";
        String text2 = "\nYspex";

        try(FileWriter writer = new FileWriter("test.txt" , true)) {
            writer.write(text);
            writer.write(text2);
            System.out.println("Done!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
